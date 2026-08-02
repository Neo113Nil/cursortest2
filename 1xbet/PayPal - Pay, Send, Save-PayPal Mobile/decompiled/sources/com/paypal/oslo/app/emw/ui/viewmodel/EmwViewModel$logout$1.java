package com.paypal.oslo.app.emw.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$logout$1", f = "EmwViewModel.kt", i = {2}, l = {92, 93, 98}, m = "invokeSuspend", n = {"e"}, nl = {93, 94, 100}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class EmwViewModel$logout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r8.emit(kotlin.Unit.INSTANCE, r7) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r1.emit(kotlin.Unit.INSTANCE, r7) != r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.identity.api.IdentitySession identitySession;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        try {
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.app.LoggerKt.log.e("EMW logout failed", e2);
            mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e2);
            this.Camera2StreamConfigurationMap = 3;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            identitySession = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            if (com.paypal.oslo.feature.identity.api.IdentitySession.logout$default(identitySession, false, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mutableSharedFlow2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$logout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$logout$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmwViewModel$logout$1(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$logout$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = emwViewModel;
    }
}
