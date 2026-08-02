package androidx.camera.core.impl;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC5126x {
    private static final /* synthetic */ EnumC5126x[] $VALUES;
    public static final EnumC5126x CONVERGED;
    public static final EnumC5126x INACTIVE;
    public static final EnumC5126x LOCKED;
    public static final EnumC5126x METERING;
    public static final EnumC5126x UNKNOWN;

    static {
        EnumC5126x enumC5126x = new EnumC5126x(FraudMonInfo.UNKNOWN, 0);
        UNKNOWN = enumC5126x;
        EnumC5126x enumC5126x2 = new EnumC5126x("INACTIVE", 1);
        INACTIVE = enumC5126x2;
        EnumC5126x enumC5126x3 = new EnumC5126x("METERING", 2);
        METERING = enumC5126x3;
        EnumC5126x enumC5126x4 = new EnumC5126x("CONVERGED", 3);
        CONVERGED = enumC5126x4;
        EnumC5126x enumC5126x5 = new EnumC5126x("LOCKED", 4);
        LOCKED = enumC5126x5;
        $VALUES = new EnumC5126x[]{enumC5126x, enumC5126x2, enumC5126x3, enumC5126x4, enumC5126x5};
    }

    private EnumC5126x() {
        throw null;
    }

    public static EnumC5126x valueOf(String str) {
        return (EnumC5126x) Enum.valueOf(EnumC5126x.class, str);
    }

    public static EnumC5126x[] values() {
        return (EnumC5126x[]) $VALUES.clone();
    }
}
