package androidx.camera.core.impl;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC5116s {
    private static final /* synthetic */ EnumC5116s[] $VALUES;
    public static final EnumC5116s OFF;
    public static final EnumC5116s ON;
    public static final EnumC5116s ON_ALWAYS_FLASH;
    public static final EnumC5116s ON_AUTO_FLASH;
    public static final EnumC5116s ON_AUTO_FLASH_REDEYE;
    public static final EnumC5116s ON_EXTERNAL_FLASH;
    public static final EnumC5116s UNKNOWN;

    static {
        EnumC5116s enumC5116s = new EnumC5116s(FraudMonInfo.UNKNOWN, 0);
        UNKNOWN = enumC5116s;
        EnumC5116s enumC5116s2 = new EnumC5116s("OFF", 1);
        OFF = enumC5116s2;
        EnumC5116s enumC5116s3 = new EnumC5116s("ON", 2);
        ON = enumC5116s3;
        EnumC5116s enumC5116s4 = new EnumC5116s("ON_AUTO_FLASH", 3);
        ON_AUTO_FLASH = enumC5116s4;
        EnumC5116s enumC5116s5 = new EnumC5116s("ON_ALWAYS_FLASH", 4);
        ON_ALWAYS_FLASH = enumC5116s5;
        EnumC5116s enumC5116s6 = new EnumC5116s("ON_AUTO_FLASH_REDEYE", 5);
        ON_AUTO_FLASH_REDEYE = enumC5116s6;
        EnumC5116s enumC5116s7 = new EnumC5116s("ON_EXTERNAL_FLASH", 6);
        ON_EXTERNAL_FLASH = enumC5116s7;
        $VALUES = new EnumC5116s[]{enumC5116s, enumC5116s2, enumC5116s3, enumC5116s4, enumC5116s5, enumC5116s6, enumC5116s7};
    }

    private EnumC5116s() {
        throw null;
    }

    public static EnumC5116s valueOf(String str) {
        return (EnumC5116s) Enum.valueOf(EnumC5116s.class, str);
    }

    public static EnumC5116s[] values() {
        return (EnumC5116s[]) $VALUES.clone();
    }
}
