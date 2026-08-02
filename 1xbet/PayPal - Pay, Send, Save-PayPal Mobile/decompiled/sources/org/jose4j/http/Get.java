package org.jose4j.http;

/* loaded from: classes18.dex */
public class Get implements org.jose4j.http.SimpleGet {
    private static final org.slf4j.Logger getHighSpeedVideoFpsRangesFor = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.http.Get.class);
    private javax.net.ssl.HostnameVerifier Camera2StreamConfigurationMap;
    private java.net.Proxy getInputSizeshNQ4ISI;
    private javax.net.ssl.SSLSocketFactory getOutputFormats;
    private int getHighSpeedVideoSizes = 20000;
    private int getInputFormats = 20000;
    private int getHighSpeedVideoSizesFor = 3;
    private long getHighSpeedVideoFpsRanges = 180;
    private boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private int getOutputMinFrameDuration = 524288;

    @Override // org.jose4j.http.SimpleGet
    public org.jose4j.http.SimpleResponse get(java.lang.String str) throws java.io.IOException {
        long j;
        getHighSpeedVideoFpsRangesFor.debug("HTTP GET of {}", str);
        java.net.URL url = new java.net.URL(str);
        int i = 0;
        while (true) {
            try {
                java.net.Proxy proxy = this.getInputSizeshNQ4ISI;
                java.net.URLConnection openConnection = proxy == null ? url.openConnection() : url.openConnection(proxy);
                openConnection.setConnectTimeout(this.getHighSpeedVideoSizes);
                openConnection.setReadTimeout(this.getInputFormats);
                openConnection.setUseCaches(false);
                openConnection.setRequestProperty("Cache-Control", "no-cache");
                if (openConnection instanceof javax.net.ssl.HttpsURLConnection) {
                    javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) openConnection;
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.getOutputFormats;
                    if (sSLSocketFactory != null) {
                        httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
                    }
                    javax.net.ssl.HostnameVerifier hostnameVerifier = this.Camera2StreamConfigurationMap;
                    if (hostnameVerifier != null) {
                        httpsURLConnection.setHostnameVerifier(hostnameVerifier);
                    }
                }
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
                int responseCode = httpURLConnection.getResponseCode();
                java.lang.String responseMessage = httpURLConnection.getResponseMessage();
                if (responseCode != 200) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("Non 200 status code (");
                    sb.append(responseCode);
                    sb.append(" ");
                    sb.append(responseMessage);
                    sb.append(") returned from ");
                    sb.append(url);
                    throw new java.io.IOException(sb.toString());
                }
                org.jose4j.http.Response response = new org.jose4j.http.Response(responseCode, responseMessage, httpURLConnection.getHeaderFields(), getHighSpeedVideoFpsRanges(openConnection, getHighSpeedVideoSizes(openConnection)));
                getHighSpeedVideoFpsRangesFor.debug("HTTP GET of {} returned {}", url, response);
                return response;
            } catch (java.io.FileNotFoundException e) {
                throw e;
            } catch (javax.net.ssl.SSLHandshakeException e2) {
                throw e2;
            } catch (javax.net.ssl.SSLPeerUnverifiedException e3) {
                throw e3;
            } catch (org.jose4j.http.Get.ResponseBodyTooLargeException e4) {
                throw e4;
            } catch (java.io.IOException e5) {
                int i2 = i + 1;
                if (i2 > this.getHighSpeedVideoSizesFor) {
                    throw e5;
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    j = java.lang.Math.min((long) (java.lang.Math.pow(2.0d, i) * this.getHighSpeedVideoFpsRanges), 8000L);
                } else {
                    j = this.getHighSpeedVideoFpsRanges;
                }
                getHighSpeedVideoFpsRangesFor.debug("Waiting {}ms before retrying ({} of {}) HTTP GET of {} after failed attempt: {}", java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(this.getHighSpeedVideoSizesFor), url, e5);
                try {
                    java.lang.Thread.sleep(j);
                } catch (java.lang.InterruptedException unused) {
                }
                i = i2;
            }
        }
    }

    private java.lang.String getHighSpeedVideoFpsRanges(java.net.URLConnection uRLConnection, java.lang.String str) throws java.io.IOException {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.InputStream inputStream = uRLConnection.getInputStream();
        try {
            java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(inputStream, str);
            try {
                char[] cArr = new char[1024];
                int i = 0;
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (-1 != read) {
                        stringWriter.write(cArr, 0, read);
                        i += read;
                        int i2 = this.getOutputMinFrameDuration;
                        if (i2 > 0 && i > i2) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("More than ");
                            sb.append(this.getOutputMinFrameDuration);
                            sb.append(" characters have been read from the response body.");
                            throw new org.jose4j.http.Get.ResponseBodyTooLargeException(sb.toString());
                        }
                    } else {
                        getHighSpeedVideoFpsRangesFor.debug("read {} characters", java.lang.Integer.valueOf(i));
                        inputStreamReader.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return stringWriter.toString();
                    }
                }
            } finally {
            }
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.net.URLConnection uRLConnection) {
        java.lang.String str;
        java.lang.String headerField = uRLConnection.getHeaderField("Content-Type");
        if (headerField != null) {
            try {
                java.lang.String[] split = headerField.replace(" ", "").split(";");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        str = "UTF-8";
                        break;
                    }
                    java.lang.String str2 = split[i];
                    if (str2.startsWith("charset=")) {
                        str = str2.substring(8);
                        break;
                    }
                    i++;
                }
                java.nio.charset.Charset.forName(str);
                return str;
            } catch (java.lang.Exception e) {
                getHighSpeedVideoFpsRangesFor.debug("Unexpected problem attempted to determine the charset from the Content-Type ({}) so will default to using UTF8: {}", headerField, e);
            }
        }
        return "UTF-8";
    }

    public void setConnectTimeout(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public void setReadTimeout(int i) {
        this.getInputFormats = i;
    }

    public void setHostnameVerifier(javax.net.ssl.HostnameVerifier hostnameVerifier) {
        this.Camera2StreamConfigurationMap = hostnameVerifier;
    }

    public void setTrustedCertificates(java.security.cert.X509Certificate... x509CertificateArr) {
        setTrustedCertificates(java.util.Arrays.asList(x509CertificateArr));
    }

    public void setRetries(int i) {
        this.getHighSpeedVideoSizesFor = i;
    }

    public void setProgressiveRetryWait(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public void setInitialRetryWaitTime(long j) {
        this.getHighSpeedVideoFpsRanges = j;
    }

    public void setResponseBodySizeLimit(int i) {
        this.getOutputMinFrameDuration = i;
    }

    public void setTrustedCertificates(java.util.Collection<java.security.cert.X509Certificate> collection) {
        try {
            javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance("PKIX");
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("jks");
            keyStore.load(null, null);
            int i = 0;
            for (java.security.cert.X509Certificate x509Certificate : collection) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("alias");
                sb.append(i);
                keyStore.setCertificateEntry(sb.toString(), x509Certificate);
                i++;
            }
            trustManagerFactory.init(keyStore);
            javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagers, null);
            this.getOutputFormats = sSLContext.getSocketFactory();
        } catch (java.io.IOException | java.security.KeyManagementException | java.security.KeyStoreException | java.security.NoSuchAlgorithmException | java.security.cert.CertificateException e) {
            throw new org.jose4j.lang.UncheckedJoseException("Unable to initialize socket factory with custom trusted  certificates.", e);
        }
    }

    public void setSslSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this.getOutputFormats = sSLSocketFactory;
    }

    public void setHttpProxy(java.net.Proxy proxy) {
        this.getInputSizeshNQ4ISI = proxy;
    }

    static class ResponseBodyTooLargeException extends java.io.IOException {
        public ResponseBodyTooLargeException(java.lang.String str) {
            super(str);
        }
    }
}
