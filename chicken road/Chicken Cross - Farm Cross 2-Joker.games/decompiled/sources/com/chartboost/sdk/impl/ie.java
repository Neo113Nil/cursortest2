package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ie {
    public static final ie b = new ie("PORTRAIT", 0);
    public static final ie c = new ie("LANDSCAPE", 1);
    public static final ie d = new ie("PORTRAIT_REVERSE", 2);
    public static final ie e = new ie("LANDSCAPE_REVERSE", 3);
    public static final ie f = new ie("PORTRAIT_LEFT", 4);
    public static final ie g = new ie("PORTRAIT_RIGHT", 5);
    public static final ie h = new ie("LANDSCAPE_LEFT", 6);
    public static final ie i = new ie("LANDSCAPE_RIGHT", 7);
    public static final /* synthetic */ ie[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        ie[] a2 = a();
        j = a2;
        k = EnumEntriesKt.enumEntries(a2);
    }

    public ie(String str, int i2) {
    }

    public static final /* synthetic */ ie[] a() {
        return new ie[]{b, c, d, e, f, g, h, i};
    }

    public static ie valueOf(String str) {
        return (ie) Enum.valueOf(ie.class, str);
    }

    public static ie[] values() {
        return (ie[]) j.clone();
    }
}
