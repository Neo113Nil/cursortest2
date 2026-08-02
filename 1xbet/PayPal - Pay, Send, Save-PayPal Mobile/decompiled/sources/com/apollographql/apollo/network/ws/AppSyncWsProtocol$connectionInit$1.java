package com.apollographql.apollo.network.ws;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol", f = "AppSyncWsProtocol.kt", i = {}, l = {40, 42}, m = "connectionInit", n = {}, s = {})
/* loaded from: classes7.dex */
final class AppSyncWsProtocol$connectionInit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.apollographql.apollo.network.ws.AppSyncWsProtocol getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.connectionInit(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSyncWsProtocol$connectionInit$1(com.apollographql.apollo.network.ws.AppSyncWsProtocol appSyncWsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.AppSyncWsProtocol$connectionInit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appSyncWsProtocol;
    }
}
