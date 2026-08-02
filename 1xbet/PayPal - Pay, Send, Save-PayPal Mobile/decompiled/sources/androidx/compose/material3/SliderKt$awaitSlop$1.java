package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", i = {0}, l = {2188}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
/* loaded from: classes.dex */
final class SliderKt$awaitSlop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.compose.material3.SliderKt.m3798access$awaitSlop8vUncbI(null, 0L, 0, this);
    }

    SliderKt$awaitSlop$1(kotlin.coroutines.Continuation<? super androidx.compose.material3.SliderKt$awaitSlop$1> continuation) {
        super(continuation);
    }
}
