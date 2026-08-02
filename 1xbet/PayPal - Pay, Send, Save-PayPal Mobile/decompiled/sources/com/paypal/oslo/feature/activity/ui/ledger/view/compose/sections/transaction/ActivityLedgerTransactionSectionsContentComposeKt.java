package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a?\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityItemUIModel", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "", "onTransactionClick", "onPrimaryCTAClick", "ActivityItemView", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerTransactionSectionsContentComposeKt {
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03d5, code lost:
    
        if (r1 == null) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityItemView(final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(710454496);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityTransactionModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(710454496, i3, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityItemView (ActivityLedgerTransactionSectionsContentCompose.kt:59)");
            }
            java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> action = activityTransactionModel.getAction();
            final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = action != null ? (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) action) : null;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean z = (i3 & 112) == 32;
            boolean changed = startRestartGroup.changed(activityActionModel);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.$r8$lambda$9Dcdag1AZrbsrAwZW5PZkVxi99o(kotlin.jvm.functions.Function1.this, activityActionModel);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 31), "transaction_row");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier wrapContentHeight$default2 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1700PaddingValuesYgX7TsA(com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing12())), 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.oslo.feature.activity.ui.common.PopulatePaypalActivityAvatarKt.PopulatePaypalActivityAvatar(activityTransactionModel.getAvatar().getAvatarType(), com.paypal.pds.components.AvatarSize.Large.INSTANCE, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), null, false, 3, null), null, false, 3, null), "avatar_container"), activityTransactionModel.getAvatar().getAvatarBadgeType(), startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 3, 0);
            androidx.compose.ui.Modifier wrapContentHeight$default3 = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 12, null)), 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default3);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel2 = activityActionModel;
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.RenderCounterPartyNameAndAmount(activityTransactionModel.getTitle(), activityTransactionModel, com.paypal.oslo.feature.activity.ui.ledger.model.extensions.ActivityLedgerViewModelExtensionsKt.hasCryptoAsset(activityTransactionModel) ? 0.6f : 0.75f, startRestartGroup, (i3 << 3) & 112, 0);
            int i4 = i3 & 14;
            composer2.startReplaceGroup(1125306179);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1125306179, i4, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.resolveDateAndShortDescription (ActivityLedgerTransactionSectionsContentCompose.kt:117)");
            }
            if (kotlin.text.StringsKt.isBlank(activityTransactionModel.getDate()) || kotlin.text.StringsKt.isBlank(activityTransactionModel.getTransactionShortDescription())) {
                java.lang.String date = activityTransactionModel.getDate();
                if (kotlin.text.StringsKt.isBlank(date)) {
                    date = null;
                }
                if (date == null) {
                    date = activityTransactionModel.getTransactionShortDescription();
                    if (kotlin.text.StringsKt.isBlank(date)) {
                        date = null;
                    }
                }
                str2 = date;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
                str = str2;
            } else {
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_date_payment_type_format, new java.lang.Object[]{activityTransactionModel.getDate(), activityTransactionModel.getTransactionShortDescription()}, composer2, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer2.endReplaceGroup();
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt.RenderDateTransactionDescriptionAndRewardPoints(str, activityTransactionModel.getRewardInfo(), composer2, 0);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo(activityTransactionModel, activityActionModel2, function12, composer2, i3 & 896, 0);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.$r8$lambda$Bo0duzgB13gyXPdHJyitGzgcZd4(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel.this, function1, function12, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4nMKkPB0X1DDFhbyKXx8iFeZNS4(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9Dcdag1AZrbsrAwZW5PZkVxi99o(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        function1.invoke(activityActionModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bo0duzgB13gyXPdHJyitGzgcZd4(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivityItemView(activityTransactionModel, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JoWSqaU1Kl3y8X0lZQTcr-aM4Y0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11914$r8$lambda$JoWSqaU1Kl3y8X0lZQTcraM4Y0(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PuI7JX0mJJXLYZNOTAVXYmkrJzU(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel purchaseTransaction$activity_prodRelease;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel copy;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel copy2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1971143442);
        if (startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1971143442, updateChangedFlags, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityItemViewPreview (ActivityLedgerTransactionSectionsContentCompose.kt:137)");
            }
            purchaseTransaction$activity_prodRelease = com.paypal.oslo.feature.activity.ui.ledger.model.preview.ActivityTransactionPreviewData.INSTANCE.purchaseTransaction$activity_prodRelease((r19 & 1) != 0 ? "crypto_tx_001" : null, (r19 & 2) != 0 ? "crypto_group_001" : null, (r19 & 4) != 0 ? "PayPal" : null, (r19 & 8) != 0 ? "Feb 9, 2026" : null, (r19 & 16) != 0 ? "Money Received" : null, (r19 & 32) != 0 ? "2500.00" : null, (r19 & 64) != 0 ? "USD" : null, (r19 & 128) != 0 ? false : true, (r19 & 256) != 0 ? null : null);
            copy = purchaseTransaction$activity_prodRelease.copy((r41 & 1) != 0 ? purchaseTransaction$activity_prodRelease.id : null, (r41 & 2) != 0 ? purchaseTransaction$activity_prodRelease.groupId : null, (r41 & 4) != 0 ? purchaseTransaction$activity_prodRelease.invoiceId : null, (r41 & 8) != 0 ? purchaseTransaction$activity_prodRelease.avatar : null, (r41 & 16) != 0 ? purchaseTransaction$activity_prodRelease.title : null, (r41 & 32) != 0 ? purchaseTransaction$activity_prodRelease.date : null, (r41 & 64) != 0 ? purchaseTransaction$activity_prodRelease.createdTime : null, (r41 & 128) != 0 ? purchaseTransaction$activity_prodRelease.amountInformation : null, (r41 & 256) != 0 ? purchaseTransaction$activity_prodRelease.transactionShortDescription : null, (r41 & 512) != 0 ? purchaseTransaction$activity_prodRelease.paymentStatus : null, (r41 & 1024) != 0 ? purchaseTransaction$activity_prodRelease.transactionETANote : null, (r41 & 2048) != 0 ? purchaseTransaction$activity_prodRelease.additionalInfo : null, (r41 & 4096) != 0 ? purchaseTransaction$activity_prodRelease.rewardInfo : new com.paypal.oslo.feature.activity.domain.ledger.models.RewardInfo((com.paypal.oslo.feature.activity.domain.ledger.models.RewardStatus) null, (java.lang.String) null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.activity.domain.ledger.models.RedeemedRewardInfoItem(50, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityRewardType.POINTS)), (java.lang.Integer) null, 11, (kotlin.jvm.internal.DefaultConstructorMarker) null), (r41 & 8192) != 0 ? purchaseTransaction$activity_prodRelease.activityMoneyMovementDirection : null, (r41 & 16384) != 0 ? purchaseTransaction$activity_prodRelease.action : null, (r41 & 32768) != 0 ? purchaseTransaction$activity_prodRelease.type : null, (r41 & 65536) != 0 ? purchaseTransaction$activity_prodRelease.activityStatus : null, (r41 & 131072) != 0 ? purchaseTransaction$activity_prodRelease.shipmentPackages : null, (r41 & 262144) != 0 ? purchaseTransaction$activity_prodRelease.activityFlags : null, (r41 & 524288) != 0 ? purchaseTransaction$activity_prodRelease.activityPartnerInfo : null, (r41 & 1048576) != 0 ? purchaseTransaction$activity_prodRelease.subdomain : null, (r41 & 2097152) != 0 ? purchaseTransaction$activity_prodRelease.channels : null, (r41 & 4194304) != 0 ? purchaseTransaction$activity_prodRelease.purposes : null);
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel(com.paypal.oslo.api.graphql.schema.type.ActivityActionType.CANCEL, null, null);
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
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda2
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.$r8$lambda$4nMKkPB0X1DDFhbyKXx8iFeZNS4((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ActivityItemView(copy, function1, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 432);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda4
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
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.$r8$lambda$t6GXxlDcom6COrFW2fpqCjA4otk((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ActivityItemView(purchaseTransaction$activity_prodRelease, function12, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 432);
            copy2 = purchaseTransaction$activity_prodRelease.copy((r41 & 1) != 0 ? purchaseTransaction$activity_prodRelease.id : null, (r41 & 2) != 0 ? purchaseTransaction$activity_prodRelease.groupId : null, (r41 & 4) != 0 ? purchaseTransaction$activity_prodRelease.invoiceId : null, (r41 & 8) != 0 ? purchaseTransaction$activity_prodRelease.avatar : null, (r41 & 16) != 0 ? purchaseTransaction$activity_prodRelease.title : null, (r41 & 32) != 0 ? purchaseTransaction$activity_prodRelease.date : null, (r41 & 64) != 0 ? purchaseTransaction$activity_prodRelease.createdTime : null, (r41 & 128) != 0 ? purchaseTransaction$activity_prodRelease.amountInformation : null, (r41 & 256) != 0 ? purchaseTransaction$activity_prodRelease.transactionShortDescription : null, (r41 & 512) != 0 ? purchaseTransaction$activity_prodRelease.paymentStatus : null, (r41 & 1024) != 0 ? purchaseTransaction$activity_prodRelease.transactionETANote : null, (r41 & 2048) != 0 ? purchaseTransaction$activity_prodRelease.additionalInfo : null, (r41 & 4096) != 0 ? purchaseTransaction$activity_prodRelease.rewardInfo : null, (r41 & 8192) != 0 ? purchaseTransaction$activity_prodRelease.activityMoneyMovementDirection : null, (r41 & 16384) != 0 ? purchaseTransaction$activity_prodRelease.action : kotlin.collections.CollectionsKt.listOf(activityActionModel), (r41 & 32768) != 0 ? purchaseTransaction$activity_prodRelease.type : null, (r41 & 65536) != 0 ? purchaseTransaction$activity_prodRelease.activityStatus : null, (r41 & 131072) != 0 ? purchaseTransaction$activity_prodRelease.shipmentPackages : null, (r41 & 262144) != 0 ? purchaseTransaction$activity_prodRelease.activityFlags : null, (r41 & 524288) != 0 ? purchaseTransaction$activity_prodRelease.activityPartnerInfo : null, (r41 & 1048576) != 0 ? purchaseTransaction$activity_prodRelease.subdomain : null, (r41 & 2097152) != 0 ? purchaseTransaction$activity_prodRelease.channels : null, (r41 & 4194304) != 0 ? purchaseTransaction$activity_prodRelease.purposes : null);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.m11914$r8$lambda$JoWSqaU1Kl3y8X0lZQTcraM4Y0((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ActivityItemView(copy2, function13, (kotlin.jvm.functions.Function1) rememberedValue6, startRestartGroup, 432);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.$r8$lambda$PuI7JX0mJJXLYZNOTAVXYmkrJzU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t6GXxlDcom6COrFW2fpqCjA4otk(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }
}
