package com.moloco.sdk.internal.publisher;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f10688a = new t(com.ironsource.mediationsdk.j.f8411a, 0);
    public static final t b = new t("BANNER_TABLET", 1);
    public static final t c = new t("MREC", 2);
    public static final t d = new t("INLINE_ADAPTIVE_BANNER", 3);
    public static final t e = new t("ANCHORED_ADAPTIVE_BANNER", 4);
    public static final t f = new t("NATIVE_AD_MEDIATION", 5);
    public static final t g = new t("NATIVE_BANNER", 6);
    public static final t h = new t("INTERSTITIAL", 7);
    public static final t i = new t("REWARDED", 8);
    public static final /* synthetic */ t[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        t[] a2 = a();
        j = a2;
        k = EnumEntriesKt.enumEntries(a2);
    }

    public t(String str, int i2) {
    }

    public static final /* synthetic */ t[] a() {
        return new t[]{f10688a, b, c, d, e, f, g, h, i};
    }

    public static EnumEntries<t> b() {
        return k;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) j.clone();
    }
}
