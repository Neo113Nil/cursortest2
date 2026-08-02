package com.paypal.oslo.feature.identity.merchantonboarding;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aJ\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"MerchantOnboardingWebViewScreen", "", "destination", "Lcom/paypal/oslo/feature/identity/api/navigation/MerchantOnboardingDestination;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel;", "(Lcom/paypal/oslo/feature/identity/api/navigation/MerchantOnboardingDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel;Landroidx/compose/runtime/Composer;II)V", "MerchantOnboardingWebViewContent", "webViewContent", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/identity/api/navigation/MerchantOnboardingDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/identity/merchantonboarding/MerchantOnboardingViewModel;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MerchantOnboardingWebViewScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if ((r15 & 4) != 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MerchantOnboardingWebViewScreen(final com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOnboardingDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(575085270);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(merchantOnboardingDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changedInstance(merchantOnboardingViewModel)) ? 256 : 128;
        }
        int i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    merchantOnboardingViewModel = (com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i4 &= -897;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(575085270, i4, -1, "com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreen (MerchantOnboardingWebViewScreen.kt:46)");
                }
                MerchantOnboardingWebViewContent(merchantOnboardingDestination, appNavigator, merchantOnboardingViewModel, com.paypal.oslo.feature.identity.merchantonboarding.ComposableSingletons$MerchantOnboardingWebViewScreenKt.INSTANCE.getLambda$1956572041$identity_prodRelease(), startRestartGroup, (i4 & 14) | 3072 | (i4 & 112) | (i4 & 896));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel2 = merchantOnboardingViewModel;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt.m15190$r8$lambda$jBXGgDiKKj0OlVi0a3g3RZi7B8(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination.this, appNavigator, merchantOnboardingViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MerchantOnboardingWebViewContent(final com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOnboardingDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantOnboardingViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-410390542);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(merchantOnboardingDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(merchantOnboardingViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-410390542, i2, -1, "com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewContent (MerchantOnboardingWebViewScreen.kt:79)");
            }
            if (merchantOnboardingDestination.getCodeVerifier().length() == 0) {
                startRestartGroup.startReplaceGroup(1827625349);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                z = (i2 & 112) == 32;
                com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$1$1(appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt.m15189$r8$lambda$aa3Mt9Sd_epZt8_WHrqaNcHRjY(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination.this, appNavigator, merchantOnboardingViewModel, function4, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
            startRestartGroup.startReplaceGroup(1827728176);
            startRestartGroup.endReplaceGroup();
            boolean changed = startRestartGroup.changed(merchantOnboardingDestination);
            boolean changed2 = startRestartGroup.changed(merchantOnboardingViewModel);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.toWebViewConfiguration(merchantOnboardingDestination, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt.$r8$lambda$R6dXNijk_UIRAlX3zEOW8zDJkVc(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.this, merchantOnboardingDestination, (java.lang.String) obj);
                    }
                }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt.$r8$lambda$P6eviPdv3iaDfM1FJ2GWe5m05Is(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel.this, (java.lang.String) obj);
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue2;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt.$r8$lambda$0URE4Whd5s8wPMftPJqFRzCk3G0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changedInstance = startRestartGroup.changedInstance(merchantOnboardingViewModel);
            z = i3 == 32;
            com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$MerchantOnboardingWebViewContent$3$1(merchantOnboardingViewModel, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(merchantOnboardingViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i2 >> 6) & 14);
            function4.invoke(secureWebViewConfiguration, function0, startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | ((i2 >> 3) & 896)));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt.$r8$lambda$OjT1q5KoDuuuYGp4CWmsr_iCOIk(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination.this, appNavigator, merchantOnboardingViewModel, function4, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0URE4Whd5s8wPMftPJqFRzCk3G0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingWebViewScreenKt.m15191$r8$lambda$kkj_Xdl9fPQEhSLOk712xfGiMA((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OjT1q5KoDuuuYGp4CWmsr_iCOIk(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, kotlin.jvm.functions.Function4 function4, int i, androidx.compose.runtime.Composer composer, int i2) {
        MerchantOnboardingWebViewContent(merchantOnboardingDestination, appNavigator, merchantOnboardingViewModel, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P6eviPdv3iaDfM1FJ2GWe5m05Is(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        merchantOnboardingViewModel.handleAuthFailure(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R6dXNijk_UIRAlX3zEOW8zDJkVc(com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        merchantOnboardingViewModel.handleAuthSuccess(str, merchantOnboardingDestination.getCodeVerifier());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aa3Mt9Sd_-epZt8_WHrqaNcHRjY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15189$r8$lambda$aa3Mt9Sd_epZt8_WHrqaNcHRjY(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, kotlin.jvm.functions.Function4 function4, int i, androidx.compose.runtime.Composer composer, int i2) {
        MerchantOnboardingWebViewContent(merchantOnboardingDestination, appNavigator, merchantOnboardingViewModel, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jBXGgDiKKj0OlVi0a3g3-RZi7B8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15190$r8$lambda$jBXGgDiKKj0OlVi0a3g3RZi7B8(com.paypal.oslo.feature.identity.api.navigation.MerchantOnboardingDestination merchantOnboardingDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingViewModel merchantOnboardingViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MerchantOnboardingWebViewScreen(merchantOnboardingDestination, appNavigator, merchantOnboardingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kkj_Xdl9fPQEhSLOk7-12xfGiMA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15191$r8$lambda$kkj_Xdl9fPQEhSLOk712xfGiMA(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
