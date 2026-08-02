package androidx.compose.material.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0000\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0002\u0010\b\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0083\b¢\u0006\u0002\u0010\u0011\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u0015\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007X\u008a\u0084\u0002"}, d2 = {"ExposedDropdownMenuPopup", "", "onDismissRequest", "Lkotlin/Function0;", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LocalPopupTestTag", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalPopupTestTag", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "SimpleStack", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material", "currentContent"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExposedDropdownMenuPopup_androidKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.String> getHighSpeedVideoFpsRanges = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.$r8$lambda$2HWhxwtDymBwNjEqrJsoRtwwp0E();
        }
    }, 1, null);

    public static final void ExposedDropdownMenuPopup(kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i3;
        androidx.compose.ui.unit.LayoutDirection layoutDirection;
        java.lang.String str;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        java.lang.Object obj;
        final java.lang.String str2;
        boolean z;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1705178815);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(popupPositionProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i4 != 0 ? null : function02;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1705178815, i5, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:80)");
            }
            android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            java.lang.String str3 = (java.lang.String) startRestartGroup.consume(getHighSpeedVideoFpsRanges);
            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i5 >> 6) & 14);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        java.util.UUID randomUUID;
                        randomUUID = java.util.UUID.randomUUID();
                        return randomUUID;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.util.UUID uuid = (java.util.UUID) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                layoutDirection = layoutDirection2;
                str = str3;
                function03 = function04;
                final androidx.compose.material.internal.PopupLayout popupLayout = new androidx.compose.material.internal.PopupLayout(function04, str3, view, density, popupPositionProvider, uuid);
                popupLayout.setContent(rememberCompositionContext, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1879981140, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.$r8$lambda$jkkaHETEo5X3VI8IEwTHa6PnFvI(androidx.compose.material.internal.PopupLayout.this, rememberUpdatedState, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }));
                startRestartGroup.updateRememberedValue(popupLayout);
                obj = popupLayout;
            } else {
                layoutDirection = layoutDirection2;
                str = str3;
                function03 = function04;
                obj = rememberedValue2;
            }
            final androidx.compose.material.internal.PopupLayout popupLayout2 = (androidx.compose.material.internal.PopupLayout) obj;
            boolean changedInstance = startRestartGroup.changedInstance(popupLayout2);
            int i6 = i5 & 14;
            if (i6 == 4) {
                z = true;
                str2 = str;
            } else {
                str2 = str;
                z = false;
            }
            boolean changed = startRestartGroup.changed(str2);
            final androidx.compose.ui.unit.LayoutDirection layoutDirection3 = layoutDirection;
            androidx.compose.ui.unit.LayoutDirection layoutDirection4 = layoutDirection3;
            boolean changed2 = startRestartGroup.changed(layoutDirection4.ordinal());
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (((changedInstance | z | changed) || changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                function02 = function03;
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.$r8$lambda$bg6lzE5hUcDfnhusRXguTrmA5F8(androidx.compose.material.internal.PopupLayout.this, function02, str2, layoutDirection3, (androidx.compose.runtime.DisposableEffectScope) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                function02 = function03;
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(popupLayout2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 0);
            boolean changedInstance2 = startRestartGroup.changedInstance(popupLayout2);
            boolean z2 = i6 == 4;
            boolean changed3 = startRestartGroup.changed(str2);
            boolean changed4 = startRestartGroup.changed(layoutDirection4.ordinal());
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z2 | changed3 | changed4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.m2835$r8$lambda$X2JoSKVY6uexqeYit0aUcJ99Q4(androidx.compose.material.internal.PopupLayout.this, function02, str2, layoutDirection3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0);
            boolean changedInstance3 = startRestartGroup.changedInstance(popupLayout2);
            boolean z3 = (i5 & 112) == 32;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.$r8$lambda$jL98Si3ka5vX_Z94rXtqnV9kzNM(androidx.compose.material.internal.PopupLayout.this, popupPositionProvider, (androidx.compose.runtime.DisposableEffectScope) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(popupPositionProvider, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, (i5 >> 3) & 14);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changedInstance4 = startRestartGroup.changedInstance(popupLayout2);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.m2836$r8$lambda$d6vpbCnvLQyG0Ybcs5PNju7nBM(androidx.compose.material.internal.PopupLayout.this, (androidx.compose.ui.layout.LayoutCoordinates) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (kotlin.jvm.functions.Function1) rememberedValue6);
            boolean changedInstance5 = startRestartGroup.changedInstance(popupLayout2);
            boolean changed5 = startRestartGroup.changed(layoutDirection4.ordinal());
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1 rememberedValue7 = startRestartGroup.rememberedValue();
            if ((changedInstance5 | changed5) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1(popupLayout2, layoutDirection3);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue7;
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function02;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.m2838$r8$lambda$rLkAtvoaYR7TJ3qpJJerMoYLwY(kotlin.jvm.functions.Function0.this, popupPositionProvider, function2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.String> getLocalPopupTestTag() {
        return getHighSpeedVideoFpsRanges;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$2HWhxwtDymBwNjEqrJsoRtwwp0E() {
        return "DEFAULT_TEST_TAG";
    }

    /* renamed from: $r8$lambda$X2JoSKVY6uexq-eYit0aUcJ99Q4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2835$r8$lambda$X2JoSKVY6uexqeYit0aUcJ99Q4(androidx.compose.material.internal.PopupLayout popupLayout, kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        popupLayout.getHighSpeedVideoFpsRanges((kotlin.jvm.functions.Function0<kotlin.Unit>) function0, str, layoutDirection);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$bg6lzE5hUcDfnhusRXguTrmA5F8(final androidx.compose.material.internal.PopupLayout popupLayout, kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        popupLayout.getHighSpeedVideoSizes.addView(popupLayout, popupLayout.getHighSpeedVideoFpsRangesFor);
        popupLayout.getHighSpeedVideoFpsRanges((kotlin.jvm.functions.Function0<kotlin.Unit>) function0, str, layoutDirection);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.material.internal.PopupLayout.this.disposeComposition();
                androidx.compose.material.internal.PopupLayout popupLayout2 = androidx.compose.material.internal.PopupLayout.this;
                androidx.compose.material.internal.PopupLayout popupLayout3 = popupLayout2;
                androidx.view.C0276ViewTreeLifecycleOwner.set(popupLayout3, null);
                popupLayout2.getHighResolutionOutputSizeshNQ4ISI.getViewTreeObserver().removeOnGlobalLayoutListener(popupLayout2);
                popupLayout2.getHighSpeedVideoSizes.removeViewImmediate(popupLayout3);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c0mKlqXIv98bYhyZua7XWEd4PmY(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$d6vpbCnvLQyG0Ybcs5PNju7-nBM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2836$r8$lambda$d6vpbCnvLQyG0Ybcs5PNju7nBM(androidx.compose.material.internal.PopupLayout popupLayout, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        kotlin.jvm.internal.Intrinsics.checkNotNull(parentLayoutCoordinates);
        long mo7361getSizeYbymL2g = parentLayoutCoordinates.mo7361getSizeYbymL2g();
        long positionInWindow = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
        popupLayout.setParentBounds(androidx.compose.ui.unit.IntRectKt.m8762IntRectVbeCjmY(androidx.compose.ui.unit.IntOffset.m8723constructorimpl((kotlin.math.MathKt.roundToInt(java.lang.Float.intBitsToFloat((int) (positionInWindow >> 32))) << 32) | (kotlin.math.MathKt.roundToInt(java.lang.Float.intBitsToFloat((int) (positionInWindow & 4294967295L))) & 4294967295L)), mo7361getSizeYbymL2g));
        popupLayout.getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$e-tcMbHrTNP0DRdUOk6SccJyFxE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2837$r8$lambda$etcMbHrTNP0DRdUOk6SccJyFxE(androidx.compose.material.internal.PopupLayout popupLayout, androidx.compose.ui.unit.IntSize intSize) {
        popupLayout.m2840setPopupContentSizefhxjrPA(intSize);
        popupLayout.getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$jL98Si3ka5vX_Z94rXtqnV9kzNM(androidx.compose.material.internal.PopupLayout popupLayout, androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        popupLayout.setPositionProvider(popupPositionProvider);
        popupLayout.getHighSpeedVideoFpsRanges();
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$lambda$5$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jkkaHETEo5X3VI8IEwTHa6PnFvI(final androidx.compose.material.internal.PopupLayout popupLayout, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1879981140, i, -1, "androidx.compose.material.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:99)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.$r8$lambda$c0mKlqXIv98bYhyZua7XWEd4PmY((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            boolean changedInstance = composer.changedInstance(popupLayout);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.m2837$r8$lambda$etcMbHrTNP0DRdUOk6SccJyFxE(androidx.compose.material.internal.PopupLayout.this, (androidx.compose.ui.unit.IntSize) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(semantics$default, (kotlin.jvm.functions.Function1) rememberedValue2), popupLayout.Camera2StreamConfigurationMap() ? 1.0f : 0.0f);
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) state.getValue();
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1 rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                        int i2;
                        int i3;
                        int size = list.size();
                        if (size == 0) {
                            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return kotlin.Unit.INSTANCE;
                                }
                            }, 4, null);
                        }
                        int i4 = 0;
                        if (size == 1) {
                            final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(0).mo7353measureBRTryo0(j);
                            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.2
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                                }
                            }, 4, null);
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size2 = list.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            arrayList.add(list.get(i5).mo7353measureBRTryo0(j));
                        }
                        final java.util.ArrayList arrayList2 = arrayList;
                        int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
                        if (lastIndex >= 0) {
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) arrayList2.get(i4);
                                i6 = java.lang.Math.max(i6, placeable.getWidth());
                                i7 = java.lang.Math.max(i7, placeable.getHeight());
                                if (i4 == lastIndex) {
                                    break;
                                }
                                i4++;
                            }
                            i2 = i6;
                            i3 = i7;
                        } else {
                            i2 = 0;
                            i3 = 0;
                        }
                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i2, i3, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1.3
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                int lastIndex2 = kotlin.collections.CollectionsKt.getLastIndex(arrayList2);
                                if (lastIndex2 < 0) {
                                    return;
                                }
                                int i8 = 0;
                                while (true) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, arrayList2.get(i8), 0, 0, 0.0f, 4, null);
                                    if (i8 == lastIndex2) {
                                        return;
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue3;
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, alpha);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rLkAtvoaYR7TJ3qpJJerMoY-LwY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2838$r8$lambda$rLkAtvoaYR7TJ3qpJJerMoYLwY(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.window.PopupPositionProvider popupPositionProvider, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ExposedDropdownMenuPopup(function0, popupPositionProvider, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
