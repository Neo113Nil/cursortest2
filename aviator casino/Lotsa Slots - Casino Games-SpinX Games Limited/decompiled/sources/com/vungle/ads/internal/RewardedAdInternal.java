package com.vungle.ads.internal;

/* compiled from: RewardedAdInternal.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000b¨\u0006\""}, d2 = {"Lcom/vungle/ads/internal/RewardedAdInternal;", "Lcom/vungle/ads/internal/FullscreenAdInternal;", "Lcom/vungle/ads/internal/presenter/PresenterDelegate;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alertBodyText", "", "getAlertBodyText$vungle_ads_release", "()Ljava/lang/String;", "setAlertBodyText$vungle_ads_release", "(Ljava/lang/String;)V", "alertCloseButtonText", "getAlertCloseButtonText$vungle_ads_release", "setAlertCloseButtonText$vungle_ads_release", "alertContinueButtonText", "getAlertContinueButtonText$vungle_ads_release", "setAlertContinueButtonText$vungle_ads_release", "alertTitleText", "getAlertTitleText$vungle_ads_release", "setAlertTitleText$vungle_ads_release", "userId", "getUserId$vungle_ads_release", "setUserId$vungle_ads_release", "getAlertBodyText", "getAlertCloseButtonText", "getAlertContinueButtonText", "getAlertTitleText", "getPresenterDelegate", "getUserId", "isValidAdTypeForPlacement", "", "placement", "Lcom/vungle/ads/internal/model/Placement;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class RewardedAdInternal extends com.vungle.ads.internal.FullscreenAdInternal implements com.vungle.ads.internal.presenter.PresenterDelegate {
    private java.lang.String alertBodyText;
    private java.lang.String alertCloseButtonText;
    private java.lang.String alertContinueButtonText;
    private java.lang.String alertTitleText;
    private java.lang.String userId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardedAdInternal(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public final java.lang.String getAlertTitleText$vungle_ads_release() {
        return this.alertTitleText;
    }

    public final void setAlertTitleText$vungle_ads_release(java.lang.String str) {
        this.alertTitleText = str;
    }

    public final java.lang.String getAlertBodyText$vungle_ads_release() {
        return this.alertBodyText;
    }

    public final void setAlertBodyText$vungle_ads_release(java.lang.String str) {
        this.alertBodyText = str;
    }

    public final java.lang.String getAlertCloseButtonText$vungle_ads_release() {
        return this.alertCloseButtonText;
    }

    public final void setAlertCloseButtonText$vungle_ads_release(java.lang.String str) {
        this.alertCloseButtonText = str;
    }

    public final java.lang.String getAlertContinueButtonText$vungle_ads_release() {
        return this.alertContinueButtonText;
    }

    public final void setAlertContinueButtonText$vungle_ads_release(java.lang.String str) {
        this.alertContinueButtonText = str;
    }

    public final java.lang.String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final void setUserId$vungle_ads_release(java.lang.String str) {
        this.userId = str;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public java.lang.String getUserId() {
        return this.userId;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public java.lang.String getAlertTitleText() {
        return this.alertTitleText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public java.lang.String getAlertBodyText() {
        return this.alertBodyText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public java.lang.String getAlertCloseButtonText() {
        return this.alertCloseButtonText;
    }

    @Override // com.vungle.ads.internal.presenter.PresenterDelegate
    public java.lang.String getAlertContinueButtonText() {
        return this.alertContinueButtonText;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(com.vungle.ads.internal.model.Placement placement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.isRewardedVideo();
    }

    @Override // com.vungle.ads.internal.FullscreenAdInternal
    public com.vungle.ads.internal.presenter.PresenterDelegate getPresenterDelegate() {
        return this;
    }
}
