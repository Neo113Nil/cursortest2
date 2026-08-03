package androidx.compose.foundation;

/* compiled from: Scroll.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010+\u001a\u00020,2\u0006\u0010\"\u001a\u00020\u00032\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.H\u0086@¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0016J?\u00102\u001a\u00020,2\u0006\u00103\u001a\u0002042'\u00105\u001a#\b\u0001\u0012\u0004\u0012\u000207\u0012\n\u0012\b\u0012\u0004\u0012\u00020,08\u0012\u0006\u0012\u0004\u0018\u00010906¢\u0006\u0002\b:H\u0096@¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u0003H\u0086@¢\u0006\u0002\u0010=R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR$\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0004R\u000e\u0010 \u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\"\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010\u0004R+\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00038F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010&\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010\u0004¨\u0006?"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "initial", "", "(I)V", "_maxValueState", "Landroidx/compose/runtime/MutableIntState;", "accumulator", "", "canScrollBackward", "", "getCanScrollBackward", "()Z", "canScrollBackward$delegate", "Landroidx/compose/runtime/State;", "canScrollForward", "getCanScrollForward", "canScrollForward$delegate", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "isScrollInProgress", "newMax", "maxValue", "getMaxValue", "()I", "setMaxValue$foundation_release", "scrollableState", "<set-?>", "value", "getValue", "setValue", "value$delegate", "Landroidx/compose/runtime/MutableIntState;", "viewportSize", "getViewportSize", "setViewportSize$foundation_release", "viewportSize$delegate", "animateScrollTo", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "delta", com.helpshift.proactive.InAppViewConstants.SCROLL, "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollTo", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollState implements androidx.compose.foundation.gestures.ScrollableState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.ScrollState.Companion INSTANCE = new androidx.compose.foundation.ScrollState.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.ScrollState, ?> Saver = androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.foundation.ScrollState, java.lang.Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Integer invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.ScrollState scrollState) {
            return java.lang.Integer.valueOf(scrollState.getValue());
        }
    }, new kotlin.jvm.functions.Function1<java.lang.Integer, androidx.compose.foundation.ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.foundation.ScrollState invoke(java.lang.Integer num) {
            return invoke(num.intValue());
        }

        public final androidx.compose.foundation.ScrollState invoke(int i) {
            return new androidx.compose.foundation.ScrollState(i);
        }
    });
    private float accumulator;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState value;

    /* renamed from: viewportSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState viewportSize = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
    private final androidx.compose.foundation.interaction.MutableInteractionSource internalInteractionSource = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
    private androidx.compose.runtime.MutableIntState _maxValueState = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    private final androidx.compose.foundation.gestures.ScrollableState scrollableState = androidx.compose.foundation.gestures.ScrollableStateKt.ScrollableState(new kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f) {
            return invoke(f.floatValue());
        }

        public final java.lang.Float invoke(float f) {
            float f2;
            f2 = androidx.compose.foundation.ScrollState.this.accumulator;
            float value = androidx.compose.foundation.ScrollState.this.getValue() + f + f2;
            float coerceIn = kotlin.ranges.RangesKt.coerceIn(value, 0.0f, androidx.compose.foundation.ScrollState.this.getMaxValue());
            boolean z = !(value == coerceIn);
            float value2 = coerceIn - androidx.compose.foundation.ScrollState.this.getValue();
            int roundToInt = kotlin.math.MathKt.roundToInt(value2);
            androidx.compose.foundation.ScrollState scrollState = androidx.compose.foundation.ScrollState.this;
            scrollState.setValue(scrollState.getValue() + roundToInt);
            androidx.compose.foundation.ScrollState.this.accumulator = value2 - roundToInt;
            if (z) {
                f = value2;
            }
            return java.lang.Float.valueOf(f);
        }
    });

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State canScrollForward = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(androidx.compose.foundation.ScrollState.this.getValue() < androidx.compose.foundation.ScrollState.this.getMaxValue());
        }
    });

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State canScrollBackward = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(androidx.compose.foundation.ScrollState.this.getValue() > 0);
        }
    });

    public ScrollState(int i) {
        this.value = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setValue(int i) {
        this.value.setIntValue(i);
    }

    public final int getValue() {
        return this.value.getIntValue();
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    public final void setMaxValue$foundation_release(int i) {
        this._maxValueState.setIntValue(i);
        androidx.compose.runtime.snapshots.Snapshot createNonObservableSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            androidx.compose.runtime.snapshots.Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            try {
                if (getValue() > i) {
                    setValue(i);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
            }
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    public final int getViewportSize() {
        return this.viewportSize.getIntValue();
    }

    public final void setViewportSize$foundation_release(int i) {
        this.viewportSize.setIntValue(i);
    }

    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    /* renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final androidx.compose.foundation.interaction.MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object scroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        return scroll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((java.lang.Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((java.lang.Boolean) this.canScrollBackward.getValue()).booleanValue();
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

    /* compiled from: Scroll.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/ScrollState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.ScrollState, ?> getSaver() {
            return androidx.compose.foundation.ScrollState.Saver;
        }
    }
}
