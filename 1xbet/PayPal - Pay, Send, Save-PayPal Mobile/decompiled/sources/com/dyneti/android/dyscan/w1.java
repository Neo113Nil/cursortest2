package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3350a;

    public w1(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f3350a = str;
    }

    public static final javax.net.ssl.HttpsURLConnection a(com.dyneti.android.dyscan.w1 w1Var) {
        java.net.URLConnection openConnection = new java.net.URL("https://api.dyneti.com/scans/nfc").openConnection();
        kotlin.jvm.internal.Intrinsics.checkNotNull(openConnection, "");
        javax.net.ssl.HttpsURLConnection httpsURLConnection = (javax.net.ssl.HttpsURLConnection) openConnection;
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setRequestProperty("User-Agent", "Android Multipart HTTP Client 1.0");
        httpsURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.KEEP_ALIVE);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(120000);
        httpsURLConnection.setRequestProperty("X-API-KEY", w1Var.f3350a);
        httpsURLConnection.setRequestProperty("Content-Type", "application/json");
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setDoInput(true);
        return httpsURLConnection;
    }
}
