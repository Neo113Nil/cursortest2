package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class gh {
    public static final gh b = new gh("SKIP", 0);
    public static final gh c = new gh("CLOSE", 1);
    public static final gh d = new gh("PROGRAMMATIC_DISMISS", 2);
    public static final gh e = new gh("DESTROY", 3);
    public static final gh f = new gh("AUTO_ADVANCE", 4);
    public static final gh g = new gh("AD_COMPLETE", 5);
    public static final gh h = new gh("FAILURE", 6);
    public static final gh i = new gh("UNLOAD", 7);
    public static final /* synthetic */ gh[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        gh[] a2 = a();
        j = a2;
        k = EnumEntriesKt.enumEntries(a2);
    }

    public gh(String str, int i2) {
    }

    public static final /* synthetic */ gh[] a() {
        return new gh[]{b, c, d, e, f, g, h, i};
    }

    public static gh valueOf(String str) {
        return (gh) Enum.valueOf(gh.class, str);
    }

    public static gh[] values() {
        return (gh[]) j.clone();
    }
}
