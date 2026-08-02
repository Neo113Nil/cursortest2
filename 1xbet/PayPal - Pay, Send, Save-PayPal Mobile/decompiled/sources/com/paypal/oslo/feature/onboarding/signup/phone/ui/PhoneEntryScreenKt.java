package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aC\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"createOtpVerificationDestination", "Lcom/paypal/oslo/feature/onboarding/api/navigation/PhoneOtpVerificationModalDestination;", "phoneNumber", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "createOtpVerificationDestination-EzAuIyE", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/navigation/PhoneOtpVerificationModalDestination;", "PhoneEntryScreen", "", "pageConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "stepCallbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "phoneEntryViewModel", "Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/PhoneEntryViewModel;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/PhoneEntryViewModel;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease", "signupUiData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData;", "shouldNavigateToOtp", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneEntryScreenKt {
    /* renamed from: createOtpVerificationDestination-EzAuIyE, reason: not valid java name */
    public static final com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination m16409createOtpVerificationDestinationEzAuIyE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationModalDestination(str, "US", com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15961constructorimpl(1), com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.INSTANCE.getSERIALIZABLE_ACCOUNT_CREATION_USER_INTENT(), new com.paypal.oslo.feature.onboarding.api.analytics.BusinessFlow("manual_signup_from_email", (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PhoneEntryScreen(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel4;
        int i5;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r9;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-699490306);
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
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    phoneEntryViewModel2 = phoneEntryViewModel;
                    if (startRestartGroup.changedInstance(phoneEntryViewModel2)) {
                        i6 = 131072;
                        i3 |= i6;
                    }
                } else {
                    phoneEntryViewModel2 = phoneEntryViewModel;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                phoneEntryViewModel2 = phoneEntryViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    modifier4 = modifier2;
                    r9 = 0;
                    i5 = i4;
                    phoneEntryViewModel4 = phoneEntryViewModel2;
                } else {
                    androidx.compose.ui.Modifier modifier5 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        z = false;
                        i4 &= -458753;
                        phoneEntryViewModel4 = (com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        z = false;
                        phoneEntryViewModel4 = phoneEntryViewModel2;
                    }
                    i5 = i4;
                    modifier4 = modifier5;
                    r9 = z;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-699490306, i5, -1, "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreen (PhoneEntryScreen.kt:78)");
                }
                int i8 = i5;
                final com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel5 = phoneEntryViewModel4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(phoneEntryViewModel4.getPhoneNumberDataFlow(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(phoneEntryViewModel5.getShouldNavigateToOtp(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, r9);
                if (((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(666317631);
                    phoneEntryViewModel5.clearNavigateToOtp();
                    if (softwareKeyboardController != null) {
                        softwareKeyboardController.hide();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    boolean changedInstance = startRestartGroup.changedInstance(phoneEntryViewModel5);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt.m16407$r8$lambda$1lPmg0eDDQ00A5EPbupvCqRjjY(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    appNavigator.m11575navigateForResultInternaluBl809w(rememberNavResultRequestId, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.api.navigation.PhoneOtpVerificationNavResult.class).toString(), (kotlin.jvm.functions.Function1) rememberedValue);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(666599204);
                    startRestartGroup.endReplaceGroup();
                }
                boolean changedInstance2 = startRestartGroup.changedInstance(phoneEntryViewModel5);
                boolean z2 = (i8 & 896) == 256 ? true : r9;
                com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$PhoneEntryScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$PhoneEntryScreen$2$1(phoneEntryViewModel5, stepCallbacks, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, r9);
                com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$PhoneEntryScreen$$inlined$NavResultEffectrtGRyWw$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$PhoneEntryScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m16410invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m16410invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData signupFormData = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData) collectAsStateWithLifecycle.getValue();
                com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap createCallbackMapForPhone = phoneEntryViewModel5.createCallbackMapForPhone(pageConfig);
                boolean changedInstance3 = startRestartGroup.changedInstance(phoneEntryViewModel5);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt.m16406$r8$lambda$HTHtR7SlFblFGl3_bbqk0WNW28(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.ui.Modifier modifier6 = modifier4;
                com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayoutKt.PageLayout(pageConfig, new com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks((kotlin.jvm.functions.Function0) rememberedValue4, stepCallbacks.getOnNavigateBack(), null, 4, null), signupFormData, createCallbackMapForPhone, null, null, topBarConfig, false, startRestartGroup, (i8 & 14) | ((i8 << 15) & 3670016), 176);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                phoneEntryViewModel3 = phoneEntryViewModel5;
                modifier3 = modifier6;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                phoneEntryViewModel3 = phoneEntryViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryScreenKt.m16408$r8$lambda$bNFSJmqbNwtuwlfO6WoMhYaK0g(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig.this, topBarConfig, stepCallbacks, appNavigator, modifier3, phoneEntryViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-HTHtR7SlFblFGl3_bbqk0WNW28, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16406$r8$lambda$HTHtR7SlFblFGl3_bbqk0WNW28(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel) {
        phoneEntryViewModel.onNextClicked();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1lPmg0eDDQ00A5EPbup-vCqRjjY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16407$r8$lambda$1lPmg0eDDQ00A5EPbupvCqRjjY(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(m16409createOtpVerificationDestinationEzAuIyE(com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(phoneEntryViewModel.getCurrentPhoneNumber())));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bNFSJmqbNwtu-wlfO6WoMhYaK0g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16408$r8$lambda$bNFSJmqbNwtuwlfO6WoMhYaK0g(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneEntryViewModel phoneEntryViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PhoneEntryScreen(pageConfig, topBarConfig, stepCallbacks, appNavigator, modifier, phoneEntryViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
