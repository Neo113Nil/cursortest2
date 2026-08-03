package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

/* loaded from: classes.dex */
public interface ChargeTypeProvider {
    java.lang.Integer getBatteryLevel();

    io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType getChargeType();

    void registerChargeTypeListener(io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener chargeTypeChangeListener);
}
