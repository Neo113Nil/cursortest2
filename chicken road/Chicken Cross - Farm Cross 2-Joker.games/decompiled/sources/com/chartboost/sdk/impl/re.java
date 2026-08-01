package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class re {
    public static final re c = new re("NONE", 0, 0);
    public static final re d = new re("IDLE", 1, 1);
    public static final re e = new re("PLAYING", 2, 2);
    public static final re f = new re("PAUSED", 3, 3);
    public static final /* synthetic */ re[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int b;

    static {
        re[] a2 = a();
        g = a2;
        h = EnumEntriesKt.enumEntries(a2);
    }

    public re(String str, int i, int i2) {
        this.b = i2;
    }

    public static final /* synthetic */ re[] a() {
        return new re[]{c, d, e, f};
    }

    public static re valueOf(String str) {
        return (re) Enum.valueOf(re.class, str);
    }

    public static re[] values() {
        return (re[]) g.clone();
    }
}
