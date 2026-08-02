package com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$1", f = "EConsentViewModel.kt", i = {0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {67, 75, 77, 70}, m = "invokeSuspend", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "this_$iv", "it", "$i$f$fold", "$i$a$-fold-EConsentViewModel$onEvent$1$2", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "this_$iv", "it", "$i$f$fold", "$i$a$-fold-EConsentViewModel$onEvent$1$2", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "this_$iv", "$i$f$fold", "$i$a$-fold-EConsentViewModel$onEvent$1$1"}, nl = {125, 77, 79, 71}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class EConsentViewModel$onEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        if (r3.emit(r5, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (r4.emit(r5, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0107, code lost:
    
        if (r3.emit(r4, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        if (r9 != r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession;
        java.lang.String checkoutTokenValueOrEmpty;
        com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase eConsentUseCase;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading(true));
            appSwitchSession = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
            checkoutTokenValueOrEmpty = appSwitchSession.getCheckoutTokenValueOrEmpty();
            eConsentUseCase = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutTokenValueOrEmpty);
            this.getHighSpeedVideoSizesFor = 1;
            obj = eConsentUseCase.invoke(checkoutTokenValueOrEmpty, this);
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                } else if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            checkoutTokenValueOrEmpty = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel = this.getOutputMinFrameDuration;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse eConsentXOResponse = (com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse) ((arrow.core.Either.Right) either).getValue();
            eConsentViewModel.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading(false));
            if (eConsentXOResponse.getStatus()) {
                mutableSharedFlow3 = eConsentViewModel.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect access$nextDestinationAfterSuccess = com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel.access$nextDestinationAfterSuccess(eConsentViewModel);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutTokenValueOrEmpty);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(eConsentXOResponse);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighSpeedVideoSizesFor = 2;
            } else {
                mutableSharedFlow2 = eConsentViewModel.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToError navigateToError = com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToError.INSTANCE;
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutTokenValueOrEmpty);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(eConsentXOResponse);
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getHighSpeedVideoSizesFor = 3;
            }
        } else if (either instanceof arrow.core.Either.Left) {
            eConsentViewModel.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading(false));
            mutableSharedFlow = eConsentViewModel.getInputSizeshNQ4ISI;
            com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToError navigateToError2 = com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Effect.NavigateToError.INSTANCE;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkoutTokenValueOrEmpty);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizesFor = 4;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$1(this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EConsentViewModel$onEvent$1(com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel eConsentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel$onEvent$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = eConsentViewModel;
    }
}
