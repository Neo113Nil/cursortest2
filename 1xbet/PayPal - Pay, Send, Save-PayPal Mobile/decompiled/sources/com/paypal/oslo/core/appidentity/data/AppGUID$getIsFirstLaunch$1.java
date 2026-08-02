package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.appidentity.data.AppGUID", f = "AppGUID.kt", i = {}, l = {91}, m = "getIsFirstLaunch", n = {}, nl = {92}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class AppGUID$getIsFirstLaunch$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.appidentity.data.AppGUID getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getIsFirstLaunch(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppGUID$getIsFirstLaunch$1(com.paypal.oslo.core.appidentity.data.AppGUID appGUID, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.appidentity.data.AppGUID$getIsFirstLaunch$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appGUID;
    }
}
