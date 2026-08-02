package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a_\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001a\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u001d\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"RedeemRewardsScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsViewModel;Landroidx/compose/runtime/Composer;II)V", "RedeemRewardsScreenContent", "state", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;", "onAmountChange", "Lkotlin/Function1;", "", "onRedeemClick", "Lkotlin/Function0;", "onRedemptionOptionSelect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "onLoyaltyTermsClick", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RedeemRewardsScreenReadyPreview", "(Landroidx/compose/runtime/Composer;I)V", "RedeemRewardsScreenProcessingPreview", "RedeemRewardsScreenWithPayPalPlusPreview", "RedeemRewardsScreenPayPalPlusSelectedPreview", "RedeemRewardsScreenPayPalBalanceSelectedPreview", "RedeemRewardsScreenPPPlusEnrolledNoSelectionPreview", "RedeemRewardsScreenPPPlusEnrolledNoSelectionWithErrorPreview", "RedeemRewardsScreenPPPlusEnrolledBalanceSelectedPreview", "RedeemRewardsScreenPPPlusEnrolledPointsSelectedPreview", "PreviewAvailableRewards", "revolvingcredit-servicing_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RedeemRewardsScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RedeemRewardsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r3;
        boolean changedInstance;
        boolean z;
        boolean changed;
        boolean changed2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$RedeemRewardsScreen$1$1 rememberedValue;
        boolean z2;
        int i4;
        androidx.compose.runtime.Composer composer3;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        boolean changedInstance4;
        java.lang.Object rememberedValue4;
        final java.lang.String loyaltyProgramTermsUrl;
        kotlin.jvm.functions.Function0 function0;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2041555512);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                redeemRewardsViewModel2 = redeemRewardsViewModel;
                if (startRestartGroup.changedInstance(redeemRewardsViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                redeemRewardsViewModel2 = redeemRewardsViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            redeemRewardsViewModel2 = redeemRewardsViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                r3 = 0;
                redeemRewardsViewModel2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -113;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel3 = redeemRewardsViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2041555512, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreen (RedeemRewardsScreen.kt:47)");
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_title_cbmc, startRestartGroup, r3);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, startRestartGroup, r3);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(redeemRewardsViewModel3);
                int i6 = i3 & 14;
                z = i6 != 4 ? true : r3;
                changed = startRestartGroup.changed(stringResource);
                changed2 = startRestartGroup.changed(stringResource2);
                rememberedValue = startRestartGroup.rememberedValue();
                if ((!(changedInstance | z | changed) && !changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    z2 = r3;
                    i4 = 4;
                    composer3 = startRestartGroup;
                    rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$RedeemRewardsScreen$1$1(redeemRewardsViewModel3, appNavigator, stringResource, stringResource2, null);
                    composer3.updateRememberedValue(rememberedValue);
                } else {
                    z2 = r3;
                    i4 = 4;
                    composer3 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer3, 6);
                int i7 = i4;
                composer2 = composer3;
                redeemRewardsViewModel2 = redeemRewardsViewModel3;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState redeemRewardsState = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(redeemRewardsViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer2, 0, 7).getValue();
                changedInstance2 = composer2.changedInstance(redeemRewardsViewModel2);
                rememberedValue2 = composer2.rememberedValue();
                if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18608$r8$lambda$OHfGXUKmh32gNsSvAi0vsN5u1Y(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.this, (java.lang.String) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                changedInstance3 = composer2.changedInstance(redeemRewardsViewModel2);
                rememberedValue3 = composer2.rememberedValue();
                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18612$r8$lambda$v_EpQkW_37a74oZUWS0_uSOEI(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                changedInstance4 = composer2.changedInstance(redeemRewardsViewModel2);
                rememberedValue4 = composer2.rememberedValue();
                if (!changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$ql46_QgM7EBdJfAR4yUKPXDXSEs(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.this, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
                loyaltyProgramTermsUrl = redeemRewardsViewModel2.getArgs().getLoyaltyProgramTermsUrl();
                if (loyaltyProgramTermsUrl == null) {
                    loyaltyProgramTermsUrl = redeemRewardsViewModel2.getArgs().getRewardsProgramTermsUrl();
                }
                if (loyaltyProgramTermsUrl == null) {
                    composer2.startReplaceGroup(1053537396);
                    boolean z3 = i6 != i7 ? z2 : true;
                    boolean changed3 = composer2.changed(loyaltyProgramTermsUrl);
                    boolean changedInstance5 = composer2.changedInstance(redeemRewardsViewModel2);
                    java.lang.Object rememberedValue5 = composer2.rememberedValue();
                    if ((z3 | changed3 | changedInstance5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda32
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18613$r8$lambda$xiJAxmAZR8OuTcz3qSUikSR0wY(com.paypal.oslo.core.navigation.AppNavigator.this, loyaltyProgramTermsUrl, redeemRewardsViewModel2);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceGroup();
                    function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                } else {
                    composer2.startReplaceGroup(1053537395);
                    composer2.endReplaceGroup();
                    function0 = null;
                }
                getHighResolutionOutputSizeshNQ4ISI(redeemRewardsState, function1, function02, function12, function0, composer2, 0, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            r3 = 0;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel32 = redeemRewardsViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_account_summary_title_cbmc, startRestartGroup, r3);
            java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_paypal_balance, startRestartGroup, r3);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(redeemRewardsViewModel32);
            int i62 = i3 & 14;
            if (i62 != 4) {
            }
            changed = startRestartGroup.changed(stringResource3);
            changed2 = startRestartGroup.changed(stringResource22);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z | changed | changed2)) {
            }
            z2 = r3;
            i4 = 4;
            composer3 = startRestartGroup;
            rememberedValue = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$RedeemRewardsScreen$1$1(redeemRewardsViewModel32, appNavigator, stringResource3, stringResource22, null);
            composer3.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer3, 6);
            int i72 = i4;
            composer2 = composer3;
            redeemRewardsViewModel2 = redeemRewardsViewModel32;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState redeemRewardsState2 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(redeemRewardsViewModel32.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer2, 0, 7).getValue();
            changedInstance2 = composer2.changedInstance(redeemRewardsViewModel2);
            rememberedValue2 = composer2.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18608$r8$lambda$OHfGXUKmh32gNsSvAi0vsN5u1Y(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.this, (java.lang.String) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue2;
            changedInstance3 = composer2.changedInstance(redeemRewardsViewModel2);
            rememberedValue3 = composer2.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18612$r8$lambda$v_EpQkW_37a74oZUWS0_uSOEI(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.this);
                }
            };
            composer2.updateRememberedValue(rememberedValue3);
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue3;
            changedInstance4 = composer2.changedInstance(redeemRewardsViewModel2);
            rememberedValue4 = composer2.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$ql46_QgM7EBdJfAR4yUKPXDXSEs(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel.this, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption) obj);
                }
            };
            composer2.updateRememberedValue(rememberedValue4);
            kotlin.jvm.functions.Function1 function122 = (kotlin.jvm.functions.Function1) rememberedValue4;
            loyaltyProgramTermsUrl = redeemRewardsViewModel2.getArgs().getLoyaltyProgramTermsUrl();
            if (loyaltyProgramTermsUrl == null) {
            }
            if (loyaltyProgramTermsUrl == null) {
            }
            getHighResolutionOutputSizeshNQ4ISI(redeemRewardsState2, function13, function022, function122, function0, composer2, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$cKWAj8VTvxh5sn0c9R9oNT8Lq4U(com.paypal.oslo.core.navigation.AppNavigator.this, redeemRewardsViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState redeemRewardsState, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption, kotlin.Unit> function13;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption, kotlin.Unit> function14;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel copy;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel copy2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2004650184);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(redeemRewardsState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function13 = function12;
            i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function03 = function02;
                i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                } else {
                    if (i5 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$eYb1XnutJQtTcrp_MU6cWs2fcw8((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function13;
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i4 != 0 ? null : function03;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(2004650184, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenContent (RedeemRewardsScreen.kt:115)");
                    }
                    if (redeemRewardsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Initial) {
                        startRestartGroup.startReplaceGroup(-1971479304);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.loading.LoadingContentKt.LoadingContent(null, startRestartGroup, 0, 1);
                        startRestartGroup.endReplaceGroup();
                    } else if (redeemRewardsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready) {
                        startRestartGroup.startReplaceGroup(-1971476964);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready) redeemRewardsState;
                        copy2 = r20.copy((r26 & 1) != 0 ? r20.availableRewards : null, (r26 & 2) != 0 ? r20.isPayPalPlusEligible : false, (r26 & 4) != 0 ? r20.isPayPalPlusEnrolled : null, (r26 & 8) != 0 ? r20.payPalPlusConversionRate : null, (r26 & 16) != 0 ? r20.loyaltyProgramTermsUrl : null, (r26 & 32) != 0 ? r20.rewardsProgramTermsUrl : null, (r26 & 64) != 0 ? r20.rewardsCalculation : null, (r26 & 128) != 0 ? r20.selectedRedemptionOption : ready.getSelectedRedemptionOption(), (r26 & 256) != 0 ? r20.enteredAmount : ready.getEnteredAmount(), (r26 & 512) != 0 ? r20.validationError : null, (r26 & 1024) != 0 ? r20.termsText : null, (r26 & 2048) != 0 ? ready.getRewardsSummary().termsLinkText : null);
                        int i6 = i3 << 3;
                        int i7 = i3 << 9;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsContentKt.RedeemRewardsContent(copy2, ready.isPayPalPlusCbmcEnabled(), function1, function0, false, null, function14, function04, startRestartGroup, (3670016 & i7) | (i6 & 896) | 24576 | (i6 & 7168) | (i7 & 29360128), 32);
                        startRestartGroup.endReplaceGroup();
                    } else if (redeemRewardsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption) {
                        startRestartGroup.startReplaceGroup(-1971458149);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption processingRedemption = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption) redeemRewardsState;
                        copy = r20.copy((r26 & 1) != 0 ? r20.availableRewards : null, (r26 & 2) != 0 ? r20.isPayPalPlusEligible : false, (r26 & 4) != 0 ? r20.isPayPalPlusEnrolled : null, (r26 & 8) != 0 ? r20.payPalPlusConversionRate : null, (r26 & 16) != 0 ? r20.loyaltyProgramTermsUrl : null, (r26 & 32) != 0 ? r20.rewardsProgramTermsUrl : null, (r26 & 64) != 0 ? r20.rewardsCalculation : null, (r26 & 128) != 0 ? r20.selectedRedemptionOption : processingRedemption.getSelectedRedemptionOption(), (r26 & 256) != 0 ? r20.enteredAmount : processingRedemption.getEnteredAmount(), (r26 & 512) != 0 ? r20.validationError : null, (r26 & 1024) != 0 ? r20.termsText : null, (r26 & 2048) != 0 ? processingRedemption.getRewardsSummary().termsLinkText : null);
                        int i8 = i3 << 3;
                        int i9 = i3 << 9;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsContentKt.RedeemRewardsContent(copy, processingRedemption.isPayPalPlusCbmcEnabled(), function1, function0, true, null, function14, function04, startRestartGroup, (3670016 & i9) | (i8 & 896) | 24576 | (i8 & 7168) | (i9 & 29360128), 32);
                        startRestartGroup.endReplaceGroup();
                    } else if (redeemRewardsState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error) {
                        startRestartGroup.startReplaceGroup(-1971439954);
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error) redeemRewardsState;
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext context = error.getContext();
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel rewardsSummary = error.getRewardsSummary();
                        if (rewardsSummary != null) {
                            redeemRewardsUiModel = rewardsSummary.copy((r26 & 1) != 0 ? rewardsSummary.availableRewards : null, (r26 & 2) != 0 ? rewardsSummary.isPayPalPlusEligible : false, (r26 & 4) != 0 ? rewardsSummary.isPayPalPlusEnrolled : null, (r26 & 8) != 0 ? rewardsSummary.payPalPlusConversionRate : null, (r26 & 16) != 0 ? rewardsSummary.loyaltyProgramTermsUrl : null, (r26 & 32) != 0 ? rewardsSummary.rewardsProgramTermsUrl : null, (r26 & 64) != 0 ? rewardsSummary.rewardsCalculation : null, (r26 & 128) != 0 ? rewardsSummary.selectedRedemptionOption : error.getSelectedRedemptionOption(), (r26 & 256) != 0 ? rewardsSummary.enteredAmount : error.getEnteredAmount(), (r26 & 512) != 0 ? rewardsSummary.validationError : null, (r26 & 1024) != 0 ? rewardsSummary.termsText : null, (r26 & 2048) != 0 ? rewardsSummary.termsLinkText : null);
                        } else {
                            redeemRewardsUiModel = null;
                        }
                        com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.components.RedeemRewardsErrorContentKt.RedeemRewardsErrorContent(context, redeemRewardsUiModel, function1, function0, null, function14, startRestartGroup, ((i3 << 3) & 8064) | ((i3 << 6) & 458752), 16);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1971479411);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function13 = function14;
                    function03 = function04;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption, kotlin.Unit> function15 = function13;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function03;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18611$r8$lambda$mN1tSkd1EmMozAQ8GuXTwgt2XY(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.this, function1, function0, function15, function05, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function03 = function02;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function13 = function12;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function03 = function02;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$-yJBE2aX-DS7ld7ykV_tN0gAg0c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18601$r8$lambda$yJBE2aXDS7ld7ykV_tN0gAg0c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-891650530);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-891650530, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenPPPlusEnrolledNoSelectionPreview (RedeemRewardsScreen.kt:261)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "150.00"), true, java.lang.Boolean.TRUE, null, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation(java.lang.Float.valueOf(0.01f), null, null, null), null, null, null, null, null, 4024, null), "0", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE, "test-account-id-6", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 0.0f, false, true, 96, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$GTt8w5UKMD9CfGgK8lnj657c5Cs((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(ready, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18601$r8$lambda$yJBE2aXDS7ld7ykV_tN0gAg0c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1ftMH9J6oxKX43fRMmuKs2F1Vpg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1803864283);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1803864283, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenPPPlusEnrolledPointsSelectedPreview (RedeemRewardsScreen.kt:351)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "150.00"), true, java.lang.Boolean.TRUE, null, "https://www.paypal.com/us/webapps/mpp/ua/pp-plus-tnc", null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation(java.lang.Float.valueOf(0.01f), null, null, null), null, null, null, null, null, 4008, null), "25.00", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_PLUS_POINTS, "test-account-id-9", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 0.0f, false, true, 96, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18610$r8$lambda$le49b3WDpYYjAqwhJvYXChVM7M((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda3
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
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            getHighResolutionOutputSizeshNQ4ISI(ready, function1, function0, null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 25008, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$1ftMH9J6oxKX43fRMmuKs2F1Vpg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9ByWVZl7EX92foHYxA1uISNKGlQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ae1Tye2glRysLgsxML_jHFGADjU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(709462993);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(709462993, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenWithPayPalPlusPreview (RedeemRewardsScreen.kt:201)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "152.00"), true, null, null, null, null, null, null, null, null, null, null, 4092, null), "", null, "test-account-id-3", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 0.0f, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$i_VMYuG4ESV0a3rHZFFAAVLashA((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(ready, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$Ae1Tye2glRysLgsxML_jHFGADjU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AzpqP1-Y4IhMf883PZmyp_SzHNk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18602$r8$lambda$AzpqP1Y4IhMf883PZmyp_SzHNk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(372350197);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(372350197, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenReadyPreview (RedeemRewardsScreen.kt:160)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "150.00"), false, null, null, null, null, null, null, null, null, null, null, 4092, null), "", null, "test-account-id-1", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 0.0f, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$FntmBdFoh2jYYNUbN7duygqZ3DU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(ready, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18602$r8$lambda$AzpqP1Y4IhMf883PZmyp_SzHNk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BnPsm2J63Vees4KgcYix19uKvIw(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.RevolvingCreditWebViewDestination(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs(str, redeemRewardsViewModel.getArgs().getCreditProductIdentifier(), false, false, (java.lang.String) null, false, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CPJNSoBC4wk2cTnDgNz04xlOF5E(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(865581974);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(865581974, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenPayPalBalanceSelectedPreview (RedeemRewardsScreen.kt:241)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "14.85"), true, null, null, null, null, null, null, null, null, null, null, 4092, null), "", null, "test-account-id-5", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 0.0f, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$Fvlo1t5LMiKlFoLSwopvJnpLAxk((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(ready, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$CPJNSoBC4wk2cTnDgNz04xlOF5E(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FntmBdFoh2jYYNUbN7duygqZ3DU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fvlo1t5LMiKlFoLSwopvJnpLAxk(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GMK-mWjd89jGCmPK7ARJ-pqrpLg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18605$r8$lambda$GMKmWjd89jGCmPK7ARJpqrpLg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(129182065);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(129182065, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenProcessingPreview (RedeemRewardsScreen.kt:180)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption processingRedemption = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "151.00"), false, null, null, null, null, null, null, null, null, null, null, 4092, null), "50.00", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_BALANCE, "test-account-id-2", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, false, 32, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$IHFy0htfBnRcADC6jtXmzqdR5Ws((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(processingRedemption, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18605$r8$lambda$GMKmWjd89jGCmPK7ARJpqrpLg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GTt8w5UKMD9CfGgK8lnj657c5Cs(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IHFy0htfBnRcADC6jtXmzqdR5Ws(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LDLA7tgRnYMh0QM1zkORq0aEzYM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-526192858);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-526192858, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenPayPalPlusSelectedPreview (RedeemRewardsScreen.kt:221)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "153.00"), true, null, null, null, null, null, null, null, null, null, null, 4092, null), "50.00", null, "test-account-id-4", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 0.0f, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$9ByWVZl7EX92foHYxA1uISNKGlQ((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(ready, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$LDLA7tgRnYMh0QM1zkORq0aEzYM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NZZZ5XlKP8ZKsx0r3zpc5dtba-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18607$r8$lambda$NZZZ5XlKP8ZKsx0r3zpc5dtba0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OH-fGXUKmh32gNsSvAi0vsN5u1Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18608$r8$lambda$OHfGXUKmh32gNsSvAi0vsN5u1Y(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        redeemRewardsViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnAmountChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cKWAj8VTvxh5sn0c9R9oNT8Lq4U(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RedeemRewardsScreen(appNavigator, redeemRewardsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eYb1XnutJQtTcrp_MU6cWs2fcw8(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hAt8wJdz0N21DN6YJ6kWgkhhTys(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i_VMYuG4ESV0a3rHZFFAAVLashA(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$le-49b3WDpYYjAqwhJvYXChVM7M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18610$r8$lambda$le49b3WDpYYjAqwhJvYXChVM7M(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mN1tSkd1EmMozA-Q8GuXTwgt2XY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18611$r8$lambda$mN1tSkd1EmMozAQ8GuXTwgt2XY(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState redeemRewardsState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(redeemRewardsState, function1, function0, function12, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ql46_QgM7EBdJfAR4yUKPXDXSEs(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionOption, "");
        redeemRewardsViewModel.processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedemptionOptionSelected(redemptionOption));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v_-EpQkW_37a74oZUWS0_uS-OEI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18612$r8$lambda$v_EpQkW_37a74oZUWS0_uSOEI(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel) {
        redeemRewardsViewModel.processEvent(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEvent.OnRedeemClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x__pIVDt_8ha8T3zfMgVPF2naU8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(36099796);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(36099796, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenPPPlusEnrolledNoSelectionWithErrorPreview (RedeemRewardsScreen.kt:290)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "150.00"), true, java.lang.Boolean.TRUE, null, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation(java.lang.Float.valueOf(0.01f), null, null, null), null, null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_rewards_redemption_select_redemption_option_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, null, 3512, null), "25.00", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE, "test-account-id-7", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 0.0f, false, true, 96, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$hAt8wJdz0N21DN6YJ6kWgkhhTys((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(ready, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$x__pIVDt_8ha8T3zfMgVPF2naU8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xiJAxmAZR8Ou-Tcz3qSUikSR0wY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18613$r8$lambda$xiJAxmAZR8OuTcz3qSUikSR0wY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsViewModel redeemRewardsViewModel) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$BnPsm2J63Vees4KgcYix19uKvIw(str, redeemRewardsViewModel, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ybmPLRzPJwAECdtgRd0o_uVtuJA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1542795926);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1542795926, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenPPPlusEnrolledBalanceSelectedPreview (RedeemRewardsScreen.kt:322)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "150.00"), true, java.lang.Boolean.TRUE, null, null, null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation(java.lang.Float.valueOf(0.01f), null, null, null), null, null, null, null, null, 4024, null), "25.00", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.PAYPAL_BALANCE, "test-account-id-8", com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, 0.0f, false, true, 96, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.m18607$r8$lambda$NZZZ5XlKP8ZKsx0r3zpc5dtba0((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            getHighResolutionOutputSizeshNQ4ISI(ready, function1, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, startRestartGroup, 432, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.RedeemRewardsScreenKt.$r8$lambda$ybmPLRzPJwAECdtgRd0o_uVtuJA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
