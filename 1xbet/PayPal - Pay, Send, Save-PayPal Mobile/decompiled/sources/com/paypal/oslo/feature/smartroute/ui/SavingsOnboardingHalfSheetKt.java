package com.paypal.oslo.feature.smartroute.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\n\u0010\t\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a\u000f\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lkotlin/Function0;", "", "onContinueClick", "onDismiss", "SavingsOnboardingHalfSheet", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "handleSavingsOnboardingCloseClick", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "handleSavingsOnboardingCancelClick", "handleSavingsOnboardingContinueClick", "SavingsOnboardingHalfSheetPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SavingsOnboardingHalfSheetKt {
    public static final void SavingsOnboardingHalfSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1251887435);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1251887435, i2, -1, "com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheet (SavingsOnboardingHalfSheet.kt:66)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function02, new com.paypal.pds.components.TopNavConfig(null, false, null, 4, null), null, null, null, handleSavingsOnboardingCloseClick(bottomSheetController, function02), false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-310315460, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt.$r8$lambda$rMR8FE8AGj7aPvufdsp7NaUTdRA(com.paypal.pds.components.BottomSheetController.this, function02, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, ((i2 >> 3) & 112) | com.paypal.pds.components.BottomSheetController.$stable | 805527552 | (i2 & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt.m19705$r8$lambda$Rr0qFFVIBmzoOzU5Ewu5FUUat8(com.paypal.pds.components.BottomSheetController.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> handleSavingsOnboardingCloseClick(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt.$r8$lambda$ULnd9yrLv0fC80I9syAgJbC8EYM(com.paypal.pds.components.BottomSheetController.this, function0);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> handleSavingsOnboardingCancelClick(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt.$r8$lambda$HFy_oR9V3mcAKnQ39uc9v7ovwq0(com.paypal.pds.components.BottomSheetController.this, function0);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> handleSavingsOnboardingContinueClick(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt.$r8$lambda$otDVUe0tgh3n9pWoY6xBBDL2g1Y(com.paypal.pds.components.BottomSheetController.this, function0);
            }
        };
    }

    public static final void SavingsOnboardingHalfSheetPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(207586869);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(207586869, i, -1, "com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetPreview (SavingsOnboardingHalfSheet.kt:212)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SavingsOnboardingHalfSheet(bottomSheetController, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheetKt.m19706$r8$lambda$mukAMF_w5BQ8z6UNGvAn_Ssj4o(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HFy_oR9V3mcAKnQ39uc9v7ovwq0(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteScreenTrackerKt.trackSmartRouteModule(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module.SAVINGS_ONBOARDING, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.DISMISS_SAVINGS_ONBOARDING);
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Rr-0qFFVIBmzoOzU5Ewu5FUUat8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19705$r8$lambda$Rr0qFFVIBmzoOzU5Ewu5FUUat8(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        SavingsOnboardingHalfSheet(bottomSheetController, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ULnd9yrLv0fC80I9syAgJbC8EYM(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mukAMF_w5BQ8z6UNG-vAn_Ssj4o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19706$r8$lambda$mukAMF_w5BQ8z6UNGvAn_Ssj4o(int i, androidx.compose.runtime.Composer composer, int i2) {
        SavingsOnboardingHalfSheetPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$otDVUe0tgh3n9pWoY6xBBDL2g1Y(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteScreenTrackerKt.trackSmartRouteModule(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module.SAVINGS_ONBOARDING, com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.SAVINGS_ONBOARDING_CONTINUE);
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rMR8FE8AGj7aPvufdsp7NaUTdRA(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-310315460, i, -1, "com.paypal.oslo.feature.smartroute.ui.SavingsOnboardingHalfSheet.<anonymous> (SavingsOnboardingHalfSheet.kt:81)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("smart_route", "smart_route", com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Action.VIEW_SAVINGS_ONBOARDING_MODAL))), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Module.SAVINGS_ONBOARDING, 0, null, null, 14, null)), 0.0f, 1, null), null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 2, null), com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SAVINGS_ONBOARDING_SHEET);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_savings_onboarding_heading, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SAVINGS_ONBOARDING_HEADING), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 48, 6, 1004);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_savings_onboarding_body, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SAVINGS_ONBOARDING_BODY), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 432, 6, 1000);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.ButtonKt.Button(handleSavingsOnboardingCancelClick(bottomSheetController, function0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_distribution_cta_cancel, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SAVINGS_ONBOARDING_CANCEL_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 408);
            com.paypal.pds.components.ButtonKt.Button(handleSavingsOnboardingContinueClick(bottomSheetController, function02), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.smartroute.R.string.feature_smart_route_savings_onboarding_continue, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.oslo.feature.smartroute.ui.DistributionTestTags.SAVINGS_ONBOARDING_CONTINUE_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 408);
            composer.endNode();
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
