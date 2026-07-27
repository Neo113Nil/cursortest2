package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ke {
    public static final ke b = new ke("ENABLE_ORIENTATION_CHANGE", 0);
    public static final ke c = new ke("DISABLE_ORIENTATION_CHANGE", 1);
    public static final ke d = new ke("LANDSCAPE_ONLY", 2);
    public static final ke e = new ke("PORTRAIT_ONLY", 3);
    public static final /* synthetic */ ke[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ke[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
    }

    public ke(String str, int i) {
    }

    public static final /* synthetic */ ke[] a() {
        return new ke[]{b, c, d, e};
    }

    public static ke valueOf(String str) {
        return (ke) Enum.valueOf(ke.class, str);
    }

    public static ke[] values() {
        return (ke[]) f.clone();
    }
}
