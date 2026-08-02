package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE}, m = "yieldFrames", n = {"$this$yieldFrames", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class DebugCoroutineInfoImpl$yieldFrames$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.access$yieldFrames(this.getOutputMinFrameDuration, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugCoroutineInfoImpl$yieldFrames$1(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = debugCoroutineInfoImpl;
    }
}
