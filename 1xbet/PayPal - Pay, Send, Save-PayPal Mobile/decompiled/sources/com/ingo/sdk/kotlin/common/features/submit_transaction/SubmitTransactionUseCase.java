package com.ingo.sdk.kotlin.common.features.submit_transaction;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/model/SubmitTransactionResponse;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionUseCaseParameters;", "<init>", "()V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionUseCaseParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionRepository;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubmitTransactionUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse, com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse>>) continuation);
    }

    public SubmitTransactionUseCase() {
        super(0L, 1, null);
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCase.m10775$r8$lambda$E6Ckxz2dAV02nzUwD5qh30zgSQ();
            }
        });
    }

    /* renamed from: $r8$lambda$E6Ckxz2dAV02nz-UwD5qh30zgSQ, reason: not valid java name */
    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepository m10775$r8$lambda$E6Ckxz2dAV02nzUwD5qh30zgSQ() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepository");
    }

    public final java.lang.Object run(com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionUseCaseParameters submitTransactionUseCaseParameters, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse>> continuation) {
        return ((com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepository) this.Camera2StreamConfigurationMap.getValue()).submitTransaction(submitTransactionUseCaseParameters.getTransactionReferenceNumber(), submitTransactionUseCaseParameters.getPromoCode(), submitTransactionUseCaseParameters.getAccountIdentifier(), submitTransactionUseCaseParameters.getFundsTiming(), continuation);
    }
}
