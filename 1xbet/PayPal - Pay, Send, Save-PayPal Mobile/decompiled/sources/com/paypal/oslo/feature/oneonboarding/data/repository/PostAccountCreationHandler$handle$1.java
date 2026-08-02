package com.paypal.oslo.feature.oneonboarding.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler", f = "PostAccountCreationHandler.kt", i = {0}, l = {40}, m = "handle", n = {"tokenFragment"}, nl = {41}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class PostAccountCreationHandler$handle$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.handle(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostAccountCreationHandler$handle$1(com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler postAccountCreationHandler, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.data.repository.PostAccountCreationHandler$handle$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = postAccountCreationHandler;
    }
}
