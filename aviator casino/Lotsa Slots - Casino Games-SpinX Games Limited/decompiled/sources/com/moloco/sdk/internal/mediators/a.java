package com.moloco.sdk.internal.mediators;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.internal.mediators.a f7003a = new com.moloco.sdk.internal.mediators.a("MAX", 0);
    public static final com.moloco.sdk.internal.mediators.a b = new com.moloco.sdk.internal.mediators.a("LevelPlay", 1);
    public static final com.moloco.sdk.internal.mediators.a c = new com.moloco.sdk.internal.mediators.a("X3MADS", 2);
    public static final com.moloco.sdk.internal.mediators.a d = new com.moloco.sdk.internal.mediators.a(com.google.ads.mediation.moloco.MolocoMediationAdapter.MEDIATION_PLATFORM_NAME, 3);
    public static final com.moloco.sdk.internal.mediators.a e = new com.moloco.sdk.internal.mediators.a("Custom_MAX", 4);
    public static final com.moloco.sdk.internal.mediators.a f = new com.moloco.sdk.internal.mediators.a("Custom_LevelPlay", 5);
    public static final com.moloco.sdk.internal.mediators.a g = new com.moloco.sdk.internal.mediators.a("Custom_AdMob", 6);
    public static final /* synthetic */ com.moloco.sdk.internal.mediators.a[] h;
    public static final /* synthetic */ kotlin.enums.EnumEntries i;

    static {
        com.moloco.sdk.internal.mediators.a[] a2 = a();
        h = a2;
        i = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public a(java.lang.String str, int i2) {
    }

    public static final /* synthetic */ com.moloco.sdk.internal.mediators.a[] a() {
        return new com.moloco.sdk.internal.mediators.a[]{f7003a, b, c, d, e, f, g};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.internal.mediators.a> b() {
        return i;
    }

    public static com.moloco.sdk.internal.mediators.a valueOf(java.lang.String str) {
        return (com.moloco.sdk.internal.mediators.a) java.lang.Enum.valueOf(com.moloco.sdk.internal.mediators.a.class, str);
    }

    public static com.moloco.sdk.internal.mediators.a[] values() {
        return (com.moloco.sdk.internal.mediators.a[]) h.clone();
    }
}
