package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"SignupFlowScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "signupIntent", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel;", "SignupFlowScreen-Rr4ikrY", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel;Landroidx/compose/runtime/Composer;II)V", "RenderSignupPage", "pageConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createStepCallbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowViewModel;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "onboarding_prodRelease", "uiState", "Lcom/paypal/oslo/feature/onboarding/signup/ui/SignupFlowUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupFlowScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: SignupFlowScreen-Rr4ikrY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16439SignupFlowScreenRr4ikrY(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel2;
        final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        java.lang.Object obj;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupIntent, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1851482194);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(signupIntent) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    signupFlowViewModel2 = signupFlowViewModel;
                    if (startRestartGroup.changedInstance(signupFlowViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    signupFlowViewModel2 = signupFlowViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                signupFlowViewModel2 = signupFlowViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    signupFlowViewModel4 = signupFlowViewModel2;
                    i4 = 0;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
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
                        i4 = 0;
                        signupFlowViewModel4 = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i5 = i3 & (-57345);
                    } else {
                        i4 = 0;
                        i5 = i3;
                        signupFlowViewModel4 = signupFlowViewModel2;
                    }
                    modifier3 = modifier4;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1851482194, i5, -1, "com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreen (SignupFlowScreen.kt:57)");
                }
                final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(signupFlowViewModel4.getUiState(), null, startRestartGroup, i4, 1);
                android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
                boolean changed = startRestartGroup.changed(resources);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.onboarding.shared.variants.ui.DefaultVariantResolver(com.paypal.oslo.feature.onboarding.shared.variants.domain.OnboardingVariants.INSTANCE.getVariants(), resources);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.onboarding.shared.variants.ui.DefaultVariantResolver defaultVariantResolver = (com.paypal.oslo.feature.onboarding.shared.variants.ui.DefaultVariantResolver) rememberedValue;
                com.paypal.oslo.core.i18n.domain.model.CountryCode m11363boximpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(str);
                boolean changedInstance = startRestartGroup.changedInstance(signupFlowViewModel4);
                boolean changedInstance2 = startRestartGroup.changedInstance(signupIntent);
                int i8 = i5 & 112;
                boolean z = i8 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$SignupFlowScreen$1$1(signupFlowViewModel4, signupIntent, str, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(signupIntent, m11363boximpl, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, ((i5 >> 6) & 14) | i8);
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(signupFlowViewModel4);
                boolean z2 = (i5 & 14) == 4;
                boolean changed2 = startRestartGroup.changed(rememberNavResultRequestId);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z2 | changedInstance3 | changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$SignupFlowScreen$2$1(signupFlowViewModel4, appNavigator, rememberNavResultRequestId, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                boolean changedInstance4 = startRestartGroup.changedInstance(signupFlowViewModel4);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager = null;
                    obj = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$SignupFlowScreen$3$1(signupFlowViewModel4, null);
                    startRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue4;
                    navResultManager = null;
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) obj;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$SignupFlowScreen-Rr4ikrY$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m16440invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16440invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.getLocalVariantResolver().provides(defaultVariantResolver), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(790258414, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt.$r8$lambda$NzG4hQwGatVPbKTTFnpgmZ_sWwc(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.this, appNavigator, modifier3, collectAsState, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                signupFlowViewModel3 = signupFlowViewModel4;
            } else {
                startRestartGroup.skipToGroupEnd();
                signupFlowViewModel3 = signupFlowViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt.$r8$lambda$fXrTxn0XaokdKr9pD8vpEj8w4HI(com.paypal.oslo.core.navigation.AppNavigator.this, str, signupIntent, modifier5, signupFlowViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object m23436constructorimpl;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2044014489);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(pageConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(topBarConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(signupFlowViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2044014489, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.RenderSignupPage (SignupFlowScreen.kt:146)");
                }
                java.lang.String m16571getPageIdeVUBM90 = pageConfig.m16571getPageIdeVUBM90();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    java.lang.String upperCase = m16571getPageIdeVUBM90.toUpperCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId.valueOf(upperCase));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                    m23436constructorimpl = null;
                }
                com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId signupPageId = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId) ((java.lang.Enum) m23436constructorimpl);
                int i5 = signupPageId != null ? com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt.WhenMappings.$EnumSwitchMapping$0[signupPageId.ordinal()] : -1;
                if (i5 == 1) {
                    startRestartGroup.startReplaceGroup(810973283);
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt.EmailEntryScreen(pageConfig, topBarConfig, getHighResolutionOutputSizeshNQ4ISI(signupFlowViewModel, startRestartGroup, (i3 >> 6) & 14), appNavigator, modifier4, null, startRestartGroup, i3 & 64638, 32);
                    startRestartGroup.endReplaceGroup();
                } else if (i5 == 2) {
                    startRestartGroup.startReplaceGroup(811288739);
                    com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt.PhoneEntryScreen(pageConfig, topBarConfig, getHighResolutionOutputSizeshNQ4ISI(signupFlowViewModel, startRestartGroup, (i3 >> 6) & 14), appNavigator, modifier4, null, startRestartGroup, i3 & 64638, 32);
                    startRestartGroup.endReplaceGroup();
                } else if (i5 == 3) {
                    startRestartGroup.startReplaceGroup(811599948);
                    com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt.PasswordScreen(pageConfig, topBarConfig, getHighResolutionOutputSizeshNQ4ISI(signupFlowViewModel, startRestartGroup, (i3 >> 6) & 14), modifier4, null, startRestartGroup, (i3 & 126) | ((i3 >> 3) & 7168), 16);
                    startRestartGroup.endReplaceGroup();
                } else if (i5 == 4 || i5 == 5) {
                    startRestartGroup.startReplaceGroup(811906259);
                    com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(signupFlowViewModel, startRestartGroup, (i3 >> 6) & 14);
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
                    com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoScreenKt.PersonalInfoScreen(pageConfig, topBarConfig, highResolutionOutputSizeshNQ4ISI, appNavigator, (com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.PersonalInfoViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0), modifier4, startRestartGroup, (i3 & 7294) | ((i3 << 3) & 458752), 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(812240997);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt.$r8$lambda$ivJytH3BkvEyP_OBq95fXkrBxV0(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig.this, topBarConfig, signupFlowViewModel, appNavigator, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1105233074, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.createStepCallbacks (SignupFlowScreen.kt:206)");
        }
        boolean changedInstance = composer.changedInstance(signupFlowViewModel);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt.$r8$lambda$n69OExXeYqMfp3gp2zSdeQNs89s(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(signupFlowViewModel);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt.$r8$lambda$cLo1XND8KaVNydHWFIREswx5rt8(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changedInstance3 = composer.changedInstance(signupFlowViewModel);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreenKt.$r8$lambda$wGtDveXy8G1eTpIWofF5bb4FJfw(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel.this, (com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks = new com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks(function0, function02, (kotlin.jvm.functions.Function1) rememberedValue3);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stepCallbacks;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NzG4hQwGatVPbKTTFnpgmZ_sWwc(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(790258414, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowScreen.<anonymous> (SignupFlowScreen.kt:112)");
            }
            com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState signupFlowUiState = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState) state.getValue();
            if (signupFlowUiState instanceof com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success) {
                composer.startReplaceGroup(1872753705);
                com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success success = (com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowUiState.Success) signupFlowUiState;
                Camera2StreamConfigurationMap(success.getPageConfig(), success.getTopBarConfig(), signupFlowViewModel, appNavigator, modifier, composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1873064883);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cLo1XND8KaVNydHWFIREswx5rt8(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel) {
        signupFlowViewModel.handleBackNavigation();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fXrTxn0XaokdKr9pD8vpEj8w4HI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m16439SignupFlowScreenRr4ikrY(appNavigator, str, signupIntent, modifier, signupFlowViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ivJytH3BkvEyP_OBq95fXkrBxV0(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(pageConfig, topBarConfig, signupFlowViewModel, appNavigator, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n69OExXeYqMfp3gp2zSdeQNs89s(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel) {
        signupFlowViewModel.navigateToNextStep();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wGtDveXy8G1eTpIWofF5bb4FJfw(com.paypal.oslo.feature.onboarding.signup.ui.SignupFlowViewModel signupFlowViewModel, com.paypal.oslo.feature.onboarding.api.navigation.result.SignupFlowNavResult signupFlowNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupFlowNavResult, "");
        signupFlowViewModel.exitFlow(signupFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId.EMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId.PHONE_ENTRY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId.PASSWORD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId.PERSONAL_INFO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId.ADDRESS_INFO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
