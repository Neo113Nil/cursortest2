package com.paypal.oslo.feature.bnplservicing.ui.plhub.components;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;", "model", "Lkotlin/Function0;", "", "onMoreInfoBtnClick", "PrequalifiedTile", "(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PrequalSectionUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PrequalTileKt {
    public static final void PrequalifiedTile(final com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prequalSectionUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-353189077);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(prequalSectionUiModel) : startRestartGroup.changedInstance(prequalSectionUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-353189077, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTile (PrequalTile.kt:51)");
            }
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_prequal_tile_title, startRestartGroup, 0);
            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_prequal_tile_content_description, new java.lang.Object[]{prequalSectionUiModel.getAmount(), stringResource}, startRestartGroup, 0);
            com.paypal.pds.components.CardStyle.Outlined outlined = com.paypal.pds.components.CardStyle.Outlined.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTileTestTag.ROOT_TAG);
            boolean changed = startRestartGroup.changed(stringResource2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt.m12708$r8$lambda$DSflvYBFBu8nKKRfcGHZU9rg(stringResource2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), (com.paypal.pds.core.BaseColor) null, (androidx.compose.ui.graphics.painter.Painter) null, outlined, (com.paypal.pds.components.HeaderConfig) null, new com.paypal.pds.components.FooterConfig(null, null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-394707407, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt.m12709$r8$lambda$cg8jEEY74AFZfwR7TWLK_BcziU(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, 95, null), (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-684967585, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt.$r8$lambda$OWELIv8phTu6xfoDRzbCbAUUCTg(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel.this, stringResource, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | (com.paypal.pds.components.FooterConfig.$stable << 15), 6, 982);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt.$r8$lambda$8_aSpJkfHcXwroGjb2PgflePyIo(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-MmDYBMYaGD-yzCGs0EoFtlJYow, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12707$r8$lambda$MmDYBMYaGDyzCGs0EoFtlJYow(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1838433391);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1838433391, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTilePreview (PrequalTile.kt:127)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel = new com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel(com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PrequalTileConstants.DEFAULT_AMOUNT, false, new com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.PrequalAmountErrorContent(null, 1, null), 2, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PrequalifiedTile(prequalSectionUiModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt.m12707$r8$lambda$MmDYBMYaGDyzCGs0EoFtlJYow(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3juhDySSK0AwZZ383g7GG0Nm6yE(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8_aSpJkfHcXwroGjb2PgflePyIo(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PrequalifiedTile(prequalSectionUiModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DSflvYBFBu8nK-KR-fcG-HZU9rg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12708$r8$lambda$DSflvYBFBu8nKKRfcGHZU9rg(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OWELIv8phTu6xfoDRzbCbAUUCTg(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PrequalSectionUiModel prequalSectionUiModel, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-684967585, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTile.<anonymous> (PrequalTile.kt:67)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTileTestTag.CONTENT_TAG);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(prequalSectionUiModel.getAmount(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTileTestTag.AMOUNT_TAG), com.paypal.pds.core.Color.ContentLink.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, composer, 432, 6, 1016);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTileTestTag.TITLE_TAG), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, composer, 432, 6, 1016);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cg-8jEEY74AFZfwR7TWLK_BcziU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12709$r8$lambda$cg8jEEY74AFZfwR7TWLK_BcziU(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-394707407, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTile.<anonymous> (PrequalTile.kt:87)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_prequal_tile_button_title, composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalifiedTileTestTag.MORE_INFO_BUTTON_TAG);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PrequalTileKt.$r8$lambda$3juhDySSK0AwZZ383g7GG0Nm6yE(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, testTag, null, null, secondary, medium, false, false, composer, 1769856, 408);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
