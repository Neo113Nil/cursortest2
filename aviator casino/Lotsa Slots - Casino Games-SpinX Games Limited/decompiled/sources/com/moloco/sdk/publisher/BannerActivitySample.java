package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/moloco/sdk/publisher/BannerActivitySample;", "Landroid/app/Activity;", "<init>", "()V", "bannerContainer", "Landroid/widget/FrameLayout;", "banner", "Lcom/moloco/sdk/publisher/Banner;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "persistentState", "Landroid/os/PersistableBundle;", "onDestroy", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class BannerActivitySample extends android.app.Activity {
    private com.moloco.sdk.publisher.Banner banner;
    private final android.widget.FrameLayout bannerContainer = new android.widget.FrameLayout(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onCreate$lambda$0(com.moloco.sdk.publisher.BannerActivitySample bannerActivitySample, com.moloco.sdk.publisher.Banner banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (banner == null) {
            bannerActivitySample.finish();
            return kotlin.Unit.INSTANCE;
        }
        bannerActivitySample.banner = banner;
        bannerActivitySample.bannerContainer.addView(banner);
        banner.setAdShowListener(new com.moloco.sdk.publisher.BannerAdShowListener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1$1
            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdShowFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
                throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdShowListener
            public void onAdShowSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
            }
        });
        banner.load("bid response", new com.moloco.sdk.publisher.AdLoad.Listener() { // from class: com.moloco.sdk.publisher.BannerActivitySample$onCreate$1$2
            @Override // com.moloco.sdk.publisher.AdLoad.Listener
            public void onAdLoadFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
                throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
            }

            @Override // com.moloco.sdk.publisher.AdLoad.Listener
            public void onAdLoadSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                throw new kotlin.NotImplementedError("An operation is not implemented: Not yet implemented");
            }
        });
        banner.isLoaded();
        banner.load("an_another_bid_response", null);
        bannerActivitySample.bannerContainer.removeView(banner);
        banner.load("", null);
        banner.load("some_other_bid_response", null);
        bannerActivitySample.bannerContainer.addView(banner);
        return kotlin.Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(this.bannerContainer);
        com.moloco.sdk.publisher.Moloco.createBanner$default(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.publisher.BannerActivitySample$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit onCreate$lambda$0;
                onCreate$lambda$0 = com.moloco.sdk.publisher.BannerActivitySample.onCreate$lambda$0(com.moloco.sdk.publisher.BannerActivitySample.this, (com.moloco.sdk.publisher.Banner) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return onCreate$lambda$0;
            }
        }, 4, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.moloco.sdk.publisher.Banner banner = this.banner;
        com.moloco.sdk.publisher.Banner banner2 = null;
        if (banner == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("banner");
            banner = null;
        }
        banner.destroy();
        com.moloco.sdk.publisher.Banner banner3 = this.banner;
        if (banner3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("banner");
            banner3 = null;
        }
        android.view.ViewParent parent = banner3.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            com.moloco.sdk.publisher.Banner banner4 = this.banner;
            if (banner4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("banner");
            } else {
                banner2 = banner4;
            }
            viewGroup.removeView(banner2);
        }
    }
}
