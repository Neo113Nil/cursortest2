package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class Zk {

    /* renamed from: d, reason: collision with root package name */
    public static final String f7796d = "SESSION_SLEEP_START";

    /* renamed from: e, reason: collision with root package name */
    public static final String f7797e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f, reason: collision with root package name */
    public static final String f7798f = "SESSION_ID";

    /* renamed from: g, reason: collision with root package name */
    public static final String f7799g = "SESSION_COUNTER_ID";

    /* renamed from: h, reason: collision with root package name */
    public static final String f7800h = "SESSION_INIT_TIME";

    /* renamed from: i, reason: collision with root package name */
    public static final String f7801i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a, reason: collision with root package name */
    public final String f7802a;

    /* renamed from: b, reason: collision with root package name */
    protected final C0541bf f7803b;

    /* renamed from: c, reason: collision with root package name */
    public C0821mb f7804c;

    public Zk(C0541bf c0541bf, String str) {
        this.f7803b = c0541bf;
        this.f7802a = str;
        C0821mb c0821mb = new C0821mb();
        try {
            String h3 = c0541bf.h(str);
            if (!TextUtils.isEmpty(h3)) {
                c0821mb = new C0821mb(h3);
            }
        } catch (Throwable unused) {
        }
        this.f7804c = c0821mb;
    }

    public final Zk a(long j2) {
        a(f7800h, Long.valueOf(j2));
        return this;
    }

    public final Zk b(long j2) {
        a(f7797e, Long.valueOf(j2));
        return this;
    }

    public final Long c() {
        return this.f7804c.a(f7800h);
    }

    public final Zk d(long j2) {
        a(f7798f, Long.valueOf(j2));
        return this;
    }

    public final Long e() {
        return this.f7804c.a(f7799g);
    }

    public final Long f() {
        return this.f7804c.a(f7798f);
    }

    public final Long g() {
        return this.f7804c.a(f7796d);
    }

    public final boolean h() {
        return this.f7804c.length() > 0;
    }

    public final Boolean i() {
        C0821mb c0821mb = this.f7804c;
        c0821mb.getClass();
        try {
            return Boolean.valueOf(c0821mb.getBoolean(f7801i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Zk a(boolean z) {
        a(f7801i, Boolean.valueOf(z));
        return this;
    }

    public final void b() {
        this.f7803b.e(this.f7802a, this.f7804c.toString());
        this.f7803b.b();
    }

    public final Zk c(long j2) {
        a(f7799g, Long.valueOf(j2));
        return this;
    }

    public final Long d() {
        return this.f7804c.a(f7797e);
    }

    public final Zk e(long j2) {
        a(f7796d, Long.valueOf(j2));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f7804c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f7804c = new C0821mb();
        b();
    }
}
