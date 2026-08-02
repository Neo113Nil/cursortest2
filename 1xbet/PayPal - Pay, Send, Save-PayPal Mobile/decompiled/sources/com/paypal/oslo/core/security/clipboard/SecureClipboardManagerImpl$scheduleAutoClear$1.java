package com.paypal.oslo.core.security.clipboard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl$scheduleAutoClear$1", f = "SecureClipboardManagerImpl.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, nl = {175}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class SecureClipboardManagerImpl$scheduleAutoClear$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.DelayKt.m24057delayVtjQ1oo(this.getHighResolutionOutputSizeshNQ4ISI, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.security.LoggerKt.log, "scheduleAutoClear: auto-clear timer fired, clearing clipboard", null, null, 6, null);
        this.getHighSpeedVideoFpsRanges.clearSensitiveClipboard();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl$scheduleAutoClear$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl$scheduleAutoClear$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureClipboardManagerImpl$scheduleAutoClear$1(long j, com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl secureClipboardManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.security.clipboard.SecureClipboardManagerImpl$scheduleAutoClear$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = secureClipboardManagerImpl;
    }
}
