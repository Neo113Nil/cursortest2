package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$onNextClick$1", f = "UserVerificationViewModel.kt", i = {}, l = {380, 381}, m = "invokeSuspend", n = {}, nl = {381, 383}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationViewModel$onNextClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$performCredentialVerification(r5.Camera2StreamConfigurationMap, r5.getHighSpeedVideoFpsRangesFor, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r6 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$validateCredential(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$onNextClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$onNextClick$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationViewModel$onNextClick$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$onNextClick$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = userVerificationViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
