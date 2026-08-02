package com.paypal.oslo.feature.subscriptions.linkagreements.di;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0013\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;", "analyticsScreenProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideLinkAgreementsEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)Lkotlin/jvm/functions/Function1;", "provideLinkAgreementSearchEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;", "configuredBottomSheetConfigProvider", "provideLinkAgreementHowToEntryProvider", "(Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideLinkAgreementsEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.$r8$lambda$BRgEv4aZhV850LgqTfNjYoMHLnw(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideLinkAgreementSearchEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.m19895$r8$lambda$Nmqhm4MSkupheAFCTV0JI15o7o(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideLinkAgreementHowToEntryProvider(final com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuredBottomSheetConfigProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.$r8$lambda$EDh07EgiIjGEIkgjrXwZkOMiSnY(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BRgEv4aZhV850LgqTfNjYoMHLnw(final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-796223811, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.$r8$lambda$Vm1e3TQfWJeRl4zHFbMqLgkbXEg(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, appNavigator, (com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$provideLinkAgreementsEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination linkSubscriptionsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(linkSubscriptionsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$provideLinkAgreementsEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination linkSubscriptionsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1388658456, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.m19896$r8$lambda$YlRMrKck8wXofLWbFku31dM_iY(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, appNavigator, (com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$provideLinkAgreementsEntryProvider$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination linkBusinessesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(linkBusinessesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$provideLinkAgreementsEntryProvider$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination linkBusinessesDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EDh07EgiIjGEIkgjrXwZkOMiSnY(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map baseSubscriptionsBottomSheetsMetadata$default = com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.getBaseSubscriptionsBottomSheetsMetadata$default(configuredBottomSheetConfigProvider, null, null, null, 7, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19894getLambda$1409054408$subscriptions_prodRelease = com.paypal.oslo.feature.subscriptions.linkagreements.di.ComposableSingletons$NavigationModuleKt.INSTANCE.m19894getLambda$1409054408$subscriptions_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$provideLinkAgreementHowToEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination linkAgreementHowToBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(linkAgreementHowToBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$provideLinkAgreementHowToEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementHowToBottomSheetDestination linkAgreementHowToBottomSheetDestination) {
                return baseSubscriptionsBottomSheetsMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) m19894getLambda$1409054408$subscriptions_prodRelease);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel $r8$lambda$ItPDkmzlywAacEMqnSLO1lX3730(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE);
    }

    /* renamed from: $r8$lambda$Nmqhm4MSkupheA-FCTV0JI15o7o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19895$r8$lambda$Nmqhm4MSkupheAFCTV0JI15o7o(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-855461702, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.$r8$lambda$nWW_0nJaYi4FGHpwjRaCG4f_e04(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementsSearchDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementsSearchDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementsSearchDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$provideLinkAgreementSearchEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementsSearchDestination linkAgreementsSearchDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(linkAgreementsSearchDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementsSearchDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$provideLinkAgreementSearchEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementsSearchDestination linkAgreementsSearchDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vm1e3TQfWJeRl4zHFbMqLgkbXEg(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.navigation.LinkSubscriptionsDestination linkSubscriptionsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSubscriptionsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-796223811, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.provideLinkAgreementsEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:59)");
        }
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.linkAgreementScreen(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2057601307, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.m19897$r8$lambda$a944bBkghIdE_XhkHQ1m7ob9O4(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YlRMrK-ck8wXofLWbFku31dM_iY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19896$r8$lambda$YlRMrKck8wXofLWbFku31dM_iY(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.navigation.LinkBusinessesDestination linkBusinessesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkBusinessesDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1388658456, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.provideLinkAgreementsEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:84)");
        }
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.linkAgreementScreen(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2127883574, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.m19898$r8$lambda$fCcOIcyd2_jDOVBTN5QCvytpsE(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel $r8$lambda$a5DRlt9HbsXEN7R74B5H4JEukko(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE);
    }

    /* renamed from: $r8$lambda$a944bBkghIdE_XhkHQ1m7ob9O-4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19897$r8$lambda$a944bBkghIdE_XhkHQ1m7ob9O4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2057601307, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.provideLinkAgreementsEntryProvider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:63)");
            }
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription subscription = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE;
            androidx.compose.ui.Modifier displayCutoutPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE)));
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.$r8$lambda$a5DRlt9HbsXEN7R74B5H4JEukko((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt.LinkAgreementsScreen(appNavigator, subscription, (com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), displayCutoutPadding, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fCcOIcyd-2_jDOVBTN5QCvytpsE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19898$r8$lambda$fCcOIcyd2_jDOVBTN5QCvytpsE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2127883574, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.provideLinkAgreementsEntryProvider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:88)");
            }
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business business = com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE;
            androidx.compose.ui.Modifier displayCutoutPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE)));
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.$r8$lambda$ItPDkmzlywAacEMqnSLO1lX3730((com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsScreenKt.LinkAgreementsScreen(appNavigator, business, (com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), displayCutoutPadding, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nWW_0nJaYi4FGHpwjRaCG4f_e04(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.shared.navigation.LinkAgreementsSearchDestination linkAgreementsSearchDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkAgreementsSearchDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(linkAgreementsSearchDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-855461702, i, -1, "com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.provideLinkAgreementSearchEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:115)");
            }
            final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementTypeFromString = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(linkAgreementsSearchDestination.getAgreementType());
            boolean changedInstance = composer.changedInstance(agreementTypeFromString);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.linkagreements.di.NavigationModule.$r8$lambda$zBvcEnTOUA74gV3G05Ja5RrSfng(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.this, (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchScreenKt.LinkAgreementsSearchScreen(appNavigator, (com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE))), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel $r8$lambda$zBvcEnTOUA74gV3G05Ja5RrSfng(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(agreementType);
    }
}
