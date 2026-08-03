package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

/* loaded from: classes5.dex */
public final class B {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7766a;
    public final java.lang.Boolean b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d c;
    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> d;
    public final java.util.List<java.lang.String> e;
    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> f;

    public B(java.lang.String vastAdTagUrl, java.lang.Boolean bool, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d dVar, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> impressions, java.util.List<java.lang.String> errorUrls, java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> creatives) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastAdTagUrl, "vastAdTagUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressions, "impressions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorUrls, "errorUrls");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creatives, "creatives");
        this.f7766a = vastAdTagUrl;
        this.b = bool;
        this.c = dVar;
        this.d = impressions;
        this.e = errorUrls;
        this.f = creatives;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d a() {
        return this.c;
    }

    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> b() {
        return this.f;
    }

    public final java.util.List<java.lang.String> c() {
        return this.e;
    }

    public final java.lang.Boolean d() {
        return this.b;
    }

    public final java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> e() {
        return this.d;
    }

    public final java.lang.String f() {
        return this.f7766a;
    }
}
