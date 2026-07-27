package com.chartboost.sdk.impl;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class q4 {
    public static final q4 c = new q4(NativeAdContent.ViewTag.CTA, 0, "cta");
    public static final q4 d = new q4("BODY", 1, "body");
    public static final q4 e = new q4("VAST_COMPANION", 2, "vast_companion");
    public static final /* synthetic */ q4[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        q4[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
    }

    public q4(String str, int i, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ q4[] a() {
        return new q4[]{c, d, e};
    }

    public static q4 valueOf(String str) {
        return (q4) Enum.valueOf(q4.class, str);
    }

    public static q4[] values() {
        return (q4[]) f.clone();
    }

    public final String b() {
        return this.b;
    }
}
