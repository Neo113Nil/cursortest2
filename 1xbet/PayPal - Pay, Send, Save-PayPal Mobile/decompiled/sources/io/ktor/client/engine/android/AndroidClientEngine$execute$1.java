package io.ktor.client.engine.android;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.android.AndroidClientEngine", f = "AndroidClientEngine.kt", i = {0, 1, 1, 1, 1}, l = {37, 81, 84}, m = "execute", n = {com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callContext", "requestTime", "outgoingContent"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes17.dex */
final class AndroidClientEngine$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ io.ktor.client.engine.android.AndroidClientEngine getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidClientEngine$execute$1(io.ktor.client.engine.android.AndroidClientEngine androidClientEngine, kotlin.coroutines.Continuation<? super io.ktor.client.engine.android.AndroidClientEngine$execute$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = androidClientEngine;
    }
}
