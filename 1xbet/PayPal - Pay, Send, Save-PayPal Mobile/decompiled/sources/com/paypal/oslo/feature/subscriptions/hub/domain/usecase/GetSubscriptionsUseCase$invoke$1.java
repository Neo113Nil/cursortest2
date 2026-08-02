package com.paypal.oslo.feature.subscriptions.hub.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase", f = "GetSubscriptionsUseCase.kt", i = {}, l = {57}, m = "invoke", n = {}, nl = {58}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class GetSubscriptionsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetSubscriptionsUseCase$invoke$1(com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase getSubscriptionsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.hub.domain.usecase.GetSubscriptionsUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getSubscriptionsUseCase;
    }
}
