package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aJ\u0010\r\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\n\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\t0\u0005H\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/ParameterName;", "", "", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "Landroidx/compose/ui/unit/Dp;", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragGestureDetectorCopyKt {
    private static final float Camera2StreamConfigurationMap;
    private static final float getHighSpeedVideoFpsRanges;
    private static final float getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x017d, code lost:
    
        if (r12.awaitPointerEvent(r2, r3) == r4) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x013c -> B:16:0x018a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x017d -> B:11:0x0180). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01a2 -> B:16:0x018a). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object m2601awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, long j, int i, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> continuation) {
        androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function22;
        kotlin.jvm.internal.Ref.LongRef longRef;
        androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f;
        float f2;
        kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function23;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        float f3;
        float f4;
        int size;
        int i3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4;
        java.lang.Object awaitPointerEvent$default;
        if (continuation instanceof androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = (androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getOutputFormats;
                int i4 = 1;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
                    int size2 = changes.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            pointerInputChange = null;
                            break;
                        }
                        pointerInputChange = changes.get(i5);
                        if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange.getId(), j)) {
                            break;
                        }
                        i5++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5 = pointerInputChange;
                    if (!(pointerInputChange5 != null && pointerInputChange5.getPressed())) {
                        return null;
                    }
                    float m2602pointerSlopE8SPZFQ = m2602pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                    kotlin.jvm.internal.Ref.LongRef longRef2 = new kotlin.jvm.internal.Ref.LongRef();
                    longRef2.element = j;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    function22 = function2;
                    longRef = longRef2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                    f = m2602pointerSlopE8SPZFQ;
                    f2 = 0.0f;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = function22;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoSizes = awaitPointerEventScope2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = longRef;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getInputFormats = null;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getOutputFormats = i4;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float intBitsToFloat = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                    f3 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                    pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats;
                    longRef = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes;
                    function23 = (kotlin.jvm.functions.Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    char c = 2;
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f2 = intBitsToFloat;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                    awaitPointerEventScope2 = awaitPointerEventScope3;
                    f = f3;
                    function22 = function23;
                    i4 = 1;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = function22;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoSizes = awaitPointerEventScope2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = longRef;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getInputFormats = null;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f2;
                    dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getOutputFormats = i4;
                    awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, null);
                    if (awaitPointerEvent$default != coroutine_suspended) {
                        function23 = function22;
                        f3 = f;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
                        awaitPointerEventScope3 = awaitPointerEventScope2;
                        f4 = f2;
                        obj = awaitPointerEvent$default;
                        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                        size = changes2.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                pointerInputChange2 = null;
                                break;
                            }
                            pointerInputChange2 = changes2.get(i3);
                            if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange2.getId(), longRef.element)) {
                                break;
                            }
                            i3++;
                        }
                        kotlin.jvm.internal.Intrinsics.checkNotNull(pointerInputChange2);
                        pointerInputChange3 = pointerInputChange2;
                        if (pointerInputChange3.isConsumed()) {
                            return null;
                        }
                        if (androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent.getChanges();
                            int size3 = changes3.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size3) {
                                    pointerInputChange4 = null;
                                    break;
                                }
                                pointerInputChange4 = changes3.get(i6);
                                if (pointerInputChange4.getPressed()) {
                                    break;
                                }
                                i6++;
                            }
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6 = pointerInputChange4;
                            if (pointerInputChange6 == null) {
                                return null;
                            }
                            longRef.element = pointerInputChange6.getId();
                            f2 = f4;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            c = 2;
                        } else {
                            intBitsToFloat = f4 + (java.lang.Float.intBitsToFloat((int) (pointerInputChange3.getPosition() >> 32)) - java.lang.Float.intBitsToFloat((int) (pointerInputChange3.getPreviousPosition() >> 32)));
                            if (java.lang.Math.abs(intBitsToFloat) < f3) {
                                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges = function23;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes = awaitPointerEventScope3;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap = longRef;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getInputFormats = pointerInputChange3;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor = f3;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI = intBitsToFloat;
                                c = 2;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getOutputFormats = 2;
                            } else {
                                c = 2;
                                function23.invoke(pointerInputChange3, kotlin.coroutines.jvm.internal.Boxing.boxFloat(intBitsToFloat - (java.lang.Math.signum(intBitsToFloat) * f3)));
                                if (pointerInputChange3.isConsumed()) {
                                    return pointerInputChange3;
                                }
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                                f2 = 0.0f;
                            }
                        }
                        f = f3;
                        function22 = function23;
                        i4 = 1;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRanges = function22;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoSizes = awaitPointerEventScope2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.Camera2StreamConfigurationMap = longRef;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getInputFormats = null;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighSpeedVideoFpsRangesFor = f;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getHighResolutionOutputSizeshNQ4ISI = f2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.getOutputFormats = i4;
                        awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, null);
                        if (awaitPointerEvent$default != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                f4 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighResolutionOutputSizeshNQ4ISI;
                f3 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Ref.LongRef longRef3 = (kotlin.jvm.internal.Ref.LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.Camera2StreamConfigurationMap;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizes;
                kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                function23 = function24;
                awaitPointerEventScope3 = awaitPointerEventScope4;
                longRef = longRef3;
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent2.getChanges();
                size = changes22.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                    }
                    i3++;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(pointerInputChange2);
                pointerInputChange3 = pointerInputChange2;
                if (pointerInputChange3.isConsumed()) {
                }
            }
        }
        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = new androidx.compose.material.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        java.lang.Object obj2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.getOutputFormats;
        int i42 = 1;
        if (i2 != 0) {
        }
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m2602pointerSlopE8SPZFQ(androidx.compose.ui.platform.ViewConfiguration viewConfiguration, int i) {
        return androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(i, androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7304getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * getHighSpeedVideoFpsRangesFor : viewConfiguration.getTouchSlop();
    }

    static {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.125f);
        Camera2StreamConfigurationMap = m8601constructorimpl;
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(18.0f);
        getHighSpeedVideoFpsRanges = m8601constructorimpl2;
        getHighSpeedVideoFpsRangesFor = m8601constructorimpl / m8601constructorimpl2;
    }
}
