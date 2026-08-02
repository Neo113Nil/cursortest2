package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00178G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0018\u0010\u001cR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 "}, d2 = {"Landroidx/compose/material/SliderDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Lkotlin/Function1;", "", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "p1", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "(F)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "()Lkotlin/jvm/functions/Function1;", "", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRanges", "()Z", "(Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/DragScope;", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/MutatorMutex;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SliderDraggableState implements androidx.compose.foundation.gestures.DraggableState {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.MutableState Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.DragScope getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.gestures.DragScope() { // from class: androidx.compose.material.SliderDraggableState$dragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public final void dragBy(float pixels) {
            androidx.compose.material.SliderDraggableState.this.getHighSpeedVideoSizes().invoke(java.lang.Float.valueOf(pixels));
        }
    };

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public SliderDraggableState(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1) {
        this.getHighSpeedVideoSizes = function1;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(boolean z) {
        this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHighSpeedVideoFpsRanges() {
        return ((java.lang.Boolean) this.Camera2StreamConfigurationMap.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final java.lang.Object drag(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.DragScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.material.SliderDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float p0) {
        this.getHighSpeedVideoSizes.invoke(java.lang.Float.valueOf(p0));
    }
}
