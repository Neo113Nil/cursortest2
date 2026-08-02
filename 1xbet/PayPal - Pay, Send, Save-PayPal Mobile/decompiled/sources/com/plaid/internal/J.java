package com.plaid.internal;

/* loaded from: classes16.dex */
public final class J {
    public final com.plaid.internal.C0541h4 a(java.lang.String str, android.net.Network network) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
        try {
            java.net.URLConnection openConnection = network.openConnection(new java.net.URL(str));
            if (openConnection == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            com.plaid.internal.C0541h4 c0541h4 = new com.plaid.internal.C0541h4(httpURLConnection.getResponseCode(), a(httpURLConnection));
            httpURLConnection.disconnect();
            return c0541h4;
        } catch (com.plaid.internal.AbstractC0678w7.d e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new com.plaid.internal.AbstractC0678w7.c(e2);
        }
    }

    public static java.lang.String a(java.net.HttpURLConnection httpURLConnection) {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream()));
        java.lang.String str = "";
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return str;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(readLine);
            str = sb.toString();
        }
    }
}
