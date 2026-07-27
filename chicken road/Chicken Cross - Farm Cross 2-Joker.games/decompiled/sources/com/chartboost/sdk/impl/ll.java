package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ll {
    public static final ll b = new ll("MRAID_UNLOAD", 0);
    public static final /* synthetic */ ll[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        ll[] a2 = a();
        c = a2;
        d = EnumEntriesKt.enumEntries(a2);
    }

    public ll(String str, int i) {
    }

    public static final /* synthetic */ ll[] a() {
        return new ll[]{b};
    }

    public static ll valueOf(String str) {
        return (ll) Enum.valueOf(ll.class, str);
    }

    public static ll[] values() {
        return (ll[]) c.clone();
    }
}
