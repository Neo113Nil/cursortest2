package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\b\u0000\u0018\u0000 h*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001hBe\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\b\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\b\u0012\u0019\b\u0002\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\u000e\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0002\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010!JT\u0010)\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\"28\u0010(\u001a4\b\u0001\u0012\u0004\u0012\u00020%\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170&\u0012\u0006\u0012\u0004\u0018\u00010\u00020$¢\u0006\u0002\b'H\u0086@¢\u0006\u0004\b)\u0010*Jg\u0010)\u001a\u00020\u00172\u0006\u0010+\u001a\u00028\u00002\b\b\u0002\u0010#\u001a\u00020\"2C\u0010(\u001a?\b\u0001\u0012\u0004\u0012\u00020%\u0012\u000f\u0012\r\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\b\u0006\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170&\u0012\u0006\u0012\u0004\u0018\u00010\u00020,¢\u0006\u0002\b'H\u0086@¢\u0006\u0004\b)\u0010-J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005H\u0000¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0005¢\u0006\u0004\b1\u00100R+\u0010\u0007\u001a\u0013\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u00104R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u00107R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u00107R+\u0010\r\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\f0\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b9\u00104R\u0014\u0010=\u001a\u00020:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010?\u001a\u00020>8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR+\u0010J\u001a\u00028\u00002\u0006\u0010C\u001a\u00028\u00008G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001b\u0010+\u001a\u00028\u00008GX\u0087\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010GR\u001b\u0010P\u001a\u00028\u00008AX\u0081\u0084\u0002¢\u0006\f\n\u0004\bN\u0010L\u001a\u0004\bO\u0010GR+\u0010V\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00058G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010\u0014\"\u0004\bT\u0010UR\u0011\u0010W\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bW\u0010XR\u001b\u0010[\u001a\u00020\u00058GX\u0087\u0084\u0002¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bZ\u0010\u0014R+\u0010_\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u00058G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010R\u001a\u0004\b]\u0010\u0014\"\u0004\b^\u0010UR/\u0010 \u001a\u0004\u0018\u00018\u00002\b\u0010\u001d\u001a\u0004\u0018\u00018\u00008C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010E\u001a\u0004\b;\u0010G\"\u0004\b`\u0010IR7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00108G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010E\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u0010;\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010g"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState;", "T", "", "initialValue", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/material3/internal/DraggableAnchors;", "anchors", "(Ljava/lang/Object;Landroidx/compose/material3/internal/DraggableAnchors;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "requireOffset", "()F", "newAnchors", "newTarget", "", "updateAnchors", "(Landroidx/compose/material3/internal/DraggableAnchors;Ljava/lang/Object;)V", "velocity", "settle", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "p2", "getHighSpeedVideoFpsRanges", "(FLjava/lang/Object;F)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "dragPriority", "Lkotlin/Function3;", "Landroidx/compose/material3/internal/AnchoredDragScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "anchoredDrag", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "Lkotlin/Function4;", "(Ljava/lang/Object;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delta", "newOffsetForDelta$material3", "(F)F", "dispatchRawDelta", "Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$material3", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$material3", "()Lkotlin/jvm/functions/Function0;", "getAnimationSpec", "getConfirmValueChange$material3", "Landroidx/compose/material3/internal/InternalMutatorMutex;", "getHighSpeedVideoSizes", "Landroidx/compose/material3/internal/InternalMutatorMutex;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material3", "()Landroidx/compose/foundation/gestures/DraggableState;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "targetValue$delegate", "Landroidx/compose/runtime/State;", "getTargetValue", "closestValue$delegate", "getClosestValue$material3", "closestValue", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "setOffset", "(F)V", "offset", "isAnimationRunning", "()Z", "progress$delegate", "getProgress", "progress", "lastVelocity$delegate", "getLastVelocity", "setLastVelocity", "lastVelocity", "getHighResolutionOutputSizeshNQ4ISI", "anchors$delegate", "getAnchors", "()Landroidx/compose/material3/internal/DraggableAnchors;", "setAnchors", "(Landroidx/compose/material3/internal/DraggableAnchors;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/material3/internal/AnchoredDragScope;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.internal.AnchoredDraggableState.Companion INSTANCE = new androidx.compose.material3.internal.AnchoredDraggableState.Companion(null);

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState anchors;
    private final kotlin.jvm.functions.Function0<androidx.compose.animation.core.AnimationSpec<java.lang.Float>> animationSpec;

    /* renamed from: closestValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.State closestValue;
    private final kotlin.jvm.functions.Function1<T, java.lang.Boolean> confirmValueChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentValue;
    private final androidx.compose.foundation.gestures.DraggableState draggableState;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.AnchoredDragScope getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.material3.internal.InternalMutatorMutex Camera2StreamConfigurationMap;

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

    public static /* synthetic */ boolean $r8$lambda$E5t8xZbUs6nDWSmCblxuTtjmKdQ(java.lang.Object obj) {
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$Vw8WQ5kqcvfOvm_c6WLGq9ZG1Kw(java.lang.Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function0<java.lang.Float> function0, kotlin.jvm.functions.Function0<? extends androidx.compose.animation.core.AnimationSpec<java.lang.Float>> function02, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = function02;
        this.confirmValueChange = function12;
        this.Camera2StreamConfigurationMap = new androidx.compose.material3.internal.InternalMutatorMutex();
        this.draggableState = new androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1(this);
        this.currentValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.targetValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.material3.internal.AnchoredDraggableState.$r8$lambda$09vgTaMJKMIpiZL4KeiDZeSyUak(androidx.compose.material3.internal.AnchoredDraggableState.this);
            }
        });
        this.closestValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.material3.internal.AnchoredDraggableState.$r8$lambda$olGbJR6RG0md4d17phZ9srP7bf0(androidx.compose.material3.internal.AnchoredDraggableState.this);
            }
        });
        this.offset = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Float.valueOf(androidx.compose.material3.internal.AnchoredDraggableState.$r8$lambda$QhiUigx3de8Gzgo1SdpL6JcPXOQ(androidx.compose.material3.internal.AnchoredDraggableState.this));
            }
        });
        this.lastVelocity = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.material3.internal.AnchoredDraggableKt.access$emptyDraggableAnchors(), null, 2, null);
        this.getHighSpeedVideoSizes = new androidx.compose.material3.internal.AnchoredDragScope(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState<T> Camera2StreamConfigurationMap;

            {
                this.Camera2StreamConfigurationMap = this;
            }

            @Override // androidx.compose.material3.internal.AnchoredDragScope
            public final void dragTo(float newOffset, float lastKnownVelocity) {
                this.Camera2StreamConfigurationMap.setOffset(newOffset);
                this.Camera2StreamConfigurationMap.setLastVelocity(lastKnownVelocity);
            }
        };
    }

    public final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.Float> getPositionalThreshold$material3() {
        return this.positionalThreshold;
    }

    public final kotlin.jvm.functions.Function0<java.lang.Float> getVelocityThreshold$material3() {
        return this.velocityThreshold;
    }

    public final kotlin.jvm.functions.Function0<androidx.compose.animation.core.AnimationSpec<java.lang.Float>> getAnimationSpec() {
        return this.animationSpec;
    }

    public /* synthetic */ AnchoredDraggableState(java.lang.Object obj, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, function02, (i & 16) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(androidx.compose.material3.internal.AnchoredDraggableState.$r8$lambda$E5t8xZbUs6nDWSmCblxuTtjmKdQ(obj2));
            }
        } : function12);
    }

    public final kotlin.jvm.functions.Function1<T, java.lang.Boolean> getConfirmValueChange$material3() {
        return this.confirmValueChange;
    }

    public /* synthetic */ AnchoredDraggableState(java.lang.Object obj, androidx.compose.material3.internal.DraggableAnchors draggableAnchors, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function12, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, function1, function0, function02, (i & 32) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(androidx.compose.material3.internal.AnchoredDraggableState.$r8$lambda$Vw8WQ5kqcvfOvm_c6WLGq9ZG1Kw(obj2));
            }
        } : function12);
    }

    public AnchoredDraggableState(T t, androidx.compose.material3.internal.DraggableAnchors<T> draggableAnchors, kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> function1, kotlin.jvm.functions.Function0<java.lang.Float> function0, kotlin.jvm.functions.Function0<? extends androidx.compose.animation.core.AnimationSpec<java.lang.Float>> function02, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function12) {
        this(t, function1, function0, function02, function12);
        setAnchors(draggableAnchors);
        this.Camera2StreamConfigurationMap.tryMutate(new androidx.compose.material3.internal.AnchoredDraggableState$$ExternalSyntheticLambda5(this, t));
    }

    /* renamed from: getDraggableState$material3, reason: from getter */
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

    public final T getClosestValue$material3() {
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
        if (java.lang.Float.isNaN(getOffset())) {
            throw new java.lang.IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getHighSpeedVideoSizes() != null;
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
    public final void getHighResolutionOutputSizeshNQ4ISI(T t) {
        this.getHighSpeedVideoFpsRanges.setValue(t);
    }

    private final T getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    private final void setAnchors(androidx.compose.material3.internal.DraggableAnchors<T> draggableAnchors) {
        this.anchors.setValue(draggableAnchors);
    }

    public final androidx.compose.material3.internal.DraggableAnchors<T> getAnchors() {
        return (androidx.compose.material3.internal.DraggableAnchors) this.anchors.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState, androidx.compose.material3.internal.DraggableAnchors draggableAnchors, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 2) != 0 && (java.lang.Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    public final void updateAnchors(androidx.compose.material3.internal.DraggableAnchors<T> newAnchors, T newTarget) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(getAnchors(), newAnchors)) {
            return;
        }
        setAnchors(newAnchors);
        if (this.Camera2StreamConfigurationMap.tryMutate(new androidx.compose.material3.internal.AnchoredDraggableState$$ExternalSyntheticLambda5(this, newTarget))) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI(newTarget);
    }

    public final java.lang.Object settle(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        T currentValue = getCurrentValue();
        T highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(highSpeedVideoFpsRanges).booleanValue()) {
            java.lang.Object animateTo = androidx.compose.material3.internal.AnchoredDraggableKt.animateTo(this, highSpeedVideoFpsRanges, f, continuation);
            return animateTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo : kotlin.Unit.INSTANCE;
        }
        java.lang.Object animateTo2 = androidx.compose.material3.internal.AnchoredDraggableKt.animateTo(this, currentValue, f, continuation);
        return animateTo2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo2 : kotlin.Unit.INSTANCE;
    }

    private final T getHighSpeedVideoFpsRanges(float p0, T p1, float p2) {
        androidx.compose.material3.internal.DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(p1);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        if (positionOf != p0 && !java.lang.Float.isNaN(positionOf)) {
            if (positionOf < p0) {
                if (p2 >= floatValue) {
                    T closestAnchor = anchors.closestAnchor(p0, true);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor);
                    return closestAnchor;
                }
                T closestAnchor2 = anchors.closestAnchor(p0, true);
                kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor2);
                if (p0 >= java.lang.Math.abs(positionOf + java.lang.Math.abs(this.positionalThreshold.invoke(java.lang.Float.valueOf(java.lang.Math.abs(anchors.positionOf(closestAnchor2) - positionOf))).floatValue()))) {
                    return closestAnchor2;
                }
            } else {
                if (p2 <= (-floatValue)) {
                    T closestAnchor3 = anchors.closestAnchor(p0, false);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor3);
                    return closestAnchor3;
                }
                T closestAnchor4 = anchors.closestAnchor(p0, false);
                kotlin.jvm.internal.Intrinsics.checkNotNull(closestAnchor4);
                float abs = java.lang.Math.abs(positionOf - java.lang.Math.abs(this.positionalThreshold.invoke(java.lang.Float.valueOf(java.lang.Math.abs(positionOf - anchors.positionOf(closestAnchor4)))).floatValue()));
                if (p0 >= 0.0f ? p0 <= abs : java.lang.Math.abs(p0) >= abs) {
                    return closestAnchor4;
                }
            }
        }
        return p1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object anchoredDrag(androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function3<? super androidx.compose.material3.internal.AnchoredDragScope, ? super androidx.compose.material3.internal.DraggableAnchors<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 anchoredDraggableState$anchoredDrag$1;
        int i;
        T closestAnchor;
        try {
            if (continuation instanceof androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1) {
                anchoredDraggableState$anchoredDrag$1 = (androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1) continuation;
                if ((anchoredDraggableState$anchoredDrag$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableState$anchoredDrag$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = anchoredDraggableState$anchoredDrag$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anchoredDraggableState$anchoredDrag$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.material3.internal.InternalMutatorMutex internalMutatorMutex = this.Camera2StreamConfigurationMap;
                        androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 anchoredDraggableState$anchoredDrag$2 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2(this, function3, null);
                        anchoredDraggableState$anchoredDrag$1.getHighSpeedVideoFpsRanges = 1;
                        if (internalMutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$2, anchoredDraggableState$anchoredDrag$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (closestAnchor != null && java.lang.Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && this.confirmValueChange.invoke(closestAnchor).booleanValue()) {
                        setCurrentValue(closestAnchor);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            if (closestAnchor != null) {
                setCurrentValue(closestAnchor);
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            closestAnchor = getAnchors().closestAnchor(getOffset());
            if (closestAnchor != null && java.lang.Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && this.confirmValueChange.invoke(closestAnchor).booleanValue()) {
                setCurrentValue(closestAnchor);
            }
        }
        anchoredDraggableState$anchoredDrag$1 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1(this, continuation);
        java.lang.Object obj2 = anchoredDraggableState$anchoredDrag$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableState$anchoredDrag$1.getHighSpeedVideoFpsRanges;
    }

    public static /* synthetic */ java.lang.Object anchoredDrag$default(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function3 function3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0086, code lost:
    
        if (((java.lang.Boolean) r6.confirmValueChange.invoke(r7)).booleanValue() != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object anchoredDrag(T t, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function4<? super androidx.compose.material3.internal.AnchoredDragScope, ? super androidx.compose.material3.internal.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function4, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 anchoredDraggableState$anchoredDrag$3;
        int i;
        try {
            if (continuation instanceof androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3) {
                anchoredDraggableState$anchoredDrag$3 = (androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3) continuation;
                if ((anchoredDraggableState$anchoredDrag$3.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    anchoredDraggableState$anchoredDrag$3.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = anchoredDraggableState$anchoredDrag$3.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anchoredDraggableState$anchoredDrag$3.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (getAnchors().hasAnchorFor(t)) {
                            androidx.compose.material3.internal.InternalMutatorMutex internalMutatorMutex = this.Camera2StreamConfigurationMap;
                            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 anchoredDraggableState$anchoredDrag$4 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4(this, t, function4, null);
                            anchoredDraggableState$anchoredDrag$3.Camera2StreamConfigurationMap = 1;
                            if (internalMutatorMutex.mutate(mutatePriority, anchoredDraggableState$anchoredDrag$4, anchoredDraggableState$anchoredDrag$3) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        setCurrentValue(t);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (t != null) {
                        if (java.lang.Math.abs(getOffset() - getAnchors().positionOf(t)) <= 0.5f) {
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            if (t != null) {
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            getHighResolutionOutputSizeshNQ4ISI(null);
            T closestAnchor = getAnchors().closestAnchor(getOffset());
            if (closestAnchor != null && java.lang.Math.abs(getOffset() - getAnchors().positionOf(closestAnchor)) <= 0.5f && ((java.lang.Boolean) this.confirmValueChange.invoke(closestAnchor)).booleanValue()) {
                setCurrentValue(closestAnchor);
            }
        }
        anchoredDraggableState$anchoredDrag$3 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3(this, continuation);
        java.lang.Object obj2 = anchoredDraggableState$anchoredDrag$3.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anchoredDraggableState$anchoredDrag$3.Camera2StreamConfigurationMap;
    }

    public static /* synthetic */ java.lang.Object anchoredDrag$default(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState, java.lang.Object obj, androidx.compose.foundation.MutatePriority mutatePriority, kotlin.jvm.functions.Function4 function4, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            mutatePriority = androidx.compose.foundation.MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function4, continuation);
    }

    public final float newOffsetForDelta$material3(float delta) {
        return kotlin.ranges.RangesKt.coerceIn((java.lang.Float.isNaN(getOffset()) ? 0.0f : getOffset()) + delta, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float delta) {
        float newOffsetForDelta$material3 = newOffsetForDelta$material3(delta);
        float offset = java.lang.Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(newOffsetForDelta$material3);
        return newOffsetForDelta$material3 - offset;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0010\u0012\u0004\u0012\u00028\u00010\u000f\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t2\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/material3/internal/AnchoredDraggableState$Companion;", "", "<init>", "()V", "T", "Lkotlin/Function0;", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/ParameterName;", "positionalThreshold", "velocityThreshold", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/internal/AnchoredDraggableState;", "Saver", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final <T> androidx.compose.runtime.saveable.Saver<androidx.compose.material3.internal.AnchoredDraggableState<T>, T> Saver(final kotlin.jvm.functions.Function0<? extends androidx.compose.animation.core.AnimationSpec<java.lang.Float>> animationSpec, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> confirmValueChange, final kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Float> positionalThreshold, final kotlin.jvm.functions.Function0<java.lang.Float> velocityThreshold) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.Object currentValue;
                    currentValue = ((androidx.compose.material3.internal.AnchoredDraggableState) obj2).getCurrentValue();
                    return currentValue;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.internal.AnchoredDraggableState.Companion.$r8$lambda$aiO1sWtut0Roq7ZhXHilfADEY_8(kotlin.jvm.functions.Function1.this, velocityThreshold, animationSpec, confirmValueChange, obj);
                }
            });
        }

        public static /* synthetic */ androidx.compose.material3.internal.AnchoredDraggableState $r8$lambda$aiO1sWtut0Roq7ZhXHilfADEY_8(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function12, java.lang.Object obj) {
            return new androidx.compose.material3.internal.AnchoredDraggableState(obj, function1, function0, function02, function12);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object $r8$lambda$09vgTaMJKMIpiZL4KeiDZeSyUak(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState) {
        java.lang.Object highSpeedVideoSizes = anchoredDraggableState.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes;
        }
        float offset = anchoredDraggableState.getOffset();
        if (!java.lang.Float.isNaN(offset)) {
            return anchoredDraggableState.getHighSpeedVideoFpsRanges(offset, anchoredDraggableState.getCurrentValue(), 0.0f);
        }
        return anchoredDraggableState.getCurrentValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float $r8$lambda$QhiUigx3de8Gzgo1SdpL6JcPXOQ(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState) {
        float positionOf = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getCurrentValue());
        float positionOf2 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.getClosestValue$material3()) - positionOf;
        float abs = java.lang.Math.abs(positionOf2);
        if (java.lang.Float.isNaN(abs) || abs <= 1.0E-6f) {
            return 1.0f;
        }
        float requireOffset = (anchoredDraggableState.requireOffset() - positionOf) / positionOf2;
        if (requireOffset < 1.0E-6f) {
            return 0.0f;
        }
        if (requireOffset <= 0.999999f) {
            return requireOffset;
        }
        return 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$axc_v2As-VFTwFQ0DvPitbEQHSE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4272$r8$lambda$axc_v2AsVFTwFQ0DvPitbEQHSE(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState, java.lang.Object obj) {
        androidx.compose.material3.internal.AnchoredDragScope anchoredDragScope = anchoredDraggableState.getHighSpeedVideoSizes;
        float positionOf = anchoredDraggableState.getAnchors().positionOf(obj);
        if (!java.lang.Float.isNaN(positionOf)) {
            androidx.compose.material3.internal.AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
            anchoredDraggableState.getHighResolutionOutputSizeshNQ4ISI(null);
        }
        anchoredDraggableState.setCurrentValue(obj);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object $r8$lambda$olGbJR6RG0md4d17phZ9srP7bf0(androidx.compose.material3.internal.AnchoredDraggableState anchoredDraggableState) {
        java.lang.Object highSpeedVideoSizes = anchoredDraggableState.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes;
        }
        float offset = anchoredDraggableState.getOffset();
        if (!java.lang.Float.isNaN(offset)) {
            java.lang.Object currentValue = anchoredDraggableState.getCurrentValue();
            androidx.compose.material3.internal.DraggableAnchors anchors = anchoredDraggableState.getAnchors();
            float positionOf = anchors.positionOf(currentValue);
            if (positionOf != offset && !java.lang.Float.isNaN(positionOf)) {
                if (positionOf < offset) {
                    java.lang.Object closestAnchor = anchors.closestAnchor(offset, true);
                    if (closestAnchor != null) {
                        return closestAnchor;
                    }
                } else {
                    java.lang.Object closestAnchor2 = anchors.closestAnchor(offset, false);
                    if (closestAnchor2 != null) {
                        return closestAnchor2;
                    }
                }
            }
            return currentValue;
        }
        return anchoredDraggableState.getCurrentValue();
    }
}
