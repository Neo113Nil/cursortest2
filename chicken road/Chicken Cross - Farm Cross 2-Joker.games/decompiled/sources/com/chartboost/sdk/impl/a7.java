package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a7 {
    public static final a7 c = new a7("CTA_SHOW", 0, "cta_show");
    public static final a7 d = new a7("COUNTDOWN_COMPLETE", 1, "countdown_complete");
    public static final /* synthetic */ a7[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String b;

    static {
        a7[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public a7(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ a7[] a() {
        return new a7[]{c, d};
    }

    public static a7 valueOf(String str) {
        return (a7) Enum.valueOf(a7.class, str);
    }

    public static a7[] values() {
        return (a7[]) e.clone();
    }

    public final String b() {
        return this.b;
    }
}
