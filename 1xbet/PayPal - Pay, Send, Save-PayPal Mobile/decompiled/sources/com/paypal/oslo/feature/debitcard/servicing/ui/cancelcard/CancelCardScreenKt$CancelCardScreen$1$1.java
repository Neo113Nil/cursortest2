package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt$CancelCardScreen$1$1", f = "CancelCardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CancelCardScreenKt$CancelCardScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoFpsRangesFor.getProductName() == com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD) {
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRanges;
            final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo = this.getHighSpeedVideoFpsRangesFor;
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt$CancelCardScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt$CancelCardScreen$1$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else {
            com.paypal.oslo.core.navigation.AppNavigator appNavigator2 = this.getHighSpeedVideoFpsRanges;
            final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo2 = this.getHighSpeedVideoFpsRangesFor;
            appNavigator2.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt$CancelCardScreen$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt$CancelCardScreen$1$1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(new com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination("DEFAULT", cancelCardInfo));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(new com.paypal.oslo.feature.debitcard.servicing.di.CancelCardReasonSelectionDestination(cancelCardInfo));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt$CancelCardScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt$CancelCardScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelCardScreenKt$CancelCardScreen$1$1(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardScreenKt$CancelCardScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cancelCardInfo;
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }
}
