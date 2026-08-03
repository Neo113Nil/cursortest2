package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Uk {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f5084d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f5085e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f5086f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f5087g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f5088h = "SESSION_INIT_TIME";

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f5089i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5090a;

    /* renamed from: b, reason: collision with root package name */
    protected final io.appmetrica.analytics.impl.We f5091b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0354fb f5092c;

    public Uk(io.appmetrica.analytics.impl.We we, java.lang.String str) {
        this.f5091b = we;
        this.f5090a = str;
        io.appmetrica.analytics.impl.C0354fb c0354fb = new io.appmetrica.analytics.impl.C0354fb();
        try {
            java.lang.String h2 = we.h(str);
            if (!android.text.TextUtils.isEmpty(h2)) {
                c0354fb = new io.appmetrica.analytics.impl.C0354fb(h2);
            }
        } catch (java.lang.Throwable unused) {
        }
        this.f5092c = c0354fb;
    }

    public final io.appmetrica.analytics.impl.Uk a(long j2) {
        a(f5088h, java.lang.Long.valueOf(j2));
        return this;
    }

    public final io.appmetrica.analytics.impl.Uk b(long j2) {
        a(f5085e, java.lang.Long.valueOf(j2));
        return this;
    }

    public final java.lang.Long c() {
        return this.f5092c.a(f5088h);
    }

    public final io.appmetrica.analytics.impl.Uk d(long j2) {
        a(f5086f, java.lang.Long.valueOf(j2));
        return this;
    }

    public final java.lang.Long e() {
        return this.f5092c.a(f5087g);
    }

    public final java.lang.Long f() {
        return this.f5092c.a(f5086f);
    }

    public final java.lang.Long g() {
        return this.f5092c.a(f5084d);
    }

    public final boolean h() {
        return this.f5092c.length() > 0;
    }

    public final java.lang.Boolean i() {
        io.appmetrica.analytics.impl.C0354fb c0354fb = this.f5092c;
        c0354fb.getClass();
        try {
            return java.lang.Boolean.valueOf(c0354fb.getBoolean(f5089i));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final io.appmetrica.analytics.impl.Uk a(boolean z2) {
        a(f5089i, java.lang.Boolean.valueOf(z2));
        return this;
    }

    public final void b() {
        this.f5091b.e(this.f5090a, this.f5092c.toString());
        this.f5091b.b();
    }

    public final io.appmetrica.analytics.impl.Uk c(long j2) {
        a(f5087g, java.lang.Long.valueOf(j2));
        return this;
    }

    public final java.lang.Long d() {
        return this.f5092c.a(f5085e);
    }

    public final io.appmetrica.analytics.impl.Uk e(long j2) {
        a(f5084d, java.lang.Long.valueOf(j2));
        return this;
    }

    public final void a(java.lang.String str, java.lang.Object obj) {
        try {
            this.f5092c.put(str, obj);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void a() {
        this.f5092c = new io.appmetrica.analytics.impl.C0354fb();
        b();
    }
}
