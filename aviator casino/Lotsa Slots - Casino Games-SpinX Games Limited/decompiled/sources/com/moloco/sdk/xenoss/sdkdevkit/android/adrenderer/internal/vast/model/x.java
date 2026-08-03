package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x("XmlParsing", 0, 100);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f, 1, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x("WrapperTimeout", 2, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x e = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x("WrapperLimit", 3, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x("WrapperNoAds", 4, 303);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x g = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q, 5, 400);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x h = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x("LinearFileNotFound", 6, 401);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x i = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x("LinearNotSupportedMedia", 7, 403);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x j = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, 8, 600);
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x k = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x("Undefined", 9, androidx.datastore.preferences.protobuf.DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x[] l;
    public static final /* synthetic */ kotlin.enums.EnumEntries m;

    /* renamed from: a, reason: collision with root package name */
    public final int f7790a;

    static {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x[] a2 = a();
        l = a2;
        m = kotlin.enums.EnumEntriesKt.enumEntries(a2);
    }

    public x(java.lang.String str, int i2, int i3) {
        this.f7790a = i3;
    }

    public static final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x[] a() {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x[]{b, c, d, e, f, g, h, i, j, k};
    }

    public static kotlin.enums.EnumEntries<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x> b() {
        return m;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x valueOf(java.lang.String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x) java.lang.Enum.valueOf(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x.class, str);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x[] values() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x[]) l.clone();
    }

    public final int c() {
        return this.f7790a;
    }
}
