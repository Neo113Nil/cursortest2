package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"EmailEntryScreen", "", "pageConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "stepCallbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "emailViewModel", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailViewModel;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailViewModel;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease", "emailUiState", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailEntryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmailEntryScreen(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel4;
        int i6;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        java.lang.Object obj;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2;
        java.lang.Object obj2;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-583996900);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(pageConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(topBarConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(stepCallbacks) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    emailViewModel2 = emailViewModel;
                    if (startRestartGroup.changedInstance(emailViewModel2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    emailViewModel2 = emailViewModel;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                emailViewModel2 = emailViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    emailViewModel4 = emailViewModel2;
                    i5 = 0;
                    i6 = i4;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier5 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) != 0) {
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
                        i5 = 0;
                        i4 &= -458753;
                        emailViewModel4 = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i5 = 0;
                        emailViewModel4 = emailViewModel2;
                    }
                    i6 = i4;
                    modifier4 = modifier5;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-583996900, i6, -1, "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreen (EmailEntryScreen.kt:78)");
                }
                int i9 = i6;
                final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel5 = emailViewModel4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(emailViewModel4.getEmailUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState emailModalState = ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState) collectAsStateWithLifecycle.getValue()).getEmailModalState();
                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.oslo.feature.onboarding.signup.email.navigation.EmailEntryDestination emailEntryDestination = com.paypal.oslo.feature.onboarding.signup.email.navigation.EmailEntryDestination.INSTANCE;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.navigation3.runtime.NavEntry(emailEntryDestination, null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.MetadataNavKey, emailEntryDestination)), com.paypal.oslo.feature.onboarding.signup.email.ui.ComposableSingletons$EmailEntryScreenKt.INSTANCE.getLambda$1004154396$onboarding_prodRelease(), 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.navigation3.runtime.NavEntry navEntry = (androidx.navigation3.runtime.NavEntry) rememberedValue;
                java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> emailEntryAnalyticsContexts = com.paypal.oslo.feature.onboarding.signup.email.analytics.EmailEntryAnalyticsKt.emailEntryAnalyticsContexts();
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i5);
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i5);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$1$1(null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                boolean changedInstance = startRestartGroup.changedInstance(emailViewModel5);
                boolean z = (i9 & 896) == 256;
                boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance | z | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$2$1(emailViewModel5, stepCallbacks, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                int i10 = (i9 >> 15) & 14;
                androidx.compose.runtime.EffectsKt.LaunchedEffect(emailViewModel5, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i10);
                boolean changedInstance2 = startRestartGroup.changedInstance(emailViewModel5);
                boolean changedInstance3 = startRestartGroup.changedInstance(context);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | changedInstance3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$3$1(emailViewModel5, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(emailViewModel5, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, i10);
                if (emailModalState instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation) {
                    startRestartGroup.startReplaceGroup(1063069663);
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    emailViewModel5.clearEmailModalState();
                    boolean changedInstance4 = startRestartGroup.changedInstance(emailModalState);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt.$r8$lambda$wOFNyjbPe94YFCTgQLONZ7P3yZo(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    appNavigator.m11575navigateForResultInternaluBl809w(rememberNavResultRequestId2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.EmailOtpVerificationNavResult.class).toString(), (kotlin.jvm.functions.Function1) rememberedValue5);
                    startRestartGroup.endReplaceGroup();
                } else if (emailModalState instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion) {
                    startRestartGroup.startReplaceGroup(1063755383);
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    }
                    emailViewModel5.clearEmailModalState();
                    boolean changedInstance5 = startRestartGroup.changedInstance(emailModalState);
                    boolean changedInstance6 = startRestartGroup.changedInstance(emailViewModel5);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((changedInstance5 | changedInstance6) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt.$r8$lambda$PXbr9FFunBlU07ZqCpQFotYky60(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.this, emailViewModel5, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    appNavigator.m11575navigateForResultInternaluBl809w(rememberNavResultRequestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.result.EmailSuggestionNavResult.class).toString(), (kotlin.jvm.functions.Function1) rememberedValue6);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(emailModalState instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.None)) {
                        startRestartGroup.startReplaceGroup(1419764362);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1064302130);
                    startRestartGroup.endReplaceGroup();
                }
                boolean changedInstance7 = startRestartGroup.changedInstance(emailViewModel5);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager = null;
                    obj = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$6$1(emailViewModel5, null);
                    startRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue7;
                    navResultManager = null;
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) obj;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m16348invokehN0UB1M(navResultManager3, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16348invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager3, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager3.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue8, startRestartGroup, 3072);
                boolean changedInstance8 = startRestartGroup.changedInstance(emailViewModel5);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changedInstance8 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager2 = null;
                    obj2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$7$1(emailViewModel5, null);
                    startRestartGroup.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue9;
                    navResultManager2 = null;
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) obj2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager2, startRestartGroup, 0);
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$EmailEntryScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m16349invokehN0UB1M(navResultManager3, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16349invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager3, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager3.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue10, startRestartGroup, 3072);
                com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.EmailData emailData = ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState) collectAsStateWithLifecycle.getValue()).getEmailData();
                com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap createCallbackMapForEmail = emailViewModel5.createCallbackMapForEmail(pageConfig);
                com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap componentStates = ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState) collectAsStateWithLifecycle.getValue()).getComponentStates();
                boolean changedInstance9 = startRestartGroup.changedInstance(emailViewModel5);
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (changedInstance9 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt.$r8$lambda$jv6hKJiDdaBawK2aR_Xt3qxXXLg(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                androidx.compose.ui.Modifier modifier6 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayoutKt.PageLayout(pageConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks.copy$default(stepCallbacks, (kotlin.jvm.functions.Function0) rememberedValue11, null, null, 6, null), emailData, createCallbackMapForEmail, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.screenMarker(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(modifier4, emailEntryAnalyticsContexts), navEntry), com.paypal.oslo.feature.onboarding.api.testtags.PreOnboardingTestTags.EmailEntry.SCREEN), componentStates, topBarConfig, ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState) collectAsStateWithLifecycle.getValue()).isLoading(), startRestartGroup, (i9 & 14) | (3670016 & (i9 << 15)), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                emailViewModel3 = emailViewModel5;
                modifier3 = modifier6;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                emailViewModel3 = emailViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailEntryScreenKt.$r8$lambda$wgWF4NzxWOYufO_cxxgTR3nEygI(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig.this, topBarConfig, stepCallbacks, appNavigator, modifier3, emailViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PXbr9FFunBlU07ZqCpQFotYky60(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState emailModalState, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion emailSuggestion = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion) emailModalState;
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.EmailSuggestionModalDestination(emailSuggestion.m16359getSuggestedEmailBvNjjI(), emailSuggestion.m16358getOriginalEmailBvNjjI(), emailViewModel.m16368getPhoneNumbervCycbc(), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jv6hKJiDdaBawK2aR_Xt3qxXXLg(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel) {
        emailViewModel.onNavigateNext();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wOFNyjbPe94YFCTgQLONZ7P3yZo(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState emailModalState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.onboarding.api.navigation.EmailOtpVerificationModalDestination(((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation) emailModalState).m16353getEmailBvNjjI(), com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getSERIALIZABLE_ACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow("manual_signup_from_phone", (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wgWF4NzxWOYufO_cxxgTR3nEygI(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailViewModel emailViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EmailEntryScreen(pageConfig, topBarConfig, stepCallbacks, appNavigator, modifier, emailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState access$EmailEntryScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailUiState) state.getValue();
    }
}
