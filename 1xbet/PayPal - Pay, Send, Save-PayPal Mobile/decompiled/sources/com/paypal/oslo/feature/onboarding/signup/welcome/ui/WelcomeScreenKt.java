package com.paypal.oslo.feature.onboarding.signup.welcome.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, d2 = {"WelcomeScreen", "", "onGetStartedClick", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/WelcomeViewModel;", "(Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/WelcomeViewModel;Landroidx/compose/runtime/Composer;II)V", "DarkStatusBarEffect", "isInspectionMode", "", "view", "Landroid/view/View;", "(ZLandroid/view/View;Landroidx/compose/runtime/Composer;I)V", "WelcomeScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "onboarding_prodRelease", "currentPageId", "Lcom/paypal/oslo/feature/onboarding/signup/welcome/ui/model/WelcomePageId;", "targetProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WelcomeScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WelcomeScreen(kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i3;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel2;
        final com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        final boolean booleanValue;
        androidx.compose.animation.core.TweenSpec tween$default;
        boolean changed;
        boolean changedInstance;
        boolean changed2;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$2$1 rememberedValue;
        boolean changed3;
        com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$3$1 rememberedValue2;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1578468128);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (startRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                welcomeViewModel2 = welcomeViewModel;
                if (startRestartGroup.changedInstance(welcomeViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                welcomeViewModel2 = welcomeViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            welcomeViewModel2 = welcomeViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
                } else {
                    function03 = function02;
                }
                if ((i2 & 2) != 0) {
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
                    com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel4 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i4 = i7 & (-113);
                    welcomeViewModel3 = welcomeViewModel4;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1578468128, i4, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreen (WelcomeScreen.kt:101)");
                    }
                    booleanValue = ((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue();
                    Camera2StreamConfigurationMap(booleanValue, (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()), startRestartGroup, 0);
                    final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(welcomeViewModel3.getCurrentPageId(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    float floatValue = ((java.lang.Number) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(welcomeViewModel3.getAnimationProgress(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).floatValue();
                    if (!booleanValue) {
                        tween$default = androidx.compose.animation.core.AnimationSpecKt.snap$default(0, 1, null);
                    } else {
                        tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(500, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null);
                    }
                    final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(floatValue, tween$default, 0.0f, null, null, startRestartGroup, 0, 28);
                    final com.airbnb.lottie.compose.LottieCompositionResult rememberLottieComposition = com.airbnb.lottie.compose.RememberLottieCompositionKt.rememberLottieComposition(com.airbnb.lottie.compose.LottieCompositionSpec.Asset.m9890boximpl(com.airbnb.lottie.compose.LottieCompositionSpec.Asset.m9891constructorimpl("feature_onboarding_welcome_animation.json")), "images/", null, null, null, null, startRestartGroup, 54, 60);
                    com.airbnb.lottie.LottieComposition value = rememberLottieComposition.getValue();
                    changed = startRestartGroup.changed(rememberLottieComposition);
                    changedInstance = startRestartGroup.changedInstance(welcomeViewModel3);
                    changed2 = startRestartGroup.changed(booleanValue);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changed | changedInstance | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$2$1(welcomeViewModel3, booleanValue, rememberLottieComposition, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(value, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                    com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) collectAsStateWithLifecycle.getValue();
                    changed3 = startRestartGroup.changed(collectAsStateWithLifecycle);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$3$1(collectAsStateWithLifecycle, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(welcomePageId, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function03;
                    final com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel5 = welcomeViewModel3;
                    com.paypal.pds.core.ThemeKt.Theme(true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-978285693, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$GaozD1lTY5LaUZv5CCO3w2SMp8U(com.airbnb.lottie.compose.LottieCompositionResult.this, animateFloatAsState, booleanValue, collectAsStateWithLifecycle, function04, welcomeViewModel5, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 54);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function02 = function03;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                }
                function03 = function02;
            }
            i4 = i7;
            welcomeViewModel3 = welcomeViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            booleanValue = ((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Camera2StreamConfigurationMap(booleanValue, (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView()), startRestartGroup, 0);
            final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(welcomeViewModel3.getCurrentPageId(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            float floatValue2 = ((java.lang.Number) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(welcomeViewModel3.getAnimationProgress(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).floatValue();
            if (!booleanValue) {
            }
            final androidx.compose.runtime.State animateFloatAsState2 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(floatValue2, tween$default, 0.0f, null, null, startRestartGroup, 0, 28);
            final com.airbnb.lottie.compose.LottieCompositionResult rememberLottieComposition2 = com.airbnb.lottie.compose.RememberLottieCompositionKt.rememberLottieComposition(com.airbnb.lottie.compose.LottieCompositionSpec.Asset.m9890boximpl(com.airbnb.lottie.compose.LottieCompositionSpec.Asset.m9891constructorimpl("feature_onboarding_welcome_animation.json")), "images/", null, null, null, null, startRestartGroup, 54, 60);
            com.airbnb.lottie.LottieComposition value2 = rememberLottieComposition2.getValue();
            changed = startRestartGroup.changed(rememberLottieComposition2);
            changedInstance = startRestartGroup.changedInstance(welcomeViewModel3);
            changed2 = startRestartGroup.changed(booleanValue);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changed | changedInstance | changed2)) {
            }
            rememberedValue = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$2$1(welcomeViewModel3, booleanValue, rememberLottieComposition2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(value2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId welcomePageId2 = (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) collectAsStateWithLifecycle2.getValue();
            changed3 = startRestartGroup.changed(collectAsStateWithLifecycle2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$WelcomeScreen$3$1(collectAsStateWithLifecycle2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(welcomePageId2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            final kotlin.jvm.functions.Function0 function042 = function03;
            final com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel52 = welcomeViewModel3;
            com.paypal.pds.core.ThemeKt.Theme(true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-978285693, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$GaozD1lTY5LaUZv5CCO3w2SMp8U(com.airbnb.lottie.compose.LottieCompositionResult.this, animateFloatAsState2, booleanValue, collectAsStateWithLifecycle2, function042, welcomeViewModel52, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            function02 = function03;
        } else {
            startRestartGroup.skipToGroupEnd();
            welcomeViewModel3 = welcomeViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.m16505$r8$lambda$BfGMfjWMfSclLrZd6kA6vlKrXU(kotlin.jvm.functions.Function0.this, welcomeViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final boolean z, final android.view.View view, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1935403845);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(view) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1935403845, i2, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.DarkStatusBarEffect (WelcomeScreen.kt:268)");
            }
            if (!z) {
                startRestartGroup.startReplaceGroup(1975073362);
                final boolean z2 = (view.getResources().getConfiguration().uiMode & 48) == 32;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(view);
                boolean changed = startRestartGroup.changed(z2);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$SxYOobyU2FrbCJhU5CcMCqtubx0(view, z2, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1975606717);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$pmsojkxKcFMjnlHux9gu63FpAIM(z, view, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$BfGM-fjWMfSclLrZd6kA6vlKrXU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16505$r8$lambda$BfGMfjWMfSclLrZd6kA6vlKrXU(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WelcomeScreen(function0, welcomeViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$D4lAeftBDH4B6g0tgmd6SWVyW4M(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GaozD1lTY5LaUZv5CCO3w2SMp8U(final com.airbnb.lottie.compose.LottieCompositionResult lottieCompositionResult, final androidx.compose.runtime.State state, boolean z, final androidx.compose.runtime.State state2, final kotlin.jvm.functions.Function0 function0, final com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-978285693, i, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreen.<anonymous> (WelcomeScreen.kt:152)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer.changed(lottieCompositionResult);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$cVmDl_pF4wN1j0uF3xz336i6UOE(com.airbnb.lottie.compose.LottieCompositionResult.this));
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(companion, (kotlin.jvm.functions.Function0) rememberedValue, composer, 6), 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 48, 2), com.paypal.oslo.feature.onboarding.api.testtags.PreOnboardingTestTags.Welcome.SCREEN);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            final androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.airbnb.lottie.compose.LottieCompositionResult lottieCompositionResult2 = lottieCompositionResult;
            com.airbnb.lottie.LottieComposition value = lottieCompositionResult2.getValue();
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.onboarding.api.testtags.PreOnboardingTestTags.Welcome.LOTTIE_ANIMATION);
            androidx.compose.ui.layout.ContentScale fillBounds = androidx.compose.ui.layout.ContentScale.INSTANCE.getFillBounds();
            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            boolean changed2 = composer.changed(state);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        float floatValue;
                        floatValue = ((java.lang.Number) androidx.compose.runtime.State.this.getValue()).floatValue();
                        return java.lang.Float.valueOf(floatValue);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation(value, (kotlin.jvm.functions.Function0) rememberedValue2, testTag2, false, false, false, false, null, true, null, center, fillBounds, false, false, null, null, false, composer, 100663680, 54, 127736);
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_navigation_previous, composer, 0);
            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_navigation_next, composer, 0);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
            boolean changed3 = composer.changed(stringResource);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$cmLm2cIPVIOWWZDW_LWuvInXuPk(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(fillMaxHeight$default, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null);
            com.paypal.pds.core.PDSIndication.None none = com.paypal.pds.core.PDSIndication.None.INSTANCE;
            boolean changed4 = composer.changed(state2);
            boolean changedInstance = composer.changedInstance(welcomeViewModel);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed4 | changedInstance) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.m16507$r8$lambda$vM9ApdCCaAnlDt7D6FcuxgU9yA(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel.this, state2);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(semantics$default, null, none, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue4, composer, 384, 29), composer, 0);
            androidx.compose.ui.Modifier fillMaxHeight$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
            boolean changed5 = composer.changed(stringResource2);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$D4lAeftBDH4B6g0tgmd6SWVyW4M(stringResource2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.ui.Modifier semantics$default2 = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(fillMaxHeight$default2, false, (kotlin.jvm.functions.Function1) rememberedValue5, 1, null);
            com.paypal.pds.core.PDSIndication.None none2 = com.paypal.pds.core.PDSIndication.None.INSTANCE;
            boolean changed6 = composer.changed(state2);
            boolean changedInstance2 = composer.changedInstance(welcomeViewModel);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if ((changed6 | changedInstance2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$L8eTDwukZEfErzapTuNQ1Kph50E(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel.this, state2);
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(semantics$default2, null, none2, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue6, composer, 384, 29), composer, 0);
            composer.endNode();
            if (lottieCompositionResult2.getValue() != null || z) {
                composer.startReplaceGroup(2050925282);
                com.paypal.pds.components.PaginationKt.Pagination(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing64(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId.getEntries().size(), ((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) state2.getValue()).ordinal(), composer, 0, 0);
                com.paypal.pds.core.ThemeKt.Theme(false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1381750943, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$kGRPnUS2aAhFm8LZgWU1mKXNiRo(androidx.compose.foundation.layout.BoxScope.this, state2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 54);
                androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), 0.0f, 1, null)), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing36()), com.paypal.oslo.feature.onboarding.api.testtags.PreOnboardingTestTags.Welcome.GET_STARTED_BUTTON);
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_welcome_cta_get_started, composer, 0);
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                boolean changed7 = composer.changed(state2);
                boolean changed8 = composer.changed(function0);
                java.lang.Object rememberedValue7 = composer.rememberedValue();
                if ((changed7 | changed8) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.m16506$r8$lambda$m1yx1ADMVdLtl838kPHxB8XzY(kotlin.jvm.functions.Function0.this, state2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue7, stringResource3, testTag3, null, null, primary, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2053069273);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L8eTDwukZEfErzapTuNQ1Kph50E(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, androidx.compose.runtime.State state) {
        com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.INSTANCE.trackItemPressed$onboarding_prodRelease((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) state.getValue(), com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.ITEM_RIGHT_EDGE);
        welcomeViewModel.updateFrame(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation.NEXT_FRAME);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$SxYOobyU2FrbCJhU5CcMCqtubx0(android.view.View view, final boolean z, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        android.app.Activity findActivity = com.paypal.oslo.feature.onboarding.shared.utils.ContextExtensionsKt.findActivity(context);
        if (findActivity == null) {
            return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$DarkStatusBarEffect$lambda$0$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                }
            };
        }
        final androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat = new androidx.core.view.WindowInsetsControllerCompat(findActivity.getWindow(), view);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(false);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$DarkStatusBarEffect$lambda$0$0$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.core.view.WindowInsetsControllerCompat.this.setAppearanceLightStatusBars(!z);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YqmVHAYR3JXBDn0nKQ7Zt0W7egk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(726137314);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(726137314, updateChangedFlags, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenPreview (WelcomeScreen.kt:286)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode().provides(java.lang.Boolean.TRUE), com.paypal.oslo.feature.onboarding.signup.welcome.ui.ComposableSingletons$WelcomeScreenKt.INSTANCE.m16503getLambda$122548574$onboarding_prodRelease(), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreenKt.$r8$lambda$YqmVHAYR3JXBDn0nKQ7Zt0W7egk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$cVmDl_pF4wN1j0uF3xz336i6UOE(com.airbnb.lottie.compose.LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue() != null;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cmLm2cIPVIOWWZDW_LWuvInXuPk(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kGRPnUS2aAhFm8LZgWU1mKXNiRo(androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1381750943, i, -1, "com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeScreen.<anonymous>.<anonymous>.<anonymous> (WelcomeScreen.kt:228)");
            }
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
            androidx.compose.ui.Modifier align = boxScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, centerHorizontally, composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, align);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt.WelcomeAnimatedTextCarousel((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) state.getValue(), false, null, composer, 48, 4);
            com.paypal.oslo.feature.onboarding.signup.welcome.ui.component.WelcomeAnimatedTextCarouselKt.WelcomeAnimatedTextCarousel((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) state.getValue(), true, null, composer, 48, 4);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m1-y-x1ADMVdLtl838kPHxB8XzY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16506$r8$lambda$m1yx1ADMVdLtl838kPHxB8XzY(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state) {
        com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.INSTANCE.trackItemPressed$onboarding_prodRelease((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) state.getValue(), com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.ITEM_GET_STARTED);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pmsojkxKcFMjnlHux9gu63FpAIM(boolean z, android.view.View view, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(z, view, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vM9Apd-CCaAnlDt7D6FcuxgU9yA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16507$r8$lambda$vM9ApdCCaAnlDt7D6FcuxgU9yA(com.paypal.oslo.feature.onboarding.signup.welcome.ui.WelcomeViewModel welcomeViewModel, androidx.compose.runtime.State state) {
        com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.INSTANCE.trackItemPressed$onboarding_prodRelease((com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) state.getValue(), com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.ITEM_LEFT_EDGE);
        welcomeViewModel.updateFrame(com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageNavigation.PREVIOUS_FRAME);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId access$WelcomeScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.onboarding.signup.welcome.ui.model.WelcomePageId) state.getValue();
    }
}
