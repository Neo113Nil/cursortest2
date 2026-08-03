package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Tg extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.IReporter f5025b;

    public Tg(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.IReporter iReporter) {
        super(x4);
        this.f5025b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        io.appmetrica.analytics.impl.Gc gc = (io.appmetrica.analytics.impl.Gc) io.appmetrica.analytics.impl.Gc.f4325c.get(p5.f4816d);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", gc.f4326a);
        hashMap.put("delivery_method", gc.f4327b);
        this.f5025b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
