package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a]\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentScreenUiModel;", "uiModel", "Lcom/paypal/pds/components/BottomSheetController;", "dontSeeBankBottomSheetController", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentUiModel;", "", "onFundingInstrumentClick", "Lkotlin/Function0;", "onLinkBankClick", "onDontSeeBankClick", "onTryAgainClick", "FundingInstrumentSection", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentScreenUiModel;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentScreenUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/fundinginstrument/FundingInstrumentScreenUiModel;Landroidx/compose/runtime/Composer;I)V", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FundingInstrumentSectionKt {
    public static final void FundingInstrumentSection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentScreenUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1296360923);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(fundingInstrumentScreenUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1296360923, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSection (FundingInstrumentSection.kt:56)");
            }
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20()), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
            Camera2StreamConfigurationMap(fundingInstrumentScreenUiModel, startRestartGroup, i3 & 14);
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(null, null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1958211457, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.m18394$r8$lambda$WeB_ZSFJwOQKweCIl0sfAoNoEo(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel.this, function03, function1, function0, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 503);
            composer2.endNode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.DontSeeBankBottomSheetKt.DontSeeBankBottomSheet(bottomSheetController, composer2, ((i3 >> 3) & 14) | com.paypal.pds.components.BottomSheetController.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$9_b715P_yCSrIhu9VWqBzOPfFWE(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel.this, bottomSheetController, function1, function0, function02, function03, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-679531831);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(fundingInstrumentScreenUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-679531831, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.CardContent (FundingInstrumentSection.kt:93)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, fundingInstrumentScreenUiModel.isLoading(), (androidx.compose.ui.Modifier) null, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.ComposableSingletons$FundingInstrumentSectionKt.INSTANCE.getLambda$1635206459$revolvingcredit_servicing_prodRelease(), startRestartGroup, 1572870, 30);
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, !fundingInstrumentScreenUiModel.isLoading(), (androidx.compose.ui.Modifier) null, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2043491428, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$YKj57Z7LaB0LvFNU8Iv_6Gkg6ao(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel.this, function1, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 1572870, 30);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.LinkBankButtonKt.LinkBankButton(function0, startRestartGroup, (i3 >> 6) & 14);
            com.paypal.pds.components.LinkKt.Link(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_dont_see_your_bank_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "dont_see_bank_link"), function02, null, startRestartGroup, ((i3 >> 3) & 896) | 48, 8);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$BJ5pf4njYAcEjY8lFoeIcqo2WH8(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel.this, function1, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-79646979);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-79646979, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.Warning (FundingInstrumentSection.kt:123)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize8()), startRestartGroup, 54, 0), com.paypal.pds.core.ConstantsKt.getSpacing12()), null, null, null, null, false, 0, 0, null, null, startRestartGroup, i2 & 14, 0, 2044);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.m18392$r8$lambda$vHmYhNzrAIlGuEbmxdfuVDDcYo(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1766906236);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(fundingInstrumentScreenUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1766906236, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.Header (FundingInstrumentSection.kt:136)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(fundingInstrumentScreenUiModel.getTitle().asString(startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$KnDvNWiVADZDWD_fm2PqbZ2kBT8(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1649842556);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1649842556, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.Error (FundingInstrumentSection.kt:145)");
            }
            com.paypal.pds.core.Icon.MoneyBill moneyBill = com.paypal.pds.core.Icon.MoneyBill.INSTANCE;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorKt.Error(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_choose_way_to_pay_error_description, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_try_again, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.CENTER, moneyBill, null, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, null), null, function0, startRestartGroup, (i2 << 6) & 896, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$BR6NGBTmfz97C9BXBu6JbDq4EoU(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-vHmYhNzrAIlGuEbmxdfuVDDcYo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18392$r8$lambda$vHmYhNzrAIlGuEbmxdfuVDDcYo(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3gJkDZLXzttJw7R6zCUGUxECzT0(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9_b715P_yCSrIhu9VWqBzOPfFWE(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, androidx.compose.runtime.Composer composer, int i2) {
        FundingInstrumentSection(fundingInstrumentScreenUiModel, bottomSheetController, function1, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BJ5pf4njYAcEjY8lFoeIcqo2WH8(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(fundingInstrumentScreenUiModel, function1, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BR6NGBTmfz97C9BXBu6JbDq4EoU(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KnDvNWiVADZDWD_fm2PqbZ2kBT8(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(fundingInstrumentScreenUiModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UFHkygivlxhhARGodcmqCI-qdFU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18393$r8$lambda$UFHkygivlxhhARGodcmqCIqdFU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1087171709);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1087171709, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.BackupMethodPreview (FundingInstrumentSection.kt:198)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("0", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Bank of America"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Checking ••8644"), null, null, null, null, null, false, null, null, null, null, 8176, null)), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_add_backup_payment_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_add_backup_payment_tip_message, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), false, false, 16, null);
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.m18395$r8$lambda$_SZbyk_PwE3PFNQ7KMGxw4_0gY((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            FundingInstrumentSection(fundingInstrumentScreenUiModel, bottomSheetController, function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 224640);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.m18393$r8$lambda$UFHkygivlxhhARGodcmqCIqdFU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$We-B_ZSFJwOQKweCIl0sfAoNoEo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18394$r8$lambda$WeB_ZSFJwOQKweCIl0sfAoNoEo(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1958211457, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSection.<anonymous>.<anonymous> (FundingInstrumentSection.kt:67)");
            }
            if (fundingInstrumentScreenUiModel.isError()) {
                composer.startReplaceGroup(-1463229685);
                getHighResolutionOutputSizeshNQ4ISI(function0, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1463159749);
                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString warning = fundingInstrumentScreenUiModel.getWarning();
                if (warning == null) {
                    composer.startReplaceGroup(-1463135074);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1463135073);
                    getHighSpeedVideoFpsRangesFor(warning.asString(composer, 0), composer, 0);
                    composer.endReplaceGroup();
                }
                getHighSpeedVideoFpsRangesFor(fundingInstrumentScreenUiModel, function1, function02, function03, composer, 0);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YKj57Z7LaB0LvFNU8Iv_6Gkg6ao(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel, final kotlin.jvm.functions.Function1 function1, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2043491428, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.CardContent.<anonymous>.<anonymous> (FundingInstrumentSection.kt:100)");
        }
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
        composer.startReplaceGroup(-1697709665);
        for (final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel : fundingInstrumentScreenUiModel.getFundingInstruments()) {
            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(fundingInstrumentUiModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$k8Qtyk2iJiNAttHnr_eg9noavSQ(kotlin.jvm.functions.Function1.this, fundingInstrumentUiModel);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentRowKt.FundingInstrumentRow(fundingInstrumentUiModel, com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion2, null, null, true, null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 3078, 27), composer, 0, 0);
        }
        composer.endReplaceGroup();
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YxDmkE8kHNIe3ivWqmlsyZnPM1c(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_S-Zbyk_PwE3PFNQ7KMGxw4_0gY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18395$r8$lambda$_SZbyk_PwE3PFNQ7KMGxw4_0gY(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fDuJNxdUZYCyiT0wChH99rxLwr8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1972745256);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1972745256, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentPreview (FundingInstrumentSection.kt:165)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel[]{new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("0", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Bank of America"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Checking ••8644"), null, null, null, null, null, false, null, null, null, null, 8176, null), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel("0", new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("PayPal Balance"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("$151.68 available"), null, null, null, null, null, false, null, null, null, null, 8176, null)}), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_choose_way_to_pay_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, false, false, 20, null);
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$YxDmkE8kHNIe3ivWqmlsyZnPM1c((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            FundingInstrumentSection(fundingInstrumentScreenUiModel, bottomSheetController, function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 224640);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$fDuJNxdUZYCyiT0wChH99rxLwr8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k8Qtyk2iJiNAttHnr_eg9noavSQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel fundingInstrumentUiModel) {
        function1.invoke(fundingInstrumentUiModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w72D24jpf841Qoejg_V9CvNMEcg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1246977684);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1246977684, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.ErrorPreview (FundingInstrumentSection.kt:228)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel fundingInstrumentScreenUiModel = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentScreenUiModel(kotlin.collections.CollectionsKt.emptyList(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_choose_way_to_pay_title, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, true, false, 20, null);
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$3gJkDZLXzttJw7R6zCUGUxECzT0((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            FundingInstrumentSection(fundingInstrumentScreenUiModel, bottomSheetController, function1, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | 224640);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.fundinginstrument.FundingInstrumentSectionKt.$r8$lambda$w72D24jpf841Qoejg_V9CvNMEcg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
