package com.google.ads.mediation.fyber;

/* compiled from: FyberFactory.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/google/ads/mediation/fyber/FyberFactory;", "", "<init>", "()V", "createRewardedAdSpot", "Lcom/fyber/inneractive/sdk/external/InneractiveAdSpot;", "createInneractiveFullscreenUnitController", "Lcom/fyber/inneractive/sdk/external/InneractiveFullscreenUnitController;", "createNativeAdUnitController", "Lcom/fyber/inneractive/sdk/external/NativeAdUnitController;", "createNativeAdVideoContentController", "Lcom/fyber/inneractive/sdk/external/NativeAdVideoContentController;", "dtexchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FyberFactory {
    public static final com.google.ads.mediation.fyber.FyberFactory INSTANCE = new com.google.ads.mediation.fyber.FyberFactory();

    private FyberFactory() {
    }

    @kotlin.jvm.JvmStatic
    public static final com.fyber.inneractive.sdk.external.InneractiveAdSpot createRewardedAdSpot() {
        com.fyber.inneractive.sdk.external.InneractiveAdSpot createSpot = com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.get().createSpot();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createSpot, "createSpot(...)");
        return createSpot;
    }

    @kotlin.jvm.JvmStatic
    public static final com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController createInneractiveFullscreenUnitController() {
        return new com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController();
    }

    @kotlin.jvm.JvmStatic
    public static final com.fyber.inneractive.sdk.external.NativeAdUnitController createNativeAdUnitController() {
        return new com.fyber.inneractive.sdk.external.NativeAdUnitController();
    }

    @kotlin.jvm.JvmStatic
    public static final com.fyber.inneractive.sdk.external.NativeAdVideoContentController createNativeAdVideoContentController() {
        return new com.fyber.inneractive.sdk.external.NativeAdVideoContentController();
    }
}
