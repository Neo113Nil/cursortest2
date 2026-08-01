package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x1 {
    public static final x1 b = new x1("FAILURE", 0);
    public static final x1 c = new x1("READY_TO_SHOW", 1);
    public static final x1 d = new x1("SUCCESS", 2);
    public static final /* synthetic */ x1[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        x1[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public x1(String str, int i) {
    }

    public static final /* synthetic */ x1[] a() {
        return new x1[]{b, c, d};
    }

    public static x1 valueOf(String str) {
        return (x1) Enum.valueOf(x1.class, str);
    }

    public static x1[] values() {
        return (x1[]) e.clone();
    }
}
