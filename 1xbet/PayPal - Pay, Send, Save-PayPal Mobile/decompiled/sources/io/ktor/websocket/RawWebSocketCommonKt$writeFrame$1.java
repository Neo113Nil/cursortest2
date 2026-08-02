package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {183, 193, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 197, 205, 211}, m = "writeFrame", n = {"$this$writeFrame", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "masking", "length", "$this$writeFrame", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "masking", "length", "formattedLength", "$this$writeFrame", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "masking", "$this$writeFrame", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "masking", "$this$writeFrame", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "maskKey"}, s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "I$1", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "I$0"})
/* loaded from: classes17.dex */
final class RawWebSocketCommonKt$writeFrame$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return io.ktor.websocket.RawWebSocketCommonKt.writeFrame(null, null, false, this);
    }

    RawWebSocketCommonKt$writeFrame$1(kotlin.coroutines.Continuation<? super io.ktor.websocket.RawWebSocketCommonKt$writeFrame$1> continuation) {
        super(continuation);
    }
}
