package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "transactionModel", "", "RenderActivityRedeemedRewardCompose", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/pds/core/Icon;", "icon", "", "text", "RedeemedRewardContent", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityRedeemedRewardContentComposeKt {
    public static final void RenderActivityRedeemedRewardCompose(final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem> redeemedRewards;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1136085929);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityTransactionModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1136085929, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RenderActivityRedeemedRewardCompose (ActivityRedeemedRewardContentCompose.kt:40)");
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo = activityTransactionModel.getRewardInfo();
            if (rewardInfo != null && (redeemedRewards = rewardInfo.getRedeemedRewards()) != null) {
                java.util.Iterator<T> it = redeemedRewards.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem redeemedRewardInfoItem = (com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem) obj;
                    if (redeemedRewardInfoItem.getPoints() != null && redeemedRewardInfoItem.getPoints().intValue() > 0 && redeemedRewardInfoItem.getActivityRewardType() == com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.POINTS) {
                        break;
                    }
                }
                com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem redeemedRewardInfoItem2 = (com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem) obj;
                if (redeemedRewardInfoItem2 != null) {
                    java.lang.Integer points = redeemedRewardInfoItem2.getPoints();
                    if (points == null) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScope = startRestartGroup.endRestartGroup();
                        if (scopeUpdateScope != null) {
                            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt.$r8$lambda$5CieEbjs3q_DBgp1wTd_a7lS15U(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            };
                            scopeUpdateScope.updateScope(function2);
                        }
                        return;
                    }
                    RedeemedRewardContent(com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_redeemed_reward_points, new java.lang.Object[]{java.lang.String.valueOf(points.intValue())}, startRestartGroup, 0), startRestartGroup, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            scopeUpdateScope = startRestartGroup.endRestartGroup();
            if (scopeUpdateScope != null) {
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt.$r8$lambda$QGbRIUTlBZXqa8VwyQ7jAGiq474(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                };
                scopeUpdateScope.updateScope(function2);
            }
            return;
        }
        scopeUpdateScope = startRestartGroup.endRestartGroup();
        if (scopeUpdateScope != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt.$r8$lambda$UpZpyfzqGdsDLL7l5BWeZO7YmAU(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            };
            scopeUpdateScope.updateScope(function2);
        }
    }

    public static final void RedeemedRewardContent(final com.paypal.pds.core.Icon icon, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final int i3;
        final java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1263250457);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            composer2 = startRestartGroup;
            i3 = i;
            str2 = str;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1263250457, i4, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RedeemedRewardContent (ActivityRedeemedRewardContentCompose.kt:56)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.IconKt.Icon(icon, null, rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTop()), null, null, startRestartGroup, (i4 & 14) | 48, 24);
            composer2 = startRestartGroup;
            i3 = i;
            str2 = str;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()), 0.0f, 1, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 1, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, ((i4 >> 3) & 14) | 12779904, 6, androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt.$r8$lambda$64T0u9FDDraISevACc4ungYqtwg(com.paypal.pds.core.Icon.this, str2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5CieEbjs3q_DBgp1wTd_a7lS15U(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderActivityRedeemedRewardCompose(activityTransactionModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$64T0u9FDDraISevACc4ungYqtwg(com.paypal.pds.core.Icon icon, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        RedeemedRewardContent(icon, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QGbRIUTlBZXqa8VwyQ7jAGiq474(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderActivityRedeemedRewardCompose(activityTransactionModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UpZpyfzqGdsDLL7l5BWeZO7YmAU(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderActivityRedeemedRewardCompose(activityTransactionModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_Ix8REfwNSmT5_KjxYc3rtiwtqw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(933552833);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(933552833, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RenderActivityRedeemedRewardComposePreview (ActivityRedeemedRewardContentCompose.kt:81)");
            }
            RedeemedRewardContent(com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_redeemed_reward_points, new java.lang.Object[]{"10"}, startRestartGroup, 0), startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityRedeemedRewardContentComposeKt.$r8$lambda$_Ix8REfwNSmT5_KjxYc3rtiwtqw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
