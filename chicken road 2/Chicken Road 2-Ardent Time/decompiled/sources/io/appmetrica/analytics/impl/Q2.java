package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Q2 implements io.appmetrica.analytics.coreapi.internal.backport.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.R2 f4858a;

    public Q2(io.appmetrica.analytics.impl.R2 r2) {
        this.f4858a = r2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo batteryInfo = this.f4858a.f4886b;
        io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f4858a.getClass();
        io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo a2 = io.appmetrica.analytics.impl.R2.a(intent);
        this.f4858a.f4886b = a2;
        if (chargeType != a2.chargeType) {
            this.f4858a.f4885a.execute(new io.appmetrica.analytics.impl.P2(this, a2));
        }
    }
}
