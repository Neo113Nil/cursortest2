package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class t {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t("Loading", 0, "loading");
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t(androidx.webkit.Profile.DEFAULT_PROFILE_NAME, 1, com.unity3d.ads.BuildConfig.FLAVOR);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t("Resized", 2, "resized");
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t("Expanded", 3, "expanded");
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t("Hidden", 4, "hidden");
    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t[] g;
    public static final /* synthetic */ kotlin.enums.EnumEntries h;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7522a;

    static {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t[] a2 = a();
        g = a2;
        h = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public t(java.lang.String str, int i, java.lang.String str2) {
        this.f7522a = str2;
    }

    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t[] a() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t[]{b, c, d, e, f};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t> b() {
        return h;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t valueOf(java.lang.String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t.class, str);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t[] values() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t[]) g.clone();
    }

    public final java.lang.String c() {
        return this.f7522a;
    }
}
