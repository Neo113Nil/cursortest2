package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gb implements io.appmetrica.analytics.impl.InterfaceC0448j2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0528m4 f4324a;

    public Gb(io.appmetrica.analytics.impl.C0528m4 c0528m4) {
        this.f4324a = c0528m4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0448j2
    public final io.appmetrica.analytics.impl.C0367fo a(io.appmetrica.analytics.impl.Cdo cdo, io.appmetrica.analytics.impl.C0367fo c0367fo) {
        int i2 = cdo.f5758b;
        int i3 = this.f4324a.f6388a;
        if (i2 == i3) {
            if (((io.appmetrica.analytics.impl.C0367fo) ((java.util.HashMap) cdo.f5757a.get(c0367fo.f5945b)).get(new java.lang.String(c0367fo.f5944a))) != null) {
                ((java.util.HashMap) cdo.f5757a.get(c0367fo.f5945b)).put(new java.lang.String(c0367fo.f5944a), c0367fo);
            }
        } else if (i2 < i3) {
            ((java.util.HashMap) cdo.f5757a.get(c0367fo.f5945b)).put(new java.lang.String(c0367fo.f5944a), c0367fo);
            cdo.f5758b++;
        }
        return c0367fo;
    }
}
