package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$2$1", f = "ManageWalletScreen.kt", i = {0}, l = {441}, m = "invokeSuspend", n = {"$i$f$suspendCancellableCoroutine"}, nl = {451}, s = {"I$0"}, v = 2)
/* loaded from: classes12.dex */
final class ManageWalletScreenKt$ManageWalletScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.starpay.api.StarPayClient getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = starPayClient;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$2$1 manageWalletScreenKt$ManageWalletScreen$2$1 = this;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(manageWalletScreenKt$ManageWalletScreen$2$1), 1);
            cancellableContinuationImpl.initCancellability();
            final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            starPayClient.fetchProvisionedTokens((com.paypal.oslo.feature.starpay.api.OnCompleteListener) new com.paypal.oslo.feature.starpay.api.OnCompleteListener<java.util.List<? extends com.paypal.oslo.feature.starpay.api.Token>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$2$1$tokenIds$1$1
                @Override // com.paypal.oslo.feature.starpay.api.OnCompleteListener
                public final void onComplete(com.paypal.oslo.feature.starpay.api.Result<? extends java.util.List<? extends com.paypal.oslo.feature.starpay.api.Token>> result) {
                    java.util.Set emptySet;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                    if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Success)) {
                        if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        emptySet = kotlin.collections.SetsKt.emptySet();
                    } else {
                        java.lang.Iterable iterable = (java.lang.Iterable) ((com.paypal.oslo.feature.starpay.api.Result.Success) result).getData();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        java.util.Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((com.paypal.oslo.feature.starpay.api.Token) it.next()).getIssuerTokenId());
                        }
                        emptySet = kotlin.collections.CollectionsKt.toSet(arrayList);
                    }
                    if (cancellableContinuationImpl2.isActive()) {
                        kotlinx.coroutines.CancellableContinuation<java.util.Set<java.lang.String>> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(emptySet));
                    }
                }
            });
            obj = cancellableContinuationImpl.getResult();
            if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(manageWalletScreenKt$ManageWalletScreen$2$1);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ProvisionedTokensLoaded((java.util.Set) obj));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageWalletScreenKt$ManageWalletScreen$2$1(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = manageWalletViewModel;
        this.getHighSpeedVideoFpsRanges = starPayClient;
    }
}
