package io.ktor.websocket;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon", f = "RawWebSocketCommon.kt", i = {0}, l = {131, 134, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m = "flush", n = {"it"}, s = {"L$1"})
/* loaded from: classes3.dex */
final class RawWebSocketCommon$flush$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.websocket.RawWebSocketCommon getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.flush(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$flush$1(io.ktor.websocket.RawWebSocketCommon rawWebSocketCommon, kotlin.coroutines.Continuation<? super io.ktor.websocket.RawWebSocketCommon$flush$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = rawWebSocketCommon;
    }
}
