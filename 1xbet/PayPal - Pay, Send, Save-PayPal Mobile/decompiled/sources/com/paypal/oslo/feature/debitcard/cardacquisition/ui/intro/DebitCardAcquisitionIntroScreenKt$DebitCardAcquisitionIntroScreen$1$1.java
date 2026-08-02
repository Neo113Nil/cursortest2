package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/debitcard/servicing/navigation/result/DebitCardWebViewSuccessNavResult$UserEnrolled;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1", f = "DebitCardAcquisitionIntroScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled userEnrolled = (com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
        final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel = this.getHighSpeedVideoFpsRanges;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel.this, userEnrolled, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled userEnrolled, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination(debitCardAcquisitionIntroViewModel.getProductName(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) null, (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction) null, userEnrolled.getAction(), 126, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitCardWebViewSuccessNavResult.UserEnrolled userEnrolled, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1) create(userEnrolled, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1 debitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1 = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        debitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return debitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.DebitCardAcquisitionIntroViewModel debitCardAcquisitionIntroViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.DebitCardAcquisitionIntroScreenKt$DebitCardAcquisitionIntroScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRanges = debitCardAcquisitionIntroViewModel;
    }
}
