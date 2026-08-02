package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001ag\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u001d\u001a'\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010#\u001a;\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010'\u001ag\u0010(\u001a\u00020\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\u00100\u001a\r\u00101\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00102\u001a\r\u00103\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00102\u001a\r\u00104\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00102¨\u00065²\u0006\n\u00106\u001a\u000207X\u008a\u0084\u0002"}, d2 = {"SavingsTermsScreen", "", "onboardingData", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;", "onOnBoardingSuccess", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onOnBoardingFail", "onOnBoardingCancel", "onOnBoardingInReview", "viewModel", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsViewModel;", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsViewModel;Landroidx/compose/runtime/Composer;II)V", "SavingsTermsEffectHandler", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "onBoardingRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "SavingsTermsEffectHandler-Shze3AU", "(Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SavingsTermsNavResultHandler", "SavingsTermsNavResultHandler-uLJ83ew", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsViewModel;Landroidx/compose/runtime/Composer;I)V", "SavingsTermsScreenContent", "callbacks", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsCallbacks;", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BenefitsList", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BenefitItem", "icon", "Lcom/paypal/pds/core/Icon;", "text", "", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DisclaimerCard", "onFdicInsuredClick", "onFdicRatesClick", "(Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageResult;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TermsFooter", "onAgreeClick", "onRateInfoClick", "onEDeliveryClick", "onDepositAccountClick", "onPrivacyClick", "isLoading", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "SavingsTermsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "BenefitsListPreview", "DisclaimerCardPreview", "savings_prodRelease", "uiState", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsTermsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0473  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsTermsScreen(final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel2;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        kotlin.jvm.functions.Function0<kotlin.Unit> function012;
        kotlin.jvm.functions.Function0<kotlin.Unit> function013;
        final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel4;
        int i8;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function014;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function015;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function016;
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks copy;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsLandingPageResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1053996086);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(savingsLandingPageResult) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function05 = function02;
                i3 |= startRestartGroup.changedInstance(function05) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function06 = function03;
                    i3 |= startRestartGroup.changedInstance(function06) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function07 = function04;
                        i3 |= startRestartGroup.changedInstance(function07) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                savingsTermsViewModel2 = savingsTermsViewModel;
                                if (startRestartGroup.changedInstance(savingsTermsViewModel2)) {
                                    i9 = 1048576;
                                    i3 |= i9;
                                }
                            } else {
                                savingsTermsViewModel2 = savingsTermsViewModel;
                            }
                            i9 = 524288;
                            i3 |= i9;
                        } else {
                            savingsTermsViewModel2 = savingsTermsViewModel;
                        }
                        i7 = i3;
                        if (startRestartGroup.shouldExecute((i7 & 599187) != 599186, i7 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i7 &= -3670017;
                                }
                                modifier3 = modifier2;
                                function014 = function05;
                                function013 = function07;
                                savingsTermsViewModel4 = savingsTermsViewModel2;
                                i8 = i7;
                                function015 = function06;
                            } else {
                                androidx.compose.ui.Modifier modifier4 = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda27
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function011 = (kotlin.jvm.functions.Function0) rememberedValue;
                                } else {
                                    function011 = function05;
                                }
                                if (i5 != 0) {
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda28
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function012 = (kotlin.jvm.functions.Function0) rememberedValue2;
                                } else {
                                    function012 = function06;
                                }
                                if (i6 != 0) {
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda29
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    function07 = (kotlin.jvm.functions.Function0) rememberedValue3;
                                }
                                if ((i2 & 64) != 0) {
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
                                    i7 &= -3670017;
                                    savingsTermsViewModel4 = (com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                                    function013 = function07;
                                } else {
                                    function013 = function07;
                                    savingsTermsViewModel4 = savingsTermsViewModel2;
                                }
                                i8 = i7;
                                modifier3 = modifier4;
                                function014 = function011;
                                function015 = function012;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1053996086, i8, -1, "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreen (SavingsTermsScreen.kt:139)");
                            }
                            com.paypal.oslo.core.navigation.AppNavigator appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
                            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(savingsTermsViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                            java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$4$1(null);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                            int i11 = i8 << 6;
                            int i12 = i8 << 3;
                            int i13 = i8;
                            getHighSpeedVideoFpsRangesFor(savingsTermsViewModel4, appNavigator, savingsLandingPageResult, function0, function014, function015, function013, rememberNavResultRequestId, startRestartGroup, (i11 & 7168) | ((i8 >> 18) & 14) | (i11 & 896) | (i12 & 57344) | (458752 & i12) | (i12 & 3670016));
                            getHighSpeedVideoFpsRanges(rememberNavResultRequestId, savingsTermsViewModel4, startRestartGroup, (i13 >> 15) & 112);
                            boolean changedInstance = startRestartGroup.changedInstance(savingsTermsViewModel4);
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda30
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18917$r8$lambda$GQIySy9zBT_8qbhnRxI20oqE9E(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            kotlin.jvm.functions.Function0 function017 = (kotlin.jvm.functions.Function0) rememberedValue5;
                            boolean changedInstance2 = startRestartGroup.changedInstance(savingsTermsViewModel4);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda31
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18923$r8$lambda$ggd1849QMS5YvUooLOP3MZk3Hs(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            kotlin.jvm.functions.Function0 function018 = (kotlin.jvm.functions.Function0) rememberedValue6;
                            boolean changedInstance3 = startRestartGroup.changedInstance(savingsTermsViewModel4);
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$3$1 rememberedValue7 = startRestartGroup.rememberedValue();
                            if (changedInstance3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$3$1(savingsTermsViewModel4);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            kotlin.jvm.functions.Function0 function019 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue7);
                            boolean changedInstance4 = startRestartGroup.changedInstance(savingsTermsViewModel4);
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$4$1 rememberedValue8 = startRestartGroup.rememberedValue();
                            if (changedInstance4 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$4$1(savingsTermsViewModel4);
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            kotlin.jvm.functions.Function0 function020 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue8);
                            boolean changedInstance5 = startRestartGroup.changedInstance(savingsTermsViewModel4);
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$5$1 rememberedValue9 = startRestartGroup.rememberedValue();
                            if (changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$5$1(savingsTermsViewModel4);
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                            }
                            kotlin.jvm.functions.Function0 function021 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue9);
                            boolean changedInstance6 = startRestartGroup.changedInstance(savingsTermsViewModel4);
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$6$1 rememberedValue10 = startRestartGroup.rememberedValue();
                            if (changedInstance6 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue10 = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$6$1(savingsTermsViewModel4);
                                startRestartGroup.updateRememberedValue(rememberedValue10);
                            }
                            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue10);
                            boolean changedInstance7 = startRestartGroup.changedInstance(savingsTermsViewModel4);
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$7$1 rememberedValue11 = startRestartGroup.rememberedValue();
                            if (changedInstance7 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue11 = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$7$1(savingsTermsViewModel4);
                                startRestartGroup.updateRememberedValue(rememberedValue11);
                            }
                            kotlin.jvm.functions.Function0 function023 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue11);
                            boolean changedInstance8 = startRestartGroup.changedInstance(savingsTermsViewModel4);
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$8$1 rememberedValue12 = startRestartGroup.rememberedValue();
                            if (changedInstance8 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue12 = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsScreen$callbacks$8$1(savingsTermsViewModel4);
                                startRestartGroup.updateRememberedValue(rememberedValue12);
                            }
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks savingsTermsCallbacks = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks(function017, function018, function019, function020, function021, function022, function023, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue12), false, 256, null);
                            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState savingsTermsState = (com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState) collectAsStateWithLifecycle.getValue();
                            if (savingsTermsState instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Loading) {
                                startRestartGroup.startReplaceGroup(910364768);
                                com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.Loader), null, null, null, startRestartGroup, 6, 14);
                                startRestartGroup.endReplaceGroup();
                                savingsTermsViewModel5 = savingsTermsViewModel4;
                                function016 = function015;
                                composer2 = startRestartGroup;
                            } else if ((savingsTermsState instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Content) || (savingsTermsState instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Submitting)) {
                                savingsTermsViewModel5 = savingsTermsViewModel4;
                                function016 = function015;
                                composer2 = startRestartGroup;
                                composer2.startReplaceGroup(910530370);
                                copy = savingsTermsCallbacks.copy((r20 & 1) != 0 ? savingsTermsCallbacks.onBackClick : null, (r20 & 2) != 0 ? savingsTermsCallbacks.onAgreeClick : null, (r20 & 4) != 0 ? savingsTermsCallbacks.onFdicInsuredClick : null, (r20 & 8) != 0 ? savingsTermsCallbacks.onFdicRatesClick : null, (r20 & 16) != 0 ? savingsTermsCallbacks.onRateInfoClick : null, (r20 & 32) != 0 ? savingsTermsCallbacks.onEDeliveryClick : null, (r20 & 64) != 0 ? savingsTermsCallbacks.onDepositAccountClick : null, (r20 & 128) != 0 ? savingsTermsCallbacks.onPrivacyClick : null, (r20 & 256) != 0 ? savingsTermsCallbacks.isLoading : ((com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Submitting);
                                SavingsTermsScreenContent(savingsLandingPageResult, copy, modifier3, composer2, i13 & 910, 0);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(savingsTermsState instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Error)) {
                                    startRestartGroup.startReplaceGroup(722102319);
                                    startRestartGroup.endReplaceGroup();
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                startRestartGroup.startReplaceGroup(910819569);
                                com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_review_error_title, startRestartGroup, 0);
                                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_retry, startRestartGroup, 0);
                                boolean changedInstance9 = startRestartGroup.changedInstance(savingsTermsViewModel4);
                                java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                                if (changedInstance9 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda32
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18920$r8$lambda$VRMS881XlIk2YwHsdAdEpro_lk(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                }
                                kotlin.jvm.functions.Function0 function024 = (kotlin.jvm.functions.Function0) rememberedValue13;
                                boolean z = (i13 & 57344) == 16384;
                                java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                                if (z || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$FC5qqLKBAtdFF7HMhOGZyMPwlZs(kotlin.jvm.functions.Function0.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                }
                                kotlin.jvm.functions.Function0 function025 = (kotlin.jvm.functions.Function0) rememberedValue14;
                                savingsTermsViewModel5 = savingsTermsViewModel4;
                                function016 = function015;
                                composer2 = startRestartGroup;
                                com.paypal.oslo.feature.savings.ui.basescreen.SavingsAccountErrorScreenKt.SavingsAccountErrorScreen(warning, stringResource, stringResource2, function024, null, null, function025, composer2, 6, 48);
                                composer2.endReplaceGroup();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function09 = function016;
                            modifier2 = modifier3;
                            function08 = function014;
                            function010 = function013;
                            savingsTermsViewModel3 = savingsTermsViewModel5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            function08 = function05;
                            function09 = function06;
                            function010 = function07;
                            savingsTermsViewModel3 = savingsTermsViewModel2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18921$r8$lambda$WJ69Cm8PimAJyt3_J_mZT4nT5w(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult.this, function0, modifier2, function08, function09, function010, savingsTermsViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function07 = function04;
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i7 & 599187) != 599186, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function06 = function03;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function07 = function04;
                if ((1572864 & i) == 0) {
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i7 & 599187) != 599186, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function05 = function02;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function06 = function03;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function07 = function04;
            if ((1572864 & i) == 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i7 & 599187) != 599186, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function05 = function02;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function06 = function03;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function07 = function04;
        if ((1572864 & i) == 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 599187) != 599186, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.Unit unit;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-540179562);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(savingsTermsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(savingsLandingPageResult) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(str) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((i2 & 4793491) != 4793490, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-540179562, i2, -1, "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffectHandler (SavingsTermsScreen.kt:217)");
            }
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(savingsTermsViewModel);
            boolean z = (458752 & i2) == 131072;
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (i2 & 896) == 256;
            boolean z4 = (29360128 & i2) == 8388608;
            boolean z5 = (i2 & 7168) == 2048;
            boolean z6 = (57344 & i2) == 16384;
            boolean z7 = (i2 & 3670016) == 1048576;
            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance | z | z2 | z3 | z4 | z5 | z6) || z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                rememberedValue = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsEffectHandler$1$1(savingsTermsViewModel, function03, appNavigator, str, function0, function02, function04, savingsLandingPageResult, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                unit = unit2;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18919$r8$lambda$QUIWfv3roEskW2am83qLRspG08(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.this, appNavigator, savingsLandingPageResult, function0, function02, function03, function04, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-23823035);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(savingsTermsViewModel) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-23823035, i2, -1, "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsNavResultHandler (SavingsTermsScreen.kt:274)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(savingsTermsViewModel);
            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler$1$1(savingsTermsViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandleruLJ83ew$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$SavingsTermsNavResultHandler-uLJ83ew$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m18926invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m18926invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i2 & 14) | 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$k_V3I2mMBf0nTCsqGgeb3GFTNtg(str, savingsTermsViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsTermsScreenContent(final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks savingsTermsCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsLandingPageResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsTermsCallbacks, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1746519133);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(savingsLandingPageResult) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(savingsTermsCallbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1746519133, i4, -1, "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenContent (SavingsTermsScreen.kt:304)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.Screen);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding.INSTANCE.getBACK_BUTTON()), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.TopBar), null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2106230557, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$1hoIGdgzGLKnlOL81gzD5Cc9tNE(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 196614, 92);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing24(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_subheading, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.Subheading), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                int i6 = i4 & 14;
                BenefitsList(savingsLandingPageResult, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.BenefitsList), startRestartGroup, i6 | 48, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                DisclaimerCard(savingsLandingPageResult, savingsTermsCallbacks.getOnFdicInsuredClick(), savingsTermsCallbacks.getOnFdicRatesClick(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.DisclaimerCard), startRestartGroup, i6 | 3072, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                startRestartGroup.endNode();
                composer2 = startRestartGroup;
                TermsFooter(savingsTermsCallbacks.getOnAgreeClick(), savingsTermsCallbacks.getOnRateInfoClick(), savingsTermsCallbacks.getOnEDeliveryClick(), savingsTermsCallbacks.getOnDepositAccountClick(), savingsTermsCallbacks.getOnPrivacyClick(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.TermsFooter), savingsTermsCallbacks.isLoading(), composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$JEafycV2dvY2R5xe8XqzJh1jsws(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult.this, savingsTermsCallbacks, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void BenefitsList(final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsLandingPageResult, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(257471816);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(savingsLandingPageResult) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(257471816, i3, -1, "com.paypal.oslo.feature.savings.ui.onboarding.BenefitsList (SavingsTermsScreen.kt:382)");
            }
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            BenefitItem(com.paypal.pds.core.Icon.CurrencyUsdCircle.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_benefit_apy, new java.lang.Object[]{savingsLandingPageResult.getAnnualPercentageYield()}, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.BenefitItemApy), startRestartGroup, 390, 0);
            BenefitItem(com.paypal.pds.core.Icon.ShieldCheck.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_benefit_fdic, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.BenefitItemFdic), startRestartGroup, 390, 0);
            BenefitItem(com.paypal.pds.core.Icon.Wallet.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_benefit_no_fees, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.BenefitItemNoFees), startRestartGroup, 390, 0);
            BenefitItem(com.paypal.pds.core.Icon.Calendar.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_benefit_tools, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.BenefitItemTools), startRestartGroup, 390, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$VtX_gfM4TYwTzSoqVgjbh3ZQi5Y(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BenefitItem(final com.paypal.pds.core.Icon icon, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1049229722);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1049229722, i4, -1, "com.paypal.oslo.feature.savings.ui.onboarding.BenefitItem (SavingsTermsScreen.kt:429)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.IconKt.Icon(icon, null, androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24()), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i4 & 14) | 27696, 0);
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, ((i4 >> 3) & 14) | 384, 6, 1018);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18913$r8$lambda$6N2l1Ehh_vKymr0qsFIB6Zq92k(com.paypal.pds.core.Icon.this, str, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DisclaimerCard(final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsLandingPageResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-38231423);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(savingsLandingPageResult) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-38231423, i3, -1, "com.paypal.oslo.feature.savings.ui.onboarding.DisclaimerCard (SavingsTermsScreen.kt:460)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_disclaimer_fdic_link, startRestartGroup, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_onboarding_fdic_link_text, startRestartGroup, 0);
                final com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_disclaimer_fdic, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(stringResource, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.FdicInsured)));
                final com.paypal.pds.core.RichText richText2 = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_disclaimer_apy, new java.lang.Object[]{com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion.formatIsoDateToDisplay$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE, savingsLandingPageResult.getMarketingRateEffectiveDate(), null, null, 6, null), savingsLandingPageResult.getAnnualPercentageYield(), com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.Companion.formatIsoDateToDisplay$default(com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE, savingsLandingPageResult.getMarketingNationalAverageReportDate(), null, null, 6, null)}, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(stringResource2, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.FdicRates)));
                modifier3 = modifier4;
                com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-65280677, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$QzFQJYRQS_KPdWpxk0LVj73RlWE(com.paypal.pds.core.RichText.this, function0, richText2, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 502);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18916$r8$lambda$FV8yRDcRVRkbBHNY7mPElrPRMo(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult.this, function0, function02, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TermsFooter(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final boolean z2;
        final androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(786237690);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function05) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            z2 = z;
            modifier3 = modifier2;
        } else {
            androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            boolean z3 = i5 != 0 ? false : z;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(786237690, i3, -1, "com.paypal.oslo.feature.savings.ui.onboarding.TermsFooter (SavingsTermsScreen.kt:536)");
            }
            com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_agreement, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_link_rate_info, startRestartGroup, 0), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.RateInfo), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_link_e_delivery, startRestartGroup, 0), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.EDelivery), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_webview_synchrony_deposit, startRestartGroup, 0), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.DepositAccount), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_link_privacy, startRestartGroup, 0), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy)}));
            int i6 = i3;
            androidx.compose.ui.Modifier modifier5 = modifier4;
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 5, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.TermsAgreement);
            com.paypal.pds.core.Color.ContentBase contentBase2 = contentBase;
            boolean z4 = (i6 & 112) == 32;
            boolean z5 = (i6 & 896) == 256;
            boolean z6 = (i6 & 7168) == 2048;
            boolean z7 = (57344 & i6) == 16384;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z5 | z4 | z6 | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18922$r8$lambda$baV_rh3Nlfq3TdCqPQWaTy3KuI(kotlin.jvm.functions.Function0.this, function03, function04, function05, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag, contentBase2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodySmall, null, startRestartGroup, 384, 48, 5112);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_agree_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.Onboarding.INSTANCE.getTERMS_ACCEPT_BUTTON()), com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.AgreeButton), null, null, null, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, z3, startRestartGroup, (i6 & 14) | 1572864 | ((i6 << 6) & 234881024), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            z2 = z3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$rmscxsOqKgX88or1M71wIjKgzZI(kotlin.jvm.functions.Function0.this, function02, function03, function04, function05, modifier3, z2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1hoIGdgzGLKnlOL81gzD5Cc9tNE(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks savingsTermsCallbacks, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2106230557, i, -1, "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenContent.<anonymous>.<anonymous> (SavingsTermsScreen.kt:315)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(savingsTermsCallbacks.getOnBackClick(), null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6N2l1Ehh_vKymr0qsFIB6Z-q92k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18913$r8$lambda$6N2l1Ehh_vKymr0qsFIB6Zq92k(com.paypal.pds.core.Icon icon, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BenefitItem(icon, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ex_cimUBprUzlXHr-zazH5Yt24M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18915$r8$lambda$Ex_cimUBprUzlXHrzazH5Yt24M(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(106546071);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(106546071, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenPreview (SavingsTermsScreen.kt:604)");
            }
            com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult = new com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult("4.00", "US", "10", "2025-01-01", "2025-01-01");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) rememberedValue7;
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            SavingsTermsScreenContent(savingsLandingPageResult, new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks(function0, function02, function03, function04, function05, function06, function07, (kotlin.jvm.functions.Function0) rememberedValue8, false, 256, null), null, startRestartGroup, 0, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18915$r8$lambda$Ex_cimUBprUzlXHrzazH5Yt24M(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FC5qqLKBAtdFF7HMhOGZyMPwlZs(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FV8yRDcRVRk-bBHNY7mPElrPRMo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18916$r8$lambda$FV8yRDcRVRkbBHNY7mPElrPRMo(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DisclaimerCard(savingsLandingPageResult, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GQI-ySy9zBT_8qbhnRxI20oqE9E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18917$r8$lambda$GQIySy9zBT_8qbhnRxI20oqE9E(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel) {
        savingsTermsViewModel.processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JEafycV2dvY2R5xe8XqzJh1jsws(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsCallbacks savingsTermsCallbacks, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsTermsScreenContent(savingsLandingPageResult, savingsTermsCallbacks, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MW4jSM3k13O-pYB4C3BpXHct6Eg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18918$r8$lambda$MW4jSM3k13OpYB4C3BpXHct6Eg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1543337032);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1543337032, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.onboarding.DisclaimerCardPreview (SavingsTermsScreen.kt:644)");
            }
            com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult = new com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult("4.00", "US", "10", "2025-04-01", "2025-05-01");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DisclaimerCard(savingsLandingPageResult, function0, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 432, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.m18918$r8$lambda$MW4jSM3k13OpYB4C3BpXHct6Eg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QUIWfv3roEskW2am83qLRsp-G08, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18919$r8$lambda$QUIWfv3roEskW2am83qLRspG08(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(savingsTermsViewModel, appNavigator, savingsLandingPageResult, function0, function02, function03, function04, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QzFQJYRQS_KPdWpxk0LVj73RlWE(com.paypal.pds.core.RichText richText, final kotlin.jvm.functions.Function0 function0, com.paypal.pds.core.RichText richText2, final kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-65280677, i, -1, "com.paypal.oslo.feature.savings.ui.onboarding.DisclaimerCard.<anonymous> (SavingsTermsScreen.kt:487)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_terms_disclaimer_balance, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.DisclaimerBalance), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 432, 6, 1016);
            com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.DisclaimerFdic);
            com.paypal.pds.core.Color.ContentBase contentBase2 = contentBase;
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$W_Jt5ptXglQUz6iS6o9l9LakcR4(kotlin.jvm.functions.Function0.this, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag, contentBase2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodySmall, null, composer, 432, 48, 5112);
            com.paypal.pds.core.Typography.BodySmall bodySmall2 = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase3 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsTestTags.DisclaimerApy);
            com.paypal.pds.core.Color.ContentBase contentBase4 = contentBase3;
            boolean changed2 = composer.changed(function02);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$nY5Bitqnkk7kigsMbnwu6AdcNgY(kotlin.jvm.functions.Function0.this, (java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText2, testTag2, contentBase4, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodySmall2, null, composer, 432, 48, 5112);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VRMS881XlIk-2YwHsdAdEpro_lk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18920$r8$lambda$VRMS881XlIk2YwHsdAdEpro_lk(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel) {
        savingsTermsViewModel.processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.RetryClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VtX_gfM4TYwTzSoqVgjbh3ZQi5Y(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BenefitsList(savingsLandingPageResult, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WJ69Cm8PimAJyt3_-J_mZT4nT5w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18921$r8$lambda$WJ69Cm8PimAJyt3_J_mZT4nT5w(com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult savingsLandingPageResult, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsTermsScreen(savingsLandingPageResult, function0, modifier, function02, function03, function04, savingsTermsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W_Jt5ptXglQUz6iS6o9l9LakcR4(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkClickHandler.INSTANCE.handleFdicInsuredLinkClick(str2, function0);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_pDBrVHs4LIQDyBUOJtrdcLlqDA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1688832311);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1688832311, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.onboarding.BenefitsListPreview (SavingsTermsScreen.kt:629)");
            }
            BenefitsList(new com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageResult("4.25", "US", "10", "2025-02-01", "2025-03-01"), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsScreenKt.$r8$lambda$_pDBrVHs4LIQDyBUOJtrdcLlqDA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$baV_rh3Nlf-q3TdCqPQWaTy3KuI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18922$r8$lambda$baV_rh3Nlfq3TdCqPQWaTy3KuI(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkClickHandler.INSTANCE.handleTermsFooterLinkClick(str2, function0, function02, function03, function04);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ggd184-9QMS5YvUooLOP3MZk3Hs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18923$r8$lambda$ggd1849QMS5YvUooLOP3MZk3Hs(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel) {
        savingsTermsViewModel.processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.AgreeClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k_V3I2mMBf0nTCsqGgeb3GFTNtg(java.lang.String str, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel savingsTermsViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, savingsTermsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nY5Bitqnkk7kigsMbnwu6AdcNgY(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkClickHandler.INSTANCE.handleFdicRatesLinkClick(str2, function0);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rmscxsOqKgX88or1M71wIjKgzZI(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TermsFooter(function0, function02, function03, function04, function05, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
