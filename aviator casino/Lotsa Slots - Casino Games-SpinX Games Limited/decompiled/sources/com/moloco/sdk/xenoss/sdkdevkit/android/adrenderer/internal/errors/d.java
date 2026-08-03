package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d f7443a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 0);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 1);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 2);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 3);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_WEBVIEW_INTERNAL_TIMEOUT_ERROR", 4);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 5);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d g = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_FULLSCREEN_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 6);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_FULLSCREEN_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 7);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_FULLSCREEN_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 8);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_FULLSCREEN_AD_ACTIVITY_SHOW_FAILED_ERROR", 9);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d k = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_BANNER_WEBVIEW_CLIENT_UNRECOVERABLE_ERROR", 10);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d l = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_BANNER_WEBVIEW_CLIENT_RENDER_PROCESS_GONE_ERROR", 11);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d m = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_BANNER_WEBVIEW_LOAD_DATA_WITH_BASE_URL_ERROR", 12);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d n = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d("MRAID_BANNER_WEBVIEW_PAGE_DIDNT_LOAD_ERROR", 13);
    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d[] o;
    public static final /* synthetic */ kotlin.enums.EnumEntries p;

    static {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d[] b2 = b();
        o = b2;
        p = kotlin.enums.EnumEntriesKt.enumEntries(b2);
    }

    public d(java.lang.String str, int i2) {
    }

    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d[] b() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d[]{f7443a, b, c, d, e, f, g, h, i, j, k, l, m, n};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> c() {
        return p;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d valueOf(java.lang.String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.class, str);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d[] values() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d[]) o.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public java.lang.String a() {
        return name();
    }
}
