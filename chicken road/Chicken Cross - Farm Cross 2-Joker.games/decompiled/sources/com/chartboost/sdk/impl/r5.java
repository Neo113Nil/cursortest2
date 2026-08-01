package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r5 {
    public static final r5 c = new r5("CTA_BUTTON", 0, "cta_button");
    public static final r5 d = new r5("CTA_HTML", 1, "cta_html");
    public static final r5 e = new r5("SKOVERLAY", 2, "skoverlay");
    public static final /* synthetic */ r5[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        r5[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
    }

    public r5(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ r5[] a() {
        return new r5[]{c, d, e};
    }

    public static r5 valueOf(String str) {
        return (r5) Enum.valueOf(r5.class, str);
    }

    public static r5[] values() {
        return (r5[]) f.clone();
    }

    public final String b() {
        return this.b;
    }
}
