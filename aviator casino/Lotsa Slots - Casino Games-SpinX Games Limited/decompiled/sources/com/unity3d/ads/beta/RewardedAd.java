package com.unity3d.ads.beta;

/* compiled from: RewardedAd.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/beta/RewardedAd;", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/beta/LoadOptions;", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/beta/LoadOptions;)V", com.ironsource.C3232q2.v, "", "activity", "Landroid/app/Activity;", "options", "Lcom/unity3d/ads/beta/ShowOptions;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/RewardedShowListener;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RewardedAd {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ads.beta.RewardedAd.Companion INSTANCE = new com.unity3d.ads.beta.RewardedAd.Companion(null);
    private final com.unity3d.ads.core.data.model.AdObject adObject;
    private final com.unity3d.ads.beta.LoadOptions loadOptions;

    @kotlin.jvm.JvmStatic
    public static final void load(com.unity3d.ads.beta.LoadOptions loadOptions, com.unity3d.ads.beta.LoadListener<com.unity3d.ads.beta.RewardedAd> loadListener) {
        INSTANCE.load(loadOptions, loadListener);
    }

    public final void show(android.app.Activity activity, com.unity3d.ads.beta.ShowOptions options, com.unity3d.ads.beta.RewardedShowListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public RewardedAd(com.unity3d.ads.core.data.model.AdObject adObject, com.unity3d.ads.beta.LoadOptions loadOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadOptions, "loadOptions");
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static /* synthetic */ void show$default(com.unity3d.ads.beta.RewardedAd rewardedAd, android.app.Activity activity, com.unity3d.ads.beta.ShowOptions showOptions, com.unity3d.ads.beta.RewardedShowListener rewardedShowListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            showOptions = null;
        }
        rewardedAd.show(activity, showOptions, rewardedShowListener);
    }

    /* compiled from: RewardedAd.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/beta/RewardedAd$Companion;", "", "()V", "load", "", "options", "Lcom/unity3d/ads/beta/LoadOptions;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/beta/LoadListener;", "Lcom/unity3d/ads/beta/RewardedAd;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final void load(com.unity3d.ads.beta.LoadOptions options, com.unity3d.ads.beta.LoadListener<com.unity3d.ads.beta.RewardedAd> listener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        }

        private Companion() {
        }
    }
}
