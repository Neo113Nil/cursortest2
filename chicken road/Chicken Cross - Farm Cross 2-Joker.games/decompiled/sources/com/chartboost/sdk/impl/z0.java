package com.chartboost.sdk.impl;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z0 {
    public static final z0 b = new z0("INFO", 0);
    public static final z0 c = new z0("VOLUME", 1);
    public static final z0 d = new z0("CLOSE", 2);
    public static final z0 e = new z0("SKIP", 3);
    public static final z0 f = new z0("TIMER", 4);
    public static final z0 g = new z0(NativeAdContent.ViewTag.CTA, 5);
    public static final z0 h = new z0("REWARD", 6);
    public static final /* synthetic */ z0[] i;
    public static final /* synthetic */ EnumEntries j;

    static {
        z0[] a2 = a();
        i = a2;
        j = EnumEntriesKt.enumEntries(a2);
    }

    public z0(String str, int i2) {
    }

    public static final /* synthetic */ z0[] a() {
        return new z0[]{b, c, d, e, f, g, h};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) i.clone();
    }
}
