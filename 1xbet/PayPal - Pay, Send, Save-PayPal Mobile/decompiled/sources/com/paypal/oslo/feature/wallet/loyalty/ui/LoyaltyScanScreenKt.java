package com.paypal.oslo.feature.wallet.loyalty.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\t\"\u0014\u0010\u000b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/loyalty/ui/Merchant;", "merchant", "Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyScanScreenViewModel;", "viewModel", "", "LoyaltyScanScreen", "(Lcom/paypal/oslo/feature/wallet/loyalty/ui/Merchant;Lcom/paypal/oslo/feature/wallet/loyalty/ui/LoyaltyScanScreenViewModel;Landroidx/compose/runtime/Composer;I)V", "", "TestTagLoyaltyScanScanViewFinder", "Ljava/lang/String;", "TestTagLoyaltyScanPrompt", "TestTagLoyaltyScanManualInputButton"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LoyaltyScanScreenKt {
    public static final java.lang.String TestTagLoyaltyScanManualInputButton = "loyalty_scan_manual_input_button";
    public static final java.lang.String TestTagLoyaltyScanPrompt = "loyalty_scan_prompt";
    public static final java.lang.String TestTagLoyaltyScanScanViewFinder = "loyalty_scan_scan_view_finder";

    public static final void LoyaltyScanScreen(final com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant, final com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel loyaltyScanScreenViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loyaltyScanScreenViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(127446837);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(merchant) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(loyaltyScanScreenViewModel) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(127446837, i3, -1, "com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreen (LoyaltyScanScreen.kt:48)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_scanning_example, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_scan_card_content_description, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagLoyaltyScanScanViewFinder), null, null, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 384, 120);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_scan_card_prompt_string, new java.lang.Object[]{merchant.getName()}, startRestartGroup, 0);
            com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            int m8501getEllipsisgIe3tQ8 = androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8();
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), TestTagLoyaltyScanPrompt), contentBase, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(m8501getEllipsisgIe3tQ8), false, 2, 0, null, bodyMedium, startRestartGroup, 12779904, 6, 856);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing96(), 0.0f, 0.0f, 13, null), TestTagLoyaltyScanManualInputButton);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_loyalty_scan_card_enter_number, startRestartGroup, 0);
            com.paypal.pds.core.Icon.Pencil pencil = com.paypal.pds.core.Icon.Pencil.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Outline outline = com.paypal.pds.components.ButtonStyle.Outline.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(loyaltyScanScreenViewModel);
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenKt.$r8$lambda$YKZBB1C7Fy8p3vVi6HDQKpH84Wg(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel.this, merchant);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource2, testTag, pencil, null, outline, null, false, false, startRestartGroup, 199680, 464);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenKt.$r8$lambda$r3jZwpRala8IyQrzpol2cWmGZwU(com.paypal.oslo.feature.wallet.loyalty.ui.Merchant.this, loyaltyScanScreenViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YKZBB1C7Fy8p3vVi6HDQKpH84Wg(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel loyaltyScanScreenViewModel, com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant) {
        loyaltyScanScreenViewModel.navigateToManualEntry$wallet_prodRelease("1234 5678 9012|", merchant);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r3jZwpRala8IyQrzpol2cWmGZwU(com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant, com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel loyaltyScanScreenViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        LoyaltyScanScreen(merchant, loyaltyScanScreenViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uq3FjlWBqDs6r6E3F00BpJ2ax4s(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(827551538);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(827551538, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanPreview (LoyaltyScanScreen.kt:89)");
            }
            com.paypal.oslo.feature.wallet.loyalty.ui.Merchant merchant = new com.paypal.oslo.feature.wallet.loyalty.ui.Merchant("Test", com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_temp_logo_1);
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
            if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            LoyaltyScanScreen(merchant, (com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.loyalty.ui.LoyaltyScanScreenKt.$r8$lambda$uq3FjlWBqDs6r6E3F00BpJ2ax4s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
