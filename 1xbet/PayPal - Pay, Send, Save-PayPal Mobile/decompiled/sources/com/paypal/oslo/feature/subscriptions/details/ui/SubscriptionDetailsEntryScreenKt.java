package com.paypal.oslo.feature.subscriptions.details.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u000e"}, d2 = {"SubscriptionDetailsEntryScreen", "", "agreementId", "", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailViewModel;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "activityWidgetProvider", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/details/ui/viewmodel/SubscriptionDetailViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "navigateBackWithResult", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionDetailsEntryScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubscriptionDetailsEntryScreen(final java.lang.String str, final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str2;
        com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics detailScreenAnalytics;
        int i4;
        com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState;
        com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState uiToastState;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        androidx.compose.ui.Modifier modifier4;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String stringResource;
        androidx.compose.ui.Modifier modifier5;
        int i5;
        com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics;
        boolean z;
        com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics2;
        int i6;
        com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.RecentActivityModule recentActivityModule;
        com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule;
        com.paypal.oslo.feature.subscriptions.analytics.shared.ErrorModule errorModule2;
        com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModel subscriptionDetails;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionDetailViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iActivityWidgetProvider, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-242520492);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(subscriptionDetailViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(iActivityWidgetProvider) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier6 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-242520492, i3, -1, "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreen (SubscriptionDetailsEntryScreen.kt:76)");
                }
                com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState2 = (com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(subscriptionDetailViewModel.getUiState(), null, startRestartGroup, 0, 1).getValue();
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState(null, 1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState uiToastState2 = (com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState) rememberedValue;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_success_payment_method_update_title, startRestartGroup, 0);
                androidx.compose.ui.Modifier modifier7 = modifier6;
                java.lang.String updateFiRequestId = subscriptionDetailViewModel.getUpdateFiRequestId();
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
                    if (commonScreenAnalytics == null || (str2 = commonScreenAnalytics.getClass().getSimpleName()) == null) {
                        str2 = "null";
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested analytics of type DetailScreenAnalytics but current analytics is of type ");
                    sb.append(str2);
                    sb.append(". Returning null.");
                    com.paypal.android.logger.Logger.w$default(logger, sb.toString(), null, null, 6, null);
                    startRestartGroup.endReplaceGroup();
                    detailScreenAnalytics = null;
                }
                final com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics detailScreenAnalytics2 = detailScreenAnalytics;
                int i8 = i3 & 14;
                boolean z2 = i8 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionsActivityWidgetHelper(iActivityWidgetProvider).createActivityWidgetForSubscriptionDetails(str);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.activity.api.widget.IActivityWidget iActivityWidget = rememberedValue2;
                int i9 = i3 & 896;
                boolean z3 = i9 == 256;
                boolean changedInstance = startRestartGroup.changedInstance(subscriptionDetailViewModel);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z3 | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.$r8$lambda$FBspJXLlYximU8wXwOkIUeQ5BUo(com.paypal.oslo.core.navigation.AppNavigator.this, subscriptionDetailViewModel);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 1);
                boolean changedInstance2 = startRestartGroup.changedInstance(subscriptionDetailViewModel);
                boolean z4 = i8 == 4;
                com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$2$1(subscriptionDetailViewModel, str, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, i8);
                boolean changed = startRestartGroup.changed(stringResource2);
                boolean changedInstance3 = startRestartGroup.changedInstance(subscriptionDetailViewModel);
                boolean z5 = i8 == 4;
                com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if (((changed | changedInstance3) || z5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i4 = 1;
                    subscriptionDetailUiState = subscriptionDetailUiState2;
                    uiToastState = uiToastState2;
                    navResultManager = null;
                    modifier4 = modifier7;
                    str3 = updateFiRequestId;
                    rememberedValue5 = new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$3$1(uiToastState2, stringResource2, subscriptionDetailViewModel, str, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                } else {
                    modifier4 = modifier7;
                    uiToastState = uiToastState2;
                    subscriptionDetailUiState = subscriptionDetailUiState2;
                    str3 = updateFiRequestId;
                    navResultManager = null;
                    i4 = 1;
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19848invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19848invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str5) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
                            return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str5);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                int i10 = i4;
                composer2 = startRestartGroup;
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str3, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue6, composer2, 3072);
                final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState3 = subscriptionDetailUiState;
                boolean z6 = subscriptionDetailUiState3 instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success;
                com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success success = z6 ? (com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success) subscriptionDetailUiState3 : navResultManager;
                java.lang.Object type = (success == 0 || (subscriptionDetails = success.getSubscriptionDetails()) == null) ? navResultManager : subscriptionDetails.getType();
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, i10, navResultManager);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    composer2.startReplaceGroup(1784181011);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_subscription_details_nav_title, composer2, 0);
                    composer2.endReplaceGroup();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    composer2.startReplaceGroup(1784186456);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_details_nav_title, composer2, 0);
                    composer2.endReplaceGroup();
                } else {
                    if (type != null) {
                        composer2.startReplaceGroup(1784179251);
                        composer2.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(-524642874);
                    composer2.endReplaceGroup();
                    str4 = "";
                    androidx.compose.ui.Modifier modifier8 = modifier4;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(str4, null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1763591769, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.$r8$lambda$cUpbvGiNuH1WkEwVFSG5GPwrmYw(com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.this, subscriptionDetailUiState3, appNavigator, subscriptionDetailViewModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, composer2, 54), composer2, 1572864, 62);
                    if (!(subscriptionDetailUiState3 instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error)) {
                        composer2.startReplaceGroup(-522707604);
                        boolean changedInstance4 = composer2.changedInstance(subscriptionDetailViewModel);
                        boolean z7 = i8 == 4;
                        java.lang.Object rememberedValue7 = composer2.rememberedValue();
                        if ((z7 | changedInstance4) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.$r8$lambda$vCslaZWDLLSU_Vm3cEC1QQy6uBM(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.this, str);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        i5 = 6;
                        com.paypal.oslo.feature.subscriptions.shared.ui.error.ErrorScreenKt.ErrorScreen((kotlin.jvm.functions.Function0) rememberedValue7, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), (detailScreenAnalytics2 == null || (errorModule2 = detailScreenAnalytics2.getErrorModule()) == null) ? null : com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(errorModule2, kotlin.collections.CollectionsKt.listOf(((com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error) subscriptionDetailUiState3).getErrorContext()), null, 0, null, 10, null), composer2, 0), (detailScreenAnalytics2 == null || (errorModule = detailScreenAnalytics2.getErrorModule()) == null) ? null : errorModule.tryAgainButton(), composer2, 0, 0);
                        composer2.endReplaceGroup();
                        modifier5 = modifier8;
                        i6 = 0;
                        z = true;
                    } else {
                        composer2.startReplaceGroup(-521951266);
                        androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        if ((subscriptionDetailUiState3 instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Initial) || (subscriptionDetailUiState3 instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Loading)) {
                            modifier5 = modifier8;
                            i5 = 6;
                            composer2.startReplaceGroup(-1060467457);
                            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor4);
                            } else {
                                composer2.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            moduleAnalytics = null;
                            com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsShimmerScreenKt.SubscriptionDetailsShimmerScreen(null, composer2, 0, 1);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else {
                            if (!z6) {
                                composer2.startReplaceGroup(-1419685333);
                                composer2.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1060059869);
                            com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success success2 = (com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success) subscriptionDetailUiState3;
                            androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            final java.lang.String str5 = str3;
                            boolean z8 = i9 == 256;
                            boolean changed2 = composer2.changed(str5);
                            boolean z9 = i8 == 4;
                            boolean changed3 = composer2.changed(subscriptionDetailUiState3);
                            modifier5 = modifier8;
                            java.lang.Object rememberedValue8 = composer2.rememberedValue();
                            if ((z9 | z8 | changed2 | changed3) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.m19843$r8$lambda$2euiEm11HqXEz0yBvdZiWt7BA(com.paypal.oslo.core.navigation.AppNavigator.this, str5, str, subscriptionDetailUiState3);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue8);
                            }
                            i5 = 6;
                            com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsScreenKt.SubscriptionDetailsScreen(success2, fillMaxWidth$default3, (kotlin.jvm.functions.Function0) rememberedValue8, composer2, 48, 0);
                            composer2.endReplaceGroup();
                            moduleAnalytics = null;
                        }
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        if (detailScreenAnalytics2 == null || (recentActivityModule = detailScreenAnalytics2.getRecentActivityModule()) == null) {
                            z = true;
                            moduleAnalytics2 = moduleAnalytics;
                        } else {
                            com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.RecentActivityModule recentActivityModule2 = recentActivityModule;
                            z = true;
                            moduleAnalytics2 = com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(recentActivityModule2, null, null, 1, null, 11, null);
                        }
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(companion, moduleAnalytics2, composer2, i5), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing64(), 2, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1710paddingqDBjuR0$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor5);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        i6 = 0;
                        iActivityWidget.getContent().invoke(composer2, 0);
                        composer2.endNode();
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (!z6) {
                        composer2.startReplaceGroup(-865458394);
                        java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_hub_managed_cta, composer2, i6);
                        com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                        com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                        androidx.compose.ui.Modifier subscriptionsAnalyticsItem = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(boxScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getBottomEnd()), detailScreenAnalytics2 != null ? detailScreenAnalytics2.manageButton() : null);
                        boolean z10 = i9 == 256 ? z : false;
                        boolean changed4 = composer2.changed(subscriptionDetailUiState3);
                        java.lang.Object rememberedValue9 = composer2.rememberedValue();
                        if ((changed4 | z10) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.$r8$lambda$_nJzPoUrLTuCY8D2qnsb8E017BI(com.paypal.oslo.core.navigation.AppNavigator.this, subscriptionDetailUiState3);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue9, stringResource3, subscriptionsAnalyticsItem, null, null, primary, large, false, false, composer2, 1769472, 408);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-864297196);
                        composer2.endReplaceGroup();
                    }
                    com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionToastKt.SubscriptionToast(uiToastState, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, i5, 0);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                str4 = stringResource;
                androidx.compose.ui.Modifier modifier82 = modifier4;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(str4, null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1763591769, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.$r8$lambda$cUpbvGiNuH1WkEwVFSG5GPwrmYw(com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics.this, subscriptionDetailUiState3, appNavigator, subscriptionDetailViewModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54), composer2, 1572864, 62);
                if (!(subscriptionDetailUiState3 instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Error)) {
                }
                composer2.endNode();
                if (!z6) {
                }
                com.paypal.oslo.feature.subscriptions.shared.ui.SubscriptionToastKt.SubscriptionToast(uiToastState, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, i5, 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.$r8$lambda$KLGUT_6WromhS7CSMTYDcZ4g8S8(str, subscriptionDetailViewModel, appNavigator, iActivityWidgetProvider, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$2euiEm11HqXEz0y-BvdZiW-t7BA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19843$r8$lambda$2euiEm11HqXEz0yBvdZiWt7BA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.m19844$r8$lambda$5Tolm0ziCZEDYmOhGVvgGlSj0(str2, subscriptionDetailUiState, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5Tolm0ziCZ-EDYmOhG-VvgGlSj0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19844$r8$lambda$5Tolm0ziCZEDYmOhGVvgGlSj0(java.lang.String str, com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination(str, com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(((com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success) subscriptionDetailUiState).getSubscriptionDetails().getType())));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8mm9yKe6IhbGN8Z3c1lOtVGxX_g(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success success, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination(success.getSubscriptionDetails().getAgreementId(), success.getSubscriptionDetails().getMerchantContact(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9sqJPaqf-K_BRmOTvtZ7sJOZB5I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19845$r8$lambda$9sqJPaqfK_BRmOTvtZ7sJOZB5I(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (subscriptionDetailViewModel.getFiUpdated()) {
            navigationScope.setResult(new com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult(true, false, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FBspJXLlYximU8wXwOkIUeQ5BUo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel) {
        appNavigator.navigate(new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda9(subscriptionDetailViewModel));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KLGUT_6WromhS7CSMTYDcZ4g8S8(java.lang.String str, com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SubscriptionDetailsEntryScreen(str, subscriptionDetailViewModel, appNavigator, iActivityWidgetProvider, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WdC0CygQ7gMje-w3hcD_gJXnysU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19846$r8$lambda$WdC0CygQ7gMjew3hcD_gJXnysU(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success success = subscriptionDetailUiState instanceof com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success ? (com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success) subscriptionDetailUiState : null;
        if (success != null) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.$r8$lambda$8mm9yKe6IhbGN8Z3c1lOtVGxX_g(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_nJzPoUrLTuCY8D2qnsb8E017BI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.$r8$lambda$vwnYN9TV93vh7LKDI51OjFcTjh4(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cUpbvGiNuH1WkEwVFSG5GPwrmYw(com.paypal.oslo.feature.subscriptions.analytics.shared.detail.DetailScreenAnalytics detailScreenAnalytics, final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1763591769, i, -1, "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreen.<anonymous>.<anonymous>.<anonymous> (SubscriptionDetailsEntryScreen.kt:117)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
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
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.Info info = com.paypal.pds.core.Icon.Info.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_info_content_description, composer, 0);
            androidx.compose.ui.Modifier subscriptionsAnalyticsItem = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, detailScreenAnalytics != null ? detailScreenAnalytics.infoButton() : null);
            com.paypal.pds.core.Icon.Info info2 = info;
            boolean changed = composer.changed(subscriptionDetailUiState);
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.m19846$r8$lambda$WdC0CygQ7gMjew3hcD_gJXnysU(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(info2, (kotlin.jvm.functions.Function0) rememberedValue, subscriptionsAnalyticsItem, tertiary, null, stringResource, null, false, false, composer, 3078, 464);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0);
            boolean changed3 = composer.changed(appNavigator);
            boolean changedInstance = composer.changedInstance(subscriptionDetailViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changed3 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.m19847$r8$lambda$zL7CIUNfqhttBwFHEo1MYScfjU(com.paypal.oslo.core.navigation.AppNavigator.this, subscriptionDetailViewModel);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue2, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, detailScreenAnalytics != null ? detailScreenAnalytics.closeButton() : null), null, composer, 0, 4);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vCslaZWDLLSU_Vm3cEC1QQy6uBM(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel, java.lang.String str) {
        subscriptionDetailViewModel.retry(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vwnYN9TV93vh7LKDI51OjFcTjh4(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState subscriptionDetailUiState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success success = (com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailUiState.Success) subscriptionDetailUiState;
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination(success.getSubscriptionDetails().getAgreementId(), success.getSubscriptionDetails().getMerchantName(), success.getSubscriptionDetails().getMerchantWebsiteUrl(), com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(success.getSubscriptionDetails().getManagementType()), com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(success.getSubscriptionDetails().getType())));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zL7CIUNfqhttBwF-HEo1MYScfjU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19847$r8$lambda$zL7CIUNfqhttBwFHEo1MYScfjU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel) {
        appNavigator.navigate(new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$$ExternalSyntheticLambda9(subscriptionDetailViewModel));
        return kotlin.Unit.INSTANCE;
    }
}
