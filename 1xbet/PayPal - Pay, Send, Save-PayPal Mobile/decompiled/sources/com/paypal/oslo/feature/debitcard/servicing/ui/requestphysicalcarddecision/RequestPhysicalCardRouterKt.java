package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a9\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, d2 = {"RequestPhysicalCardRouter", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "requestPhysicalCardInfo", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/viewmodel/RequestPhysicalCardDecisionViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/viewmodel/RequestPhysicalCardDecisionViewModel;Landroidx/compose/runtime/Composer;II)V", "HandleRequestPhysicalCardWithFeeFlow", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/viewmodel/RequestPhysicalCardDecisionViewModel;Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;Landroidx/compose/runtime/Composer;I)V", "RequestPhysicalCardWithFeeFlow", "debitInstrumentResponse", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/model/DebitInstrumentForRequestPhysicalCardResponse;Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/viewmodel/RequestPhysicalCardDecisionViewModel;Landroidx/compose/runtime/Composer;I)V", "LoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "ErrorContent", "errorType", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "retryCount", "", "userIntent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionEvent;", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;ILcom/paypal/oslo/core/telemetry/analytics/schema/context/UserIntentContext;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RequestPhysicalCardDecisionLoadingPreview", "RequestPhysicalCardDecisionErrorPreview", "debit-card_prodRelease", "state", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcarddecision/mvi/RequestPhysicalCardDecisionState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RequestPhysicalCardRouterKt {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RequestPhysicalCardRouter(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel2;
        final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        ?? r14;
        int i4;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardInfo, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1596915725);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(requestPhysicalCardInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                requestPhysicalCardDecisionViewModel2 = requestPhysicalCardDecisionViewModel;
                if (startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                requestPhysicalCardDecisionViewModel2 = requestPhysicalCardDecisionViewModel;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            requestPhysicalCardDecisionViewModel2 = requestPhysicalCardDecisionViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                }
            } else if ((i2 & 4) != 0) {
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
                z = true;
                r14 = 0;
                requestPhysicalCardDecisionViewModel3 = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i6 & (-897);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1596915725, i4, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouter (RequestPhysicalCardRouter.kt:71)");
                }
                changedInstance = startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$nxgWJ5DaJetAm5qtMCRzAn_zIHA(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(r14, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, r14, z ? 1 : 0);
                if (!requestPhysicalCardInfo.isPhysicalCardFee()) {
                    startRestartGroup.startReplaceGroup(-1636017009);
                    boolean changedInstance2 = startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel3);
                    boolean z2 = (i4 & 112) == 32 ? z ? 1 : 0 : r14;
                    com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardRouter$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changedInstance2 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardRouter$2$1(requestPhysicalCardDecisionViewModel3, requestPhysicalCardInfo, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    int i7 = i4 >> 3;
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(requestPhysicalCardInfo, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i7 & 14);
                    getHighSpeedVideoSizes(appNavigator, requestPhysicalCardDecisionViewModel3, requestPhysicalCardInfo, startRestartGroup, (i7 & 112) | (i4 & 14) | ((i4 << 3) & 896));
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1635565122);
                    boolean z3 = (i4 & 14) == 4 ? z ? 1 : 0 : r14;
                    boolean z4 = z;
                    if ((i4 & 112) != 32) {
                        z4 = r14;
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardRouter$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((z3 | z4) != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardRouter$3$1(appNavigator, requestPhysicalCardInfo, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(requestPhysicalCardInfo, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, (i4 >> 3) & 14);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            z = true;
            r14 = 0;
            requestPhysicalCardDecisionViewModel3 = requestPhysicalCardDecisionViewModel2;
            i4 = i6;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            changedInstance = startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$nxgWJ5DaJetAm5qtMCRzAn_zIHA(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.view.compose.BackHandlerKt.BackHandler(r14, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, r14, z ? 1 : 0);
            if (!requestPhysicalCardInfo.isPhysicalCardFee()) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            requestPhysicalCardDecisionViewModel3 = requestPhysicalCardDecisionViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel4 = requestPhysicalCardDecisionViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$F15eadWj0wy07BDkRHYeSMXGvxw(com.paypal.oslo.core.navigation.AppNavigator.this, requestPhysicalCardInfo, requestPhysicalCardDecisionViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel, final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2106285222);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(requestPhysicalCardInfo) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2106285222, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.HandleRequestPhysicalCardWithFeeFlow (RequestPhysicalCardRouter.kt:104)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(requestPhysicalCardDecisionViewModel.getUiState(), null, startRestartGroup, 0, 1);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel);
            boolean z = (i2 & 14) == 4;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$HandleRequestPhysicalCardWithFeeFlow$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z | changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$HandleRequestPhysicalCardWithFeeFlow$1$1(requestPhysicalCardDecisionViewModel, appNavigator, requestPhysicalCardInfo, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState) collectAsState.getValue()).getClass());
            boolean changed = startRestartGroup.changed(collectAsState);
            boolean z3 = i3 == 256;
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$HandleRequestPhysicalCardWithFeeFlow$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z3 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$HandleRequestPhysicalCardWithFeeFlow$2$1(requestPhysicalCardInfo, collectAsState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState requestPhysicalCardDecisionState = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState) collectAsState.getValue();
            if (requestPhysicalCardDecisionState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Loading) {
                startRestartGroup.startReplaceGroup(-1210423574);
                getHighSpeedVideoFpsRanges(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (requestPhysicalCardDecisionState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success) {
                startRestartGroup.startReplaceGroup(-1210421078);
                getHighResolutionOutputSizeshNQ4ISI(appNavigator, ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Success) requestPhysicalCardDecisionState).getDebitInstrumentResponse(), requestPhysicalCardInfo, requestPhysicalCardDecisionViewModel, startRestartGroup, (i2 & 910) | ((i2 << 6) & 7168));
                startRestartGroup.endReplaceGroup();
            } else if (requestPhysicalCardDecisionState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error) {
                startRestartGroup.startReplaceGroup(-1210413583);
                com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState.Error) requestPhysicalCardDecisionState;
                com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                int retryCount = error.getRetryCount();
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getUserIntent(requestPhysicalCardInfo.getProductName());
                boolean changedInstance2 = startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel);
                com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$HandleRequestPhysicalCardWithFeeFlow$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$HandleRequestPhysicalCardWithFeeFlow$3$1(requestPhysicalCardDecisionViewModel);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                composer2 = startRestartGroup;
                getHighSpeedVideoFpsRanges(errorType, retryCount, userIntent, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6);
                composer2.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.startReplaceGroup(-1210425760);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer2 = startRestartGroup;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$PbdeNC9GsRAu_I31B4l_0nX0Guw(com.paypal.oslo.core.navigation.AppNavigator.this, requestPhysicalCardDecisionViewModel, requestPhysicalCardInfo, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse, final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1433222547);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(debitInstrumentForRequestPhysicalCardResponse) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(requestPhysicalCardInfo) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1433222547, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardWithFeeFlow (RequestPhysicalCardRouter.kt:179)");
            }
            final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$1$1(appNavigator, requestPhysicalCardInfo, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$RequestPhysicalCardWithFeeFlow$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m14499invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14499invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardPricingInfo requestPhysicalCardPricingInfo = com.paypal.oslo.feature.debitcard.servicing.util.RequestPhysicalCardFlowExtensionsKt.toRequestPhysicalCardPricingInfo(debitInstrumentForRequestPhysicalCardResponse.getPricingDetails(), requestPhysicalCardInfo.getProductName(), requestPhysicalCardInfo.getAgreementUrl());
            boolean changedInstance = startRestartGroup.changedInstance(debitInstrumentForRequestPhysicalCardResponse);
            boolean z3 = i3 == 4;
            boolean z4 = i4 == 256;
            boolean changed = startRestartGroup.changed(rememberNavResultRequestId);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z4 | changedInstance | z3 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$HBFZWrJsFLiprMEKh66eK354F3w(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse.this, appNavigator, rememberNavResultRequestId, requestPhysicalCardInfo);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changedInstance2 = startRestartGroup.changedInstance(requestPhysicalCardDecisionViewModel);
            boolean z5 = i4 == 256;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | z5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$xBk1P79CJpOBqP6J46ULcsL8OCE(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel.this, requestPhysicalCardInfo);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            composer2 = startRestartGroup;
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.RequestPhysicalCardForFeeContentKt.RequestPhysicalCardForFeeContent(appNavigator, requestPhysicalCardPricingInfo, function0, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, i3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$mNYEQF_l8LyaPBVY5xXnwiQhwSc(com.paypal.oslo.core.navigation.AppNavigator.this, debitInstrumentForRequestPhysicalCardResponse, requestPhysicalCardInfo, requestPhysicalCardDecisionViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-26668911);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-26668911, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.LoadingContent (RequestPhysicalCardRouter.kt:238)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize24()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$nklO_oKv1Xdm4gX759CrbMLd1T0(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, final int i, final com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1011524447);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(debitErrorType.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? startRestartGroup.changed(userIntentContext) : startRestartGroup.changedInstance(userIntentContext) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1011524447, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.ErrorContent (RequestPhysicalCardRouter.kt:259)");
            }
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$Xxtuisk5DRHLQMVqm0ueNdX_9tA(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean z2 = i4 == 2048;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$ubxIQgqBGr66AspE1bZ4UzcJoEY(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue2, userIntentContext, null, true, java.lang.Integer.valueOf(i), null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i3 << 3) & 7168) | ((i3 << 15) & 3670016), 144);
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, debitErrorType.toString(), null, null, null, 14, null);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.m14496$r8$lambda$BfFbA5x3EUZfumrq2_n2FbokFY(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.this, i, userIntentContext, function1, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7863kiX0YMCrC_0BqDSkzzdDX0w(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent requestPhysicalCardDecisionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardDecisionEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BfFbA5x3EUZfum-rq2_n2FbokFY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14496$r8$lambda$BfFbA5x3EUZfumrq2_n2FbokFY(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, kotlin.jvm.functions.Function1 function1, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(debitErrorType, i, userIntentContext, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F15eadWj0wy07BDkRHYeSMXGvxw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RequestPhysicalCardRouter(appNavigator, requestPhysicalCardInfo, requestPhysicalCardDecisionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HBFZWrJsFLiprMEKh66eK354F3w(final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo) {
        if (!debitInstrumentForRequestPhysicalCardResponse.isFundingSourceRequired()) {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$jxKovY85XkGAmDq9CE7cPVQlNJE(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse.this, requestPhysicalCardInfo, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.shared.navigation.result.FundingSourceSelectorNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.m14498$r8$lambda$dMLE9PnrZ3B_5iCKOqb7STf5Es(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PbdeNC9GsRAu_I31B4l_0nX0Guw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(appNavigator, requestPhysicalCardDecisionViewModel, requestPhysicalCardInfo, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XL0DAfg3gMBY2Y4DHIXVfwI-Abs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14497$r8$lambda$XL0DAfg3gMBY2Y4DHIXVfwIAbs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1009415112);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1009415112, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardDecisionErrorPreview (RequestPhysicalCardRouter.kt:279)");
            }
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.RequestPhysicalCardForFeeAnalytics.INSTANCE.getUserIntent(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$7863kiX0YMCrC_0BqDSkzzdDX0w((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRanges(debitErrorType, 0, userIntent, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6) | 3126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.m14497$r8$lambda$XL0DAfg3gMBY2Y4DHIXVfwIAbs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Xxtuisk5DRHLQMVqm0ueNdX_9tA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.Retry.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZQwGS0kc10hdTB3XZseyZCK8HE8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1318813332);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1318813332, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardDecisionLoadingPreview (RequestPhysicalCardRouter.kt:273)");
            }
            getHighSpeedVideoFpsRanges(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.RequestPhysicalCardRouterKt.$r8$lambda$ZQwGS0kc10hdTB3XZseyZCK8HE8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dMLE9PnrZ-3B_5iCKOqb7STf5Es, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14498$r8$lambda$dMLE9PnrZ3B_5iCKOqb7STf5Es(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.debitcard.shared.di.FundingSourceSelectorDestination(com.paypal.oslo.feature.debitcard.shared.ui.components.fsselector.FundingSourceSelectorVariant.SET_FUNDING_SOURCE, requestPhysicalCardInfo.getProductName(), requestPhysicalCardInfo.getDebitInstrumentId(), null, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardEvaluateFundingOptionsEntryPoint.REQUEST_PHYSICAL_CARD));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jxKovY85XkGAmDq9CE7cPVQlNJE(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.RequestPhysicalCardDestination(com.paypal.oslo.feature.debitcard.servicing.util.RequestPhysicalCardFlowExtensionsKt.toRequestPhysicalCardInfo(debitInstrumentForRequestPhysicalCardResponse, requestPhysicalCardInfo.getProductName(), requestPhysicalCardInfo.getCardArtUrl())));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mNYEQF_l8LyaPBVY5xXnwiQhwSc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.model.DebitInstrumentForRequestPhysicalCardResponse debitInstrumentForRequestPhysicalCardResponse, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(appNavigator, debitInstrumentForRequestPhysicalCardResponse, requestPhysicalCardInfo, requestPhysicalCardDecisionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nklO_oKv1Xdm4gX759CrbMLd1T0(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nxgWJ5DaJetAm5qtMCRzAn_zIHA(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel) {
        requestPhysicalCardDecisionViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FlowCancelled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ubxIQgqBGr66AspE1bZ4UzcJoEY(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.FlowCancelled.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xBk1P79CJpOBqP6J46ULcsL8OCE(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.viewmodel.RequestPhysicalCardDecisionViewModel requestPhysicalCardDecisionViewModel, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo) {
        java.lang.String agreementUrl = requestPhysicalCardInfo.getAgreementUrl();
        if (agreementUrl == null) {
            agreementUrl = "";
        }
        requestPhysicalCardDecisionViewModel.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionEvent.AgreementLinkClicked(agreementUrl));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState access$HandleRequestPhysicalCardWithFeeFlow$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcarddecision.mvi.RequestPhysicalCardDecisionState) state.getValue();
    }
}
