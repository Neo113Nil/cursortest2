package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l f7451a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l("VAST_AD_EXOPLAYER_VIDEO_LAYER_ERROR", 0);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l("VAST_AD_EXOPLAYER_STYLED_PLAYER_VIEW_INFLATE_EXCEPTION_ERROR", 1);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l("VAST_AD_EXOPLAYER_SET_MEDIA_ITEM_EXCEPTION_ERROR", 2);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l("VAST_AD_EXOPLAYER_SET_MEDIA_FILE_NOT_EXISTS_ERROR", 3);
    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l[] e;
    public static final /* synthetic */ kotlin.enums.EnumEntries f;

    static {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l[] b2 = b();
        e = b2;
        f = kotlin.enums.EnumEntriesKt.enumEntries(b2);
    }

    public l(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l[] b() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l[]{f7451a, b, c, d};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l> c() {
        return f;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l valueOf(java.lang.String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.class, str);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l[] values() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l[]) e.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public java.lang.String a() {
        return name();
    }
}
