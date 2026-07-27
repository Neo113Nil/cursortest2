package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ne {
    public static final ne c = new ne("LEGACY", 0, "legacy");
    public static final ne d = new ne("PROGRESSIVE", 1, "progressive");
    public static final /* synthetic */ ne[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String b;

    static {
        ne[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public ne(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ ne[] a() {
        return new ne[]{c, d};
    }

    public static ne valueOf(String str) {
        return (ne) Enum.valueOf(ne.class, str);
    }

    public static ne[] values() {
        return (ne[]) e.clone();
    }

    public final String b() {
        return this.b;
    }
}
