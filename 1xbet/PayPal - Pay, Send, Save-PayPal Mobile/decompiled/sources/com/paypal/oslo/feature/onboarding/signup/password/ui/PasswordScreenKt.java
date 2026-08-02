package com.paypal.oslo.feature.onboarding.signup.password.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"PasswordScreen", "", "pageConfig", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;", "topBarConfig", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;", "stepCallbacks", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "passwordViewModel", "Lcom/paypal/oslo/feature/onboarding/signup/password/ui/PasswordViewModel;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PageConfig;Lcom/paypal/oslo/feature/oneonboarding/api/domain/TopBarConfig;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/StepCallbacks;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/onboarding/signup/password/ui/PasswordViewModel;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease", "passwordUiData", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupFormData$PasswordData;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PasswordScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PasswordScreen(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, final com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel2;
        int i4;
        final com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        final com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel4;
        int i5;
        java.lang.Object obj;
        boolean changed;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        boolean changedInstance2;
        boolean z2;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-58787968);
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
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    passwordViewModel2 = passwordViewModel;
                    if (startRestartGroup.changedInstance(passwordViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    passwordViewModel2 = passwordViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                passwordViewModel2 = passwordViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    modifier4 = modifier2;
                } else {
                    modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        z = false;
                        com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel5 = (com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        int i8 = i4 & (-57345);
                        passwordViewModel4 = passwordViewModel5;
                        i5 = i8;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-58787968, i5, -1, "com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreen (PasswordScreen.kt:51)");
                        }
                        java.lang.Object obj2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        obj = !(obj2 instanceof androidx.view.ComponentActivity) ? (androidx.view.ComponentActivity) obj2 : null;
                        changed = startRestartGroup.changed(obj);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider((android.app.Activity) obj);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider saveCredentialProvider = (com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider) rememberedValue;
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(passwordViewModel4.getPasswordDataFlow(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(passwordViewModel4);
                        changedInstance2 = startRestartGroup.changedInstance(saveCredentialProvider);
                        z2 = (i5 & 896) != 256 ? z : true;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!(changedInstance | changedInstance2 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1(passwordViewModel4, saveCredentialProvider, stepCallbacks, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData passwordData = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData) collectAsStateWithLifecycle.getValue();
                        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap createCallbackMapForPassword = passwordViewModel4.createCallbackMapForPassword(pageConfig);
                        changedInstance3 = startRestartGroup.changedInstance(passwordViewModel4);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt.$r8$lambda$FByQZfjMFX_v6U8wXS0ylr4x4bM(com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel6 = passwordViewModel4;
                        com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayoutKt.PageLayout(pageConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks.copy$default(stepCallbacks, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, 6, null), passwordData, createCallbackMapForPassword, modifier4, null, topBarConfig, false, startRestartGroup, (i5 & 14) | ((i5 << 3) & 57344) | ((i5 << 15) & 3670016), 160);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        passwordViewModel3 = passwordViewModel6;
                        modifier3 = modifier4;
                    }
                }
                z = false;
                i5 = i4;
                passwordViewModel4 = passwordViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                java.lang.Object obj22 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                if (!(obj22 instanceof androidx.view.ComponentActivity)) {
                }
                changed = startRestartGroup.changed(obj);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider((android.app.Activity) obj);
                startRestartGroup.updateRememberedValue(rememberedValue);
                com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider saveCredentialProvider2 = (com.paypal.oslo.feature.onboarding.signup.password.ui.SaveCredentialProvider) rememberedValue;
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(passwordViewModel4.getPasswordDataFlow(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(passwordViewModel4);
                changedInstance2 = startRestartGroup.changedInstance(saveCredentialProvider2);
                if ((i5 & 896) != 256) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2 | z2)) {
                }
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$PasswordScreen$1$1(passwordViewModel4, saveCredentialProvider2, stepCallbacks, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData passwordData2 = (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupFormData.PasswordData) collectAsStateWithLifecycle2.getValue();
                com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap createCallbackMapForPassword2 = passwordViewModel4.createCallbackMapForPassword(pageConfig);
                changedInstance3 = startRestartGroup.changedInstance(passwordViewModel4);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt.$r8$lambda$FByQZfjMFX_v6U8wXS0ylr4x4bM(com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel62 = passwordViewModel4;
                com.paypal.oslo.feature.onboarding.signup.ui.pagelayout.PageLayoutKt.PageLayout(pageConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks.copy$default(stepCallbacks, (kotlin.jvm.functions.Function0) rememberedValue3, null, null, 6, null), passwordData2, createCallbackMapForPassword2, modifier4, null, topBarConfig, false, startRestartGroup, (i5 & 14) | ((i5 << 3) & 57344) | ((i5 << 15) & 3670016), 160);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                passwordViewModel3 = passwordViewModel62;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                passwordViewModel3 = passwordViewModel2;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordScreenKt.m16379$r8$lambda$UgDQq1Lx_m6V85LvG5IhHGI_a8(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig.this, topBarConfig, stepCallbacks, modifier3, passwordViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FByQZfjMFX_v6U8wXS0ylr4x4bM(com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel) {
        passwordViewModel.onNavigateNext();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UgDQq1Lx_m6V85L-vG5IhHGI_a8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16379$r8$lambda$UgDQq1Lx_m6V85LvG5IhHGI_a8(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PageConfig pageConfig, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, com.paypal.oslo.feature.onboarding.signup.ui.model.StepCallbacks stepCallbacks, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.password.ui.PasswordViewModel passwordViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PasswordScreen(pageConfig, topBarConfig, stepCallbacks, modifier, passwordViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
