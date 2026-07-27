package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Zk {

    /* renamed from: d, reason: collision with root package name */
    public static final String f6918d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final String f6919e = "SESSION_LAST_EVENT_OFFSET";
    public static final String f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f6920g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f6921h = "SESSION_INIT_TIME";

    /* renamed from: i, reason: collision with root package name */
    public static final String f6922i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f6923a;

    /* renamed from: b, reason: collision with root package name */
    protected final C0392bf f6924b;

    /* renamed from: c, reason: collision with root package name */
    public C0672mb f6925c;

    public Zk(C0392bf c0392bf, String str) {
        this.f6924b = c0392bf;
        this.f6923a = str;
        C0672mb c0672mb = new C0672mb();
        try {
            String h3 = c0392bf.h(str);
            if (!TextUtils.isEmpty(h3)) {
                c0672mb = new C0672mb(h3);
            }
        } catch (Throwable unused) {
        }
        this.f6925c = c0672mb;
    }

    public final Zk a(long j3) {
        a(f6921h, Long.valueOf(j3));
        return this;
    }

    public final Zk b(long j3) {
        a(f6919e, Long.valueOf(j3));
        return this;
    }

    public final Long c() {
        return this.f6925c.a(f6921h);
    }

    public final Zk d(long j3) {
        a(f, Long.valueOf(j3));
        return this;
    }

    public final Long e() {
        return this.f6925c.a(f6920g);
    }

    public final Long f() {
        return this.f6925c.a(f);
    }

    public final Long g() {
        return this.f6925c.a(f6918d);
    }

    public final boolean h() {
        return this.f6925c.length() > 0;
    }

    public final Boolean i() {
        C0672mb c0672mb = this.f6925c;
        c0672mb.getClass();
        try {
            return Boolean.valueOf(c0672mb.getBoolean(f6922i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Zk a(boolean z3) {
        a(f6922i, Boolean.valueOf(z3));
        return this;
    }

    public final void b() {
        this.f6924b.e(this.f6923a, this.f6925c.toString());
        this.f6924b.b();
    }

    public final Zk c(long j3) {
        a(f6920g, Long.valueOf(j3));
        return this;
    }

    public final Long d() {
        return this.f6925c.a(f6919e);
    }

    public final Zk e(long j3) {
        a(f6918d, Long.valueOf(j3));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f6925c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f6925c = new C0672mb();
        b();
    }
}
