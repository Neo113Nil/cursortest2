package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u000b\u001a*\u0010\u0013\u001a\u00020\u0012*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0016\u001a\u00020\t*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\t*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0018\u0010\u0017\u001a>\u0010\u0013\u001a\u00020\u0012*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH\u0082@¢\u0006\u0004\b\u0013\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/TransformableState;", "state", "", "lockRotationOnZoomPan", "enabled", "transformable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;ZZ)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "canPan", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/TransformableState;Lkotlin/jvm/functions/Function1;ZZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/compose/foundation/gestures/TransformEvent;", "p0", "Landroidx/compose/foundation/gestures/ScrollConfig;", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlinx/coroutines/channels/Channel;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/ScrollConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "p2", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "SCROLL_FACTOR", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    public static /* synthetic */ boolean $r8$lambda$zxip39FZvo6KTch7ba9sbf_yEsY(androidx.compose.ui.geometry.Offset offset) {
        return true;
    }

    public static /* synthetic */ androidx.compose.ui.Modifier transformable$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.TransformableState transformableState, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, z, z2);
    }

    public static final androidx.compose.ui.Modifier transformable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.TransformableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(androidx.compose.foundation.gestures.TransformableKt.$r8$lambda$zxip39FZvo6KTch7ba9sbf_yEsY((androidx.compose.ui.geometry.Offset) obj));
            }
        }, z, z2);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier transformable$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.TransformableState transformableState, kotlin.jvm.functions.Function1 function1, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return transformable(modifier, transformableState, function1, z, z2);
    }

    public static final androidx.compose.ui.Modifier transformable(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.gestures.TransformableState transformableState, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function1, boolean z, boolean z2) {
        return modifier.then(new androidx.compose.foundation.gestures.TransformableElement(transformableState, function1, z, z2));
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:10:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.AwaitPointerEventScope r5, androidx.compose.foundation.gestures.ScrollConfig r6, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            if (r0 == 0) goto L14
            r0 = r7
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1) r0
            int r1 = r0.getHighSpeedVideoFpsRanges
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.getHighSpeedVideoFpsRanges
            int r7 = r7 + r2
            r0.getHighSpeedVideoFpsRanges = r7
            goto L19
        L14:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r0.<init>(r7)
        L19:
            java.lang.Object r7 = r0.Camera2StreamConfigurationMap
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.getHighSpeedVideoFpsRanges
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r5 = r0.getHighResolutionOutputSizeshNQ4ISI
            androidx.compose.foundation.gestures.ScrollConfig r5 = (androidx.compose.foundation.gestures.ScrollConfig) r5
            java.lang.Object r6 = r0.getHighSpeedVideoFpsRangesFor
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r6 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r6
            kotlin.ResultKt.throwOnFailure(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L4d
        L35:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3d:
            kotlin.ResultKt.throwOnFailure(r7)
        L40:
            r0.getHighSpeedVideoFpsRangesFor = r5
            r0.getHighResolutionOutputSizeshNQ4ISI = r6
            r0.getHighSpeedVideoFpsRanges = r3
            java.lang.Object r7 = getHighSpeedVideoSizes(r5, r6, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            androidx.compose.ui.geometry.Offset r7 = (androidx.compose.ui.geometry.Offset) r7
            if (r7 == 0) goto L40
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighSpeedVideoSizes(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, androidx.compose.foundation.gestures.ScrollConfig scrollConfig, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> continuation) {
        androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 transformableKt$awaitCtrlMouseScrollOrNull$1;
        int i;
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent;
        if (continuation instanceof androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1) {
            transformableKt$awaitCtrlMouseScrollOrNull$1 = (androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1) continuation;
            if ((transformableKt$awaitCtrlMouseScrollOrNull$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                transformableKt$awaitCtrlMouseScrollOrNull$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = transformableKt$awaitCtrlMouseScrollOrNull$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$awaitCtrlMouseScrollOrNull$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    transformableKt$awaitCtrlMouseScrollOrNull$1.getHighResolutionOutputSizeshNQ4ISI = awaitPointerEventScope;
                    transformableKt$awaitCtrlMouseScrollOrNull$1.getHighSpeedVideoFpsRanges = scrollConfig;
                    transformableKt$awaitCtrlMouseScrollOrNull$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, transformableKt$awaitCtrlMouseScrollOrNull$1, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    scrollConfig = (androidx.compose.foundation.gestures.ScrollConfig) transformableKt$awaitCtrlMouseScrollOrNull$1.getHighSpeedVideoFpsRanges;
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) transformableKt$awaitCtrlMouseScrollOrNull$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                if (androidx.compose.ui.input.pointer.PointerEvent_androidKt.m7198isCtrlPressed5xRPYO0(pointerEvent.getKeyboardModifiers()) || !androidx.compose.ui.input.pointer.PointerEventType.m7180equalsimpl0(pointerEvent.getType(), androidx.compose.ui.input.pointer.PointerEventType.INSTANCE.m7189getScroll7fucELk())) {
                    return null;
                }
                long mo1431calculateMouseWheelScroll8xgXZGE = scrollConfig.mo1431calculateMouseWheelScroll8xgXZGE(awaitPointerEventScope, pointerEvent, awaitPointerEventScope.mo7142getSizeYbymL2g());
                if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(mo1431calculateMouseWheelScroll8xgXZGE, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
                    return null;
                }
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    changes.get(i2).consume();
                }
                return androidx.compose.ui.geometry.Offset.m5741boximpl(mo1431calculateMouseWheelScroll8xgXZGE);
            }
        }
        transformableKt$awaitCtrlMouseScrollOrNull$1 = new androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1(continuation);
        java.lang.Object obj2 = transformableKt$awaitCtrlMouseScrollOrNull$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$awaitCtrlMouseScrollOrNull$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) obj2;
        if (androidx.compose.ui.input.pointer.PointerEvent_androidKt.m7198isCtrlPressed5xRPYO0(pointerEvent.getKeyboardModifiers())) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0297, code lost:
    
        if (r5 != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0299, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ee, code lost:
    
        if (r11.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(r1)).booleanValue() != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029e A[EDGE_INSN: B:97:0x029e->B:96:0x029e BREAK  A[LOOP:0: B:13:0x0289->B:16:0x029b], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0266 -> B:12:0x0278). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, boolean z, kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> channel, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 transformableKt$detectZoom$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> channel2;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function12;
        boolean z2;
        float f;
        long j;
        int i2;
        int i3;
        float f2;
        float f3;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function13;
        int size;
        int i4;
        int i5;
        androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 transformableKt$detectZoom$12;
        int i6;
        float f4;
        long j2;
        int i7;
        int i8;
        java.lang.Object awaitPointerEvent;
        boolean z3;
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function14;
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent;
        float f5;
        float f6;
        float f7;
        int i9;
        int i10;
        float f8;
        float f9;
        float f10;
        int size2;
        int i11;
        int size3;
        int i12;
        int size4;
        int i13;
        if (continuation instanceof androidx.compose.foundation.gestures.TransformableKt$detectZoom$1) {
            transformableKt$detectZoom$1 = (androidx.compose.foundation.gestures.TransformableKt$detectZoom$1) continuation;
            if ((transformableKt$detectZoom$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                transformableKt$detectZoom$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                obj = transformableKt$detectZoom$1.getOutputSizeshNQ4ISI;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformableKt$detectZoom$1.getOutputMinFrameDurationlomOqCM;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long m5768getZeroF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
                    float touchSlop = awaitPointerEventScope.getViewConfiguration().getTouchSlop();
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    transformableKt$detectZoom$1.getOutputMinFrameDuration = awaitPointerEventScope2;
                    channel2 = channel;
                    transformableKt$detectZoom$1.getInputFormats = channel2;
                    function12 = function1;
                    transformableKt$detectZoom$1.getInputSizeshNQ4ISI = function12;
                    z2 = z;
                    transformableKt$detectZoom$1.getOutputStallDuration = z2;
                    transformableKt$detectZoom$1.getHighSpeedVideoFpsRanges = 0.0f;
                    transformableKt$detectZoom$1.getHighSpeedVideoSizes = 1.0f;
                    transformableKt$detectZoom$1.getOutputFormats = m5768getZeroF1C5BW0;
                    transformableKt$detectZoom$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    transformableKt$detectZoom$1.getHighSpeedVideoFpsRangesFor = touchSlop;
                    transformableKt$detectZoom$1.Camera2StreamConfigurationMap = 0;
                    transformableKt$detectZoom$1.getOutputMinFrameDurationlomOqCM = 1;
                    if (androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, transformableKt$detectZoom$1, 2, null) != coroutine_suspended) {
                        f = touchSlop;
                        j = m5768getZeroF1C5BW0;
                        i2 = 0;
                        i3 = 0;
                        f2 = 1.0f;
                        f3 = 0.0f;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i14 = transformableKt$detectZoom$1.getHighSpeedVideoSizesFor;
                        i9 = transformableKt$detectZoom$1.Camera2StreamConfigurationMap;
                        f7 = transformableKt$detectZoom$1.getHighSpeedVideoFpsRangesFor;
                        i10 = transformableKt$detectZoom$1.getHighResolutionOutputSizeshNQ4ISI;
                        j2 = transformableKt$detectZoom$1.getOutputFormats;
                        float f11 = transformableKt$detectZoom$1.getHighSpeedVideoSizes;
                        float f12 = transformableKt$detectZoom$1.getHighSpeedVideoFpsRanges;
                        boolean z4 = transformableKt$detectZoom$1.getOutputStallDuration;
                        pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) transformableKt$detectZoom$1.getOutputStallDurationlomOqCM;
                        function14 = (kotlin.jvm.functions.Function1) transformableKt$detectZoom$1.getInputSizeshNQ4ISI;
                        kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> channel3 = (kotlinx.coroutines.channels.Channel) transformableKt$detectZoom$1.getInputFormats;
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) transformableKt$detectZoom$1.getOutputMinFrameDuration;
                        kotlin.ResultKt.throwOnFailure(obj);
                        z3 = z4;
                        f6 = f12;
                        f5 = f11;
                        i8 = i14;
                        awaitPointerEvent = obj;
                        channel2 = channel3;
                        awaitPointerEventScope2 = awaitPointerEventScope4;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes.size();
                        androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 transformableKt$detectZoom$13 = transformableKt$detectZoom$1;
                        i12 = 0;
                        while (true) {
                            if (i12 >= size3) {
                                break;
                            }
                            if (changes.get(i12).isConsumed()) {
                                break;
                            }
                            i12++;
                        }
                        boolean z5 = false;
                        if (i8 == 0 && !z5) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                            size4 = changes2.size();
                            for (i13 = 0; i13 < size4; i13++) {
                                if (changes2.get(i13).getPressed()) {
                                    transformableKt$detectZoom$1 = transformableKt$detectZoom$13;
                                    i2 = i9;
                                    f = f7;
                                    i3 = i10;
                                    j = j2;
                                    f2 = f5;
                                    f3 = f6;
                                    function12 = function14;
                                    z2 = z3;
                                }
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    i2 = transformableKt$detectZoom$1.Camera2StreamConfigurationMap;
                    f = transformableKt$detectZoom$1.getHighSpeedVideoFpsRangesFor;
                    i3 = transformableKt$detectZoom$1.getHighResolutionOutputSizeshNQ4ISI;
                    j = transformableKt$detectZoom$1.getOutputFormats;
                    f2 = transformableKt$detectZoom$1.getHighSpeedVideoSizes;
                    f3 = transformableKt$detectZoom$1.getHighSpeedVideoFpsRanges;
                    boolean z6 = transformableKt$detectZoom$1.getOutputStallDuration;
                    function13 = (kotlin.jvm.functions.Function1) transformableKt$detectZoom$1.getInputSizeshNQ4ISI;
                    channel2 = (kotlinx.coroutines.channels.Channel) transformableKt$detectZoom$1.getInputFormats;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) transformableKt$detectZoom$1.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z2 = z6;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes3 = pointerEvent2.getChanges();
                    size = changes3.size();
                    int i15 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i5 = 0;
                            break;
                        }
                        if (changes3.get(i4).isConsumed()) {
                            i5 = 1;
                            break;
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                        float calculateZoom = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateZoom(pointerEvent2);
                        float calculateRotation = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateRotation(pointerEvent2);
                        transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                        i6 = i5;
                        long calculatePan = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculatePan(pointerEvent2);
                        if (i3 == 0) {
                            f2 *= calculateZoom;
                            f3 += calculateRotation;
                            j = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(j, calculatePan);
                            int i16 = i3;
                            float calculateCentroidSize = androidx.compose.foundation.gestures.TransformGestureDetectorKt.calculateCentroidSize(pointerEvent2, false);
                            float abs = java.lang.Math.abs(1.0f - f2);
                            float abs2 = java.lang.Math.abs(((3.1415927f * f3) * calculateCentroidSize) / 180.0f);
                            float m5750getDistanceimpl = androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(j);
                            if (abs * calculateCentroidSize > f || abs2 > f || (m5750getDistanceimpl > f && function13.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(calculatePan)).booleanValue())) {
                                i15 = (!z2 || abs2 >= f) ? 0 : 1;
                                channel2.mo9266trySendJP2dKIU(androidx.compose.foundation.gestures.TransformEvent.TransformStarted.INSTANCE);
                                f8 = f3;
                                i3 = 1;
                                float f13 = f2;
                                j2 = j;
                                i7 = i15;
                                if (i3 != 0) {
                                    if (i7 != 0) {
                                        f10 = 0.0f;
                                        f9 = 0.0f;
                                    } else {
                                        f9 = calculateRotation;
                                        f10 = 0.0f;
                                    }
                                    if (f9 == f10 && calculateZoom == 1.0f) {
                                        kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function15 = function13;
                                        if (androidx.compose.ui.geometry.Offset.m5749equalsimpl0(calculatePan, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
                                            function13 = function15;
                                        } else {
                                            function13 = function15;
                                        }
                                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes4 = pointerEvent2.getChanges();
                                        size2 = changes4.size();
                                        for (i11 = 0; i11 < size2; i11++) {
                                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes4.get(i11);
                                            if (androidx.compose.ui.input.pointer.PointerEventKt.positionChanged(pointerInputChange)) {
                                                pointerInputChange.consume();
                                            }
                                        }
                                    }
                                    channel2.mo9266trySendJP2dKIU(new androidx.compose.foundation.gestures.TransformEvent.TransformDelta(calculateZoom, calculatePan, f9, null));
                                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes42 = pointerEvent2.getChanges();
                                    size2 = changes42.size();
                                    while (i11 < size2) {
                                    }
                                }
                                f4 = f13;
                                f3 = f8;
                            } else {
                                i3 = i16;
                            }
                        }
                        f8 = f3;
                        float f132 = f2;
                        j2 = j;
                        i7 = i15;
                        if (i3 != 0) {
                        }
                        f4 = f132;
                        f3 = f8;
                    } else {
                        transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                        i6 = i5;
                        kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel2.mo9266trySendJP2dKIU(androidx.compose.foundation.gestures.TransformEvent.TransformStopped.INSTANCE));
                        f4 = f2;
                        j2 = j;
                        i7 = i15;
                    }
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                    androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 transformableKt$detectZoom$14 = transformableKt$detectZoom$12;
                    transformableKt$detectZoom$14.getOutputMinFrameDuration = awaitPointerEventScope3;
                    transformableKt$detectZoom$14.getInputFormats = channel2;
                    transformableKt$detectZoom$14.getInputSizeshNQ4ISI = function13;
                    transformableKt$detectZoom$14.getOutputStallDurationlomOqCM = pointerEvent2;
                    transformableKt$detectZoom$14.getOutputStallDuration = z2;
                    transformableKt$detectZoom$14.getHighSpeedVideoFpsRanges = f3;
                    transformableKt$detectZoom$14.getHighSpeedVideoSizes = f4;
                    transformableKt$detectZoom$14.getOutputFormats = j2;
                    transformableKt$detectZoom$14.getHighResolutionOutputSizeshNQ4ISI = i3;
                    transformableKt$detectZoom$14.getHighSpeedVideoFpsRangesFor = f;
                    transformableKt$detectZoom$14.Camera2StreamConfigurationMap = i7;
                    i8 = i6;
                    transformableKt$detectZoom$14.getHighSpeedVideoSizesFor = i8;
                    transformableKt$detectZoom$14.getOutputMinFrameDurationlomOqCM = 3;
                    awaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass, transformableKt$detectZoom$14);
                    if (awaitPointerEvent != coroutine_suspended) {
                        z3 = z2;
                        function14 = function13;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        pointerEvent = pointerEvent2;
                        float f14 = f3;
                        f5 = f4;
                        transformableKt$detectZoom$1 = transformableKt$detectZoom$14;
                        f6 = f14;
                        int i17 = i3;
                        f7 = f;
                        i9 = i7;
                        i10 = i17;
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes5 = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent).getChanges();
                        size3 = changes5.size();
                        androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 transformableKt$detectZoom$132 = transformableKt$detectZoom$1;
                        i12 = 0;
                        while (true) {
                            if (i12 >= size3) {
                            }
                            i12++;
                        }
                        boolean z52 = false;
                        if (i8 == 0) {
                            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = pointerEvent.getChanges();
                            size4 = changes22.size();
                            while (i13 < size4) {
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                i2 = transformableKt$detectZoom$1.Camera2StreamConfigurationMap;
                f = transformableKt$detectZoom$1.getHighSpeedVideoFpsRangesFor;
                i3 = transformableKt$detectZoom$1.getHighResolutionOutputSizeshNQ4ISI;
                j = transformableKt$detectZoom$1.getOutputFormats;
                f2 = transformableKt$detectZoom$1.getHighSpeedVideoSizes;
                f3 = transformableKt$detectZoom$1.getHighSpeedVideoFpsRanges;
                boolean z7 = transformableKt$detectZoom$1.getOutputStallDuration;
                kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function16 = (kotlin.jvm.functions.Function1) transformableKt$detectZoom$1.getInputSizeshNQ4ISI;
                channel2 = (kotlinx.coroutines.channels.Channel) transformableKt$detectZoom$1.getInputFormats;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) transformableKt$detectZoom$1.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                z2 = z7;
                function12 = function16;
                awaitPointerEventScope2 = awaitPointerEventScope5;
                transformableKt$detectZoom$1.getOutputMinFrameDuration = awaitPointerEventScope2;
                transformableKt$detectZoom$1.getInputFormats = channel2;
                transformableKt$detectZoom$1.getInputSizeshNQ4ISI = function12;
                transformableKt$detectZoom$1.getOutputStallDurationlomOqCM = null;
                transformableKt$detectZoom$1.getOutputStallDuration = z2;
                transformableKt$detectZoom$1.getHighSpeedVideoFpsRanges = f3;
                transformableKt$detectZoom$1.getHighSpeedVideoSizes = f2;
                transformableKt$detectZoom$1.getOutputFormats = j;
                transformableKt$detectZoom$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                transformableKt$detectZoom$1.getHighSpeedVideoFpsRangesFor = f;
                transformableKt$detectZoom$1.Camera2StreamConfigurationMap = i2;
                transformableKt$detectZoom$1.getOutputMinFrameDurationlomOqCM = 2;
                obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$1, 1, null);
                if (obj != coroutine_suspended) {
                    kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> function17 = function12;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    function13 = function17;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent22 = (androidx.compose.ui.input.pointer.PointerEvent) obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes32 = pointerEvent22.getChanges();
                    size = changes32.size();
                    int i152 = i2;
                    i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                        }
                        i4++;
                    }
                    if (i5 != 0) {
                    }
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
                    androidx.compose.foundation.gestures.TransformableKt$detectZoom$1 transformableKt$detectZoom$142 = transformableKt$detectZoom$12;
                    transformableKt$detectZoom$142.getOutputMinFrameDuration = awaitPointerEventScope3;
                    transformableKt$detectZoom$142.getInputFormats = channel2;
                    transformableKt$detectZoom$142.getInputSizeshNQ4ISI = function13;
                    transformableKt$detectZoom$142.getOutputStallDurationlomOqCM = pointerEvent22;
                    transformableKt$detectZoom$142.getOutputStallDuration = z2;
                    transformableKt$detectZoom$142.getHighSpeedVideoFpsRanges = f3;
                    transformableKt$detectZoom$142.getHighSpeedVideoSizes = f4;
                    transformableKt$detectZoom$142.getOutputFormats = j2;
                    transformableKt$detectZoom$142.getHighResolutionOutputSizeshNQ4ISI = i3;
                    transformableKt$detectZoom$142.getHighSpeedVideoFpsRangesFor = f;
                    transformableKt$detectZoom$142.Camera2StreamConfigurationMap = i7;
                    i8 = i6;
                    transformableKt$detectZoom$142.getHighSpeedVideoSizesFor = i8;
                    transformableKt$detectZoom$142.getOutputMinFrameDurationlomOqCM = 3;
                    awaitPointerEvent = awaitPointerEventScope3.awaitPointerEvent(pointerEventPass2, transformableKt$detectZoom$142);
                    if (awaitPointerEvent != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        transformableKt$detectZoom$1 = new androidx.compose.foundation.gestures.TransformableKt$detectZoom$1(continuation);
        obj = transformableKt$detectZoom$1.getOutputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformableKt$detectZoom$1.getOutputMinFrameDurationlomOqCM;
        if (i != 0) {
        }
        transformableKt$detectZoom$1.getOutputMinFrameDuration = awaitPointerEventScope2;
        transformableKt$detectZoom$1.getInputFormats = channel2;
        transformableKt$detectZoom$1.getInputSizeshNQ4ISI = function12;
        transformableKt$detectZoom$1.getOutputStallDurationlomOqCM = null;
        transformableKt$detectZoom$1.getOutputStallDuration = z2;
        transformableKt$detectZoom$1.getHighSpeedVideoFpsRanges = f3;
        transformableKt$detectZoom$1.getHighSpeedVideoSizes = f2;
        transformableKt$detectZoom$1.getOutputFormats = j;
        transformableKt$detectZoom$1.getHighResolutionOutputSizeshNQ4ISI = i3;
        transformableKt$detectZoom$1.getHighSpeedVideoFpsRangesFor = f;
        transformableKt$detectZoom$1.Camera2StreamConfigurationMap = i2;
        transformableKt$detectZoom$1.getOutputMinFrameDurationlomOqCM = 2;
        obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, transformableKt$detectZoom$1, 1, null);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlinx.coroutines.channels.Channel<androidx.compose.foundation.gestures.TransformEvent> channel, androidx.compose.foundation.gestures.ScrollConfig scrollConfig, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new androidx.compose.foundation.gestures.TransformableKt$detectZoomByCtrlMouseScroll$2(continuation.getGetHighSpeedVideoFpsRangesFor(), scrollConfig, channel, null), continuation);
        return awaitPointerEventScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : kotlin.Unit.INSTANCE;
    }
}
