package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class b1 {
    public static final byte[] b = new byte[0];
    public static final com.fyber.inneractive.sdk.web.b1 c = new com.fyber.inneractive.sdk.web.b1();

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.z0 f4326a = new com.fyber.inneractive.sdk.web.z0();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.fyber.inneractive.sdk.web.c1 a(java.net.HttpURLConnection httpURLConnection, java.nio.ByteBuffer byteBuffer) {
        java.io.InputStream inputStream;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.lang.String contentType;
        java.lang.String str;
        java.lang.String str2;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        java.lang.String responseMessage;
        httpURLConnection.connect();
        for (int i = 0; i < 20; i++) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 300 || responseCode >= 400) {
                try {
                    inputStream = httpURLConnection.getInputStream();
                } catch (java.lang.Throwable unused) {
                    inputStream = null;
                }
                try {
                    byte[] array = byteBuffer.array();
                    byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = inputStream.read(array);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(array, 0, read);
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                } catch (java.lang.Throwable unused3) {
                    byteArrayOutputStream = null;
                    com.fyber.inneractive.sdk.util.v.b((java.io.Closeable) inputStream);
                    httpURLConnection.disconnect();
                    contentType = httpURLConnection.getContentType();
                    if (android.text.TextUtils.isEmpty(contentType)) {
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    headerFields = httpURLConnection.getHeaderFields();
                    if (headerFields != null) {
                    }
                    responseMessage = httpURLConnection.getResponseMessage();
                    if (android.text.TextUtils.isEmpty(responseMessage)) {
                    }
                }
                com.fyber.inneractive.sdk.util.v.b((java.io.Closeable) inputStream);
                httpURLConnection.disconnect();
                contentType = httpURLConnection.getContentType();
                if (android.text.TextUtils.isEmpty(contentType)) {
                    java.lang.String[] split = contentType.split(";");
                    java.lang.String trim = split.length > 0 ? split[0].trim() : "";
                    if (split.length > 1) {
                        str2 = split[1].trim();
                        str = trim;
                    } else {
                        str = trim;
                        str2 = "";
                    }
                } else {
                    str = "";
                    str2 = str;
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null) {
                    for (java.lang.String str3 : headerFields.keySet()) {
                        java.util.List<java.lang.String> list = headerFields.get(str3);
                        if (list != null && list.size() > 0) {
                            hashMap2.put(str3, list.get(0));
                        }
                    }
                }
                responseMessage = httpURLConnection.getResponseMessage();
                if (android.text.TextUtils.isEmpty(responseMessage)) {
                    return new com.fyber.inneractive.sdk.web.c1(byteArrayOutputStream == null ? b : byteArrayOutputStream.toByteArray(), hashMap2, str, str2, responseCode, responseMessage);
                }
                return null;
            }
            java.lang.String headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
            if (android.text.TextUtils.isEmpty(headerField)) {
                return null;
            }
            httpURLConnection.disconnect();
            httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(headerField).openConnection();
            httpURLConnection.connect();
        }
        return null;
    }

    public static void a(android.webkit.WebResourceRequest webResourceRequest, java.net.HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (java.lang.String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
