package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a f7441a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("STATIC_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 0);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("VAST_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 1);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("MRAID_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 2);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("NATIVE_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 3);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("VAST_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 4);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("MRAID_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 5);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a g = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("STATIC_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 6);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("VAST_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 7);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("MRAID_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 8);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a("STATIC_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 9);
    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a[] k;
    public static final /* synthetic */ kotlin.enums.EnumEntries l;

    static {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a[] b2 = b();
        k = b2;
        l = kotlin.enums.EnumEntriesKt.enumEntries(b2);
    }

    public a(java.lang.String str, int i2) {
    }

    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a[] b() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a[]{f7441a, b, c, d, e, f, g, h, i, j};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a> c() {
        return l;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a valueOf(java.lang.String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.class, str);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a[] values() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a[]) k.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public java.lang.String a() {
        return name();
    }
}
