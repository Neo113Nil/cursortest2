package com.paypal.oslo.feature.ads.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/ads/domain/usecase/GetAdDataUseCase;", "", "Lcom/paypal/oslo/feature/ads/domain/repository/AdRepository;", "adRepository", "<init>", "(Lcom/paypal/oslo/feature/ads/domain/repository/AdRepository;)V", "", "pageName", "placement", "", "placementOrder", com.daon.sdk.face.license.License.FEATURE_POSITION, com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "invoke", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/ads/domain/repository/AdRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetAdDataUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.ads.domain.repository.AdRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetAdDataUseCase(com.paypal.oslo.feature.ads.domain.repository.AdRepository adRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "");
        this.getHighSpeedVideoFpsRangesFor = adRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.domain.model.AdData> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.getAdData(str, str2, i, i2, str3, continuation);
    }
}
