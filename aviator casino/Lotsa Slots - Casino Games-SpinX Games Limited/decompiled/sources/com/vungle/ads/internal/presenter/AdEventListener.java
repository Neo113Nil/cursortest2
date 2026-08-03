package com.vungle.ads.internal.presenter;

/* compiled from: AdEventListener.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/presenter/AdEventListener;", "", "playAdCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;Lcom/vungle/ads/internal/model/Placement;)V", "adRewarded", "", "onError", "", "error", "Lcom/vungle/ads/VungleError;", "placementId", "", "onNext", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "value", "id", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public class AdEventListener {
    private static final java.lang.String TAG = "AdEventListener";
    private boolean adRewarded;
    private com.vungle.ads.internal.model.Placement placement;
    private final com.vungle.ads.internal.presenter.AdPlayCallback playAdCallback;

    public AdEventListener(com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback, com.vungle.ads.internal.model.Placement placement) {
        this.playAdCallback = adPlayCallback;
        this.placement = placement;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void onNext(java.lang.String s, java.lang.String value, java.lang.String id) {
        com.vungle.ads.internal.model.Placement placement;
        com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback;
        com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback2;
        com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback3;
        com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "s");
        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "s=" + s + ", value=" + value + ", id=" + id);
        switch (s.hashCode()) {
            case -1912374177:
                if (s.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.SUCCESSFUL_VIEW) && (placement = this.placement) != null && placement.isRewardedVideo() && !this.adRewarded) {
                    this.adRewarded = true;
                    com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback5 = this.playAdCallback;
                    if (adPlayCallback5 != null) {
                        adPlayCallback5.onAdRewarded(id);
                        break;
                    }
                }
                break;
            case -1627831289:
                if (s.equals("adViewed") && (adPlayCallback = this.playAdCallback) != null) {
                    adPlayCallback.onAdImpression(id);
                    break;
                }
                break;
            case 100571:
                if (s.equals("end") && (adPlayCallback2 = this.playAdCallback) != null) {
                    adPlayCallback2.onAdEnd(id);
                    break;
                }
                break;
            case 3417674:
                if (s.equals("open")) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(value, "adClick")) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(value, "adLeftApplication") && (adPlayCallback3 = this.playAdCallback) != null) {
                            adPlayCallback3.onAdLeftApplication(id);
                            break;
                        }
                    } else {
                        com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback6 = this.playAdCallback;
                        if (adPlayCallback6 != null) {
                            adPlayCallback6.onAdClick(id);
                            break;
                        }
                    }
                }
                break;
            case 109757538:
                if (s.equals("start") && (adPlayCallback4 = this.playAdCallback) != null) {
                    adPlayCallback4.onAdStart(id);
                    break;
                }
                break;
        }
    }

    public final void onError(com.vungle.ads.VungleError error, java.lang.String placementId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.vungle.ads.internal.presenter.AdPlayCallback adPlayCallback = this.playAdCallback;
        if (adPlayCallback != null) {
            adPlayCallback.onFailure(error);
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "AdEventListener#PlayAdCallback " + placementId, error);
        }
    }
}
