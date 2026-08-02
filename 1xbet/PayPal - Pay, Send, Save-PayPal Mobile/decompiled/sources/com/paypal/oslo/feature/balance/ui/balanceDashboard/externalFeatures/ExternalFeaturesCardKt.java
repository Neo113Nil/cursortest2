package com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\tH\u0002\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"ExternalFeaturesCard", "", "featuresData", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/externalFeatures/ExternalFeaturesData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/externalFeatures/ExternalFeaturesData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toAnalyticsItem", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "Lcom/paypal/oslo/feature/balance/ui/balanceDashboard/externalFeatures/ExternalFeatureModel;", "toAnalyticsAction", "", "ExternalFeaturesCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "balance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExternalFeaturesCardKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExternalFeaturesCard(final com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesData externalFeaturesData, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalFeaturesData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1781021084);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(externalFeaturesData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1781021084, i3, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCard (ExternalFeaturesCard.kt:43)");
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.ExternalFeatures.CARD), com.paypal.pds.core.Color.BackgroundCardOutlined.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1251575222, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardKt.m12176$r8$lambda$vv0EDECD6G1fpqnAfKE3FMQIMA(com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesData.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306416, 500);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardKt.$r8$lambda$y8hf272mgp2JQuDYpBqVX1tE0nU(com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesData.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f8rRgRvYcTVIXZwWuUaotUt3Djo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1284982573);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1284982573, updateChangedFlags, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardPreview (ExternalFeaturesCard.kt:95)");
            }
            com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel[] externalFeatureModelArr = new com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel[2];
            com.paypal.pds.core.Icon.NoIcon noIcon = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            externalFeatureModelArr[0] = new com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel(com.paypal.oslo.feature.balance.common.BalanceConstants.BalanceDashboardConstants.FEATURE_ID_DIRECT_DEPOSIT, "Direct Deposit", noIcon, (kotlin.jvm.functions.Function0) rememberedValue);
            com.paypal.pds.core.Icon.ArrowsUpDown arrowsUpDown = com.paypal.pds.core.Icon.ArrowsUpDown.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            externalFeatureModelArr[1] = new com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel(com.paypal.oslo.feature.balance.common.BalanceConstants.BalanceDashboardConstants.FEATURE_ID_PAYPAL_SMART_ROUTE, "Smart Route", arrowsUpDown, (kotlin.jvm.functions.Function0) rememberedValue2);
            ExternalFeaturesCard(new com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesData(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) externalFeatureModelArr)), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCardKt.$r8$lambda$f8rRgRvYcTVIXZwWuUaotUt3Djo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vv0EDECD6G1fpqnAfKE-3FMQIMA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12176$r8$lambda$vv0EDECD6G1fpqnAfKE3FMQIMA(com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesData externalFeaturesData, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1251575222, i, -1, "com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesCard.<anonymous> (ExternalFeaturesCard.kt:51)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceEvenly(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1394202727);
            for (com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureModel externalFeatureModel : externalFeaturesData.getFeatures()) {
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                java.lang.String id = externalFeatureModel.getId();
                androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(weight$default, (kotlin.jvm.internal.Intrinsics.areEqual(id, com.paypal.oslo.feature.balance.common.BalanceConstants.BalanceDashboardConstants.FEATURE_ID_DIRECT_DEPOSIT) || !kotlin.jvm.internal.Intrinsics.areEqual(id, com.paypal.oslo.feature.balance.common.BalanceConstants.BalanceDashboardConstants.FEATURE_ID_PAYPAL_SMART_ROUTE)) ? com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.INSTANCE.getDIRECT_DEPOSIT_BUTTON() : com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.INSTANCE.getSMART_ROUTE_BUTTON());
                java.lang.String id2 = externalFeatureModel.getId();
                com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeatureItemKt.ExternalFeatureItem(externalFeatureModel, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(item, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstantsKt.toUserIntent((kotlin.jvm.internal.Intrinsics.areEqual(id2, com.paypal.oslo.feature.balance.common.BalanceConstants.BalanceDashboardConstants.FEATURE_ID_DIRECT_DEPOSIT) || !kotlin.jvm.internal.Intrinsics.areEqual(id2, com.paypal.oslo.feature.balance.common.BalanceConstants.BalanceDashboardConstants.FEATURE_ID_PAYPAL_SMART_ROUTE)) ? com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.ACTION_DIRECT_DEPOSIT : com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceHub.ACTION_SMART_ROUTE)), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.ExternalFeatures.INSTANCE.item(externalFeatureModel.getId())), composer, 0, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y8hf272mgp2JQuDYpBqVX1tE0nU(com.paypal.oslo.feature.balance.ui.balanceDashboard.externalFeatures.ExternalFeaturesData externalFeaturesData, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ExternalFeaturesCard(externalFeaturesData, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
