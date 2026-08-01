package com.chartboost.sdk.impl;

import com.facebook.internal.AnalyticsEvents;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rd {
    public static final rd d = new rd("UNKNOWN", 0, 0, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
    public static final rd e = new rd("ETHERNET", 1, 1, "Ethernet");
    public static final rd f = new rd("WIFI", 2, 2, "WIFI");
    public static final rd g = new rd("CELLULAR_UNKNOWN", 3, 3, "Cellular_Unknown");
    public static final rd h = new rd("CELLULAR_2G", 4, 4, "Cellular_2G");
    public static final rd i = new rd("CELLULAR_3G", 5, 5, "Cellular_3G");
    public static final rd j = new rd("CELLULAR_4G", 6, 6, "Cellular_4G");
    public static final rd k = new rd("CELLULAR_5G", 7, 7, "Cellular_5G");
    public static final /* synthetic */ rd[] l;
    public static final /* synthetic */ EnumEntries m;
    public final int b;
    public final String c;

    static {
        rd[] a2 = a();
        l = a2;
        m = EnumEntriesKt.enumEntries(a2);
    }

    public rd(String str, int i2, int i3, String str2) {
        this.b = i3;
        this.c = str2;
    }

    public static final /* synthetic */ rd[] a() {
        return new rd[]{d, e, f, g, h, i, j, k};
    }

    public static rd valueOf(String str) {
        return (rd) Enum.valueOf(rd.class, str);
    }

    public static rd[] values() {
        return (rd[]) l.clone();
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }
}
