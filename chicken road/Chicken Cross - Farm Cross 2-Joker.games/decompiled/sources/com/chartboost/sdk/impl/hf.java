package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class hf {
    public static final hf b = new hf("FIRST", 0);
    public static final hf c = new hf("MIDDLE", 1);
    public static final hf d = new hf("THIRD", 2);
    public static final /* synthetic */ hf[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        hf[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public hf(String str, int i) {
    }

    public static final /* synthetic */ hf[] a() {
        return new hf[]{b, c, d};
    }

    public static hf valueOf(String str) {
        return (hf) Enum.valueOf(hf.class, str);
    }

    public static hf[] values() {
        return (hf[]) e.clone();
    }
}
