package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0}, l = {721}, m = "emit", n = {"latestInputs"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableKt$restartable$2$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1<T> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableKt$restartable$2$1$emit$1(androidx.compose.material.AnchoredDraggableKt$restartable$2.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super androidx.compose.material.AnchoredDraggableKt$restartable$2$1$emit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = anonymousClass1;
    }
}
