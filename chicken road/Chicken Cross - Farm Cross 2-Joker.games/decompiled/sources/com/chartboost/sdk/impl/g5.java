package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g5 {
    public static final g5 c = new g5("CONNECTION_UNKNOWN", 0, -1);
    public static final g5 d = new g5("CONNECTION_ERROR", 1, 0);
    public static final g5 e = new g5("CONNECTION_WIFI", 2, 1);
    public static final g5 f = new g5("CONNECTION_MOBILE", 3, 2);
    public static final /* synthetic */ g5[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int b;

    static {
        g5[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
    }

    public g5(String str, int i, int i2) {
        this.b = i2;
    }

    public static final /* synthetic */ g5[] a() {
        return new g5[]{c, d, e, f};
    }

    public static g5 valueOf(String str) {
        return (g5) Enum.valueOf(g5.class, str);
    }

    public static g5[] values() {
        return (g5[]) g.clone();
    }

    public final int b() {
        return this.b;
    }
}
