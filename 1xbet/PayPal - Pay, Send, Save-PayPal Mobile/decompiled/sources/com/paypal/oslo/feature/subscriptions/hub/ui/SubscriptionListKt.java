package com.paypal.oslo.feature.subscriptions.hub.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"SubscriptionList", "", "items", "", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "onItemClick", "Lkotlin/Function1;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SubscriptionListPreview", "(Landroidx/compose/runtime/Composer;I)V", "SubscriptionListSingleItemPreview", "SubscriptionListEmptyPreview", "params", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionListPreviewData;", "(Lcom/paypal/oslo/feature/subscriptions/hub/ui/SubscriptionListPreviewData;Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionListKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubscriptionList(final java.util.List<com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel, kotlin.Unit> function1, final androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics meSubscriptionsScreenAnalytics;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2109475067);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2109475067, i3, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionList (SubscriptionList.kt:69)");
                }
                if (startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics()) instanceof com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics) {
                    startRestartGroup.startReplaceGroup(-1572055156);
                    java.lang.Object consume = startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (!(consume instanceof com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics)) {
                        consume = null;
                    }
                    meSubscriptionsScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics) consume;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1571993001);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                    com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics commonScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics) startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (commonScreenAnalytics == null || (str = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                        str = "null";
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type MeSubscriptionsScreenAnalytics but current analytics is of type ");
                    sb.append(str);
                    sb.append(". Returning null.");
                    com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
                    startRestartGroup.endReplaceGroup();
                    meSubscriptionsScreenAnalytics = null;
                }
                com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics meSubscriptionsScreenAnalytics2 = meSubscriptionsScreenAnalytics;
                final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.LinkedListModule linkedListModule = meSubscriptionsScreenAnalytics2 != null ? meSubscriptionsScreenAnalytics2.getLinkedListModule() : null;
                com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets());
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(l1ContentInsets.m11616getBottomD9Ej5fM() + com.paypal.pds.core.ConstantsKt.getSpacing24()), 7, null);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "subscriptions_hub_list");
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean changedInstance2 = startRestartGroup.changedInstance(linkedListModule);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.$r8$lambda$fz8bcHdMJ1rkbGc54KU4QYXuboI(list, linkedListModule, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, lazyListState, m1703PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i3 >> 3) & 112) | 6, 504);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.$r8$lambda$FNtBaHKmNLjobvSQAocyB0frsO0(list, function1, lazyListState, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$4IxbBuMl1LT-Z5Kn6gjjFyxlnkI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19869$r8$lambda$4IxbBuMl1LTZ5Kn6gjjFyxlnkI(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EDQmEcLDQw6XL14c5GdkJHyVtrk(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FNtBaHKmNLjobvSQAocyB0frsO0(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SubscriptionList(list, function1, lazyListState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OE4nm8OSjP7smJ4zpCmq1qKLQDA(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(597525386, i, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubscriptionList.kt:130)");
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.component.MerchantIconKt.MerchantIcon(avatarResult, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Um11uMeQsGULO8xhpLk-32onO8k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19870$r8$lambda$Um11uMeQsGULO8xhpLk32onO8k(java.util.List list, com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.LinkedListModule linkedListModule, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1065193119, i3, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubscriptionList.kt:84)");
            }
            final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) list.get(i);
            final com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult rememberAvatarSource = com.paypal.oslo.feature.subscriptions.shared.ui.AvatarUtilsKt.rememberAvatarSource(subscriptionItemUiModel.getMerchant().getMerchantLogoUrl(), null, composer, 0, 2);
            boolean z = subscriptionItemUiModel.getPreferredFundingInstrument() == null;
            java.lang.String merchantName = subscriptionItemUiModel.getMerchant().getMerchantName();
            if (z) {
                composer.startReplaceGroup(1950225679);
                composer.endReplaceGroup();
                str = null;
            } else {
                composer.startReplaceGroup(1950316602);
                java.lang.String secondaryTextForHub = com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getSecondaryTextForHub(subscriptionItemUiModel.getPreferredFundingInstrument(), subscriptionItemUiModel.getBalanceFundingInstrument(), subscriptionItemUiModel.getBalancePreference(), composer, 0);
                composer.endReplaceGroup();
                str = secondaryTextForHub;
            }
            com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformation = subscriptionItemUiModel.getLastPaymentInformation();
            java.lang.String formattedBalance = lastPaymentInformation != null ? lastPaymentInformation.getFormattedBalance() : null;
            com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModel lastPaymentInformation2 = subscriptionItemUiModel.getLastPaymentInformation();
            java.lang.String formattedDate = lastPaymentInformation2 != null ? lastPaymentInformation2.getFormattedDate() : null;
            if (formattedDate == null) {
                composer.startReplaceGroup(1950777540);
                composer.endReplaceGroup();
                str2 = null;
            } else {
                composer.startReplaceGroup(1950777541);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_hub_list_paid, new java.lang.Object[]{formattedDate}, composer, 0);
                composer.endReplaceGroup();
                str2 = stringResource;
            }
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$97021103$subscriptions_prodRelease = z ? com.paypal.oslo.feature.subscriptions.hub.ui.ComposableSingletons$SubscriptionListKt.INSTANCE.getLambda$97021103$subscriptions_prodRelease() : null;
            boolean z2 = i < kotlin.collections.CollectionsKt.getLastIndex(list);
            float spacing20 = com.paypal.pds.core.ConstantsKt.getSpacing20();
            float spacing202 = com.paypal.pds.core.ConstantsKt.getSpacing20();
            androidx.compose.ui.Modifier subscriptionsAnalyticsItem = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "subscription_item_".concat(java.lang.String.valueOf(subscriptionItemUiModel.getId()))), linkedListModule != null ? linkedListModule.subscriptionRow(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(subscriptionItemUiModel.getMerchant().getId(), subscriptionItemUiModel.getMerchant().getMerchantName())) : null);
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(597525386, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.$r8$lambda$OE4nm8OSjP7smJ4zpCmq1qKLQDA(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54);
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(subscriptionItemUiModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.m19873$r8$lambda$uIwapOwP_LO6ptBQYiGvG1btXw(kotlin.jvm.functions.Function1.this, subscriptionItemUiModel);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(merchantName, subscriptionsAnalyticsItem, str, formattedBalance, str2, false, z2, null, rememberComposableLambda, lambda$97021103$subscriptions_prodRelease, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.unit.Dp.m8599boximpl(spacing20), androidx.compose.ui.unit.Dp.m8599boximpl(spacing202), null, null, false, composer, 100663296, 0, 466080);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aAEWdZ1Vxj98G4yxu9j8A6xfdy8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-854634819);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-854634819, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListEmptyPreview (SubscriptionList.kt:209)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.$r8$lambda$jWe7DWpEVXhip6VmcfIHRH567LE((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SubscriptionList(emptyList, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3), null, startRestartGroup, 54, 8);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.$r8$lambda$aAEWdZ1Vxj98G4yxu9j8A6xfdy8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$b-pRDHMvwoiQH8ST0f4YYa_lTpA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19871$r8$lambda$bpRDHMvwoiQH8ST0f4YYa_lTpA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-402631395);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-402631395, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListSingleItemPreview (SubscriptionList.kt:188)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem(), "sub_netflix", null, null, null, null, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem().getMerchant(), null, "Netflix", null, 5, null), null, 94, null));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.m19869$r8$lambda$4IxbBuMl1LTZ5Kn6gjjFyxlnkI((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SubscriptionList(listOf, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3), null, startRestartGroup, 48, 8);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.m19871$r8$lambda$bpRDHMvwoiQH8ST0f4YYa_lTpA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bNuUZaiBymcPP-wV0kOu-pcL19E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19872$r8$lambda$bNuUZaiBymcPPwV0kOupcL19E(final com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData subscriptionListPreviewData, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(458643155);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(458643155, i3, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreview (SubscriptionList.kt:253)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("UseCase - ".concat(java.lang.String.valueOf(subscriptionListPreviewData.getName())), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
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
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.$r8$lambda$EDQmEcLDQw6XL14c5GdkJHyVtrk((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            SubscriptionList(items, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3), null, composer2, 48, 8);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.m19872$r8$lambda$bNuUZaiBymcPPwV0kOupcL19E(com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewData.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fz8bcHdMJ1rkbGc54KU4QYXuboI(final java.util.List list, final com.paypal.oslo.feature.subscriptions.analytics.subscriptions.MeSubscriptionsScreenAnalytics.LinkedListModule linkedListModule, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, list.size(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object id;
                id = ((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) list.get(((java.lang.Integer) obj).intValue())).getId();
                return id;
            }
        }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1065193119, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.m19870$r8$lambda$Um11uMeQsGULO8xhpLk32onO8k(list, linkedListModule, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hb1557gbBcUDDABm85XM5qn4A9o(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-77633576);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-77633576, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreview (SubscriptionList.kt:143)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel[]{com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem(), "sub_hulu", null, null, null, null, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem().getMerchant(), null, "Hulu", null, 5, null), null, 94, null), com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem(), "sub_spotify", null, null, null, null, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem().getMerchant(), null, "Spotify", null, 5, null), null, 94, null), com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem(), "sub_grammarly", null, null, null, null, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem().getMerchant(), null, "Grammarly", null, 5, null), null, 94, null), com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem(), "sub_chewy", null, null, null, null, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem().getMerchant(), null, "Chewy", null, 5, null), null, 94, null), com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem(), "sub_adobe", null, null, null, null, com.paypal.oslo.feature.subscriptions.hub.domain.Merchant.copy$default(new com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListPreviewParams(null, 1, null).getItem().getMerchant(), null, "Adobe", null, 5, null), null, 94, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.$r8$lambda$rKNr5jq9XvHOQB2zv94rRGsD8A4((com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SubscriptionList(listOf, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3), null, startRestartGroup, 48, 8);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.hub.ui.SubscriptionListKt.$r8$lambda$hb1557gbBcUDDABm85XM5qn4A9o(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jWe7DWpEVXhip6VmcfIHRH567LE(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rKNr5jq9XvHOQB2zv94rRGsD8A4(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uIwapOwP_LO6-ptBQYiGvG1btXw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19873$r8$lambda$uIwapOwP_LO6ptBQYiGvG1btXw(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        function1.invoke(subscriptionItemUiModel);
        return kotlin.Unit.INSTANCE;
    }
}
