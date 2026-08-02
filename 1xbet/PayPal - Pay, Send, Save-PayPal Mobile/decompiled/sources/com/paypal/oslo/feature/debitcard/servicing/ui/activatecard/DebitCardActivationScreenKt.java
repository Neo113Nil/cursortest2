package com.paypal.oslo.feature.debitcard.servicing.ui.activatecard;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aC\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0014\u001a!\u0010\u0015\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u001a\u001a\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002\u001a\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010#\u001a\r\u0010$\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010#\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010#¨\u0006&²\u0006\n\u0010'\u001a\u00020\u000eX\u008a\u0084\u0002"}, d2 = {"DebitCardActivationScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/viewmodel/DebitCardActivationViewModel;Landroidx/compose/runtime/Composer;II)V", "DebitCardActivationContent", "cardImageUrl", "", "lastFourDigits", "uiState", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationEvent;", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DebitCardActivationContentSection", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/activatecard/mvi/DebitCardActivationState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DebitCardActivationFooterSection", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DebitCardActivationLoadingContent", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CardImageView", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "trackButtonEventAnalytics", "event", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "handleNavigationWithResult", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/DebitCardActivationResultType;", "DebitCardActivationScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "DebitCardActivationScreenCvvRequiredErrorPreview", "DebitCardActivationScreenInvalidCvvErrorPreview", "debit-card_prodRelease", "state"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardActivationScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:117:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardActivationScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel2;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.String stringResource;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-767902963);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    debitCardActivationViewModel2 = debitCardActivationViewModel;
                    if (startRestartGroup.changedInstance(debitCardActivationViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    debitCardActivationViewModel2 = debitCardActivationViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                debitCardActivationViewModel2 = debitCardActivationViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    debitCardActivationViewModel4 = debitCardActivationViewModel2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i4 = i3 & (-897);
                        debitCardActivationViewModel4 = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i4 = i3;
                        debitCardActivationViewModel4 = debitCardActivationViewModel2;
                    }
                    modifier3 = modifier4;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-767902963, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreen (DebitCardActivationScreen.kt:100)");
                }
                int i7 = i4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(debitCardActivationViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.ActivateCardAnalytics.INSTANCE.getUserIntent(debitCardActivationViewModel4.getActivateCardInfo().getProductName());
                if (debitCardActivationViewModel4.getActivateCardInfo().getPrimary()) {
                    startRestartGroup.startReplaceGroup(-1600964394);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_activate_card_success_message, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1600864264);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_secondary_card_activation_success, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                boolean changedInstance = startRestartGroup.changedInstance(userIntent);
                boolean changedInstance2 = startRestartGroup.changedInstance(debitCardActivationViewModel4);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$9nq1iloJMUSDiE_EccIT5dH90z4(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.this, debitCardActivationViewModel4, (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                boolean changedInstance3 = startRestartGroup.changedInstance(debitCardActivationViewModel4);
                int i8 = i7 & 14;
                boolean z = i8 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$Zxahli4IfoJ31xiu4su2NuwyZzw(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.this, appNavigator);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 1);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance4 = startRestartGroup.changedInstance(debitCardActivationViewModel4);
                boolean z2 = i8 == 4;
                boolean changed = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((z2 | changedInstance4 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$2$1(debitCardActivationViewModel4, appNavigator, stringResource, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState) collectAsStateWithLifecycle.getValue()).getClass());
                boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                boolean changedInstance5 = startRestartGroup.changedInstance(userIntent);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changed2 | changedInstance5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$DebitCardActivationScreen$3$1(userIntent, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState) collectAsStateWithLifecycle.getValue();
                if (debitCardActivationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial) {
                    startRestartGroup.startReplaceGroup(-1596003805);
                    DebitCardActivationContent(debitCardActivationViewModel4.getActivateCardInfo().getCardImageUrl(), debitCardActivationViewModel4.getActivateCardInfo().getLastFourDigits(), (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState) collectAsStateWithLifecycle.getValue(), function1, modifier3, startRestartGroup, (i7 << 9) & 57344, 0);
                    startRestartGroup.endReplaceGroup();
                    debitCardActivationViewModel3 = debitCardActivationViewModel4;
                } else {
                    final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel5 = debitCardActivationViewModel4;
                    if (debitCardActivationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Loading) {
                        startRestartGroup.startReplaceGroup(-1595528327);
                        getHighSpeedVideoSizes(debitCardActivationViewModel5.getActivateCardInfo().getCardImageUrl(), modifier3, startRestartGroup, i7 & 112, 0);
                        startRestartGroup.endReplaceGroup();
                        debitCardActivationViewModel3 = debitCardActivationViewModel5;
                    } else if (debitCardActivationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error) {
                        startRestartGroup.startReplaceGroup(-1595288356);
                        com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error) debitCardActivationState;
                        if (error.getInlineErrorType() == null) {
                            startRestartGroup.startReplaceGroup(-1595154715);
                            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                            int retryCount = error.getRetryCount();
                            boolean changedInstance6 = startRestartGroup.changedInstance(debitCardActivationViewModel5);
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (changedInstance6 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.m14327$r8$lambda$8ngS41wAtGyjlJp5dkdLt1nYyk(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                            boolean changedInstance7 = startRestartGroup.changedInstance(debitCardActivationViewModel5);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changedInstance7 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$Jg4sSS7ZXiFW0_QqSZg7cD4WORI(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            debitCardActivationViewModel3 = debitCardActivationViewModel5;
                            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(errorType, function0, (kotlin.jvm.functions.Function0) rememberedValue6, userIntent, fillMaxSize$default, false, java.lang.Integer.valueOf(retryCount), null, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9, 160);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            debitCardActivationViewModel3 = debitCardActivationViewModel5;
                            startRestartGroup.startReplaceGroup(-1594675548);
                            DebitCardActivationContent(debitCardActivationViewModel3.getActivateCardInfo().getCardImageUrl(), debitCardActivationViewModel3.getActivateCardInfo().getLastFourDigits(), (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState) collectAsStateWithLifecycle.getValue(), function1, modifier3, startRestartGroup, (i7 << 9) & 57344, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(779798904);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                debitCardActivationViewModel3 = debitCardActivationViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel6 = debitCardActivationViewModel3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.m14329$r8$lambda$K2s3yWbpfEaQ0qKAfHYSkvCSCw(com.paypal.oslo.core.navigation.AppNavigator.this, modifier5, debitCardActivationViewModel6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardActivationContent(final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1787787438);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(debitCardActivationState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1787787438, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationContent (DebitCardActivationScreen.kt:264)");
                }
                androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                androidx.compose.ui.Modifier modifier4 = modifier3;
                boolean z = false;
                androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
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
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize4(), 0.0f, 2, null);
                if ((i4 & 7168) == 2048) {
                    z = true;
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$7mXGWb_3tPRSyZ0gBvssJ3YyIws(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardToolBarKt.DebitCardToolBar(m1708paddingVpY3zN4$default, null, true, null, (kotlin.jvm.functions.Function0) rememberedValue, null, null, startRestartGroup, 384, 106);
                com.paypal.pds.components.DockKt.Dock(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), rememberScrollState, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-225818421, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$FRs4lxx7YZo88h_JwDBjOeqOZMo(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1834104076, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.m14333$r8$lambda$v1z_DhEAo5rHsfP3bnR2yp7s9k(str, str2, debitCardActivationState, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 27654, 4);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$VDa6G7TtCETr_dmsJOVsYwfhYhs(str, str2, debitCardActivationState, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1205068210);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(debitCardActivationState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1205068210, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationContentSection (DebitCardActivationScreen.kt:302)");
            }
            final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            getHighResolutionOutputSizeshNQ4ISI(str, startRestartGroup, i3 & 14);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_activate_card_title, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_activate_card_subtitle, new java.lang.Object[]{str2}, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error error = debitCardActivationState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error ? (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error) debitCardActivationState : null;
            com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType inlineErrorType = error != null ? error.getInlineErrorType() : null;
            int i4 = inlineErrorType == null ? -1 : com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.WhenMappings.$EnumSwitchMapping$0[inlineErrorType.ordinal()];
            if (i4 == 1) {
                startRestartGroup.startReplaceGroup(1246811060);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_activate_card_cvv_required_error, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (i4 == 2) {
                startRestartGroup.startReplaceGroup(1246816275);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_activate_card_invalid_cvv_error, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-3304139);
                startRestartGroup.endReplaceGroup();
                stringResource = null;
            }
            com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount = com.paypal.pds.components.CodeInputFieldCount.THREE;
            com.paypal.pds.components.InputType inputType = com.paypal.pds.components.InputType.Number;
            boolean changed = startRestartGroup.changed(softwareKeyboardController);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$HoF46bvqUdS04INDB12pPsq3UT4(androidx.compose.ui.platform.SoftwareKeyboardController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean z = (i3 & 7168) == 2048;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$IfpSbleI5xeSmbenVHanXhzYV1c(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.CodeInputKt.m21717CodeInputJ5mU35w(null, null, stringResource, codeInputFieldCount, inputType, (char) 0, false, false, 0, null, function0, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 1600512, 0, 931);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.m14328$r8$lambda$F2iHVHPnds771g9vaI1BiL2WC8(str, str2, debitCardActivationState, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-4724641);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-4724641, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationFooterSection (DebitCardActivationScreen.kt:356)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[2];
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_activate, startRestartGroup, 0);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.m14332$r8$lambda$q6iQoaX3SMWDVf3qF45pvfeuP8(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem(stringResource, (kotlin.jvm.functions.Function0) rememberedValue, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_did_not_get_your_card, startRestartGroup, 0);
            boolean z2 = i3 == 4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$f9kuXHL44ZTBw2b4Zi23c26z6BM(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            buttonGroupItemArr[1] = new com.paypal.pds.components.ButtonGroupItem(stringResource2, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, null, 108, null);
            com.paypal.pds.components.ButtonGroupKt.ButtonGroup(buttonGroupItemArr, null, null, null, startRestartGroup, 0, 14);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$ay91wcvyhDNOTp9ztYSWyRkmMsI(kotlin.jvm.functions.Function1.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-824197077);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-824197077, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationLoadingContent (DebitCardActivationScreen.kt:383)");
                }
                modifier2 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.debitcard.shared.ui.components.CardArtLoadingContentKt.CardArtLoadingContent(new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig(str, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_activate_card_loading_message, startRestartGroup, 0), null, null, false, 0.0f, 60, null), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_activate_card_loading_message, startRestartGroup, 0), com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), false, null, null, null, null, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$4Ey68StKDrtBjXv3SN3WtW1MC94(str, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-615193953);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-615193953, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.CardImageView (DebitCardActivationScreen.kt:404)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(str, null, androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(88.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(58.0f)), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape8()), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), startRestartGroup, (i2 & 14) | 196656, 24);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$pOR7N0nIlU_BICaYowVjOwQnXHU(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handleNavigationWithResult(final com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationResultType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$gaZMJCFkShnLuLdpInO1_5NKC4E(com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4Ey68StKDrtBjXv3SN3WtW1MC94(java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7mXGWb_3tPRSyZ0gBvssJ3YyIws(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8ngS41wAtGyj-lJp5dkdLt1nYyk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14327$r8$lambda$8ngS41wAtGyjlJp5dkdLt1nYyk(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel) {
        debitCardActivationViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ErrorActionCtaClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9nq1iloJMUSDiE_EccIT5dH90z4(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent debitCardActivationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationEvent, "");
        if (debitCardActivationEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivateCardClicked) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.ActivateCardAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.ActivateCardAnalytics.INSTANCE.getACTIVATE_BUTTON(), userIntentContext, null, 8, null);
        } else if (debitCardActivationEvent instanceof com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.DidNotGetYourCardClicked) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(com.paypal.oslo.feature.debitcard.shared.analytics.ActivateCardAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.ActivateCardAnalytics.INSTANCE.getDIDNT_GET_YOUR_CARD_BUTTON(), userIntentContext, null, 8, null);
        }
        debitCardActivationViewModel.processEvent(debitCardActivationEvent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$F2iHVHPnds771g9vaI1B-iL2WC8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14328$r8$lambda$F2iHVHPnds771g9vaI1BiL2WC8(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(str, str2, debitCardActivationState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FRs4lxx7YZo88h_JwDBjOeqOZMo(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-225818421, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationContent.<anonymous>.<anonymous> (DebitCardActivationScreen.kt:290)");
            }
            getHighSpeedVideoFpsRanges(function1, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HoF46bvqUdS04INDB12pPsq3UT4(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IfpSbleI5xeSmbenVHanXhzYV1c(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.CvvChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jg4sSS7ZXiFW0_QqSZg7cD4WORI(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel) {
        debitCardActivationViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ErrorDismissCtaClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$K2s3yWbpfEaQ0-qKAfHYSkvCSCw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14329$r8$lambda$K2s3yWbpfEaQ0qKAfHYSkvCSCw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardActivationScreen(appNavigator, modifier, debitCardActivationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VDa6G7TtCETr_dmsJOVsYwfhYhs(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardActivationContent(str, str2, debitCardActivationState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WQnmlC-a7ohLzHW5F6ty8gkPhqA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14330$r8$lambda$WQnmlCa7ohLzHW5F6ty8gkPhqA(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent debitCardActivationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zxahli4IfoJ31xiu4su2NuwyZzw(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.viewmodel.DebitCardActivationViewModel debitCardActivationViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        handleNavigationWithResult(debitCardActivationViewModel.getActivateCardInfo().getResultType(), appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ay91wcvyhDNOTp9ztYSWyRkmMsI(kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$de1NnSQqvfaKoseyXmyIdy6A5-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14331$r8$lambda$de1NnSQqvfaKoseyXmyIdy6A5g(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1525026522);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1525026522, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenPreview (DebitCardActivationScreen.kt:448)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial initial = new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Initial(null, 1, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.m14330$r8$lambda$WQnmlCa7ohLzHW5F6ty8gkPhqA((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DebitCardActivationContent("", "1234", initial, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 3126, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.m14331$r8$lambda$de1NnSQqvfaKoseyXmyIdy6A5g(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f9kuXHL44ZTBw2b4Zi23c26z6BM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.DidNotGetYourCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fP12Ffygm68Hn6JJQwCszE7nOwQ(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent debitCardActivationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gaZMJCFkShnLuLdpInO1_5NKC4E(com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType debitCardActivationResultType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationNavResult(debitCardActivationResultType, (java.lang.String) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mP18bKoXZGJv26KubEbWY9lDlyw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(81869888);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(81869888, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenCvvRequiredErrorPreview (DebitCardActivationScreen.kt:459)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error error = new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error("12", com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType.CVV_REQUIRED, null, null, 0, 28, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$fP12Ffygm68Hn6JJQwCszE7nOwQ((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DebitCardActivationContent("", "1234", error, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 3126, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$mP18bKoXZGJv26KubEbWY9lDlyw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pOR7N0nIlU_BICaYowVjOwQnXHU(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$q6iQoaX3SMWDVf3-qF45pvfeuP8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14332$r8$lambda$q6iQoaX3SMWDVf3qF45pvfeuP8(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent.ActivateCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$v1z_DhEAo5rHsfP3-bnR2yp7s9k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14333$r8$lambda$v1z_DhEAo5rHsfP3bnR2yp7s9k(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState debitCardActivationState, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1834104076, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationContent.<anonymous>.<anonymous> (DebitCardActivationScreen.kt:282)");
            }
            getHighResolutionOutputSizeshNQ4ISI(str, str2, debitCardActivationState, function1, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$w75RIUAhhCXGnXebHhVqknXUMQc(com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent debitCardActivationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yVsX6glgQGO1voK5haizh36-x08, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14334$r8$lambda$yVsX6glgQGO1voK5haizh36x08(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(634760234);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(634760234, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenInvalidCvvErrorPreview (DebitCardActivationScreen.kt:473)");
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error error = new com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState.Error("123", com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType.INVALID_CVV, null, null, 0, 28, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.$r8$lambda$w75RIUAhhCXGnXebHhVqknXUMQc((com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DebitCardActivationContent("", "1234", error, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 3126, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.DebitCardActivationScreenKt.m14334$r8$lambda$yVsX6glgQGO1voK5haizh36x08(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState access$DebitCardActivationScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.activatecard.mvi.DebitCardActivationState) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType.CVV_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInlineErrorType.INVALID_CVV.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
