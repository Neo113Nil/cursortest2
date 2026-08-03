package androidx.compose.material;

/* compiled from: Swipeable.kt */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0017\u0018\u0000 t*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001tBB\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012#\b\u0002\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0002\u0010\rJ'\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010aJ)\u0010b\u001a\u00020^2\u0006\u0010O\u001a\u00028\u00002\u000e\b\u0002\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010dJ!\u0010e\u001a\u00020^2\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0011H\u0000¢\u0006\u0002\bgJ\u000e\u0010h\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0006J\u0019\u0010j\u001a\u00020^2\u0006\u0010k\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010lJ;\u0010m\u001a\u00020^2\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0011H\u0080@ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ\u0019\u0010q\u001a\u00020^2\u0006\u0010_\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010lJ\u0019\u0010r\u001a\u00020^2\u0006\u0010O\u001a\u00028\u0000H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010sR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000RC\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0018\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R+\u0010-\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0018\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u001103X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010(\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u00107R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060<8F¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060<8F¢\u0006\u0006\u001a\u0004\bA\u0010>R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000D8FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010&\u001a\u0004\bF\u0010GR/\u0010I\u001a\u0004\u0018\u00010H2\b\u0010\u0010\u001a\u0004\u0018\u00010H8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010\u0018\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010O\u001a\u00028\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bP\u0010&\u001a\u0004\bQ\u0010 RO\u0010S\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060R2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060R8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bX\u0010\u0018\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR+\u0010Y\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010\u0018\u001a\u0004\bZ\u0010(\"\u0004\b[\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006u"}, d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "initialValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "absoluteOffset", "Landroidx/compose/runtime/MutableState;", "<set-?>", "", "anchors", "getAnchors$material_release", "()Ljava/util/Map;", "setAnchors$material_release", "(Ljava/util/Map;)V", "anchors$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", "animationTarget", "getConfirmStateChange$material_release", "()Lkotlin/jvm/functions/Function1;", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue$delegate", "direction", "getDirection$annotations", "()V", "getDirection", "()F", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material_release", "()Landroidx/compose/foundation/gestures/DraggableState;", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "isAnimationRunning$delegate", "latestNonEmptyAnchorsFlow", "Lkotlinx/coroutines/flow/Flow;", "maxBound", "getMaxBound$material_release", "setMaxBound$material_release", "(F)V", "minBound", "getMinBound$material_release", "setMinBound$material_release", "offset", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "offsetState", com.helpshift.proactive.InAppViewConstants.OVERFLOW, "getOverflow", "overflowState", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "Landroidx/compose/material/ResistanceConfig;", "resistance", "getResistance$material_release", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material_release", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance$delegate", "targetValue", "getTargetValue$annotations", "getTargetValue", "Lkotlin/Function2;", "thresholds", "getThresholds$material_release", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material_release", "(Lkotlin/jvm/functions/Function2;)V", "thresholds$delegate", "velocityThreshold", "getVelocityThreshold$material_release", "setVelocityThreshold$material_release", "velocityThreshold$delegate", "animateInternalToOffset", "", "target", "spec", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "anim", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureInit", "newAnchors", "ensureInit$material_release", "performDrag", "delta", "performFling", "velocity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processNewAnchors", "oldAnchors", "processNewAnchors$material_release", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapInternalToOffset", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.compose.material.ExperimentalMaterialApi
/* loaded from: classes.dex */
public class SwipeableState<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.SwipeableState.Companion INSTANCE = new androidx.compose.material.SwipeableState.Companion(null);
    private final androidx.compose.runtime.MutableState<java.lang.Float> absoluteOffset;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState anchors;
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec;
    private final androidx.compose.runtime.MutableState<java.lang.Float> animationTarget;
    private final kotlin.jvm.functions.Function1<T, java.lang.Boolean> confirmStateChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentValue;
    private final androidx.compose.foundation.gestures.DraggableState draggableState;

    /* renamed from: isAnimationRunning$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isAnimationRunning;
    private final kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    private final androidx.compose.runtime.MutableState<java.lang.Float> offsetState;
    private final androidx.compose.runtime.MutableState<java.lang.Float> overflowState;

    /* renamed from: resistance$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState resistance;

    /* renamed from: thresholds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState thresholds;

    /* renamed from: velocityThreshold$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState velocityThreshold;

    @androidx.compose.material.ExperimentalMaterialApi
    public static /* synthetic */ void getDirection$annotations() {
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> confirmStateChange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.animationSpec = animationSpec;
        this.confirmStateChange = confirmStateChange;
        this.currentValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.isAnimationRunning = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        this.offsetState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.overflowState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.absoluteOffset = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.animationTarget = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.MapsKt.emptyMap(), null, 2, null);
        final kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.Float, ? extends T>>(this) { // from class: androidx.compose.material.SwipeableState$latestNonEmptyAnchorsFlow$1
            final /* synthetic */ androidx.compose.material.SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final java.util.Map<java.lang.Float, T> invoke() {
                return this.this$0.getAnchors$material_release();
            }
        });
        this.latestNonEmptyAnchorsFlow = kotlinx.coroutines.flow.FlowKt.take(new kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    java.lang.Object L$1;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            java.lang.Object obj2 = anonymousClass1.result;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.$this_unsafeFlow;
                                if (!((java.util.Map) obj).isEmpty()) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.result;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Float>() { // from class: androidx.compose.material.SwipeableState$thresholds$2
            public final java.lang.Float invoke(float f, float f2) {
                return java.lang.Float.valueOf(0.0f);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Float invoke(java.lang.Float f, java.lang.Float f2) {
                return invoke(f.floatValue(), f2.floatValue());
            }
        }, null, 2, null);
        this.velocityThreshold = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, null, 2, null);
        this.resistance = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = androidx.compose.foundation.gestures.DraggableKt.DraggableState(new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>(this) { // from class: androidx.compose.material.SwipeableState$draggableState$1
            final /* synthetic */ androidx.compose.material.SwipeableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
                invoke(f.floatValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(float f) {
                androidx.compose.runtime.MutableState mutableState;
                androidx.compose.runtime.MutableState mutableState2;
                androidx.compose.runtime.MutableState mutableState3;
                androidx.compose.runtime.MutableState mutableState4;
                mutableState = ((androidx.compose.material.SwipeableState) this.this$0).absoluteOffset;
                float floatValue = ((java.lang.Number) mutableState.getValue()).floatValue() + f;
                float coerceIn = kotlin.ranges.RangesKt.coerceIn(floatValue, this.this$0.getMinBound(), this.this$0.getMaxBound());
                float f2 = floatValue - coerceIn;
                androidx.compose.material.ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
                float computeResistance = resistance$material_release != null ? resistance$material_release.computeResistance(f2) : 0.0f;
                mutableState2 = ((androidx.compose.material.SwipeableState) this.this$0).offsetState;
                mutableState2.setValue(java.lang.Float.valueOf(coerceIn + computeResistance));
                mutableState3 = ((androidx.compose.material.SwipeableState) this.this$0).overflowState;
                mutableState3.setValue(java.lang.Float.valueOf(f2));
                mutableState4 = ((androidx.compose.material.SwipeableState) this.this$0).absoluteOffset;
                mutableState4.setValue(java.lang.Float.valueOf(floatValue));
            }
        });
    }

    public /* synthetic */ SwipeableState(java.lang.Object obj, androidx.compose.animation.core.SpringSpec<java.lang.Float> springSpec, androidx.compose.material.SwipeableState.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? new kotlin.jvm.functions.Function1<T, java.lang.Boolean>() { // from class: androidx.compose.material.SwipeableState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(T t) {
                return true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj2) {
                return invoke((androidx.compose.material.SwipeableState.AnonymousClass1) obj2);
            }
        } : anonymousClass1);
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    public final kotlin.jvm.functions.Function1<T, java.lang.Boolean> getConfirmStateChange$material_release() {
        return this.confirmStateChange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue.setValue(t);
    }

    public final T getCurrentValue() {
        return this.currentValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning.setValue(java.lang.Boolean.valueOf(z));
    }

    public final boolean isAnimationRunning() {
        return ((java.lang.Boolean) this.isAnimationRunning.getValue()).booleanValue();
    }

    public final androidx.compose.runtime.State<java.lang.Float> getOffset() {
        return this.offsetState;
    }

    public final androidx.compose.runtime.State<java.lang.Float> getOverflow() {
        return this.overflowState;
    }

    public final java.util.Map<java.lang.Float, T> getAnchors$material_release() {
        return (java.util.Map) this.anchors.getValue();
    }

    public final void setAnchors$material_release(java.util.Map<java.lang.Float, ? extends T> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.anchors.setValue(map);
    }

    /* renamed from: getMinBound$material_release, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    public final void setMinBound$material_release(float f) {
        this.minBound = f;
    }

    /* renamed from: getMaxBound$material_release, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    public final void setMaxBound$material_release(float f) {
        this.maxBound = f;
    }

    public final void ensureInit$material_release(java.util.Map<java.lang.Float, ? extends T> newAnchors) {
        java.lang.Float offset;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
        if (getAnchors$material_release().isEmpty()) {
            offset = androidx.compose.material.SwipeableKt.getOffset(newAnchors, getCurrentValue());
            if (offset == null) {
                throw new java.lang.IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.offsetState.setValue(offset);
            this.absoluteOffset.setValue(offset);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final java.lang.Object processNewAnchors$material_release(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableState.processNewAnchors$material_release(java.util.Map, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Float> getThresholds$material_release() {
        return (kotlin.jvm.functions.Function2) this.thresholds.getValue();
    }

    public final void setThresholds$material_release(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.thresholds.setValue(function2);
    }

    public final float getVelocityThreshold$material_release() {
        return ((java.lang.Number) this.velocityThreshold.getValue()).floatValue();
    }

    public final void setVelocityThreshold$material_release(float f) {
        this.velocityThreshold.setValue(java.lang.Float.valueOf(f));
    }

    public final androidx.compose.material.ResistanceConfig getResistance$material_release() {
        return (androidx.compose.material.ResistanceConfig) this.resistance.getValue();
    }

    public final void setResistance$material_release(androidx.compose.material.ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    /* renamed from: getDraggableState$material_release, reason: from getter */
    public final androidx.compose.foundation.gestures.DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object snapInternalToOffset(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object drag$default = androidx.compose.foundation.gestures.DraggableState.CC.drag$default(this.draggableState, null, new androidx.compose.material.SwipeableState$snapInternalToOffset$2(f, this, null), continuation, 1, null);
        return drag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object animateInternalToOffset(float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object drag$default = androidx.compose.foundation.gestures.DraggableState.CC.drag$default(this.draggableState, null, new androidx.compose.material.SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        return drag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : kotlin.Unit.INSTANCE;
    }

    public final T getTargetValue() {
        java.lang.Float offset;
        float computeTarget;
        java.lang.Float value = this.animationTarget.getValue();
        if (value != null) {
            computeTarget = value.floatValue();
        } else {
            float floatValue = getOffset().getValue().floatValue();
            offset = androidx.compose.material.SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
            computeTarget = androidx.compose.material.SwipeableKt.computeTarget(floatValue, offset != null ? offset.floatValue() : getOffset().getValue().floatValue(), getAnchors$material_release().keySet(), getThresholds$material_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material_release().get(java.lang.Float.valueOf(computeTarget));
        return t == null ? getCurrentValue() : t;
    }

    public final androidx.compose.material.SwipeProgress<T> getProgress() {
        java.util.List findBounds;
        java.lang.Object currentValue;
        java.lang.Object obj;
        float f;
        kotlin.Pair pair;
        findBounds = androidx.compose.material.SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material_release().keySet());
        int size = findBounds.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
        } else if (size == 1) {
            java.lang.Object value = kotlin.collections.MapsKt.getValue(getAnchors$material_release(), findBounds.get(0));
            currentValue = kotlin.collections.MapsKt.getValue(getAnchors$material_release(), findBounds.get(0));
            obj = value;
        } else {
            if (getDirection() > 0.0f) {
                pair = kotlin.TuplesKt.to(findBounds.get(0), findBounds.get(1));
            } else {
                pair = kotlin.TuplesKt.to(findBounds.get(1), findBounds.get(0));
            }
            float floatValue = ((java.lang.Number) pair.component1()).floatValue();
            float floatValue2 = ((java.lang.Number) pair.component2()).floatValue();
            obj = kotlin.collections.MapsKt.getValue(getAnchors$material_release(), java.lang.Float.valueOf(floatValue));
            currentValue = kotlin.collections.MapsKt.getValue(getAnchors$material_release(), java.lang.Float.valueOf(floatValue2));
            f = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
            return new androidx.compose.material.SwipeProgress<>(obj, currentValue, f);
        }
        f = 1.0f;
        return new androidx.compose.material.SwipeProgress<>(obj, currentValue, f);
    }

    public final float getDirection() {
        java.lang.Float offset;
        offset = androidx.compose.material.SwipeableKt.getOffset(getAnchors$material_release(), getCurrentValue());
        if (offset == null) {
            return 0.0f;
        }
        return java.lang.Math.signum(getOffset().getValue().floatValue() - offset.floatValue());
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public final java.lang.Object snapTo(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.latestNonEmptyAnchorsFlow.collect(new androidx.compose.material.SwipeableState$snapTo$2(t, this), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object animateTo$default(androidx.compose.material.SwipeableState swipeableState, java.lang.Object obj, androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i & 2) != 0) {
            animationSpec = swipeableState.animationSpec;
        }
        return swipeableState.animateTo(obj, animationSpec, continuation);
    }

    @androidx.compose.material.ExperimentalMaterialApi
    public final java.lang.Object animateTo(T t, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.latestNonEmptyAnchorsFlow.collect(new androidx.compose.material.SwipeableState$animateTo$2(t, this, animationSpec), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object performFling(final float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.latestNonEmptyAnchorsFlow.collect(new kotlinx.coroutines.flow.FlowCollector<java.util.Map<java.lang.Float, ? extends T>>(this) { // from class: androidx.compose.material.SwipeableState$performFling$2
            final /* synthetic */ androidx.compose.material.SwipeableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                return emit((java.util.Map) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation2);
            }

            public final java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.lang.Float offset;
                float computeTarget;
                java.lang.Object animateInternalToOffset;
                offset = androidx.compose.material.SwipeableKt.getOffset(map, this.this$0.getCurrentValue());
                kotlin.jvm.internal.Intrinsics.checkNotNull(offset);
                float floatValue = offset.floatValue();
                computeTarget = androidx.compose.material.SwipeableKt.computeTarget(this.this$0.getOffset().getValue().floatValue(), floatValue, map.keySet(), this.this$0.getThresholds$material_release(), f, this.this$0.getVelocityThreshold$material_release());
                T t = map.get(kotlin.coroutines.jvm.internal.Boxing.boxFloat(computeTarget));
                if (t != null && this.this$0.getConfirmStateChange$material_release().invoke(t).booleanValue()) {
                    java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this.this$0, t, null, continuation2, 2, null);
                    return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
                }
                androidx.compose.material.SwipeableState<T> swipeableState = this.this$0;
                animateInternalToOffset = swipeableState.animateInternalToOffset(floatValue, swipeableState.getAnimationSpec$material_release(), continuation2);
                return animateInternalToOffset == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateInternalToOffset : kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final float performDrag(float delta) {
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(this.absoluteOffset.getValue().floatValue() + delta, this.minBound, this.maxBound) - this.absoluteOffset.getValue().floatValue();
        if (java.lang.Math.abs(coerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }

    /* compiled from: Swipeable.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", "T", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> androidx.compose.runtime.saveable.Saver<androidx.compose.material.SwipeableState<T>, T> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> confirmStateChange) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2<androidx.compose.runtime.saveable.SaverScope, androidx.compose.material.SwipeableState<T>, T>() { // from class: androidx.compose.material.SwipeableState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final T invoke(androidx.compose.runtime.saveable.SaverScope Saver, androidx.compose.material.SwipeableState<T> it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return it.getCurrentValue();
                }
            }, new kotlin.jvm.functions.Function1<T, androidx.compose.material.SwipeableState<T>>() { // from class: androidx.compose.material.SwipeableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    return invoke((androidx.compose.material.SwipeableState$Companion$Saver$2<T>) obj);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.material.SwipeableState<T> invoke(T it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return new androidx.compose.material.SwipeableState<>(it, animationSpec, confirmStateChange);
                }
            });
        }
    }
}
