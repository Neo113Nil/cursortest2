package com.paypal.oslo.feature.ads.data.tracking;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J7\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0014JC\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJK\u0010 \u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00042\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/tracking/MockAdTrackingServiceImpl;", "Lcom/paypal/oslo/feature/ads/data/tracking/AdTrackingService;", "<init>", "()V", "", "pageName", "placement", "", "placementOrder", "adPosition", "adFormat", "", "trackAdRequest", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "Lcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;", "ad", "adsReturned", "trackAdResponse", "(Ljava/lang/String;Ljava/lang/String;ILcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;II)V", "trackImpression", "(Ljava/lang/String;Ljava/lang/String;ILcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;I)V", "trackClick", com.daon.sdk.face.license.License.FEATURE_POSITION, "trackDisclaimerClick", "statusCode", "errorMessage", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "trackFetchFailure", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V", "errorCode", "trackImageLoadFailure", "(Ljava/lang/String;Ljava/lang/String;ILcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;ILjava/lang/String;Ljava/lang/Exception;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockAdTrackingServiceImpl implements com.paypal.oslo.feature.ads.data.tracking.AdTrackingService {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockAdTrackingServiceImpl() {
    }

    @Override // com.paypal.oslo.feature.ads.data.tracking.AdTrackingService
    public final void trackImpression(java.lang.String pageName, java.lang.String placement, int placementOrder, com.paypal.oslo.feature.ads.data.tracking.TrackedAd ad, int adPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "");
    }

    @Override // com.paypal.oslo.feature.ads.data.tracking.AdTrackingService
    public final void trackImageLoadFailure(java.lang.String pageName, java.lang.String placement, int placementOrder, com.paypal.oslo.feature.ads.data.tracking.TrackedAd ad, int adPosition, java.lang.String errorCode, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
    }

    @Override // com.paypal.oslo.feature.ads.data.tracking.AdTrackingService
    public final void trackFetchFailure(java.lang.String pageName, java.lang.String placement, int placementOrder, java.lang.String statusCode, java.lang.String errorMessage, java.lang.Exception exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
    }

    @Override // com.paypal.oslo.feature.ads.data.tracking.AdTrackingService
    public final void trackDisclaimerClick(java.lang.String pageName, java.lang.String placement, int placementOrder, com.paypal.oslo.feature.ads.data.tracking.TrackedAd ad, int position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "");
    }

    @Override // com.paypal.oslo.feature.ads.data.tracking.AdTrackingService
    public final void trackClick(java.lang.String pageName, java.lang.String placement, int placementOrder, com.paypal.oslo.feature.ads.data.tracking.TrackedAd ad, int adPosition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "");
    }

    @Override // com.paypal.oslo.feature.ads.data.tracking.AdTrackingService
    public final void trackAdResponse(java.lang.String pageName, java.lang.String placement, int placementOrder, com.paypal.oslo.feature.ads.data.tracking.TrackedAd ad, int adPosition, int adsReturned) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "");
    }

    @Override // com.paypal.oslo.feature.ads.data.tracking.AdTrackingService
    public final void trackAdRequest(java.lang.String pageName, java.lang.String placement, int placementOrder, int adPosition, java.lang.String adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "");
    }
}
