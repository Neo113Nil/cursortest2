package com.paypal.oslo.feature.directdeposit.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl", f = "SmartRoutePreferencesRepositoryImpl.kt", i = {0}, l = {41}, m = "getSmartRoutePreferences", n = {"query"}, nl = {42}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class SmartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getSmartRoutePreferences(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1(com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl smartRoutePreferencesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.data.repository.SmartRoutePreferencesRepositoryImpl$getSmartRoutePreferences$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = smartRoutePreferencesRepositoryImpl;
    }
}
