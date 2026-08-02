package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionListPreviewsKt {
    public static /* synthetic */ kotlin.Unit $r8$lambda$FhdBrJapvBiBkys0ZxrJteD6THU(final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData subscriptionListPreviewData, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1564767960);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(subscriptionListPreviewData) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1564767960, i3, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreview (SubscriptionListPreviews.kt:38)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(subscriptionListPreviewData.getName(), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> items = subscriptionListPreviewData.getItems();
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewsKt.$r8$lambda$vpNVop7GAnm9XB1zeSQti7oVRpg((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.SubscriptionList(items, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3), null, composer2, 48, 8);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewsKt.$r8$lambda$FhdBrJapvBiBkys0ZxrJteD6THU(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vpNVop7GAnm9XB1zeSQti7oVRpg(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel access$createItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel2) {
        return new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel(str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE, balancePreference, fundingInstrumentUiModel, fundingInstrumentUiModel2, new com.paypal.oslo.feature.subscriptions.hub.domain.Merchant("merchant_".concat(java.lang.String.valueOf(str)), str2, null), new com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel("$9.99", "Jan 15"));
    }
}
