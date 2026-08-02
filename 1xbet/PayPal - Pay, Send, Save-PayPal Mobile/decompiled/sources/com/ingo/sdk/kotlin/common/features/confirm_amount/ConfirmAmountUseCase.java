package com.ingo.sdk.kotlin.common.features.confirm_amount;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0010\u001a\u00020\r8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmAmountUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;", "Lkotlin/Pair;", "", "", "<init>", "()V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "run", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmAmountRepository;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmAmountUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse, kotlin.Pair<? extends java.lang.Long, ? extends java.lang.String>> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    public ConfirmAmountUseCase() {
        super(0L, 1, null);
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase.$r8$lambda$r4oyIXBhRkcHGEJ4Hly7WAai7ZU();
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((kotlin.Pair<java.lang.Long, java.lang.String>) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object run(kotlin.Pair<java.lang.Long, java.lang.String> pair, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase$run$1 confirmAmountUseCase$run$1;
        int i;
        com.ingo.sdk.kotlin.common.core.functional.Either either;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase$run$1) {
            confirmAmountUseCase$run$1 = (com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase$run$1) continuation;
            if ((confirmAmountUseCase$run$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                confirmAmountUseCase$run$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = confirmAmountUseCase$run$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = confirmAmountUseCase$run$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepository confirmAmountRepository = (com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepository) this.Camera2StreamConfigurationMap.getValue();
                    long longValue = pair.getFirst().longValue();
                    java.lang.String second = pair.getSecond();
                    confirmAmountUseCase$run$1.Camera2StreamConfigurationMap = 1;
                    obj = confirmAmountRepository.confirmAmount(longValue, second, confirmAmountUseCase$run$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (com.ingo.sdk.kotlin.common.core.functional.Either) obj;
                if (either.isRight()) {
                    return either;
                }
                java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
                if (obj2 != null) {
                    ((com.ingo.sdk.kotlin.ux.IngoUxState) obj2).getSessionMap().put(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse.class), com.ingo.sdk.kotlin.common.core.functional.EitherKt.getRightOrThrow$default(either, null, 1, null));
                    return either;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
            }
        }
        confirmAmountUseCase$run$1 = new com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase$run$1(this, continuation);
        java.lang.Object obj3 = confirmAmountUseCase$run$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = confirmAmountUseCase$run$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (com.ingo.sdk.kotlin.common.core.functional.Either) obj3;
        if (either.isRight()) {
        }
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepository $r8$lambda$r4oyIXBhRkcHGEJ4Hly7WAai7ZU() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepository");
    }
}
