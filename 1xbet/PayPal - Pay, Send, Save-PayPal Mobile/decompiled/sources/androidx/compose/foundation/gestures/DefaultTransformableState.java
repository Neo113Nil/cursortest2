package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B6\u0012-\u0010\u0007\u001a)\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJA\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\n2'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0002\b\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R>\u0010\u0017\u001a)\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010!\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/foundation/gestures/DefaultTransformableState;", "Landroidx/compose/foundation/gestures/TransformableState;", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "Landroidx/compose/ui/geometry/Offset;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/foundation/MutatePriority;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "p1", "transform", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function3;", "getHighResolutionOutputSizeshNQ4ISI", "()Lkotlin/jvm/functions/Function3;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/gestures/TransformScope;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/runtime/MutableState;", "", "Landroidx/compose/runtime/MutableState;", "isTransformInProgress", "()Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultTransformableState implements androidx.compose.foundation.gestures.TransformableState {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.ui.geometry.Offset, java.lang.Float, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.TransformScope Camera2StreamConfigurationMap = new androidx.compose.foundation.gestures.TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
        @Override // androidx.compose.foundation.gestures.TransformScope
        /* renamed from: transformBy-d-4ec7I, reason: not valid java name */
        public final void mo1439transformByd4ec7I(float zoomChange, long panChange, float rotationChange) {
            androidx.compose.foundation.gestures.DefaultTransformableState.this.getHighResolutionOutputSizeshNQ4ISI().invoke(java.lang.Float.valueOf(zoomChange), androidx.compose.ui.geometry.Offset.m5741boximpl(panChange), java.lang.Float.valueOf(rotationChange));
        }
    };
    private final androidx.compose.foundation.MutatorMutex getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.MutatorMutex();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState(kotlin.jvm.functions.Function3<? super java.lang.Float, ? super androidx.compose.ui.geometry.Offset, ? super java.lang.Float, kotlin.Unit> function3) {
        this.getHighSpeedVideoFpsRanges = function3;
    }

    public final kotlin.jvm.functions.Function3<java.lang.Float, androidx.compose.ui.geometry.Offset, java.lang.Float, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public final java.lang.Object transform(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.TransformScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.DefaultTransformableState$transform$2(this, mutatePriority, function2, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public final boolean isTransformInProgress() {
        return this.getHighSpeedVideoSizes.getValue().booleanValue();
    }
}
