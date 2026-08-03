package com.fyber.inneractive.sdk.response;

/* loaded from: classes3.dex */
public abstract class e {
    public java.lang.String B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String F;
    public com.fyber.inneractive.sdk.config.enums.CreativeType J;

    /* renamed from: a, reason: collision with root package name */
    public long f4251a;
    public long b;
    public long c;
    public java.lang.String d;
    public int e;
    public int f;
    public int g;
    public java.lang.String h;
    public java.lang.String i;
    public java.lang.String j;
    public java.lang.String k;
    public java.lang.String l;
    public java.lang.String m;
    public com.fyber.inneractive.sdk.config.enums.UnitDisplayType n;
    public java.lang.String o;
    public java.util.Map p;
    public java.lang.String q;
    public com.fyber.inneractive.sdk.external.ImpressionData r;
    public java.lang.String u;
    public java.lang.Exception w;
    public java.lang.String x;
    public java.lang.String y;
    public java.lang.String z;
    public int s = 0;
    public float t = -1.0f;
    public int v = -1;
    public boolean A = false;
    public com.fyber.inneractive.sdk.ignite.m E = com.fyber.inneractive.sdk.ignite.m.NONE;
    public boolean G = false;
    public long H = 0;
    public boolean I = false;

    public abstract com.fyber.inneractive.sdk.external.InneractiveErrorCode a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar);

    public final void a(java.lang.String str) {
        long j;
        try {
            j = java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            j = 20;
        }
        this.b = j;
        this.f4251a = java.util.concurrent.TimeUnit.MINUTES.toMillis(j) + this.c;
    }

    public abstract com.fyber.inneractive.sdk.external.InneractiveErrorCode b();

    public final boolean a() {
        return (this.E == com.fyber.inneractive.sdk.ignite.m.NONE || android.text.TextUtils.isEmpty(this.x) || android.text.TextUtils.isEmpty(this.D) || android.text.TextUtils.isEmpty(this.F)) ? false : true;
    }
}
