package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0004\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\t¢\u0006\u0002\b\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/NavigationModule;", "", "<init>", "()V", "provideEntryProviderInstaller", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lkotlin/ExtensionFunctionType;", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "inAppCheckoutWebViewCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutWebViewCoordinator;", "logger", "Lcom/paypal/oslo/feature/inappcheckout/features/logger/CheckoutLogger;", "navResultManager", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "analyticsTracer", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "nativeInAppWebViewAnalyticsTracker", "Lcom/paypal/oslo/feature/inappcheckout/analytics/nativeinappwebview/NativeInAppWebViewAnalyticsTracker;", "inappcheckout_prodRelease", "webViewState", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/WebViewContract$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.inappcheckout.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger logger, final com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker nativeInAppWebViewAnalyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutWebViewCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewAnalyticsTracker, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$QQdcOE7R3EUjWyToVVLnxs8qyb8(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, inAppCheckoutWebViewCoordinator, logger, navResultManager, analyticsTracer, nativeInAppWebViewAnalyticsTracker, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1S463EHgooYpZVGcHpH8adYPx1M(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination eConsentDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-889297537, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:164)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.EConsentScreenKt.EConsentScreen(inAppCheckoutCoordinator, eConsentDestination.getData(), (com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), checkoutLogger, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7GVRE6531nPsUrk2fP33RRlLibc(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.route.AddCardDestination addCardDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1501335380, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:151)");
            }
            com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.CardFormScreen(inAppCheckoutCoordinator, null, null, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.ADD, null, composer, 3072, 22);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CC0kYsWS9CYchSDJtqz6D96yT_A(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.feature.inappcheckout.api.navigation.CheckoutDestination checkoutDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1753492483, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:82)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.inappcheckout.ui.entry.screen.AppSwitchEntryScreenKt.AppSwitchEntryScreen(inAppCheckoutCoordinator, inAppCheckoutWebViewCoordinator, checkoutLogger, (com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), navResultManager, composer, com.paypal.oslo.core.navigation.result.NavResultManager.$stable << 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F6U8y13A2emit0ivKEFC5kVLVIg(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.api.navigation.MockSelectionDestination mockSelectionDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mockSelectionDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1525808843, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:110)");
        }
        com.paypal.oslo.feature.inappcheckout.ui.mock.mockselection.screen.MockSelectionScreenKt.MockSelectionScreen(inAppCheckoutCoordinator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G-yRKW43rzijNShjfB0iygSCaUQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15423$r8$lambda$GyRKW43rzijNShjfB0iygSCaUQ(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, final com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewCheckoutDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(webViewCheckoutDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(851266679, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:94)");
            }
            com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutWindowInsetsWrapperKt.InAppCheckoutWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(347366591, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.m15425$r8$lambda$Tx5_HcTxp32fUt6hzobscHxK5E(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination.this, inAppCheckoutCoordinator, checkoutLogger, analyticsTracer, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GhY1eo5OlYGqjG9GCwTyN2ddGG4(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator) {
        com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.navigateBack$default(inAppCheckoutCoordinator, null, false, 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GnnD9t40IBOpdsksebWBGV4owv0(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination errorDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(errorDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(391915348, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:144)");
            }
            com.paypal.oslo.feature.inappcheckout.ui.error.screen.ErrorScreenKt.ErrorScreen(inAppCheckoutCoordinator, null, errorDestination.getErrorScreenType(), errorDestination.getReturnUrl(), null, composer, 0, 18);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HOxa0NLvUB9awLYffaI9LPFjw2s(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.navigation.route.RypDestination rypDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rypDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(881819760, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:122)");
        }
        com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypScreenKt.RypScreen(inAppCheckoutCoordinator, rypDestination.getAuthenticationXOResponse(), checkoutLogger, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Kx44sedylQMu2W21HeC0LnBARfg(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.route.ThanksDestination thanksDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thanksDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(thanksDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1262467435, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:180)");
            }
            com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.ThanksScreen(inAppCheckoutCoordinator, thanksDestination.getThanksScreenData(), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QQdcOE7R3EUjWyToVVLnxs8qyb8(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutWebViewCoordinator inAppCheckoutWebViewCoordinator, final com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, final com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, final com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker nativeInAppWebViewAnalyticsTracker, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        final java.util.Map map;
        final java.util.Map map2;
        final java.util.Map map3;
        final java.util.Map map4;
        final java.util.Map map5;
        final java.util.Map map6;
        final java.util.Map map7;
        final java.util.Map map8;
        final java.util.Map map9;
        final java.util.Map map10;
        final java.util.Map map11;
        final java.util.Map map12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        map = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1753492483, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$CC0kYsWS9CYchSDJtqz6D96yT_A(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, inAppCheckoutWebViewCoordinator, checkoutLogger, navResultManager, (com.paypal.oslo.feature.inappcheckout.api.navigation.CheckoutDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.api.navigation.CheckoutDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.api.navigation.CheckoutDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.api.navigation.CheckoutDestination checkoutDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(checkoutDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.api.navigation.CheckoutDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.api.navigation.CheckoutDestination checkoutDestination) {
                return map;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        map2 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(851266679, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.m15423$r8$lambda$GyRKW43rzijNShjfB0iygSCaUQ(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, checkoutLogger, analyticsTracer, (com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(webViewCheckoutDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination) {
                return map2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        map3 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1525808843, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$F6U8y13A2emit0ivKEFC5kVLVIg(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, (com.paypal.oslo.feature.inappcheckout.api.navigation.MockSelectionDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.api.navigation.MockSelectionDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.api.navigation.MockSelectionDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.api.navigation.MockSelectionDestination mockSelectionDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(mockSelectionDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.api.navigation.MockSelectionDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.api.navigation.MockSelectionDestination mockSelectionDestination) {
                return map3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        map4 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-167015912, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$Z2h21tBUiEgZIFaPejNpnxn6wnY(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, checkoutLogger, (com.paypal.oslo.feature.inappcheckout.navigation.route.OneShotDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.OneShotDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.OneShotDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.OneShotDestination oneShotDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(oneShotDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.OneShotDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.OneShotDestination oneShotDestination) {
                return map4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        map5 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(881819760, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$HOxa0NLvUB9awLYffaI9LPFjw2s(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, checkoutLogger, (com.paypal.oslo.feature.inappcheckout.navigation.route.RypDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.RypDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.RypDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.RypDestination rypDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(rypDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.RypDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.RypDestination rypDestination) {
                return map5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        map6 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1211018285, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$e3KdKYNq0EMl_kOhWrOZ846Oc_c(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, checkoutLogger, (com.paypal.oslo.feature.inappcheckout.navigation.route.InstantVaultDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.InstantVaultDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.InstantVaultDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.InstantVaultDestination instantVaultDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(instantVaultDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.InstantVaultDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.InstantVaultDestination instantVaultDestination) {
                return map6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        map7 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1450395438, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$qs0uxE8Dg9x_trDuhFgmmL6burM(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, (com.paypal.oslo.feature.inappcheckout.navigation.route.ProfileDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.ProfileDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.ProfileDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.ProfileDestination profileDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(profileDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.ProfileDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.ProfileDestination profileDestination) {
                return map7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        map8 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(391915348, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$GnnD9t40IBOpdsksebWBGV4owv0(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, (com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination errorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(errorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.ErrorDestination errorDestination) {
                return map8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        map9 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1501335380, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$7GVRE6531nPsUrk2fP33RRlLibc(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, (com.paypal.oslo.feature.inappcheckout.navigation.route.AddCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.AddCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.AddCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.AddCardDestination addCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.AddCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.AddCardDestination addCardDestination) {
                return map9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        map10 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1413798801, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.m15426$r8$lambda$UzaBrYRIHhIr7th5iVWSxvc7m8(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, (com.paypal.oslo.feature.inappcheckout.navigation.route.UpdateCardDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.UpdateCardDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.UpdateCardDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.UpdateCardDestination updateCardDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(updateCardDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.UpdateCardDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.UpdateCardDestination updateCardDestination) {
                return map10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        map11 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-889297537, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$1S463EHgooYpZVGcHpH8adYPx1M(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, checkoutLogger, (com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination eConsentDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(eConsentDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.EConsentDestination eConsentDestination) {
                return map11;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance11);
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(679319487, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.m15424$r8$lambda$Tre6m96e7iXE6tPkTDSWjgmcB8(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, nativeInAppWebViewAnalyticsTracker, (com.paypal.oslo.feature.inappcheckout.navigation.route.NativeInAppWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.NativeInAppWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.NativeInAppWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.NativeInAppWebViewDestination nativeInAppWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(nativeInAppWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.NativeInAppWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$24
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.NativeInAppWebViewDestination nativeInAppWebViewDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance12);
        map12 = com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1262467435, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$Kx44sedylQMu2W21HeC0LnBARfg(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, (com.paypal.oslo.feature.inappcheckout.navigation.route.ThanksDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.navigation.route.ThanksDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.ThanksDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.ThanksDestination thanksDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(thanksDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.navigation.route.ThanksDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$26
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.inappcheckout.navigation.route.ThanksDestination thanksDestination) {
                return map12;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance13);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Tr-e6m96e7iXE6tPkTDSWjgmcB8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15424$r8$lambda$Tre6m96e7iXE6tPkTDSWjgmcB8(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.analytics.nativeinappwebview.NativeInAppWebViewAnalyticsTracker nativeInAppWebViewAnalyticsTracker, com.paypal.oslo.feature.inappcheckout.navigation.route.NativeInAppWebViewDestination nativeInAppWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeInAppWebViewDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(nativeInAppWebViewDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(679319487, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:173)");
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.NativeInAppWebViewData nativeInAppWebViewData = nativeInAppWebViewDestination.getNativeInAppWebViewData();
            boolean changed = composer.changed(inAppCheckoutCoordinator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$GhY1eo5OlYGqjG9GCwTyN2ddGG4(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.inappcheckout.ui.econsent.screen.NativeInAppWebViewScreenKt.NativeInAppWebViewScreen(nativeInAppWebViewData, (kotlin.jvm.functions.Function0) rememberedValue, nativeInAppWebViewAnalyticsTracker, null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Tx5_HcTxp32fUt6hz-obscHxK5E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15425$r8$lambda$Tx5_HcTxp32fUt6hzobscHxK5E(final com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(347366591, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:95)");
            }
            boolean changed = composer.changed(webViewCheckoutDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.di.NavigationModule$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.di.NavigationModule.$r8$lambda$YLdVkRDpScpzZpggRrFuMhXoIfk(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination.this, (com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel appSwitchWebViewViewModel = (com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0);
            com.paypal.oslo.feature.inappcheckout.features.webview.screen.AppSwitchWebViewScreenKt.AppSwitchWebViewScreen(((com.paypal.oslo.feature.inappcheckout.features.webview.WebViewContract.State) androidx.compose.runtime.SnapshotStateKt.collectAsState(appSwitchWebViewViewModel.getState(), null, composer, 0, 1).getValue()).getState(), appSwitchWebViewViewModel.getEffect(), com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.access$rememberWebViewScreenActions(appSwitchWebViewViewModel, inAppCheckoutCoordinator, composer, 0), com.paypal.oslo.feature.inappcheckout.di.NavigationModuleKt.access$rememberNonRecoverableActions(appSwitchWebViewViewModel, composer, 0), checkoutLogger, analyticsTracer, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Uza-BrYRIHhIr7th5iVWSxvc7m8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15426$r8$lambda$UzaBrYRIHhIr7th5iVWSxvc7m8(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.route.UpdateCardDestination updateCardDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCardDestination, "");
        if ((i & 6) == 0) {
            i |= composer.changed(updateCardDestination) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1413798801, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:157)");
            }
            com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.CardFormScreen(inAppCheckoutCoordinator, null, null, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.UPDATE, updateCardDestination.getUpdateCardParams(), composer, 3072, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel $r8$lambda$YLdVkRDpScpzZpggRrFuMhXoIfk(com.paypal.oslo.feature.inappcheckout.navigation.route.WebViewCheckoutDestination webViewCheckoutDestination, com.paypal.oslo.feature.inappcheckout.features.webview.AppSwitchWebViewViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(webViewCheckoutDestination);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z2h21tBUiEgZIFaPejNpnxn6wnY(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.navigation.route.OneShotDestination oneShotDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneShotDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-167015912, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:113)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt.OneShotScreen(inAppCheckoutCoordinator, oneShotDestination.getAuthenticationXOResponse(), (com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0), checkoutLogger, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e3KdKYNq0EMl_kOhWrOZ846Oc_c(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger, com.paypal.oslo.feature.inappcheckout.navigation.route.InstantVaultDestination instantVaultDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instantVaultDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1211018285, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:129)");
        }
        com.paypal.oslo.feature.inappcheckout.ui.instantvault.screen.InstantVaultScreenKt.InstantVaultScreen(inAppCheckoutCoordinator, instantVaultDestination.getAuthenticationXOResponse(), checkoutLogger, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qs0uxE8Dg9x_trDuhFgmmL6burM(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.navigation.route.ProfileDestination profileDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1450395438, i, -1, "com.paypal.oslo.feature.inappcheckout.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:136)");
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity = profileDestination.getBuyerInfoEntity();
        if (buyerInfoEntity == null) {
            composer.startReplaceGroup(-1359432519);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1359432518);
            com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt.ProfileScreen(buyerInfoEntity, inAppCheckoutCoordinator, null, composer, 0, 4);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
