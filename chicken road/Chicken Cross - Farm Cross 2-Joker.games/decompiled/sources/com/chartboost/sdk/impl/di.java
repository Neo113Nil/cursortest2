package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class di {
    public static final di b = new di("SUCCESS", 0);
    public static final di c = new di("NETWORK_FAILURE", 1);
    public static final di d = new di("INVALID_REQUEST", 2);
    public static final /* synthetic */ di[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        di[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public di(String str, int i) {
    }

    public static final /* synthetic */ di[] a() {
        return new di[]{b, c, d};
    }

    public static di valueOf(String str) {
        return (di) Enum.valueOf(di.class, str);
    }

    public static di[] values() {
        return (di[]) e.clone();
    }
}
