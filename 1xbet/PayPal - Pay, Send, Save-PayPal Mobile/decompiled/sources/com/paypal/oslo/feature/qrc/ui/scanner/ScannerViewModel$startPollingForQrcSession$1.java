package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$startPollingForQrcSession$1", f = "ScannerViewModel.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ScannerViewModel$startPollingForQrcSession$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pollQrcSessionUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error, com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action>> invoke = pollQrcSessionUseCase.invoke(this.getHighSpeedVideoFpsRanges);
            final com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$startPollingForQrcSession$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    arrow.core.Either either = ((arrow.core.Ior) obj2).toEither();
                    com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel2 = com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.this;
                    if (either instanceof arrow.core.Either.Right) {
                        com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action action = (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action) ((arrow.core.Either.Right) either).getValue();
                        if (action.isTerminalPollingEvent()) {
                            scannerViewModel2.stopPolling();
                            scannerViewModel2.handleIntent(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.access$handleSessionResultAction(scannerViewModel2, action));
                        }
                    } else if (either instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel.access$handlePollingError(scannerViewModel2, (com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error) ((arrow.core.Either.Left) either).getValue());
                    } else {
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
        return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$startPollingForQrcSession$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$startPollingForQrcSession$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerViewModel$startPollingForQrcSession$1(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel, com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel$startPollingForQrcSession$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = scannerViewModel;
        this.getHighSpeedVideoFpsRanges = pollingSessionInfo;
    }
}
