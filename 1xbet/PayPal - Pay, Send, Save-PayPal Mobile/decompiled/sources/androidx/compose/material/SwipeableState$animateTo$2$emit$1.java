package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableState$animateTo$2", f = "Swipeable.kt", i = {0}, l = {327}, m = "emit", n = {"anchors"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class SwipeableState$animateTo$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material.SwipeableState$animateTo$2<T> getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeableState$animateTo$2$emit$1(androidx.compose.material.SwipeableState$animateTo$2<? super T> swipeableState$animateTo$2, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableState$animateTo$2$emit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = swipeableState$animateTo$2;
    }
}
