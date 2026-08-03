package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class R2 implements io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider {

    /* renamed from: d, reason: collision with root package name */
    public static final io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType f4884d = io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType.UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor f4885a;

    /* renamed from: b, reason: collision with root package name */
    public volatile io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo f4886b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f4887c = new java.util.ArrayList();

    public R2(io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor iCommonExecutor, io.appmetrica.analytics.impl.O2 o2) {
        io.appmetrica.analytics.impl.Q2 q2 = new io.appmetrica.analytics.impl.Q2(this);
        this.f4885a = iCommonExecutor;
        this.f4886b = a(o2.a(q2));
    }

    public static io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo a(android.content.Intent intent) {
        io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType chargeType = f4884d;
        java.lang.Integer num = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                num = java.lang.Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType.NONE;
            if (intExtra3 == 1) {
                chargeType = io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType.AC;
            } else if (intExtra3 == 2) {
                chargeType = io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType.USB;
            } else if (intExtra3 == 4) {
                chargeType = io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType.WIRELESS;
            }
        }
        return new io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo(num, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final java.lang.Integer getBatteryLevel() {
        io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo batteryInfo = this.f4886b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType getChargeType() {
        io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo batteryInfo = this.f4886b;
        return batteryInfo == null ? io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType.UNKNOWN : batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f4887c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
