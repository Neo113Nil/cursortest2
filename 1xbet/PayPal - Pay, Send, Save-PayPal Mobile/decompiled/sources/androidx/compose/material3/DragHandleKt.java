package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a0\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0002¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u008e\u0002"}, d2 = {"VerticalDragHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "sizes", "Landroidx/compose/material3/DragHandleSizes;", "colors", "Landroidx/compose/material3/DragHandleColors;", "shapes", "Landroidx/compose/material3/DragHandleShapes;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DragHandleSizes;Landroidx/compose/material3/DragHandleColors;Landroidx/compose/material3/DragHandleShapes;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "pressable", "onPressed", "Lkotlin/Function0;", "onReleasedOrCancelled", "material3", "isDragged", "", "isPressed"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragHandleKt {
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalDragHandle(androidx.compose.ui.Modifier modifier, androidx.compose.material3.DragHandleSizes dragHandleSizes, androidx.compose.material3.DragHandleColors dragHandleColors, androidx.compose.material3.DragHandleShapes dragHandleShapes, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.material3.DragHandleSizes dragHandleSizes2;
        final androidx.compose.material3.DragHandleColors dragHandleColors2;
        final androidx.compose.material3.DragHandleShapes dragHandleShapes2;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.material3.DragHandleSizes dragHandleSizes3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1693656835);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                dragHandleSizes2 = dragHandleSizes;
                if (startRestartGroup.changed(dragHandleSizes2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                dragHandleSizes2 = dragHandleSizes;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            dragHandleSizes2 = dragHandleSizes;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                dragHandleColors2 = dragHandleColors;
                if (startRestartGroup.changed(dragHandleColors2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                dragHandleColors2 = dragHandleColors;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            dragHandleColors2 = dragHandleColors;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                dragHandleShapes2 = dragHandleShapes;
                if (startRestartGroup.changed(dragHandleShapes2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                dragHandleShapes2 = dragHandleShapes;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            dragHandleShapes2 = dragHandleShapes;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            mutableInteractionSource2 = mutableInteractionSource;
            i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
            boolean z = true;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                dragHandleSizes3 = dragHandleSizes2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                        dragHandleSizes3 = androidx.compose.material3.VerticalDragHandleDefaults.INSTANCE.sizes();
                        i3 &= -113;
                    } else {
                        dragHandleSizes3 = dragHandleSizes2;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        dragHandleColors2 = androidx.compose.material3.VerticalDragHandleDefaults.INSTANCE.colors(startRestartGroup, 6);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        dragHandleShapes2 = androidx.compose.material3.VerticalDragHandleDefaults.INSTANCE.shapes(startRestartGroup, 6);
                    }
                    if (i8 != 0) {
                        mutableInteractionSource2 = null;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = modifier2;
                    dragHandleSizes3 = dragHandleSizes2;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1693656835, i3, -1, "androidx.compose.material3.VerticalDragHandle (DragHandle.kt:78)");
                }
                if (mutableInteractionSource2 == null) {
                    startRestartGroup.startReplaceGroup(-1544610024);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    mutableInteractionSource3 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-188374113);
                    startRestartGroup.endReplaceGroup();
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                final androidx.compose.runtime.State<java.lang.Boolean> collectIsDraggedAsState = androidx.compose.foundation.interaction.DragInteractionKt.collectIsDraggedAsState(mutableInteractionSource4, startRestartGroup, 0);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                androidx.compose.ui.Modifier hoverable$default = androidx.compose.foundation.HoverableKt.hoverable$default(androidx.compose.material3.InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion), mutableInteractionSource3, false, 2, null);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DragHandleKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material3.DragHandleKt.m3251$r8$lambda$e7naWWZcuE5e_Xe4po892quANY(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DragHandleKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material3.DragHandleKt.$r8$lambda$_sf0tMQ42ZdVrBuiJxBRM8K_V4I(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                androidx.compose.ui.Modifier pointerInput = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(hoverable$default, mutableInteractionSource3, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material3.DragHandleKt$pressable$1

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.DragHandleKt$pressable$1$1", f = "DragHandle.kt", i = {0}, l = {341, 343}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
                    /* renamed from: androidx.compose.material3.DragHandleKt$pressable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
                        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
                        int getHighSpeedVideoSizes;

                        /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
                        
                            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r1, androidx.compose.ui.input.pointer.PointerEventPass.Initial, r10) == r0) goto L17;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
                        
                            return r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
                        
                            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r1, false, androidx.compose.ui.input.pointer.PointerEventPass.Initial, r10, 1, null) != r0) goto L12;
                         */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getHighSpeedVideoSizes;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRanges;
                                this.getHighSpeedVideoFpsRanges = awaitPointerEventScope;
                                this.getHighSpeedVideoSizes = 1;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    this.getHighResolutionOutputSizeshNQ4ISI.invoke();
                                    return kotlin.Unit.INSTANCE;
                                }
                                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            this.getHighSpeedVideoFpsRangesFor.invoke();
                            this.getHighSpeedVideoFpsRanges = null;
                            this.getHighSpeedVideoSizes = 2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((androidx.compose.material3.DragHandleKt$pressable$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            androidx.compose.material3.DragHandleKt$pressable$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.DragHandleKt$pressable$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
                            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
                            return anonymousClass1;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super androidx.compose.material3.DragHandleKt$pressable$1.AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.getHighSpeedVideoFpsRangesFor = function0;
                            this.getHighResolutionOutputSizeshNQ4ISI = function02;
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.material3.DragHandleKt$pressable$1.AnonymousClass1(function0, function02, null), continuation);
                        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
                    }
                });
                boolean changed = startRestartGroup.changed(collectIsDraggedAsState);
                boolean z2 = (((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(dragHandleShapes2)) || (i3 & 3072) == 2048;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changed | z2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DragHandleKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.DragHandleKt.$r8$lambda$NX3pD3RufTkHiWvo00t10cZb2TA(androidx.compose.material3.DragHandleShapes.this, collectIsDraggedAsState, mutableState, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(pointerInput, (kotlin.jvm.functions.Function1) rememberedValue5);
                boolean changed2 = startRestartGroup.changed(collectIsDraggedAsState);
                boolean z3 = (((i3 & 112) ^ 48) > 32 && startRestartGroup.changed(dragHandleSizes3)) || (i3 & 48) == 32;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if ((changed2 | z3) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.DragHandleKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return androidx.compose.material3.DragHandleKt.m3252$r8$lambda$iRx8rhm3lHcwl1EaI6vKU568tA(androidx.compose.material3.DragHandleSizes.this, collectIsDraggedAsState, mutableState, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.ui.Modifier layout = androidx.compose.ui.layout.LayoutModifierKt.layout(graphicsLayer, (kotlin.jvm.functions.Function3) rememberedValue6);
                boolean changed3 = startRestartGroup.changed(collectIsDraggedAsState);
                if ((((i3 & 896) ^ 384) <= 256 || !startRestartGroup.changed(dragHandleColors2)) && (i3 & 384) != 256) {
                    z = false;
                }
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if ((changed3 | z) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DragHandleKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.DragHandleKt.$r8$lambda$2zIoHnSE8ByMbNV1R66NvTKYSsI(androidx.compose.material3.DragHandleColors.this, collectIsDraggedAsState, mutableState, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.foundation.IndicationKt.indication(androidx.compose.ui.draw.DrawModifierKt.drawBehind(layout, (kotlin.jvm.functions.Function1) rememberedValue7), mutableInteractionSource4, androidx.compose.material3.RippleKt.m3643rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            final androidx.compose.material3.DragHandleColors dragHandleColors3 = dragHandleColors2;
            final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final androidx.compose.material3.DragHandleSizes dragHandleSizes4 = dragHandleSizes3;
                final androidx.compose.material3.DragHandleShapes dragHandleShapes3 = dragHandleShapes2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DragHandleKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.DragHandleKt.m3253$r8$lambda$sKOyE053W405VzZXmNVRm4ayME(androidx.compose.ui.Modifier.this, dragHandleSizes4, dragHandleColors3, dragHandleShapes3, mutableInteractionSource5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        mutableInteractionSource2 = mutableInteractionSource;
        boolean z4 = true;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        final androidx.compose.material3.DragHandleColors dragHandleColors32 = dragHandleColors2;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$2zIoHnSE8ByMbNV1R66NvTKYSsI(androidx.compose.material3.DragHandleColors dragHandleColors, androidx.compose.runtime.State state, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        long color;
        if (((java.lang.Boolean) state.getValue()).booleanValue()) {
            color = dragHandleColors.getDraggedColor();
        } else if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            color = dragHandleColors.getPressedColor();
        } else {
            color = dragHandleColors.getColor();
        }
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$NX3pD3RufTkHiWvo00t10cZb2TA(androidx.compose.material3.DragHandleShapes dragHandleShapes, androidx.compose.runtime.State state, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        androidx.compose.ui.graphics.Shape shape;
        if (((java.lang.Boolean) state.getValue()).booleanValue()) {
            shape = dragHandleShapes.getDraggedShape();
        } else if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            shape = dragHandleShapes.getPressedShape();
        } else {
            shape = dragHandleShapes.getShape();
        }
        graphicsLayerScope.setShape(shape);
        graphicsLayerScope.setClip(true);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YWu42g61koXjgUU4yNeIFwIFmqU(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_sf0tMQ42ZdVrBuiJxBRM8K_V4I(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e7n-aWWZcuE5e_Xe4po892quANY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3251$r8$lambda$e7naWWZcuE5e_Xe4po892quANY(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$iRx8rhm3lHcwl1EaI-6vKU568tA, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult m3252$r8$lambda$iRx8rhm3lHcwl1EaI6vKU568tA(androidx.compose.material3.DragHandleSizes dragHandleSizes, androidx.compose.runtime.State state, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        long size;
        if (((java.lang.Boolean) state.getValue()).booleanValue()) {
            size = dragHandleSizes.getDraggedSize();
        } else if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            size = dragHandleSizes.getPressedSize();
        } else {
            size = dragHandleSizes.getSize();
        }
        long j = measureScope.mo1419toSizeXkaWNTQ(size);
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32))), java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.DragHandleKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.DragHandleKt.$r8$lambda$YWu42g61koXjgUU4yNeIFwIFmqU(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* renamed from: $r8$lambda$sKOyE053W405VzZ-XmNVRm4ayME, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m3253$r8$lambda$sKOyE053W405VzZXmNVRm4ayME(androidx.compose.ui.Modifier modifier, androidx.compose.material3.DragHandleSizes dragHandleSizes, androidx.compose.material3.DragHandleColors dragHandleColors, androidx.compose.material3.DragHandleShapes dragHandleShapes, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        VerticalDragHandle(modifier, dragHandleSizes, dragHandleColors, dragHandleShapes, mutableInteractionSource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
