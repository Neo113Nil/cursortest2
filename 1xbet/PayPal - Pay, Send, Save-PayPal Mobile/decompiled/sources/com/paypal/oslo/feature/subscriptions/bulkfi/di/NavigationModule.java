package com.paypal.oslo.feature.subscriptions.bulkfi.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;", "navigationCache", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;", "analyticsScreenProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideBulkUpdateFiEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/shared/navigation/BulkUpdateFiNavigationCache;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)Lkotlin/jvm/functions/Function1;", "provideBulkUpdateFiPostUpdateScreenEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBulkUpdateFiEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache navigationCache, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.$r8$lambda$2xDsTQdwdDy2HgaqHYjcXw0nD_I(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, navigator, navigationCache, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBulkUpdateFiPostUpdateScreenEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.$r8$lambda$ZxycdEWpRn5ieLXKSYZ5AtlWtno(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2xDsTQdwdDy2HgaqHYjcXw0nD_I(final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1415402522, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.$r8$lambda$TTRAKrY06WjJxIY0_Am_TmzAHV8(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, appNavigator, bulkUpdateFiNavigationCache, (com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$provideBulkUpdateFiEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination bulkUpdateFiDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bulkUpdateFiDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$provideBulkUpdateFiEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination bulkUpdateFiDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BEnnR9TraL7vsF3V33QNGd3-iVc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19746$r8$lambda$BEnnR9TraL7vsF3V33QNGd3iVc(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel bulkUpdateFiPostUpdateViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2131353326, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.provideBulkUpdateFiPostUpdateScreenEntryProvider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:117)");
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.BulkUpdateFiPostUpdateScreen(bulkUpdateFiPostUpdateViewModel, appNavigator, agreementType, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE))), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BOcFy_Ptv_3bI9rzUJxjrHWjqdY(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel, final java.util.List list, java.util.Map map) {
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel preferredFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel preferredFundingInstrument2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        bulkUpdateFiNavigationCache.setAgreementsMap(map);
        com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) map.get(kotlin.collections.CollectionsKt.firstOrNull(list));
        final java.lang.String id = (subscriptionItemUiModel == null || (preferredFundingInstrument2 = subscriptionItemUiModel.getPreferredFundingInstrument()) == null) ? null : preferredFundingInstrument2.getId();
        java.util.List list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel subscriptionItemUiModel2 = (com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel) map.get((java.lang.String) it.next());
            arrayList.add(java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual((subscriptionItemUiModel2 == null || (preferredFundingInstrument = subscriptionItemUiModel2.getPreferredFundingInstrument()) == null) ? null : preferredFundingInstrument.getId(), id)));
        }
        java.util.ArrayList arrayList2 = arrayList;
        final boolean z = true;
        if (!arrayList2.isEmpty()) {
            java.util.Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((java.lang.Boolean) it2.next()).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        final java.lang.String rawValue = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(agreementType);
        appNavigator.m11575navigateForResultInternaluBl809w(bulkUpdateFiViewModel.getAgreementUpdateRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.result.AgreementUpdatedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.$r8$lambda$oA_4hrZEGNyOIl5rMl0qMrbRSEc(list, rawValue, z, id, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Cg6kdVzhhMZNudyvlvpX9F4H-cw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19747$r8$lambda$Cg6kdVzhhMZNudyvlvpX9F4Hcw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.$r8$lambda$wZOnFTifYqWxAq0BrIXYF2A90Ag((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TTRAKrY06WjJxIY0_Am_TmzAHV8(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination bulkUpdateFiDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1415402522, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.provideBulkUpdateFiEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:59)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementTypeFromRawFlowType = com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.INSTANCE.agreementTypeFromRawFlowType(bulkUpdateFiDestination.getFlowType());
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.bulkFiScreen(agreementTypeFromRawFlowType)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1679488440, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.$r8$lambda$UQCcNUSwbyL3R7JxyGv0hywe148(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel.this, agreementTypeFromRawFlowType, appNavigator, bulkUpdateFiNavigationCache, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UQCcNUSwbyL3R7JxyGv0hywe148(final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache bulkUpdateFiNavigationCache, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1679488440, i, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.provideBulkUpdateFiEntryProvider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:67)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.m19747$r8$lambda$Cg6kdVzhhMZNudyvlvpX9F4Hcw(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance = composer.changedInstance(bulkUpdateFiNavigationCache);
            boolean changedInstance2 = composer.changedInstance(agreementType);
            boolean changed2 = composer.changed(appNavigator);
            boolean changedInstance3 = composer.changedInstance(bulkUpdateFiViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance | changedInstance2 | changed2 | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.$r8$lambda$BOcFy_Ptv_3bI9rzUJxjrHWjqdY(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiNavigationCache.this, agreementType, appNavigator, bulkUpdateFiViewModel, (java.util.List) obj, (java.util.Map) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt.BulkUpdateFiEntryScreen(bulkUpdateFiViewModel, agreementType, function0, (kotlin.jvm.functions.Function2) rememberedValue2, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE))), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZxycdEWpRn5ieLXKSYZ5AtlWtno(final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1304527244, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.$r8$lambda$stSKQxHawCsBr6rHA0j_mJA5Kq4(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, appNavigator, (com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$provideBulkUpdateFiPostUpdateScreenEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination bulkUpdateFiPostUpdateScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(bulkUpdateFiPostUpdateScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$provideBulkUpdateFiPostUpdateScreenEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination bulkUpdateFiPostUpdateScreenDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oA_4hrZEGNyOIl5rMl0qMrbRSEc(java.util.List list, java.lang.String str, boolean z, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        if (!z) {
            str2 = null;
        }
        navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination(list, str, str2, com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.BULK_FI));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$stSKQxHawCsBr6rHA0j_mJA5Kq4(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.shared.navigation.BulkUpdateFiPostUpdateScreenDestination bulkUpdateFiPostUpdateScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bulkUpdateFiPostUpdateScreenDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(bulkUpdateFiPostUpdateScreenDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1304527244, i2, -1, "com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.provideBulkUpdateFiPostUpdateScreenEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:111)");
            }
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel bulkUpdateFiPostUpdateViewModel = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
            final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementTypeFromString = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(bulkUpdateFiPostUpdateScreenDestination.getAgreementType());
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.bulkUpdatePostUpdateScreen(agreementTypeFromString)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2131353326, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.bulkfi.di.NavigationModule.m19746$r8$lambda$BEnnR9TraL7vsF3V33QNGd3iVc(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel.this, appNavigator, agreementTypeFromString, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wZOnFTifYqWxAq0BrIXYF2A90Ag(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
