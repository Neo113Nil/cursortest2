package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}, k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TextInputKt$TextInput$8$1 implements androidx.compose.foundation.text.input.TextFieldDecorator {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ boolean getOutputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-844102697);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-844102697, i2, -1, "com.paypal.pds.components.TextInput.<anonymous>.<no name provided>.Decoration (TextInput.kt:611)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22101optClickablecJG_KMw(androidx.compose.ui.Modifier.INSTANCE, null, null, null, this.getHighSpeedVideoSizesFor, startRestartGroup, 6, 7), com.paypal.pds.core.ConstantsKt.getSpacing12());
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getInputFormats;
            final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoSizes;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function23 = this.getInputSizeshNQ4ISI;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str3 = this.getOutputMinFrameDuration;
            boolean z = this.getOutputFormats;
            boolean z2 = this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.TextInputKt.Camera2StreamConfigurationMap((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function22, startRestartGroup, 0);
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.animation.core.FiniteAnimationSpec access$layoutAnimationSpec = com.paypal.pds.components.TextInputKt.access$layoutAnimationSpec(startRestartGroup, 0);
            boolean changed = startRestartGroup.changed(mutableState);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextInputKt$TextInput$8$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.pds.components.TextInputKt$TextInput$8$1.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier animateContentSize = androidx.compose.animation.AnimationModifierKt.animateContentSize(weight$default, access$layoutAnimationSpec, (kotlin.jvm.functions.Function2) rememberedValue);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, animateContentSize);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.TextInputKt.getHighResolutionOutputSizeshNQ4ISI(str, str2, str3, z, z2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(382906047, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextInputKt$TextInput$8$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TextInputKt$TextInput$8$1.getHighSpeedVideoSizes(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            if (function24 == null) {
                startRestartGroup.startReplaceGroup(758372380);
                startRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                startRestartGroup.startReplaceGroup(-114083707);
                i3 = 0;
                function24.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            com.paypal.pds.components.TextInputKt.Camera2StreamConfigurationMap((kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function23, startRestartGroup, i3);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.TextInputKt$TextInput$8$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.TextInputKt$TextInput$8$1.Camera2StreamConfigurationMap(com.paypal.pds.components.TextInputKt$TextInput$8$1.this, function2, i, (androidx.compose.runtime.Composer) obj);
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(382906047, i, -1, "com.paypal.pds.components.TextInput.<anonymous>.<no name provided>.Decoration.<anonymous>.<anonymous>.<anonymous> (TextInput.kt:631)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.pds.components.TextInputKt$TextInput$8$1 textInputKt$TextInput$8$1, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        textInputKt$TextInput$8$1.Decoration(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    TextInputKt$TextInput$8$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23) {
        this.getHighSpeedVideoSizesFor = function0;
        this.getInputFormats = function2;
        this.getHighSpeedVideoSizes = mutableState;
        this.getInputSizeshNQ4ISI = function22;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getOutputMinFrameDuration = str3;
        this.getOutputFormats = z;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighResolutionOutputSizeshNQ4ISI = function23;
    }
}
