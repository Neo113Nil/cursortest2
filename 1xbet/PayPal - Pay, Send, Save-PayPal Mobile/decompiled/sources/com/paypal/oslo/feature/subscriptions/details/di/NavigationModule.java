package com.paypal.oslo.feature.subscriptions.details.di;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JB\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0015\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;", "activityWidgetProvider", "Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;", "analyticsScreenProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideSubscriptionDetailsEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/activity/api/provider/IActivityWidgetProvider;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)Lkotlin/jvm/functions/Function1;", "provideDetailsManageBottomSheetsEntryProvider", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;", "configuredBottomSheetConfigProvider", "provideAboutAgreementDetailsEntryProvider", "(Lcom/paypal/oslo/feature/subscriptions/di/ConfiguredBottomSheetConfigProvider;Lcom/paypal/oslo/feature/subscriptions/analytics/shared/AnalyticsScreenProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.details.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.subscriptions.details.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideSubscriptionDetailsEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider activityWidgetProvider, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityWidgetProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.m19814$r8$lambda$bTlIqnhM2YlU72_t8APJ0ku3Lk(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, navigator, activityWidgetProvider, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideDetailsManageBottomSheetsEntryProvider(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.$r8$lambda$JedDU9wqp0anaFEJz4cYd5En7eQ(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideAboutAgreementDetailsEntryProvider(final com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuredBottomSheetConfigProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsScreenProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.$r8$lambda$rGwxikjczPjLiXhn4zRw6IMypco(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.this, analyticsScreenProvider, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel $r8$lambda$C9QI1sy39ACtJVBbbd8CSXeof8o(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(agreementType);
    }

    /* renamed from: $r8$lambda$FNGcI9Tt84gHotQzR-tFMwF7U0E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19809$r8$lambda$FNGcI9Tt84gHotQzRtFMwF7U0E(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1551181778, i, -1, "com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.provideDetailsManageBottomSheetsEntryProvider.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:103)");
            }
            com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetScreenKt.ManageAgreementBottomSheetScreen(appNavigator, manageAgreementViewModel, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 384, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JedDU9wqp0anaFEJz4cYd5En7eQ(final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 119, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1456157934, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.m19812$r8$lambda$RqWeyCMmoAawpp0ryIwGrATphw(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, appNavigator, (com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$provideDetailsManageBottomSheetsEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination manageAgreementBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(manageAgreementBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$provideDetailsManageBottomSheetsEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination manageAgreementBottomSheetDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KurIOGEHd9TUVIwBYI7msolb9-E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19810$r8$lambda$KurIOGEHd9TUVIwBYI7msolb9E(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination aboutAgreementDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aboutAgreementDetailsDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(aboutAgreementDetailsDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1192360386, i, -1, "com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.provideAboutAgreementDetailsEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:121)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.agreementDetailsInfoScreen(com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(aboutAgreementDetailsDestination.getAgreementType()))), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(85126402, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.m19811$r8$lambda$OE13zuEE9SR9h65q5Tsb7nEric(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* renamed from: $r8$lambda$OE13zuEE9-SR9h65q5Tsb7nEric, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19811$r8$lambda$OE13zuEE9SR9h65q5Tsb7nEric(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination aboutAgreementDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(85126402, i, -1, "com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.provideAboutAgreementDetailsEntryProvider.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:125)");
            }
            com.paypal.oslo.feature.subscriptions.details.ui.AboutAgreementDetailsModalScreenKt.AboutAgreementDetailsModalScreen(aboutAgreementDetailsDestination, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, composer, 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PQGYZNfdSE0LsweXc1ypIGMu2xs(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, final com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination subscriptionDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionDetailsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-902589586, i, -1, "com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.provideSubscriptionDetailsEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:59)");
        }
        java.lang.String agreementType = subscriptionDetailsDestination.getAgreementType();
        final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementTypeFromString = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(agreementType != null ? agreementType : "");
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.agreementDetailsScreen(agreementTypeFromString)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1452555316, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.$r8$lambda$U_1hXDiawRfpikJKA0URg8mZiDs(com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination.this, agreementTypeFromString, appNavigator, iActivityWidgetProvider, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RqWey-CMmoAawpp0ryIwGrATphw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19812$r8$lambda$RqWeyCMmoAawpp0ryIwGrATphw(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination manageAgreementBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageAgreementBottomSheetDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(manageAgreementBottomSheetDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1456157934, i2, -1, "com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.provideDetailsManageBottomSheetsEntryProvider.<anonymous>.<anonymous> (NavigationModule.kt:94)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.m19813$r8$lambda$Xz7fiBc9ltiFvVFVW8rXDgtOQk(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination.this, (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel = (com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsCompositionLocalKt.getLocalScreenAnalytics().provides(analyticsScreenProvider.agreementDetailsManageScreen(com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(manageAgreementBottomSheetDestination.getAgreementType()))), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1551181778, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.m19809$r8$lambda$FNGcI9Tt84gHotQzRtFMwF7U0E(com.paypal.oslo.core.navigation.AppNavigator.this, manageAgreementViewModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$U_1hXDiawRfpikJKA0URg8mZiDs(com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination subscriptionDetailsDestination, final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1452555316, i, -1, "com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.provideSubscriptionDetailsEntryProvider.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:64)");
            }
            java.lang.String agreementId = subscriptionDetailsDestination.getAgreementId();
            boolean changedInstance = composer.changedInstance(agreementType);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.$r8$lambda$C9QI1sy39ACtJVBbbd8CSXeof8o(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.this, (com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt.SubscriptionDetailsEntryScreen(agreementId, (com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), appNavigator, iActivityWidgetProvider, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.displayCutoutPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE))), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Xz7-fiBc9ltiFvVFVW8rXDgtOQk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel m19813$r8$lambda$Xz7fiBc9ltiFvVFVW8rXDgtOQk(com.paypal.oslo.feature.subscriptions.shared.navigation.ManageAgreementBottomSheetDestination manageAgreementBottomSheetDestination, com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(manageAgreementBottomSheetDestination);
    }

    /* renamed from: $r8$lambda$bTl-IqnhM2YlU72_t8APJ0ku3Lk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19814$r8$lambda$bTlIqnhM2YlU72_t8APJ0ku3Lk(final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.activity.api.provider.IActivityWidgetProvider iActivityWidgetProvider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-902589586, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.$r8$lambda$PQGYZNfdSE0LsweXc1ypIGMu2xs(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, appNavigator, iActivityWidgetProvider, (com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$provideSubscriptionDetailsEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination subscriptionDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(subscriptionDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$provideSubscriptionDetailsEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.api.navigation.SubscriptionDetailsDestination subscriptionDetailsDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rGwxikjczPjLiXhn4zRw6IMypco(com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider configuredBottomSheetConfigProvider, final com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider analyticsScreenProvider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map baseSubscriptionsBottomSheetsMetadata$default = com.paypal.oslo.feature.subscriptions.di.ConfiguredBottomSheetConfigProvider.getBaseSubscriptionsBottomSheetsMetadata$default(configuredBottomSheetConfigProvider, null, null, null, 7, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1192360386, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.subscriptions.details.di.NavigationModule.m19810$r8$lambda$KurIOGEHd9TUVIwBYI7msolb9E(com.paypal.oslo.feature.subscriptions.analytics.shared.AnalyticsScreenProvider.this, (com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$provideAboutAgreementDetailsEntryProvider$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination aboutAgreementDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(aboutAgreementDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.subscriptions.details.di.NavigationModule$provideAboutAgreementDetailsEntryProvider$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.subscriptions.shared.navigation.AboutAgreementDetailsDestination aboutAgreementDetailsDestination) {
                return baseSubscriptionsBottomSheetsMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }
}
