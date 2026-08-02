package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"EmailOtpVerificationScreen", "", "email", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "onErrorDisplay", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "", "viewModel", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailConfirmationViewModel;", "EmailOtpVerificationScreen-nhnDBDk", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailConfirmationViewModel;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailOtpVerificationScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:118:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: EmailOtpVerificationScreen-nhnDBDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16361EmailOtpVerificationScreennhnDBDk(final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function2, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function22;
        com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel2;
        int i5;
        final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function23;
        final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function24;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function25;
        int i6;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(293542954);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        emailConfirmationViewModel2 = emailConfirmationViewModel;
                        if (startRestartGroup.changedInstance(emailConfirmationViewModel2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        emailConfirmationViewModel2 = emailConfirmationViewModel;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    emailConfirmationViewModel2 = emailConfirmationViewModel;
                }
                i5 = i3;
                if (startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt.m16360$r8$lambda$0pgMhJkqbtzKlxXKvWnBBDwj_4((com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay) obj, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function24 = (kotlin.jvm.functions.Function2) rememberedValue;
                        } else {
                            function24 = function22;
                        }
                        if ((i2 & 16) != 0) {
                            androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                            }
                            emailConfirmationViewModel2 = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                            i6 = i5 & (-57345);
                            modifier3 = modifier4;
                            function25 = function24;
                        } else {
                            modifier3 = modifier4;
                            function25 = function24;
                            i6 = i5;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        function25 = function22;
                        i6 = i5;
                        modifier3 = modifier2;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(293542954, i6, -1, "com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreen (EmailOtpVerificationScreen.kt:67)");
                    }
                    int i9 = i6;
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel4 = emailConfirmationViewModel2;
                    final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function26 = function25;
                    final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(emailConfirmationViewModel2.getEmailConfirmationState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email m15921boximpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15921boximpl(str);
                    boolean changedInstance = startRestartGroup.changedInstance(emailConfirmationViewModel4);
                    int i10 = i9 & 14;
                    boolean z = i10 == 4;
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$2$1(emailConfirmationViewModel4, str, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(m15921boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i10);
                    boolean changedInstance2 = startRestartGroup.changedInstance(emailConfirmationViewModel4);
                    boolean z2 = (i9 & 112) == 32;
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changedInstance2 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$3$1(emailConfirmationViewModel4, appNavigator, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(emailConfirmationViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i9 >> 12) & 14);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_email_confirmation_title, startRestartGroup, 0);
                    com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay errorDisplay = ((com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) collectAsStateWithLifecycle.getValue()).getErrorDisplay();
                    boolean isLoading = ((com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) collectAsStateWithLifecycle.getValue()).isLoading();
                    boolean changedInstance3 = startRestartGroup.changedInstance(emailConfirmationViewModel4);
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$4$1(emailConfirmationViewModel4);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue4;
                    boolean changedInstance4 = startRestartGroup.changedInstance(emailConfirmationViewModel4);
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$5$1 rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$5$1(emailConfirmationViewModel4);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) rememberedValue5;
                    boolean changedInstance5 = startRestartGroup.changedInstance(emailConfirmationViewModel4);
                    com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$6$1 rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$EmailOtpVerificationScreen$6$1(emailConfirmationViewModel4);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.onboarding.api.testtags.PreOnboardingTestTags.EmailOtpVerification.SCREEN);
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) kFunction;
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) kFunction2;
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue6);
                    boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                    androidx.compose.ui.Modifier modifier5 = modifier3;
                    boolean z3 = (i9 & 7168) == 2048;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if ((changed | z3) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt.$r8$lambda$AAEsikpAaEiPBmUSqeg_bTr_pNs(androidx.compose.runtime.State.this, function26, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    com.paypal.oslo.feature.onboarding.signup.ui.component.OtpVerificationContentKt.OtpVerificationContent(str, stringResource, errorDisplay, isLoading, function0, function1, function02, testTag, (kotlin.jvm.functions.Function1) rememberedValue7, startRestartGroup, 0, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier5;
                    function23 = function26;
                    emailConfirmationViewModel3 = emailConfirmationViewModel4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function23 = function22;
                    emailConfirmationViewModel3 = emailConfirmationViewModel2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.signup.email.ui.EmailOtpVerificationScreenKt.$r8$lambda$0aQaHbSXUkEvNVLLGNHItE6yR_Q(str, appNavigator, modifier2, function23, emailConfirmationViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if ((i & 24576) == 0) {
            }
            i5 = i3;
            if (startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i & 24576) == 0) {
        }
        i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0aQaHbSXUkEvNVLLGNHItE6yR_Q(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.onboarding.signup.email.ui.EmailConfirmationViewModel emailConfirmationViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m16361EmailOtpVerificationScreennhnDBDk(str, appNavigator, modifier, function2, emailConfirmationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0pgMhJ-kqbtzKlxXKvWnBBDwj_4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16360$r8$lambda$0pgMhJkqbtzKlxXKvWnBBDwj_4(com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpErrorDisplay, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AAEsikpAaEiPBmUSqeg_bTr_pNs(androidx.compose.runtime.State state, kotlin.jvm.functions.Function2 function2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay errorDisplay = ((com.paypal.oslo.feature.onboarding.signup.email.ui.model.EmailConfirmationState) state.getValue()).getErrorDisplay();
        if (errorDisplay != null) {
            function2.invoke(errorDisplay, str);
        }
        return kotlin.Unit.INSTANCE;
    }
}
