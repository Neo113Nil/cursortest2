package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 S2\u00020\u0001:\u0001SB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028G@CX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0005R$\u0010%\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00028G@AX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\u0005R+\u0010)\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\u0005R\u0011\u0010-\u001a\u00020*8G¢\u0006\u0006\u001a\u0004\b+\u0010,R+\u00101\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010 \"\u0004\b0\u0010\u0005R\u001a\u00103\u001a\u0002028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u0010\u001eR\u0016\u0010:\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u00108\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010<\u001a\u00020>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001b\u0010G\u001a\u00020A8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010CR\u001b\u0010J\u001a\u00020A8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010CR\u0014\u0010L\u001a\u00020A8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010CR\u0014\u0010N\u001a\u00020A8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010CR\u0016\u0010R\u001a\u0004\u0018\u00010O8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "", "initial", "<init>", "(I)V", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "(F)F", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollTo", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollTo", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "value$delegate", "Landroidx/compose/runtime/MutableIntState;", "getValue", "()I", "setValue", "newMax", "getMaxValue", "setMaxValue$foundation", "maxValue", "viewportSize$delegate", "getViewportSize", "setViewportSize$foundation", "viewportSize", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "contentSize$delegate", "getContentSize$foundation", "setContentSize$foundation", "contentSize", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/runtime/MutableIntState;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/ScrollState$_scrollIndicatorState$1;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/ScrollState$_scrollIndicatorState$1;", "", "isScrollInProgress", "()Z", "canScrollForward$delegate", "Landroidx/compose/runtime/State;", "getCanScrollForward", "canScrollForward", "canScrollBackward$delegate", "getCanScrollBackward", "canScrollBackward", "getLastScrolledForward", "lastScrolledForward", "getLastScrolledBackward", "lastScrolledBackward", "Landroidx/compose/foundation/ScrollIndicatorState;", "getScrollIndicatorState", "()Landroidx/compose/foundation/ScrollIndicatorState;", "scrollIndicatorState", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollState implements androidx.compose.foundation.gestures.ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.ScrollState.Companion INSTANCE = new androidx.compose.foundation.ScrollState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.ScrollState, ?> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.lang.Integer Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.foundation.ScrollState.Camera2StreamConfigurationMap((androidx.compose.foundation.ScrollState) obj2);
            return Camera2StreamConfigurationMap;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.foundation.ScrollState highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.ScrollState.getHighResolutionOutputSizeshNQ4ISI(((java.lang.Integer) obj).intValue());
            return highResolutionOutputSizeshNQ4ISI;
        }
    });
    private float getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState value;

    /* renamed from: viewportSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState viewportSize = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);

    /* renamed from: contentSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState contentSize = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
    private final androidx.compose.foundation.interaction.MutableInteractionSource internalInteractionSource = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.gestures.ScrollableState getHighSpeedVideoFpsRangesFor = androidx.compose.foundation.gestures.ScrollableStateKt.ScrollableState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            float highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.foundation.ScrollState.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.ScrollState.this, ((java.lang.Float) obj).floatValue());
            return java.lang.Float.valueOf(highSpeedVideoFpsRangesFor);
        }
    });

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.foundation.ScrollState$_scrollIndicatorState$1 Camera2StreamConfigurationMap = new androidx.compose.foundation.ScrollIndicatorState() { // from class: androidx.compose.foundation.ScrollState$_scrollIndicatorState$1
        @Override // androidx.compose.foundation.ScrollIndicatorState
        public final int getScrollOffset() {
            return androidx.compose.foundation.ScrollState.this.getValue();
        }

        @Override // androidx.compose.foundation.ScrollIndicatorState
        public final int getContentSize() {
            return androidx.compose.foundation.ScrollState.this.getContentSize$foundation();
        }

        @Override // androidx.compose.foundation.ScrollIndicatorState
        public final int getViewportSize() {
            return androidx.compose.foundation.ScrollState.this.getViewportSize();
        }
    };

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State canScrollForward = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            boolean highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.ScrollState.getHighSpeedVideoFpsRanges(androidx.compose.foundation.ScrollState.this);
            return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
        }
    });

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State canScrollBackward = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            boolean highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.ScrollState.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.ScrollState.this);
            return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
        }
    });

    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.compose.foundation.ScrollState$_scrollIndicatorState$1] */
    public ScrollState(int i) {
        this.value = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
    }

    private final void setValue(int i) {
        this.value.setIntValue(i);
    }

    public final int getValue() {
        return this.value.getIntValue();
    }

    public final int getMaxValue() {
        return this.getHighSpeedVideoSizes.getIntValue();
    }

    public final void setMaxValue$foundation(int i) {
        this.getHighSpeedVideoSizes.setIntValue(i);
        androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
        androidx.compose.runtime.snapshots.Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        androidx.compose.runtime.snapshots.Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getValue() > i) {
                setValue(i);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    public final int getViewportSize() {
        return this.viewportSize.getIntValue();
    }

    public final void setViewportSize$foundation(int i) {
        this.viewportSize.setIntValue(i);
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getContentSize$foundation() {
        return this.contentSize.getIntValue();
    }

    public final void setContentSize$foundation(int i) {
        this.contentSize.setIntValue(i);
    }

    /* renamed from: getInternalInteractionSource$foundation, reason: from getter */
    public final androidx.compose.foundation.interaction.MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.ScrollState scrollState, float f) {
        float value = scrollState.getValue() + f + scrollState.getHighResolutionOutputSizeshNQ4ISI;
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(value, 0.0f, scrollState.getMaxValue());
        boolean z = value == coerceIn;
        float value2 = coerceIn - scrollState.getValue();
        int round = java.lang.Math.round(value2);
        scrollState.setValue(scrollState.getValue() + round);
        scrollState.getHighResolutionOutputSizeshNQ4ISI = value2 - round;
        return !z ? value2 : f;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll = this.getHighSpeedVideoFpsRangesFor.scroll(mutatePriority, function2, continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float dispatchRawDelta(float delta) {
        return this.getHighSpeedVideoFpsRangesFor.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean isScrollInProgress() {
        return this.getHighSpeedVideoFpsRangesFor.isScrollInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.foundation.ScrollState scrollState) {
        return scrollState.getValue() < scrollState.getMaxValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((java.lang.Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.ScrollState scrollState) {
        return scrollState.getValue() > 0;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((java.lang.Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledForward() {
        return this.getHighSpeedVideoFpsRangesFor.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getLastScrolledBackward() {
        return this.getHighSpeedVideoFpsRangesFor.getLastScrolledBackward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final androidx.compose.foundation.ScrollIndicatorState getScrollIndicatorState() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateScrollTo$default(androidx.compose.foundation.ScrollState scrollState, int i, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = new androidx.compose.animation.core.SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i, animationSpec, continuation);
    }

    public final java.lang.Object animateScrollTo(int i, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object animateScrollBy = androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(this, i - getValue(), animationSpec, continuation);
        return animateScrollBy == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateScrollBy : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object scrollTo(int i, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        return androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(this, i - getValue(), continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/ScrollState;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.ScrollState, ?> getSaver() {
            return androidx.compose.foundation.ScrollState.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Integer Camera2StreamConfigurationMap(androidx.compose.foundation.ScrollState scrollState) {
        return java.lang.Integer.valueOf(scrollState.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.ScrollState getHighResolutionOutputSizeshNQ4ISI(int i) {
        return new androidx.compose.foundation.ScrollState(i);
    }
}
