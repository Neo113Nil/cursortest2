package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

/* loaded from: classes.dex */
public enum ChargeType {
    UNKNOWN(-1),
    NONE(0),
    USB(1),
    WIRELESS(2),
    AC(3);


    /* renamed from: a, reason: collision with root package name */
    private final int f3697a;

    ChargeType(int i2) {
        this.f3697a = i2;
    }

    public static io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType fromId(java.lang.Integer num) {
        if (num != null) {
            for (io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType chargeType : values()) {
                if (chargeType.getId() == num.intValue()) {
                    return chargeType;
                }
            }
        }
        return UNKNOWN;
    }

    public int getId() {
        return this.f3697a;
    }
}
