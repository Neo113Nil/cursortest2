package com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$onDirectDebitToggle$1", f = "DirectDepositSummaryViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositSummaryViewModel$onDirectDebitToggle$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.directdeposit.domain.usecase.UpdateDirectDebitStatusUseCase updateDirectDebitStatusUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.reduce(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.$r8$lambda$lyscAzetdeJiFa4jTnjaAYoWyMw(r1, (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) obj2);
                }
            });
            updateDirectDebitStatusUseCase = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = updateDirectDebitStatusUseCase.invoke(this.Camera2StreamConfigurationMap, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel = this.getHighSpeedVideoSizes;
        boolean z = this.Camera2StreamConfigurationMap;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.access$handleDirectDebitError(directDepositSummaryViewModel, (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue(), z);
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.access$handleDirectDebitSuccess(directDepositSummaryViewModel, ((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue(), z);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.access$handleDirectDebitPartialSuccess(directDepositSummaryViewModel, (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue(), ((java.lang.Boolean) both.getRightValue()).booleanValue(), z);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$onDirectDebitToggle$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$onDirectDebitToggle$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectDepositSummaryViewModel$onDirectDebitToggle$1(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, boolean z, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel$onDirectDebitToggle$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = directDepositSummaryViewModel;
        this.Camera2StreamConfigurationMap = z;
    }
}
