package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

/* loaded from: classes.dex */
public class BatteryInfo {
    public final java.lang.Integer batteryLevel;
    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType chargeType;

    public BatteryInfo(java.lang.Integer num, io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType chargeType) {
        this.batteryLevel = num;
        this.chargeType = chargeType;
    }
}
