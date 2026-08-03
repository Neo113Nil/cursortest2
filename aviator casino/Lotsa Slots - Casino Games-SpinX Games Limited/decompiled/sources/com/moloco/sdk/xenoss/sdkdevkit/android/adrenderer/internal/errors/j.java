package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j f7449a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j("STATIC_FULLSCREEN_AD_UNKNOWN_ERROR", 0);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j("STATIC_FULLSCREEN_AD_WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j("STATIC_FULLSCREEN_AD_WEBVIEW_RECEIVED_ERROR", 2);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j("STATIC_FULLSCREEN_AD_WEBVIEW_RENDER_PROCESS_GONE_ERROR", 3);
    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j[] e;
    public static final /* synthetic */ kotlin.enums.EnumEntries f;

    static {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j[] b2 = b();
        e = b2;
        f = kotlin.enums.EnumEntriesKt.enumEntries(b2);
    }

    public j(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j[] b() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j[]{f7449a, b, c, d};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j> c() {
        return f;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j valueOf(java.lang.String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j.class, str);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j[] values() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.j[]) e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public java.lang.String a() {
        return name();
    }
}
