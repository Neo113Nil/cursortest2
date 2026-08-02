package androidx.compose.material;

@kotlin.Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 w*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001wB:\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\rH\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00028\u00002\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\"\u0010\u0017J\u0015\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R+\u0010\n\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R+\u00103\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00008G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R+\u00105\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0005098G¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0005098G¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0014\u0010@\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010\u0019\u001a\u00020?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010AR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010.RC\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\r2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\r8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010.\u001a\u0004\bF\u0010G\"\u0004\bH\u0010\u0011R&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\r0J8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010KR\"\u0010L\u001a\u00020\u00058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010R\u001a\u00020\u00058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bR\u0010M\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QRO\u0010[\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050U2\u0018\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050U8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010.\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR+\u0010_\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00058A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010A\u001a\u0004\b]\u0010O\"\u0004\b^\u0010QR/\u0010f\u001a\u0004\u0018\u00010`2\b\u0010,\u001a\u0004\u0018\u00010`8A@AX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010.\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001a\u0010h\u001a\u00020g8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\u001b\u001a\u00028\u00008G¢\u0006\f\u0012\u0004\bm\u0010n\u001a\u0004\bl\u00100R\u001d\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000o8G¢\u0006\f\u0012\u0004\br\u0010n\u001a\u0004\bp\u0010qR\u0017\u0010v\u001a\u00020\u00058G¢\u0006\f\u0012\u0004\bu\u0010n\u001a\u0004\bt\u0010O"}, d2 = {"Landroidx/compose/material/SwipeableState;", "T", "", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "confirmStateChange", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "", "newAnchors", "", "ensureInit$material", "(Ljava/util/Map;)V", "oldAnchors", "processNewAnchors$material", "(Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p1", "getHighSpeedVideoFpsRanges", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetValue", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "anim", "animateTo", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "velocity", "performFling", "delta", "performDrag", "(F)F", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material", "()Landroidx/compose/animation/core/AnimationSpec;", "Lkotlin/jvm/functions/Function1;", "getConfirmStateChange$material", "()Lkotlin/jvm/functions/Function1;", "<set-?>", "currentValue$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentValue", "()Ljava/lang/Object;", "setCurrentValue", "(Ljava/lang/Object;)V", "currentValue", "isAnimationRunning$delegate", "isAnimationRunning", "()Z", "setAnimationRunning", "(Z)V", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "offset", "getOverflow", "overflow", "Landroidx/compose/runtime/MutableFloatState;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableFloatState;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoSizes", "anchors$delegate", "getAnchors$material", "()Ljava/util/Map;", "setAnchors$material", "anchors", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/Flow;", "minBound", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getMinBound$material", "()F", "setMinBound$material", "(F)V", "maxBound", "getMaxBound$material", "setMaxBound$material", "Lkotlin/Function2;", "thresholds$delegate", "getThresholds$material", "()Lkotlin/jvm/functions/Function2;", "setThresholds$material", "(Lkotlin/jvm/functions/Function2;)V", "thresholds", "velocityThreshold$delegate", "getVelocityThreshold$material", "setVelocityThreshold$material", "velocityThreshold", "Landroidx/compose/material/ResistanceConfig;", "resistance$delegate", "getResistance$material", "()Landroidx/compose/material/ResistanceConfig;", "setResistance$material", "(Landroidx/compose/material/ResistanceConfig;)V", "resistance", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "getDraggableState$material", "()Landroidx/compose/foundation/gestures/DraggableState;", "getTargetValue", "getTargetValue$annotations", "()V", "Landroidx/compose/material/SwipeProgress;", "getProgress", "()Landroidx/compose/material/SwipeProgress;", "getProgress$annotations", "progress", "getDirection", "getDirection$annotations", "direction", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class SwipeableState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material.SwipeableState.Companion INSTANCE = new androidx.compose.material.SwipeableState.Companion(null);
    private final androidx.compose.runtime.MutableFloatState Camera2StreamConfigurationMap;

    /* renamed from: anchors$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState anchors;
    private final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec;
    private final kotlin.jvm.functions.Function1<T, java.lang.Boolean> confirmStateChange;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState currentValue;
    private final androidx.compose.foundation.gestures.DraggableState draggableState;
    private final androidx.compose.runtime.MutableFloatState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Float, T>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Float> getHighSpeedVideoFpsRangesFor;

    /* renamed from: isAnimationRunning$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isAnimationRunning;
    private float maxBound;
    private float minBound;

    /* renamed from: resistance$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState resistance;

    /* renamed from: thresholds$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState thresholds;

    /* renamed from: velocityThreshold$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState velocityThreshold;

    public static /* synthetic */ float $r8$lambda$QQjDtdvcHvFcpMvffCPVPAcpv60(float f, float f2) {
        return 0.0f;
    }

    /* renamed from: $r8$lambda$qGM9-c4_kzcvD1w0MoGbEiGcolI, reason: not valid java name */
    public static /* synthetic */ boolean m2776$r8$lambda$qGM9c4_kzcvD1w0MoGbEiGcolI(java.lang.Object obj) {
        return true;
    }

    public static /* synthetic */ void getDirection$annotations() {
    }

    public static /* synthetic */ void getProgress$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableState(T t, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1) {
        this.animationSpec = animationSpec;
        this.confirmStateChange = function1;
        this.currentValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.isAnimationRunning = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.Camera2StreamConfigurationMap = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.MapsKt.emptyMap(), null, 2, null);
        final kotlinx.coroutines.flow.Flow snapshotFlow = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.Map highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.material.SwipeableState.getHighSpeedVideoFpsRanges(androidx.compose.material.SwipeableState.this);
                return highSpeedVideoFpsRanges;
            }
        });
        this.getHighSpeedVideoSizes = kotlinx.coroutines.flow.FlowKt.take(new kotlinx.coroutines.flow.Flow<java.util.Map<java.lang.Float, ? extends T>>() { // from class: androidx.compose.material.SwipeableState$special$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoSizes;

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
                        if ((anonymousClass1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Camera2StreamConfigurationMap -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoSizes;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.Camera2StreamConfigurationMap;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoSizes;
                                if (!((java.util.Map) obj).isEmpty()) {
                                    anonymousClass1.Camera2StreamConfigurationMap = 1;
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
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwipeableState$special$$inlined$filter$1$2", f = "Swipeable.kt", i = {}, l = {50}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.compose.material.SwipeableState$special$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int Camera2StreamConfigurationMap;
                    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoSizes = obj;
                        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
                        return androidx.compose.material.SwipeableState$special$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoSizes = flowCollector;
                }
            }
        }, 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Float.valueOf(androidx.compose.material.SwipeableState.$r8$lambda$QQjDtdvcHvFcpMvffCPVPAcpv60(((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue()));
            }
        }, null, 2, null);
        this.velocityThreshold = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.resistance = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggableState = androidx.compose.foundation.gestures.DraggableKt.DraggableState(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.material.SwipeableState.getHighSpeedVideoSizes(androidx.compose.material.SwipeableState.this, ((java.lang.Float) obj).floatValue());
                return highSpeedVideoSizes;
            }
        });
    }

    public /* synthetic */ SwipeableState(java.lang.Object obj, androidx.compose.animation.core.SpringSpec<java.lang.Float> springSpec, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.getAnimationSpec() : springSpec, (i & 4) != 0 ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SwipeableState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(androidx.compose.material.SwipeableState.m2776$r8$lambda$qGM9c4_kzcvD1w0MoGbEiGcolI(obj2));
            }
        } : function1);
    }

    public final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getAnimationSpec$material() {
        return this.animationSpec;
    }

    public final kotlin.jvm.functions.Function1<T, java.lang.Boolean> getConfirmStateChange$material() {
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
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.compose.runtime.State<java.lang.Float> getOverflow() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.Map<java.lang.Float, T> getAnchors$material() {
        return (java.util.Map) this.anchors.getValue();
    }

    public final void setAnchors$material(java.util.Map<java.lang.Float, ? extends T> map) {
        this.anchors.setValue(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map getHighSpeedVideoFpsRanges(androidx.compose.material.SwipeableState swipeableState) {
        return swipeableState.getAnchors$material();
    }

    /* renamed from: getMinBound$material, reason: from getter */
    public final float getMinBound() {
        return this.minBound;
    }

    public final void setMinBound$material(float f) {
        this.minBound = f;
    }

    /* renamed from: getMaxBound$material, reason: from getter */
    public final float getMaxBound() {
        return this.maxBound;
    }

    public final void setMaxBound$material(float f) {
        this.maxBound = f;
    }

    public final void ensureInit$material(java.util.Map<java.lang.Float, ? extends T> newAnchors) {
        java.lang.Float highSpeedVideoSizes;
        if (getAnchors$material().isEmpty()) {
            highSpeedVideoSizes = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(newAnchors, getCurrentValue());
            if (highSpeedVideoSizes == null) {
                throw new java.lang.IllegalArgumentException("The initial value must have an associated anchor.".toString());
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setFloatValue(highSpeedVideoSizes.floatValue());
            this.getHighSpeedVideoFpsRanges.setFloatValue(highSpeedVideoSizes.floatValue());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(6:21|22|23|14|15|16))(3:25|26|27))(3:28|(2:30|(1:32)(2:35|36))(4:37|(3:39|(2:41|(1:43)(3:46|(2:48|(2:50|(3:51|(1:53)|54)))|58))(4:59|(1:61)|62|(1:64)(3:65|(2:67|(2:69|(3:70|(1:72)|73)))|77))|44)|15|16)|34)))|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (getHighSpeedVideoFpsRangesFor(r10, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c1, code lost:
    
        if (r12 != r1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c4, code lost:
    
        r0.getHighSpeedVideoFpsRanges = r11;
        r0.getHighSpeedVideoFpsRangesFor = r10;
        r0.getHighSpeedVideoSizes = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ce, code lost:
    
        if (getHighSpeedVideoFpsRangesFor(r10, r0) != r1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v24, types: [float] */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v59, types: [float] */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object processNewAnchors$material(java.util.Map<java.lang.Float, ? extends T> map, java.util.Map<java.lang.Float, ? extends T> map2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        int i;
        java.lang.Float highSpeedVideoSizes;
        float f;
        java.lang.Float highSpeedVideoSizes2;
        java.lang.Float highSpeedVideoSizes3;
        try {
            if (continuation instanceof androidx.compose.material.SwipeableState$processNewAnchors$1) {
                swipeableState$processNewAnchors$1 = (androidx.compose.material.SwipeableState$processNewAnchors$1) continuation;
                if ((swipeableState$processNewAnchors$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    swipeableState$processNewAnchors$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = swipeableState$processNewAnchors$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = swipeableState$processNewAnchors$1.getHighSpeedVideoSizes;
                    if (i == 0) {
                        if (i == 1) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i == 2) {
                            boolean z = (java.util.Map<java.lang.Float, ? extends T>) swipeableState$processNewAnchors$1.getHighSpeedVideoFpsRangesFor;
                            map2 = (java.util.Map) swipeableState$processNewAnchors$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            map = z;
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map = (java.util.Map<java.lang.Float, ? extends T>) swipeableState$processNewAnchors$1.getHighSpeedVideoFpsRangesFor;
                        map2 = (java.util.Map) swipeableState$processNewAnchors$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (map.isEmpty()) {
                        java.lang.Float minOrNull = kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable<? extends java.lang.Float>) map2.keySet());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(minOrNull);
                        this.minBound = minOrNull.floatValue();
                        java.lang.Float maxOrNull = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) map2.keySet());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(maxOrNull);
                        this.maxBound = maxOrNull.floatValue();
                        highSpeedVideoSizes3 = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(map2, getCurrentValue());
                        if (highSpeedVideoSizes3 == null) {
                            throw new java.lang.IllegalArgumentException("The initial value must have an associated anchor.".toString());
                        }
                        float floatValue = highSpeedVideoSizes3.floatValue();
                        swipeableState$processNewAnchors$1.getHighSpeedVideoSizes = 1;
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(map2, map)) {
                            this.minBound = Float.NEGATIVE_INFINITY;
                            this.maxBound = Float.POSITIVE_INFINITY;
                            java.lang.Float value = this.getHighSpeedVideoFpsRangesFor.getValue();
                            java.lang.Object obj2 = null;
                            if (value != null) {
                                highSpeedVideoSizes2 = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(map2, map.get(value));
                                if (highSpeedVideoSizes2 != null) {
                                    f = highSpeedVideoSizes2.floatValue();
                                } else {
                                    java.util.Iterator<T> it = map2.keySet().iterator();
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (it.hasNext()) {
                                            float abs = java.lang.Math.abs(((java.lang.Number) obj2).floatValue() - value.floatValue());
                                            do {
                                                java.lang.Object next = it.next();
                                                float abs2 = java.lang.Math.abs(((java.lang.Number) next).floatValue() - value.floatValue());
                                                if (java.lang.Float.compare(abs, abs2) > 0) {
                                                    obj2 = next;
                                                    abs = abs2;
                                                }
                                            } while (it.hasNext());
                                        }
                                    }
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                                    f = ((java.lang.Number) obj2).floatValue();
                                }
                            } else {
                                java.lang.Object obj3 = map.get(getOffset().getValue());
                                if (kotlin.jvm.internal.Intrinsics.areEqual(obj3, getCurrentValue())) {
                                    obj3 = getCurrentValue();
                                }
                                highSpeedVideoSizes = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(map2, obj3);
                                if (highSpeedVideoSizes != null) {
                                    f = highSpeedVideoSizes.floatValue();
                                } else {
                                    java.util.Iterator<T> it2 = map2.keySet().iterator();
                                    if (it2.hasNext()) {
                                        obj2 = it2.next();
                                        if (it2.hasNext()) {
                                            float abs3 = java.lang.Math.abs(((java.lang.Number) obj2).floatValue() - getOffset().getValue().floatValue());
                                            do {
                                                java.lang.Object next2 = it2.next();
                                                float abs4 = java.lang.Math.abs(((java.lang.Number) next2).floatValue() - getOffset().getValue().floatValue());
                                                if (java.lang.Float.compare(abs3, abs4) > 0) {
                                                    obj2 = next2;
                                                    abs3 = abs4;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    }
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                                    f = ((java.lang.Number) obj2).floatValue();
                                }
                            }
                            androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.animationSpec;
                            swipeableState$processNewAnchors$1.getHighSpeedVideoFpsRanges = map2;
                            swipeableState$processNewAnchors$1.getHighSpeedVideoFpsRangesFor = f;
                            swipeableState$processNewAnchors$1.getHighSpeedVideoSizes = 2;
                            java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(f, animationSpec, swipeableState$processNewAnchors$1);
                            map = f;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            if (i == 0) {
            }
        } finally {
            setCurrentValue(kotlin.collections.MapsKt.getValue(map2, kotlin.coroutines.jvm.internal.Boxing.boxFloat(map)));
            java.lang.Float minOrNull2 = kotlin.collections.CollectionsKt.minOrNull((java.lang.Iterable<? extends java.lang.Float>) map2.keySet());
            kotlin.jvm.internal.Intrinsics.checkNotNull(minOrNull2);
            this.minBound = minOrNull2.floatValue();
            java.lang.Float maxOrNull2 = kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable<? extends java.lang.Float>) map2.keySet());
            kotlin.jvm.internal.Intrinsics.checkNotNull(maxOrNull2);
            this.maxBound = maxOrNull2.floatValue();
        }
        swipeableState$processNewAnchors$1 = new androidx.compose.material.SwipeableState$processNewAnchors$1(this, continuation);
        java.lang.Object obj4 = swipeableState$processNewAnchors$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = swipeableState$processNewAnchors$1.getHighSpeedVideoSizes;
    }

    public final kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Float> getThresholds$material() {
        return (kotlin.jvm.functions.Function2) this.thresholds.getValue();
    }

    public final void setThresholds$material(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> function2) {
        this.thresholds.setValue(function2);
    }

    public final float getVelocityThreshold$material() {
        return this.velocityThreshold.getFloatValue();
    }

    public final void setVelocityThreshold$material(float f) {
        this.velocityThreshold.setFloatValue(f);
    }

    public final androidx.compose.material.ResistanceConfig getResistance$material() {
        return (androidx.compose.material.ResistanceConfig) this.resistance.getValue();
    }

    public final void setResistance$material(androidx.compose.material.ResistanceConfig resistanceConfig) {
        this.resistance.setValue(resistanceConfig);
    }

    /* renamed from: getDraggableState$material, reason: from getter */
    public final androidx.compose.foundation.gestures.DraggableState getDraggableState() {
        return this.draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.material.SwipeableState swipeableState, float f) {
        float floatValue = swipeableState.getHighSpeedVideoFpsRanges.getFloatValue() + f;
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(floatValue, swipeableState.minBound, swipeableState.maxBound);
        float f2 = floatValue - coerceIn;
        androidx.compose.material.ResistanceConfig resistance$material = swipeableState.getResistance$material();
        swipeableState.getHighResolutionOutputSizeshNQ4ISI.setFloatValue(coerceIn + (resistance$material != null ? resistance$material.computeResistance(f2) : 0.0f));
        swipeableState.Camera2StreamConfigurationMap.setFloatValue(f2);
        swipeableState.getHighSpeedVideoFpsRanges.setFloatValue(floatValue);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object drag$default = androidx.compose.foundation.gestures.DraggableState.drag$default(this.draggableState, null, new androidx.compose.material.SwipeableState$snapInternalToOffset$2(f, this, null), continuation, 1, null);
        return drag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object drag$default = androidx.compose.foundation.gestures.DraggableState.drag$default(this.draggableState, null, new androidx.compose.material.SwipeableState$animateInternalToOffset$2(this, f, animationSpec, null), continuation, 1, null);
        return drag$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? drag$default : kotlin.Unit.INSTANCE;
    }

    public final T getTargetValue() {
        java.lang.Float highSpeedVideoSizes;
        float highResolutionOutputSizeshNQ4ISI;
        java.lang.Float value = this.getHighSpeedVideoFpsRangesFor.getValue();
        if (value != null) {
            highResolutionOutputSizeshNQ4ISI = value.floatValue();
        } else {
            float floatValue = getOffset().getValue().floatValue();
            highSpeedVideoSizes = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(getAnchors$material(), getCurrentValue());
            if (highSpeedVideoSizes == null) {
                highSpeedVideoSizes = getOffset().getValue();
            }
            highResolutionOutputSizeshNQ4ISI = androidx.compose.material.SwipeableKt.getHighResolutionOutputSizeshNQ4ISI(floatValue, highSpeedVideoSizes.floatValue(), getAnchors$material().keySet(), getThresholds$material(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material().get(java.lang.Float.valueOf(highResolutionOutputSizeshNQ4ISI));
        return t == null ? getCurrentValue() : t;
    }

    public final androidx.compose.material.SwipeProgress<T> getProgress() {
        java.util.List highSpeedVideoFpsRangesFor;
        java.lang.Object currentValue;
        java.lang.Object obj;
        float f;
        kotlin.Pair pair;
        highSpeedVideoFpsRangesFor = androidx.compose.material.SwipeableKt.getHighSpeedVideoFpsRangesFor(getOffset().getValue().floatValue(), getAnchors$material().keySet());
        int size = highSpeedVideoFpsRangesFor.size();
        if (size == 0) {
            T currentValue2 = getCurrentValue();
            currentValue = getCurrentValue();
            obj = currentValue2;
            f = 1.0f;
        } else if (size == 1) {
            java.lang.Object value = kotlin.collections.MapsKt.getValue(getAnchors$material(), highSpeedVideoFpsRangesFor.get(0));
            currentValue = kotlin.collections.MapsKt.getValue(getAnchors$material(), highSpeedVideoFpsRangesFor.get(0));
            f = 1.0f;
            obj = value;
        } else {
            if (getDirection() > 0.0f) {
                pair = kotlin.TuplesKt.to(highSpeedVideoFpsRangesFor.get(0), highSpeedVideoFpsRangesFor.get(1));
            } else {
                pair = kotlin.TuplesKt.to(highSpeedVideoFpsRangesFor.get(1), highSpeedVideoFpsRangesFor.get(0));
            }
            float floatValue = ((java.lang.Number) pair.component1()).floatValue();
            float floatValue2 = ((java.lang.Number) pair.component2()).floatValue();
            obj = kotlin.collections.MapsKt.getValue(getAnchors$material(), java.lang.Float.valueOf(floatValue));
            currentValue = kotlin.collections.MapsKt.getValue(getAnchors$material(), java.lang.Float.valueOf(floatValue2));
            f = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
        }
        return new androidx.compose.material.SwipeProgress<>(obj, currentValue, f);
    }

    public final float getDirection() {
        java.lang.Float highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(getAnchors$material(), getCurrentValue());
        if (highSpeedVideoSizes == null) {
            return 0.0f;
        }
        return java.lang.Math.signum(getOffset().getValue().floatValue() - highSpeedVideoSizes.floatValue());
    }

    public final java.lang.Object snapTo(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.getHighSpeedVideoSizes.collect(new androidx.compose.material.SwipeableState$snapTo$2(t, this), continuation);
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

    public final java.lang.Object animateTo(T t, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.getHighSpeedVideoSizes.collect(new androidx.compose.material.SwipeableState$animateTo$2(t, this, animationSpec), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object performFling(final float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = this.getHighSpeedVideoSizes.collect(new kotlinx.coroutines.flow.FlowCollector(this) { // from class: androidx.compose.material.SwipeableState$performFling$2
            final /* synthetic */ androidx.compose.material.SwipeableState<T> getHighSpeedVideoFpsRanges;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public java.lang.Object emit(java.util.Map<java.lang.Float, ? extends T> map, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                java.lang.Float highSpeedVideoSizes;
                float highResolutionOutputSizeshNQ4ISI;
                java.lang.Object highSpeedVideoFpsRanges;
                highSpeedVideoSizes = androidx.compose.material.SwipeableKt.getHighSpeedVideoSizes(map, this.getHighSpeedVideoFpsRanges.getCurrentValue());
                kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
                float floatValue = highSpeedVideoSizes.floatValue();
                highResolutionOutputSizeshNQ4ISI = androidx.compose.material.SwipeableKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getOffset().getValue().floatValue(), floatValue, map.keySet(), this.getHighSpeedVideoFpsRanges.getThresholds$material(), f, this.getHighSpeedVideoFpsRanges.getVelocityThreshold$material());
                T t = map.get(kotlin.coroutines.jvm.internal.Boxing.boxFloat(highResolutionOutputSizeshNQ4ISI));
                if (t != null && this.getHighSpeedVideoFpsRanges.getConfirmStateChange$material().invoke(t).booleanValue()) {
                    java.lang.Object animateTo$default = androidx.compose.material.SwipeableState.animateTo$default(this.getHighSpeedVideoFpsRanges, t, null, continuation2, 2, null);
                    return animateTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? animateTo$default : kotlin.Unit.INSTANCE;
                }
                androidx.compose.material.SwipeableState<T> swipeableState = this.getHighSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = swipeableState.getHighSpeedVideoFpsRanges(floatValue, swipeableState.getAnimationSpec$material(), continuation2);
                return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public final float performDrag(float delta) {
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(this.getHighSpeedVideoFpsRanges.getFloatValue() + delta, this.minBound, this.maxBound) - this.getHighSpeedVideoFpsRanges.getFloatValue();
        if (java.lang.Math.abs(coerceIn) > 0.0f) {
            this.draggableState.dispatchRawDelta(coerceIn);
        }
        return coerceIn;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\u0004*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/material/SwipeableState$Companion;", "", "<init>", "()V", "T", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/SwipeableState;", "Saver", "(Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T> androidx.compose.runtime.saveable.Saver<androidx.compose.material.SwipeableState<T>, T> Saver(final androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> confirmStateChange) {
            return androidx.compose.runtime.saveable.SaverKt.Saver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.SwipeableState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.Object highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.material.SwipeableState.Companion.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.material.SwipeableState) obj2);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SwipeableState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.material.SwipeableState highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.material.SwipeableState.Companion.getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.AnimationSpec.this, confirmStateChange, obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material.SwipeableState swipeableState) {
            return swipeableState.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.material.SwipeableState getHighSpeedVideoFpsRangesFor(androidx.compose.animation.core.AnimationSpec animationSpec, kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
            return new androidx.compose.material.SwipeableState(obj, animationSpec, function1);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
