package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Lkotlin/Function1;", "", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "p1", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "(F)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "()Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/gestures/DragScope;", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/MutatorMutex;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultDraggableState implements androidx.compose.foundation.gestures.DraggableState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.DragScope getHighSpeedVideoFpsRanges = new androidx.compose.foundation.gestures.DragScope() { // from class: androidx.compose.foundation.gestures.DefaultDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public final void dragBy(float pixels) {
            androidx.compose.foundation.gestures.DefaultDraggableState.this.getHighSpeedVideoFpsRanges().invoke(java.lang.Float.valueOf(pixels));
        }
    };

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex Camera2StreamConfigurationMap = new androidx.compose.foundation.MutatorMutex();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggableState(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final java.lang.Object drag(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.DragScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.DefaultDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(java.lang.Float.valueOf(p0));
    }
}
