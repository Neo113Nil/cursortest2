package com.paypal.oslo.feature.ads.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/ads/domain/usecase/TriggerImpressionUseCase;", "", "Lcom/paypal/oslo/feature/ads/domain/repository/AdRepository;", "adRepository", "<init>", "(Lcom/paypal/oslo/feature/ads/domain/repository/AdRepository;)V", "", "pageName", "placement", "", "placementOrder", "Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "adData", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "invoke", "(Ljava/lang/String;Ljava/lang/String;ILcom/paypal/oslo/feature/ads/domain/model/AdData;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/ads/domain/repository/AdRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TriggerImpressionUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.ads.domain.repository.AdRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public TriggerImpressionUseCase(com.paypal.oslo.feature.ads.domain.repository.AdRepository adRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "");
        this.Camera2StreamConfigurationMap = adRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, int i, com.paypal.oslo.feature.ads.domain.model.AdData adData, int i2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object triggerImpression = this.Camera2StreamConfigurationMap.triggerImpression(str, str2, i, adData, i2, continuation);
        return triggerImpression == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? triggerImpression : kotlin.Unit.INSTANCE;
    }
}
