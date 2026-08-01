package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class uj {
    public static final uj b = new uj("START", 0);
    public static final uj c = new uj("RESUME", 1);
    public static final uj d = new uj("PAUSE", 2);
    public static final uj e = new uj("BUFFER_START", 3);
    public static final uj f = new uj("BUFFER_END", 4);
    public static final uj g = new uj("QUARTILE1", 5);
    public static final uj h = new uj("MIDPOINT", 6);
    public static final uj i = new uj("QUARTILE3", 7);
    public static final uj j = new uj("COMPLETED", 8);
    public static final uj k = new uj("SKIP", 9);
    public static final uj l = new uj("VOLUME_CHANGE", 10);
    public static final /* synthetic */ uj[] m;
    public static final /* synthetic */ EnumEntries n;

    static {
        uj[] a2 = a();
        m = a2;
        n = EnumEntriesKt.enumEntries(a2);
    }

    public uj(String str, int i2) {
    }

    public static final /* synthetic */ uj[] a() {
        return new uj[]{b, c, d, e, f, g, h, i, j, k, l};
    }

    public static uj valueOf(String str) {
        return (uj) Enum.valueOf(uj.class, str);
    }

    public static uj[] values() {
        return (uj[]) m.clone();
    }
}
