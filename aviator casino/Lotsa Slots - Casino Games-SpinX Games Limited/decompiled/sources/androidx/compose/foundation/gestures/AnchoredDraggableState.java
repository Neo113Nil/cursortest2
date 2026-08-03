package androidx.compose.foundation.gestures;

/* compiled from: AnchoredDraggable.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 i*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001iB\u0081\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\u0010\u0013Bq\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f\u0012#\b\u0002\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\u0010\u0014Jy\u0010L\u001a\u00020M2\u0006\u0010G\u001a\u00028\u00002\b\b\u0002\u0010N\u001a\u00020O2W\u0010P\u001aS\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(G\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0R\u0012\u0006\u0012\u0004\u0018\u00010\u00020Q¢\u0006\u0002\bSH\u0086@¢\u0006\u0002\u0010TJ\\\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2B\u0010P\u001a>\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0R\u0012\u0006\u0012\u0004\u0018\u00010\u00020U¢\u0006\u0002\bSH\u0086@¢\u0006\u0002\u0010VJ%\u0010W\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\b2\u0006\u0010'\u001a\u00028\u00002\u0006\u0010X\u001a\u00020\bH\u0002¢\u0006\u0002\u0010YJ\u001d\u0010Z\u001a\u00028\u00002\u0006\u0010?\u001a\u00020\b2\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010[J\u000e\u0010\\\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bJ\u0015\u0010^\u001a\u00020\b2\u0006\u0010]\u001a\u00020\bH\u0000¢\u0006\u0002\b_J\u0006\u0010`\u001a\u00020\bJ\u0016\u0010a\u001a\u00020M2\u0006\u0010X\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010bJ\u0015\u0010c\u001a\u00020\u00122\u0006\u0010G\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010dJ#\u0010e\u001a\u00020M2\f\u0010f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010g\u001a\u00028\u0000¢\u0006\u0002\u0010hR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00028\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R/\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R+\u0010'\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u001d\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010.\u001a\u0004\u0018\u00018\u00002\b\u0010\u0017\u001a\u0004\u0018\u00018\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u001d\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010*R\u0014\u00102\u001a\u000203X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b6\u00107R+\u00108\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010?\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010>\u001a\u0004\b@\u0010:\"\u0004\bA\u0010<R/\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u001b\u0010D\u001a\u00020\b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bF\u0010$\u001a\u0004\bE\u0010:R\u001b\u0010G\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010$\u001a\u0004\bH\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006j"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "", "initialValue", "anchors", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "positionalThreshold", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "velocityThreshold", "Lkotlin/Function0;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "confirmValueChange", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/foundation/gestures/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "anchoredDragScope", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "<set-?>", "getAnchors", "()Landroidx/compose/foundation/gestures/DraggableAnchors;", "setAnchors", "(Landroidx/compose/foundation/gestures/DraggableAnchors;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "closestValue", "getClosestValue$foundation_release", "()Ljava/lang/Object;", "closestValue$delegate", "Landroidx/compose/runtime/State;", "getConfirmValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "dragMutex", "Landroidx/compose/foundation/MutatorMutex;", "dragTarget", "getDragTarget", "setDragTarget", "dragTarget$delegate", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$foundation_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "lastVelocity", "getLastVelocity", "()F", "setLastVelocity", "(F)V", "lastVelocity$delegate", "Landroidx/compose/runtime/MutableFloatState;", "offset", "getOffset", "setOffset", "offset$delegate", "getPositionalThreshold$foundation_release", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "getProgress", "progress$delegate", "targetValue", "getTargetValue", "targetValue$delegate", "getVelocityThreshold$foundation_release", "()Lkotlin/jvm/functions/Function0;", "anchoredDrag", "", "dragPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function4;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeTarget", "velocity", "(FLjava/lang/Object;F)Ljava/lang/Object;", "computeTargetWithoutThresholds", "(FLjava/lang/Object;)Ljava/lang/Object;", "dispatchRawDelta", "delta", "newOffsetForDelta", "newOffsetForDelta$foundation_release", "requireOffset", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySnapTo", "(Ljava/lang/Object;)Z", "updateAnchors", "newAnchors", "newTarget", "(Landroidx/compose/foundation/gestures/DraggableAnchors;Ljava/lang/Object;)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.gestures.AnchoredDraggableState.Companion INSTANCE = new androidx.compose.foundation.gestures.AnchoredDraggableState.Companion(null);
    private final androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState anchors;
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec;

    /* renamed from: closestValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State closestValue;
    private final kotlin.jvm.functions.Function1<T, java.lang.Boolean> confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentValue;
    private final androidx.compose.foundation.MutatorMutex dragMutex;

    /* renamed from: dragTarget$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState dragTarget;
    private final androidx.compose.foundation.gestures.DraggableState draggableState;

    /* renamed from: lastVelocity$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState lastVelocity;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState offset;
    private final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> positionalThreshold;

    /* renamed from: progress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State progress;

    /* renamed from: targetValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State targetValue;
    private final kotlin.jvm.functions.Function0<java.lang.Float> velocityThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function0<java.lang.Float> function0, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = animationSpec;
        this.confirmValueChange = function12;
        this.dragMutex = new androidx.compose.foundation.MutatorMutex();
        this.draggableState = new androidx.compose.foundation.gestures.AnchoredDraggableState$draggableState$1(this);
        this.currentValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<T>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$targetValue$2
            final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                java.lang.Object dragTarget;
                java.lang.Object computeTarget;
                dragTarget = this.this$0.getDragTarget();
                T t2 = (T) dragTarget;
                if (t2 != null) {
                    return t2;
                }
                androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                if (!java.lang.Float.isNaN(offset)) {
                    computeTarget = anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f);
                    return (T) computeTarget;
                }
                return anchoredDraggableState.getCurrentValue();
            }
        });
        this.closestValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<T>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$closestValue$2
            final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                java.lang.Object dragTarget;
                java.lang.Object computeTargetWithoutThresholds;
                dragTarget = this.this$0.getDragTarget();
                T t2 = (T) dragTarget;
                if (t2 != null) {
                    return t2;
                }
                androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                if (!java.lang.Float.isNaN(offset)) {
                    computeTargetWithoutThresholds = anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue());
                    return (T) computeTargetWithoutThresholds;
                }
                return anchoredDraggableState.getCurrentValue();
            }
        });
        this.offset = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0<java.lang.Float>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$progress$2
            final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Float invoke() {
                float positionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
                float positionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getClosestValue$foundation_release()) - positionOf;
                float abs = java.lang.Math.abs(positionOf2);
                float f = 1.0f;
                if (!java.lang.Float.isNaN(abs) && abs > 1.0E-6f) {
                    float requireOffset = (this.this$0.requireOffset() - positionOf) / positionOf2;
                    if (requireOffset < 1.0E-6f) {
                        f = 0.0f;
                    } else if (requireOffset <= 0.999999f) {
                        f = requireOffset;
                    }
                }
                return java.lang.Float.valueOf(f);
            }
        });
        this.lastVelocity = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.gestures.AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new androidx.compose.foundation.gestures.AnchoredDragScope(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.foundation.gestures.AnchoredDragScope
            public void dragTo(float newOffset, float lastKnownVelocity) {
                this.this$0.setOffset(newOffset);
                this.this$0.setLastVelocity(lastKnownVelocity);
            }
        };
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getPositionalThreshold$foundation_release() {
        return this.positionalThreshold;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Float> getVelocityThreshold$foundation_release() {
        return this.velocityThreshold;
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public /* synthetic */ AnchoredDraggableState(java.lang.Object obj, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, animationSpec, (i & 16) != 0 ? new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(T t) {
                return true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj2) {
                return invoke((androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass1) obj2);
            }
        } : anonymousClass1);
    }

    public final kotlin.jvm.functions.Function1<T, java.lang.Boolean> getConfirmValueChange$foundation_release() {
        return this.confirmValueChange;
    }

    public /* synthetic */ AnchoredDraggableState(java.lang.Object obj, androidx.compose.foundation.gestures.DraggableAnchors draggableAnchors, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.animation.core.AnimationSpec animationSpec, androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass2 anonymousClass2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, function1, function0, animationSpec, (i & 32) != 0 ? new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(T t) {
                return true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj2) {
                return invoke((androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass2) obj2);
            }
        } : anonymousClass2);
    }

    public AnchoredDraggableState(T t, androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function0<java.lang.Float> function0, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function12) {
        this(t, function1, function0, animationSpec, function12);
        setAnchors(draggableAnchors);
        trySnapTo(t);
    }

    /* renamed from: getDraggableState$foundation_release, reason: from getter */
    public final androidx.compose.foundation.gestures.DraggableState getDraggableState() {
        return this.draggableState;
    }

    private final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue.getValue();
    }

    public final T getClosestValue$foundation_release() {
        return (T) this.closestValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f) {
        this.offset.setFloatValue(f);
    }

    public final float getOffset() {
        return this.offset.getFloatValue();
    }

    public final float requireOffset() {
        if (!(!java.lang.Float.isNaN(getOffset()))) {
            throw new java.lang.IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float getProgress() {
        return ((java.lang.Number) this.progress.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity.setFloatValue(f);
    }

    public final float getLastVelocity() {
        return this.lastVelocity.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getDragTarget() {
        return this.dragTarget.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t) {
        this.dragTarget.setValue(t);
    }

    private final void setAnchors(androidx.compose.foundation.gestures.DraggableAnchors<T> draggableAnchors) {
        this.anchors.setValue(draggableAnchors);
    }

    public final androidx.compose.foundation.gestures.DraggableAnchors<T> getAnchors() {
        return (androidx.compose.foundation.gestures.DraggableAnchors) this.anchors.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, androidx.compose.foundation.gestures.DraggableAnchors draggableAnchors, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            if (!java.lang.Float.isNaN(anchoredDraggableState.getOffset())) {
                obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset());
                if (obj == null) {
                    obj = anchoredDraggableState.getTargetValue();
                }
            } else {
                obj = anchoredDraggableState.getTargetValue();
            }
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    public final void updateAnchors(androidx.compose.foundation.gestures.DraggableAnchors<T> newAnchors, T newTarget) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (trySnapTo(newTarget)) {
            return;
        }
        setDragTarget(newTarget);
    }

    public final java.lang.Object settle(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            java.lang.Object animateTo = androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(this, computeTarget, f, continuation);
            return animateTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateTo2 = androidx.compose.foundation.gestures.AnchoredDraggableKt.animateTo(this, currentValue, f, continuation);
        return animateTo2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo2 : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float offset, T currentValue, float velocity) {
        androidx.compose.foundation.gestures.DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(currentValue);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        if (positionOf == offset || java.lang.Float.isNaN(positionOf)) {
            return currentValue;
        }
        if (java.lang.Math.abs(velocity) >= java.lang.Math.abs(floatValue)) {
            T closestAnchor = anchors.closestAnchor(offset, offset - positionOf > 0.0f);
            kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor);
            return closestAnchor;
        }
        T closestAnchor2 = anchors.closestAnchor(offset, offset - positionOf > 0.0f);
        kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor2);
        return java.lang.Math.abs(positionOf - offset) <= java.lang.Math.abs(this.positionalThreshold.invoke(java.lang.Float.valueOf(java.lang.Math.abs(positionOf - anchors.positionOf(closestAnchor2)))).floatValue()) ? currentValue : closestAnchor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTargetWithoutThresholds(float offset, T currentValue) {
        androidx.compose.foundation.gestures.DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(currentValue);
        if (positionOf == offset || java.lang.Float.isNaN(positionOf)) {
            return currentValue;
        }
        T closestAnchor = anchors.closestAnchor(offset, offset - positionOf > 0.0f);
        return closestAnchor == null ? currentValue : closestAnchor;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object anchoredDrag(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1 anchoredDraggableState$anchoredDrag$1;
        int i;
        androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState;
        T closestAnchor;
        T closestAnchor2;
        if (continuation instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1) {
            anchoredDraggableState$anchoredDrag$1 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1) continuation;
            if ((anchoredDraggableState$anchoredDrag$1.label & Integer.MIN_VALUE) != 0) {
                anchoredDraggableState$anchoredDrag$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = anchoredDraggableState$anchoredDrag$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anchoredDraggableState$anchoredDrag$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        androidx.compose.foundation.MutatorMutex mutatorMutex = this.dragMutex;
                        androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2 anchoredDraggableState$anchoredDrag$2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2(this, function3, null);
                        anchoredDraggableState$anchoredDrag$1.L$0 = this;
                        anchoredDraggableState$anchoredDrag$1.label = 1;
                        if (mutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$2, anchoredDraggableState$anchoredDrag$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anchoredDraggableState = this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        anchoredDraggableState = this;
                        closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                        if (closestAnchor != null) {
                            anchoredDraggableState.setCurrentValue(closestAnchor);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    anchoredDraggableState = (androidx.compose.foundation.gestures.AnchoredDraggableState) anchoredDraggableState$anchoredDrag$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                        if (closestAnchor != null && java.lang.Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(closestAnchor)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(closestAnchor).booleanValue()) {
                            anchoredDraggableState.setCurrentValue(closestAnchor);
                        }
                        throw th;
                    }
                }
                closestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (closestAnchor2 != null && java.lang.Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(closestAnchor2)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(closestAnchor2).booleanValue()) {
                    anchoredDraggableState.setCurrentValue(closestAnchor2);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        anchoredDraggableState$anchoredDrag$1 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$1(this, continuation);
        java.lang.Object obj2 = anchoredDraggableState$anchoredDrag$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableState$anchoredDrag$1.label;
        if (i != 0) {
        }
        closestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
        if (closestAnchor2 != null) {
            anchoredDraggableState.setCurrentValue(closestAnchor2);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object anchoredDrag$default(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function3 function3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object anchoredDrag(T t, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState;
        T closestAnchor;
        T closestAnchor2;
        if (continuation instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) {
            anchoredDraggableState$anchoredDrag$3 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) continuation;
            if ((anchoredDraggableState$anchoredDrag$3.label & Integer.MIN_VALUE) != 0) {
                anchoredDraggableState$anchoredDrag$3.label -= Integer.MIN_VALUE;
                java.lang.Object obj = anchoredDraggableState$anchoredDrag$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anchoredDraggableState$anchoredDrag$3.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (getAnchors().hasAnchorFor(t)) {
                        try {
                            androidx.compose.foundation.MutatorMutex mutatorMutex = this.dragMutex;
                            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4(this, t, function4, null);
                            anchoredDraggableState$anchoredDrag$3.L$0 = this;
                            anchoredDraggableState$anchoredDrag$3.label = 1;
                            if (mutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            anchoredDraggableState = this;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            anchoredDraggableState = this;
                            anchoredDraggableState.setDragTarget(null);
                            closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                            if (closestAnchor != null) {
                                anchoredDraggableState.setCurrentValue(closestAnchor);
                            }
                            throw th;
                        }
                    } else {
                        setCurrentValue(t);
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    anchoredDraggableState = (androidx.compose.foundation.gestures.AnchoredDraggableState) anchoredDraggableState$anchoredDrag$3.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        anchoredDraggableState.setDragTarget(null);
                        closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                        if (closestAnchor != null && java.lang.Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(closestAnchor)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(closestAnchor).booleanValue()) {
                            anchoredDraggableState.setCurrentValue(closestAnchor);
                        }
                        throw th;
                    }
                }
                anchoredDraggableState.setDragTarget(null);
                closestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                if (closestAnchor2 != null && java.lang.Math.abs(anchoredDraggableState.getOffset() - anchoredDraggableState.getAnchors().positionOf(closestAnchor2)) <= 0.5f && anchoredDraggableState.confirmValueChange.invoke(closestAnchor2).booleanValue()) {
                    anchoredDraggableState.setCurrentValue(closestAnchor2);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        anchoredDraggableState$anchoredDrag$3 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3(this, continuation);
        java.lang.Object obj2 = anchoredDraggableState$anchoredDrag$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableState$anchoredDrag$3.label;
        if (i != 0) {
        }
        anchoredDraggableState.setDragTarget(null);
        closestAnchor2 = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
        if (closestAnchor2 != null) {
            anchoredDraggableState.setCurrentValue(closestAnchor2);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object anchoredDrag$default(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, java.lang.Object obj, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function4 function4, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function4, continuation);
    }

    public final float newOffsetForDelta$foundation_release(float delta) {
        return kotlin.ranges.RangesKt.coerceIn((java.lang.Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float delta) {
        float newOffsetForDelta$foundation_release = newOffsetForDelta$foundation_release(delta);
        float offset = java.lang.Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(newOffsetForDelta$foundation_release);
        return newOffsetForDelta$foundation_release - offset;
    }

    private final boolean trySnapTo(T targetValue) {
        androidx.compose.foundation.MutatorMutex mutatorMutex = this.dragMutex;
        boolean tryLock = mutatorMutex.tryLock();
        if (tryLock) {
            try {
                androidx.compose.foundation.gestures.AnchoredDragScope anchoredDragScope = this.anchoredDragScope;
                float positionOf = getAnchors().positionOf(targetValue);
                if (!java.lang.Float.isNaN(positionOf)) {
                    androidx.compose.foundation.gestures.AnchoredDragScope.CC.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
                    setDragTarget(null);
                }
                setCurrentValue(targetValue);
            } finally {
                mutatorMutex.unlock();
            }
        }
        return tryLock;
    }

    /* compiled from: AnchoredDraggable.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jy\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00120\u000bH\u0007¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/gestures/AnchoredDraggableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "positionalThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "distance", "velocityThreshold", "Lkotlin/Function0;", "confirmValueChange", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.saveable.Saver Saver$default(androidx.compose.foundation.gestures.AnchoredDraggableState.Companion companion, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function12 = new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Boolean invoke(T t) {
                        return true;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj2) {
                        return invoke((androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$1<T>) obj2);
                    }
                };
            }
            return companion.Saver(animationSpec, function1, function0, function12);
        }

        public final <T> androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.gestures.AnchoredDraggableState<T>, T> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> positionalThreshold, final kotlin.jvm.functions.Function0<java.lang.Float> velocityThreshold, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> confirmValueChange) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.foundation.gestures.AnchoredDraggableState<T>, T>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$2
                @Override // kotlin.jvm.functions.Function2
                public final T invoke(androidx.compose.runtime.saveable.SaverScope saverScope, androidx.compose.foundation.gestures.AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new kotlin.jvm.functions.Function1<T, androidx.compose.foundation.gestures.AnchoredDraggableState<T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    return invoke((androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$3<T>) obj);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.foundation.gestures.AnchoredDraggableState<T> invoke(T t) {
                    return new androidx.compose.foundation.gestures.AnchoredDraggableState<>(t, positionalThreshold, velocityThreshold, animationSpec, confirmValueChange);
                }
            });
        }
    }
}
