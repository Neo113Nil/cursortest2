package androidx.camera.core.impl;

import spay.sdk.domain.model.FraudMonInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC5122v {
    private static final /* synthetic */ EnumC5122v[] $VALUES;
    public static final EnumC5122v INACTIVE;
    public static final EnumC5122v LOCKED_FOCUSED;
    public static final EnumC5122v LOCKED_NOT_FOCUSED;
    public static final EnumC5122v PASSIVE_FOCUSED;
    public static final EnumC5122v PASSIVE_NOT_FOCUSED;
    public static final EnumC5122v SCANNING;
    public static final EnumC5122v UNKNOWN;

    static {
        EnumC5122v enumC5122v = new EnumC5122v(FraudMonInfo.UNKNOWN, 0);
        UNKNOWN = enumC5122v;
        EnumC5122v enumC5122v2 = new EnumC5122v("INACTIVE", 1);
        INACTIVE = enumC5122v2;
        EnumC5122v enumC5122v3 = new EnumC5122v("SCANNING", 2);
        SCANNING = enumC5122v3;
        EnumC5122v enumC5122v4 = new EnumC5122v("PASSIVE_FOCUSED", 3);
        PASSIVE_FOCUSED = enumC5122v4;
        EnumC5122v enumC5122v5 = new EnumC5122v("PASSIVE_NOT_FOCUSED", 4);
        PASSIVE_NOT_FOCUSED = enumC5122v5;
        EnumC5122v enumC5122v6 = new EnumC5122v("LOCKED_FOCUSED", 5);
        LOCKED_FOCUSED = enumC5122v6;
        EnumC5122v enumC5122v7 = new EnumC5122v("LOCKED_NOT_FOCUSED", 6);
        LOCKED_NOT_FOCUSED = enumC5122v7;
        $VALUES = new EnumC5122v[]{enumC5122v, enumC5122v2, enumC5122v3, enumC5122v4, enumC5122v5, enumC5122v6, enumC5122v7};
    }

    private EnumC5122v() {
        throw null;
    }

    public static EnumC5122v valueOf(String str) {
        return (EnumC5122v) Enum.valueOf(EnumC5122v.class, str);
    }

    public static EnumC5122v[] values() {
        return (EnumC5122v[]) $VALUES.clone();
    }
}
