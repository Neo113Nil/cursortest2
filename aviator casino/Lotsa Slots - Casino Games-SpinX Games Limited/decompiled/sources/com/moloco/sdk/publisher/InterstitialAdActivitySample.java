package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/moloco/sdk/publisher/InterstitialAdActivitySample;", "Landroid/app/Activity;", "<init>", "()V", "interstitialAd", "Lcom/moloco/sdk/publisher/InterstitialAd;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "persistentState", "Landroid/os/PersistableBundle;", "onDestroy", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
final class InterstitialAdActivitySample extends android.app.Activity {
    private com.moloco.sdk.publisher.InterstitialAd interstitialAd;

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit onCreate$lambda$0(com.moloco.sdk.publisher.InterstitialAdActivitySample interstitialAdActivitySample, com.moloco.sdk.publisher.InterstitialAd interstitialAd, com.moloco.sdk.publisher.MolocoAdError.AdCreateError adCreateError) {
        if (interstitialAd == null) {
            interstitialAdActivitySample.finish();
            return kotlin.Unit.INSTANCE;
        }
        interstitialAdActivitySample.interstitialAd = interstitialAd;
        interstitialAd.load("bid response", new com.moloco.sdk.publisher.AdLoad.Listener() { // from class: com.moloco.sdk.publisher.InterstitialAdActivitySample$onCreate$1$1
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
        interstitialAd.isLoaded();
        interstitialAd.show(new com.moloco.sdk.publisher.InterstitialAdShowListener() { // from class: com.moloco.sdk.publisher.InterstitialAdActivitySample$onCreate$1$2
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
        interstitialAd.load("an_another_bid_response", null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle savedInstanceState, android.os.PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        com.moloco.sdk.publisher.Moloco.createInterstitial$default(new com.moloco.sdk.publisher.MediationInfo("MY_MEDIATION"), "MOLOCO_ADUNIT_ID", null, new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.publisher.InterstitialAdActivitySample$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit onCreate$lambda$0;
                onCreate$lambda$0 = com.moloco.sdk.publisher.InterstitialAdActivitySample.onCreate$lambda$0(com.moloco.sdk.publisher.InterstitialAdActivitySample.this, (com.moloco.sdk.publisher.InterstitialAd) obj, (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) obj2);
                return onCreate$lambda$0;
            }
        }, 4, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.moloco.sdk.publisher.InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("interstitialAd");
            interstitialAd = null;
        }
        interstitialAd.destroy();
    }
}
