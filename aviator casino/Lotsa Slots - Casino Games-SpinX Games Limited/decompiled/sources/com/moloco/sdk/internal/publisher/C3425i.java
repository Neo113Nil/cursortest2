package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3425i implements com.moloco.sdk.publisher.AdShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.publisher.AdShowListener f7101a;

    public C3425i(com.moloco.sdk.publisher.AdShowListener adShowListener) {
        this.f7101a = adShowListener;
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.publisher.AdShowListener adShowListener = this.f7101a;
        if (adShowListener != null) {
            adShowListener.onAdClicked(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.publisher.AdShowListener adShowListener = this.f7101a;
        if (adShowListener != null) {
            adShowListener.onAdHidden(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(com.moloco.sdk.publisher.MolocoAdError molocoAdError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        com.moloco.sdk.publisher.AdShowListener adShowListener = this.f7101a;
        if (adShowListener != null) {
            adShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.publisher.AdShowListener adShowListener = this.f7101a;
        if (adShowListener != null) {
            adShowListener.onAdShowSuccess(molocoAd);
        }
    }
}
