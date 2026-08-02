package com.apollographql.apollo.network.ws;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport", f = "WebSocketNetworkTransport.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8}, l = {149, 154, 156, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 200, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, 241}, m = "supervise", n = {com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "message", "reopenAttemptCount", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "idleJob", "connectionJob", "protocol", "activeMessages", "reopenAttemptCount"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0"})
/* loaded from: classes3.dex */
final class WebSocketNetworkTransport$supervise$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.apollographql.apollo.network.ws.WebSocketNetworkTransport getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizes.getHighSpeedVideoSizes(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketNetworkTransport$supervise$1(com.apollographql.apollo.network.ws.WebSocketNetworkTransport webSocketNetworkTransport, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.WebSocketNetworkTransport$supervise$1> continuation) {
        super(continuation);
        this.getOutputSizes = webSocketNetworkTransport;
    }
}
