package com.paypal.oslo.feature.debitcard.servicing.ui.showcard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1", f = "ShowDebitCardBottomSheet.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, nl = {128}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect> uiEffect = this.getOutputFormats.getUiEffect();
            final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoFpsRangesFor;
            final com.paypal.pds.components.BottomSheetController bottomSheetController = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
            final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel showDebitCardViewModel = this.getOutputFormats;
            final java.lang.String str = this.Camera2StreamConfigurationMap;
            final android.content.Context context = this.getHighSpeedVideoSizes;
            this.getOutputMinFrameDuration = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect showDebitCardEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect) obj2;
                    if (showDebitCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.ShowCopiedCardNumberConfirmationToast) {
                        mutableState.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                    } else if (showDebitCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.CloseBottomSheet) {
                        bottomSheetController.hideSheet();
                        function0.invoke();
                    } else if (showDebitCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.RetryLoadCardDetails) {
                        showDebitCardViewModel.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.LoadShowCardDetails(str));
                    } else {
                        if (!(showDebitCardEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEffect.OpenSupportPage)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.debitcard.shared.ui.utils.UrlUtils.INSTANCE.launchUrlInBrowser$debit_card_prodRelease("https://www.paypal.com/us/smarthelp/contact-us", context);
                    }
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel showDebitCardViewModel, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = showDebitCardViewModel;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = function0;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = context;
    }
}
