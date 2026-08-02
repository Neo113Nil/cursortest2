package com.paypal.oslo.feature.qrc.ui.review.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aU\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", "visible", "Lcom/paypal/oslo/feature/qrc/ui/review/CurrencyConversionUiData;", "conversionData", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/qrc/ui/review/model/ConversionOptionTab;", "", "onTabChange", "onConfirmClick", "Lkotlin/Function0;", "onDismiss", "ConversionOptionsBottomSheet", "(ZLcom/paypal/oslo/feature/qrc/ui/review/CurrencyConversionUiData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "p0", "p1", "p2", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/qrc/ui/review/CurrencyConversionUiData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ConversionOptionsBottomSheetKt {
    public static final void ConversionOptionsBottomSheet(final boolean z, final com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionUiData, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyConversionUiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1648618074);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(currencyConversionUiData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1648618074, i2, -1, "com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheet (ConversionOptionsBottomSheet.kt:72)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$ConversionOptionsBottomSheet$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$ConversionOptionsBottomSheet$1$1(z, bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i3);
            if (z || bottomSheetController.getVisible()) {
                startRestartGroup.startReplaceGroup(1030717313);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, function0, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(559350694, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$zNKLXPUd7w4QgVPYVjMHpFFYueY(com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData.this, function1, function12, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), composer2, ((i2 << 6) & 3670016) | ((i2 >> 9) & 112) | com.paypal.pds.components.BottomSheetController.$stable | 918552576 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 56);
                composer2.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1031222024);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$Db5LTSQCq_ZsLezZpk_NOmV3mJQ(z, currencyConversionUiData, function1, function12, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionUiData, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.Object m23436constructorimpl;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1739009329);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(currencyConversionUiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1739009329, i3, -1, "com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsContent (ConversionOptionsBottomSheet.kt:109)");
            }
            com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab selectedTab = currencyConversionUiData.getSelectedTab();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.util.Currency.getInstance(currencyConversionUiData.getTargetCurrencyCode()).getSymbol());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.String targetCurrencyCode = currencyConversionUiData.getTargetCurrencyCode();
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = targetCurrencyCode;
            }
            java.lang.String targetCurrencyAmount = currencyConversionUiData.getTargetCurrencyAmount();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.String) m23436constructorimpl);
            sb.append(targetCurrencyAmount);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_txt_conversion_options_subtitle, new java.lang.Object[]{sb.toString()}, startRestartGroup, 0);
            int i4 = com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[selectedTab.ordinal()];
            if (i4 == 1) {
                startRestartGroup.startReplaceGroup(-445665651);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_desc_conversion_options_paypal, new java.lang.Object[]{com.paypal.oslo.feature.qrc.ui.utils.ComposableUtilsKt.getFxRateConversionText(currencyConversionUiData.getBaseCurrencyCode(), currencyConversionUiData.getTargetCurrencyCode(), currencyConversionUiData.getExchangeRateValue())}, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 2) {
                    startRestartGroup.startReplaceGroup(-445667361);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-445653479);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_desc_conversion_options_issuer, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str = stringResource;
            int i5 = com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.WhenMappings.$EnumSwitchMapping$0[selectedTab.ordinal()];
            if (i5 == 1) {
                startRestartGroup.startReplaceGroup(-445648293);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_button_conversion_options_paypal, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (i5 != 2) {
                    startRestartGroup.startReplaceGroup(-445650001);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-445644613);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_button_conversion_options_issuer, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str2 = stringResource2;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundElevatedModal.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24()), com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.CONVERSION_OPTIONS_BOTTOM_SHEET);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_title_conversion_options, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.CONVERSION_OPTIONS_TITLE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.SegmentedControlItem[]{new com.paypal.pds.components.SegmentedControlItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_txt_conversion_options_tab_paypal, startRestartGroup, 0), null, null, null, null, 30, null), new com.paypal.pds.components.SegmentedControlItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_txt_conversion_options_tab_issuer, startRestartGroup, 0), null, null, null, null, 30, null)});
            int ordinal = selectedTab.ordinal();
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.CONVERSION_OPTIONS_TABS);
            boolean z = (i3 & 112) == 32;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.m17823$r8$lambda$tVA7VBD19pB7WMTvl2fD0iCIKs(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj).intValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.SegmentedControlKt.SegmentedControl(listOf, testTag2, ordinal, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, com.paypal.pds.components.SegmentedControlItem.$stable | 48, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource3, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.CONVERSION_OPTIONS_SUBTITLE), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, 48, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.CONVERSION_OPTIONS_DESCRIPTION), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            if (selectedTab == com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.ISSUER && currencyConversionUiData.isPPBalanceDisabled()) {
                startRestartGroup.startReplaceGroup(-1595710688);
                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Info.INSTANCE, null, null, com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE, startRestartGroup, 27702, 4);
                conversionOptionTab = selectedTab;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.qrc.R.string.feature_qrc_review_txt_conversion_options_issuer_note, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.CONVERSION_OPTIONS_DESCRIPTION), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 432, 6, 1016);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
                composer3 = startRestartGroup;
            } else {
                conversionOptionTab = selectedTab;
                composer3 = startRestartGroup;
                composer3.startReplaceGroup(-1594954071);
                composer3.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer3, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.qrc.ui.review.PaymentReviewTestTags.CONVERSION_OPTIONS_CONFIRM_BUTTON);
            boolean z2 = (i3 & 896) == 256;
            final com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab2 = conversionOptionTab;
            boolean changed = composer3.changed(conversionOptionTab2.ordinal());
            java.lang.Object rememberedValue2 = composer3.rememberedValue();
            if ((changed | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$6s0YHQOd4HqpaOMqIj6BdKD60y8(kotlin.jvm.functions.Function1.this, conversionOptionTab2);
                    }
                };
                composer3.updateRememberedValue(rememberedValue2);
            }
            composer2 = composer3;
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, str2, testTag3, null, null, primary, large, false, false, composer3, 1769856, 408);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.m17826$r8$lambda$WK4B3Sizku8ZLF7Rbc7HhymZU(com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData.this, function1, function12, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-J7nRNungn23FrC8CBHBWVMG1j4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17822$r8$lambda$J7nRNungn23FrC8CBHBWVMG1j4(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-tVA7VBD19pB7WMTvl2fD0iCIKs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17823$r8$lambda$tVA7VBD19pB7WMTvl2fD0iCIKs(kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.getEntries().get(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1LBTNTmDcl2tKERbYT2iuwrM6FE(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$58i5wtDpEnU9xPoTpBr5c63zHV0(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6s0YHQOd4HqpaOMqIj6BdKD60y8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        function1.invoke(conversionOptionTab);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BDYixSDpid0f8QZ5TvdLhweDtHg(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Db5LTSQCq_ZsLezZpk_NOmV3mJQ(boolean z, com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionUiData, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ConversionOptionsBottomSheet(z, currencyConversionUiData, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GnpsZjY8ys40LI7EyI_JQbVGcE0(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OEpN7jtpGWjj5gKoG9-UMp_wSx0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17824$r8$lambda$OEpN7jtpGWjj5gKoG9UMp_wSx0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1871962506);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1871962506, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetIssuerDisabledBalancePreview (ConversionOptionsBottomSheet.kt:259)");
            }
            com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionUiData = new com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData("1", "USD", "89.53", "INR", com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.ISSUER, null, false, true, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$GnpsZjY8ys40LI7EyI_JQbVGcE0((com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$1LBTNTmDcl2tKERbYT2iuwrM6FE((com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(currencyConversionUiData, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.m17824$r8$lambda$OEpN7jtpGWjj5gKoG9UMp_wSx0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SvII687SPS0VgY-6oaOhlS1al9k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17825$r8$lambda$SvII687SPS0VgY6oaOhlS1al9k(com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab conversionOptionTab) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conversionOptionTab, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WK4B3Sizku8Z-LF7Rbc7HhymZ-U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17826$r8$lambda$WK4B3Sizku8ZLF7Rbc7HhymZU(com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionUiData, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(currencyConversionUiData, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ipV1epm_O1IOu98JYgBXp7kRwd0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-381073590);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-381073590, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetPayPalPreview (ConversionOptionsBottomSheet.kt:239)");
            }
            com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionUiData = new com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData("1", "USD", "89.53", "INR", com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.PAYPAL, null, false, false, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$BDYixSDpid0f8QZ5TvdLhweDtHg((com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.m17825$r8$lambda$SvII687SPS0VgY6oaOhlS1al9k((com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(currencyConversionUiData, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$ipV1epm_O1IOu98JYgBXp7kRwd0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ke_El6ZVAXmBD3JkxrF2dBYMYu4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-172493660);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-172493660, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetIssuerPreview (ConversionOptionsBottomSheet.kt:249)");
            }
            com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionUiData = new com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData("1", "USD", "89.53", "INR", com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.ISSUER, null, false, false, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.m17822$r8$lambda$J7nRNungn23FrC8CBHBWVMG1j4((com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$58i5wtDpEnU9xPoTpBr5c63zHV0((com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(currencyConversionUiData, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheetKt.$r8$lambda$ke_El6ZVAXmBD3JkxrF2dBYMYu4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zNKLXPUd7w4QgVPYVjMHpFFYueY(com.paypal.oslo.feature.qrc.ui.review.CurrencyConversionUiData currencyConversionUiData, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(559350694, i, -1, "com.paypal.oslo.feature.qrc.ui.review.components.ConversionOptionsBottomSheet.<anonymous> (ConversionOptionsBottomSheet.kt:94)");
            }
            Camera2StreamConfigurationMap(currencyConversionUiData, function1, function12, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.values().length];
            try {
                iArr[com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.ui.review.model.ConversionOptionTab.ISSUER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
