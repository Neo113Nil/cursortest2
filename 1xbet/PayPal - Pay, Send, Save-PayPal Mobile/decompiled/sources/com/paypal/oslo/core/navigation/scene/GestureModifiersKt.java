package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "consumeUpwardDrags", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GestureModifiersKt {
    public static final androidx.compose.ui.Modifier consumeUpwardDrags(androidx.compose.ui.Modifier modifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(modifier, kotlin.Unit.INSTANCE, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: com.paypal.oslo.core.navigation.scene.GestureModifiersKt$consumeUpwardDrags$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.scene.GestureModifiersKt$consumeUpwardDrags$1$1", f = "GestureModifiers.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {33, 39}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "isUpward", "totalDy", "prevY", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE}, nl = {34, 40}, s = {"L$0", "L$0", "L$1", "L$2", "F$0", "F$1", "I$0"}, v = 2)
            /* renamed from: com.paypal.oslo.core.navigation.scene.GestureModifiersKt$consumeUpwardDrags$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                float Camera2StreamConfigurationMap;
                float getHighResolutionOutputSizeshNQ4ISI;
                int getHighSpeedVideoFpsRanges;
                java.lang.Object getHighSpeedVideoFpsRangesFor;
                java.lang.Object getHighSpeedVideoSizes;
                private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
                int getOutputFormats;

                /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
                
                    if (r7 == r8) goto L47;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x010b, code lost:
                
                    return r8;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x004f, code lost:
                
                    if (r2 != r8) goto L12;
                 */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0108  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0078 -> B:6:0x007c). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    java.lang.Object awaitFirstDown$default;
                    float intBitsToFloat;
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
                    java.lang.Boolean bool;
                    int i;
                    float f;
                    java.lang.Object obj2;
                    int i2;
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = this.getOutputFormats;
                    int i4 = 2;
                    androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass = null;
                    int i5 = 1;
                    if (i3 == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.getHighSpeedVideoSizesFor = awaitPointerEventScope;
                        this.getOutputFormats = 1;
                        awaitFirstDown$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                    } else if (i3 == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        awaitFirstDown$default = obj;
                    } else {
                        if (i3 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i = this.getHighSpeedVideoFpsRanges;
                        intBitsToFloat = this.Camera2StreamConfigurationMap;
                        f = this.getHighResolutionOutputSizeshNQ4ISI;
                        bool = (java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor;
                        pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.Object awaitPointerEvent$default = obj;
                        java.util.Iterator<T> it = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent$default).getChanges().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(((androidx.compose.ui.input.pointer.PointerInputChange) obj2).getId(), pointerInputChange.getId())) {
                                break;
                            }
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj2;
                        if (pointerInputChange2 == null || !pointerInputChange2.getPressed()) {
                            i2 = 1;
                            i = 0;
                        } else {
                            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (pointerInputChange2.getPosition() & 4294967295L)) - intBitsToFloat;
                            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (pointerInputChange2.getPosition() & 4294967295L));
                            f += intBitsToFloat2;
                            if (bool == null && java.lang.Math.abs(f) > awaitPointerEventScope.getViewConfiguration().getTouchSlop()) {
                                bool = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(f < 0.0f);
                            }
                            i2 = 1;
                            if (kotlin.jvm.internal.Intrinsics.areEqual(bool, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)) && intBitsToFloat2 < 0.0f && !pointerInputChange2.isConsumed()) {
                                pointerInputChange2.consume();
                            }
                        }
                        i5 = i2;
                        i4 = 2;
                        pointerEventPass = null;
                        if (i == 0) {
                            this.getHighSpeedVideoSizesFor = awaitPointerEventScope;
                            this.getHighSpeedVideoSizes = pointerInputChange;
                            this.getHighSpeedVideoFpsRangesFor = bool;
                            this.getHighResolutionOutputSizeshNQ4ISI = f;
                            this.Camera2StreamConfigurationMap = intBitsToFloat;
                            this.getHighSpeedVideoFpsRanges = i;
                            this.getOutputFormats = i4;
                            awaitPointerEvent$default = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, pointerEventPass, this, i5, pointerEventPass);
                        } else {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown$default;
                    intBitsToFloat = java.lang.Float.intBitsToFloat((int) (pointerInputChange3.getPosition() & 4294967295L));
                    pointerInputChange = pointerInputChange3;
                    bool = null;
                    i = 1;
                    f = 0.0f;
                    if (i == 0) {
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((com.paypal.oslo.core.navigation.scene.GestureModifiersKt$consumeUpwardDrags$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    com.paypal.oslo.core.navigation.scene.GestureModifiersKt$consumeUpwardDrags$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.core.navigation.scene.GestureModifiersKt$consumeUpwardDrags$1.AnonymousClass1(continuation);
                    anonymousClass1.getHighSpeedVideoSizesFor = obj;
                    return anonymousClass1;
                }

                AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.scene.GestureModifiersKt$consumeUpwardDrags$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new com.paypal.oslo.core.navigation.scene.GestureModifiersKt$consumeUpwardDrags$1.AnonymousClass1(null), continuation);
                return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
            }
        });
    }
}
