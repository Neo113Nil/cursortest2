package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/RedemptionConfirmationScreenPreviewKt$previewSuccessScreenComponents$1;", "Lcom/paypal/oslo/feature/moneymovement/api/success/SuccessScreenComponents;", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;", "config", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;", "callbacks", "Landroidx/compose/ui/Modifier;", "modifier", "", "Content", "(Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedemptionConfirmationScreenPreviewKt$previewSuccessScreenComponents$1 implements com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents {
    RedemptionConfirmationScreenPreviewKt$previewSuccessScreenComponents$1() {
    }

    @Override // com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents
    public final void Content(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.FiatDetails fiat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(988067095);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(988067095, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.previewSuccessScreenComponents.<no name provided>.Content (RedemptionConfirmationScreenPreview.kt:56)");
        }
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination destination = mMPSuccessScreenData.getHeaderData().getDestination();
        com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact contact = destination instanceof com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact ? (com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact) destination : null;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount = mMPSuccessScreenData.getHeaderData().getAmount();
        java.lang.String quantity = (amount == null || (fiat = amount.getFiat()) == null) ? null : fiat.getQuantity();
        java.lang.String str = quantity == null ? "" : quantity;
        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing64()), composer, 0);
        com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Check.INSTANCE), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing64()), com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBasePositive.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 48);
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Redeemed $");
        sb.append(str);
        sb.append(" to");
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(sb.toString(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 384, 6, 1018);
        java.lang.String name2 = contact != null ? contact.getName() : null;
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(name2 == null ? "" : name2, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 384, 6, 1018);
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(mMPSuccessScreenData.getDisclaimerText(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
        java.lang.String primaryButtonText = mMPSuccessScreenData.getActionButtonGroupData().getPrimaryButtonText();
        com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
        com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.RedemptionConfirmationScreenPreviewKt$previewSuccessScreenComponents$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, primaryButtonText, fillMaxWidth$default, null, null, primary, large, false, false, composer, 1769862, 408);
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
