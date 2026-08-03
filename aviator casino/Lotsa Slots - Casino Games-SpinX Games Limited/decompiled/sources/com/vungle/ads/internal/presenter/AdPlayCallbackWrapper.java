package com.vungle.ads.internal.presenter;

/* compiled from: AdPlayCallback.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0013\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0001J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "adPlayCallback", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;)V", "onAdClick", "", "id", "", "onAdEnd", "onAdImpression", com.ironsource.Vf.k, com.ironsource.Vf.i, "onAdStart", "onFailure", "error", "Lcom/vungle/ads/VungleError;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public class AdPlayCallbackWrapper implements com.vungle.ads.internal.presenter.AdPlayCallback {
    private final com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback;

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdClick(java.lang.String id) {
        this.adPlayCallback.onAdClick(id);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdEnd(java.lang.String id) {
        this.adPlayCallback.onAdEnd(id);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdImpression(java.lang.String id) {
        this.adPlayCallback.onAdImpression(id);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdLeftApplication(java.lang.String id) {
        this.adPlayCallback.onAdLeftApplication(id);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdRewarded(java.lang.String id) {
        this.adPlayCallback.onAdRewarded(id);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onAdStart(java.lang.String id) {
        this.adPlayCallback.onAdStart(id);
    }

    @Override // com.vungle.ads.internal.presenter.AdPlayCallback
    public void onFailure(com.vungle.ads.VungleError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.adPlayCallback.onFailure(error);
    }

    public AdPlayCallbackWrapper(com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        this.adPlayCallback = adPlayCallback;
    }
}
