package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JC\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0002\b\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/Draggable2DState;", "", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/Drag2DScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "delta", "dispatchRawDelta-k-4lQ0M", "(J)V", "dispatchRawDelta"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Draggable2DState {
    /* renamed from: dispatchRawDelta-k-4lQ0M */
    void mo1434dispatchRawDeltak4lQ0M(long delta);

    java.lang.Object drag(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.Drag2DScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    static /* synthetic */ java.lang.Object drag$default(androidx.compose.foundation.gestures.Draggable2DState draggable2DState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drag");
        }
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return draggable2DState.drag(mutatePriority, function2, continuation);
    }
}
