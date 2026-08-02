package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\"\u0010\r\u001a\u00020\u0007*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0005H\u0002¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0017X\u008a\u008e\u0002"}, d2 = {"ExposedDropdownMenuBox", "", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "expandable", "Lkotlin/Function0;", "menuLabel", "", "updateHeight", "windowBounds", "Landroidx/compose/ui/unit/IntRect;", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "verticalMarginInPx", "", "onHeightUpdate", "material", "width", "menuHeight"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExposedDropdownMenu_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExposedDropdownMenuBox(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.material.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1337700255);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1337700255, i3, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:94)");
                }
                final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                final androidx.compose.material.WindowBoundsCalculator platformWindowBoundsCalculator = androidx.compose.material.ExposedDropdownMenu_android.platformWindowBoundsCalculator(startRestartGroup, 0);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableIntState mutableIntState2 = (androidx.compose.runtime.MutableIntState) rememberedValue2;
                int mo1412roundToPx0680j_4 = density.mo1412roundToPx0680j_4(androidx.compose.material.MenuKt.getMenuVerticalMargin());
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new androidx.compose.ui.node.Ref();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.ui.node.Ref ref = (androidx.compose.ui.node.Ref) rememberedValue3;
                int intValue = mutableIntState2.getIntValue();
                int intValue2 = mutableIntState.getIntValue();
                boolean changed = startRestartGroup.changed(density);
                boolean changed2 = startRestartGroup.changed(intValue);
                boolean changed3 = startRestartGroup.changed(intValue2);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changed3 | changed | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new androidx.compose.material.ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public final androidx.compose.ui.Modifier exposedDropdownSize(androidx.compose.ui.Modifier modifier3, boolean z2) {
                            int intValue3;
                            int intValue4;
                            androidx.compose.ui.unit.Density density2 = androidx.compose.ui.unit.Density.this;
                            androidx.compose.runtime.MutableIntState mutableIntState3 = mutableIntState2;
                            androidx.compose.runtime.MutableIntState mutableIntState4 = mutableIntState;
                            intValue3 = mutableIntState3.getIntValue();
                            androidx.compose.ui.Modifier m1728heightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(modifier3, 0.0f, density2.mo1415toDpu2uoSUM(intValue3), 1, null);
                            if (!z2) {
                                return m1728heightInVpY3zN4$default;
                            }
                            intValue4 = mutableIntState4.getIntValue();
                            return androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(m1728heightInVpY3zN4$default, density2.mo1415toDpu2uoSUM(intValue4));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 = (androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) rememberedValue4;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new androidx.compose.ui.focus.FocusRequester();
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue5;
                boolean changedInstance = startRestartGroup.changedInstance(ref);
                boolean changedInstance2 = startRestartGroup.changedInstance(platformWindowBoundsCalculator);
                boolean changed4 = startRestartGroup.changed(mo1412roundToPx0680j_4);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (((changedInstance | changedInstance2) || changed4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i4 = mo1412roundToPx0680j_4;
                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material.ExposedDropdownMenu_androidKt.$r8$lambda$XIVQW7IirIeQnZMBdrOV0cuKIDE(androidx.compose.ui.node.Ref.this, platformWindowBoundsCalculator, i4, mutableIntState, mutableIntState2, (androidx.compose.ui.layout.LayoutCoordinates) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                } else {
                    i4 = mo1412roundToPx0680j_4;
                }
                androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(modifier2, (kotlin.jvm.functions.Function1) rememberedValue6);
                boolean z2 = (i3 & 112) == 32;
                int i6 = i3 & 14;
                androidx.compose.ui.Modifier modifier3 = modifier2;
                boolean z3 = i6 == 4;
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if ((z2 | z3) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material.ExposedDropdownMenu_androidKt.$r8$lambda$tYqmhURPftCjwp5zQBh2jwMISmc(kotlin.jvm.functions.Function1.this, z);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
                final java.lang.String m2763getString4foXLRw = androidx.compose.material.Strings_androidKt.m2763getString4foXLRw(androidx.compose.material.Strings.INSTANCE.m2758getExposedDropdownMenuUdPEhr4(), startRestartGroup, 6);
                androidx.compose.ui.Modifier focusRequester2 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(onGloballyPositioned, function0, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1

                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1", f = "ExposedDropdownMenu.kt", i = {0}, l = {450, 451}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"}, v = 1)
                    /* renamed from: androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        int Camera2StreamConfigurationMap;
                        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
                        private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

                        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
                        
                            if (r11 == r0) goto L20;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
                        
                            return r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
                        
                            if (androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r1, false, androidx.compose.ui.input.pointer.PointerEventPass.Initial, r10, 1, null) != r0) goto L12;
                         */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.Camera2StreamConfigurationMap;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizes;
                                this.getHighSpeedVideoSizes = awaitPointerEventScope;
                                this.Camera2StreamConfigurationMap = 1;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    if (((androidx.compose.ui.input.pointer.PointerInputChange) obj) != null) {
                                        this.getHighSpeedVideoFpsRanges.invoke();
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                                awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            this.getHighSpeedVideoSizes = null;
                            this.Camera2StreamConfigurationMap = 2;
                            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
                            anonymousClass1.getHighSpeedVideoSizes = obj;
                            return anonymousClass1;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1.AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.getHighSpeedVideoFpsRanges = function0;
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.material.ExposedDropdownMenu_androidKt$expandable$1.AnonymousClass1(function0, null), continuation);
                        return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
                    }
                }), false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.ExposedDropdownMenu_androidKt.$r8$lambda$Hb_YomFYKbil77cMwfcErXws4MI(m2763getString4foXLRw, function0, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                }, 1, null), focusRequester);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, focusRequester2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                function3.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1, startRestartGroup, java.lang.Integer.valueOf((i3 >> 6) & 112));
                startRestartGroup.endNode();
                boolean z4 = i6 == 4;
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material.ExposedDropdownMenu_androidKt.m2625$r8$lambda$79jeKXxLuHWWxIrnDXI3QVyonk(z, focusRequester);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue8, startRestartGroup, 0);
                boolean changedInstance3 = startRestartGroup.changedInstance(platformWindowBoundsCalculator);
                boolean changedInstance4 = startRestartGroup.changedInstance(ref);
                boolean changed5 = startRestartGroup.changed(i4);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | changedInstance4 | changed5) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material.ExposedDropdownMenu_androidKt.$r8$lambda$rg3hfKaQe_sq19wNTll5Az3ACtw(androidx.compose.material.WindowBoundsCalculator.this, ref, i4, mutableIntState2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                androidx.compose.material.ExposedDropdownMenu_android.OnPlatformWindowBoundsChange((kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material.ExposedDropdownMenu_androidKt.$r8$lambda$8dr8uDTFuzGKo5faKLOZNq5i_Kk(z, function1, modifier4, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        androidx.compose.ui.geometry.Rect boundsInWindow;
        androidx.compose.ui.geometry.Rect boundsInWindow2;
        if (layoutCoordinates == null) {
            return;
        }
        boundsInWindow = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow(layoutCoordinates, true);
        float top = boundsInWindow.getTop();
        float top2 = intRect.getTop();
        float bottom = intRect.getBottom() - intRect.getTop();
        boundsInWindow2 = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow(layoutCoordinates, true);
        function1.invoke(java.lang.Integer.valueOf(((int) java.lang.Math.max(top - top2, bottom - boundsInWindow2.getBottom())) - i));
    }

    /* renamed from: $r8$lambda$79j-eKXxLuHWWxIrnDXI3QVyonk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2625$r8$lambda$79jeKXxLuHWWxIrnDXI3QVyonk(boolean z, androidx.compose.ui.focus.FocusRequester focusRequester) {
        if (z) {
            androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8dr8uDTFuzGKo5faKLOZNq5i_Kk(boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ExposedDropdownMenuBox(z, function1, modifier, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9fe_f27WOn7M87Qh4Ulfja1UxwA(androidx.compose.runtime.MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Hb_YomFYKbil77cMwfcErXws4MI(java.lang.String str, final kotlin.jvm.functions.Function0 function0, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(androidx.compose.material.ExposedDropdownMenu_androidKt.$r8$lambda$pZYd5J__lwovavX2QdRr5vSB5Wg(kotlin.jvm.functions.Function0.this));
            }
        }, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XIVQW7IirIeQnZMBdrOV0cuKIDE(androidx.compose.ui.node.Ref ref, androidx.compose.material.WindowBoundsCalculator windowBoundsCalculator, int i, androidx.compose.runtime.MutableIntState mutableIntState, final androidx.compose.runtime.MutableIntState mutableIntState2, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        mutableIntState.setIntValue((int) (layoutCoordinates.mo7361getSizeYbymL2g() >> 32));
        ref.setValue(layoutCoordinates);
        getHighSpeedVideoSizes(windowBoundsCalculator.getVisibleWindowBounds(), (androidx.compose.ui.layout.LayoutCoordinates) ref.getValue(), i, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.ExposedDropdownMenu_androidKt.$r8$lambda$9fe_f27WOn7M87Qh4Ulfja1UxwA(androidx.compose.runtime.MutableIntState.this, ((java.lang.Integer) obj).intValue());
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hVVJIMwOdEC5ksOVXxWbLoXkYoc(androidx.compose.runtime.MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$pZYd5J__lwovavX2QdRr5vSB5Wg(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rg3hfKaQe_sq19wNTll5Az3ACtw(androidx.compose.material.WindowBoundsCalculator windowBoundsCalculator, androidx.compose.ui.node.Ref ref, int i, final androidx.compose.runtime.MutableIntState mutableIntState) {
        getHighSpeedVideoSizes(windowBoundsCalculator.getVisibleWindowBounds(), (androidx.compose.ui.layout.LayoutCoordinates) ref.getValue(), i, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.ExposedDropdownMenu_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.ExposedDropdownMenu_androidKt.$r8$lambda$hVVJIMwOdEC5ksOVXxWbLoXkYoc(androidx.compose.runtime.MutableIntState.this, ((java.lang.Integer) obj).intValue());
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tYqmhURPftCjwp5zQBh2jwMISmc(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(!z));
        return kotlin.Unit.INSTANCE;
    }
}
