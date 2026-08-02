package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR+\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010("}, d2 = {"Lcom/paypal/pds/components/SliderDraggableState;", "Landroidx/compose/foundation/gestures/DraggableState;", "Lkotlin/Function1;", "", "", "onDelta", "onDragStart", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/DragScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "drag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "dispatchRawDelta", "(F)V", com.daon.sdk.face.license.License.FEATURE_POSITION, "startDragAt", "Lkotlin/jvm/functions/Function1;", "getOnDelta", "()Lkotlin/jvm/functions/Function1;", "getOnDragStart", "", "<set-?>", "isDragging$delegate", "Landroidx/compose/runtime/MutableState;", "isDragging", "()Z", "setDragging", "(Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/gestures/DragScope;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/MutatorMutex;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SliderDraggableState implements androidx.compose.foundation.gestures.DraggableState {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.DragScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex getHighSpeedVideoFpsRanges;

    /* renamed from: isDragging$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isDragging;
    private final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> onDelta;
    private final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> onDragStart;

    /* JADX WARN: Multi-variable type inference failed */
    public SliderDraggableState(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.onDelta = function1;
        this.onDragStart = function12;
        this.isDragging = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.getHighSpeedVideoFpsRangesFor = new androidx.compose.foundation.gestures.DragScope() { // from class: com.paypal.pds.components.SliderDraggableState$dragScope$1
            @Override // androidx.compose.foundation.gestures.DragScope
            public final void dragBy(float pixels) {
                com.paypal.pds.components.SliderDraggableState.this.getOnDelta().invoke(java.lang.Float.valueOf(pixels));
            }
        };
        this.getHighSpeedVideoFpsRanges = new androidx.compose.foundation.MutatorMutex();
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getOnDelta() {
        return this.onDelta;
    }

    public /* synthetic */ SliderDraggableState(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SliderDraggableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                ((java.lang.Float) obj).floatValue();
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function12);
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit> getOnDragStart() {
        return this.onDragStart;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragging(boolean z) {
        this.isDragging.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDragging() {
        return ((java.lang.Boolean) this.isDragging.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final java.lang.Object drag(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.DragScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.paypal.pds.components.SliderDraggableState$drag$2(this, mutatePriority, function2, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final void dispatchRawDelta(float delta) {
        this.onDelta.invoke(java.lang.Float.valueOf(delta));
    }

    public final void startDragAt(float position) {
        this.onDragStart.invoke(java.lang.Float.valueOf(position));
    }
}
