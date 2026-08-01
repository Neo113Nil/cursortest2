package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class fa {
    public static final fa c = new fa("INTERSTITIAL", 0, 0);
    public static final fa d = new fa("INTERSTITIAL_VIDEO", 1, 1);
    public static final fa e = new fa("INTERSTITIAL_REWARD_VIDEO", 2, 2);
    public static final fa f = new fa(com.ironsource.mediationsdk.j.f8411a, 3, 3);
    public static final fa g = new fa("NONE", 4, 4);
    public static final /* synthetic */ fa[] h;
    public static final /* synthetic */ EnumEntries i;
    public final int b;

    static {
        fa[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
    }

    public fa(String str, int i2, int i3) {
        this.b = i3;
    }

    public static final /* synthetic */ fa[] a() {
        return new fa[]{c, d, e, f, g};
    }

    public static fa valueOf(String str) {
        return (fa) Enum.valueOf(fa.class, str);
    }

    public static fa[] values() {
        return (fa[]) h.clone();
    }
}
