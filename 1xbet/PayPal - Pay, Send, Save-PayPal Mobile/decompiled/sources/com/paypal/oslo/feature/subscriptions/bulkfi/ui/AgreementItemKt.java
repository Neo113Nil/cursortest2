package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001aM\u0010\u000b\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0019\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u001a\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u001b"}, d2 = {"toListItem", "Lcom/paypal/pds/components/ListItem;", "Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;", "currentSelectedFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Landroid/content/res/Resources;", "avatarResult", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/AvatarResult;", "isSelected", "", "AgreementItem", "", "agreementItem", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent;", "indexTag", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/hub/ui/models/SubscriptionItemUiModel;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AgreementItemUnselectedPreview", "(Landroidx/compose/runtime/Composer;I)V", "AgreementItemSubItemPPDCPreview", "AgreementItemSubItemHasBalanceEnabledPreview", "AgreementItemSelectedPreview", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AgreementItemKt {
    public static final com.paypal.pds.components.ListItem toListItem(com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, android.content.res.Resources resources, final com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult, boolean z) {
        java.lang.String string;
        java.lang.String str;
        java.lang.String fiLabel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarResult, "");
        if ((fundingInstrumentUiModel != null ? fundingInstrumentUiModel.getType() : null) instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPal.Debit) {
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel preferredFundingInstrument = subscriptionItemUiModel.getPreferredFundingInstrument();
            if (preferredFundingInstrument != null && (fiLabel = com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getFiLabel(preferredFundingInstrument, resources)) != null) {
                java.lang.String string2 = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_backup);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(string2);
                sb.append(": ");
                sb.append(fiLabel);
                string = sb.toString();
                str = string;
            }
            str = null;
        } else {
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel balanceFundingInstrument = subscriptionItemUiModel.getBalanceFundingInstrument();
            if (((balanceFundingInstrument != null ? balanceFundingInstrument.getType() : null) instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentTypeUiModel.PayPalBalance) || fundingInstrumentUiModel == null) {
                if (com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.WhenMappings.$EnumSwitchMapping$0[subscriptionItemUiModel.getBalancePreference().ordinal()] == 1) {
                    string = resources.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_fi_using_paypal_balance_first);
                    str = string;
                }
            }
            str = null;
        }
        return new com.paypal.pds.components.ListItem(subscriptionItemUiModel.getMerchant().getMerchantName(), str, null, null, false, false, z ? com.paypal.oslo.feature.subscriptions.bulkfi.ui.ComposableSingletons$AgreementItemKt.INSTANCE.getLambda$2008062680$subscriptions_prodRelease() : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1046313505, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.m19750$r8$lambda$nt9GLgTpa88Rg0G66u5XY50qg(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }), null, null, null, null, null, 7948, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AgreementItem(final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, final com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent, kotlin.Unit> function1, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str2;
        com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics bulkFiScreenAnalytics;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionItemUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(63801803);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrumentUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(subscriptionItemUiModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i4 = i3;
            if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(63801803, i4, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItem (AgreementItem.kt:132)");
                }
                com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult rememberAvatarSource = com.paypal.oslo.feature.subscriptions.shared.ui.AvatarUtilsKt.rememberAvatarSource(subscriptionItemUiModel.getMerchant().getMerchantLogoUrl(), null, startRestartGroup, 0, 2);
                if (startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics()) instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics) {
                    startRestartGroup.startReplaceGroup(-1572055156);
                    java.lang.Object consume = startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (!(consume instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics)) {
                        consume = null;
                    }
                    bulkFiScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics) consume;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1571993001);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                    com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics commonScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics) startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (commonScreenAnalytics == null || (str2 = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                        str2 = "null";
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type BulkFiScreenAnalytics but current analytics is of type ");
                    sb.append(str2);
                    sb.append(". Returning null.");
                    com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
                    startRestartGroup.endReplaceGroup();
                    bulkFiScreenAnalytics = null;
                }
                com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics bulkFiScreenAnalytics2 = bulkFiScreenAnalytics;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.oslo.feature.subscriptions.analytics.shared.bulkfi.BulkFiScreenAnalytics.SelectionListModule selectionListModule = bulkFiScreenAnalytics2 != null ? bulkFiScreenAnalytics2.getSelectionListModule() : null;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.draw.ClipKt.clip(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), z ? com.paypal.pds.core.ConstantsKt.getBorderSize2() : com.paypal.pds.core.ConstantsKt.getBorderSize1(), z ? com.paypal.pds.core.Color.BorderUtilitySelected.INSTANCE : com.paypal.pds.core.Color.BorderUtilityUnselected.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 0, 0), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24()), "agreement_item_".concat(java.lang.String.valueOf(str)));
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
                com.paypal.pds.components.ListItem listItem = toListItem(subscriptionItemUiModel, fundingInstrumentUiModel, (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources()), rememberAvatarSource, z);
                androidx.compose.ui.Modifier subscriptionsAnalyticsItem = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), selectionListModule != null ? selectionListModule.checkbox(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(subscriptionItemUiModel.getMerchant().getId(), subscriptionItemUiModel.getMerchant().getMerchantName())) : null);
                boolean z2 = (i4 & 7168) == 2048;
                boolean z3 = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.$r8$lambda$kRPHXSUc4EVnkPutQK8oexgsVjc(kotlin.jvm.functions.Function1.this, subscriptionItemUiModel);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ListKt.ListItemView(listItem, subscriptionsAnalyticsItem, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, false, startRestartGroup, com.paypal.pds.components.ListItem.$stable, 116);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.m19748$r8$lambda$bgaYwc2icfe1eGP_F_i5XS9NY(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.this, subscriptionItemUiModel, z, function1, str, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((74899 & i4) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3jc2KXXbFHJl2Yq1irW2LS9yQ8Q(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L390zI0PX6lxk2yaqWCQQwCNgWs(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel highSpeedVideoFpsRanges;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(186966818);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(186966818, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemSubItemHasBalanceEnabledPreview (AgreementItem.kt:231)");
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel copy$default = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "fi_preferred_id", null, "Credit", "1234", null, null, 50, null);
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams agreementItemPreviewParams = com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams.getHighSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams.getHighSpeedVideoFpsRanges("sub_default_id", "Default Service Name");
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel copy$default2 = com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel.copy$default(highSpeedVideoFpsRanges, null, null, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, copy$default, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalDebit(), "fi_balance_id", null, null, null, null, null, 62, null), null, null, 99, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.$r8$lambda$cKvAHct60EKy2KYKw_wPK0HgSb8((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AgreementItem(copy$default, copy$default2, false, (kotlin.jvm.functions.Function1) rememberedValue, "0", null, startRestartGroup, 28032, 32);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.$r8$lambda$L390zI0PX6lxk2yaqWCQQwCNgWs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TOsPYRSPtO8bVhKXlkJ2pBgk_94(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aG8V30F69Onk51kbtoGgv9UKAEc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1537705587);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1537705587, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemSelectedPreview (AgreementItem.kt:263)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams agreementItemPreviewParams = com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel highSpeedVideoFpsRanges = com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams.getHighSpeedVideoFpsRanges("sub_netflix", "Netflix");
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel preferredFundingInstrument = highSpeedVideoFpsRanges.getPreferredFundingInstrument();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.m19751$r8$lambda$pA94dOlFfKx0UeO2BHhQ7tLygc((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AgreementItem(preferredFundingInstrument, highSpeedVideoFpsRanges, true, (kotlin.jvm.functions.Function1) rememberedValue, "0", null, startRestartGroup, 28032, 32);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.$r8$lambda$aG8V30F69Onk51kbtoGgv9UKAEc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bgaYwc2i-cfe1eGP-_F_i5XS9NY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19748$r8$lambda$bgaYwc2icfe1eGP_F_i5XS9NY(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel, boolean z, kotlin.jvm.functions.Function1 function1, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AgreementItem(fundingInstrumentUiModel, subscriptionItemUiModel, z, function1, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cKvAHct60EKy2KYKw_wPK0HgSb8(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jCNpYczvRYyktxpmkOIJM2Ad-6A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19749$r8$lambda$jCNpYczvRYyktxpmkOIJM2Ad6A(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel highSpeedVideoFpsRanges;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1648112710);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1648112710, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemSubItemPPDCPreview (AgreementItem.kt:198)");
            }
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel copy$default = com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "fi_preferred_id", null, "Credit", "1234", null, null, 50, null);
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams agreementItemPreviewParams = com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams.getHighSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams.getHighSpeedVideoFpsRanges("sub_default_id", "Default Service Name");
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel copy$default2 = com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel.copy$default(highSpeedVideoFpsRanges, null, null, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED, copy$default, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getPaypalDebit(), "fi_balance_id", null, "Debit", null, null, null, 58, null), null, null, 99, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.$r8$lambda$TOsPYRSPtO8bVhKXlkJ2pBgk_94((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AgreementItem(copy$default, copy$default2, false, (kotlin.jvm.functions.Function1) rememberedValue, "0", null, startRestartGroup, 28032, 32);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.m19749$r8$lambda$jCNpYczvRYyktxpmkOIJM2Ad6A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kRPHXSUc4EVnkPutQK8oexgsVjc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel) {
        function1.invoke(new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnAgreementSelected(subscriptionItemUiModel.getId()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$npYr8J67QLTqAgO6tlpJm8NNgT0(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel highSpeedVideoFpsRanges;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-739801990);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-739801990, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemUnselectedPreview (AgreementItem.kt:177)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams agreementItemPreviewParams = com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams.getHighSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemPreviewParams.getHighSpeedVideoFpsRanges("sub_default_id", "Default Service Name");
            com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel creditCard = com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.$r8$lambda$3jc2KXXbFHJl2Yq1irW2LS9yQ8Q((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AgreementItem(creditCard, highSpeedVideoFpsRanges, false, (kotlin.jvm.functions.Function1) rememberedValue, "0", null, startRestartGroup, 28032, 32);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.ui.AgreementItemKt.$r8$lambda$npYr8J67QLTqAgO6tlpJm8NNgT0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nt9GLgTpa88Rg0G66u-5XY50q-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19750$r8$lambda$nt9GLgTpa88Rg0G66u5XY50qg(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1046313505, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.ui.toListItem.<anonymous> (AgreementItem.kt:88)");
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

    /* renamed from: $r8$lambda$pA94dOlFfKx0UeO2B-HhQ7tLygc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19751$r8$lambda$pA94dOlFfKx0UeO2BHhQ7tLygc(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent bulkUpdateFiUiEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiUiEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.values().length];
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
