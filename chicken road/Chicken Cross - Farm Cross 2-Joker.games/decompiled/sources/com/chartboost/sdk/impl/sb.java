package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class sb {
    public static final sb c = new sb("VAST", 0, "vast");
    public static final sb d = new sb("HTML", 1, "html");
    public static final sb e = new sb("NATIVE", 2, "native");
    public static final /* synthetic */ sb[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        sb[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
    }

    public sb(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ sb[] a() {
        return new sb[]{c, d, e};
    }

    public static sb valueOf(String str) {
        return (sb) Enum.valueOf(sb.class, str);
    }

    public static sb[] values() {
        return (sb[]) f.clone();
    }

    public final String b() {
        return this.b;
    }
}
