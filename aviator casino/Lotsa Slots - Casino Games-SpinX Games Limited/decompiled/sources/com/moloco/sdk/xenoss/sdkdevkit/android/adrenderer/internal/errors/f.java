package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* renamed from: a, reason: collision with root package name */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f f7445a = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f("NATIVE_AD_ORTB_RESPONSE_NULL_ERROR", 0);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f("NATIVE_AD_IMAGE_ASSET_MEDIA_FETCH_ERROR", 1);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f("NATIVE_AD_IMAGE_PREPARE_ASSET_UNKNOWN_ERROR", 2);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f("NATIVE_AD_VIDEO_ASSET_MEDIA_NOT_ENOUGH_ERROR", 3);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f("NATIVE_AD_VIDEO_ASSET_MEDIA_FETCH_ERROR", 4);
    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f[] f;
    public static final /* synthetic */ kotlin.enums.EnumEntries g;

    static {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f[] b2 = b();
        f = b2;
        g = kotlin.enums.EnumEntriesKt.enumEntries(b2);
    }

    public f(java.lang.String str, int i) {
    }

    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f[] b() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f[]{f7445a, b, c, d, e};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f> c() {
        return g;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f valueOf(java.lang.String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.class, str);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f[] values() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f[]) f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public java.lang.String a() {
        return name();
    }
}
