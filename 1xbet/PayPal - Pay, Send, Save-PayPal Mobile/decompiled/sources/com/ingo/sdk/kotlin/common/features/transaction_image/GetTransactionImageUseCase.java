package com.ingo.sdk.kotlin.common.features.transaction_image;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u000e\u001a\u00020\u000b8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/transaction_image/GetTransactionImageUseCase;", "Lcom/ingo/sdk/kotlin/common/core/interactor/SdkUseCase;", "", "", "<init>", "()V", "params", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "run", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/transaction_image/TransactionImageRepository;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GetTransactionImageUseCase extends com.ingo.sdk.kotlin.common.core.interactor.SdkUseCase<byte[], java.lang.String> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    public GetTransactionImageUseCase() {
        super(0L, 1, null);
        this.Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.kotlin.common.features.transaction_image.GetTransactionImageUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.ingo.sdk.kotlin.common.features.transaction_image.GetTransactionImageUseCase.m10776$r8$lambda$WlfG2HvYYlZvVpH5Xoib6RiQvs();
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.core.interactor.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object run(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return run((java.lang.String) obj, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, byte[]>>) continuation);
    }

    /* renamed from: $r8$lambda$WlfG2HvYYlZvVpH5Xoib6Ri-Qvs, reason: not valid java name */
    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageRepository m10776$r8$lambda$WlfG2HvYYlZvVpH5Xoib6RiQvs() {
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageRepository.class));
        if (obj != null) {
            return (com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageRepository) obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageRepository");
    }

    public final java.lang.Object run(java.lang.String str, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, byte[]>> continuation) {
        return ((com.ingo.sdk.kotlin.common.features.transaction_image.TransactionImageRepository) this.Camera2StreamConfigurationMap.getValue()).getTransactionImage(str, continuation);
    }
}
