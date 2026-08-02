package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086B¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetWalletStatusUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "Lcom/paypal/oslo/feature/starpay/api/WalletStatus;", "invoke", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetWalletStatusUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetWalletStatusUseCase() {
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.starpay.api.WalletStatus> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        starPayClient.checkWalletStatus(new com.paypal.oslo.feature.starpay.api.OnCompleteListener<com.paypal.oslo.feature.starpay.api.WalletStatus>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase$invoke$2$1
            @Override // com.paypal.oslo.feature.starpay.api.OnCompleteListener
            public final void onComplete(com.paypal.oslo.feature.starpay.api.Result<? extends com.paypal.oslo.feature.starpay.api.WalletStatus> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                if (cancellableContinuationImpl2.isActive()) {
                    kotlinx.coroutines.CancellableContinuation<com.paypal.oslo.feature.starpay.api.WalletStatus> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(result instanceof com.paypal.oslo.feature.starpay.api.Result.Success ? (com.paypal.oslo.feature.starpay.api.WalletStatus) ((com.paypal.oslo.feature.starpay.api.Result.Success) result).getData() : null));
                }
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
