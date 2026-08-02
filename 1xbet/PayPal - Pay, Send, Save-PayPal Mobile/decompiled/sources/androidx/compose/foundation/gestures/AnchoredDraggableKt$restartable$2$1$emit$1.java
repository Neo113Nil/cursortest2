package androidx.compose.foundation.gestures;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", i = {0}, l = {1552}, m = "emit", n = {"latestInputs"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AnchoredDraggableKt$restartable$2$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1<T> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnchoredDraggableKt$restartable$2$1$emit$1(androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = anonymousClass1;
    }
}
