package com.paypal.oslo.feature.subscriptions.details.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000f"}, d2 = {"SubscriptionDetailsScreen", "", "subscriptionDetailUiState", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Success;", "modifier", "Landroidx/compose/ui/Modifier;", "onUpdateFiClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailUiState$Success;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SubscriptionDetailsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "SubscriptionDetailsScreenPPDCWithBackupPreview", "SubscriptionDetailsScreenWithBackupPreview", "SubscriptionDetailsScreenNoBackupPreview", "SubscriptionDetailsScreenNoSavedPaymentMethodPreview", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionDetailsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubscriptionDetailsScreen(final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success success, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        java.lang.String str;
        com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics detailScreenAnalytics;
        com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.PayingWithModule payingWithModule;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2134670651);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(success) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function03 = function02;
                } else {
                    modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-2134670651, i3, -1, "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreen (SubscriptionDetailsScreen.kt:44)");
                    }
                    com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics = null;
                    if (startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics()) instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics) {
                        startRestartGroup.startReplaceGroup(-1572055156);
                        java.lang.Object consume = startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                        if (!(consume instanceof com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics)) {
                            consume = null;
                        }
                        detailScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics) consume;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1571993001);
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                        com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics commonScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics) startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                        if (commonScreenAnalytics == null || (str = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                            str = "null";
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type DetailScreenAnalytics but current analytics is of type ");
                        sb.append(str);
                        sb.append(". Returning null.");
                        com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
                        startRestartGroup.endReplaceGroup();
                        detailScreenAnalytics = null;
                    }
                    com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics detailScreenAnalytics2 = detailScreenAnalytics;
                    androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(success.getSubscriptionDetails().getMerchantId(), success.getSubscriptionDetails().getMerchantName())));
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                    com.paypal.oslo.feature.subscriptions.details.ui.MerchantInfoComponentKt.MerchantInfoComponent(success.getSubscriptionDetails().getMerchantName(), null, success.getSubscriptionDetails().getMerchantImageUrl(), startRestartGroup, 0, 2);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> fundingInstruments = success.getSubscriptionDetails().getFundingInstruments();
                    com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence = success.getSubscriptionDetails().getPaymentMethodAbsence();
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    if (detailScreenAnalytics2 != null && (payingWithModule = detailScreenAnalytics2.getPayingWithModule()) != null) {
                        moduleAnalytics = com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(payingWithModule, null, null, 0, null, 11, null);
                    }
                    com.paypal.oslo.feature.subscriptions.details.ui.ManageFISectionKt.ManageFISection(com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(companion, moduleAnalytics, startRestartGroup, 6), fundingInstruments, paymentMethodAbsence, function04, startRestartGroup, (i3 << 3) & 7168, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt.$r8$lambda$NIbXafOgV3DHtrhSKq9IrmbxnQY(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success.this, modifier4, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1mLdTpMIg9pPllyTAeukx4NUfzE(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1263488169);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1263488169, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreview (SubscriptionDetailsScreen.kt:100)");
            }
            copy = r10.copy((r24 & 1) != 0 ? r10.agreementId : null, (r24 & 2) != 0 ? r10.merchantName : null, (r24 & 4) != 0 ? r10.type : null, (r24 & 8) != 0 ? r10.merchantImageUrl : null, (r24 & 16) != 0 ? r10.fundingInstruments : kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getDebitCard(), "preview-fi-1", null, "Chase Visa", "1234", null, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewPreviewDataKt.THUMBNAIL, 18, null), com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority.NONE)), (r24 & 32) != 0 ? r10.merchantContact : null, (r24 & 64) != 0 ? r10.managementType : null, (r24 & 128) != 0 ? r10.merchantId : null, (r24 & 256) != 0 ? r10.balancePreference : null, (r24 & 512) != 0 ? r10.merchantWebsiteUrl : null, (r24 & 1024) != 0 ? new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams(null, 1, null).getDetails().paymentMethodAbsence : null);
            SubscriptionDetailsScreen(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success(copy), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt.$r8$lambda$1mLdTpMIg9pPllyTAeukx4NUfzE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EoJlnqMQ1mrDjl9YOFIXOMcs0as(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1343331878);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1343331878, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenNoBackupPreview (SubscriptionDetailsScreen.kt:152)");
            }
            copy = r10.copy((r24 & 1) != 0 ? r10.agreementId : null, (r24 & 2) != 0 ? r10.merchantName : null, (r24 & 4) != 0 ? r10.type : null, (r24 & 8) != 0 ? r10.merchantImageUrl : null, (r24 & 16) != 0 ? r10.fundingInstruments : new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsPreviewData().balanceWithNoBackup(), (r24 & 32) != 0 ? r10.merchantContact : null, (r24 & 64) != 0 ? r10.managementType : null, (r24 & 128) != 0 ? r10.merchantId : null, (r24 & 256) != 0 ? r10.balancePreference : null, (r24 & 512) != 0 ? r10.merchantWebsiteUrl : null, (r24 & 1024) != 0 ? new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams(null, 1, null).getDetails().paymentMethodAbsence : com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoBackup.INSTANCE);
            SubscriptionDetailsScreen(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success(copy), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt.$r8$lambda$EoJlnqMQ1mrDjl9YOFIXOMcs0as(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HlfRX87C2h_Jq5UyDA-4_Q-VdXk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19849$r8$lambda$HlfRX87C2h_Jq5UyDA4_QVdXk(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1572054561);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1572054561, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenWithBackupPreview (SubscriptionDetailsScreen.kt:138)");
            }
            copy = r10.copy((r24 & 1) != 0 ? r10.agreementId : null, (r24 & 2) != 0 ? r10.merchantName : null, (r24 & 4) != 0 ? r10.type : null, (r24 & 8) != 0 ? r10.merchantImageUrl : null, (r24 & 16) != 0 ? r10.fundingInstruments : new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsPreviewData().balanceWithBackup(), (r24 & 32) != 0 ? r10.merchantContact : null, (r24 & 64) != 0 ? r10.managementType : null, (r24 & 128) != 0 ? r10.merchantId : null, (r24 & 256) != 0 ? r10.balancePreference : null, (r24 & 512) != 0 ? r10.merchantWebsiteUrl : null, (r24 & 1024) != 0 ? new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams(null, 1, null).getDetails().paymentMethodAbsence : null);
            SubscriptionDetailsScreen(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success(copy), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt.m19849$r8$lambda$HlfRX87C2h_Jq5UyDA4_QVdXk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NIbXafOgV3DHtrhSKq9IrmbxnQY(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success success, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SubscriptionDetailsScreen(success, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wrdNkkYl3rBKz9rSUYbqckXDpto(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1439741086);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1439741086, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPPDCWithBackupPreview (SubscriptionDetailsScreen.kt:124)");
            }
            copy = r10.copy((r24 & 1) != 0 ? r10.agreementId : null, (r24 & 2) != 0 ? r10.merchantName : null, (r24 & 4) != 0 ? r10.type : null, (r24 & 8) != 0 ? r10.merchantImageUrl : null, (r24 & 16) != 0 ? r10.fundingInstruments : new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsPreviewData().ppdcWithBackup(), (r24 & 32) != 0 ? r10.merchantContact : null, (r24 & 64) != 0 ? r10.managementType : null, (r24 & 128) != 0 ? r10.merchantId : null, (r24 & 256) != 0 ? r10.balancePreference : null, (r24 & 512) != 0 ? r10.merchantWebsiteUrl : null, (r24 & 1024) != 0 ? new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams(null, 1, null).getDetails().paymentMethodAbsence : null);
            SubscriptionDetailsScreen(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success(copy), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt.$r8$lambda$wrdNkkYl3rBKz9rSUYbqckXDpto(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z4kHz48viEOmZyWYOwp82mSU2qg(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1243321944);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1243321944, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenNoSavedPaymentMethodPreview (SubscriptionDetailsScreen.kt:167)");
            }
            copy = r10.copy((r24 & 1) != 0 ? r10.agreementId : null, (r24 & 2) != 0 ? r10.merchantName : null, (r24 & 4) != 0 ? r10.type : null, (r24 & 8) != 0 ? r10.merchantImageUrl : null, (r24 & 16) != 0 ? r10.fundingInstruments : kotlin.collections.CollectionsKt.emptyList(), (r24 & 32) != 0 ? r10.merchantContact : null, (r24 & 64) != 0 ? r10.managementType : null, (r24 & 128) != 0 ? r10.merchantId : null, (r24 & 256) != 0 ? r10.balancePreference : com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.DISABLED, (r24 & 512) != 0 ? r10.merchantWebsiteUrl : null, (r24 & 1024) != 0 ? new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenPreviewParams(null, 1, null).getDetails().paymentMethodAbsence : com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence.NoPaymentMethod.INSTANCE);
            SubscriptionDetailsScreen(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success(copy), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt.$r8$lambda$z4kHz48viEOmZyWYOwp82mSU2qg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
