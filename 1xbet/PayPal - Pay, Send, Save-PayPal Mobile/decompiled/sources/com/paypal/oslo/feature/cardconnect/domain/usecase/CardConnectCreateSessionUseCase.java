package com.paypal.oslo.feature.cardconnect.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/domain/usecase/CardConnectCreateSessionUseCase;", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionRequest;", "Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionResponse;", "Lcom/paypal/oslo/feature/cardconnect/domain/repository/CardConnectRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/cardconnect/domain/repository/CardConnectRepository;)V", "request", "Lcom/paypal/oslo/feature/cardconnect/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/cardconnect/domain/model/CardConnectSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cardconnect/domain/repository/CardConnectRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardConnectCreateSessionUseCase implements com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCase<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest, com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CardConnectCreateSessionUseCase(com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository cardConnectRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectRepository, "");
        this.Camera2StreamConfigurationMap = cardConnectRepository;
    }

    @Override // com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest cardConnectSessionRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse>> continuation) {
        return invoke2(cardConnectSessionRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse>>) continuation);
    }

    @Override // com.paypal.oslo.feature.cardconnect.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.cardconnect.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionRequest cardConnectSessionRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cardconnect.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse>> continuation) {
        com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase$invoke$1 cardConnectCreateSessionUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase cardConnectCreateSessionUseCase;
        if (continuation instanceof com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase$invoke$1) {
            cardConnectCreateSessionUseCase$invoke$1 = (com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase$invoke$1) continuation;
            if ((cardConnectCreateSessionUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                cardConnectCreateSessionUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = cardConnectCreateSessionUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cardConnectCreateSessionUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cardconnect.domain.repository.CardConnectRepository cardConnectRepository = this.Camera2StreamConfigurationMap;
                    cardConnectCreateSessionUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardConnectSessionRequest);
                    cardConnectCreateSessionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = this;
                    cardConnectCreateSessionUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = cardConnectRepository.createSession(cardConnectSessionRequest, cardConnectCreateSessionUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    cardConnectCreateSessionUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cardConnectCreateSessionUseCase = (com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase) cardConnectCreateSessionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return cardConnectCreateSessionUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase.$r8$lambda$W_Q2nYrEmjGBe6V1vdxvsevYNfo((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse) obj2);
                    }
                });
            }
        }
        cardConnectCreateSessionUseCase$invoke$1 = new com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = cardConnectCreateSessionUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cardConnectCreateSessionUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return cardConnectCreateSessionUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.cardconnect.domain.usecase.CardConnectCreateSessionUseCase.$r8$lambda$W_Q2nYrEmjGBe6V1vdxvsevYNfo((com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse) obj22);
            }
        });
    }

    public static /* synthetic */ com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse $r8$lambda$W_Q2nYrEmjGBe6V1vdxvsevYNfo(com.paypal.oslo.feature.cardconnect.domain.model.CardConnectSessionResponse cardConnectSessionResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectSessionResponse, "");
        return cardConnectSessionResponse;
    }
}
