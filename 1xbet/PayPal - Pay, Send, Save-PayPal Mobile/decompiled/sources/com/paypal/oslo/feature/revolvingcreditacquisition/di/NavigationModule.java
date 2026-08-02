package com.paypal.oslo.feature.revolvingcreditacquisition.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJB\u0010\u0013\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u0011¢\u0006\u0002\b\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/NativeDestinationResolver;", "provideNativeDestinationResolver", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/NativeDestinationResolver;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/WebViewDestinationResolver;", "provideWebViewDestinationResolver", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/WebViewDestinationResolver;", "nativeDestinationResolver", "webViewDestinationResolver", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/NativeDestinationResolver;Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/WebViewDestinationResolver;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver provideNativeDestinationResolver(com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver(navigator);
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver provideWebViewDestinationResolver(com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver(navigator);
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeDestinationResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewDestinationResolver, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$kqMSen2aG4pMacALb3B5xgLl0FQ(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, navigator, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-3PLuIYIpCE2Zp6JW5UZOmI0Atg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17964$r8$lambda$3PLuIYIpCE2Zp6JW5UZOmI0Atg(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication directApplication, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directApplication, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1463798217, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:172)");
        }
        boolean changedInstance = composer.changedInstance(directApplication);
        boolean changed = composer.changed(nativeDestinationResolver);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17965$r8$lambda$54GqGDNuBikarBu45k_RRF_HmU(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication.this, nativeDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(directApplication);
        boolean changed2 = composer.changed(webViewDestinationResolver);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17980$r8$lambda$nROHlq0yKE9klKnFxi2kBDs0UM(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication.this, webViewDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$3Gu5zFWVnRZf4ooI4OOqfQwHs_Q(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.AcquisitionLandingScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(directApplication), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-54GqGDNuBikarBu45k_RRF_HmU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17965$r8$lambda$54GqGDNuBikarBu45k_RRF_HmU(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication directApplication, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver) {
        directApplication.accept(nativeDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2skPblPCqKY_wuKnU9GOC91ggco(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling applicationBilling, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver) {
        applicationBilling.accept(nativeDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3Gu5zFWVnRZf4ooI4OOqfQwHs_Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$bY3Sk36xxB28tErmoSbs3whP4RQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$3X-6pIgjurKcqaBum_k2idI2vhU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17966$r8$lambda$3X6pIgjurKcqaBum_k2idI2vhU(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling applicationBilling, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver) {
        applicationBilling.accept(nativeDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5xUdP0CFuKCVdvfrSERud4ldf0c(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel $r8$lambda$6dPnulKkLWWR2JykNnjPgFwfcho(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination pPCCTermsWebViewDestination, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toWebViewNavigationArgs(pPCCTermsWebViewDestination));
    }

    /* renamed from: $r8$lambda$9932CVN5Jo4n_rJo7UvJcZvAt-4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17967$r8$lambda$9932CVN5Jo4n_rJo7UvJcZvAt4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.result.FileUploadPhotoResultNavResult(null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9JFIRHz_fqqRfWgkckT4BL5HWKw(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling applicationBilling, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        applicationBilling.accept(webViewDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel $r8$lambda$9juIHWMlvbqMDrsDB7tg1F0Nl5Q(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination acquisitionWebViewDestination, com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(acquisitionWebViewDestination.getNavigationArgs());
    }

    /* renamed from: $r8$lambda$BNaT34NneX1Ch04F-CJv8Y58adc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17968$r8$lambda$BNaT34NneX1Ch04FCJv8Y58adc(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling applicationBilling, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationBilling, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(779571839, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:138)");
        }
        boolean changedInstance = composer.changedInstance(applicationBilling);
        boolean changed = composer.changed(nativeDestinationResolver);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$2skPblPCqKY_wuKnU9GOC91ggco(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling.this, nativeDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(applicationBilling);
        boolean changed2 = composer.changed(webViewDestinationResolver);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$YWmUwLx0EpvgIT4WJLtTIjWfz1k(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling.this, webViewDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17974$r8$lambda$ZmptABO9bCUfwQnJ0pd91htyXA(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.AcquisitionLandingScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(applicationBilling), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BsD4M35P4lgjrlT7pEjjV4LTzT0(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination acquisitionWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionWebViewDestination, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(acquisitionWebViewDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1824094343, i2, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:226)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$9juIHWMlvbqMDrsDB7tg1F0Nl5Q(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination.this, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.Factory) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.AcquisitionWebViewScreenKt.AcquisitionWebViewScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), null, composer, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CBGabSm4xo_7zB_r-Ytpup0QP8I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17969$r8$lambda$CBGabSm4xo_7zB_rYtpup0QP8I(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$L_CnJRN9QznbWzAVViUBDqiC8SE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DPvC8ycTp1CVTJnOwO_W_98q4h8(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline applicationDecline, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        applicationDecline.accept(webViewDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FkJpDXQCgIY6jGSQfQ08EyRmzrU(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication directApplication, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directApplication, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(856020442, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:121)");
        }
        boolean changedInstance = composer.changedInstance(directApplication);
        boolean changed = composer.changed(nativeDestinationResolver);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$q8GyyW2YM0BLUVARuiIVQKx2_sg(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication.this, nativeDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(directApplication);
        boolean changed2 = composer.changed(webViewDestinationResolver);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17971$r8$lambda$IKEEIcu7RZo6lFMb_1slLuGSoc(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication.this, webViewDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$JkME6iEPpuNDfVC2IubEiOK0pFo(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.AcquisitionLandingScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(directApplication), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GXILN1I1nN8MBb4FMzj-AIRwgQg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17970$r8$lambda$GXILN1I1nN8MBb4FMzjAIRwgQg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IKEEIcu7R-Zo6lFMb_1slLuGSoc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17971$r8$lambda$IKEEIcu7RZo6lFMb_1slLuGSoc(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication directApplication, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        directApplication.accept(webViewDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J4QED9Mrmbn6IqK6Fep3RBirius(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload documentUpload, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentUpload, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1747599733, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:189)");
        }
        boolean changedInstance = composer.changedInstance(documentUpload);
        boolean changed = composer.changed(nativeDestinationResolver);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$eQRrCA_GKqrfGHuH3YeVbSv7jzs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload.this, nativeDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(documentUpload);
        boolean changed2 = composer.changed(webViewDestinationResolver);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$Q25DJqnFpver7EmKnNTHawwguww(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload.this, webViewDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$Yn_1II7t0_zN5tBckcI98mOl_Do(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.AcquisitionLandingScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(documentUpload), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JkME6iEPpuNDfVC2IubEiOK0pFo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17970$r8$lambda$GXILN1I1nN8MBb4FMzjAIRwgQg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KcJq0nocl_7Y3pvdPrVwGc8RPck(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline applicationDecline, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver) {
        applicationDecline.accept(nativeDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L_CnJRN9QznbWzAVViUBDqiC8SE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Obwhj-rs_-yDmKE3jeFFhd7yoYE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17972$r8$lambda$Obwhjrs_yDmKE3jeFFhd7yoYE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.result.FileUploadPhotoResultNavResult(null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Pblq3zGTTi2f5VbYIHZq4jz_DWM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.FileUploadOptionsDestination fileUploadOptionsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUploadOptionsDestination, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1308723649, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:262)");
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.fileupload.FileUploadOptionsScreenKt.FileUploadOptionsScreen(appNavigator, null, null, null, composer, 0, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q25DJqnFpver7EmKnNTHawwguww(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload documentUpload, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        documentUpload.accept(webViewDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QZdwMlOVZdsTs6gA2IPTZK4bae4(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication directApplication, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directApplication, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-460745316, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:86)");
        }
        boolean changedInstance = composer.changedInstance(directApplication);
        boolean changed = composer.changed(nativeDestinationResolver);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$dms1f6CQWfNK99prWxtUIzHxUTA(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication.this, nativeDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(directApplication);
        boolean changed2 = composer.changed(webViewDestinationResolver);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$TgOtMGh9VE79N2d52CP8UyuhIRY(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication.this, webViewDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17977$r8$lambda$cJu0dyVxV3cNRQ6G_b4Sb4K3RE(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.AcquisitionLandingScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(directApplication), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rx_KcW3DSfhLLP1AsT5CCuOFHOI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination pPCCTermsWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pPCCTermsWebViewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-633628189, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:158)");
        }
        boolean changedInstance = composer.changedInstance(pPCCTermsWebViewDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$6dPnulKkLWWR2JykNnjPgFwfcho(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination.this, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.Factory) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.AcquisitionWebViewScreenKt.AcquisitionWebViewScreen(appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.ui.webview.viewmodel.AcquisitionWebViewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1) : dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1), composer, 0, 0), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TgOtMGh9VE79N2d52CP8UyuhIRY(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication directApplication, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        directApplication.accept(webViewDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XRccgu-Mwtg24PXjyTYcxx-W3TM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17973$r8$lambda$XRccguMwtg24PXjyTYcxxW3TM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17967$r8$lambda$9932CVN5Jo4n_rJo7UvJcZvAt4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YWmUwLx0EpvgIT4WJLtTIjWfz1k(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling applicationBilling, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        applicationBilling.accept(webViewDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yn_1II7t0_zN5tBckcI98mOl_Do(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17976$r8$lambda$boDoq3XSUH7ohMdUBqa1WXacks((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZmptABO9bCUfwQnJ0p-d91htyXA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17974$r8$lambda$ZmptABO9bCUfwQnJ0pd91htyXA(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$yaj_zdvRTFrSUS6fRw6CIbgsNo8((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_QZ61ZZ-0bQpap5MMk0FThNxh-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17975$r8$lambda$_QZ61ZZ0bQpap5MMk0FThNxhA(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination applicationLandingDestination, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        applicationLandingDestination.accept(webViewDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bY3Sk36xxB28tErmoSbs3whP4RQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$boDoq3XSUH7ohMd-UBqa1WXacks, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17976$r8$lambda$boDoq3XSUH7ohMdUBqa1WXacks(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$brwPGlObU1Tb8dE0y_gdWFdgejw(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$gbxzrhQqR4bpg3Ox25v8DY7cr50((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cJu0dyVxV3cNR-Q6G_b4Sb4K3RE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17977$r8$lambda$cJu0dyVxV3cNRQ6G_b4Sb4K3RE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$ex5UojGQdsgUjPP54UnknNdqeLU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dms1f6CQWfNK99prWxtUIzHxUTA(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication directApplication, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver) {
        directApplication.accept(nativeDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eQRrCA_GKqrfGHuH3YeVbSv7jzs(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload documentUpload, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver) {
        documentUpload.accept(nativeDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$err10M_POqkrIILFkVU44mAlvjo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17972$r8$lambda$Obwhjrs_yDmKE3jeFFhd7yoYE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ex5UojGQdsgUjPP54UnknNdqeLU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gRkMIFP4i26l4-_FpleZcKInRDg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17978$r8$lambda$gRkMIFP4i26l4_FpleZcKInRDg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$5xUdP0CFuKCVdvfrSERud4ldf0c((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gbxzrhQqR4bpg3Ox25v8DY7cr50(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$iM38ybBHo-2TuZrUfAhR3AqxaOU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17979$r8$lambda$iM38ybBHo2TuZrUfAhR3AqxaOU(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline applicationDecline, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationDecline, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2094931232, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:206)");
        }
        boolean changedInstance = composer.changedInstance(applicationDecline);
        boolean changed = composer.changed(nativeDestinationResolver);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$KcJq0nocl_7Y3pvdPrVwGc8RPck(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline.this, nativeDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(applicationDecline);
        boolean changed2 = composer.changed(webViewDestinationResolver);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$DPvC8ycTp1CVTJnOwO_W_98q4h8(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline.this, webViewDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17978$r8$lambda$gRkMIFP4i26l4_FpleZcKInRDg(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.AcquisitionLandingScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(applicationDecline), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jAgTaEnhJFgMXdF_A_p4HWAO72o(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination applicationLandingDestination, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver) {
        applicationLandingDestination.accept(nativeDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kJIQad0DmXupX5ZFpqkqAOHwewA(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination applicationLandingDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationLandingDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1857537293, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:68)");
        }
        boolean changedInstance = composer.changedInstance(applicationLandingDestination);
        boolean changed = composer.changed(nativeDestinationResolver);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$jAgTaEnhJFgMXdF_A_p4HWAO72o(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination.this, nativeDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(applicationLandingDestination);
        boolean changed2 = composer.changed(webViewDestinationResolver);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17975$r8$lambda$_QZ61ZZ0bQpap5MMk0FThNxhA(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination.this, webViewDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17969$r8$lambda$CBGabSm4xo_7zB_rYtpup0QP8I(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.AcquisitionLandingScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(applicationLandingDestination), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kqMSen2aG4pMacALb3B5xgLl0FQ(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1857537293, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$kJIQad0DmXupX5ZFpqkqAOHwewA(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination applicationLandingDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(applicationLandingDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.ApplicationLandingDestination applicationLandingDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-460745316, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$QZdwMlOVZdsTs6gA2IPTZK4bae4(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication directApplication) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directApplication);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.DirectApplication directApplication) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-537193919, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$onuayGxA37cIg6EsjHwVEkepTu0(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling applicationBilling) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(applicationBilling);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling applicationBilling) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(856020442, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$FkJpDXQCgIY6jGSQfQ08EyRmzrU(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication directApplication) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directApplication);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication directApplication) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(779571839, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17968$r8$lambda$BNaT34NneX1Ch04FCJv8Y58adc(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling applicationBilling) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(applicationBilling);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.ApplicationBilling applicationBilling) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-633628189, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$Rx_KcW3DSfhLLP1AsT5CCuOFHOI(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination pPCCTermsWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(pPCCTermsWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCTermsWebViewDestination pPCCTermsWebViewDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1463798217, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17964$r8$lambda$3PLuIYIpCE2Zp6JW5UZOmI0Atg(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication directApplication) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directApplication);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication directApplication) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1747599733, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$J4QED9Mrmbn6IqK6Fep3RBirius(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload documentUpload) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(documentUpload);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DocumentUpload documentUpload) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l2Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2094931232, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17979$r8$lambda$iM38ybBHo2TuZrUfAhR3AqxaOU(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver.this, webViewDestinationResolver, appNavigator, (com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline applicationDecline) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(applicationDecline);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.ApplicationDecline applicationDecline) {
                return l2Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l2Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1824094343, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$BsD4M35P4lgjrlT7pEjjV4LTzT0(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination acquisitionWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(acquisitionWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionWebViewDestination acquisitionWebViewDestination) {
                return l2Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        final java.util.Map l2Metadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        kotlin.jvm.functions.Function3<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> lambda$109696829$revolvingcredit_acquisition_prodRelease = com.paypal.oslo.feature.revolvingcreditacquisition.di.ComposableSingletons$NavigationModuleKt.INSTANCE.getLambda$109696829$revolvingcredit_acquisition_prodRelease();
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination acquisitionNativeDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(acquisitionNativeDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.AcquisitionNativeDestination acquisitionNativeDestination) {
                return l2Metadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) lambda$109696829$revolvingcredit_acquisition_prodRelease);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17973$r8$lambda$XRccguMwtg24PXjyTYcxxW3TM(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$err10M_POqkrIILFkVU44mAlvjo(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, 19, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1308723649, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$Pblq3zGTTi2f5VbYIHZq4jz_DWM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.FileUploadOptionsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.FileUploadOptionsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.FileUploadOptionsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.FileUploadOptionsDestination fileUploadOptionsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(fileUploadOptionsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.FileUploadOptionsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$24
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.FileUploadOptionsDestination fileUploadOptionsDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance11);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nROHl-q0yKE9klKnFxi2kBDs0UM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17980$r8$lambda$nROHlq0yKE9klKnFxi2kBDs0UM(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CreditAcquisitionInternalDeeplinkDestination.DirectApplication directApplication, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver) {
        directApplication.accept(webViewDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$onuayGxA37cIg6EsjHwVEkepTu0(final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.WebViewDestinationResolver webViewDestinationResolver, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling applicationBilling, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationBilling, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-537193919, i, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:103)");
        }
        boolean changedInstance = composer.changedInstance(applicationBilling);
        boolean changed = composer.changed(nativeDestinationResolver);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.m17966$r8$lambda$3X6pIgjurKcqaBum_k2idI2vhU(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling.this, nativeDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(applicationBilling);
        boolean changed2 = composer.changed(webViewDestinationResolver);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$9JFIRHz_fqqRfWgkckT4BL5HWKw(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.CBMCAcquisitionExternalDestination.ApplicationBilling.this, webViewDestinationResolver);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed3 = composer.changed(appNavigator);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.di.NavigationModule.$r8$lambda$brwPGlObU1Tb8dE0y_gdWFdgejw(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.AcquisitionLandingScreen(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.DestinationMappingsKt.toLandingNavigationArgs(applicationBilling), null, composer, 0, 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q8GyyW2YM0BLUVARuiIVQKx2_sg(com.paypal.oslo.feature.revolvingcreditacquisition.api.navigation.PPCCUSAcquisitionExternalDestination.DirectApplication directApplication, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.NativeDestinationResolver nativeDestinationResolver) {
        directApplication.accept(nativeDestinationResolver);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yaj_zdvRTFrSUS6fRw6CIbgsNo8(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
