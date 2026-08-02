package com.paypal.oslo.feature.settings.di;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0002\b\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;", "stringsProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/settings/domain/util/SettingsStringsProvider;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.settings.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider stringsProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringsProvider, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.m19260$r8$lambda$vk6h2QAm6zDBa774eglQPNajzI(com.paypal.oslo.core.navigation.AppNavigator.this, stringsProvider, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1cCnV2Q2mq8fWv8exhnFoiuQqDM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$rsZJLDIY0TnFmONVnnPofm6soZI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3XG18AzvWWzZS4_WjT-yVY44-tE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19255$r8$lambda$3XG18AzvWWzZS4_WjTyVY44tE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7m1SKBQ8nh8XuIf8Z52NJ_WBUAE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.api.navigation.LLSConfirmationDestination lLSConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lLSConfirmationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(506523201, i, -1, "com.paypal.oslo.feature.settings.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:149)");
        }
        com.paypal.oslo.feature.settings.ui.lls.LLSConfirmationHalfSheetScreenKt.LLSConfirmationHalfSheetScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7nqSApMoowHpJPTN3qIt2Ou0EDg(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, com.paypal.oslo.feature.settings.api.navigation.CloseYourAccountDestination closeYourAccountDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeYourAccountDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-670238955, i, -1, "com.paypal.oslo.feature.settings.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:60)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel closeAccountWebViewModel = (com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseAccountWebViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$etCKje0lMTRBkHVnj6wHHEfjHQE(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.settings.closeaccount.ui.screen.CloseAccountWebViewScreenKt.CloseAccountWebViewScreen(closeYourAccountDestination.getUrl(), (kotlin.jvm.functions.Function0) rememberedValue, closeAccountWebViewModel, settingsStringsProvider, null, null, null, composer, 0, 112);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7yHHvK1EHZAkJOv9PXozhVJK3hU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.m19256$r8$lambda$R8bBqeKuAwwUTaS6Jgx3l4EQQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9b11hlUJTPZpuyHNRVoZa3nRS78(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination l2SettingsWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l2SettingsWebViewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-787356809, i, -1, "com.paypal.oslo.feature.settings.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:101)");
        }
        final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration webViewConfiguration = com.paypal.oslo.feature.settings.webview.SettingsWebViewExtensionsKt.toWebViewConfiguration(l2SettingsWebViewDestination, composer, i & 14);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$E12gM43jPDvwCTmR6CoUs6RN71k(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        com.paypal.oslo.feature.settings.webview.L2SettingsWebViewScreenKt.L2SettingsWebViewScreen(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2130617949, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$Ws8Rbln0L42OY2Jg2LJz_pl89uI(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.this, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E12gM43jPDvwCTmR6CoUs6RN71k(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$KU0HyXXs4wzbWOTbZBeaJBls2ME((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E2eGbBQRM7ZqiJoOEFmEpVL7VnU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.m19259$r8$lambda$p1p6z8iRVS4nGIWnjVorGSS5xM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KU0HyXXs4wzbWOTbZBeaJBls2ME(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R8bBqeKuAwwUTa-S6-Jgx3l4EQQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19256$r8$lambda$R8bBqeKuAwwUTaS6Jgx3l4EQQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$Ws8Rbln0L42OY2Jg2LJz_pl89uI(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2130617949, i, -1, "com.paypal.oslo.feature.settings.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:104)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer.updateRememberedValue(secureWebViewConfiguration);
            } else {
                secureWebViewConfiguration = rememberedValue;
            }
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration2 = secureWebViewConfiguration;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer.updateRememberedValue(function0);
            } else {
                function0 = rememberedValue2;
            }
            com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration2, function0, null, null, composer, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YzCe-8YGBnsTnTYg4pSAQqTM_7w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19257$r8$lambda$YzCe8YGBnsTnTYg4pSAQqTM_7w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.api.navigation.FingerprintConfirmationDestination fingerprintConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fingerprintConfirmationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2108502609, i, -1, "com.paypal.oslo.feature.settings.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:128)");
        }
        com.paypal.oslo.feature.settings.ui.fingerprint.FingerprintConfirmationHalfSheetScreenKt.FingerprintConfirmationHalfSheetScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZQjlA6uUMVd2EBWGPZenDEEKvk4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.settings.navigation.result.LLSConfirmationNavResult(false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$etCKje0lMTRBkHVnj6wHHEfjHQE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.m19261$r8$lambda$w8IY90VdX_ZWLVcv1KfqQ6PLt8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gHe9O6KICNEPTtCNSLSuPQflFxs(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.api.navigation.SettingsWebViewDestination settingsWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsWebViewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1322693104, i, -1, "com.paypal.oslo.feature.settings.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:90)");
        }
        java.lang.String url = settingsWebViewDestination.getUrl();
        java.lang.String title = settingsWebViewDestination.getTitle();
        java.lang.String source = settingsWebViewDestination.getSource();
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$tu49XdKnVR9mHnMgFYj891rWBeQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.settings.ui.screens.SettingsWebViewScreenKt.SettingsWebViewScreen(url, source, (kotlin.jvm.functions.Function0) rememberedValue, null, title, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oV1Kd_M3YSJfK7svJyHb-cpCBIg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19258$r8$lambda$oV1Kd_M3YSJfK7svJyHbcpCBIg(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination legalWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalWebViewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(521283919, i, -1, "com.paypal.oslo.feature.settings.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:80)");
        }
        java.lang.String url = legalWebViewDestination.getUrl();
        java.lang.String title = legalWebViewDestination.getTitle();
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$7yHHvK1EHZAkJOv9PXozhVJK3hU(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.settings.legal.ui.screens.LegalWebViewScreenKt.LegalWebViewScreen(url, title, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$p1p6z8iR-VS4nGIWnjVorGSS5xM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19259$r8$lambda$p1p6z8iRVS4nGIWnjVorGSS5xM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.settings.navigation.result.FingerprintConfirmationNavResult(false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qi2d3RgyekcaKMU4vXWKsBcRd8k(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$yE4Cb7iPH4D0xgzW_dr9thIImE0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rsZJLDIY0TnFmONVnnPofm6soZI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.settings.navigation.result.FingerprintConfirmationNavResult(false));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sUpNMSFEAxf5tKoQ_CXnOY2sqz4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$ZQjlA6uUMVd2EBWGPZenDEEKvk4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tu49XdKnVR9mHnMgFYj891rWBeQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.m19255$r8$lambda$3XG18AzvWWzZS4_WjTyVY44tE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vk6h2QAm6zDBa774eg-lQPNajzI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19260$r8$lambda$vk6h2QAm6zDBa774eglQPNajzI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.settings.domain.util.SettingsStringsProvider settingsStringsProvider, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-670238955, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$7nqSApMoowHpJPTN3qIt2Ou0EDg(com.paypal.oslo.core.navigation.AppNavigator.this, settingsStringsProvider, (com.paypal.oslo.feature.settings.api.navigation.CloseYourAccountDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.api.navigation.CloseYourAccountDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.CloseYourAccountDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.settings.api.navigation.CloseYourAccountDestination closeYourAccountDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(closeYourAccountDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.CloseYourAccountDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.settings.api.navigation.CloseYourAccountDestination closeYourAccountDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.settings.api.navigation.LegalDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$700395$settings_prodRelease = com.paypal.oslo.feature.settings.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$700395$settings_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.api.navigation.LegalDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.LegalDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.settings.api.navigation.LegalDestination legalDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(legalDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.LegalDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.settings.api.navigation.LegalDestination legalDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) lambda$700395$settings_prodRelease);
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(521283919, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.m19258$r8$lambda$oV1Kd_M3YSJfK7svJyHbcpCBIg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination legalWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(legalWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.settings.api.navigation.LegalWebViewDestination legalWebViewDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l3Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1322693104, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$gHe9O6KICNEPTtCNSLSuPQflFxs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.settings.api.navigation.SettingsWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.api.navigation.SettingsWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.SettingsWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.settings.api.navigation.SettingsWebViewDestination settingsWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(settingsWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.SettingsWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.settings.api.navigation.SettingsWebViewDestination settingsWebViewDestination) {
                return l3Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-787356809, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$9b11hlUJTPZpuyHNRVoZa3nRS78(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination l2SettingsWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(l2SettingsWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.settings.api.navigation.L2SettingsWebViewDestination l2SettingsWebViewDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$E2eGbBQRM7ZqiJoOEFmEpVL7VnU(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$1cCnV2Q2mq8fWv8exhnFoiuQqDM(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, 19, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2108502609, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.m19257$r8$lambda$YzCe8YGBnsTnTYg4pSAQqTM_7w(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.settings.api.navigation.FingerprintConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.api.navigation.FingerprintConfirmationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.FingerprintConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.settings.api.navigation.FingerprintConfirmationDestination fingerprintConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(fingerprintConfirmationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.FingerprintConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.settings.api.navigation.FingerprintConfirmationDestination fingerprintConfirmationDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$qi2d3RgyekcaKMU4vXWKsBcRd8k(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$sUpNMSFEAxf5tKoQ_CXnOY2sqz4(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, 19, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(506523201, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.settings.di.NavigationModule.$r8$lambda$7m1SKBQ8nh8XuIf8Z52NJ_WBUAE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.settings.api.navigation.LLSConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.api.navigation.LLSConfirmationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.LLSConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.settings.api.navigation.LLSConfirmationDestination lLSConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(lLSConfirmationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.api.navigation.LLSConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.settings.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.settings.api.navigation.LLSConfirmationDestination lLSConfirmationDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$w8IY90VdX_-ZWLVcv1KfqQ6PLt8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19261$r8$lambda$w8IY90VdX_ZWLVcv1KfqQ6PLt8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yE4Cb7iPH4D0xgzW_dr9thIImE0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.settings.navigation.result.LLSConfirmationNavResult(false));
        return kotlin.Unit.INSTANCE;
    }
}
