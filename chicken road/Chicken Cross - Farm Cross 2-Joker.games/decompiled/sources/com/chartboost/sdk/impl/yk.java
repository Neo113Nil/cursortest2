package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yk {
    public static final yk b = new yk("INIT", 0);
    public static final yk c = new yk("STARTED", 1);
    public static final yk d = new yk("STARTED_VIDEO", 2);
    public static final yk e = new yk("IMPRESSED", 3);
    public static final yk f = new yk("STOPPED", 4);
    public static final /* synthetic */ yk[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        yk[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
    }

    public yk(String str, int i) {
    }

    public static final /* synthetic */ yk[] a() {
        return new yk[]{b, c, d, e, f};
    }

    public static yk valueOf(String str) {
        return (yk) Enum.valueOf(yk.class, str);
    }

    public static yk[] values() {
        return (yk[]) g.clone();
    }
}
