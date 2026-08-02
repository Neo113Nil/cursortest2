package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/usecase/GetBusinessHomeFeedUseCase;", "", "Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;", "merchantInsightsRepository", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/EvaluateAccountSetupStatusUseCase;", "evaluateAccountSetupStatusUseCase", "<init>", "(Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;Lcom/paypal/oslo/feature/businesshome/domain/usecase/EvaluateAccountSetupStatusUseCase;)V", "Lcom/paypal/oslo/feature/businesshome/domain/model/BusinessHomeFeed;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesshome/domain/usecase/EvaluateAccountSetupStatusUseCase;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetBusinessHomeFeedUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetBusinessHomeFeedUseCase(com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository merchantInsightsRepository, com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase evaluateAccountSetupStatusUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantInsightsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateAccountSetupStatusUseCase, "");
        this.Camera2StreamConfigurationMap = merchantInsightsRepository;
        this.getHighSpeedVideoFpsRangesFor = evaluateAccountSetupStatusUseCase;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.model.BusinessHomeFeed> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.oslo.feature.businesshome.domain.usecase.GetBusinessHomeFeedUseCase$invoke$2(this, null), continuation);
    }
}
