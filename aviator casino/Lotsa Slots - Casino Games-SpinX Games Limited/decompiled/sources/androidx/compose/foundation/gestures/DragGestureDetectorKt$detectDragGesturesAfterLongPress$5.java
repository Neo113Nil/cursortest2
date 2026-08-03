package androidx.compose.foundation.gestures;

/* compiled from: DragGestureDetector.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {234, 235, 240}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> $onDrag;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onDragCancel;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onDragEnd;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> $onDragStart;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDragEnd = function0;
        this.$onDragCancel = function02;
        this.$onDrag = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, continuation);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0096 A[Catch: CancellationException -> 0x00c5, TryCatch #0 {CancellationException -> 0x00c5, blocks: (B:8:0x0015, B:9:0x008e, B:11:0x0096, B:13:0x00a5, B:15:0x00b1, B:17:0x00b4, B:20:0x00b7, B:24:0x00bd, B:28:0x0026, B:29:0x0061, B:31:0x0065, B:36:0x002e, B:37:0x004d, B:41:0x003a), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd A[Catch: CancellationException -> 0x00c5, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00c5, blocks: (B:8:0x0015, B:9:0x008e, B:11:0x0096, B:13:0x00a5, B:15:0x00b1, B:17:0x00b4, B:20:0x00b7, B:24:0x00bd, B:28:0x0026, B:29:0x0061, B:31:0x0065, B:36:0x002e, B:37:0x004d, B:41:0x003a), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[Catch: CancellationException -> 0x00c5, TryCatch #0 {CancellationException -> 0x00c5, blocks: (B:8:0x0015, B:9:0x008e, B:11:0x0096, B:13:0x00a5, B:15:0x00b1, B:17:0x00b4, B:20:0x00b7, B:24:0x00bd, B:28:0x0026, B:29:0x0061, B:31:0x0065, B:36:0x002e, B:37:0x004d, B:41:0x003a), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                        if (pointerInputChange != null) {
                            this.$onDragStart.invoke(androidx.compose.ui.geometry.Offset.m1860boximpl(pointerInputChange.getPosition()));
                            long id = pointerInputChange.getId();
                            final kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.geometry.Offset, kotlin.Unit> function2 = this.$onDrag;
                            this.L$0 = awaitPointerEventScope;
                            this.label = 3;
                            obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m350dragjO51t88(awaitPointerEventScope, id, new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.1
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
                                    function2.invoke(pointerInputChange2, androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange2)));
                                    pointerInputChange2.consume();
                                }
                            }, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                        int size = changes.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes.get(i2);
                            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                        }
                        this.$onDragEnd.invoke();
                    } else {
                        this.$onDragCancel.invoke();
                    }
                    return kotlin.Unit.INSTANCE;
                }
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.L$0 = awaitPointerEventScope;
            this.label = 2;
            obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m341awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, ((androidx.compose.ui.input.pointer.PointerInputChange) obj).getId(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.util.concurrent.CancellationException e) {
            this.$onDragCancel.invoke();
            throw e;
        }
    }
}
