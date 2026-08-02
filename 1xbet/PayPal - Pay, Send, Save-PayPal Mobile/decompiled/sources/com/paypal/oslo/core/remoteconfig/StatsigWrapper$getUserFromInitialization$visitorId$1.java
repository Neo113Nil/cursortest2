package com.paypal.oslo.core.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.StatsigWrapper$getUserFromInitialization$visitorId$1", f = "StatsigWrapper.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class StatsigWrapper$getUserFromInitialization$visitorId$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.StatsigWrapper Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        appIdentity = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object appGuid = appIdentity.appGuid(this);
        return appGuid == coroutine_suspended ? coroutine_suspended : appGuid;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return ((com.paypal.oslo.core.remoteconfig.StatsigWrapper$getUserFromInitialization$visitorId$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.remoteconfig.StatsigWrapper$getUserFromInitialization$visitorId$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigWrapper$getUserFromInitialization$visitorId$1(com.paypal.oslo.core.remoteconfig.StatsigWrapper statsigWrapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.StatsigWrapper$getUserFromInitialization$visitorId$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = statsigWrapper;
    }
}
