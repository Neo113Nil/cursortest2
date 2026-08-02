package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ConfirmationModalConfig;", "config", "", "ConfirmationModal", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ConfirmationModalConfig;Landroidx/compose/runtime/Composer;I)V", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ConfirmationModalConfig;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ConfirmationModalKt {
    public static final void ConfirmationModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig confirmationModalConfig, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationModalConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(424393821);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(confirmationModalConfig) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(424393821, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModal (ConfirmationModal.kt:96)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, confirmationModalConfig.getOnCloseClick(), true, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2040399030, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt.m12319$r8$lambda$IADxZizYnkVq1vtPctHGacaizQ(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | (i2 & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 314);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt.m12320$r8$lambda$IyfW814KaHoYz65ruGD2di9828(com.paypal.pds.components.BottomSheetController.this, confirmationModalConfig, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig confirmationModalConfig, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(614136830);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(confirmationModalConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(614136830, i2, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalContent (ConfirmationModal.kt:113)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundElevatedModal.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            com.paypal.pds.core.Icon icon = confirmationModalConfig.getIcon();
            if (icon != null) {
                startRestartGroup.startReplaceGroup(399400565);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(icon, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27696, 4);
                startRestartGroup.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                startRestartGroup.endReplaceGroup();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } else {
                startRestartGroup.startReplaceGroup(399400564);
                startRestartGroup.endReplaceGroup();
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(confirmationModalConfig.getTitle(), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundElevatedModal.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), "Title"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(confirmationModalConfig.m12317getTextAligne0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1000);
            java.lang.String description = confirmationModalConfig.getDescription();
            if (description != null) {
                composer2.startReplaceGroup(400449605);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(description, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "Description"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(confirmationModalConfig.m12317getTextAligne0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 432, 6, 1000);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
            } else {
                composer2.startReplaceGroup(400449604);
                composer2.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.ButtonKt.Button(confirmationModalConfig.getPrimaryAction().getOnButtonClick(), confirmationModalConfig.getPrimaryAction().getButtonText(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "PrimaryButton"), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, 1769856, 408);
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction secondaryAction = confirmationModalConfig.getSecondaryAction();
            if (secondaryAction != null) {
                composer2.startReplaceGroup(-1391228655);
                com.paypal.pds.components.ButtonKt.Button(secondaryAction.getOnButtonClick(), secondaryAction.getButtonText(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "SecondaryButton"), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, 1769856, 408);
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                composer2.endReplaceGroup();
                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
            } else {
                composer2.startReplaceGroup(-1391228656);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt.$r8$lambda$VAgcmXmaXCRRIlwGjzBR7MWaREI(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$I-ADxZizYnkVq1vtPctHGacaizQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12319$r8$lambda$IADxZizYnkVq1vtPctHGacaizQ(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig confirmationModalConfig, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2040399030, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModal.<anonymous> (ConfirmationModal.kt:103)");
            }
            getHighSpeedVideoFpsRanges(confirmationModalConfig, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IyfW814KaHoYz65ruGD2di982-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12320$r8$lambda$IyfW814KaHoYz65ruGD2di9828(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig confirmationModalConfig, int i, androidx.compose.runtime.Composer composer, int i2) {
        ConfirmationModal(bottomSheetController, confirmationModalConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UqDIa8-_yTqtEvFzkrCEkwGtEhw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12321$r8$lambda$UqDIa8_yTqtEvFzkrCEkwGtEhw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(172082689);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(172082689, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalCancelPreview (ConfirmationModal.kt:214)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction confirmationContentAction = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction("Yes, Cancel", (kotlin.jvm.functions.Function0) rememberedValue);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig("Are you sure you want to cancel?", 0, null, null, confirmationContentAction, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction("No, Continue Application", (kotlin.jvm.functions.Function0) rememberedValue2), null, 78, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt.m12321$r8$lambda$UqDIa8_yTqtEvFzkrCEkwGtEhw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VAgcmXmaXCRRIlwGjzBR7MWaREI(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig confirmationModalConfig, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(confirmationModalConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$akdP79f225lx3m5OwKe8T90N-6M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12322$r8$lambda$akdP79f225lx3m5OwKe8T90N6M(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1342505179);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1342505179, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalExitPreview (ConfirmationModal.kt:260)");
            }
            int m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction confirmationContentAction = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction("Exit Now", (kotlin.jvm.functions.Function0) rememberedValue);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig("Exit before adding card?", m8448getStarte0LSkKk, "You'll need to add your virtual card to Google Wallet to make an in-store purchase.", null, confirmationContentAction, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction("Don't Leave Yet", (kotlin.jvm.functions.Function0) rememberedValue2), null, 72, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt.m12322$r8$lambda$akdP79f225lx3m5OwKe8T90N6M(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kdQodUhsu4r5n6i3RqLgMf9K6Zc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2045129121);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2045129121, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalSingleButtonPreview (ConfirmationModal.kt:284)");
            }
            int m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig("Annual income after taxes", m8448getStarte0LSkKk, "You can include alimony, child support, or separate maintenance income if you want us to consider it here. Married WI residents: If your spouse is a WI resident, you can include their income.", null, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction("Done", (kotlin.jvm.functions.Function0) rememberedValue), null, null, 104, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt.$r8$lambda$kdQodUhsu4r5n6i3RqLgMf9K6Zc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xv0r_8cwiBlzJjn3xhBoGtbhmCc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1050158639);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1050158639, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalChangeAmountPreview (ConfirmationModal.kt:236)");
            }
            com.paypal.pds.core.Icon.NoIcon noIcon = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction confirmationContentAction = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction("Yes, Change Amount", (kotlin.jvm.functions.Function0) rememberedValue);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighSpeedVideoFpsRanges(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalConfig("Change amount", 0, "You can apply again to shop in store after we cancel your old single-use loan.", noIcon, confirmationContentAction, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationContentAction("Don't Change", (kotlin.jvm.functions.Function0) rememberedValue2), null, 66, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.ConfirmationModalKt.$r8$lambda$xv0r_8cwiBlzJjn3xhBoGtbhmCc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
