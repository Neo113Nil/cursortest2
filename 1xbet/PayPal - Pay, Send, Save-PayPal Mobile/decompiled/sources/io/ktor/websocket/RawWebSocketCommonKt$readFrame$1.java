package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommonKt", f = "RawWebSocketCommon.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5}, l = {226, 227, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 247, 255, 263}, m = "readFrame", n = {"$this$readFrame", "maxFrameSize", "lastOpcode", "$this$readFrame", "maxFrameSize", "lastOpcode", "flagsAndOpcode", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "maskAndLength", "fin", "$this$readFrame", "frameType", "maxFrameSize", "flagsAndOpcode", "fin", "length", "frameType", "flagsAndOpcode", "fin", "maskKey"}, s = {"L$0", "J$0", "I$0", "L$0", "J$0", "I$0", "B$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "B$1", "I$0", "L$0", "L$1", "J$0", "B$0", "I$0", "J$1", "L$0", "B$0", "I$0", "I$1"})
/* loaded from: classes17.dex */
final class RawWebSocketCommonKt$readFrame$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    byte getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    byte getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    long getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return io.ktor.websocket.RawWebSocketCommonKt.readFrame(null, 0L, 0, this);
    }

    RawWebSocketCommonKt$readFrame$1(kotlin.coroutines.Continuation<? super io.ktor.websocket.RawWebSocketCommonKt$readFrame$1> continuation) {
        super(continuation);
    }
}
