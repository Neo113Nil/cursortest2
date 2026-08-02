package com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"SignUpWithGoogleStepScreen", "", "destination", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/ui/navigation/SignUpWithGoogleDestination;", "oneOnboardingNavigator", "Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "nameAttacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/ui/navigation/SignUpWithGoogleDestination;Lcom/paypal/oslo/feature/oneonboarding/ui/navigation/OneOnboardingNavigator;Lcom/paypal/oslo/feature/oneonboarding/ui/OneOnboardingFlowViewModel;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/di/NameViewComponentAttacher;Landroidx/compose/runtime/Composer;II)V", "SignUpWithGoogleStepScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignUpWithGoogleStepScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignUpWithGoogleStepScreen(final com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination signUpWithGoogleDestination, final com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.StepNameViewComponentAttacher stepNameViewComponentAttacher = nameViewComponentAttacher;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signUpWithGoogleDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oneOnboardingFlowViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1637267840);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(signUpWithGoogleDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(oneOnboardingFlowViewModel) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= (32768 & i) == 0 ? startRestartGroup.changed(stepNameViewComponentAttacher) : startRestartGroup.changedInstance(stepNameViewComponentAttacher) ? 16384 : 8192;
            }
            i5 = i3;
            if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
                startRestartGroup.skipToGroupEnd();
                nameViewComponentAttacher2 = stepNameViewComponentAttacher;
            } else {
                androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    stepNameViewComponentAttacher = com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.StepNameViewComponentAttacher.INSTANCE;
                }
                final com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher3 = stepNameViewComponentAttacher;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1637267840, i5, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreen (SignUpWithGoogleStepScreen.kt:55)");
                }
                final com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK, null, null, 6, null);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                java.lang.Object obj = rememberedValue;
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    boolean[] zArr = {false};
                    startRestartGroup.updateRememberedValue(zArr);
                    obj = zArr;
                }
                final boolean[] zArr2 = (boolean[]) obj;
                com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = signUpWithGoogleDestination.getIntentId();
                boolean changedInstance = startRestartGroup.changedInstance(zArr2);
                boolean changedInstance2 = startRestartGroup.changedInstance(signUpWithGoogleDestination);
                boolean changedInstance3 = startRestartGroup.changedInstance(oneOnboardingFlowViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2 | changedInstance3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.m16844$r8$lambda$rRRnqtSMnm4mHSa3yaY5NYXvGo(zArr2, signUpWithGoogleDestination, oneOnboardingFlowViewModel);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final java.lang.String extractCountryCodeOrCloseFlow = com.paypal.oslo.feature.oneonboarding.inventory.steps.common.ExtractCountryCodeKt.extractCountryCodeOrCloseFlow(intentId, (kotlin.jvm.functions.Function0) rememberedValue2);
                if (extractCountryCodeOrCloseFlow != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowKt.OneOnboardingFlow(signUpWithGoogleDestination.getIntentId(), oneOnboardingNavigator, oneOnboardingFlowViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1817490399, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.m16841$r8$lambda$acJn7JMLB6rmSIRzQqPAvp7K_k(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination.this, extractCountryCodeOrCloseFlow, oneOnboardingFlowViewModel, topBarConfig, modifier4, nameViewComponentAttacher3, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i5 & 112) | 3072 | (i5 & 896), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    nameViewComponentAttacher2 = nameViewComponentAttacher3;
                } else {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final androidx.compose.ui.Modifier modifier5 = modifier3;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.m16842$r8$lambda$0cXyry9I2tBB8VFNkbDOhU0zE(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier5, nameViewComponentAttacher3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.m16843$r8$lambda$QHPq_am3UvJmjtSi68aM61BcoQ(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination.this, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier2, nameViewComponentAttacher2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                };
                endRestartGroup.updateScope(function2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 9363) == 9362, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-acJn7JMLB6rmSIRzQqPAvp7K_k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16841$r8$lambda$acJn7JMLB6rmSIRzQqPAvp7K_k(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination signUpWithGoogleDestination, java.lang.String str, final com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1817490399, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreen.<anonymous> (SignUpWithGoogleStepScreen.kt:79)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig stepComponentConfig = signUpWithGoogleDestination.getStepComponentConfig();
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = signUpWithGoogleDestination.getIntentId();
            boolean changedInstance = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.$r8$lambda$lf8LGcrRrlCkI9UmQL4qQmEzEUc(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this, (com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.$r8$lambda$Y1vPwmBru8HUQ0PwMEfKS_jYmSU(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(oneOnboardingFlowViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.$r8$lambda$ZA9qLy98CpFqe0iWYCXUSsJBSFE(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.SignUpWithGoogleStepScreenContent(stepComponentConfig, function1, function0, topBarConfig, (kotlin.jvm.functions.Function0) rememberedValue3, intentId, modifier, str, nameViewComponentAttacher, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0cXyry9I2tB--B8VFNkbDOhU0zE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16842$r8$lambda$0cXyry9I2tBB8VFNkbDOhU0zE(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination signUpWithGoogleDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignUpWithGoogleStepScreen(signUpWithGoogleDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, nameViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QHPq_am3UvJmjtSi68aM61Bc-oQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16843$r8$lambda$QHPq_am3UvJmjtSi68aM61BcoQ(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination signUpWithGoogleDestination, com.paypal.oslo.feature.oneonboarding.ui.navigation.OneOnboardingNavigator oneOnboardingNavigator, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.oneonboarding.inventory.views.name.di.NameViewComponentAttacher nameViewComponentAttacher, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignUpWithGoogleStepScreen(signUpWithGoogleDestination, oneOnboardingNavigator, oneOnboardingFlowViewModel, modifier, nameViewComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Y1vPwmBru8HUQ0PwMEfKS_jYmSU(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepForward();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZA9qLy98CpFqe0iWYCXUSsJBSFE(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        oneOnboardingFlowViewModel.stepBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gcMIBkKLFVLkiFxn6gktsv2xe60(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1102911826);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1102911826, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenPreview (SignUpWithGoogleStepScreen.kt:99)");
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-step"), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.GoogleAccountInfoDisplayComponentConfig(com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl("preview-google-account"), com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16627constructorimpl("john.doe@gmail.com"), com.paypal.oslo.feature.oneonboarding.inventory.views.signupwithgoogle.domain.ProfilePictureUrl.m17080constructorimpl("https://lh3.googleusercontent.com/a/default-user"), (kotlin.jvm.internal.DefaultConstructorMarker) null)), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.m16845$r8$lambda$xDDoRRrsy4HLu2hO5hvDwfz9Ws((com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig topBarConfig = new com.paypal.oslo.feature.oneonboarding.api.domain.TopBarConfig(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.BACK, null, null, 6, null);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenContentKt.SignUpWithGoogleStepScreenContent(signUpWithGoogleStepComponentConfig, function1, function0, topBarConfig, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.feature.oneonboarding.ui.preview.PreviewIntentFactoryKt.previewAccountCreationIntentId(), null, null, null, startRestartGroup, 25008, 448);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.SignUpWithGoogleStepScreenKt.$r8$lambda$gcMIBkKLFVLkiFxn6gktsv2xe60(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lf8LGcrRrlCkI9UmQL4qQmEzEUc(com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel, com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        oneOnboardingFlowViewModel.contributeCollectedItem(collectedItem);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rRRnqtSM-nm4mHSa3yaY5NYXvGo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16844$r8$lambda$rRRnqtSMnm4mHSa3yaY5NYXvGo(boolean[] zArr, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.ui.navigation.SignUpWithGoogleDestination signUpWithGoogleDestination, com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel oneOnboardingFlowViewModel) {
        if (!zArr[0]) {
            zArr[0] = true;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Unexpected intent type for SWG step", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("intent_type", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(signUpWithGoogleDestination.getIntentId().getClass()).getSimpleName())), null, null, 12, null);
            com.paypal.oslo.feature.oneonboarding.ui.OneOnboardingFlowViewModel.closeFlow$default(oneOnboardingFlowViewModel, null, 1, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xDDoRRrsy4HLu2h-O5hvDwfz9Ws, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16845$r8$lambda$xDDoRRrsy4HLu2hO5hvDwfz9Ws(com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem collectedItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectedItem, "");
        return kotlin.Unit.INSTANCE;
    }
}
