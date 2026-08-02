package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "transactionDescription", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;", "rewardInfo", "", "RenderDateTransactionDescriptionAndRewardPoints", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/ledger/models/RewardInfo;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDateTransactionDescriptionAndRewardPointsComposeKt {
    public static final void RenderDateTransactionDescriptionAndRewardPoints(final java.lang.String str, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo2;
        androidx.compose.ui.Modifier fillMaxWidth$default;
        int i3;
        com.paypal.pds.core.Color.ContentRoleBasePositive contentRoleBasePositive;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(763206779);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(rewardInfo) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            rewardInfo2 = rewardInfo;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(763206779, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.RenderDateTransactionDescriptionAndRewardPoints (ActivityDateTransactionDescriptionAndRewardPointsCompose.kt:35)");
            }
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            java.lang.String rewardDisplayValueString = rewardInfo != null ? rewardInfo.getRewardDisplayValueString() : null;
            java.lang.String str2 = rewardDisplayValueString == null ? "" : rewardDisplayValueString;
            java.lang.String str3 = str2;
            if (!kotlin.text.StringsKt.isBlank(str3)) {
                fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, 0.65f);
            } else {
                fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            }
            androidx.compose.ui.Modifier wrapContentHeight$default2 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(fillMaxWidth$default, null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            rewardInfo2 = rewardInfo;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 2, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i2 & 14) | 12779952, 6, androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND);
            startRestartGroup.endNode();
            if (!kotlin.text.StringsKt.isBlank(str3)) {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(318541684);
                com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus rewardStatus = rewardInfo2 != null ? rewardInfo.getRewardStatus() : null;
                if (rewardStatus == null) {
                    i3 = 1;
                } else {
                    i3 = 1;
                    if (com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt.WhenMappings.$EnumSwitchMapping$0[rewardStatus.ordinal()] == 1) {
                        contentRoleBasePositive = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
                        java.lang.String str4 = str2;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str4, androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i3, null), null, false, 3, null), contentRoleBasePositive, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 2, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 12779568, 6, androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND);
                        composer2.endReplaceGroup();
                    }
                }
                contentRoleBasePositive = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                java.lang.String str42 = str2;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str42, androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i3, null), null, false, 3, null), contentRoleBasePositive, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8()), false, 2, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 12779568, 6, androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND);
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(319178827);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo3 = rewardInfo2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt.$r8$lambda$JGsAZWTsorgqBp2HAgKhPKRjgdU(str, rewardInfo3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0nV_ZfiWmFCAtzWLiptXaWWw7GQ(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JGsAZWTsorgqBp2HAgKhPKRjgdU(java.lang.String str, com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo rewardInfo, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderDateTransactionDescriptionAndRewardPoints(str, rewardInfo, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KtBHssUA-MwTnc5rSZSwPyl18B0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11913$r8$lambda$KtBHssUAMwTnc5rSZSwPyl18B0(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vc9BL9WbWXiCUTxUm8wCFe3NzGw(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel ethereumReceivedTransaction$activity_prodRelease;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel ethereumReceivedTransaction$activity_prodRelease2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-106952865);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-106952865, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityTransactionDescriptionAndRewardPointPreview (ActivityDateTransactionDescriptionAndRewardPointsCompose.kt:92)");
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
            ethereumReceivedTransaction$activity_prodRelease = com.paypal.oslo.feature.activity.ui.ledger.model.preview.ActivityTransactionPreviewData.INSTANCE.ethereumReceivedTransaction$activity_prodRelease((r21 & 1) != 0 ? "crypto_tx_002" : null, (r21 & 2) != 0 ? "crypto_group_002" : null, (r21 & 4) != 0 ? "Ethereum Received" : null, (r21 & 8) != 0 ? "Feb 8, 2026" : null, (r21 & 16) != 0 ? "From Crypto Exchange" : null, (r21 & 32) != 0 ? "1.25" : null, (r21 & 64) != 0 ? "3750.00" : null, (r21 & 128) != 0 ? "USD" : null, (r21 & 256) != 0 ? "Reference: ETH-2026-02" : null, (r21 & 512) != 0 ? null : new com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo(com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.PENDING, "10 Points Pending", (java.util.List) null, (java.lang.Integer) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt.$r8$lambda$0nV_ZfiWmFCAtzWLiptXaWWw7GQ((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.ActivityItemView(ethereumReceivedTransaction$activity_prodRelease, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            ethereumReceivedTransaction$activity_prodRelease2 = com.paypal.oslo.feature.activity.ui.ledger.model.preview.ActivityTransactionPreviewData.INSTANCE.ethereumReceivedTransaction$activity_prodRelease((r21 & 1) != 0 ? "crypto_tx_002" : null, (r21 & 2) != 0 ? "crypto_group_002" : null, (r21 & 4) != 0 ? "Ethereum Received" : null, (r21 & 8) != 0 ? "Feb 8, 2026" : null, (r21 & 16) != 0 ? "From Crypto Exchange" : null, (r21 & 32) != 0 ? "1.25" : null, (r21 & 64) != 0 ? "3750.00" : null, (r21 & 128) != 0 ? "USD" : null, (r21 & 256) != 0 ? "Reference: ETH-2026-02" : null, (r21 & 512) != 0 ? null : new com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo(com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.EARNED, "$10.00 Earned", (java.util.List) null, (java.lang.Integer) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt.m11913$r8$lambda$KtBHssUAMwTnc5rSZSwPyl18B0((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.ActivityItemView(ethereumReceivedTransaction$activity_prodRelease2, function12, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 432);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt.$r8$lambda$Vc9BL9WbWXiCUTxUm8wCFe3NzGw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus.EARNED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
