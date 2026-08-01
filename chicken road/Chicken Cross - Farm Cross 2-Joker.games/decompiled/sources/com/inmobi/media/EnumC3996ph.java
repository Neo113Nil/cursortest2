package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.inmobi.media.ph, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC3996ph {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3996ph f7306a;
    public static final EnumC3996ph b;
    public static final EnumC3996ph c;
    public static final /* synthetic */ EnumC3996ph[] d;

    static {
        EnumC3996ph enumC3996ph = new EnumC3996ph("RESERVED", 0);
        f7306a = enumC3996ph;
        EnumC3996ph enumC3996ph2 = new EnumC3996ph("REJECTED", 1);
        b = enumC3996ph2;
        EnumC3996ph enumC3996ph3 = new EnumC3996ph("DUPLICATE", 2);
        c = enumC3996ph3;
        EnumC3996ph[] enumC3996phArr = {enumC3996ph, enumC3996ph2, enumC3996ph3};
        d = enumC3996phArr;
        EnumEntriesKt.enumEntries(enumC3996phArr);
    }

    public EnumC3996ph(String str, int i) {
    }

    public static EnumC3996ph valueOf(String str) {
        return (EnumC3996ph) Enum.valueOf(EnumC3996ph.class, str);
    }

    public static EnumC3996ph[] values() {
        return (EnumC3996ph[]) d.clone();
    }
}
