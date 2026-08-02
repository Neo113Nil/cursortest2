package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010 \u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollable2DState;", "Landroidx/compose/foundation/gestures/Scrollable2DState;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/Scroll2DScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p1", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta-MK-Hz9U", "(J)J", "dispatchRawDelta", "", "canScroll-k-4lQ0M", "(J)Z", "canScroll", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "()Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/gestures/Scroll2DScope;", "Landroidx/compose/foundation/MutatorMutex;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "isScrollInProgress", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultScrollable2DState implements androidx.compose.foundation.gestures.Scrollable2DState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.Scroll2DScope Camera2StreamConfigurationMap = new androidx.compose.foundation.gestures.Scroll2DScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollable2DState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.Scroll2DScope
        /* renamed from: scrollBy-MK-Hz9U, reason: not valid java name */
        public final long mo1438scrollByMKHz9U(long delta) {
            if (java.lang.Float.isNaN(java.lang.Float.intBitsToFloat((int) (delta >> 32))) || java.lang.Float.isNaN(java.lang.Float.intBitsToFloat((int) (4294967295L & delta)))) {
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }
            return androidx.compose.foundation.gestures.DefaultScrollable2DState.this.getHighSpeedVideoFpsRangesFor().invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(delta)).m5762unboximpl();
        }
    };

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex getHighSpeedVideoSizes = new androidx.compose.foundation.MutatorMutex();
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    /* renamed from: canScroll-k-4lQ0M, reason: not valid java name */
    public final boolean mo1436canScrollk4lQ0M(long p0) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollable2DState(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    public final java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.Scroll2DScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2(this, mutatePriority, function2, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    /* renamed from: dispatchRawDelta-MK-Hz9U, reason: not valid java name */
    public final long mo1437dispatchRawDeltaMKHz9U(long p0) {
        return this.getHighSpeedVideoFpsRanges.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(p0)).m5762unboximpl();
    }

    @Override // androidx.compose.foundation.gestures.Scrollable2DState
    public final boolean isScrollInProgress() {
        return this.getHighSpeedVideoFpsRangesFor.getValue().booleanValue();
    }
}
