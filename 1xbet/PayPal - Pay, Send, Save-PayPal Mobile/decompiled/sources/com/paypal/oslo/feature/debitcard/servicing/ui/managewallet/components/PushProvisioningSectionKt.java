package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"PushProvisioningSection", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PushProvisioningSection(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageWalletViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(966376758);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(manageWalletViewModel) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(966376758, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.PushProvisioningSection (PushProvisioningSection.kt:56)");
                }
                androidx.compose.foundation.layout.Arrangement.Vertical m1604spacedByD5KLDUw = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1604spacedByD5KLDUw(com.paypal.pds.core.ConstantsKt.getSpacing16(), androidx.compose.ui.Alignment.INSTANCE.getTop());
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundContainerOutlined.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 48, 0), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderContainerOutlined.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 384, 0), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1604spacedByD5KLDUw, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_manage_wallet_add_more_device, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig(debitCardProductName, com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetStyle.Primary.INSTANCE, false, null, 24, null);
                androidx.compose.ui.Modifier align = columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally());
                boolean changedInstance = startRestartGroup.changedInstance(manageWalletViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.PushProvisioningSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.PushProvisioningSectionKt.$r8$lambda$pEdJfMeVR1r66inxoqMxZHmryq8(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.this, (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.PushProvisioningWidget(appNavigator, pushProvisioningWidgetConfig, align, null, (kotlin.jvm.functions.Function1) rememberedValue, null, null, null, startRestartGroup, i4 & 14, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.PushProvisioningSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.PushProvisioningSectionKt.m14460$r8$lambda$wb4c5JWvTtNi8rjU8um62OZ6B0(com.paypal.oslo.core.navigation.AppNavigator.this, debitCardProductName, manageWalletViewModel, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pEdJfMeVR1r66inxoqMxZHmryq8(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState pushProvisioningWidgetState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetState, "");
        if (!(pushProvisioningWidgetState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Loading) && !(pushProvisioningWidgetState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Initial)) {
            if (pushProvisioningWidgetState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Success) {
                manageWalletViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetReady.INSTANCE);
            } else {
                if (!(pushProvisioningWidgetState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Error)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                manageWalletViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.PushProvisioningWidgetFailed.INSTANCE);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wb4c5JWvT-tNi8rjU8um62OZ6B0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14460$r8$lambda$wb4c5JWvTtNi8rjU8um62OZ6B0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PushProvisioningSection(appNavigator, debitCardProductName, manageWalletViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
