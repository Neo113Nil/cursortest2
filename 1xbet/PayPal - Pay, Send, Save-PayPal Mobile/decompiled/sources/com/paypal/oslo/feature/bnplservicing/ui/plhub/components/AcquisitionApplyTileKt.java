package com.paypal.oslo.feature.bnplservicing.ui.plhub.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "title", "Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;", "tileModel", "Lkotlin/Function0;", "", "onApply", "AcquisitionApplyTile", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/AcquisitionApplyTileModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AcquisitionApplyTileKt {
    public static final void AcquisitionApplyTile(final java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel2;
        boolean z;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionApplyTileModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1020397425);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(acquisitionApplyTileModel) : startRestartGroup.changedInstance(acquisitionApplyTileModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            composer2 = startRestartGroup;
            function02 = function0;
            acquisitionApplyTileModel2 = acquisitionApplyTileModel;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1020397425, i4, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTile (AcquisitionApplyTile.kt:65)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileTestTags.ACQUISITION_APPLY_TILE);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.AbsoluteAlignment.INSTANCE.getLeft(), startRestartGroup, 0);
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
            if (str.length() > 0) {
                startRestartGroup.startReplaceGroup(-2010280368);
                z = false;
                i3 = i4;
                acquisitionApplyTileModel2 = acquisitionApplyTileModel;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileTestTags.TITLE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, null, startRestartGroup, (i4 & 14) | 432, 0, 2040);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                z = false;
                i3 = i4;
                acquisitionApplyTileModel2 = acquisitionApplyTileModel;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-2010104195);
                composer2.endReplaceGroup();
            }
            com.paypal.pds.components.HeaderConfig headerConfig = null;
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            com.paypal.pds.core.Color.BackgroundBrandPrimary backgroundBrandPrimary = com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE;
            com.paypal.pds.components.CardStyle.Filled filled = com.paypal.pds.components.CardStyle.Filled.INSTANCE;
            if (acquisitionApplyTileModel.getBadgeText() != null) {
                composer2.startReplaceGroup(-2009844291);
                headerConfig = new com.paypal.pds.components.HeaderConfig(null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-45930573, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.$r8$lambda$mPN5zKjnEGPIsBDrrAiQcn8Agtw(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), null, 23, null);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-2009529703);
                composer2.endReplaceGroup();
            }
            com.paypal.pds.components.HeaderConfig headerConfig2 = headerConfig;
            function02 = function0;
            com.paypal.pds.components.FooterConfig footerConfig = new com.paypal.pds.components.FooterConfig(null, null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1766045689, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.m12700$r8$lambda$aXe0oURdpDSrBi8UMCLdxl7O4Y(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel.this, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), null, 95, null);
            com.paypal.pds.core.Color.BackgroundBrandPrimary backgroundBrandPrimary2 = backgroundBrandPrimary;
            com.paypal.pds.components.CardStyle.Filled filled2 = filled;
            if ((i3 & 896) == 256) {
                z = true;
            }
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.$r8$lambda$LfHPQNi40X_eiKyQGTQJKDcyzTA(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CardKt.Card(fillMaxWidth$default, backgroundBrandPrimary2, (androidx.compose.ui.graphics.painter.Painter) null, filled2, headerConfig2, footerConfig, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1812062535, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.$r8$lambda$KBPAligukOXs8xeBmddmnqPUJz4(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 54 | (com.paypal.pds.components.HeaderConfig.$stable << 12) | (com.paypal.pds.components.FooterConfig.$stable << 15), 6, 900);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel3 = acquisitionApplyTileModel2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.$r8$lambda$0hFZ1hxkdWlJp5nZvu9ZEx5NpqI(str, acquisitionApplyTileModel3, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0hFZ1hxkdWlJp5nZvu9ZEx5NpqI(java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        AcquisitionApplyTile(str, acquisitionApplyTileModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KBPAligukOXs8xeBmddmnqPUJz4(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1812062535, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTile.<anonymous>.<anonymous> (AcquisitionApplyTile.kt:103)");
            }
            androidx.compose.foundation.layout.Arrangement.Vertical m1604spacedByD5KLDUw = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1604spacedByD5KLDUw(com.paypal.pds.core.ConstantsKt.getSpacing16(), androidx.compose.ui.Alignment.INSTANCE.getTop());
            androidx.compose.ui.Alignment.Horizontal start = androidx.compose.ui.Alignment.INSTANCE.getStart();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1604spacedByD5KLDUw, start, composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(acquisitionApplyTileModel.getHeader(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileTestTags.HEADER), com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 432, 6, 1016);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(acquisitionApplyTileModel.getSubHeader(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileTestTags.SUBHEADER), com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 432, 6, 1016);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LfHPQNi40X_eiKyQGTQJKDcyzTA(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M2grO1m0W-6N_tMe0dJ4oXw7J2I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12697$r8$lambda$M2grO1m0W6N_tMe0dJ4oXw7J2I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1141128759);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1141128759, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.CustomButtonTextPreview (AcquisitionApplyTile.kt:245)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel = new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.HEADER), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.SUBHEADER), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Apply"), 4, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AcquisitionApplyTile(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.TITLE, acquisitionApplyTileModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, ((((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | 390);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.m12697$r8$lambda$M2grO1m0W6N_tMe0dJ4oXw7J2I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Nv6Knao-uJi2J_adQoD-UwsnCQ8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12698$r8$lambda$Nv6KnaouJi2J_adQoDUwsnCQ8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-760315171);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-760315171, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.LongHeaderTextPreview (AcquisitionApplyTile.kt:202)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel = new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.HEADER), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.SUBHEADER), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("APPLY"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AcquisitionApplyTile("Pay Monthly for in-store and online purchases with flexible payment options.", acquisitionApplyTileModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, ((((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | 390);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.m12698$r8$lambda$Nv6KnaouJi2J_adQoDUwsnCQ8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OSMTedr_Jq9gw7la5se6ow4hn58(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-823801822);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-823801822, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.WithoutBadgePreview (AcquisitionApplyTile.kt:180)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel = new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.HEADER), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.SUBHEADER), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("APPLY"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AcquisitionApplyTile(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.TITLE, acquisitionApplyTileModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, ((((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | 390);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.$r8$lambda$OSMTedr_Jq9gw7la5se6ow4hn58(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_MkEQrcJCB2WHE1dj4tKp9LYSYw(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aXe0oURdp-DSrBi8UMCLdxl7O4Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12700$r8$lambda$aXe0oURdpDSrBi8UMCLdxl7O4Y(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1766045689, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTile.<anonymous>.<anonymous> (AcquisitionApplyTile.kt:95)");
            }
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(acquisitionApplyTileModel.getApplyButtonText(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileTestTags.APPLY_BUTTON);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.$r8$lambda$_MkEQrcJCB2WHE1dj4tKp9LYSYw(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, value, testTag, null, null, null, small, false, false, composer, 1573248, 440);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bs5uk4TcapzlsWJrRP_vbp2W34k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1075283016);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1075283016, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.WithBadgePreview (AcquisitionApplyTile.kt:158)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel = new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.HEADER), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.SUBHEADER), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("NEW"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("APPLY"));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AcquisitionApplyTile(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.TestConstants.TITLE, acquisitionApplyTileModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, ((((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | 390);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.$r8$lambda$bs5uk4TcapzlsWJrRP_vbp2W34k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ikvgdH_u88KhqmZ4rP9qQ6lDuUk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1219612049);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1219612049, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.ShortContentTextPreview (AcquisitionApplyTile.kt:224)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel = new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactoryKt.PayLaterTitle), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("No fees"), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("APPLY"), 4, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AcquisitionApplyTile("Special offer", acquisitionApplyTileModel, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, ((((com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) | com.paypal.oslo.core.commonui.utils.RefText.$stable) << 3) | 390);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileKt.$r8$lambda$ikvgdH_u88KhqmZ4rP9qQ6lDuUk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mPN5zKjnEGPIsBDrrAiQcn8Agtw(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileModel acquisitionApplyTileModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-45930573, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTile.<anonymous>.<anonymous> (AcquisitionApplyTile.kt:85)");
            }
            com.paypal.pds.components.BadgeKt.Badge(com.paypal.oslo.core.commonui.utils.RefTextKt.value(acquisitionApplyTileModel.getBadgeText(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.AcquisitionApplyTileTestTags.BADGE), null, null, com.paypal.pds.components.BadgeSize.Small.INSTANCE, null, null, composer, 24624, 108);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
