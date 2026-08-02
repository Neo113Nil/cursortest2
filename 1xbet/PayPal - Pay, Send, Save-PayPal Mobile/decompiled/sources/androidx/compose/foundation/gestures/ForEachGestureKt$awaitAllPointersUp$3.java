package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0}, l = {84}, m = "awaitAllPointersUp", n = {"$this$awaitAllPointersUp", "pass"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class ForEachGestureKt$awaitAllPointersUp$3 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(null, null, this);
    }

    ForEachGestureKt$awaitAllPointersUp$3(kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3> continuation) {
        super(continuation);
    }
}
