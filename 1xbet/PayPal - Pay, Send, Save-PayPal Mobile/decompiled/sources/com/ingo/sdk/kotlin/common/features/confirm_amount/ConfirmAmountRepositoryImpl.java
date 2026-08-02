package com.ingo.sdk.kotlin.common.features.confirm_amount;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u000e\u001a\u00020\r8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmAmountRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmAmountRepository;", "<init>", "()V", "", "amount", "", "transactionReferenceNumber", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;", "confirmAmount", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/ConfirmAmountApi;", "Camera2StreamConfigurationMap", "Lkotlin/Lazy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmAmountRepositoryImpl implements com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepository {
    private final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepositoryImpl$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepositoryImpl.$r8$lambda$Wg5c8XOuULcFaJMSUkUGrUacSGI();
        }
    });

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi $r8$lambda$Wg5c8XOuULcFaJMSUkUGrUacSGI() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi");
    }

    @Override // com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountRepository
    public final java.lang.Object confirmAmount(long j, java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse>> continuation) {
        return ((com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountApi) this.Camera2StreamConfigurationMap.getValue()).confirmAmount(j, str, continuation);
    }
}
