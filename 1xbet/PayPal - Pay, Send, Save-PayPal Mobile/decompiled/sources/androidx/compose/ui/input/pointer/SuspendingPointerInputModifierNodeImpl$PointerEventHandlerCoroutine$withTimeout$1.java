package androidx.compose.ui.input.pointer;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {890}, m = "withTimeout", n = {"job"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.withTimeout(0L, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = pointerEventHandlerCoroutine;
    }
}
