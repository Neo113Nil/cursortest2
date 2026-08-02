package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isCompleted"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$2", f = "ProcessAuthIntentUseCaseImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ProcessAuthIntentUseCaseImpl$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$2) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$2 processAuthIntentUseCaseImpl$invoke$2 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$2(continuation);
        processAuthIntentUseCaseImpl$invoke$2.getHighResolutionOutputSizeshNQ4ISI = ((java.lang.Boolean) obj).booleanValue();
        return processAuthIntentUseCaseImpl$invoke$2;
    }

    ProcessAuthIntentUseCaseImpl$invoke$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
    }
}
