package com.paypal.oslo.feature.p2p.ui.transfer;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt$TransferScreen$7$1", f = "TransferScreen.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class TransferScreenKt$TransferScreen$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect> uiEffect = this.Camera2StreamConfigurationMap.getUiEffect();
            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> function13 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (uiEffect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt$TransferScreen$7$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect transferUiEffect = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect) obj2;
                    if (transferUiEffect instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview) {
                        com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview navigateToReview = (com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToReview) transferUiEffect;
                        java.lang.String intent = navigateToReview.getIntent();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend)) {
                            function1.invoke(navigateToReview.getAmount());
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest)) {
                            function12.invoke(navigateToReview.getAmount());
                        }
                    } else if (transferUiEffect instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker) {
                        function13.invoke(((com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.NavigateToCurrencyPicker) transferUiEffect).getCurrencyPickerDestination());
                    } else if (!(transferUiEffect instanceof com.paypal.oslo.feature.p2p.ui.transfer.state.TransferUiEffect.ShowError)) {
                        throw new kotlin.NoWhenBranchMatchedException();
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
        return ((com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt$TransferScreen$7$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt$TransferScreen$7$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TransferScreenKt$TransferScreen$7$1(com.paypal.oslo.feature.p2p.ui.transfer.viewmodels.TransferViewModel transferViewModel, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> function13, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt$TransferScreen$7$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = transferViewModel;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = function12;
        this.getHighSpeedVideoFpsRangesFor = function13;
    }
}
