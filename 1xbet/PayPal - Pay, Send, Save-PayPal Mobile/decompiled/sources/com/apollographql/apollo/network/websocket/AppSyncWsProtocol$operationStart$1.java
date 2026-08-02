package com.apollographql.apollo.network.websocket;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.websocket.AppSyncWsProtocol", f = "AppSyncWsProtocol.kt", i = {}, l = {41}, m = "operationStart", n = {}, s = {})
/* loaded from: classes7.dex */
final class AppSyncWsProtocol$operationStart$1<D extends com.apollographql.apollo.api.Operation.Data> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.apollographql.apollo.network.websocket.AppSyncWsProtocol getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.operationStart(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSyncWsProtocol$operationStart$1(com.apollographql.apollo.network.websocket.AppSyncWsProtocol appSyncWsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.websocket.AppSyncWsProtocol$operationStart$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = appSyncWsProtocol;
    }
}
