package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.RequestDetails;
import io.sentry.SentryEnvelope;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
final class HttpConnection {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final SentryOptions options;
    private final Proxy proxy;
    private final RateLimiter rateLimiter;
    private final RequestDetails requestDetails;

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails, RateLimiter rateLimiter) {
        this(sentryOptions, requestDetails, AuthenticatorWrapper.getInstance(), rateLimiter);
    }

    private void closeAndDisconnect(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
    }

    private HttpURLConnection createConnection() {
        HttpURLConnection open = open();
        for (Map.Entry<String, String> entry : this.requestDetails.getHeaders().entrySet()) {
            open.setRequestProperty(entry.getKey(), entry.getValue());
        }
        open.setRequestMethod("POST");
        open.setDoOutput(true);
        open.setRequestProperty("Content-Encoding", "gzip");
        open.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        open.setRequestProperty("Accept", "application/json");
        open.setRequestProperty("Connection", "close");
        open.setConnectTimeout(this.options.getConnectionTimeoutMillis());
        open.setReadTimeout(this.options.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.options.getSslSocketFactory();
        if ((open instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) open).setSSLSocketFactory(sslSocketFactory);
        }
        open.connect();
        return open;
    }

    private String getErrorMessageFromStream(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, UTF_8));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z4 = true;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!z4) {
                            sb.append("\n");
                        }
                        sb.append(readLine);
                        z4 = false;
                    }
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return sb2;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    private boolean isSuccessfulResponseCode(int i7) {
        return i7 == 200;
    }

    private TransportResult readAndLog(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                updateRetryAfterLimits(httpURLConnection, responseCode);
                if (isSuccessfulResponseCode(responseCode)) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Envelope sent successfully.", new Object[0]);
                    TransportResult success = TransportResult.success();
                    closeAndDisconnect(httpURLConnection);
                    return success;
                }
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.ERROR;
                logger.log(sentryLevel, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (this.options.isDebug()) {
                    this.options.getLogger().log(sentryLevel, "%s", getErrorMessageFromStream(httpURLConnection));
                }
                TransportResult error = TransportResult.error(responseCode);
                closeAndDisconnect(httpURLConnection);
                return error;
            } catch (IOException e7) {
                this.options.getLogger().log(SentryLevel.ERROR, e7, "Error reading and logging the response stream", new Object[0]);
                closeAndDisconnect(httpURLConnection);
                return TransportResult.error();
            }
        } catch (Throwable th) {
            closeAndDisconnect(httpURLConnection);
            throw th;
        }
    }

    private Proxy resolveProxy(SentryOptions.Proxy proxy) {
        if (proxy != null) {
            String port = proxy.getPort();
            String host = proxy.getHost();
            if (port != null && host != null) {
                try {
                    return new Proxy(proxy.getType() != null ? proxy.getType() : Proxy.Type.HTTP, new InetSocketAddress(host, Integer.parseInt(port)));
                } catch (NumberFormatException e7) {
                    this.options.getLogger().log(SentryLevel.ERROR, e7, "Failed to parse Sentry Proxy port: " + proxy.getPort() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public HttpURLConnection open() {
        return (HttpURLConnection) (this.proxy == null ? this.requestDetails.getUrl().openConnection() : this.requestDetails.getUrl().openConnection(this.proxy));
    }

    public TransportResult send(SentryEnvelope sentryEnvelope) {
        TransportResult readAndLog;
        this.options.getSocketTagger().tagSockets();
        try {
            OutputStream outputStream = createConnection().getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.options.getSerializer().serialize(sentryEnvelope, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return readAndLog;
    }

    public void updateRetryAfterLimits(HttpURLConnection httpURLConnection, int i7) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.rateLimiter.updateRetryAfterLimits(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i7);
    }

    public HttpConnection(SentryOptions sentryOptions, RequestDetails requestDetails, AuthenticatorWrapper authenticatorWrapper, RateLimiter rateLimiter) {
        this.requestDetails = requestDetails;
        this.options = sentryOptions;
        this.rateLimiter = rateLimiter;
        Proxy resolveProxy = resolveProxy(sentryOptions.getProxy());
        this.proxy = resolveProxy;
        if (resolveProxy == null || sentryOptions.getProxy() == null) {
            return;
        }
        String user = sentryOptions.getProxy().getUser();
        String pass = sentryOptions.getProxy().getPass();
        if (user == null || pass == null) {
            return;
        }
        authenticatorWrapper.setDefault(new ProxyAuthenticator(user, pass));
    }
}
