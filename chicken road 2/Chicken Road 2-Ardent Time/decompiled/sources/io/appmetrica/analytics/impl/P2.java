package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class P2 extends io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo f4806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.Q2 f4807b;

    public P2(io.appmetrica.analytics.impl.Q2 q2, io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo batteryInfo) {
        this.f4807b = q2;
        this.f4806a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        io.appmetrica.analytics.impl.R2 r2 = this.f4807b.f4858a;
        io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType chargeType = this.f4806a.chargeType;
        io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType chargeType2 = io.appmetrica.analytics.impl.R2.f4884d;
        synchronized (r2) {
            java.util.Iterator it = r2.f4887c.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
