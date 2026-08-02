package com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a/\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0012\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"StatusWidgetAnimationSize", "Landroidx/compose/ui/unit/Dp;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "StatusWidgetAnimationTag", "", "StatusWidgetTextTag", "StatusWidget", "", "uiState", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState;", "modifier", "Landroidx/compose/ui/Modifier;", "onAnimationComplete", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "StatusWidgetContent", "(Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "StatusWidgetSuccessPreview", "(Landroidx/compose/runtime/Composer;I)V", "StatusWidgetRestingPreview", "StatusWidgetErrorPreview", "taptopay_prodRelease", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StatusWidgetKt {
    public static final java.lang.String StatusWidgetAnimationTag = "status_widget_animation_tag";
    public static final java.lang.String StatusWidgetTextTag = "status_widget_text_tag";
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(76.0f);

    public static final void StatusWidget(final com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState statusWidgetState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusWidgetState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(85036004);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(statusWidgetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(85036004, i3, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidget (StatusWidget.kt:57)");
            }
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            StatusWidgetContent(statusWidgetState, function0, startRestartGroup, (i3 & 14) | ((i3 >> 3) & 112), 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = function0;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt.$r8$lambda$1YgwodwvRda0_ixMSbR8X2pygto(com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.this, modifier2, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StatusWidgetContent(final com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState statusWidgetState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        kotlin.Triple triple;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusWidgetState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2116202664);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(statusWidgetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function03 = function02;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2116202664, i4, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetContent (StatusWidget.kt:64)");
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(statusWidgetState, com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Resting.INSTANCE)) {
                    triple = new kotlin.Triple(java.lang.Integer.valueOf(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_status_widget_resting), java.lang.Integer.valueOf(com.paypal.oslo.feature.taptopay.R.raw.feature_taptopay_transaction_resting), Integer.MAX_VALUE);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(statusWidgetState, com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Success.INSTANCE)) {
                    triple = new kotlin.Triple(0, java.lang.Integer.valueOf(com.paypal.oslo.feature.taptopay.R.raw.feature_taptopay_transaction_success), 1);
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(statusWidgetState, com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Error.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    triple = new kotlin.Triple(java.lang.Integer.valueOf(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_status_widget_error), java.lang.Integer.valueOf(com.paypal.oslo.feature.taptopay.R.raw.feature_taptopay_transaction_error), 1);
                }
                kotlin.Triple triple2 = triple;
                androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                    startRestartGroup.startReplaceGroup(-1553644042);
                    androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoSizes), StatusWidgetAnimationTag), startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                    function05 = function03;
                    composer3 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(-1553434575);
                    kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function03;
                    com.airbnb.lottie.compose.LottieCompositionResult rememberLottieComposition = com.airbnb.lottie.compose.RememberLottieCompositionKt.rememberLottieComposition(com.airbnb.lottie.compose.LottieCompositionSpec.RawRes.m9918boximpl(com.airbnb.lottie.compose.LottieCompositionSpec.RawRes.m9919constructorimpl(((java.lang.Number) triple2.getSecond()).intValue())), null, null, null, null, null, startRestartGroup, 0, 62);
                    final com.airbnb.lottie.compose.LottieAnimationState animateLottieCompositionAsState = com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(rememberLottieComposition.getValue(), false, false, false, null, 0.0f, ((java.lang.Number) triple2.getThird()).intValue(), null, false, false, startRestartGroup, 0, 958);
                    float floatValue = animateLottieCompositionAsState.getValue().floatValue();
                    boolean changed = startRestartGroup.changed(triple2);
                    boolean changed2 = startRestartGroup.changed(animateLottieCompositionAsState);
                    boolean z = (i4 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (((changed | changed2) || z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        function04 = function06;
                        rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$StatusWidgetContent$2$1$1(triple2, function04, animateLottieCompositionAsState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    } else {
                        function04 = function06;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(statusWidgetState, java.lang.Float.valueOf(floatValue), (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, i4 & 14);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, getHighSpeedVideoSizes), StatusWidgetAnimationTag);
                    com.airbnb.lottie.LottieComposition value = rememberLottieComposition.getValue();
                    boolean changed3 = startRestartGroup.changed(animateLottieCompositionAsState);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                float floatValue2;
                                floatValue2 = com.airbnb.lottie.compose.LottieAnimationState.this.getValue().floatValue();
                                return java.lang.Float.valueOf(floatValue2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    function05 = function04;
                    composer3 = startRestartGroup;
                    com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation(value, (kotlin.jvm.functions.Function0) rememberedValue3, testTag, false, false, false, false, null, false, null, null, null, false, false, null, null, false, composer3, 384, 0, 131064);
                    composer3.endReplaceGroup();
                }
                if (((java.lang.Number) triple2.getFirst()).intValue() > 0) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    composer4.startReplaceGroup(-1552606689);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(((java.lang.Number) triple2.getFirst()).intValue(), composer4, 0);
                    com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                    composer2 = composer4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), StatusWidgetTextTag), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, bodyMedium, composer4, 384, 6, 1016);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer3;
                    composer2.startReplaceGroup(-1552303664);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function02 = function05;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt.$r8$lambda$PAjYjeY2nfLIypizEZgNmLI1IYg(com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.this, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1YgwodwvRda0_ixMSbR8X2pygto(com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState statusWidgetState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StatusWidget(statusWidgetState, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PAjYjeY2nfLIypizEZgNmLI1IYg(com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState statusWidgetState, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        StatusWidgetContent(statusWidgetState, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WmuFVjcEYb6pOqZo01eyhxpQGOc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(458215928);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(458215928, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetErrorPreview (StatusWidget.kt:145)");
            }
            StatusWidgetContent(com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Error.INSTANCE, null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt.$r8$lambda$WmuFVjcEYb6pOqZo01eyhxpQGOc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uWyjEQbEgeZlvsGfNPkNuWCRi5U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1369256270);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1369256270, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetRestingPreview (StatusWidget.kt:137)");
            }
            StatusWidgetContent(com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Resting.INSTANCE, null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt.$r8$lambda$uWyjEQbEgeZlvsGfNPkNuWCRi5U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wFva9g9PRHoUBG7rEgaglaysBSc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-868736099);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-868736099, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetSuccessPreview (StatusWidget.kt:129)");
            }
            StatusWidgetContent(com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Success.INSTANCE, null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetKt.$r8$lambda$wFva9g9PRHoUBG7rEgaglaysBSc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
