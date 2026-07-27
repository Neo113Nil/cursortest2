package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ue {
    public static final ue c = new ue("IMMEDIATE", 0, 0);
    public static final ue d = new ue("HIGH", 1, 1);
    public static final ue e = new ue("NORMAL", 2, 2);
    public static final ue f = new ue("LOW", 3, 3);
    public static final /* synthetic */ ue[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int b;

    static {
        ue[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
    }

    public ue(String str, int i, int i2) {
        this.b = i2;
    }

    public static final /* synthetic */ ue[] a() {
        return new ue[]{c, d, e, f};
    }

    public static ue valueOf(String str) {
        return (ue) Enum.valueOf(ue.class, str);
    }

    public static ue[] values() {
        return (ue[]) g.clone();
    }

    public final int b() {
        return this.b;
    }
}
