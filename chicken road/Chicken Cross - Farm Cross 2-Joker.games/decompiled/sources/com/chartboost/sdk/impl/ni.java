package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ni {
    public static final ni c = new ni("TRACKING_UNKNOWN", 0, -1);
    public static final ni d = new ni("TRACKING_ENABLED", 1, 0);
    public static final ni e = new ni("TRACKING_LIMITED", 2, 1);
    public static final /* synthetic */ ni[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int b;

    static {
        ni[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
    }

    public ni(String str, int i, int i2) {
        this.b = i2;
    }

    public static final /* synthetic */ ni[] a() {
        return new ni[]{c, d, e};
    }

    public static ni valueOf(String str) {
        return (ni) Enum.valueOf(ni.class, str);
    }

    public static ni[] values() {
        return (ni[]) f.clone();
    }

    public final int b() {
        return this.b;
    }
}
