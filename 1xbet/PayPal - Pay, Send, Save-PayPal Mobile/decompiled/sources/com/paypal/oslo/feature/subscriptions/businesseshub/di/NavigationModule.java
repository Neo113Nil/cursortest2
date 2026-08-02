package com.paypal.oslo.feature.subscriptions.businesseshub.di;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;", "analyticsScreenProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideBusinessesHubEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;", "configuredBottomSheetConfigProvider", "provideAboutBusinessesEntryProvider", "(Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBusinessesHubEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.m19781$r8$lambda$12nBcbkTyDhn8hQE7MNqcj8taE(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAboutBusinessesEntryProvider(final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuredBottomSheetConfigProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.$r8$lambda$qZk5rMxos9zMEh2XZM73vM54euQ(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.this, analyticsScreenProvider, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$12nBc-bkTyDhn8hQE7MNqcj8taE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19781$r8$lambda$12nBcbkTyDhn8hQE7MNqcj8taE(final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1084462292, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.m19783$r8$lambda$UakJ1YKPhl4ikn_NCxtvNJLaQ(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, appNavigator, (com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$provideBusinessesHubEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination businessesHubDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(businessesHubDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$provideBusinessesHubEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination businessesHubDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$381KcDZ6OvaneVL7TQSQe75l3x4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.m19784$r8$lambda$l7BAKQ42xIaHJ15UkqmRv4K1F4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9BNhOq8j8Z-6pX5qpiH7QPva4oQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19782$r8$lambda$9BNhOq8j8Z6pX5qpiH7QPva4oQ(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1436294578, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.provideBusinessesHubEntryProvider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:55)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.$r8$lambda$381KcDZ6OvaneVL7TQSQe75l3x4(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.subscriptions.businesseshub.ui.BusinessesHubScreenKt.BusinessesHubScreen(appNavigator, (kotlin.jvm.functions.Function2) rememberedValue, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE))), null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IR7ljIz2cSHQK3BksPuC85oftgI(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, com.paypal.oslo.feature.subscriptions.shared.navigation.AboutBusinessesBottomSheetDestination aboutBusinessesBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aboutBusinessesBottomSheetDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(676135859, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.provideAboutBusinessesEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:82)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.businessesHubInfoScreen()), com.paypal.oslo.feature.subscriptions.businesseshub.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$1092753523$subscriptions_prodRelease(), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ua-kJ1YKPhl4ikn_NC-xtvNJLaQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19783$r8$lambda$UakJ1YKPhl4ikn_NCxtvNJLaQ(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.navigation.BusinessesHubDestination businessesHubDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessesHubDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1084462292, i, -1, "com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.provideBusinessesHubEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:51)");
        }
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.businessesHubScreen()), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1436294578, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.m19782$r8$lambda$9BNhOq8j8Z6pX5qpiH7QPva4oQ(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$l7BAKQ42xIaHJ15UkqmRv4K1F-4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19784$r8$lambda$l7BAKQ42xIaHJ15UkqmRv4K1F4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionsHubDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qZk5rMxos9zMEh2XZM73vM54euQ(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map baseSubscriptionsBottomSheetsMetadata$default = com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.getBaseSubscriptionsBottomSheetsMetadata$default(configuredBottomSheetConfigProvider, null, null, null, 7, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(676135859, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule.$r8$lambda$IR7ljIz2cSHQK3BksPuC85oftgI(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, (com.paypal.oslo.feature.subscriptions.shared.navigation.AboutBusinessesBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutBusinessesBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.AboutBusinessesBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$provideAboutBusinessesEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutBusinessesBottomSheetDestination aboutBusinessesBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(aboutBusinessesBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.AboutBusinessesBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.di.NavigationModule$provideAboutBusinessesEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutBusinessesBottomSheetDestination aboutBusinessesBottomSheetDestination) {
                return baseSubscriptionsBottomSheetsMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}
