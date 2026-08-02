package androidx.camera.core.impl;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC5118t {
    private static final /* synthetic */ EnumC5118t[] $VALUES;
    public static final EnumC5118t CONVERGED;
    public static final EnumC5118t FLASH_REQUIRED;
    public static final EnumC5118t INACTIVE;
    public static final EnumC5118t LOCKED;
    public static final EnumC5118t SEARCHING;
    public static final EnumC5118t UNKNOWN;

    static {
        EnumC5118t enumC5118t = new EnumC5118t(FraudMonInfo.UNKNOWN, 0);
        UNKNOWN = enumC5118t;
        EnumC5118t enumC5118t2 = new EnumC5118t("INACTIVE", 1);
        INACTIVE = enumC5118t2;
        EnumC5118t enumC5118t3 = new EnumC5118t("SEARCHING", 2);
        SEARCHING = enumC5118t3;
        EnumC5118t enumC5118t4 = new EnumC5118t("FLASH_REQUIRED", 3);
        FLASH_REQUIRED = enumC5118t4;
        EnumC5118t enumC5118t5 = new EnumC5118t("CONVERGED", 4);
        CONVERGED = enumC5118t5;
        EnumC5118t enumC5118t6 = new EnumC5118t("LOCKED", 5);
        LOCKED = enumC5118t6;
        $VALUES = new EnumC5118t[]{enumC5118t, enumC5118t2, enumC5118t3, enumC5118t4, enumC5118t5, enumC5118t6};
    }

    private EnumC5118t() {
        throw null;
    }

    public static EnumC5118t valueOf(String str) {
        return (EnumC5118t) Enum.valueOf(EnumC5118t.class, str);
    }

    public static EnumC5118t[] values() {
        return (EnumC5118t[]) $VALUES.clone();
    }
}
