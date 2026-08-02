package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.TermsConditionsBottomSheetKt$TermsConditionsBottomSheet$2$1", f = "TermsConditionsBottomSheet.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, nl = {69}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class TermsConditionsBottomSheetKt$TermsConditionsBottomSheet$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsEffect> uiEffect = this.Camera2StreamConfigurationMap.getUiEffect();
            final android.content.Context context = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.TermsConditionsBottomSheetKt$TermsConditionsBottomSheet$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsEffect termsConditionsEffect = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsEffect) obj2;
                    if (!(termsConditionsEffect instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsEffect.NavigateToBrowser)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.debitcard.shared.ui.utils.UrlUtils.INSTANCE.launchUrlInBrowser$debit_card_prodRelease(((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsEffect.NavigateToBrowser) termsConditionsEffect).getUrl(), context);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.TermsConditionsBottomSheetKt$TermsConditionsBottomSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.TermsConditionsBottomSheetKt$TermsConditionsBottomSheet$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TermsConditionsBottomSheetKt$TermsConditionsBottomSheet$2$1(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel termsConditionsViewModel, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.TermsConditionsBottomSheetKt$TermsConditionsBottomSheet$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = termsConditionsViewModel;
        this.getHighSpeedVideoSizes = context;
    }
}
