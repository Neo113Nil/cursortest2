package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rc {
    public static final rc c = new rc("INLINE", 0, "inline");
    public static final rc d = new rc("INTERSTITIAL", 1, "interstitial");
    public static final /* synthetic */ rc[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String b;

    static {
        rc[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public rc(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ rc[] a() {
        return new rc[]{c, d};
    }

    public static rc valueOf(String str) {
        return (rc) Enum.valueOf(rc.class, str);
    }

    public static rc[] values() {
        return (rc[]) e.clone();
    }

    public final String b() {
        return this.b;
    }
}
