package androidx.compose.foundation.gestures;

/* compiled from: DragGestureDetector.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {175, 884, 926, 192}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "F$0", "J$0"})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectDragGestures$5 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> $onDrag;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onDragCancel;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onDragEnd;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> $onDragStart;
    float F$0;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGestures$5(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5> continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDrag = function2;
        this.$onDragCancel = function0;
        this.$onDragEnd = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5(this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, continuation);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01de  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.input.pointer.PointerEventPass, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01d1 -> B:18:0x01d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01fa -> B:21:0x01fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0266 -> B:30:0x00f4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        java.lang.Object awaitFirstDown$default;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        kotlin.jvm.internal.Ref.LongRef longRef;
        java.lang.Object obj2;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig;
        float f;
        kotlin.jvm.internal.Ref.LongRef longRef3;
        long j;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes;
        int size;
        int i;
        java.lang.Object obj3;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4;
        java.lang.Object obj4;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5;
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list;
        long id;
        java.lang.Object m350dragjO51t88;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 2;
        int i4 = 1;
        ?? r7 = 0;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
            if (awaitFirstDown$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            awaitFirstDown$default = obj;
        } else {
            if (i2 == 2) {
                long j2 = this.J$0;
                float f2 = this.F$0;
                kotlin.jvm.internal.Ref.LongRef longRef4 = (kotlin.jvm.internal.Ref.LongRef) this.L$5;
                androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig2 = (androidx.compose.foundation.gestures.PointerDirectionConfig) this.L$4;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$3;
                kotlin.jvm.internal.Ref.LongRef longRef5 = (kotlin.jvm.internal.Ref.LongRef) this.L$2;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6 = (androidx.compose.ui.input.pointer.PointerInputChange) this.L$1;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                f = f2;
                pointerInputChange2 = pointerInputChange6;
                pointerDirectionConfig = pointerDirectionConfig2;
                longRef2 = longRef4;
                j = j2;
                awaitPointerEventScope = awaitPointerEventScope4;
                longRef3 = longRef5;
                awaitPointerEventScope2 = awaitPointerEventScope5;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
                changes = pointerEvent.getChanges();
                size = changes.size();
                i = 0;
                while (true) {
                    if (i < size) {
                    }
                    i++;
                    changes = list;
                    coroutine_suspended = obj3;
                    awaitPointerEventScope = awaitPointerEventScope3;
                }
                pointerInputChange4 = pointerInputChange3;
                if (pointerInputChange4 != null) {
                }
                awaitPointerEventScope = awaitPointerEventScope2;
                pointerInputChange = pointerInputChange2;
                longRef = longRef3;
                obj4 = obj3;
                pointerInputChange4 = null;
                if (pointerInputChange4 == null) {
                }
                if (pointerInputChange4 != null) {
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                m350dragjO51t88 = obj;
                if (((java.lang.Boolean) m350dragjO51t88).booleanValue()) {
                    this.$onDragCancel.invoke();
                } else {
                    this.$onDragEnd.invoke();
                }
                return kotlin.Unit.INSTANCE;
            }
            long j3 = this.J$0;
            float f3 = this.F$0;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange7 = (androidx.compose.ui.input.pointer.PointerInputChange) this.L$6;
            kotlin.jvm.internal.Ref.LongRef longRef6 = (kotlin.jvm.internal.Ref.LongRef) this.L$5;
            androidx.compose.foundation.gestures.PointerDirectionConfig pointerDirectionConfig3 = (androidx.compose.foundation.gestures.PointerDirectionConfig) this.L$4;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$3;
            kotlin.jvm.internal.Ref.LongRef longRef7 = (kotlin.jvm.internal.Ref.LongRef) this.L$2;
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange8 = (androidx.compose.ui.input.pointer.PointerInputChange) this.L$1;
            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            obj4 = coroutine_suspended;
            long m1876plusMKHz9U = j3;
            pointerInputChange2 = pointerInputChange8;
            f = f3;
            awaitPointerEventScope = awaitPointerEventScope6;
            pointerDirectionConfig = pointerDirectionConfig3;
            longRef2 = longRef6;
            longRef3 = longRef7;
            if (!pointerInputChange7.isConsumed()) {
                awaitPointerEventScope = awaitPointerEventScope2;
                pointerInputChange = pointerInputChange2;
                longRef = longRef3;
                pointerInputChange4 = null;
                if (pointerInputChange4 == null && !pointerInputChange4.isConsumed()) {
                    coroutine_suspended = obj4;
                    i3 = 2;
                    i4 = 1;
                    r7 = 0;
                    id = pointerInputChange.getId();
                    int type = pointerInputChange.getType();
                    androidx.compose.foundation.gestures.PointerDirectionConfig bidirectionalPointerDirectionConfig = androidx.compose.foundation.gestures.DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
                    if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
                        obj4 = coroutine_suspended;
                        pointerInputChange4 = r7;
                        if (pointerInputChange4 == null) {
                        }
                        if (pointerInputChange4 != null) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    float m353pointerSlopE8SPZFQ = androidx.compose.foundation.gestures.DragGestureDetectorKt.m353pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), type);
                    kotlin.jvm.internal.Ref.LongRef longRef8 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef8.element = id;
                    j = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                    longRef2 = longRef8;
                    pointerDirectionConfig = bidirectionalPointerDirectionConfig;
                    f = m353pointerSlopE8SPZFQ;
                    longRef3 = longRef;
                    pointerInputChange2 = pointerInputChange;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    this.L$0 = awaitPointerEventScope2;
                    this.L$1 = pointerInputChange2;
                    this.L$2 = longRef3;
                    this.L$3 = awaitPointerEventScope;
                    this.L$4 = pointerDirectionConfig;
                    this.L$5 = longRef2;
                    this.L$6 = r7;
                    this.F$0 = f;
                    this.J$0 = j;
                    this.label = i3;
                    obj2 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, r7, this, i4, r7);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
                    changes = pointerEvent2.getChanges();
                    size = changes.size();
                    i = 0;
                    while (true) {
                        if (i < size) {
                            obj3 = coroutine_suspended;
                            awaitPointerEventScope3 = awaitPointerEventScope;
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes.get(i);
                        list = changes;
                        obj3 = coroutine_suspended;
                        awaitPointerEventScope3 = awaitPointerEventScope;
                        if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange3.getId(), longRef2.element)) {
                            break;
                        }
                        i++;
                        changes = list;
                        coroutine_suspended = obj3;
                        awaitPointerEventScope = awaitPointerEventScope3;
                    }
                    pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 != null && !pointerInputChange4.isConsumed()) {
                        if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                            int size2 = changes2.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    pointerInputChange5 = null;
                                    break;
                                }
                                pointerInputChange5 = changes2.get(i5);
                                if (pointerInputChange5.getPressed()) {
                                    break;
                                }
                                i5++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange9 = pointerInputChange5;
                            if (pointerInputChange9 != null) {
                                longRef2.element = pointerInputChange9.getId();
                                coroutine_suspended = obj3;
                                awaitPointerEventScope = awaitPointerEventScope3;
                                i3 = 2;
                                i4 = 1;
                                r7 = 0;
                            }
                        } else {
                            m1876plusMKHz9U = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(j, androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(pointerInputChange4.getPosition(), pointerInputChange4.getPreviousPosition()));
                            if (pointerDirectionConfig.mo355calculateDeltaChangek4lQ0M(m1876plusMKHz9U) < f) {
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = pointerInputChange2;
                                this.L$2 = longRef3;
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope7 = awaitPointerEventScope3;
                                this.L$3 = awaitPointerEventScope7;
                                this.L$4 = pointerDirectionConfig;
                                this.L$5 = longRef2;
                                this.L$6 = pointerInputChange4;
                                this.F$0 = f;
                                this.J$0 = m1876plusMKHz9U;
                                this.label = 3;
                                obj4 = obj3;
                                if (awaitPointerEventScope7.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, this) == obj4) {
                                    return obj4;
                                }
                                pointerInputChange7 = pointerInputChange4;
                                awaitPointerEventScope = awaitPointerEventScope7;
                                if (!pointerInputChange7.isConsumed()) {
                                    j = m1876plusMKHz9U;
                                    coroutine_suspended = obj4;
                                    i3 = 2;
                                    i4 = 1;
                                    r7 = 0;
                                }
                            } else {
                                obj4 = obj3;
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope8 = awaitPointerEventScope3;
                                long mo356calculatePostSlopOffset8S9VItk = pointerDirectionConfig.mo356calculatePostSlopOffset8S9VItk(m1876plusMKHz9U, f);
                                pointerInputChange4.consume();
                                longRef3.element = mo356calculatePostSlopOffset8S9VItk;
                                if (pointerInputChange4.isConsumed()) {
                                    awaitPointerEventScope = awaitPointerEventScope2;
                                    pointerInputChange = pointerInputChange2;
                                    longRef = longRef3;
                                    if (pointerInputChange4 == null) {
                                    }
                                    if (pointerInputChange4 != null) {
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                                i3 = 2;
                                coroutine_suspended = obj4;
                                awaitPointerEventScope = awaitPointerEventScope8;
                                r7 = 0;
                                i4 = 1;
                                j = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
                            }
                        }
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange2;
                        this.L$2 = longRef3;
                        this.L$3 = awaitPointerEventScope;
                        this.L$4 = pointerDirectionConfig;
                        this.L$5 = longRef2;
                        this.L$6 = r7;
                        this.F$0 = f;
                        this.J$0 = j;
                        this.label = i3;
                        obj2 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, r7, this, i4, r7);
                        if (obj2 == coroutine_suspended) {
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent22 = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
                        changes = pointerEvent22.getChanges();
                        size = changes.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                            }
                            i++;
                            changes = list;
                            coroutine_suspended = obj3;
                            awaitPointerEventScope = awaitPointerEventScope3;
                        }
                        pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 != null) {
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange4)) {
                            }
                            this.L$0 = awaitPointerEventScope2;
                            this.L$1 = pointerInputChange2;
                            this.L$2 = longRef3;
                            this.L$3 = awaitPointerEventScope;
                            this.L$4 = pointerDirectionConfig;
                            this.L$5 = longRef2;
                            this.L$6 = r7;
                            this.F$0 = f;
                            this.J$0 = j;
                            this.label = i3;
                            obj2 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, r7, this, i4, r7);
                            if (obj2 == coroutine_suspended) {
                            }
                            androidx.compose.ui.input.pointer.PointerEvent pointerEvent222 = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
                            changes = pointerEvent222.getChanges();
                            size = changes.size();
                            i = 0;
                            while (true) {
                                if (i < size) {
                                }
                                i++;
                                changes = list;
                                coroutine_suspended = obj3;
                                awaitPointerEventScope = awaitPointerEventScope3;
                            }
                            pointerInputChange4 = pointerInputChange3;
                            if (pointerInputChange4 != null) {
                            }
                        }
                    }
                    awaitPointerEventScope = awaitPointerEventScope2;
                    pointerInputChange = pointerInputChange2;
                    longRef = longRef3;
                    obj4 = obj3;
                    pointerInputChange4 = null;
                    if (pointerInputChange4 == null) {
                    }
                    if (pointerInputChange4 != null) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (pointerInputChange4 != null) {
                    this.$onDragStart.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(pointerInputChange4.getPosition()));
                    this.$onDrag.invoke(pointerInputChange4, androidx.compose.ui.geometry.Offset.m1860boximpl(longRef.element));
                    long id2 = pointerInputChange4.getId();
                    final kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function2 = this.$onDrag;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 4;
                    m350dragjO51t88 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m350dragjO51t88(awaitPointerEventScope, id2, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange10) {
                            invoke2(pointerInputChange10);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange10) {
                            function2.invoke(pointerInputChange10, androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange10)));
                            pointerInputChange10.consume();
                        }
                    }, this);
                    if (m350dragjO51t88 == obj4) {
                        return obj4;
                    }
                    if (((java.lang.Boolean) m350dragjO51t88).booleanValue()) {
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown$default;
        longRef = new kotlin.jvm.internal.Ref.LongRef();
        longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
        id = pointerInputChange.getId();
        int type2 = pointerInputChange.getType();
        androidx.compose.foundation.gestures.PointerDirectionConfig bidirectionalPointerDirectionConfig2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.getBidirectionalPointerDirectionConfig();
        if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.m352isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), id)) {
        }
    }
}
