package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f3845a;
    public final java.lang.String b;
    public java.io.InputStream c;
    public java.util.Map d;
    public java.lang.String e;
    public final java.util.ArrayList f = new java.util.ArrayList();

    public l() {
    }

    public void a() {
        java.io.InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public l(java.io.FilterInputStream filterInputStream, int i, java.lang.String str, java.util.Map map, java.lang.String str2) {
        this.c = filterInputStream;
        this.f3845a = i;
        this.b = str;
        this.d = map;
        this.e = str2;
    }
}
