package com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl", f = "ValidateConnectRepositoryImpl.kt", i = {0, 0}, l = {59}, m = "validateConnect", n = {"request", "graphqlInput"}, nl = {57}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class ValidateConnectRepositoryImpl$validateConnect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.validateConnect(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidateConnectRepositoryImpl$validateConnect$1(com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl validateConnectRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl$validateConnect$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = validateConnectRepositoryImpl;
    }
}
