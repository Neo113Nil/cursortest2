package androidx.compose.foundation.gestures;

/* compiled from: DragGestureDetector.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {812, 829}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> $currentDown;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragGestureDetectorKt$awaitLongPressOrCancellation$2(kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3 A[EDGE_INSN: B:67:0x00d3->B:13:0x00d3 BREAK  A[LOOP:0: B:7:0x00c0->B:10:0x00d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c2  */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [T] */
    /* JADX WARN: Type inference failed for: r9v9, types: [T, androidx.compose.ui.input.pointer.PointerInputChange] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b2 -> B:6:0x00b5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        int i;
        java.lang.Object obj2;
        int size;
        int i2;
        int size2;
        int i3;
        java.lang.Object awaitPointerEvent;
        T t;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        java.lang.Object obj3 = null;
        int i5 = 1;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            i = 0;
            if (i == 0) {
            }
        } else if (i4 == 1) {
            i = this.I$0;
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 >= size) {
                }
                i2++;
            }
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
            size2 = changes2.size();
            while (i3 < size2) {
            }
            this.L$0 = awaitPointerEventScope;
            this.L$1 = pointerEvent;
            this.I$0 = i;
            this.label = 2;
            awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, this);
            if (awaitPointerEvent != coroutine_suspended) {
            }
        } else {
            if (i4 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) this.L$1;
            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEvent = obj;
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
            int size3 = changes3.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size3) {
                    break;
                }
                if (changes3.get(i6).isConsumed()) {
                    i = 1;
                    break;
                }
                i6++;
            }
            if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.m352isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId())) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = pointerEvent2.getChanges();
                int size4 = changes4.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size4) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes4.get(i7);
                    if (pointerInputChange.getPressed()) {
                        break;
                    }
                    i7++;
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != 0) {
                    this.$currentDown.element = pointerInputChange2;
                    this.$longPress.element = this.$currentDown.element;
                } else {
                    awaitPointerEventScope = awaitPointerEventScope2;
                    i = 1;
                    obj3 = null;
                    if (i == 0) {
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = obj3;
                        this.I$0 = i;
                        this.label = i5;
                        obj2 = awaitPointerEventScope.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Main, this);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent3 = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes5 = pointerEvent3.getChanges();
                        size = changes5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = 1;
                                break;
                            }
                            if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(changes5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent3.getChanges();
                        size2 = changes22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = changes22.get(i3);
                            if (pointerInputChange3.isConsumed() || androidx.compose.ui.input.pointer.PointerEventKt.m3220isOutOfBoundsjwHxaWs(pointerInputChange3, awaitPointerEventScope.mo3173getSizeYbymL2g(), awaitPointerEventScope.mo3172getExtendedTouchPaddingNHjbRc())) {
                                break;
                            }
                        }
                        this.L$0 = awaitPointerEventScope;
                        this.L$1 = pointerEvent3;
                        this.I$0 = i;
                        this.label = 2;
                        awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Final, this);
                        if (awaitPointerEvent != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerEvent2 = pointerEvent3;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes32 = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
                        int size32 = changes32.size();
                        int i62 = 0;
                        while (true) {
                            if (i62 >= size32) {
                            }
                            i62++;
                        }
                        if (!androidx.compose.foundation.gestures.DragGestureDetectorKt.m352isPointerUpDmW0f2w(pointerEvent2, this.$currentDown.element.getId())) {
                            kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef = this.$longPress;
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes6 = pointerEvent2.getChanges();
                            kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef2 = this.$currentDown;
                            int size5 = changes6.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size5) {
                                    t = 0;
                                    break;
                                }
                                t = changes6.get(i8);
                                kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.input.pointer.PointerInputChange> objectRef3 = objectRef2;
                                if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(((androidx.compose.ui.input.pointer.PointerInputChange) t).getId(), objectRef2.element.getId())) {
                                    break;
                                }
                                i8++;
                                objectRef2 = objectRef3;
                            }
                            objectRef.element = t;
                        }
                    } else {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj3 = null;
            i5 = 1;
            if (i == 0) {
            }
        }
    }
}
