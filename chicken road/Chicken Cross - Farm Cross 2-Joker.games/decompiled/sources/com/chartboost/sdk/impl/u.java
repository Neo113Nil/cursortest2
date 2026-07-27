package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class u {
    public static final u b = new u(com.ironsource.mediationsdk.j.f8411a, 0);
    public static final u c = new u("INTERSTITIAL", 1);
    public static final u d = new u("REWARDED", 2);
    public static final /* synthetic */ u[] e;
    public static final /* synthetic */ EnumEntries f;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5021a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5021a = iArr;
        }
    }

    static {
        u[] a2 = a();
        e = a2;
        f = EnumEntriesKt.enumEntries(a2);
    }

    public u(String str, int i) {
    }

    public static final /* synthetic */ u[] a() {
        return new u[]{b, c, d};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) e.clone();
    }

    public final boolean b() {
        return a.f5021a[ordinal()] == 1;
    }
}
