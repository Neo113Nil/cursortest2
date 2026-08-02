package androidx.camera.core.impl;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC5128y {
    private static final /* synthetic */ EnumC5128y[] $VALUES;
    public static final EnumC5128y FIRED;
    public static final EnumC5128y NONE;
    public static final EnumC5128y READY;
    public static final EnumC5128y UNKNOWN;

    static {
        EnumC5128y enumC5128y = new EnumC5128y(FraudMonInfo.UNKNOWN, 0);
        UNKNOWN = enumC5128y;
        EnumC5128y enumC5128y2 = new EnumC5128y("NONE", 1);
        NONE = enumC5128y2;
        EnumC5128y enumC5128y3 = new EnumC5128y("READY", 2);
        READY = enumC5128y3;
        EnumC5128y enumC5128y4 = new EnumC5128y("FIRED", 3);
        FIRED = enumC5128y4;
        $VALUES = new EnumC5128y[]{enumC5128y, enumC5128y2, enumC5128y3, enumC5128y4};
    }

    private EnumC5128y() {
        throw null;
    }

    public static EnumC5128y valueOf(String str) {
        return (EnumC5128y) Enum.valueOf(EnumC5128y.class, str);
    }

    public static EnumC5128y[] values() {
        return (EnumC5128y[]) $VALUES.clone();
    }
}
