package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\n\u0018\u00002\u00020\u0001J#\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00058QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1;", "Landroidx/compose/material3/ExposedDropdownMenuBoxScopeImpl;", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/ExposedDropdownMenuAnchorType;", "type", "", "enabled", "menuAnchor-2Hz36ac", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "menuAnchor", "matchAnchorWidth", "exposedDropdownSize", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "getAnchorType-oYjWRB4$material3", "()Ljava/lang/String;", "anchorType", "getAlwaysFocusable$material3", "()Z", "alwaysFocusable"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 extends androidx.compose.material3.ExposedDropdownMenuBoxScopeImpl {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.compose.material3.ExposedDropdownMenuAnchorType> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getInputFormats;
    final /* synthetic */ java.lang.String getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController getOutputFormats;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getOutputMinFrameDuration;
    final /* synthetic */ java.lang.String getOutputStallDuration;

    /* JADX WARN: Multi-variable type inference failed */
    ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1(androidx.compose.ui.focus.FocusRequester focusRequester, boolean z, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, androidx.compose.runtime.MutableState<androidx.compose.material3.ExposedDropdownMenuAnchorType> mutableState2, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableIntState mutableIntState2) {
        this.getOutputMinFrameDuration = focusRequester;
        this.getHighSpeedVideoSizes = z;
        this.Camera2StreamConfigurationMap = mutableState;
        this.getInputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getOutputStallDuration = str3;
        this.getOutputFormats = softwareKeyboardController;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState2;
        this.getHighSpeedVideoSizesFor = function1;
        this.getHighSpeedVideoFpsRangesFor = mutableIntState;
        this.getInputFormats = mutableIntState2;
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    /* renamed from: menuAnchor-2Hz36ac */
    public final androidx.compose.ui.Modifier mo3279menuAnchor2Hz36ac(androidx.compose.ui.Modifier modifier, final java.lang.String str, boolean z) {
        androidx.compose.ui.Modifier.Companion semantics$default;
        androidx.compose.ui.Modifier focusRequester = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(modifier, this.getOutputMinFrameDuration);
        final androidx.compose.runtime.MutableState<androidx.compose.material3.ExposedDropdownMenuAnchorType> mutableState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.Modifier then = focusRequester.then(new androidx.compose.material3.ExposedDropdownMenuAnchorElement(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.$r8$lambda$22nUKtRHEVtNqXJvhm8bB9tgeLE(str, mutableState);
            }
        }));
        if (!z) {
            semantics$default = androidx.compose.ui.Modifier.INSTANCE;
        } else {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            final boolean z2 = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.MutableState<androidx.compose.material3.ExposedDropdownMenuAnchorType> mutableState2 = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.getHighSpeedVideoSizesFor;
            semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(androidx.compose.ui.input.key.KeyInputModifierKt.onPreviewKeyEvent(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion, r2, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {1426, 1430}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
                /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

                    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
                    
                        if (r11 == r0) goto L23;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
                    
                        return r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
                    
                        if (r11 != r0) goto L12;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
                            this.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope;
                            this.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, androidx.compose.ui.input.pointer.PointerEventPass.Initial, this, 1, null);
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                if (((androidx.compose.ui.input.pointer.PointerInputChange) obj) != null) {
                                    this.Camera2StreamConfigurationMap.invoke();
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                        if (androidx.compose.material3.ExposedDropdownMenuAnchorType.m3266equalsimpl0(this.getHighSpeedVideoSizes, androidx.compose.material3.ExposedDropdownMenuAnchorType.INSTANCE.m3272getSecondaryEditableoYjWRB4())) {
                            pointerInputChange.consume();
                        }
                        this.getHighSpeedVideoFpsRangesFor = null;
                        this.getHighResolutionOutputSizeshNQ4ISI = 2;
                        obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material3.ExposedDropdownMenuKt$expandable$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        androidx.compose.material3.ExposedDropdownMenuKt$expandable$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.ExposedDropdownMenuKt$expandable$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
                        anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
                        return anonymousClass1;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.compose.material3.ExposedDropdownMenuKt$expandable$1.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoSizes = str;
                        this.Camera2StreamConfigurationMap = function0;
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.material3.ExposedDropdownMenuKt$expandable$1.AnonymousClass1(str, r2, null), continuation);
                    return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
                }
            }), new kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$expandable$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
                    boolean Camera2StreamConfigurationMap;
                    android.view.KeyEvent m7078unboximpl = keyEvent.m7078unboximpl();
                    boolean m3291access$isClickZmokQxo = androidx.compose.material3.ExposedDropdownMenuKt.m3291access$isClickZmokQxo(m7078unboximpl);
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    if (m3291access$isClickZmokQxo) {
                        if (androidx.compose.material3.ExposedDropdownMenuAnchorType.m3266equalsimpl0(str, androidx.compose.material3.ExposedDropdownMenuAnchorType.INSTANCE.m3270getPrimaryEditableoYjWRB4())) {
                            Camera2StreamConfigurationMap = androidx.compose.material3.ExposedDropdownMenuKt.Camera2StreamConfigurationMap(m7078unboximpl);
                            if (Camera2StreamConfigurationMap) {
                                r2.invoke();
                                return bool;
                            }
                        } else {
                            r2.invoke();
                        }
                    }
                    if (androidx.compose.material3.ExposedDropdownMenuAnchorType.m3266equalsimpl0(str, androidx.compose.material3.ExposedDropdownMenuAnchorType.INSTANCE.m3270getPrimaryEditableoYjWRB4()) && z2 && (androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(m7078unboximpl), androidx.compose.ui.input.key.Key.INSTANCE.m7017getTabEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(m7078unboximpl), androidx.compose.ui.input.key.Key.INSTANCE.m6854getDirectionDownEK5gGoQ()) || androidx.compose.ui.input.key.Key.m6781equalsimpl0(androidx.compose.ui.input.key.KeyEvent_androidKt.m7089getKeyZmokQxo(m7078unboximpl), androidx.compose.ui.input.key.Key.INSTANCE.m6859getDirectionUpEK5gGoQ()))) {
                        r4.setValue(bool);
                        return bool;
                    }
                    r4.setValue(java.lang.Boolean.FALSE);
                    return java.lang.Boolean.FALSE;
                }
            }), false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.ExposedDropdownMenuKt.$r8$lambda$_vHwUHEiYpgtmc6XB06gfdP2Sw4(str, z2, r3, r4, r5, r6, r7, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                }
            }, 1, null);
        }
        return then.then(semantics$default);
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    /* renamed from: getAnchorType-oYjWRB4$material3 */
    public final java.lang.String mo3278getAnchorTypeoYjWRB4$material3() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue().getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    public final boolean getAlwaysFocusable$material3() {
        return this.Camera2StreamConfigurationMap.getValue().booleanValue();
    }

    @Override // androidx.compose.material3.ExposedDropdownMenuBoxScope
    public final androidx.compose.ui.Modifier exposedDropdownSize(androidx.compose.ui.Modifier modifier, final boolean z) {
        final androidx.compose.runtime.MutableIntState mutableIntState = this.getHighSpeedVideoFpsRangesFor;
        final androidx.compose.runtime.MutableIntState mutableIntState2 = this.getInputFormats;
        return androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.$r8$lambda$WWyOa5Qwhoi6ZZ9Oc8EWx7_xzh8(z, mutableIntState, mutableIntState2, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$22nUKtRHEVtNqXJvhm8bB9tgeLE(java.lang.String str, androidx.compose.runtime.MutableState mutableState) {
        if (androidx.compose.material3.ExposedDropdownMenuKt.m3290access$hasGreaterOrEqualPriorityThanvVDBVkM(str, ((androidx.compose.material3.ExposedDropdownMenuAnchorType) mutableState.getValue()).getGetHighResolutionOutputSizeshNQ4ISI())) {
            mutableState.setValue(androidx.compose.material3.ExposedDropdownMenuAnchorType.m3264boximpl(str));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HoGjXZP_RJzUum75_h9SFn5II2Q(androidx.compose.ui.layout.Placeable placeable, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$WWyOa5Qwhoi6ZZ9Oc8EWx7_xzh8(boolean z, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableIntState mutableIntState2, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        int intValue;
        int intValue2;
        long getHighSpeedVideoFpsRangesFor = constraints.getGetHighSpeedVideoFpsRangesFor();
        intValue = mutableIntState.getIntValue();
        int m8571constrainWidthK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8571constrainWidthK40F9xA(getHighSpeedVideoFpsRangesFor, intValue);
        long getHighSpeedVideoFpsRangesFor2 = constraints.getGetHighSpeedVideoFpsRangesFor();
        intValue2 = mutableIntState2.getIntValue();
        int m8570constrainHeightK40F9xA = androidx.compose.ui.unit.ConstraintsKt.m8570constrainHeightK40F9xA(getHighSpeedVideoFpsRangesFor2, intValue2);
        int m8556getMinWidthimpl = z ? m8571constrainWidthK40F9xA : androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        if (!z) {
            m8571constrainWidthK40F9xA = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(constraints.getGetHighSpeedVideoFpsRangesFor(), m8556getMinWidthimpl, m8571constrainWidthK40F9xA, 0, m8570constrainHeightK40F9xA, 4, null));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1.$r8$lambda$HoGjXZP_RJzUum75_h9SFn5II2Q(androidx.compose.ui.layout.Placeable.this, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y9GZBSK7RmUaMaAYxIYjjNtOBkg(androidx.compose.runtime.MutableState mutableState, java.lang.String str, kotlin.jvm.functions.Function1 function1, boolean z) {
        mutableState.setValue(androidx.compose.material3.ExposedDropdownMenuAnchorType.m3264boximpl(str));
        function1.invoke(java.lang.Boolean.valueOf(!z));
        return kotlin.Unit.INSTANCE;
    }
}
