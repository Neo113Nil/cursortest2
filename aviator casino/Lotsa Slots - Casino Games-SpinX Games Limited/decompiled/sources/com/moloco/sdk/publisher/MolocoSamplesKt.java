package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\b\u0010\r\u001a\u00020\u0001H\u0002\u001a\b\u0010\u000e\u001a\u00020\u0001H\u0002¨\u0006\u000f"}, d2 = {"MolocoInitializeSample", "", "appContext", "Landroid/content/Context;", "MolocoIsInitializedSample", "MolocoCreateBanner", "frameLayout", "Landroid/widget/FrameLayout;", "MolocoCreateBannerTablet", "MolocoCreateMREC", "MolocoCreateNativeAd", "adUnitId", "", "MolocoCreateInterstitialAd", "MolocoCreateRewardedInterstitialAd", "moloco-sdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MolocoSamplesKt {
    private static final void MolocoCreateBanner(final android.widget.FrameLayout frameLayout) {
        com.moloco.sdk.publisher.Moloco.createBanner$default(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.publisher.MolocoSamplesKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit MolocoCreateBanner$lambda$2;
                MolocoCreateBanner$lambda$2 = com.moloco.sdk.publisher.MolocoSamplesKt.MolocoCreateBanner$lambda$2(frameLayout, (com.moloco.sdk.publisher.Banner) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return MolocoCreateBanner$lambda$2;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MolocoCreateBanner$lambda$2(android.widget.FrameLayout frameLayout, com.moloco.sdk.publisher.Banner banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void MolocoCreateBannerTablet(final android.widget.FrameLayout frameLayout) {
        com.moloco.sdk.publisher.Moloco.createBannerTablet$default(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.publisher.MolocoSamplesKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit MolocoCreateBannerTablet$lambda$3;
                MolocoCreateBannerTablet$lambda$3 = com.moloco.sdk.publisher.MolocoSamplesKt.MolocoCreateBannerTablet$lambda$3(frameLayout, (com.moloco.sdk.publisher.Banner) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return MolocoCreateBannerTablet$lambda$3;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MolocoCreateBannerTablet$lambda$3(android.widget.FrameLayout frameLayout, com.moloco.sdk.publisher.Banner banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void MolocoCreateInterstitialAd() {
        com.moloco.sdk.publisher.Moloco.createInterstitial$default(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.publisher.MolocoSamplesKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit MolocoCreateInterstitialAd$lambda$6;
                MolocoCreateInterstitialAd$lambda$6 = com.moloco.sdk.publisher.MolocoSamplesKt.MolocoCreateInterstitialAd$lambda$6((com.moloco.sdk.publisher.InterstitialAd) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return MolocoCreateInterstitialAd$lambda$6;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MolocoCreateInterstitialAd$lambda$6(com.moloco.sdk.publisher.InterstitialAd interstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (interstitialAd != null) {
            interstitialAd.load("bid_response", null);
            interstitialAd.show(null);
            interstitialAd.destroy();
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void MolocoCreateMREC(final android.widget.FrameLayout frameLayout) {
        com.moloco.sdk.publisher.Moloco.createMREC$default(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.publisher.MolocoSamplesKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit MolocoCreateMREC$lambda$4;
                MolocoCreateMREC$lambda$4 = com.moloco.sdk.publisher.MolocoSamplesKt.MolocoCreateMREC$lambda$4(frameLayout, (com.moloco.sdk.publisher.Banner) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return MolocoCreateMREC$lambda$4;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MolocoCreateMREC$lambda$4(android.widget.FrameLayout frameLayout, com.moloco.sdk.publisher.Banner banner, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (banner != null) {
            banner.load("bid_response", null);
            frameLayout.addView(banner);
            banner.destroy();
            frameLayout.removeView(banner);
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void MolocoCreateNativeAd(java.lang.String str) {
        com.moloco.sdk.publisher.Moloco.createNativeAd$default(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.publisher.MolocoSamplesKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit MolocoCreateNativeAd$lambda$5;
                MolocoCreateNativeAd$lambda$5 = com.moloco.sdk.publisher.MolocoSamplesKt.MolocoCreateNativeAd$lambda$5((com.moloco.sdk.publisher.NativeAd) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return MolocoCreateNativeAd$lambda$5;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MolocoCreateNativeAd$lambda$5(com.moloco.sdk.publisher.NativeAd nativeAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (nativeAd != null) {
            nativeAd.load("bid_response", null);
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void MolocoCreateRewardedInterstitialAd() {
        com.moloco.sdk.publisher.Moloco.createRewardedInterstitial$default(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.publisher.MolocoSamplesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit MolocoCreateRewardedInterstitialAd$lambda$7;
                MolocoCreateRewardedInterstitialAd$lambda$7 = com.moloco.sdk.publisher.MolocoSamplesKt.MolocoCreateRewardedInterstitialAd$lambda$7((com.moloco.sdk.publisher.RewardedInterstitialAd) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return MolocoCreateRewardedInterstitialAd$lambda$7;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit MolocoCreateRewardedInterstitialAd$lambda$7(com.moloco.sdk.publisher.RewardedInterstitialAd rewardedInterstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.load("bid_response", null);
            rewardedInterstitialAd.show(null);
            rewardedInterstitialAd.destroy();
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void MolocoInitializeSample(final android.content.Context context) {
        com.moloco.sdk.publisher.Moloco.initialize(new com.moloco.sdk.publisher.init.MolocoInitParams(context, "YOUR_APP_KEY", new com.moloco.sdk.publisher.MediationInfo("<YourMediationName>")), new com.moloco.sdk.publisher.MolocoInitializationListener() { // from class: com.moloco.sdk.publisher.MolocoSamplesKt$$ExternalSyntheticLambda7
            @Override // com.moloco.sdk.publisher.MolocoInitializationListener
            public final void onMolocoInitializationStatus(com.moloco.sdk.publisher.MolocoInitStatus molocoInitStatus) {
                com.moloco.sdk.publisher.MolocoSamplesKt.MolocoInitializeSample$lambda$1(context, molocoInitStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MolocoInitializeSample$lambda$1(android.content.Context context, com.moloco.sdk.publisher.MolocoInitStatus molocoInitStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoInitStatus, "molocoInitStatus");
        if (molocoInitStatus.getInitialization() == com.moloco.sdk.publisher.Initialization.SUCCESS) {
            com.moloco.sdk.publisher.Moloco.getBidToken(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), context, new com.moloco.sdk.publisher.MolocoBidTokenListener() { // from class: com.moloco.sdk.publisher.MolocoSamplesKt$$ExternalSyntheticLambda6
                @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
                public final void onBidTokenResult(java.lang.String str, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "bidToken");
                }
            });
        } else {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "app", molocoInitStatus.getDescription(), null, false, 12, null);
        }
    }

    private static final void MolocoIsInitializedSample() {
        com.moloco.sdk.publisher.Moloco.isInitialized();
    }
}
