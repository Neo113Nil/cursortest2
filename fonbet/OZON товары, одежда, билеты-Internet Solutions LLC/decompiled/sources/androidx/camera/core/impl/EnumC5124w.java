package androidx.camera.core.impl;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC5124w {
    private static final /* synthetic */ EnumC5124w[] $VALUES;
    public static final EnumC5124w AUTO;
    public static final EnumC5124w CLOUDY_DAYLIGHT;
    public static final EnumC5124w DAYLIGHT;
    public static final EnumC5124w FLUORESCENT;
    public static final EnumC5124w INCANDESCENT;
    public static final EnumC5124w OFF;
    public static final EnumC5124w SHADE;
    public static final EnumC5124w TWILIGHT;
    public static final EnumC5124w UNKNOWN;
    public static final EnumC5124w WARM_FLUORESCENT;

    static {
        EnumC5124w enumC5124w = new EnumC5124w(FraudMonInfo.UNKNOWN, 0);
        UNKNOWN = enumC5124w;
        EnumC5124w enumC5124w2 = new EnumC5124w("OFF", 1);
        OFF = enumC5124w2;
        EnumC5124w enumC5124w3 = new EnumC5124w("AUTO", 2);
        AUTO = enumC5124w3;
        EnumC5124w enumC5124w4 = new EnumC5124w("INCANDESCENT", 3);
        INCANDESCENT = enumC5124w4;
        EnumC5124w enumC5124w5 = new EnumC5124w("FLUORESCENT", 4);
        FLUORESCENT = enumC5124w5;
        EnumC5124w enumC5124w6 = new EnumC5124w("WARM_FLUORESCENT", 5);
        WARM_FLUORESCENT = enumC5124w6;
        EnumC5124w enumC5124w7 = new EnumC5124w("DAYLIGHT", 6);
        DAYLIGHT = enumC5124w7;
        EnumC5124w enumC5124w8 = new EnumC5124w("CLOUDY_DAYLIGHT", 7);
        CLOUDY_DAYLIGHT = enumC5124w8;
        EnumC5124w enumC5124w9 = new EnumC5124w("TWILIGHT", 8);
        TWILIGHT = enumC5124w9;
        EnumC5124w enumC5124w10 = new EnumC5124w("SHADE", 9);
        SHADE = enumC5124w10;
        $VALUES = new EnumC5124w[]{enumC5124w, enumC5124w2, enumC5124w3, enumC5124w4, enumC5124w5, enumC5124w6, enumC5124w7, enumC5124w8, enumC5124w9, enumC5124w10};
    }

    private EnumC5124w() {
        throw null;
    }

    public static EnumC5124w valueOf(String str) {
        return (EnumC5124w) Enum.valueOf(EnumC5124w.class, str);
    }

    public static EnumC5124w[] values() {
        return (EnumC5124w[]) $VALUES.clone();
    }
}
