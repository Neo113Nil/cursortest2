package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b7 {
    public static final b7 b = new b7("COUNTDOWN_COMPLETE", 0);
    public static final b7 c = new b7("CTA_SHOW", 1);
    public static final /* synthetic */ b7[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        b7[] a2 = a();
        d = a2;
        e = EnumEntriesKt.enumEntries(a2);
    }

    public b7(String str, int i) {
    }

    public static final /* synthetic */ b7[] a() {
        return new b7[]{b, c};
    }

    public static b7 valueOf(String str) {
        return (b7) Enum.valueOf(b7.class, str);
    }

    public static b7[] values() {
        return (b7[]) d.clone();
    }
}
