package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class j extends com.fyber.inneractive.sdk.network.l {
    public final java.net.HttpURLConnection g;

    public j(java.net.HttpURLConnection httpURLConnection, int i, java.io.FilterInputStream filterInputStream, java.util.Map map, java.lang.String str) {
        this.g = httpURLConnection;
        this.f3845a = i;
        this.c = filterInputStream;
        this.d = map;
        this.e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.l
    public final void a() {
        try {
            java.net.HttpURLConnection httpURLConnection = this.g;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (java.lang.Throwable unused) {
        }
        super.a();
    }
}
