package com.fyber.inneractive.sdk.network.timeouts.request;

/* loaded from: classes3.dex */
public abstract class a extends com.fyber.inneractive.sdk.network.timeouts.a {
    public int h;
    public int i;
    public int j;
    public int k;
    public final java.lang.String l;

    public a(java.lang.String str, com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str2) {
        this.l = str2;
        d(kVar, str);
    }

    public int a(int i) {
        return 0;
    }

    public abstract int a(com.fyber.inneractive.sdk.config.global.features.k kVar);

    public abstract int a(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str);

    public int b() {
        return 0;
    }

    public abstract int b(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str);

    public int c() {
        return 0;
    }

    public abstract int c(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str);

    public void d(com.fyber.inneractive.sdk.config.global.features.k kVar, java.lang.String str) {
        int b = b(kVar, "read");
        int b2 = b(kVar, "conn");
        int a2 = a(kVar, str);
        this.f = a(kVar);
        this.j = c(kVar, "read");
        int c = c(kVar, "conn");
        this.k = c;
        int i = (this.j * a2) / 100;
        this.h = i;
        this.i = (a2 * c) / 100;
        this.h = java.lang.Math.max(b, i);
        this.i = java.lang.Math.max(b2, this.i);
    }
}
