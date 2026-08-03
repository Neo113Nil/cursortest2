package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxHttpURLConnection {
    public static final javax.net.ssl.HostnameVerifier DO_NOT_VERIFY = new javax.net.ssl.HostnameVerifier() { // from class: org.cocos2dx.lib.Cocos2dxHttpURLConnection.2
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
            return true;
        }
    };
    private static final java.lang.String POST_METHOD = "POST";
    private static final java.lang.String PUT_METHOD = "PUT";

    static java.net.HttpURLConnection createHttpURLConnection(java.lang.String str) {
        java.net.HttpURLConnection httpURLConnection;
        try {
            java.net.URL url = new java.net.URL(str);
            android.util.Log.e("URLConnection linkURL=", str);
            if (url.getProtocol().toUpperCase().equals("HTTPS")) {
                android.util.Log.e("URLConnection HTTPS", "is htttps !!!");
                trustAllHosts();
                javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) url.openConnection();
                httpsURLConnection.setHostnameVerifier(DO_NOT_VERIFY);
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "identity");
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (java.lang.Exception e) {
            android.util.Log.e("URLConnection exception", e.toString());
            return null;
        }
    }

    public static void trustAllHosts() {
        javax.net.ssl.TrustManager[] trustManagerArr = {new javax.net.ssl.X509TrustManager() { // from class: org.cocos2dx.lib.Cocos2dxHttpURLConnection.1
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return new java.security.cert.X509Certificate[0];
            }
        }};
        try {
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new java.security.SecureRandom());
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    static void setReadAndConnectTimeout(java.net.HttpURLConnection httpURLConnection, int i, int i2) {
        httpURLConnection.setReadTimeout(i);
        httpURLConnection.setConnectTimeout(i2);
    }

    static void setRequestMethod(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        try {
            httpURLConnection.setRequestMethod(str);
            if (str.equalsIgnoreCase("POST") || str.equalsIgnoreCase(PUT_METHOD)) {
                httpURLConnection.setDoOutput(true);
            }
        } catch (java.net.ProtocolException e) {
            android.util.Log.e("URLConnection exception", e.toString());
        }
    }

    static void setVerifySSL(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        java.io.BufferedInputStream bufferedInputStream;
        if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
            javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) httpURLConnection;
            try {
                if (str.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                    bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(str));
                } else {
                    bufferedInputStream = new java.io.BufferedInputStream(org.cocos2dx.lib.Cocos2dxHelper.getActivity().getAssets().open(str.substring(7)));
                }
                java.security.cert.Certificate generateCertificate = java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(bufferedInputStream);
                java.lang.System.out.println("ca=" + ((java.security.cert.X509Certificate) generateCertificate).getSubjectDN());
                bufferedInputStream.close();
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
                keyStore.load(null, null);
                keyStore.setCertificateEntry("ca", generateCertificate);
                javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
                sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            } catch (java.lang.Exception e) {
                android.util.Log.e("URLConnection exception", e.toString());
            }
        }
    }

    static void addRequestHeader(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) {
        httpURLConnection.setRequestProperty(str, str2);
    }

    static int connect(java.net.HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.connect();
            return 0;
        } catch (java.io.IOException e) {
            android.util.Log.e("cocos2d-x debug info", "come in connect");
            android.util.Log.e("cocos2d-x debug info", e.toString());
            return 1;
        }
    }

    static void disconnect(java.net.HttpURLConnection httpURLConnection) {
        httpURLConnection.disconnect();
    }

    static void sendRequest(java.net.HttpURLConnection httpURLConnection, byte[] bArr) {
        try {
            java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
            if (bArr != null) {
                outputStream.write(bArr);
                outputStream.flush();
            }
            outputStream.close();
        } catch (java.io.IOException e) {
            android.util.Log.e("URLConnection exception", e.toString());
        }
    }

    static java.lang.String getResponseHeaders(java.net.HttpURLConnection httpURLConnection) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null) {
            return null;
        }
        java.lang.String str = "";
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerFields.entrySet()) {
            java.lang.String key = entry.getKey();
            str = key == null ? str + listToString(entry.getValue(), ",") + "\n" : str + key + ":" + listToString(entry.getValue(), ",") + "\n";
        }
        return str;
    }

    static java.lang.String getResponseHeaderByIdx(java.net.HttpURLConnection httpURLConnection, int i) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null) {
            return null;
        }
        int i2 = 0;
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerFields.entrySet()) {
            if (i2 == i) {
                java.lang.String key = entry.getKey();
                if (key == null) {
                    return listToString(entry.getValue(), ",") + "\n";
                }
                return key + ":" + listToString(entry.getValue(), ",") + "\n";
            }
            i2++;
        }
        return null;
    }

    static java.lang.String getResponseHeaderByKey(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields;
        if (str == null || (headerFields = httpURLConnection.getHeaderFields()) == null) {
            return null;
        }
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : headerFields.entrySet()) {
            if (str.equalsIgnoreCase(entry.getKey())) {
                if ("set-cookie".equalsIgnoreCase(str)) {
                    return combinCookies(entry.getValue(), httpURLConnection.getURL().getHost());
                }
                return listToString(entry.getValue(), ",");
            }
        }
        return null;
    }

    static int getResponseHeaderByKeyInt(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        java.lang.String headerField = httpURLConnection.getHeaderField(str);
        if (headerField == null) {
            return 0;
        }
        return java.lang.Integer.parseInt(headerField);
    }

    static byte[] getResponseContent(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
            java.lang.String contentEncoding = httpURLConnection.getContentEncoding();
            if (contentEncoding != null) {
                if (contentEncoding.equalsIgnoreCase("gzip")) {
                    errorStream = new java.util.zip.GZIPInputStream(httpURLConnection.getInputStream());
                } else if (contentEncoding.equalsIgnoreCase("deflate")) {
                    errorStream = new java.util.zip.InflaterInputStream(httpURLConnection.getInputStream());
                }
            }
        } catch (java.io.IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        } catch (java.lang.Exception e) {
            android.util.Log.e("URLConnection exception", e.toString());
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            while (true) {
                int read = errorStream.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (java.lang.Exception e2) {
            android.util.Log.e("URLConnection exception", e2.toString());
            return null;
        }
    }

    static int getResponseCode(java.net.HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (java.io.IOException e) {
            android.util.Log.e("URLConnection exception", e.toString());
            return 0;
        }
    }

    static java.lang.String getResponseMessage(java.net.HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseMessage();
        } catch (java.io.IOException e) {
            java.lang.String iOException = e.toString();
            android.util.Log.e("URLConnection exception", iOException);
            return iOException;
        }
    }

    public static java.lang.String listToString(java.util.List<java.lang.String> list, java.lang.String str) {
        if (list == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = false;
        for (java.lang.String str2 : list) {
            if (z) {
                sb.append(str);
            }
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            z = true;
        }
        return sb.toString();
    }

    public static java.lang.String combinCookies(java.util.List<java.lang.String> list, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = list.iterator();
        java.lang.String str2 = com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING;
        java.lang.String str3 = "FALSE";
        java.lang.String str4 = null;
        java.lang.String str5 = null;
        java.lang.String str6 = null;
        while (it.hasNext()) {
            for (java.lang.String str7 : it.next().split(";")) {
                int indexOf = str7.indexOf(com.ironsource.X3.j.b);
                if (-1 != indexOf) {
                    java.lang.String[] strArr = {str7.substring(0, indexOf), str7.substring(indexOf + 1)};
                    if ("expires".equalsIgnoreCase(strArr[0].trim())) {
                        str6 = str2Seconds(strArr[1].trim());
                    } else if ("path".equalsIgnoreCase(strArr[0].trim())) {
                        str2 = strArr[1];
                    } else if ("secure".equalsIgnoreCase(strArr[0].trim())) {
                        str3 = strArr[1];
                    } else if (com.ironsource.X3.j.D.equalsIgnoreCase(strArr[0].trim())) {
                        str = strArr[1];
                    } else if (!"version".equalsIgnoreCase(strArr[0].trim()) && !io.ktor.client.utils.CacheControl.MAX_AGE.equalsIgnoreCase(strArr[0].trim())) {
                        str4 = strArr[0];
                        str5 = strArr[1];
                    }
                }
            }
            if (str == null) {
                str = "none";
            }
            sb.append(str);
            sb.append("\tFALSE\t");
            sb.append(str2);
            sb.append('\t');
            sb.append(str3);
            sb.append('\t');
            sb.append(str6);
            sb.append("\t");
            sb.append(str4);
            sb.append("\t");
            sb.append(str5);
            sb.append('\n');
        }
        return sb.toString();
    }

    private static java.lang.String str2Seconds(java.lang.String str) {
        long j;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        try {
            calendar.setTime(new java.text.SimpleDateFormat("EEE, dd-MMM-yy hh:mm:ss zzz", java.util.Locale.US).parse(str));
            j = calendar.getTimeInMillis() / 1000;
        } catch (java.text.ParseException e) {
            android.util.Log.e("URLConnection exception", e.toString());
            j = 0;
        }
        return java.lang.Long.toString(j);
    }
}
