package androidx.compose.foundation.text.selection;

/* compiled from: SelectionGestures.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\b\u001a\u00020\u0006*\u00020\tH\u0082@¢\u0006\u0002\u0010\n\u001a&\u0010\u000b\u001a\u00020\u0005*\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a*\u0010\u0011\u001a\u00020\u0012*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0000\u001a\"\u0010\u001e\u001a\u00020\u0012*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u0010\u001f\u001a \u0010 \u001a\u00020\u001a*\u00020\u001a2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\"H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"ClicksSlop", "", "STATIC_KEY", "", "isPrecisePointer", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "awaitDown", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "distanceIsTolerable", "offset1", "Landroidx/compose/ui/geometry/Offset;", "offset2", "distanceIsTolerable-2x9bVx0", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JJ)Z", "mouseSelection", "", "observer", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "clicksCounter", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "down", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectionGestureInput", "Landroidx/compose/ui/Modifier;", "mouseSelectionObserver", "textDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSelectionTouchMode", "updateTouchMode", "Lkotlin/Function1;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    public static final double ClicksSlop = 100.0d;
    private static final int STATIC_KEY = 8675309;

    public static final androidx.compose.ui.Modifier updateSelectionTouchMode(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, java.lang.Integer.valueOf(STATIC_KEY), new androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1(function1, null));
    }

    public static final androidx.compose.ui.Modifier selectionGestureInput(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.foundation.text.TextDragObserver textDragObserver) {
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1(mouseSelectionObserver, textDragObserver, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad A[Catch: CancellationException -> 0x00d8, TryCatch #0 {CancellationException -> 0x00d8, blocks: (B:12:0x0032, B:13:0x00a5, B:15:0x00ad, B:17:0x00bc, B:19:0x00c8, B:21:0x00cb, B:24:0x00ce, B:28:0x00d2, B:32:0x004a, B:34:0x0071, B:36:0x0075, B:38:0x0083, B:42:0x0054), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2 A[Catch: CancellationException -> 0x00d8, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d8, blocks: (B:12:0x0032, B:13:0x00a5, B:15:0x00ad, B:17:0x00bc, B:19:0x00c8, B:21:0x00cb, B:24:0x00ce, B:28:0x00d2, B:32:0x004a, B:34:0x0071, B:36:0x0075, B:38:0x0083, B:42:0x0054), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, final androidx.compose.foundation.text.TextDragObserver textDragObserver, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 selectionGesturesKt$touchSelection$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        try {
            if (continuation instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) {
                selectionGesturesKt$touchSelection$1 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) continuation;
                if ((selectionGesturesKt$touchSelection$1.label & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelection$1.label -= Integer.MIN_VALUE;
                    obj = selectionGesturesKt$touchSelection$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = selectionGesturesKt$touchSelection$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent.getChanges());
                        long id = pointerInputChange.getId();
                        selectionGesturesKt$touchSelection$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelection$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelection$1.L$2 = pointerInputChange;
                        selectionGesturesKt$touchSelection$1.label = 1;
                        obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m341awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, selectionGesturesKt$touchSelection$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            textDragObserver = (androidx.compose.foundation.text.TextDragObserver) selectionGesturesKt$touchSelection$1.L$1;
                            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$touchSelection$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                int size = changes.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = changes.get(i2);
                                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(pointerInputChange3)) {
                                        pointerInputChange3.consume();
                                    }
                                }
                                textDragObserver.onStop();
                            } else {
                                textDragObserver.onCancel();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) selectionGesturesKt$touchSelection$1.L$2;
                        textDragObserver = (androidx.compose.foundation.text.TextDragObserver) selectionGesturesKt$touchSelection$1.L$1;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$touchSelection$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        pointerInputChange = pointerInputChange4;
                        awaitPointerEventScope = awaitPointerEventScope2;
                    }
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange2 != null && m1013distanceIsTolerable2x9bVx0(awaitPointerEventScope, pointerInputChange.getPosition(), pointerInputChange2.getPosition())) {
                        textDragObserver.mo920onStartk4lQ0M(pointerInputChange2.getPosition());
                        long id2 = pointerInputChange2.getId();
                        kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5) {
                                invoke2(pointerInputChange5);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5) {
                                androidx.compose.foundation.text.TextDragObserver.this.mo919onDragk4lQ0M(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange5));
                                pointerInputChange5.consume();
                            }
                        };
                        selectionGesturesKt$touchSelection$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$touchSelection$1.L$1 = textDragObserver;
                        selectionGesturesKt$touchSelection$1.L$2 = null;
                        selectionGesturesKt$touchSelection$1.label = 2;
                        obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m350dragjO51t88(awaitPointerEventScope, id2, function1, selectionGesturesKt$touchSelection$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            if (pointerInputChange2 != null) {
                textDragObserver.mo920onStartk4lQ0M(pointerInputChange2.getPosition());
                long id22 = pointerInputChange2.getId();
                kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5) {
                        invoke2(pointerInputChange5);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5) {
                        androidx.compose.foundation.text.TextDragObserver.this.mo919onDragk4lQ0M(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange5));
                        pointerInputChange5.consume();
                    }
                };
                selectionGesturesKt$touchSelection$1.L$0 = awaitPointerEventScope;
                selectionGesturesKt$touchSelection$1.L$1 = textDragObserver;
                selectionGesturesKt$touchSelection$1.L$2 = null;
                selectionGesturesKt$touchSelection$1.label = 2;
                obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m350dragjO51t88(awaitPointerEventScope, id22, function12, selectionGesturesKt$touchSelection$1);
                if (obj == coroutine_suspended) {
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                }
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.util.concurrent.CancellationException e) {
            textDragObserver.onCancel();
            throw e;
        }
        selectionGesturesKt$touchSelection$1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1(continuation);
        obj = selectionGesturesKt$touchSelection$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$touchSelection$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, final androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter clicksCounter, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        int i;
        final androidx.compose.foundation.text.selection.SelectionAdjustment none;
        if (continuation instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1) {
            selectionGesturesKt$mouseSelection$1 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1) continuation;
            if ((selectionGesturesKt$mouseSelection$1.label & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$mouseSelection$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = selectionGesturesKt$mouseSelection$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectionGesturesKt$mouseSelection$1.label;
                int i2 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    clicksCounter.update(pointerEvent);
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = pointerEvent.getChanges().get(0);
                    if (androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.isShiftPressed(pointerEvent)) {
                        if (mouseSelectionObserver.mo992onExtendk4lQ0M(pointerInputChange.getPosition())) {
                            long id = pointerInputChange.getId();
                            kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$1
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
                                    if (androidx.compose.foundation.text.selection.MouseSelectionObserver.this.mo993onExtendDragk4lQ0M(pointerInputChange2.getPosition())) {
                                        pointerInputChange2.consume();
                                    }
                                }
                            };
                            selectionGesturesKt$mouseSelection$1.L$0 = awaitPointerEventScope;
                            selectionGesturesKt$mouseSelection$1.L$1 = mouseSelectionObserver;
                            selectionGesturesKt$mouseSelection$1.label = 1;
                            obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m350dragjO51t88(awaitPointerEventScope, id, function1, selectionGesturesKt$mouseSelection$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            mouseSelectionObserver.onDragDone();
                        }
                    } else {
                        int clicks = clicksCounter.getClicks();
                        if (clicks == 1) {
                            none = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();
                        } else if (clicks == 2) {
                            none = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord();
                        } else {
                            none = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getParagraph();
                        }
                        if (mouseSelectionObserver.mo994onStart3MmeM6k(pointerInputChange.getPosition(), none)) {
                            long id2 = pointerInputChange.getId();
                            kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit> function12 = new kotlin.jvm.functions.Function1<androidx.compose.ui.input.pointer.PointerInputChange, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$shouldConsumeUp$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    if (androidx.compose.foundation.text.selection.MouseSelectionObserver.this.mo991onDrag3MmeM6k(pointerInputChange2.getPosition(), none)) {
                                        pointerInputChange2.consume();
                                    }
                                }
                            };
                            selectionGesturesKt$mouseSelection$1.L$0 = awaitPointerEventScope;
                            selectionGesturesKt$mouseSelection$1.L$1 = mouseSelectionObserver;
                            selectionGesturesKt$mouseSelection$1.label = 2;
                            obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m350dragjO51t88(awaitPointerEventScope, id2, function12, selectionGesturesKt$mouseSelection$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                            }
                            mouseSelectionObserver.onDragDone();
                        }
                    }
                } else if (i == 1) {
                    mouseSelectionObserver = (androidx.compose.foundation.text.selection.MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.L$1;
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size = changes.size();
                        while (i2 < size) {
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes.get(i2);
                            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                            i2++;
                        }
                    }
                    mouseSelectionObserver.onDragDone();
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mouseSelectionObserver = (androidx.compose.foundation.text.selection.MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.L$1;
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = awaitPointerEventScope.getCurrentEvent().getChanges();
                        int size2 = changes2.size();
                        while (i2 < size2) {
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = changes2.get(i2);
                            if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(pointerInputChange3)) {
                                pointerInputChange3.consume();
                            }
                            i2++;
                        }
                    }
                    mouseSelectionObserver.onDragDone();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        selectionGesturesKt$mouseSelection$1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1(continuation);
        java.lang.Object obj2 = selectionGesturesKt$mouseSelection$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$mouseSelection$1.label;
        int i22 = 0;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:10:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerEvent> continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 selectionGesturesKt$awaitDown$1;
        int i;
        int size;
        int i2;
        if (continuation instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) {
            selectionGesturesKt$awaitDown$1 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) continuation;
            if ((selectionGesturesKt$awaitDown$1.label & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$awaitDown$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = selectionGesturesKt$awaitDown$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectionGesturesKt$awaitDown$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
                    selectionGesturesKt$awaitDown$1.L$0 = awaitPointerEventScope;
                    selectionGesturesKt$awaitDown$1.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, selectionGesturesKt$awaitDown$1);
                    if (obj == coroutine_suspended) {
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$awaitDown$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                i2 = 0;
                while (i2 < size) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(changes2.get(i2))) {
                        i2++;
                    } else {
                        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Main;
                        selectionGesturesKt$awaitDown$1.L$0 = awaitPointerEventScope;
                        selectionGesturesKt$awaitDown$1.label = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, selectionGesturesKt$awaitDown$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent22 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent22.getChanges();
                        size = changes22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent22;
            }
        }
        selectionGesturesKt$awaitDown$1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1(continuation);
        java.lang.Object obj2 = selectionGesturesKt$awaitDown$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$awaitDown$1.label;
        if (i != 0) {
        }
    }

    /* renamed from: distanceIsTolerable-2x9bVx0, reason: not valid java name */
    private static final boolean m1013distanceIsTolerable2x9bVx0(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, long j2) {
        return androidx.compose.ui.geometry.Offset.m1869getDistanceimpl(androidx.compose.ui.geometry.Offset.m1875minusMKHz9U(j, j2)) < awaitPointerEventScope.getViewConfiguration().getTouchSlop();
    }

    public static final boolean isPrecisePointer(androidx.compose.ui.input.pointer.PointerEvent pointerEvent) {
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (!androidx.compose.ui.input.pointer.PointerType.m3348equalsimpl0(changes.get(i).getType(), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m3353getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }
}
