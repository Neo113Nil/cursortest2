package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a$\u0010\f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0012\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0018\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019\u001a,\u0010\u001d\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "", "updateTouchMode", "updateSelectionTouchMode", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "textDragObserver", "awaitSelectionGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "observer", "Landroidx/compose/ui/input/pointer/PointerEvent;", "downEvent", "touchSelectionFirstPress", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "p1", "", "p2", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "clicksCounter", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "mouseSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionGesturesKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0043 -> B:10:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 selectionGesturesKt$awaitDown$1;
        int i;
        int size;
        int i2;
        if (continuation instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) {
            selectionGesturesKt$awaitDown$1 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) continuation;
            if ((selectionGesturesKt$awaitDown$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                selectionGesturesKt$awaitDown$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = selectionGesturesKt$awaitDown$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = selectionGesturesKt$awaitDown$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
                    selectionGesturesKt$awaitDown$1.getHighSpeedVideoSizes = awaitPointerEventScope;
                    selectionGesturesKt$awaitDown$1.getHighSpeedVideoFpsRangesFor = 1;
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
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$awaitDown$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                i2 = 0;
                while (i2 < size) {
                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(changes2.get(i2))) {
                        i2++;
                    } else {
                        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Main;
                        selectionGesturesKt$awaitDown$1.getHighSpeedVideoSizes = awaitPointerEventScope;
                        selectionGesturesKt$awaitDown$1.getHighSpeedVideoFpsRangesFor = 1;
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
        java.lang.Object obj2 = selectionGesturesKt$awaitDown$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$awaitDown$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    public static final androidx.compose.ui.Modifier updateSelectionTouchMode(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, (java.lang.Object) 8675309, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"}, v = 1)
            /* renamed from: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRanges;
                int getHighSpeedVideoFpsRangesFor;

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0032 A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0030 -> B:5:0x0033). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r4.getHighSpeedVideoFpsRangesFor
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r4.Camera2StreamConfigurationMap
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r5)
                        goto L33
                    L13:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L1b:
                        kotlin.ResultKt.throwOnFailure(r5)
                        java.lang.Object r5 = r4.Camera2StreamConfigurationMap
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L23:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r3 = r4
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        r4.Camera2StreamConfigurationMap = r1
                        r4.getHighSpeedVideoFpsRangesFor = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r3)
                        if (r5 != r0) goto L33
                        return r0
                    L33:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r4.getHighSpeedVideoFpsRanges
                        boolean r5 = androidx.compose.foundation.text.selection.SelectionGestures_androidKt.isMouseOrTouchPad(r5)
                        r5 = r5 ^ r2
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                        r3.invoke(r5)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
                    anonymousClass1.Camera2StreamConfigurationMap = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighSpeedVideoFpsRanges = function1;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1.AnonymousClass1(function1, null), continuation);
                return awaitPointerEventScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : kotlin.Unit.INSTANCE;
            }
        });
    }

    public static final java.lang.Object awaitSelectionGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.foundation.text.TextDragObserver textDragObserver, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2(new androidx.compose.foundation.text.selection.ClicksCounter(pointerInputScope.getViewConfiguration()), mouseSelectionObserver, textDragObserver, null), continuation);
        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006f, code lost:
    
        if (r12 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3 A[Catch: CancellationException -> 0x00f2, TryCatch #0 {CancellationException -> 0x00f2, blocks: (B:12:0x0032, B:13:0x00bb, B:15:0x00c3, B:17:0x00d5, B:19:0x00e1, B:21:0x00e4, B:24:0x00e7, B:28:0x00eb, B:32:0x004b, B:34:0x0071, B:36:0x0075, B:38:0x0095, B:43:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00eb A[Catch: CancellationException -> 0x00f2, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00f2, blocks: (B:12:0x0032, B:13:0x00bb, B:15:0x00c3, B:17:0x00d5, B:19:0x00e1, B:21:0x00e4, B:24:0x00e7, B:28:0x00eb, B:32:0x004b, B:34:0x0071, B:36:0x0075, B:38:0x0095, B:43:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[Catch: CancellationException -> 0x00f2, TryCatch #0 {CancellationException -> 0x00f2, blocks: (B:12:0x0032, B:13:0x00bb, B:15:0x00c3, B:17:0x00d5, B:19:0x00e1, B:21:0x00e4, B:24:0x00e7, B:28:0x00eb, B:32:0x004b, B:34:0x0071, B:36:0x0075, B:38:0x0095, B:43:0x0055), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object touchSelectionFirstPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, final androidx.compose.foundation.text.TextDragObserver textDragObserver, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1 selectionGesturesKt$touchSelectionFirstPress$1;
        int i;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        try {
            if (continuation instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1) {
                selectionGesturesKt$touchSelectionFirstPress$1 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1) continuation;
                if ((selectionGesturesKt$touchSelectionFirstPress$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelectionFirstPress$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = selectionGesturesKt$touchSelectionFirstPress$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = selectionGesturesKt$touchSelectionFirstPress$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent.getChanges());
                        long id = pointerInputChange.getId();
                        selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
                        selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoFpsRangesFor = textDragObserver;
                        selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoSizes = pointerInputChange;
                        selectionGesturesKt$touchSelectionFirstPress$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1459awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, id, selectionGesturesKt$touchSelectionFirstPress$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            textDragObserver = (androidx.compose.foundation.text.TextDragObserver) selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoFpsRangesFor;
                            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (!((java.lang.Boolean) obj).booleanValue()) {
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
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoSizes;
                        textDragObserver = (androidx.compose.foundation.text.TextDragObserver) selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoFpsRangesFor;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        pointerInputChange = pointerInputChange4;
                        awaitPointerEventScope = awaitPointerEventScope2;
                    }
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    if (pointerInputChange2 != null) {
                        if (androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < androidx.compose.foundation.gestures.DragGestureDetectorKt.m1469pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), pointerInputChange.getType())) {
                            textDragObserver.mo2105onStart3MmeM6k(pointerInputChange2.getPosition(), androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord());
                            long id2 = pointerInputChange2.getId();
                            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return androidx.compose.foundation.text.selection.SelectionGesturesKt.m2393$r8$lambda$KlckGGDCT2UbspmarUPaznwDjg(androidx.compose.foundation.text.TextDragObserver.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2);
                                }
                            };
                            selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
                            selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoFpsRangesFor = textDragObserver;
                            selectionGesturesKt$touchSelectionFirstPress$1.getHighSpeedVideoSizes = null;
                            selectionGesturesKt$touchSelectionFirstPress$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                            obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1467dragjO51t88(awaitPointerEventScope, id2, function1, selectionGesturesKt$touchSelectionFirstPress$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
            if (pointerInputChange2 != null) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.util.concurrent.CancellationException e) {
            textDragObserver.onCancel();
            throw e;
        }
        selectionGesturesKt$touchSelectionFirstPress$1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionFirstPress$1(continuation);
        java.lang.Object obj2 = selectionGesturesKt$touchSelectionFirstPress$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$touchSelectionFirstPress$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (r14 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ea A[Catch: CancellationException -> 0x0119, TryCatch #0 {CancellationException -> 0x0119, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00fc, B:19:0x0108, B:21:0x010b, B:24:0x010e, B:28:0x0112, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:40:0x00b5, B:42:0x00bb, B:44:0x00bf, B:46:0x00c5, B:48:0x00c9, B:49:0x00ce, B:58:0x005b, B:60:0x006f, B:61:0x007c, B:63:0x0076), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0112 A[Catch: CancellationException -> 0x0119, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0119, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00fc, B:19:0x0108, B:21:0x010b, B:24:0x010e, B:28:0x0112, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:40:0x00b5, B:42:0x00bb, B:44:0x00bf, B:46:0x00c5, B:48:0x00c9, B:49:0x00ce, B:58:0x005b, B:60:0x006f, B:61:0x007c, B:63:0x0076), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[Catch: CancellationException -> 0x0119, TryCatch #0 {CancellationException -> 0x0119, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00fc, B:19:0x0108, B:21:0x010b, B:24:0x010e, B:28:0x0112, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:40:0x00b5, B:42:0x00bb, B:44:0x00bf, B:46:0x00c5, B:48:0x00c9, B:49:0x00ce, B:58:0x005b, B:60:0x006f, B:61:0x007c, B:63:0x0076), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[Catch: CancellationException -> 0x0119, TryCatch #0 {CancellationException -> 0x0119, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00fc, B:19:0x0108, B:21:0x010b, B:24:0x010e, B:28:0x0112, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:40:0x00b5, B:42:0x00bb, B:44:0x00bf, B:46:0x00c5, B:48:0x00c9, B:49:0x00ce, B:58:0x005b, B:60:0x006f, B:61:0x007c, B:63:0x0076), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[Catch: CancellationException -> 0x0119, TryCatch #0 {CancellationException -> 0x0119, blocks: (B:12:0x0033, B:13:0x00e2, B:15:0x00ea, B:17:0x00fc, B:19:0x0108, B:21:0x010b, B:24:0x010e, B:28:0x0112, B:35:0x00ab, B:37:0x00af, B:38:0x00b1, B:40:0x00b5, B:42:0x00bb, B:44:0x00bf, B:46:0x00c5, B:48:0x00c9, B:49:0x00ce, B:58:0x005b, B:60:0x006f, B:61:0x007c, B:63:0x0076), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, final androidx.compose.foundation.text.TextDragObserver textDragObserver, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1 selectionGesturesKt$touchSelectionSubsequentPress$1;
        int i2;
        androidx.compose.foundation.text.TextDragObserver textDragObserver2;
        long id;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.foundation.text.selection.DownResolution downResolution;
        try {
            if (continuation instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1) {
                selectionGesturesKt$touchSelectionSubsequentPress$1 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1) continuation;
                if ((selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = selectionGesturesKt$touchSelectionSubsequentPress$1.getOutputMinFrameDuration;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoFpsRanges;
                    if (i2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.first((java.util.List) pointerEvent.getChanges());
                        id = pointerInputChange.getId();
                        textDragObserver.mo2105onStart3MmeM6k(pointerInputChange.getPosition(), i > 2 ? androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getParagraph() : androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord());
                        longRef = new kotlin.jvm.internal.Ref.LongRef();
                        longRef.element = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(id, longRef, null);
                        selectionGesturesKt$touchSelectionSubsequentPress$1.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoSizes = textDragObserver;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.Camera2StreamConfigurationMap = longRef;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoFpsRangesFor = id;
                        selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoFpsRanges = 1;
                        obj = awaitPointerEventScope.withTimeoutOrNull(longPressTimeoutMillis, selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1, selectionGesturesKt$touchSelectionSubsequentPress$1);
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            textDragObserver = (androidx.compose.foundation.text.TextDragObserver) selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoSizes;
                            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$touchSelectionSubsequentPress$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                int size = changes.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes.get(i3);
                                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(pointerInputChange2)) {
                                        pointerInputChange2.consume();
                                    }
                                }
                                textDragObserver.onStop();
                            } else {
                                textDragObserver.onCancel();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        long j = selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoFpsRangesFor;
                        longRef = (kotlin.jvm.internal.Ref.LongRef) selectionGesturesKt$touchSelectionSubsequentPress$1.Camera2StreamConfigurationMap;
                        textDragObserver2 = (androidx.compose.foundation.text.TextDragObserver) selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoSizes;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$touchSelectionSubsequentPress$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            id = j;
                            textDragObserver = textDragObserver2;
                            awaitPointerEventScope = awaitPointerEventScope2;
                        } catch (java.util.concurrent.CancellationException e) {
                            e = e;
                            textDragObserver2.onCancel();
                            throw e;
                        }
                    }
                    downResolution = (androidx.compose.foundation.text.selection.DownResolution) obj;
                    if (downResolution == null) {
                        downResolution = androidx.compose.foundation.text.selection.DownResolution.getHighSpeedVideoSizes;
                    }
                    if (downResolution != androidx.compose.foundation.text.selection.DownResolution.getHighSpeedVideoFpsRanges) {
                        textDragObserver.onCancel();
                        return kotlin.Unit.INSTANCE;
                    }
                    if (downResolution == androidx.compose.foundation.text.selection.DownResolution.getHighSpeedVideoFpsRangesFor) {
                        textDragObserver.onStop();
                        return kotlin.Unit.INSTANCE;
                    }
                    if (downResolution == androidx.compose.foundation.text.selection.DownResolution.getHighResolutionOutputSizeshNQ4ISI) {
                        textDragObserver.mo2104onDragk4lQ0M(longRef.element);
                    }
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.compose.foundation.text.selection.SelectionGesturesKt.$r8$lambda$MG2hWUKFfCKcOse0poUu4CUxQko(androidx.compose.foundation.text.TextDragObserver.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2);
                        }
                    };
                    selectionGesturesKt$touchSelectionSubsequentPress$1.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoSizes = textDragObserver;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.Camera2StreamConfigurationMap = null;
                    selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoFpsRanges = 2;
                    obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1467dragjO51t88(awaitPointerEventScope, id, function1, selectionGesturesKt$touchSelectionSubsequentPress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i2 != 0) {
            }
            downResolution = (androidx.compose.foundation.text.selection.DownResolution) obj;
            if (downResolution == null) {
            }
            if (downResolution != androidx.compose.foundation.text.selection.DownResolution.getHighSpeedVideoFpsRanges) {
            }
        } catch (java.util.concurrent.CancellationException e2) {
            e = e2;
            textDragObserver2 = textDragObserver;
        }
        selectionGesturesKt$touchSelectionSubsequentPress$1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$1(continuation);
        java.lang.Object obj2 = selectionGesturesKt$touchSelectionSubsequentPress$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = selectionGesturesKt$touchSelectionSubsequentPress$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x008c, code lost:
    
        if (r13 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0136 A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0119, B:15:0x0121, B:17:0x0125, B:19:0x0136, B:21:0x0142, B:61:0x00ec), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, final androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter clicksCounter, androidx.compose.ui.input.pointer.PointerEvent pointerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1 selectionGesturesKt$mouseSelection$1;
        int i;
        final androidx.compose.foundation.text.selection.SelectionAdjustment none;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        int size;
        try {
            try {
                if (continuation instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1) {
                    selectionGesturesKt$mouseSelection$1 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1) continuation;
                    if ((selectionGesturesKt$mouseSelection$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                        selectionGesturesKt$mouseSelection$1.getHighSpeedVideoSizes -= 2147483648;
                        java.lang.Object obj = selectionGesturesKt$mouseSelection$1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = selectionGesturesKt$mouseSelection$1.getHighSpeedVideoSizes;
                        int i2 = 0;
                        if (i == 0) {
                            if (i == 1) {
                                mouseSelectionObserver = (androidx.compose.foundation.text.selection.MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.getHighSpeedVideoFpsRangesFor;
                                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                                    int size2 = changes.size();
                                    while (i2 < size2) {
                                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i2);
                                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(pointerInputChange)) {
                                            pointerInputChange.consume();
                                        }
                                        i2++;
                                    }
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) selectionGesturesKt$mouseSelection$1.Camera2StreamConfigurationMap;
                            mouseSelectionObserver = (androidx.compose.foundation.text.selection.MouseSelectionObserver) selectionGesturesKt$mouseSelection$1.getHighSpeedVideoFpsRangesFor;
                            awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) selectionGesturesKt$mouseSelection$1.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (((java.lang.Boolean) obj).booleanValue() && booleanRef.element) {
                                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                size = changes2.size();
                                while (i2 < size) {
                                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes2.get(i2);
                                    if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(pointerInputChange2)) {
                                        pointerInputChange2.consume();
                                    }
                                    i2++;
                                }
                            }
                            mouseSelectionObserver.onDragDone();
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = pointerEvent.getChanges().get(0);
                        if (androidx.compose.ui.input.pointer.PointerEvent_androidKt.m7207isShiftPressed5xRPYO0(pointerEvent.getKeyboardModifiers())) {
                            if (mouseSelectionObserver.mo2312onExtendk4lQ0M(pointerInputChange3.getPosition())) {
                                pointerInputChange3.consume();
                                long id = pointerInputChange3.getId();
                                kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return androidx.compose.foundation.text.selection.SelectionGesturesKt.m2392$r8$lambda$EGPeabzsJfZXIe7tt4KQZ1Bvec(androidx.compose.foundation.text.selection.MouseSelectionObserver.this, (androidx.compose.ui.input.pointer.PointerInputChange) obj2);
                                    }
                                };
                                selectionGesturesKt$mouseSelection$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
                                selectionGesturesKt$mouseSelection$1.getHighSpeedVideoFpsRangesFor = mouseSelectionObserver;
                                selectionGesturesKt$mouseSelection$1.getHighSpeedVideoSizes = 1;
                                obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1467dragjO51t88(awaitPointerEventScope, id, function1, selectionGesturesKt$mouseSelection$1);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        int clicks = clicksCounter.getClicks();
                        if (clicks == 1) {
                            none = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone();
                        } else if (clicks == 2) {
                            none = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getWord();
                        } else {
                            none = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getParagraph();
                        }
                        if (mouseSelectionObserver.mo2314onStart9KIMszo(pointerInputChange3.getPosition(), none, clicksCounter.getClicks())) {
                            final kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
                            booleanRef2.element = !kotlin.jvm.internal.Intrinsics.areEqual(none, androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE.getNone());
                            long id2 = pointerInputChange3.getId();
                            kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionGesturesKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return androidx.compose.foundation.text.selection.SelectionGesturesKt.$r8$lambda$LhLN6mru9YupXzUsW6LIwpgDLsE(androidx.compose.foundation.text.selection.MouseSelectionObserver.this, none, booleanRef2, (androidx.compose.ui.input.pointer.PointerInputChange) obj2);
                                }
                            };
                            selectionGesturesKt$mouseSelection$1.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
                            selectionGesturesKt$mouseSelection$1.getHighSpeedVideoFpsRangesFor = mouseSelectionObserver;
                            selectionGesturesKt$mouseSelection$1.Camera2StreamConfigurationMap = booleanRef2;
                            selectionGesturesKt$mouseSelection$1.getHighSpeedVideoSizes = 2;
                            obj = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1467dragjO51t88(awaitPointerEventScope, id2, function12, selectionGesturesKt$mouseSelection$1);
                            if (obj != coroutine_suspended) {
                                awaitPointerEventScope2 = awaitPointerEventScope;
                                booleanRef = booleanRef2;
                                if (((java.lang.Boolean) obj).booleanValue()) {
                                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = awaitPointerEventScope2.getCurrentEvent().getChanges();
                                    size = changes22.size();
                                    while (i2 < size) {
                                    }
                                }
                                mouseSelectionObserver.onDragDone();
                            }
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                if (i == 0) {
                }
            } finally {
            }
        } finally {
        }
        selectionGesturesKt$mouseSelection$1 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$mouseSelection$1(continuation);
        java.lang.Object obj2 = selectionGesturesKt$mouseSelection$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = selectionGesturesKt$mouseSelection$1.getHighSpeedVideoSizes;
        int i22 = 0;
    }

    /* renamed from: $r8$lambda$-EGPeabzsJfZXIe7tt4KQZ1Bvec, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2392$r8$lambda$EGPeabzsJfZXIe7tt4KQZ1Bvec(androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        if (mouseSelectionObserver.mo2313onExtendDragk4lQ0M(pointerInputChange.getPosition())) {
            pointerInputChange.consume();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KlckGGDCT2Ubspmar-UPaznwDjg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2393$r8$lambda$KlckGGDCT2UbspmarUPaznwDjg(androidx.compose.foundation.text.TextDragObserver textDragObserver, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        textDragObserver.mo2104onDragk4lQ0M(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange));
        pointerInputChange.consume();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LhLN6mru9YupXzUsW6LIwpgDLsE(androidx.compose.foundation.text.selection.MouseSelectionObserver mouseSelectionObserver, androidx.compose.foundation.text.selection.SelectionAdjustment selectionAdjustment, kotlin.jvm.internal.Ref.BooleanRef booleanRef, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        if (mouseSelectionObserver.mo2311onDrag3MmeM6k(pointerInputChange.getPosition(), selectionAdjustment)) {
            pointerInputChange.consume();
            booleanRef.element = true;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MG2hWUKFfCKcOse0poUu4CUxQko(androidx.compose.foundation.text.TextDragObserver textDragObserver, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange) {
        textDragObserver.mo2104onDragk4lQ0M(androidx.compose.ui.input.pointer.PointerEventKt.positionChange(pointerInputChange));
        pointerInputChange.consume();
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$distanceIsTolerable(androidx.compose.ui.platform.ViewConfiguration viewConfiguration, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2) {
        return androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition())) < androidx.compose.foundation.gestures.DragGestureDetectorKt.m1469pointerSlopE8SPZFQ(viewConfiguration, pointerInputChange.getType());
    }
}
