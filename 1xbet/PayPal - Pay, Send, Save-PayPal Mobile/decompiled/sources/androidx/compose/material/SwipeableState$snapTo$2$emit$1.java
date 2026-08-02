package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", i = {}, l = {310}, m = "emit", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SwipeableState$snapTo$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material.SwipeableState$snapTo$2<T> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeableState$snapTo$2$emit$1(androidx.compose.material.SwipeableState$snapTo$2<? super T> swipeableState$snapTo$2, kotlin.coroutines.Continuation<? super androidx.compose.material.SwipeableState$snapTo$2$emit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = swipeableState$snapTo$2;
    }
}
