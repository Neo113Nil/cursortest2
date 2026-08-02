package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public class HurlStack extends com.android.volley.toolbox.BaseHttpStack {
    private final com.android.volley.toolbox.HurlStack.UrlRewriter getHighResolutionOutputSizeshNQ4ISI;
    private final javax.net.ssl.SSLSocketFactory getHighSpeedVideoFpsRangesFor;

    public interface UrlRewriter extends com.android.volley.toolbox.UrlRewriter {
    }

    public HurlStack() {
        this(null);
    }

    public HurlStack(com.android.volley.toolbox.HurlStack.UrlRewriter urlRewriter) {
        this(urlRewriter, null);
    }

    public HurlStack(com.android.volley.toolbox.HurlStack.UrlRewriter urlRewriter, javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this.getHighResolutionOutputSizeshNQ4ISI = urlRewriter;
        this.getHighSpeedVideoFpsRangesFor = sSLSocketFactory;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request<?> request, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException, com.android.volley.AuthFailureError {
        javax.net.ssl.SSLSocketFactory sSLSocketFactory;
        java.lang.String url = request.getUrl();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(map);
        hashMap.putAll(request.getHeaders());
        com.android.volley.toolbox.HurlStack.UrlRewriter urlRewriter = this.getHighResolutionOutputSizeshNQ4ISI;
        if (urlRewriter != null) {
            java.lang.String rewriteUrl = urlRewriter.rewriteUrl(url);
            if (rewriteUrl == null) {
                throw new java.io.IOException("URL blocked by rewriter: ".concat(java.lang.String.valueOf(url)));
            }
            url = rewriteUrl;
        }
        java.net.URL url2 = new java.net.URL(url);
        java.net.HttpURLConnection createConnection = createConnection(url2);
        int timeoutMs = request.getTimeoutMs();
        createConnection.setConnectTimeout(timeoutMs);
        createConnection.setReadTimeout(timeoutMs);
        boolean z = false;
        createConnection.setUseCaches(false);
        createConnection.setDoInput(true);
        if ("https".equals(url2.getProtocol()) && (sSLSocketFactory = this.getHighSpeedVideoFpsRangesFor) != null) {
            ((javax.net.ssl.HttpsURLConnection) createConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (java.lang.String str : hashMap.keySet()) {
                createConnection.setRequestProperty(str, (java.lang.String) hashMap.get(str));
            }
            switch (request.getMethod()) {
                case -1:
                    byte[] postBody = request.getPostBody();
                    if (postBody != null) {
                        createConnection.setRequestMethod("POST");
                        getHighSpeedVideoFpsRanges(createConnection, request, postBody);
                        break;
                    }
                    break;
                case 0:
                    createConnection.setRequestMethod("GET");
                    break;
                case 1:
                    createConnection.setRequestMethod("POST");
                    byte[] body = request.getBody();
                    if (body != null) {
                        getHighSpeedVideoFpsRanges(createConnection, request, body);
                        break;
                    }
                    break;
                case 2:
                    createConnection.setRequestMethod(com.datadog.android.internal.network.HttpSpec.Method.PUT);
                    byte[] body2 = request.getBody();
                    if (body2 != null) {
                        getHighSpeedVideoFpsRanges(createConnection, request, body2);
                        break;
                    }
                    break;
                case 3:
                    createConnection.setRequestMethod(com.datadog.android.internal.network.HttpSpec.Method.DELETE);
                    break;
                case 4:
                    createConnection.setRequestMethod(com.datadog.android.internal.network.HttpSpec.Method.HEAD);
                    break;
                case 5:
                    createConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    createConnection.setRequestMethod(com.datadog.android.internal.network.HttpSpec.Method.TRACE);
                    break;
                case 7:
                    createConnection.setRequestMethod("PATCH");
                    byte[] body3 = request.getBody();
                    if (body3 != null) {
                        getHighSpeedVideoFpsRanges(createConnection, request, body3);
                        break;
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException("Unknown method type.");
            }
            int responseCode = createConnection.getResponseCode();
            if (responseCode == -1) {
                throw new java.io.IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (request.getMethod() == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                com.android.volley.toolbox.HttpResponse httpResponse = new com.android.volley.toolbox.HttpResponse(responseCode, getHighResolutionOutputSizeshNQ4ISI(createConnection.getHeaderFields()));
                createConnection.disconnect();
                return httpResponse;
            }
            try {
                return new com.android.volley.toolbox.HttpResponse(responseCode, getHighResolutionOutputSizeshNQ4ISI(createConnection.getHeaderFields()), createConnection.getContentLength(), createInputStream(request, createConnection));
            } catch (java.lang.Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    createConnection.disconnect();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private static java.util.List<com.android.volley.Header> getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                java.util.Iterator<java.lang.String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.android.volley.Header(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    static class UrlConnectionInputStream extends java.io.FilterInputStream {
        private final java.net.HttpURLConnection getHighSpeedVideoFpsRanges;

        UrlConnectionInputStream(java.net.HttpURLConnection httpURLConnection) {
            super(com.android.volley.toolbox.HurlStack.getHighSpeedVideoSizes(httpURLConnection));
            this.getHighSpeedVideoFpsRanges = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            super.close();
            this.getHighSpeedVideoFpsRanges.disconnect();
        }
    }

    protected java.io.InputStream createInputStream(com.android.volley.Request<?> request, java.net.HttpURLConnection httpURLConnection) {
        return new com.android.volley.toolbox.HurlStack.UrlConnectionInputStream(httpURLConnection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.io.InputStream getHighSpeedVideoSizes(java.net.HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (java.io.IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    protected java.net.HttpURLConnection createConnection(java.net.URL url) throws java.io.IOException {
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(java.net.HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    private void getHighSpeedVideoFpsRanges(java.net.HttpURLConnection httpURLConnection, com.android.volley.Request<?> request, byte[] bArr) throws java.io.IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", request.getBodyContentType());
        }
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(createOutputStream(request, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    protected java.io.OutputStream createOutputStream(com.android.volley.Request<?> request, java.net.HttpURLConnection httpURLConnection, int i) throws java.io.IOException {
        return httpURLConnection.getOutputStream();
    }
}
