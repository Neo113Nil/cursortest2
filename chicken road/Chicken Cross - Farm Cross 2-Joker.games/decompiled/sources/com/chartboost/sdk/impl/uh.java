package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class uh {
    public static final uh b = new uh("TEXT", 0);
    public static final uh c = new uh("ARC", 1);
    public static final /* synthetic */ uh[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        uh[] a2 = a();
        d = a2;
        e = EnumEntriesKt.enumEntries(a2);
    }

    public uh(String str, int i) {
    }

    public static final /* synthetic */ uh[] a() {
        return new uh[]{b, c};
    }

    public static uh valueOf(String str) {
        return (uh) Enum.valueOf(uh.class, str);
    }

    public static uh[] values() {
        return (uh[]) d.clone();
    }
}
