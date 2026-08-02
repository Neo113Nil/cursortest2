package com.nimbusds.jose.util;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class DefaultResourceRetriever extends com.nimbusds.jose.util.AbstractRestrictedResourceRetriever implements com.nimbusds.jose.util.RestrictedResourceRetriever {
    private boolean disconnectAfterUse;
    private java.net.Proxy proxy;
    private final javax.net.ssl.SSLSocketFactory sslSocketFactory;

    public DefaultResourceRetriever() {
        this(0, 0);
    }

    public DefaultResourceRetriever(int i, int i2) {
        this(i, i2, 0);
    }

    public DefaultResourceRetriever(int i, int i2, int i3) {
        this(i, i2, i3, true);
    }

    public DefaultResourceRetriever(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, z, null);
    }

    public DefaultResourceRetriever(int i, int i2, int i3, boolean z, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        super(i, i2, i3);
        this.disconnectAfterUse = z;
        this.sslSocketFactory = sSLSocketFactory;
    }

    public boolean disconnectsAfterUse() {
        return this.disconnectAfterUse;
    }

    public void setDisconnectsAfterUse(boolean z) {
        this.disconnectAfterUse = z;
    }

    public java.net.Proxy getProxy() {
        return this.proxy;
    }

    public void setProxy(java.net.Proxy proxy) {
        this.proxy = proxy;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    @Override // com.nimbusds.jose.util.ResourceRetriever
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.nimbusds.jose.util.Resource retrieveResource(java.net.URL url) throws java.io.IOException {
        java.lang.Exception e;
        java.net.URLConnection uRLConnection;
        java.lang.Throwable th;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        try {
            if ("file".equals(url.getProtocol())) {
                uRLConnection = openFileConnection(url);
            } else {
                uRLConnection = openConnection(url);
            }
            try {
                uRLConnection.setConnectTimeout(getConnectTimeout());
                uRLConnection.setReadTimeout(getReadTimeout());
                if ((uRLConnection instanceof javax.net.ssl.HttpsURLConnection) && (sSLSocketFactory = this.sslSocketFactory) != null) {
                    ((javax.net.ssl.HttpsURLConnection) uRLConnection).setSSLSocketFactory(sSLSocketFactory);
                }
                if ((uRLConnection instanceof java.net.HttpURLConnection) && getHeaders() != null && !getHeaders().isEmpty()) {
                    for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : getHeaders().entrySet()) {
                        java.util.Iterator<java.lang.String> it = entry.getValue().iterator();
                        while (it.hasNext()) {
                            uRLConnection.addRequestProperty(entry.getKey(), it.next());
                        }
                    }
                }
                java.io.InputStream inputStream = getInputStream(uRLConnection, getSizeLimit());
                try {
                    java.lang.String readInputStreamToString = com.nimbusds.jose.util.IOUtils.readInputStreamToString(inputStream, com.nimbusds.jose.util.StandardCharset.UTF_8);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    boolean z = uRLConnection instanceof java.net.HttpURLConnection;
                    if (z) {
                        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) uRLConnection;
                        int responseCode = httpURLConnection.getResponseCode();
                        java.lang.String responseMessage = httpURLConnection.getResponseMessage();
                        if (responseCode > 299 || responseCode < 200) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("HTTP ");
                            sb.append(responseCode);
                            sb.append(": ");
                            sb.append(responseMessage);
                            throw new java.io.IOException(sb.toString());
                        }
                    }
                    com.nimbusds.jose.util.Resource resource = new com.nimbusds.jose.util.Resource(readInputStreamToString, uRLConnection instanceof java.net.HttpURLConnection ? uRLConnection.getContentType() : null);
                    if (this.disconnectAfterUse && z) {
                        ((java.net.HttpURLConnection) uRLConnection).disconnect();
                    }
                    return resource;
                } catch (java.lang.Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.lang.Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                try {
                    if (e instanceof java.io.IOException) {
                        throw e;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append("Couldn't open URL connection: ");
                    sb2.append(e.getMessage());
                    throw new java.io.IOException(sb2.toString(), e);
                } catch (java.lang.Throwable th4) {
                    r0 = uRLConnection;
                    th = th4;
                    java.net.URLConnection uRLConnection2 = r0;
                    th = th;
                    uRLConnection = uRLConnection2;
                    if (this.disconnectAfterUse && (uRLConnection instanceof java.net.HttpURLConnection)) {
                        ((java.net.HttpURLConnection) uRLConnection).disconnect();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                if (this.disconnectAfterUse) {
                    ((java.net.HttpURLConnection) uRLConnection).disconnect();
                }
                throw th;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
            uRLConnection = null;
        } catch (java.lang.Throwable th6) {
            th = th6;
            java.net.URLConnection uRLConnection22 = r0;
            th = th;
            uRLConnection = uRLConnection22;
            if (this.disconnectAfterUse) {
            }
            throw th;
        }
    }

    @java.lang.Deprecated
    protected java.net.HttpURLConnection openConnection(java.net.URL url) throws java.io.IOException {
        return openHTTPConnection(url);
    }

    protected java.net.HttpURLConnection openHTTPConnection(java.net.URL url) throws java.io.IOException {
        java.net.Proxy proxy = this.proxy;
        if (proxy != null) {
            return (java.net.HttpURLConnection) url.openConnection(proxy);
        }
        return (java.net.HttpURLConnection) url.openConnection();
    }

    protected java.net.URLConnection openFileConnection(java.net.URL url) throws java.io.IOException {
        return url.openConnection();
    }

    private java.io.InputStream getInputStream(java.net.URLConnection uRLConnection, int i) throws java.io.IOException {
        java.io.InputStream inputStream = uRLConnection.getInputStream();
        return i > 0 ? new com.nimbusds.jose.util.BoundedInputStream(inputStream, getSizeLimit()) : inputStream;
    }
}
