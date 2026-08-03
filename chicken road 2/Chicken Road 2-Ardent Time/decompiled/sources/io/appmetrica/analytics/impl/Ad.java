package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Ad implements io.appmetrica.analytics.impl.InterfaceC0341eo, io.appmetrica.analytics.impl.InterfaceC0423i2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4052a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4053b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0703so f4054c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.J2 f4055d;

    /* renamed from: e, reason: collision with root package name */
    public io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f4056e = io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance();

    public Ad(int i2, java.lang.String str, io.appmetrica.analytics.impl.InterfaceC0703so interfaceC0703so, io.appmetrica.analytics.impl.J2 j2) {
        this.f4053b = i2;
        this.f4052a = str;
        this.f4054c = interfaceC0703so;
        this.f4055d = j2;
    }

    public final io.appmetrica.analytics.impl.C0367fo a() {
        io.appmetrica.analytics.impl.C0367fo c0367fo = new io.appmetrica.analytics.impl.C0367fo();
        c0367fo.f5945b = this.f4053b;
        c0367fo.f5944a = this.f4052a.getBytes();
        c0367fo.f5947d = new io.appmetrica.analytics.impl.C0419ho();
        c0367fo.f5946c = new io.appmetrica.analytics.impl.C0393go();
        return c0367fo;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0341eo
    public abstract /* synthetic */ void a(io.appmetrica.analytics.impl.Cdo cdo);

    public final io.appmetrica.analytics.impl.J2 b() {
        return this.f4055d;
    }

    public final java.lang.String c() {
        return this.f4052a;
    }

    public final io.appmetrica.analytics.impl.InterfaceC0703so d() {
        return this.f4054c;
    }

    public final int e() {
        return this.f4053b;
    }

    public final boolean f() {
        io.appmetrica.analytics.impl.C0652qo a2 = this.f4054c.a(this.f4052a);
        if (a2.f6701a) {
            return true;
        }
        this.f4056e.warning("Attribute " + this.f4052a + " of type " + ((java.lang.String) io.appmetrica.analytics.impl.On.f4798a.get(this.f4053b)) + " is skipped because " + a2.f6702b, new java.lang.Object[0]);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0341eo
    public final void a(io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger) {
        this.f4056e = publicLogger;
    }
}
