package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class s {
    public static boolean a() {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    public static java.lang.String b(java.net.HttpURLConnection httpURLConnection) {
        int responseCode = httpURLConnection.getResponseCode();
        if ((responseCode <= 300 || responseCode >= 304) && responseCode != 307 && responseCode != 308) {
            return null;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("getRedirectUrl: received redirect code %s", java.lang.Integer.toString(responseCode));
        java.lang.String headerField = httpURLConnection.getHeaderField(com.fyber.inneractive.sdk.network.n.LOCATION.a());
        if (!android.text.TextUtils.isEmpty(headerField)) {
            com.fyber.inneractive.sdk.util.IAlog.a("getRedirectUrl: redirecting target url: %s", headerField);
            return headerField;
        }
        throw new java.lang.Exception("Server returned HTTP " + java.lang.Integer.toString(responseCode) + " with empty location header!");
    }

    public static java.lang.String a(java.lang.String str, int i, int i2) {
        java.lang.String stringBuffer;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.connect();
            java.io.FilterInputStream a2 = a(httpURLConnection);
            java.lang.String b = b(httpURLConnection);
            if (!android.text.TextUtils.isEmpty(b)) {
                httpURLConnection.disconnect();
                return a(b, i2, i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                com.fyber.inneractive.sdk.util.IAlog.a("isResponseValid: found invalid response status: %s", java.lang.Integer.toString(responseCode));
                stringBuffer = null;
            } else {
                stringBuffer = com.fyber.inneractive.sdk.util.v.b((java.io.InputStream) a2).toString();
            }
            httpURLConnection.disconnect();
            return stringBuffer;
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("getBodyFromUrl failed with exception", e, new java.lang.Object[0]);
            throw e;
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("getBodyFromUrl failed with error", th, new java.lang.Object[0]);
            return null;
        }
    }

    public static java.io.FilterInputStream a(java.net.HttpURLConnection httpURLConnection) {
        java.io.FilterInputStream bufferedInputStream;
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            if (android.text.TextUtils.equals("gzip", httpURLConnection.getContentEncoding())) {
                bufferedInputStream = new java.util.zip.GZIPInputStream(inputStream);
            } else {
                bufferedInputStream = new java.io.BufferedInputStream(inputStream);
            }
            return bufferedInputStream;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
