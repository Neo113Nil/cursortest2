package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008b\u0001\u0010\t\u001a\u00020\u0005*\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2/\b\u0002\u0010\u000e\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u00072\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\u0010\u001a\u0012\u0010\u0011\u001a\u00020\u0005*\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013\u001a\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0017\u001a[\u0010\u0018\u001a\u00020\u0005*\u00020\n2/\b\u0002\u0010\u000e\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u00072\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fH\u0080@¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u001a\u001a\u00020\u0015*\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0087@¢\u0006\u0002\u0010\u001d\u001a&\u0010\u001a\u001a\u00020\u0015*\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010 \u001a&\u0010!\u001a\u00020\u0015*\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0080@¢\u0006\u0002\u0010 \u001a\u001e\u0010\"\u001a\u00020\u001c*\u00020#2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010$\u001a\u00020\u001cH\u0000\u001a\u0014\u0010%\u001a\u0004\u0018\u00010\u0015*\u00020\u0012H\u0087@¢\u0006\u0002\u0010\u0013\u001a\u001e\u0010%\u001a\u0004\u0018\u00010\u0015*\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010&\u001a\u001c\u0010'\u001a\u00020(*\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0080@¢\u0006\u0002\u0010&\u001aL\u00106\u001a\u000207*\u0002082\u0006\u00109\u001a\u0002072\b\b\u0002\u0010:\u001a\u0002022'\u0010;\u001a#\b\u0001\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060<¢\u0006\u0002\b\u0007H\u0002¢\u0006\u0002\u0010=\"7\u0010\u0000\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"*\u0010*\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\"\u001a\u00101\u001a\u0002028BX\u0082\u0004¢\u0006\f\u0012\u0004\b3\u0010,\u001a\u0004\b4\u00105¨\u0006>"}, d2 = {"NoPressGesture", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function3;", "detectTapGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onDoubleTap", "Lkotlin/Function1;", "onLongPress", "onPress", "onTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumeUntilUp", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSecondDown", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "firstUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFirstDown", "requireUnconsumed", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPrimaryFirstDown", "isChangedToDown", "Landroidx/compose/ui/input/pointer/PointerEvent;", "onlyPrimaryMouseButton", "waitForUpOrCancellation", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForLongPress", "Landroidx/compose/foundation/gestures/LongPressResult;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "DetectTapGesturesEnableNewDispatchingBehavior", "getDetectTapGesturesEnableNewDispatchingBehavior$annotations", "()V", "getDetectTapGesturesEnableNewDispatchingBehavior", "()Z", "setDetectTapGesturesEnableNewDispatchingBehavior", "(Z)V", "coroutineStartForCurrentDispatchBehavior", "Lkotlinx/coroutines/CoroutineStart;", "getCoroutineStartForCurrentDispatchBehavior$annotations", "getCoroutineStartForCurrentDispatchBehavior", "()Lkotlinx/coroutines/CoroutineStart;", "launchAwaitingReset", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "resetJob", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "block", "Lkotlin/Function2;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/Job;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TapGestureDetectorKt {
    private static final kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges = new androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1(null);

    @kotlin.Deprecated(message = "This flag has been moved to ComposeFoundationFlags and renamed to isDetectTapGesturesImmediateCoroutineDispatchEnabled. For compatibility,  DetectTapGesturesEnableNewDispatchingBehavior controls the new flag (isDetectTapGesturesImmediateCoroutineDispatchEnabled). Please use  isDetectTapGesturesImmediateCoroutineDispatchEnabled instead.", replaceWith = @kotlin.ReplaceWith(expression = "isDetectTapGesturesImmediateCoroutineDispatchEnabled", imports = {"androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled"}))
    public static /* synthetic */ void getDetectTapGesturesEnableNewDispatchingBehavior$annotations() {
    }

    public static /* synthetic */ java.lang.Object detectTapGestures$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function13, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        kotlin.jvm.functions.Function1 function14 = (i & 1) != 0 ? null : function1;
        kotlin.jvm.functions.Function1 function15 = (i & 2) != 0 ? null : function12;
        if ((i & 4) != 0) {
            function3 = getHighSpeedVideoFpsRanges;
        }
        return detectTapGestures(pointerInputScope, function14, function15, function3, (i & 8) != 0 ? null : function13, continuation);
    }

    public static final java.lang.Object detectTapGestures(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function13, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2(pointerInputScope, function3, function12, function1, function13, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[LOOP:0: B:11:0x0054->B:12:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 tapGestureDetectorKt$consumeUntilUp$1;
        int i;
        int size;
        int i2;
        int i3;
        int size2;
        if (continuation instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) {
            tapGestureDetectorKt$consumeUntilUp$1 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) continuation;
            if ((tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = tapGestureDetectorKt$consumeUntilUp$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope;
                    tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoSizes = 1;
                    obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                    if (obj == coroutine_suspended) {
                    }
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i3 < size) {
                    }
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                    size2 = changes2.size();
                    while (i2 < size2) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                size = changes3.size();
                i2 = 0;
                for (i3 = 0; i3 < size; i3++) {
                    changes3.get(i3).consume();
                }
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent2.getChanges();
                size2 = changes22.size();
                while (i2 < size2) {
                    if (changes22.get(i2).getPressed()) {
                        tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope;
                        tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoSizes = 1;
                        obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, tapGestureDetectorKt$consumeUntilUp$1, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent22 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes32 = pointerEvent22.getChanges();
                        size = changes32.size();
                        i2 = 0;
                        while (i3 < size) {
                        }
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes222 = pointerEvent22.getChanges();
                        size2 = changes222.size();
                        while (i2 < size2) {
                        }
                    } else {
                        i2++;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        tapGestureDetectorKt$consumeUntilUp$1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1(continuation);
        java.lang.Object obj2 = tapGestureDetectorKt$consumeUntilUp$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$consumeUntilUp$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object Camera2StreamConfigurationMap(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2(pointerInputChange, null), continuation);
    }

    public static /* synthetic */ java.lang.Object detectTapAndPress$default(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function3 = getHighSpeedVideoFpsRanges;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return detectTapAndPress(pointerInputScope, function3, function1, continuation);
    }

    public static final java.lang.Object detectTapAndPress(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.gestures.PressGestureScope, ? super androidx.compose.ui.geometry.Offset, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2(pointerInputScope, function3, function1, new androidx.compose.foundation.gestures.PressGestureScopeImpl(pointerInputScope), null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object awaitFirstDown$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z, continuation);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, kotlin.coroutines.Continuation continuation) {
        return awaitFirstDown(awaitPointerEventScope, z, androidx.compose.ui.input.pointer.PointerEventPass.Main, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:10:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, boolean r8, androidx.compose.ui.input.pointer.PointerEventPass r9, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.getHighSpeedVideoFpsRangesFor
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.getHighSpeedVideoFpsRangesFor
            int r10 = r10 + r2
            r0.getHighSpeedVideoFpsRangesFor = r10
            goto L19
        L14:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.getHighResolutionOutputSizeshNQ4ISI
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.getHighSpeedVideoFpsRangesFor
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            boolean r7 = r0.Camera2StreamConfigurationMap
            java.lang.Object r8 = r0.getHighSpeedVideoSizes
            androidx.compose.ui.input.pointer.PointerEventPass r8 = (androidx.compose.ui.input.pointer.PointerEventPass) r8
            java.lang.Object r9 = r0.getHighSpeedVideoFpsRanges
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.ResultKt.throwOnFailure(r10)
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
            goto L52
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            kotlin.ResultKt.throwOnFailure(r10)
        L43:
            r0.getHighSpeedVideoFpsRanges = r7
            r0.getHighSpeedVideoSizes = r9
            r0.Camera2StreamConfigurationMap = r8
            r0.getHighSpeedVideoFpsRangesFor = r3
            java.lang.Object r10 = r7.awaitPointerEvent(r9, r0)
            if (r10 != r1) goto L52
            return r1
        L52:
            androidx.compose.ui.input.pointer.PointerEvent r10 = (androidx.compose.ui.input.pointer.PointerEvent) r10
            r2 = 2
            r4 = 0
            r5 = 0
            boolean r2 = isChangedToDown$default(r10, r8, r5, r2, r4)
            if (r2 == 0) goto L43
            java.util.List r7 = r10.getChanges()
            java.lang.Object r7 = r7.get(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object awaitFirstDown$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z, pointerEventPass, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:10:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, boolean r6, androidx.compose.ui.input.pointer.PointerEventPass r7, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L14
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.getHighSpeedVideoFpsRanges
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r8 = r0.getHighSpeedVideoFpsRanges
            int r8 = r8 + r2
            r0.getHighSpeedVideoFpsRanges = r8
            goto L19
        L14:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L19:
            java.lang.Object r8 = r0.getHighSpeedVideoSizes
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.getHighSpeedVideoFpsRanges
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            boolean r5 = r0.Camera2StreamConfigurationMap
            java.lang.Object r6 = r0.getHighSpeedVideoFpsRangesFor
            androidx.compose.ui.input.pointer.PointerEventPass r6 = (androidx.compose.ui.input.pointer.PointerEventPass) r6
            java.lang.Object r7 = r0.getHighResolutionOutputSizeshNQ4ISI
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.throwOnFailure(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L52
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            kotlin.ResultKt.throwOnFailure(r8)
        L43:
            r0.getHighResolutionOutputSizeshNQ4ISI = r5
            r0.getHighSpeedVideoFpsRangesFor = r7
            r0.Camera2StreamConfigurationMap = r6
            r0.getHighSpeedVideoFpsRanges = r3
            java.lang.Object r8 = r5.awaitPointerEvent(r7, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
            boolean r2 = isChangedToDown(r8, r6, r3)
            if (r2 == 0) goto L43
            java.util.List r5 = r8.getChanges()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object awaitPrimaryFirstDown$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
        }
        return awaitPrimaryFirstDown(awaitPointerEventScope, z, pointerEventPass, continuation);
    }

    public static /* synthetic */ boolean isChangedToDown$default(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = androidx.compose.foundation.gestures.TapGestureDetector_androidKt.firstDownRefersToPrimaryMouseButtonOnly();
        }
        return isChangedToDown(pointerEvent, z, z2);
    }

    public static final boolean isChangedToDown(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, boolean z, boolean z2) {
        if (z2) {
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(changes.get(i).getType(), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7304getMouseT8wyACA())) {
                        break;
                    }
                    i++;
                } else if (!androidx.compose.ui.input.pointer.PointerEvent_androidKt.m7204isPrimaryPressedaHzCxE(pointerEvent.getButtons())) {
                    return false;
                }
            }
        }
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes2.get(i2);
            if (!(z ? androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(pointerInputChange) : androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        if (r0 == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$2;
        int i;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$22;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass3;
        int size;
        int i2;
        java.lang.Object awaitPointerEvent;
        if (continuation instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) {
            tapGestureDetectorKt$waitForUpOrCancellation$2 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) continuation;
            if ((tapGestureDetectorKt$waitForUpOrCancellation$2.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                tapGestureDetectorKt$waitForUpOrCancellation$2.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = tapGestureDetectorKt$waitForUpOrCancellation$2.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tapGestureDetectorKt$waitForUpOrCancellation$2.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                    pointerEventPass2 = pointerEventPass;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.getHighSpeedVideoSizes = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$22.getHighSpeedVideoFpsRangesFor = 1;
                    awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                    if (awaitPointerEvent != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    pointerEventPass3 = (androidx.compose.ui.input.pointer.PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.getHighSpeedVideoSizes;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pointerEventPass3 = (androidx.compose.ui.input.pointer.PointerEventPass) tapGestureDetectorKt$waitForUpOrCancellation$2.getHighSpeedVideoSizes;
                awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) tapGestureDetectorKt$waitForUpOrCancellation$2.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass4 = pointerEventPass3;
                tapGestureDetectorKt$waitForUpOrCancellation$22 = tapGestureDetectorKt$waitForUpOrCancellation$2;
                pointerEventPass2 = pointerEventPass4;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                int size2 = changes2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (changes2.get(i3).isConsumed()) {
                        return null;
                    }
                }
                awaitPointerEventScope2 = awaitPointerEventScope3;
                tapGestureDetectorKt$waitForUpOrCancellation$22.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.getHighSpeedVideoSizes = pointerEventPass2;
                tapGestureDetectorKt$waitForUpOrCancellation$22.getHighSpeedVideoFpsRangesFor = 1;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, tapGestureDetectorKt$waitForUpOrCancellation$22);
                if (awaitPointerEvent != coroutine_suspended) {
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    obj = awaitPointerEvent;
                    androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 tapGestureDetectorKt$waitForUpOrCancellation$23 = tapGestureDetectorKt$waitForUpOrCancellation$22;
                    pointerEventPass3 = pointerEventPass2;
                    tapGestureDetectorKt$waitForUpOrCancellation$2 = tapGestureDetectorKt$waitForUpOrCancellation$23;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    for (i2 = 0; i2 < size; i2++) {
                        if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(changes3.get(i2))) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = pointerEvent2.getChanges();
                            int size3 = changes4.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes4.get(i4);
                                if (pointerInputChange.isConsumed() || androidx.compose.ui.input.pointer.PointerEventKt.m7177isOutOfBoundsjwHxaWs(pointerInputChange, awaitPointerEventScope3.mo7142getSizeYbymL2g(), awaitPointerEventScope3.mo7141getExtendedTouchPaddingNHjbRc())) {
                                    break;
                                }
                            }
                            androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass5 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.getHighSpeedVideoSizes = pointerEventPass3;
                            tapGestureDetectorKt$waitForUpOrCancellation$2.getHighSpeedVideoFpsRangesFor = 2;
                            obj = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass5, tapGestureDetectorKt$waitForUpOrCancellation$2);
                        }
                    }
                    return pointerEvent2.getChanges().get(0);
                }
                return coroutine_suspended;
            }
        }
        tapGestureDetectorKt$waitForUpOrCancellation$2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2(continuation);
        java.lang.Object obj2 = tapGestureDetectorKt$waitForUpOrCancellation$2.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$waitForUpOrCancellation$2.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    public static /* synthetic */ java.lang.Object waitForUpOrCancellation$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.LongPressResult$Canceled] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object waitForLongPress(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.LongPressResult> continuation) {
        androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 tapGestureDetectorKt$waitForLongPress$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        try {
            if (continuation instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1) {
                tapGestureDetectorKt$waitForLongPress$1 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1) continuation;
                if ((tapGestureDetectorKt$waitForLongPress$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    tapGestureDetectorKt$waitForLongPress$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = tapGestureDetectorKt$waitForLongPress$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = tapGestureDetectorKt$waitForLongPress$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                        objectRef2.element = androidx.compose.foundation.gestures.LongPressResult.Canceled.INSTANCE;
                        long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2(pointerEventPass, objectRef2, null);
                        tapGestureDetectorKt$waitForLongPress$1.getHighResolutionOutputSizeshNQ4ISI = objectRef2;
                        tapGestureDetectorKt$waitForLongPress$1.Camera2StreamConfigurationMap = 1;
                        if (awaitPointerEventScope.withTimeout(longPressTimeoutMillis, tapGestureDetectorKt$waitForLongPress$2, tapGestureDetectorKt$waitForLongPress$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objectRef = (kotlin.jvm.internal.Ref.ObjectRef) tapGestureDetectorKt$waitForLongPress$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return objectRef.element;
                }
            }
            if (i != 0) {
            }
            return objectRef.element;
        } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused) {
            return androidx.compose.foundation.gestures.LongPressResult.Success.INSTANCE;
        }
        tapGestureDetectorKt$waitForLongPress$1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1(continuation);
        java.lang.Object obj2 = tapGestureDetectorKt$waitForLongPress$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tapGestureDetectorKt$waitForLongPress$1.Camera2StreamConfigurationMap;
    }

    public static /* synthetic */ java.lang.Object waitForLongPress$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Main;
        }
        return waitForLongPress(awaitPointerEventScope, pointerEventPass, continuation);
    }

    public static final void setDetectTapGesturesEnableNewDispatchingBehavior(boolean z) {
        androidx.compose.foundation.ComposeFoundationFlags composeFoundationFlags = androidx.compose.foundation.ComposeFoundationFlags.INSTANCE;
        androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled = z;
    }

    public static final boolean getDetectTapGesturesEnableNewDispatchingBehavior() {
        return androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.CoroutineStart Camera2StreamConfigurationMap() {
        if (androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled) {
            return kotlinx.coroutines.CoroutineStart.UNDISPATCHED;
        }
        return kotlinx.coroutines.CoroutineStart.DEFAULT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.Job getHighSpeedVideoSizes(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.Job job, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1(job, function2, null), 1, null);
        return launch$default;
    }
}
