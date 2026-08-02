package com.zettle.sdk.core.auth;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.ZettleServicesImpl", f = "ServiceProvider.kt", i = {0, 0, 0, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 186}, m = "refreshServices", n = {"this", "client", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes16.dex */
final class ZettleServicesImpl$refreshServices$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.zettle.sdk.core.auth.ZettleServicesImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.refreshServices(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZettleServicesImpl$refreshServices$1(com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.ZettleServicesImpl$refreshServices$1> continuation) {
        super(continuation);
        this.getInputFormats = zettleServicesImpl;
    }
}
