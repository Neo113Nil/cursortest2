package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", i = {0, 0}, l = {299}, m = "awaitFirstCtrlMouseScroll", n = {"$this$awaitFirstCtrlMouseScroll", "scrollConfig"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class TransformableKt$awaitFirstCtrlMouseScroll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.TransformableKt.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    TransformableKt$awaitFirstCtrlMouseScroll$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1> continuation) {
        super(continuation);
    }
}
