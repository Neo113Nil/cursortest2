package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086B¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/GetProvisionedWalletTokensUseCase;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "starPayClient", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/WalletToken;", "invoke", "(Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetProvisionedWalletTokensUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetProvisionedWalletTokensUseCase() {
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        starPayClient.fetchProvisionedTokens((com.paypal.oslo.feature.starpay.api.OnCompleteListener) new com.paypal.oslo.feature.starpay.api.OnCompleteListener<java.util.List<? extends com.paypal.oslo.feature.starpay.api.Token>>() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProvisionedWalletTokensUseCase$invoke$2$1
            @Override // com.paypal.oslo.feature.starpay.api.OnCompleteListener
            public final void onComplete(com.paypal.oslo.feature.starpay.api.Result<? extends java.util.List<? extends com.paypal.oslo.feature.starpay.api.Token>> result) {
                java.util.ArrayList arrayList;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                if (cancellableContinuationImpl2.isActive()) {
                    kotlinx.coroutines.CancellableContinuation<java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken>> cancellableContinuation = cancellableContinuationImpl2;
                    if (result instanceof com.paypal.oslo.feature.starpay.api.Result.Success) {
                        java.lang.Iterable iterable = (java.lang.Iterable) ((com.paypal.oslo.feature.starpay.api.Result.Success) result).getData();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        java.util.Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetProvisionedWalletTokensUseCaseKt.access$toWalletToken((com.paypal.oslo.feature.starpay.api.Token) it.next()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(arrayList));
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
