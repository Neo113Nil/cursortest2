package com.paypal.oslo.core.permission.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl", f = "PermissionRepositoryImpl.kt", i = {0}, l = {31}, m = "wasPermissionRequestedBefore", n = {com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class PermissionRepositoryImpl$wasPermissionRequestedBefore$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.wasPermissionRequestedBefore(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionRepositoryImpl$wasPermissionRequestedBefore$1(com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl permissionRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl$wasPermissionRequestedBefore$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = permissionRepositoryImpl;
    }
}
