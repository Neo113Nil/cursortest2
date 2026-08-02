package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.AddBankManualInfoRouteKt$ShowBankInfoForm$1$1", f = "AddBankManualInfoRoute.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddBankManualInfoRouteKt$ShowBankInfoForm$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState>, kotlin.Unit> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            this.getHighSpeedVideoFpsRanges.invoke(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.initializeFieldStates(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.getUserGivenName(), this.getHighResolutionOutputSizeshNQ4ISI.getUserSurname()));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.AddBankManualInfoRouteKt$ShowBankInfoForm$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.AddBankManualInfoRouteKt$ShowBankInfoForm$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddBankManualInfoRouteKt$ShowBankInfoForm$1$1(java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState> map, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.DynamicFieldState>, kotlin.Unit> function1, com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition bankDefinition, com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.viewmodel.ManualAddBankViewModel.State.Content content, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.AddBankManualInfoRouteKt$ShowBankInfoForm$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = map;
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = bankDefinition;
        this.getHighResolutionOutputSizeshNQ4ISI = content;
    }
}
