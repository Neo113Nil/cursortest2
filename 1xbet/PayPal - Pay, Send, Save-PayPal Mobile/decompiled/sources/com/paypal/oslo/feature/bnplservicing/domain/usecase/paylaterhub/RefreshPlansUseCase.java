package com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/paylaterhub/RefreshPlansUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/domain/usecase/BaseUseCase;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/input/RefreshPlansInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;)V", "request", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/paylaterhub/input/RefreshPlansInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onResponseData", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PayLaterHubRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RefreshPlansUseCase extends com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase<com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.RefreshPlansInput> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RefreshPlansUseCase(com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository payLaterHubRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubRepository, "");
        this.getHighSpeedVideoSizes = payLaterHubRepository;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.RefreshPlansInput refreshPlansInput, kotlin.coroutines.Continuation continuation) {
        return invoke2(refreshPlansInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.bnplservicing.domain.model.paylaterhub.input.RefreshPlansInput refreshPlansInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>> continuation) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase$invoke$1 refreshPlansUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase refreshPlansUseCase;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase$invoke$1) {
            refreshPlansUseCase$invoke$1 = (com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase$invoke$1) continuation;
            if ((refreshPlansUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                refreshPlansUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = refreshPlansUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = refreshPlansUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository payLaterHubRepository = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansInput = refreshPlansInput.getPlansInput();
                    refreshPlansUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(refreshPlansInput);
                    refreshPlansUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    refreshPlansUseCase$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = payLaterHubRepository.getPlansSection(plansInput, refreshPlansUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    refreshPlansUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    refreshPlansUseCase = (com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase) refreshPlansUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return refreshPlansUseCase.toUseCaseResult((arrow.core.Ior) obj, true);
            }
        }
        refreshPlansUseCase$invoke$1 = new com.paypal.oslo.feature.bnplservicing.domain.usecase.paylaterhub.RefreshPlansUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = refreshPlansUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = refreshPlansUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return refreshPlansUseCase.toUseCaseResult((arrow.core.Ior) obj2, true);
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.usecase.BaseUseCase
    public final <T> com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?> onResponseData(T data) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success("", data);
    }
}
