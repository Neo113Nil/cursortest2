package com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$authenticate$1", f = "OneShotViewModel.kt", i = {1, 1, 1, 1, 2, 2, 2, 2}, l = {96, 101, 98}, m = "invokeSuspend", n = {"this_$iv", "authResponse", "$i$f$fold", "$i$a$-fold-OneShotViewModel$authenticate$1$2", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-OneShotViewModel$authenticate$1$1"}, nl = {206, 102, 99}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class OneShotViewModel$authenticate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (r4.emit(r1, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel.access$handleError(r1, r3, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        if (r7 != r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.GetAuthDataUseCase getAuthDataUseCase;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Effect highResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getAuthDataUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = 1;
            obj = getAuthDataUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel = this.getInputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse = (com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse) ((arrow.core.Either.Right) either).getValue();
            mutableSharedFlow = oneShotViewModel.getHighSpeedVideoSizesFor;
            highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel.getHighResolutionOutputSizeshNQ4ISI(authenticationXOResponse);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationXOResponse);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity nativeXOErrorEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity) ((arrow.core.Either.Left) either).getValue();
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(nativeXOErrorEntity);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getHighSpeedVideoSizes = 3;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$authenticate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$authenticate$1(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneShotViewModel$authenticate$1(com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel$authenticate$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = oneShotViewModel;
    }
}
