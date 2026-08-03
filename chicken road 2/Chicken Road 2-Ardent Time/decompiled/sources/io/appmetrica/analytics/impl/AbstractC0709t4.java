package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0709t4 extends io.appmetrica.analytics.impl.Ad {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f6841f;

    public AbstractC0709t4(int i2, java.lang.String str, java.lang.Object obj, io.appmetrica.analytics.impl.InterfaceC0703so interfaceC0703so, io.appmetrica.analytics.impl.J2 j2) {
        super(i2, str, interfaceC0703so, j2);
        this.f6841f = obj;
    }

    @Override // io.appmetrica.analytics.impl.Ad, io.appmetrica.analytics.impl.InterfaceC0341eo
    public final void a(io.appmetrica.analytics.impl.Cdo cdo) {
        if (f()) {
            io.appmetrica.analytics.impl.J2 j2 = this.f4055d;
            int i2 = this.f4053b;
            io.appmetrica.analytics.impl.C0367fo a2 = j2.a(cdo, (io.appmetrica.analytics.impl.C0367fo) ((java.util.HashMap) cdo.f5757a.get(i2)).get(this.f4052a), this);
            if (a2 != null) {
                a(a2);
            }
        }
    }

    public abstract void a(io.appmetrica.analytics.impl.C0367fo c0367fo);

    public final java.lang.Object g() {
        return this.f6841f;
    }
}
