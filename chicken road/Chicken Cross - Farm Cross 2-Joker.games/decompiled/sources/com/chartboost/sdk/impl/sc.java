package com.chartboost.sdk.impl;

import com.unity3d.ads.BuildConfig;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class sc {
    public static final sc c = new sc("DEFAULT", 0, BuildConfig.FLAVOR);
    public static final sc d = new sc("EXPANDED", 1, "expanded");
    public static final sc e = new sc("HIDDEN", 2, "hidden");
    public static final sc f = new sc("LOADING", 3, "loading");
    public static final sc g = new sc("RESIZED", 4, "resized");
    public static final /* synthetic */ sc[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String b;

    static {
        sc[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
    }

    public sc(String str, int i2, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ sc[] a() {
        return new sc[]{c, d, e, f, g};
    }

    public static sc valueOf(String str) {
        return (sc) Enum.valueOf(sc.class, str);
    }

    public static sc[] values() {
        return (sc[]) h.clone();
    }

    public final String b() {
        return this.b;
    }
}
