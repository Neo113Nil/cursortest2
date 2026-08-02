package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001aC\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"LinkedBusinessesListContent", "", "state", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$LinkedBusinessesList;", "onFooterLinkClick", "Lkotlin/Function2;", "", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubUiEvent;", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessHubState$LinkedBusinessesList;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LinkedBusinessListItem", "item", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/LinkedBusinessAgreementItemUiModel;", "showBottomDivider", "", "index", "", "(Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/LinkedBusinessAgreementItemUiModel;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkedBusinessesListContentKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkedBusinessesListContent(final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent, kotlin.Unit> function1, final androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics settingsLinkedBusinessesScreenAnalytics;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedBusinessesList, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(86894618);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(linkedBusinessesList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(lazyListState) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(86894618, i4, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContent (LinkedBusinessesListContent.kt:57)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_hub_footer_text_html, new java.lang.Object[]{"/subscriptions"}, startRestartGroup, 0);
                boolean changed = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = com.paypal.oslo.feature.subscriptions.shared.ui.HtmlRichTextParserKt.htmlToRichText(stringResource);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final com.paypal.pds.core.RichText richText = (com.paypal.pds.core.RichText) rememberedValue;
                if (startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics()) instanceof com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics) {
                    startRestartGroup.startReplaceGroup(-1572055156);
                    java.lang.Object consume = startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (!(consume instanceof com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics)) {
                        consume = null;
                    }
                    settingsLinkedBusinessesScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics) consume;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1571993001);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
                    com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics commonScreenAnalytics = (com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalytics) startRestartGroup.consume(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics());
                    if (commonScreenAnalytics == null || (str = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                        str = "null";
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type SettingsLinkedBusinessesScreenAnalytics but current analytics is of type ");
                    sb.append(str);
                    sb.append(". Returning null.");
                    com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
                    startRestartGroup.endReplaceGroup();
                    settingsLinkedBusinessesScreenAnalytics = null;
                }
                com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics settingsLinkedBusinessesScreenAnalytics2 = settingsLinkedBusinessesScreenAnalytics;
                final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule linkedListModule = settingsLinkedBusinessesScreenAnalytics2 != null ? settingsLinkedBusinessesScreenAnalytics2.getLinkedListModule() : null;
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), "businesses_hub_list");
                boolean changedInstance = startRestartGroup.changedInstance(linkedListModule);
                boolean z = (i4 & 896) == 256;
                boolean z2 = (i4 & 14) == 4;
                boolean changed2 = startRestartGroup.changed(richText);
                boolean z3 = (i4 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | z | z2 | changed2 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.Object obj = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.$r8$lambda$LdNbDwv8yecycW0Z9A9AlKQBFsw(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList.this, linkedListModule, function1, richText, function2, (androidx.compose.foundation.lazy.LazyListScope) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(obj);
                    rememberedValue2 = obj;
                }
                modifier3 = modifier4;
                composer2 = startRestartGroup;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, lazyListState, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, (i4 >> 6) & 112, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.m19805$r8$lambda$AYaVwWVXGbznG_wEve1F3gufc(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList.this, function2, function1, lazyListState, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkedBusinessListItem(final com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel linkedBusinessAgreementItemUiModel, final boolean z, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent, kotlin.Unit> function1, final int i, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedBusinessAgreementItemUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1644774114);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(linkedBusinessAgreementItemUiModel) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1644774114, i4, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessListItem (LinkedBusinessesListContent.kt:164)");
                }
                java.lang.String str = null;
                final com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult rememberAvatarSource = com.paypal.oslo.feature.subscriptions.shared.ui.AvatarUtilsKt.rememberAvatarSource(linkedBusinessAgreementItemUiModel.getAgreementImageUrl(), null, startRestartGroup, 0, 2);
                boolean z2 = linkedBusinessAgreementItemUiModel.getFundingInstrument() == null && (linkedBusinessAgreementItemUiModel.getBalancePreference() != com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.ENABLED || linkedBusinessAgreementItemUiModel.getBalanceFundingInstrument() == null);
                java.lang.String agreementName = linkedBusinessAgreementItemUiModel.getAgreementName();
                if (z2) {
                    startRestartGroup.startReplaceGroup(-1815712348);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1815633205);
                    com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrument = linkedBusinessAgreementItemUiModel.getFundingInstrument();
                    if (fundingInstrument != null) {
                        startRestartGroup.startReplaceGroup(-1815633205);
                        str = com.paypal.oslo.feature.subscriptions.shared.ui.model.FiLabelResultKt.getSecondaryTextForHub(fundingInstrument, linkedBusinessAgreementItemUiModel.getBalanceFundingInstrument(), linkedBusinessAgreementItemUiModel.getBalancePreference(), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1815633206);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.String str2 = str;
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$355062067$subscriptions_prodRelease = z2 ? com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt.INSTANCE.getLambda$355062067$subscriptions_prodRelease() : null;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(companion, "business_item_".concat(java.lang.String.valueOf(i)));
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1489323415, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.m19806$r8$lambda$INSkeSKbKopLeulFefMJUnPHOE(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                boolean z3 = (i4 & 896) == 256;
                boolean z4 = (i4 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z3 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.m19807$r8$lambda$NCHWxcbv4jTj3PJ_hGCbJqN_I(kotlin.jvm.functions.Function1.this, linkedBusinessAgreementItemUiModel);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                int i6 = ((i4 << 15) & 3670016) | 100663296;
                androidx.compose.ui.Modifier modifier4 = companion;
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(agreementName, testTag, str2, null, null, false, z, null, rememberComposableLambda, lambda$355062067$subscriptions_prodRelease, null, null, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, false, startRestartGroup, i6, 0, 515256);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.$r8$lambda$06jkK4a11DqLlB0XiKTOmVBAG8U(com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel.this, z, function1, i, modifier3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$06jkK4a11DqLlB0XiKTOmVBAG8U(com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel linkedBusinessAgreementItemUiModel, boolean z, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        LinkedBusinessListItem(linkedBusinessAgreementItemUiModel, z, function1, i, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3RKnFvMwKeKTW3b5PgQcuTQ_k0g(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList, com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule linkedListModule, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1243477330, i3, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkedBusinessesListContent.kt:125)");
            }
            com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel linkedBusinessAgreementItemUiModel = linkedBusinessesList.getList().get(i);
            LinkedBusinessListItem(linkedBusinessAgreementItemUiModel, i < linkedBusinessesList.getList().size() - 1, function1, i, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, linkedListModule != null ? linkedListModule.businessRow(new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext(linkedBusinessAgreementItemUiModel.getMerchantId(), linkedBusinessAgreementItemUiModel.getAgreementName())) : null), composer, (i3 << 6) & 7168, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$56mSUNpBYedlKRulEJ1KAHtWkMM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnLinkBusinessesClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AYaVwWVXGbznG_wEve1F3guf--c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19805$r8$lambda$AYaVwWVXGbznG_wEve1F3gufc(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkedBusinessesListContent(linkedBusinessesList, function2, function1, lazyListState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$INSkeSKbKopLeulFefMJUn-PHOE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19806$r8$lambda$INSkeSKbKopLeulFefMJUnPHOE(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1489323415, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessListItem.<anonymous> (LinkedBusinessesListContent.kt:184)");
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$LdNbDwv8yecycW0Z9A9AlKQBFsw(final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList, final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule linkedListModule, final kotlin.jvm.functions.Function1 function1, final com.paypal.pds.core.RichText richText, final kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, com.paypal.oslo.feature.subscriptions.businesseshub.ui.ComposableSingletons$LinkedBusinessesListContentKt.INSTANCE.getLambda$1168829093$subscriptions_prodRelease(), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(81087004, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.$r8$lambda$xKUqSPQoOlb5W971sgWxvAJqO7E(com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule.this, function1, linkedBusinessesList, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, linkedBusinessesList.getList().size(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object agreementId;
                agreementId = com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList.this.getList().get(((java.lang.Integer) obj).intValue()).getAgreementId();
                return agreementId;
            }
        }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1243477330, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.$r8$lambda$3RKnFvMwKeKTW3b5PgQcuTQ_k0g(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList.this, linkedListModule, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 4, null);
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1906722781, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.$r8$lambda$XVYDC9b_KaVIFngwO3kzby4OcVo(com.paypal.pds.core.RichText.this, function2, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N-CHWxc-bv4jTj3PJ_hGCbJqN_I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19807$r8$lambda$NCHWxcbv4jTj3PJ_hGCbJqN_I(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModel linkedBusinessAgreementItemUiModel) {
        function1.invoke(new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnLinkedBusinessItemClicked(linkedBusinessAgreementItemUiModel.getAgreementId()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QKT9i10OzGRLCtdkHHdiuaHmjEg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnBulkFiClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XVYDC9b_KaVIFngwO3kzby4OcVo(com.paypal.pds.core.RichText richText, kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1906722781, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkedBusinessesListContent.kt:143)");
            }
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, function2, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, null, composer, 0, 48, 5100);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r4b_tEbtqQEgHCieH9xXd7eTGXk(com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule linkedListModule, final kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1542359264, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkedBusinessesListContent.kt:89)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            com.paypal.pds.core.Icon.Card card = com.paypal.pds.core.Icon.Card.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_manage_icon_button_content_description, composer, 0);
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            androidx.compose.ui.Modifier subscriptionsAnalyticsItem = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, linkedListModule != null ? linkedListModule.bulkFiButton() : null);
            com.paypal.pds.core.Icon.Card card2 = card;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.$r8$lambda$QKT9i10OzGRLCtdkHHdiuaHmjEg(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(card2, (kotlin.jvm.functions.Function0) rememberedValue, subscriptionsAnalyticsItem, secondary, null, stringResource, null, false, false, composer, 3078, 464);
            if (linkedBusinessesList.getShouldShowLinkEntryPoints()) {
                composer.startReplaceGroup(-1582819935);
                com.paypal.pds.core.Icon.Plus plus = com.paypal.pds.core.Icon.Plus.INSTANCE;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_add_button_content_description, composer, 0);
                com.paypal.pds.components.ButtonStyle.Secondary secondary2 = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                androidx.compose.ui.Modifier subscriptionsAnalyticsItem2 = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, linkedListModule != null ? linkedListModule.addBusinessButton() : null);
                com.paypal.pds.core.Icon.Plus plus2 = plus;
                boolean changed2 = composer.changed(function1);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.$r8$lambda$56mSUNpBYedlKRulEJ1KAHtWkMM(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.IconButtonKt.IconButton(plus2, (kotlin.jvm.functions.Function0) rememberedValue2, subscriptionsAnalyticsItem2, secondary2, null, stringResource2, null, false, false, composer, 3078, 464);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1582108826);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xKUqSPQoOlb5W971sgWxvAJqO7E(final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule linkedListModule, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(81087004, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkedBusinessesListContent.kt:86)");
            }
            com.paypal.pds.components.SectionHeaderKt.SectionHeader(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1542359264, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.$r8$lambda$r4b_tEbtqQEgHCieH9xXd7eTGXk(com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule.this, function1, linkedBusinessesList, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3072, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
