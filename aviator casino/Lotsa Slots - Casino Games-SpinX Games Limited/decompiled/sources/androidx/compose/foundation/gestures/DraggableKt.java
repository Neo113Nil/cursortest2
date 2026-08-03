package androidx.compose.foundation.gestures;

/* compiled from: Draggable.kt */
@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a!\u0010\b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0002\u0010\t\u001aR\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b*\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017\u001aY\u0010\u0018\u001a\u00020\u0010*\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u00102\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001aÉ\u0001\u0010\"\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u00102\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010\u0011\u001a\u00020\u00102>\b\u0002\u0010*\u001a8\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00110\r¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000700\u0012\u0006\u0012\u0004\u0018\u0001010+¢\u0006\u0002\b22>\b\u0002\u00103\u001a8\b\u0001\u0012\u0004\u0012\u00020,\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(4\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000700\u0012\u0006\u0012\u0004\u0018\u0001010+¢\u0006\u0002\b22\b\b\u0002\u0010\u001e\u001a\u00020\u0010¢\u0006\u0002\u00105\u001aG\u00106\u001a\u00020\u0010*\u00020\u000e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u00107\u001a\u0002082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001e\u0010<\u001a\u00020\u0006*\u00020\r2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u001e\u0010<\u001a\u00020\u0006*\u00020?2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010>\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"NoOpDragScope", "Landroidx/compose/foundation/gestures/DragScope;", "DraggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "onDelta", "Lkotlin/Function1;", "", "", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "awaitDownAndSlop", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "canDrag", "", "startDragImmediately", "Lkotlin/Function0;", "velocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "pointerDirectionConfig", "Landroidx/compose/foundation/gestures/PointerDirectionConfig;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/PointerDirectionConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitDrag", "startEvent", "initialDelta", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "reverseDirection", "hasDragged", "awaitDrag-Su4bsnU", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "draggable", "Landroidx/compose/ui/Modifier;", "state", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onDragStarted", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStopped", "velocity", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "onDragOrUp", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "onDrag", "onDragOrUp-Axegvzg", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toFloat", "toFloat-3MmeM6k", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "toFloat-sF-c-tU", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableKt {
    private static final androidx.compose.foundation.gestures.DragScope NoOpDragScope = new androidx.compose.foundation.gestures.DragScope() { // from class: androidx.compose.foundation.gestures.DraggableKt$NoOpDragScope$1
        @Override // androidx.compose.foundation.gestures.DragScope
        public void dragBy(float pixels) {
        }
    };

    public static final androidx.compose.foundation.gestures.DraggableState DraggableState(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1) {
        return new androidx.compose.foundation.gestures.DefaultDraggableState(function1);
    }

    public static final androidx.compose.foundation.gestures.DraggableState rememberDraggableState(kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-183245213);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberDraggableState)142@6209L29,143@6250L61:Draggable.kt#8bwon0");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:141)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function1, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = DraggableState(new kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$rememberDraggableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Float f) {
                    invoke(f.floatValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(float f) {
                    rememberUpdatedState.getValue().invoke(java.lang.Float.valueOf(f));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.gestures.DraggableState draggableState = (androidx.compose.foundation.gestures.DraggableState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }

    public static final androidx.compose.ui.Modifier draggable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.DraggableState draggableState, androidx.compose.foundation.gestures.Orientation orientation, boolean z, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final boolean z2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super java.lang.Float, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function32, boolean z3) {
        return modifier.then(new androidx.compose.foundation.gestures.DraggableElement(draggableState, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
                return true;
            }
        }, orientation, z, mutableInteractionSource, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableKt$draggable$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() {
                return java.lang.Boolean.valueOf(z2);
            }
        }, function3, new androidx.compose.foundation.gestures.DraggableKt$draggable$5(function32, orientation, null), z3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x028a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0203 -> B:22:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x024d -> B:13:0x0256). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x028c -> B:22:0x0177). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitDownAndSlop(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function1, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig, kotlin.coroutines.Continuation<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset>> continuation) {
        androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$1;
        int i;
        kotlin.jvm.functions.Function0<java.lang.Boolean> function02;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function12;
        final androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        final kotlin.jvm.internal.Ref.LongRef longRef;
        kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function2;
        long id;
        float m353pointerSlopE8SPZFQ;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        long m1887getZeroF1C5BW0;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$12;
        long j;
        kotlin.jvm.internal.Ref.LongRef longRef3;
        kotlin.jvm.internal.Ref.LongRef longRef4;
        float f;
        int size;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4;
        int i2;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1) {
            draggableKt$awaitDownAndSlop$1 = (androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1) continuation;
            if ((draggableKt$awaitDownAndSlop$1.label & Integer.MIN_VALUE) != 0) {
                draggableKt$awaitDownAndSlop$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = draggableKt$awaitDownAndSlop$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableKt$awaitDownAndSlop$1.label;
                int i3 = 3;
                int i4 = 0;
                int i5 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Initial;
                    draggableKt$awaitDownAndSlop$1.L$0 = awaitPointerEventScope;
                    draggableKt$awaitDownAndSlop$1.L$1 = function1;
                    function02 = function0;
                    draggableKt$awaitDownAndSlop$1.L$2 = function02;
                    draggableKt$awaitDownAndSlop$1.L$3 = velocityTracker;
                    draggableKt$awaitDownAndSlop$1.L$4 = pointerDirectionConfig;
                    draggableKt$awaitDownAndSlop$1.label = 1;
                    obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass2, draggableKt$awaitDownAndSlop$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    pointerDirectionConfig2 = pointerDirectionConfig;
                    function12 = function1;
                    velocityTracker2 = velocityTracker;
                } else if (i == 1) {
                    pointerDirectionConfig2 = (androidx.compose.foundation.gestures.PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$4;
                    velocityTracker2 = (androidx.compose.ui.input.pointer.util.VelocityTracker) draggableKt$awaitDownAndSlop$1.L$3;
                    function02 = (kotlin.jvm.functions.Function0) draggableKt$awaitDownAndSlop$1.L$2;
                    function12 = (kotlin.jvm.functions.Function1) draggableKt$awaitDownAndSlop$1.L$1;
                    awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    pointerDirectionConfig2 = (androidx.compose.foundation.gestures.PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$2;
                    velocityTracker2 = (androidx.compose.ui.input.pointer.util.VelocityTracker) draggableKt$awaitDownAndSlop$1.L$1;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange5);
                    longRef = new kotlin.jvm.internal.Ref.LongRef();
                    longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                    function2 = new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6, androidx.compose.ui.geometry.Offset offset) {
                            m372invokeUv8p0NA(pointerInputChange6, offset.getPackedValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                        public final void m372invokeUv8p0NA(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6, long j2) {
                            androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(androidx.compose.ui.input.pointer.util.VelocityTracker.this, pointerInputChange6);
                            pointerInputChange6.consume();
                            longRef.element = j2;
                        }
                    };
                    id = pointerInputChange5.getId();
                    int type = pointerInputChange5.getType();
                    if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m352isPointerUpDmW0f2w(awaitPointerEventScope3.getCurrentEvent(), id)) {
                        m353pointerSlopE8SPZFQ = androidx.compose.foundation.gestures.DragGestureDetectorKt.m353pointerSlopE8SPZFQ(awaitPointerEventScope3.getViewConfiguration(), type);
                        longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                        longRef2.element = id;
                        m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                        draggableKt$awaitDownAndSlop$1.L$0 = pointerDirectionConfig2;
                        draggableKt$awaitDownAndSlop$1.L$1 = longRef;
                        draggableKt$awaitDownAndSlop$1.L$2 = function2;
                        draggableKt$awaitDownAndSlop$1.L$3 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$1.L$4 = longRef2;
                        draggableKt$awaitDownAndSlop$1.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$1.F$0 = m353pointerSlopE8SPZFQ;
                        draggableKt$awaitDownAndSlop$1.J$0 = m1887getZeroF1C5BW0;
                        draggableKt$awaitDownAndSlop$1.label = i3;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$1, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                        }
                    } else {
                        pointerInputChange2 = null;
                        if (pointerInputChange2 == null) {
                        }
                    }
                } else if (i == 3) {
                    long j2 = draggableKt$awaitDownAndSlop$1.J$0;
                    float f2 = draggableKt$awaitDownAndSlop$1.F$0;
                    longRef4 = (kotlin.jvm.internal.Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$4;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$3;
                    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function22 = (kotlin.jvm.functions.Function2) draggableKt$awaitDownAndSlop$1.L$2;
                    longRef3 = (kotlin.jvm.internal.Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$1;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig3 = (androidx.compose.foundation.gestures.PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                    f = f2;
                    pointerDirectionConfig2 = pointerDirectionConfig3;
                    j = j2;
                    awaitPointerEventScope3 = awaitPointerEventScope5;
                    function2 = function22;
                    androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$13 = draggableKt$awaitDownAndSlop$12;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    while (true) {
                        if (i4 < size) {
                        }
                        i4++;
                        size = i2;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    pointerInputChange2 = pointerInputChange3;
                    if (pointerInputChange2 != null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        }
                        draggableKt$awaitDownAndSlop$1.L$0 = pointerDirectionConfig2;
                        draggableKt$awaitDownAndSlop$1.L$1 = longRef;
                        draggableKt$awaitDownAndSlop$1.L$2 = function2;
                        draggableKt$awaitDownAndSlop$1.L$3 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$1.L$4 = longRef2;
                        draggableKt$awaitDownAndSlop$1.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$1.F$0 = m353pointerSlopE8SPZFQ;
                        draggableKt$awaitDownAndSlop$1.J$0 = m1887getZeroF1C5BW0;
                        draggableKt$awaitDownAndSlop$1.label = i3;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$1, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                        }
                    }
                    longRef = longRef3;
                    pointerInputChange2 = null;
                    if (pointerInputChange2 == null) {
                    }
                } else {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = draggableKt$awaitDownAndSlop$1.J$0;
                    float f3 = draggableKt$awaitDownAndSlop$1.F$0;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6 = (androidx.compose.ui.input.pointer.PointerInputChange) draggableKt$awaitDownAndSlop$1.L$5;
                    kotlin.jvm.internal.Ref.LongRef longRef5 = (kotlin.jvm.internal.Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$4;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) draggableKt$awaitDownAndSlop$1.L$3;
                    kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function23 = (kotlin.jvm.functions.Function2) draggableKt$awaitDownAndSlop$1.L$2;
                    kotlin.jvm.internal.Ref.LongRef longRef6 = (kotlin.jvm.internal.Ref.LongRef) draggableKt$awaitDownAndSlop$1.L$1;
                    androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig4 = (androidx.compose.foundation.gestures.PointerDirectionConfig) draggableKt$awaitDownAndSlop$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    m353pointerSlopE8SPZFQ = f3;
                    pointerDirectionConfig2 = pointerDirectionConfig4;
                    long j4 = j3;
                    awaitPointerEventScope3 = awaitPointerEventScope6;
                    function2 = function23;
                    longRef3 = longRef6;
                    if (!pointerInputChange6.isConsumed()) {
                        longRef2 = longRef5;
                        longRef = longRef3;
                        i3 = 3;
                        pointerEventPass = null;
                        m1887getZeroF1C5BW0 = j4;
                        i4 = 0;
                        i5 = 1;
                        draggableKt$awaitDownAndSlop$1.L$0 = pointerDirectionConfig2;
                        draggableKt$awaitDownAndSlop$1.L$1 = longRef;
                        draggableKt$awaitDownAndSlop$1.L$2 = function2;
                        draggableKt$awaitDownAndSlop$1.L$3 = awaitPointerEventScope3;
                        draggableKt$awaitDownAndSlop$1.L$4 = longRef2;
                        draggableKt$awaitDownAndSlop$1.L$5 = pointerEventPass;
                        draggableKt$awaitDownAndSlop$1.F$0 = m353pointerSlopE8SPZFQ;
                        draggableKt$awaitDownAndSlop$1.J$0 = m1887getZeroF1C5BW0;
                        draggableKt$awaitDownAndSlop$1.label = i3;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$1, i5, pointerEventPass);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        draggableKt$awaitDownAndSlop$12 = draggableKt$awaitDownAndSlop$1;
                        f = m353pointerSlopE8SPZFQ;
                        obj = awaitPointerEvent$default;
                        j = m1887getZeroF1C5BW0;
                        longRef3 = longRef;
                        longRef4 = longRef2;
                        androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1 draggableKt$awaitDownAndSlop$132 = draggableKt$awaitDownAndSlop$12;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                        size = changes2.size();
                        while (true) {
                            if (i4 < size) {
                                awaitPointerEventScope4 = awaitPointerEventScope3;
                                pointerInputChange3 = null;
                                break;
                            }
                            pointerInputChange3 = changes2.get(i4);
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            i2 = size;
                            if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange3.getId(), longRef4.element)) {
                                break;
                            }
                            i4++;
                            size = i2;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        pointerInputChange2 = pointerInputChange3;
                        if (pointerInputChange2 != null && !pointerInputChange2.isConsumed()) {
                            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                kotlin.jvm.internal.Ref.LongRef longRef7 = longRef4;
                                long m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange2.getPosition(), pointerInputChange2.getPreviousPosition()));
                                if (pointerDirectionConfig2.mo355calculateDeltaChangek4lQ0M(m1876plusMKHz9U) < f) {
                                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                                    draggableKt$awaitDownAndSlop$132.L$0 = pointerDirectionConfig2;
                                    draggableKt$awaitDownAndSlop$132.L$1 = longRef3;
                                    draggableKt$awaitDownAndSlop$132.L$2 = function2;
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope4;
                                    draggableKt$awaitDownAndSlop$132.L$3 = awaitPointerEventScope7;
                                    draggableKt$awaitDownAndSlop$132.L$4 = longRef7;
                                    draggableKt$awaitDownAndSlop$132.L$5 = pointerInputChange2;
                                    draggableKt$awaitDownAndSlop$132.F$0 = f;
                                    draggableKt$awaitDownAndSlop$132.J$0 = m1876plusMKHz9U;
                                    draggableKt$awaitDownAndSlop$132.label = 4;
                                    if (awaitPointerEventScope7.awaitPointerEvent(pointerEventPass3, draggableKt$awaitDownAndSlop$132) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    longRef5 = longRef7;
                                    m353pointerSlopE8SPZFQ = f;
                                    draggableKt$awaitDownAndSlop$1 = draggableKt$awaitDownAndSlop$132;
                                    pointerInputChange6 = pointerInputChange2;
                                    awaitPointerEventScope3 = awaitPointerEventScope7;
                                    j4 = m1876plusMKHz9U;
                                    if (!pointerInputChange6.isConsumed()) {
                                    }
                                } else {
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope8 = awaitPointerEventScope4;
                                    function2.invoke(pointerInputChange2, androidx.compose.ui.geometry.Offset.m1860boximpl(pointerDirectionConfig2.mo356calculatePostSlopOffset8S9VItk(m1876plusMKHz9U, f)));
                                    if (pointerInputChange2.isConsumed()) {
                                        longRef = longRef3;
                                        if (pointerInputChange2 == null) {
                                            return kotlin.TuplesKt.to(pointerInputChange2, androidx.compose.ui.geometry.Offset.m1860boximpl(longRef.element));
                                        }
                                        return null;
                                    }
                                    longRef = longRef3;
                                    i4 = 0;
                                    pointerEventPass = null;
                                    m1887getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                                    awaitPointerEventScope3 = awaitPointerEventScope8;
                                    i3 = 3;
                                    i5 = 1;
                                    longRef2 = longRef7;
                                    m353pointerSlopE8SPZFQ = f;
                                    draggableKt$awaitDownAndSlop$1 = draggableKt$awaitDownAndSlop$132;
                                }
                            } else {
                                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                                int size2 = changes3.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        pointerInputChange4 = null;
                                        break;
                                    }
                                    pointerInputChange4 = changes3.get(i6);
                                    if (pointerInputChange4.getPressed()) {
                                        break;
                                    }
                                    i6++;
                                }
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange7 = pointerInputChange4;
                                if (pointerInputChange7 != null) {
                                    longRef4.element = pointerInputChange7.getId();
                                    m353pointerSlopE8SPZFQ = f;
                                    draggableKt$awaitDownAndSlop$1 = draggableKt$awaitDownAndSlop$132;
                                    longRef2 = longRef4;
                                    longRef = longRef3;
                                    m1887getZeroF1C5BW0 = j;
                                    awaitPointerEventScope3 = awaitPointerEventScope4;
                                    i3 = 3;
                                    i4 = 0;
                                    i5 = 1;
                                    pointerEventPass = null;
                                }
                            }
                            draggableKt$awaitDownAndSlop$1.L$0 = pointerDirectionConfig2;
                            draggableKt$awaitDownAndSlop$1.L$1 = longRef;
                            draggableKt$awaitDownAndSlop$1.L$2 = function2;
                            draggableKt$awaitDownAndSlop$1.L$3 = awaitPointerEventScope3;
                            draggableKt$awaitDownAndSlop$1.L$4 = longRef2;
                            draggableKt$awaitDownAndSlop$1.L$5 = pointerEventPass;
                            draggableKt$awaitDownAndSlop$1.F$0 = m353pointerSlopE8SPZFQ;
                            draggableKt$awaitDownAndSlop$1.J$0 = m1887getZeroF1C5BW0;
                            draggableKt$awaitDownAndSlop$1.label = i3;
                            awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$awaitDownAndSlop$1, i5, pointerEventPass);
                            if (awaitPointerEvent$default != coroutine_suspended) {
                            }
                        }
                    }
                    longRef = longRef3;
                    pointerInputChange2 = null;
                    if (pointerInputChange2 == null) {
                    }
                }
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                if (function12.invoke(pointerInputChange).booleanValue()) {
                    return null;
                }
                if (function02.invoke().booleanValue()) {
                    pointerInputChange.consume();
                    androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange);
                    return kotlin.TuplesKt.to(pointerInputChange, androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()));
                }
                draggableKt$awaitDownAndSlop$1.L$0 = awaitPointerEventScope2;
                draggableKt$awaitDownAndSlop$1.L$1 = velocityTracker2;
                draggableKt$awaitDownAndSlop$1.L$2 = pointerDirectionConfig2;
                draggableKt$awaitDownAndSlop$1.L$3 = null;
                draggableKt$awaitDownAndSlop$1.L$4 = null;
                draggableKt$awaitDownAndSlop$1.label = 2;
                obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope2, false, null, draggableKt$awaitDownAndSlop$1, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                awaitPointerEventScope3 = awaitPointerEventScope2;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange52 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(velocityTracker2, pointerInputChange52);
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                function2 = new kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$postPointerSlop$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange62, androidx.compose.ui.geometry.Offset offset) {
                        m372invokeUv8p0NA(pointerInputChange62, offset.getPackedValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                    public final void m372invokeUv8p0NA(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange62, long j22) {
                        androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(androidx.compose.ui.input.pointer.util.VelocityTracker.this, pointerInputChange62);
                        pointerInputChange62.consume();
                        longRef.element = j22;
                    }
                };
                id = pointerInputChange52.getId();
                int type2 = pointerInputChange52.getType();
                if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m352isPointerUpDmW0f2w(awaitPointerEventScope3.getCurrentEvent(), id)) {
                }
            }
        }
        draggableKt$awaitDownAndSlop$1 = new androidx.compose.foundation.gestures.DraggableKt$awaitDownAndSlop$1(continuation);
        java.lang.Object obj2 = draggableKt$awaitDownAndSlop$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableKt$awaitDownAndSlop$1.label;
        int i32 = 3;
        int i42 = 0;
        int i52 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass4 = null;
        if (i != 0) {
        }
        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj2;
        if (function12.invoke(pointerInputChange).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: awaitDrag-Su4bsnU, reason: not valid java name */
    public static final java.lang.Object m368awaitDragSu4bsnU(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, long j, final androidx.compose.ui.input.pointer.util.VelocityTracker velocityTracker, final kotlinx.coroutines.channels.SendChannel<? super androidx.compose.foundation.gestures.DragEvent> sendChannel, final boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        sendChannel.mo10716trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragStarted(androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange.getPosition(), androidx.compose.ui.geometry.OffsetKt.Offset(androidx.compose.ui.geometry.Offset.m1871getXimpl(j) * java.lang.Math.signum(androidx.compose.ui.geometry.Offset.m1871getXimpl(pointerInputChange.getPosition())), androidx.compose.ui.geometry.Offset.m1872getYimpl(j) * java.lang.Math.signum(androidx.compose.ui.geometry.Offset.m1872getYimpl(pointerInputChange.getPosition())))), null));
        sendChannel.mo10716trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragDelta(z ? androidx.compose.ui.geometry.Offset.m1878timestuRUvjQ(j, -1.0f) : j, null));
        return m369onDragOrUpAxegvzg(awaitPointerEventScope, function1, pointerInputChange.getId(), new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DraggableKt$awaitDrag$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2) {
                invoke2(pointerInputChange2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2) {
                androidx.compose.ui.input.pointer.util.VelocityTrackerKt.addPointerInputChange(androidx.compose.ui.input.pointer.util.VelocityTracker.this, pointerInputChange2);
                if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    return;
                }
                long positionChange = androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange2);
                pointerInputChange2.consume();
                kotlinx.coroutines.channels.SendChannel<androidx.compose.foundation.gestures.DragEvent> sendChannel2 = sendChannel;
                if (z) {
                    positionChange = androidx.compose.ui.geometry.Offset.m1878timestuRUvjQ(positionChange, -1.0f);
                }
                sendChannel2.mo10716trySendJP2dKIU(new androidx.compose.foundation.gestures.DragEvent.DragDelta(positionChange, null));
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
    
        if (r1.invoke(r14).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:10:0x008b). Please report as a decompilation issue!!! */
    /* renamed from: onDragOrUp-Axegvzg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m369onDragOrUpAxegvzg(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function1, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1 draggableKt$onDragOrUp$1;
        int i;
        long j2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function13;
        androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1 draggableKt$onDragOrUp$12;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function14;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        java.lang.Object awaitPointerEvent$default;
        kotlin.Unit unit;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        if (continuation instanceof androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1) {
            draggableKt$onDragOrUp$1 = (androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1) continuation;
            if ((draggableKt$onDragOrUp$1.label & Integer.MIN_VALUE) != 0) {
                draggableKt$onDragOrUp$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = draggableKt$onDragOrUp$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = draggableKt$onDragOrUp$1.label;
                int i2 = 1;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.Ref.LongRef longRef2 = (kotlin.jvm.internal.Ref.LongRef) draggableKt$onDragOrUp$1.L$4;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) draggableKt$onDragOrUp$1.L$3;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) draggableKt$onDragOrUp$1.L$2;
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function15 = (kotlin.jvm.functions.Function1) draggableKt$onDragOrUp$1.L$1;
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> function16 = (kotlin.jvm.functions.Function1) draggableKt$onDragOrUp$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$1;
                    function14 = function16;
                    longRef = longRef2;
                    function13 = function15;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            awaitPointerEventScope4 = awaitPointerEventScope3;
                            pointerInputChange2 = null;
                            break;
                        }
                        pointerInputChange2 = changes.get(i3);
                        awaitPointerEventScope4 = awaitPointerEventScope3;
                        if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange2.getId(), longRef.element)) {
                            break;
                        }
                        i3++;
                        awaitPointerEventScope3 = awaitPointerEventScope4;
                    }
                    pointerInputChange = pointerInputChange2;
                    if (pointerInputChange == null) {
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                            int size2 = changes2.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    pointerInputChange3 = null;
                                    break;
                                }
                                pointerInputChange3 = changes2.get(i4);
                                if (pointerInputChange3.getPressed()) {
                                    break;
                                }
                                i4++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = pointerInputChange3;
                            if (pointerInputChange4 != null) {
                                longRef.element = pointerInputChange4.getId();
                                awaitPointerEventScope3 = awaitPointerEventScope4;
                                awaitPointerEventScope2 = awaitPointerEventScope5;
                                i2 = 1;
                                pointerEventPass = null;
                                draggableKt$onDragOrUp$12.L$0 = function14;
                                draggableKt$onDragOrUp$12.L$1 = function13;
                                draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                                draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                                draggableKt$onDragOrUp$12.L$4 = longRef;
                                draggableKt$onDragOrUp$12.label = i2;
                                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i2, pointerEventPass);
                                if (awaitPointerEvent$default == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope5 = awaitPointerEventScope2;
                                obj = awaitPointerEvent$default;
                            }
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                        int size3 = changes3.size();
                        int i32 = 0;
                        while (true) {
                            if (i32 < size3) {
                            }
                            i32++;
                            awaitPointerEventScope3 = awaitPointerEventScope4;
                        }
                        pointerInputChange = pointerInputChange2;
                        if (pointerInputChange == null) {
                            pointerInputChange = null;
                        }
                    }
                    if (pointerInputChange == null || pointerInputChange.isConsumed()) {
                        pointerInputChange = null;
                    } else if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                        function13.invoke(pointerInputChange);
                        awaitPointerEventScope2 = awaitPointerEventScope5;
                        pointerEventPass = null;
                        j2 = pointerInputChange.getId();
                        i2 = 1;
                        longRef = new kotlin.jvm.internal.Ref.LongRef();
                        longRef.element = j2;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        draggableKt$onDragOrUp$12.L$0 = function14;
                        draggableKt$onDragOrUp$12.L$1 = function13;
                        draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                        draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                        draggableKt$onDragOrUp$12.L$4 = longRef;
                        draggableKt$onDragOrUp$12.label = i2;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i2, pointerEventPass);
                        if (awaitPointerEvent$default == coroutine_suspended) {
                        }
                    }
                    if (pointerInputChange == null) {
                        function13.invoke(pointerInputChange);
                        unit = kotlin.Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(unit == null);
                }
                kotlin.ResultKt.throwOnFailure(obj);
                j2 = j;
                if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j2)) {
                    function13 = function12;
                    pointerInputChange = null;
                    if (pointerInputChange == null) {
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(unit == null);
                }
                awaitPointerEventScope2 = awaitPointerEventScope;
                function13 = function12;
                draggableKt$onDragOrUp$12 = draggableKt$onDragOrUp$1;
                function14 = function1;
                longRef = new kotlin.jvm.internal.Ref.LongRef();
                longRef.element = j2;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                draggableKt$onDragOrUp$12.L$0 = function14;
                draggableKt$onDragOrUp$12.L$1 = function13;
                draggableKt$onDragOrUp$12.L$2 = awaitPointerEventScope2;
                draggableKt$onDragOrUp$12.L$3 = awaitPointerEventScope3;
                draggableKt$onDragOrUp$12.L$4 = longRef;
                draggableKt$onDragOrUp$12.label = i2;
                awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope3, pointerEventPass, draggableKt$onDragOrUp$12, i2, pointerEventPass);
                if (awaitPointerEvent$default == coroutine_suspended) {
                }
            }
        }
        draggableKt$onDragOrUp$1 = new androidx.compose.foundation.gestures.DraggableKt$onDragOrUp$1(continuation);
        java.lang.Object obj2 = draggableKt$onDragOrUp$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = draggableKt$onDragOrUp$1.label;
        int i22 = 1;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = null;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m370toFloat3MmeM6k(long j, androidx.compose.foundation.gestures.Orientation orientation) {
        return orientation == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.geometry.Offset.m1872getYimpl(j) : androidx.compose.ui.geometry.Offset.m1871getXimpl(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m371toFloatsFctU(long j, androidx.compose.foundation.gestures.Orientation orientation) {
        return orientation == androidx.compose.foundation.gestures.Orientation.Vertical ? androidx.compose.ui.unit.Velocity.m4718getYimpl(j) : androidx.compose.ui.unit.Velocity.m4717getXimpl(j);
    }
}
