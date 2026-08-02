package androidx.camera.core.impl;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC5120u {
    private static final /* synthetic */ EnumC5120u[] $VALUES;
    public static final EnumC5120u OFF;
    public static final EnumC5120u ON_CONTINUOUS_AUTO;
    public static final EnumC5120u ON_MANUAL_AUTO;
    public static final EnumC5120u UNKNOWN;

    static {
        EnumC5120u enumC5120u = new EnumC5120u(FraudMonInfo.UNKNOWN, 0);
        UNKNOWN = enumC5120u;
        EnumC5120u enumC5120u2 = new EnumC5120u("OFF", 1);
        OFF = enumC5120u2;
        EnumC5120u enumC5120u3 = new EnumC5120u("ON_MANUAL_AUTO", 2);
        ON_MANUAL_AUTO = enumC5120u3;
        EnumC5120u enumC5120u4 = new EnumC5120u("ON_CONTINUOUS_AUTO", 3);
        ON_CONTINUOUS_AUTO = enumC5120u4;
        $VALUES = new EnumC5120u[]{enumC5120u, enumC5120u2, enumC5120u3, enumC5120u4};
    }

    private EnumC5120u() {
        throw null;
    }

    public static EnumC5120u valueOf(String str) {
        return (EnumC5120u) Enum.valueOf(EnumC5120u.class, str);
    }

    public static EnumC5120u[] values() {
        return (EnumC5120u[]) $VALUES.clone();
    }
}
