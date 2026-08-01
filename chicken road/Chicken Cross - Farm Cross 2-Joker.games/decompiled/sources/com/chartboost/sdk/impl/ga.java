package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ga {
    public static final ga c = new ga("LOADING", 0, 0);
    public static final ga d = new ga("LOADED", 1, 1);
    public static final ga e = new ga("DISPLAYED", 2, 2);
    public static final ga f = new ga("CACHED", 3, 3);
    public static final ga g = new ga("DISMISSING", 4, 4);
    public static final ga h = new ga("NONE", 5, 5);
    public static final /* synthetic */ ga[] i;
    public static final /* synthetic */ EnumEntries j;
    public final int b;

    static {
        ga[] a2 = a();
        i = a2;
        j = EnumEntriesKt.enumEntries(a2);
    }

    public ga(String str, int i2, int i3) {
        this.b = i3;
    }

    public static final /* synthetic */ ga[] a() {
        return new ga[]{c, d, e, f, g, h};
    }

    public static ga valueOf(String str) {
        return (ga) Enum.valueOf(ga.class, str);
    }

    public static ga[] values() {
        return (ga[]) i.clone();
    }
}
