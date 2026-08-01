package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class F8 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ F8[] f6552a;

    static {
        F8[] f8Arr = {new F8("START", 0, "q0"), new F8("FIRST_QUARTILE", 1, "q1"), new F8("MIDPOINT", 2, "q2"), new F8("THIRD_QUARTILE", 3, "q3"), new F8("FOURTH_QUARTILE", 4, "q4")};
        f6552a = f8Arr;
        EnumEntriesKt.enumEntries(f8Arr);
    }

    public F8(String str, int i, String str2) {
    }

    public static F8 valueOf(String str) {
        return (F8) Enum.valueOf(F8.class, str);
    }

    public static F8[] values() {
        return (F8[]) f6552a.clone();
    }
}
