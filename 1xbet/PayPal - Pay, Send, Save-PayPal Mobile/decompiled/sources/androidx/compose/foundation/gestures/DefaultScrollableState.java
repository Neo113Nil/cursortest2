package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0015\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010$\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010\u0018\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010'\u001a\u00020\u001f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultScrollableState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Lkotlin/Function1;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/MutatePriority;", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "p1", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "(F)F", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "()Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/gestures/ScrollScope;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/foundation/MutatorMutex;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/runtime/MutableState;", "", "Landroidx/compose/runtime/MutableState;", "getInputFormats", "isScrollInProgress", "()Z", "getOutputFormats", "getLastScrolledForward", "getLastScrolledBackward", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DefaultScrollableState implements androidx.compose.foundation.gestures.ScrollableState {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollScope getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.foundation.gestures.ScrollScope() { // from class: androidx.compose.foundation.gestures.DefaultScrollableState$scrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public final float scrollBy(float pixels) {
            androidx.compose.runtime.MutableState mutableState;
            androidx.compose.runtime.MutableState mutableState2;
            if (java.lang.Float.isNaN(pixels)) {
                return 0.0f;
            }
            float floatValue = androidx.compose.foundation.gestures.DefaultScrollableState.this.getHighSpeedVideoSizes().invoke(java.lang.Float.valueOf(pixels)).floatValue();
            mutableState = androidx.compose.foundation.gestures.DefaultScrollableState.this.Camera2StreamConfigurationMap;
            mutableState.setValue(java.lang.Boolean.valueOf(floatValue > 0.0f));
            mutableState2 = androidx.compose.foundation.gestures.DefaultScrollableState.this.getInputFormats;
            mutableState2.setValue(java.lang.Boolean.valueOf(floatValue < 0.0f));
            return floatValue;
        }
    };

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex getHighSpeedVideoSizes = new androidx.compose.foundation.MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.getInputFormats = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2(this, mutatePriority, function2, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float p0) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(java.lang.Float.valueOf(p0)).floatValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.getHighSpeedVideoFpsRanges.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledForward() {
        return this.Camera2StreamConfigurationMap.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledBackward() {
        return this.getInputFormats.getValue().booleanValue();
    }
}
