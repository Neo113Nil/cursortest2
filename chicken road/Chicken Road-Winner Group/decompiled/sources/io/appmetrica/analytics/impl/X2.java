package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class X2 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f6815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2 f6816b;

    public X2(Y2 y22, BatteryInfo batteryInfo) {
        this.f6816b = y22;
        this.f6815a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Z2 z22 = this.f6816b.f6847a;
        ChargeType chargeType = this.f6815a.chargeType;
        ChargeType chargeType2 = Z2.f6886d;
        synchronized (z22) {
            Iterator it = z22.f6889c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
