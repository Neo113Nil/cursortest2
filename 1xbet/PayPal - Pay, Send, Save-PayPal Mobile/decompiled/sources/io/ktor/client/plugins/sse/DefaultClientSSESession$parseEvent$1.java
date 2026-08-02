package io.ktor.client.plugins.sse;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession", f = "DefaultClientSSESession.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {161, 163, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "parseEvent", n = {"$this$parseEvent", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "comments", "curRetry", "lastEventId", "wasData", "wasComments", "$this$parseEvent", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "comments", "curRetry", "lastEventId", "wasData", "wasComments", "$this$parseEvent", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "comments", "eventType", "curRetry", "lastEventId", "wasData", "wasComments"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class DefaultClientSSESession$parseEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ io.ktor.client.plugins.sse.DefaultClientSSESession getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputStallDuration.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$parseEvent$1(io.ktor.client.plugins.sse.DefaultClientSSESession defaultClientSSESession, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.sse.DefaultClientSSESession$parseEvent$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = defaultClientSSESession;
    }
}
