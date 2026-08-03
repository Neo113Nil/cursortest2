package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814x5 implements io.appmetrica.analytics.impl.F8, io.appmetrica.analytics.impl.S8 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.L6 f7094a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f7095b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f7096c;

    public C0814x5(io.appmetrica.analytics.impl.L6 l6) {
        this.f7094a = l6;
        java.util.Set y2 = Q1.l.y(java.lang.Integer.valueOf(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), java.lang.Integer.valueOf(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_APP_UPDATE.a()), java.lang.Integer.valueOf(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_FIRST_ACTIVATION.a()), java.lang.Integer.valueOf(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_INIT.a()), java.lang.Integer.valueOf(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), java.lang.Integer.valueOf(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), java.lang.Integer.valueOf(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_REFERRER.a()), java.lang.Integer.valueOf(io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f7095b = y2;
        this.f7096c = new java.util.concurrent.atomic.AtomicLong(l6.a(y2));
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a() {
        this.f7096c.set(this.f7094a.a(this.f7095b));
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        return this.f7096c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void b(java.util.List<java.lang.Integer> list) {
        int i2 = 0;
        if (list == null || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f7095b.contains(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue())) && (i2 = i2 + 1) < 0) {
                    throw new java.lang.ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f7096c.addAndGet(-i2);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a(java.util.List<java.lang.Integer> list) {
        int i2 = 0;
        if (list == null || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f7095b.contains(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue())) && (i2 = i2 + 1) < 0) {
                    throw new java.lang.ArithmeticException("Count overflow has happened.");
                }
            }
        }
        this.f7096c.addAndGet(i2);
    }
}
