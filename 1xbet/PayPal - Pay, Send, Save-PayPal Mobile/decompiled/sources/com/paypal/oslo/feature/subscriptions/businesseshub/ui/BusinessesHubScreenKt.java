package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0080@¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"BusinessesHubScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "onFooterLinkClick", "Lkotlin/Function2;", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubViewModel;Landroidx/compose/runtime/Composer;II)V", "collectBusinessHubUiEffects", "(Lcom/paypal/oslo/feature/subscriptions/businesseshub/ui/BusinessesHubViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onNavigateToLinkBusinesses", "BusinessesHubScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BusinessesHubScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BusinessesHubScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel4;
        androidx.compose.ui.Modifier modifier4;
        ?? r12;
        java.lang.String str;
        com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics settingsLinkedBusinessesScreenAnalytics;
        final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel5;
        androidx.compose.ui.Modifier modifier5;
        com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.ErrorStateModule errorStateModule;
        com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.ErrorStateModule errorStateModule2;
        com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.LinkedListModule linkedListModule;
        int i5;
        com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics;
        com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics.EmptyStateModule emptyStateModule;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1935957062);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    businessesHubViewModel2 = businessesHubViewModel;
                    if (startRestartGroup.changedInstance(businessesHubViewModel2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    businessesHubViewModel2 = businessesHubViewModel;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                businessesHubViewModel2 = businessesHubViewModel;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                businessesHubViewModel3 = businessesHubViewModel2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    androidx.compose.ui.Modifier modifier6 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        z = false;
                        i4 &= -7169;
                        businessesHubViewModel4 = (com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                    } else {
                        z = false;
                        businessesHubViewModel4 = businessesHubViewModel2;
                    }
                    modifier4 = modifier6;
                    r12 = z;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    businessesHubViewModel4 = businessesHubViewModel2;
                    r12 = 0;
                    modifier4 = modifier2;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1935957062, i4, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreen (BusinessesHubScreen.kt:64)");
                }
                final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState businessHubState = (com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState) androidx.compose.runtime.SnapshotStateKt.collectAsState(businessesHubViewModel4.getState(), null, startRestartGroup, r12, 1).getValue();
                androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(r12, r12, startRestartGroup, r12, 3);
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
                final com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics settingsLinkedBusinessesScreenAnalytics2 = settingsLinkedBusinessesScreenAnalytics;
                java.lang.String linkFlowRequestId = businessesHubViewModel4.getLinkFlowRequestId();
                boolean changedInstance = startRestartGroup.changedInstance(businessesHubViewModel4);
                com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$1$1(businessesHubViewModel4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, r12);
                com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19792invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19792invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(linkFlowRequestId, resolveNavResultManager, function22, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                java.lang.String agreementUpdateRequestId = businessesHubViewModel4.getAgreementUpdateRequestId();
                boolean changedInstance2 = startRestartGroup.changedInstance(businessesHubViewModel4);
                com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$2$1(businessesHubViewModel4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, r12);
                com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$$inlined$NavResultEffectrtGRyWw$2 rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19793invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19793invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(agreementUpdateRequestId, resolveNavResultManager2, function23, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(businessesHubViewModel4);
                boolean z2 = (i4 & 14) == 4 ? true : r12;
                com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$3$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | z2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$3$1(businessesHubViewModel4, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, r12);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r12));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                int i8 = r12;
                int i9 = i4;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_hub_title, startRestartGroup, r12), null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-613590317, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.$r8$lambda$xvgEjOoy_VkiToBdNKhGPoEJ3wQ(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.this, settingsLinkedBusinessesScreenAnalytics2, businessesHubViewModel4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 1572864, 62);
                com.paypal.oslo.feature.subscriptions.analytics.shared.ModuleAnalytics moduleAnalytics2 = null;
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                if (businessHubState instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState) {
                    startRestartGroup.startReplaceGroup(-1475644332);
                    boolean shouldShowLinkEntryPoints = ((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.ZeroState) businessHubState).getShouldShowLinkEntryPoints();
                    if (settingsLinkedBusinessesScreenAnalytics2 == null || (emptyStateModule = settingsLinkedBusinessesScreenAnalytics2.getEmptyStateModule()) == null) {
                        i5 = i8;
                        moduleAnalytics = null;
                    } else {
                        moduleAnalytics = com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(emptyStateModule, null, null, java.lang.Integer.valueOf(i8), null, 11, null);
                        i5 = i8;
                    }
                    androidx.compose.ui.Modifier subscriptionsAnalyticsModule = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(weight$default, moduleAnalytics, startRestartGroup, i5);
                    boolean changedInstance4 = startRestartGroup.changedInstance(businessesHubViewModel4);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.m19791$r8$lambda$n7Y5bvDhAEEeS9dCZ1YmuFdOB8(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubZeroStateScreenKt.BusinessesHubZeroStateScreen(subscriptionsAnalyticsModule, shouldShowLinkEntryPoints, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0, 0);
                    composer2.endReplaceGroup();
                    businessesHubViewModel5 = businessesHubViewModel4;
                    modifier5 = modifier4;
                } else {
                    composer2 = startRestartGroup;
                    if (businessHubState instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList) {
                        composer2.startReplaceGroup(-1475082922);
                        com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList linkedBusinessesList = (com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList) businessHubState;
                        boolean changedInstance5 = composer2.changedInstance(businessesHubViewModel4);
                        com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$4$3$1 rememberedValue7 = composer2.rememberedValue();
                        if (changedInstance5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$BusinessesHubScreen$4$3$1(businessesHubViewModel4);
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue7;
                        if (settingsLinkedBusinessesScreenAnalytics2 != null && (linkedListModule = settingsLinkedBusinessesScreenAnalytics2.getLinkedListModule()) != null) {
                            moduleAnalytics2 = com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(linkedListModule, null, null, java.lang.Integer.valueOf(i8), null, 11, null);
                        }
                        businessesHubViewModel5 = businessesHubViewModel4;
                        modifier5 = modifier4;
                        com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessesListContentKt.LinkedBusinessesListContent(linkedBusinessesList, function2, (kotlin.jvm.functions.Function1) kFunction, rememberLazyListState, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(weight$default, moduleAnalytics2, composer2, i8), composer2, i9 & 112, 0);
                        composer2.endReplaceGroup();
                    } else {
                        businessesHubViewModel5 = businessesHubViewModel4;
                        modifier5 = modifier4;
                        if ((businessHubState instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Loading) || kotlin.jvm.internal.Intrinsics.areEqual(businessHubState, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Initial.INSTANCE)) {
                            composer2.startReplaceGroup(90981900);
                            com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubLoadingScreenKt.BusinessesHubLoadingScreen(weight$default, composer2, i8, i8);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(businessHubState instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error)) {
                                composer2.startReplaceGroup(90945316);
                                composer2.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(90985048);
                            boolean changedInstance6 = composer2.changedInstance(businessesHubViewModel5);
                            java.lang.Object rememberedValue8 = composer2.rememberedValue();
                            if (changedInstance6 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.m19790$r8$lambda$jNicMz4nco07g3gIVfLpYUVhCw(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue8);
                            }
                            com.paypal.oslo.feature.subscriptions.shared.ui.error.ErrorScreenKt.ErrorScreen((kotlin.jvm.functions.Function0) rememberedValue8, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsModule(weight$default, (settingsLinkedBusinessesScreenAnalytics2 == null || (errorStateModule2 = settingsLinkedBusinessesScreenAnalytics2.getErrorStateModule()) == null) ? null : com.paypal.oslo.feature.subscriptions.analytics.shared.SubscriptionsAnalyticsModule.moduleCtx$default(errorStateModule2, kotlin.collections.CollectionsKt.listOf(((com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.Error) businessHubState).getErrorContext()), null, java.lang.Integer.valueOf(i8), null, 10, null), composer2, i8), (settingsLinkedBusinessesScreenAnalytics2 == null || (errorStateModule = settingsLinkedBusinessesScreenAnalytics2.getErrorStateModule()) == null) ? null : errorStateModule.tryAgainButton(), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        }
                    }
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                businessesHubViewModel3 = businessesHubViewModel5;
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.$r8$lambda$lqWeSik1T6vsPGYGDL8lefImfC8(com.paypal.oslo.core.navigation.AppNavigator.this, function2, modifier3, businessesHubViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.Object collectBusinessHubUiEffects(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = businessesHubViewModel.getUiEffect().collect(new com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$collectBusinessHubUiEffects$2(appNavigator, businessesHubViewModel), continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final void onNavigateToLinkBusinesses(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessesHubViewModel, "");
        appNavigator.m11575navigateForResultInternaluBl809w(businessesHubViewModel.getLinkFlowRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.LinkHubFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.$r8$lambda$IMyYhmma8_LedMc1oPJKlsKuLQ4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IMyYhmma8_LedMc1oPJKlsKuLQ4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination(com.paypal.oslo.feature.subscriptions.api.navigation.DeepLinkTrafficSource.InApp.getRaw()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S8pxRF4V4axX_mrLt7Ewg1c2j6Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1833872910);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1833872910, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenPreview (BusinessesHubScreen.kt:241)");
            }
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.$r8$lambda$TBpWEU6mVawICfhXA8qJ6Dm7YZw((java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BusinessesHubScreen(appNavigator, (kotlin.jvm.functions.Function2) rememberedValue, null, null, startRestartGroup, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.$r8$lambda$S8pxRF4V4axX_mrLt7Ewg1c2j6Q(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TBpWEU6mVawICfhXA8qJ6Dm7YZw(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TKo5_7AbDaJuUpdbBUKUe_EWAxs(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel) {
        businessesHubViewModel.onEvent(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnInfoClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jNicMz4nco07g3gIV-fLpYUVhCw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19790$r8$lambda$jNicMz4nco07g3gIVfLpYUVhCw(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel) {
        businessesHubViewModel.loadBusinessAgreements();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lqWeSik1T6vsPGYGDL8lefImfC8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BusinessesHubScreen(appNavigator, function2, modifier, businessesHubViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$n7Y5bvDhAEEeS9dCZ1YmuFdO-B8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19791$r8$lambda$n7Y5bvDhAEEeS9dCZ1YmuFdOB8(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel) {
        businessesHubViewModel.onEvent(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnLinkBusinessesClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ts6UHpUVrAIEpRJAnfNQXKd8Az8(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel) {
        businessesHubViewModel.onEvent(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubUiEvent.OnCloseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xvgEjOoy_VkiToBdNKhGPoEJ3wQ(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState businessHubState, com.paypal.oslo.feature.subscriptions.analytics.vaultedbusinesses.SettingsLinkedBusinessesScreenAnalytics settingsLinkedBusinessesScreenAnalytics, final com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel businessesHubViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-613590317, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreen.<anonymous>.<anonymous> (BusinessesHubScreen.kt:99)");
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
            if (businessHubState instanceof com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessHubState.LinkedBusinessesList) {
                composer.startReplaceGroup(-532824601);
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.core.Icon.Info info = com.paypal.pds.core.Icon.Info.INSTANCE;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_info_content_description, composer, 0);
                androidx.compose.ui.Modifier subscriptionsAnalyticsItem = com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, settingsLinkedBusinessesScreenAnalytics != null ? settingsLinkedBusinessesScreenAnalytics.infoButton() : null);
                com.paypal.pds.core.Icon.Info info2 = info;
                boolean changedInstance = composer.changedInstance(businessesHubViewModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.$r8$lambda$TKo5_7AbDaJuUpdbBUKUe_EWAxs(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.IconButtonKt.IconButton(info2, (kotlin.jvm.functions.Function0) rememberedValue, subscriptionsAnalyticsItem, tertiary, null, stringResource, null, false, false, composer, 3078, 464);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-532075021);
                composer.endReplaceGroup();
            }
            boolean changedInstance2 = composer.changedInstance(businessesHubViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.$r8$lambda$ts6UHpUVrAIEpRJAnfNQXKd8Az8(com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton((kotlin.jvm.functions.Function0) rememberedValue2, com.paypal.oslo.feature.subscriptions.analytics.shared.CommonScreenAnalyticsKt.toSubscriptionsAnalyticsItem(androidx.compose.ui.Modifier.INSTANCE, settingsLinkedBusinessesScreenAnalytics != null ? settingsLinkedBusinessesScreenAnalytics.closeButton() : null), null, composer, 0, 4);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
