package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {"LoadingAnimationDurationMs", "", "ProgressMaxValue", "", "NfcLoadingImageTestTag", "", "LoadingProgressBarTestTag", "InContextAcquisitionLoadingScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.datadog.trace.api.DDSpanTypes.CACHE, "Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;", "modifier", "Landroidx/compose/ui/Modifier;", "selectedFundingSourceId", "viewModel", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/viewmodel/DebitCardApplyAndCreateViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/domain/cache/DebitCardFundingOptionsCache;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/viewmodel/DebitCardApplyAndCreateViewModel;Landroidx/compose/runtime/Composer;II)V", "InContextAcquisitionLoadingScreenContent", "state", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InContextAcquisitionLoadingScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InContextAcquisitionLoadingScreenKt {
    public static final java.lang.String LoadingProgressBarTestTag = "loading_progress_bar";
    public static final java.lang.String NfcLoadingImageTestTag = "nfc_loading_image";

    /* JADX WARN: Removed duplicated region for block: B:151:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InContextAcquisitionLoadingScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel4;
        int i6;
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel5;
        androidx.compose.ui.Modifier modifier4;
        final java.lang.String str3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel6;
        java.lang.String str4;
        androidx.compose.ui.Modifier modifier5;
        int i7;
        boolean z;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingOptionsCache, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1135477922);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(debitCardFundingOptionsCache) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        debitCardApplyAndCreateViewModel2 = debitCardApplyAndCreateViewModel;
                        if (startRestartGroup.changedInstance(debitCardApplyAndCreateViewModel2)) {
                            i8 = 131072;
                            i3 |= i8;
                        }
                    } else {
                        debitCardApplyAndCreateViewModel2 = debitCardApplyAndCreateViewModel;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    debitCardApplyAndCreateViewModel2 = debitCardApplyAndCreateViewModel;
                }
                if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        i6 = i3;
                        modifier4 = modifier2;
                        debitCardApplyAndCreateViewModel5 = debitCardApplyAndCreateViewModel2;
                        i5 = 4;
                        str3 = str2;
                    } else {
                        androidx.compose.ui.Modifier modifier6 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.lang.String str5 = i4 != 0 ? null : str2;
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
                            i5 = 4;
                            debitCardApplyAndCreateViewModel4 = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            i3 &= -458753;
                        } else {
                            i5 = 4;
                            debitCardApplyAndCreateViewModel4 = debitCardApplyAndCreateViewModel2;
                        }
                        i6 = i3;
                        debitCardApplyAndCreateViewModel5 = debitCardApplyAndCreateViewModel4;
                        modifier4 = modifier6;
                        str3 = str5;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1135477922, i6, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreen (InContextAcquisitionLoadingScreen.kt:95)");
                    }
                    int i10 = i6;
                    final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel7 = debitCardApplyAndCreateViewModel5;
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(debitCardApplyAndCreateViewModel5.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    boolean changedInstance = startRestartGroup.changedInstance(debitCardFundingOptionsCache);
                    int i11 = i10 & 14;
                    boolean z2 = i11 == i5;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.m14232$r8$lambda$qfn_dvsT2CG9bjkraiybDY4V3w(com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache.this, appNavigator);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
                    boolean changedInstance2 = startRestartGroup.changedInstance(debitCardApplyAndCreateViewModel7);
                    int i12 = i10 & 112;
                    boolean z3 = i12 == 32;
                    int i13 = i10 & 57344;
                    boolean z4 = i13 == 16384;
                    com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changedInstance2 | z3 | z4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$2$1(debitCardApplyAndCreateViewModel7, debitCardProductName, str3, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(debitCardProductName, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i10 >> 3) & 14);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean changedInstance3 = startRestartGroup.changedInstance(debitCardApplyAndCreateViewModel7);
                    boolean changedInstance4 = startRestartGroup.changedInstance(debitCardFundingOptionsCache);
                    boolean z5 = i11 == 4;
                    com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((z5 | changedInstance3 | changedInstance4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$3$1(debitCardApplyAndCreateViewModel7, debitCardFundingOptionsCache, appNavigator, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                    com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState) collectAsStateWithLifecycle.getValue();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Initial.INSTANCE) || (debitCardApplyAndCreateUiState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning)) {
                        debitCardApplyAndCreateViewModel6 = debitCardApplyAndCreateViewModel7;
                        str4 = str3;
                        startRestartGroup.startReplaceGroup(-138054600);
                        modifier5 = modifier4;
                        InContextAcquisitionLoadingScreenContent((com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState) collectAsStateWithLifecycle.getValue(), modifier5, startRestartGroup, (i10 >> 6) & 112, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(debitCardApplyAndCreateUiState, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Success.INSTANCE)) {
                        startRestartGroup.startReplaceGroup(-137866275);
                        InContextAcquisitionLoadingScreenContent((com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState) collectAsStateWithLifecycle.getValue(), modifier4, startRestartGroup, (i10 >> 6) & 112, 0);
                        startRestartGroup.endReplaceGroup();
                        modifier5 = modifier4;
                        debitCardApplyAndCreateViewModel6 = debitCardApplyAndCreateViewModel7;
                        str4 = str3;
                    } else {
                        if (!(debitCardApplyAndCreateUiState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error)) {
                            startRestartGroup.startReplaceGroup(272639350);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(-137577727);
                        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState2 = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState) collectAsStateWithLifecycle.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(debitCardApplyAndCreateUiState2, "");
                        com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error error = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Error) debitCardApplyAndCreateUiState2;
                        com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                        if (errorType == null) {
                            errorType = com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE;
                        }
                        final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = errorType;
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                        int retryCount = error.getRetryCount();
                        androidx.compose.ui.Modifier modifier7 = modifier4;
                        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext = new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.INSTANCE.getProductName(debitCardProductName), com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAnalyticsConstants.ACQUISITION_FEATURE, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardApplyAndCreateAnalytics.ACTION);
                        boolean changedInstance5 = startRestartGroup.changedInstance(debitCardApplyAndCreateViewModel7);
                        if (i12 == 32) {
                            i7 = 16384;
                            z = true;
                        } else {
                            i7 = 16384;
                            z = false;
                        }
                        boolean z6 = i13 == i7;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((changedInstance5 | z | z6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.$r8$lambda$0x5oNr8DFlDKogezg5dGNtlHFlw(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel.this, debitCardProductName, str3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                        boolean changedInstance6 = startRestartGroup.changedInstance(debitCardFundingOptionsCache);
                        boolean z7 = i11 == 4;
                        boolean changed = startRestartGroup.changed(debitErrorType.ordinal());
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if ((changedInstance6 | z7 | changed) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.$r8$lambda$CRRrMDoCOUhbGc2i_MPYUqj8fgM(com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache.this, appNavigator, debitErrorType);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        debitCardApplyAndCreateViewModel6 = debitCardApplyAndCreateViewModel7;
                        str4 = str3;
                        com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(debitErrorType, function0, (kotlin.jvm.functions.Function0) rememberedValue5, userIntentContext, fillMaxSize$default, false, java.lang.Integer.valueOf(retryCount), null, startRestartGroup, com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9, 160);
                        startRestartGroup.endReplaceGroup();
                        modifier5 = modifier7;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    debitCardApplyAndCreateViewModel3 = debitCardApplyAndCreateViewModel6;
                    modifier3 = modifier5;
                    str2 = str4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    debitCardApplyAndCreateViewModel3 = debitCardApplyAndCreateViewModel2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.lang.String str6 = str2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.$r8$lambda$_LbP3XkwzaxiElVasLWh4C576sY(com.paypal.oslo.core.navigation.AppNavigator.this, debitCardProductName, debitCardFundingOptionsCache, modifier3, str6, debitCardApplyAndCreateViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str2 = str;
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void InContextAcquisitionLoadingScreenContent(final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardApplyAndCreateUiState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(286985244);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitCardApplyAndCreateUiState) ? 4 : 2) | i;
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
                androidx.compose.runtime.ComposerKt.traceEventStart(286985244, i3, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenContent (InContextAcquisitionLoadingScreen.kt:192)");
            }
            com.paypal.pds.core.ThemeKt.Theme(true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1593721729, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.$r8$lambda$V3PqczkIcJDNjZDgu8S1oPkhh88(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.this, modifier, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.$r8$lambda$nMMU7JwZupiD1kgBXtb71UlWEnU(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0x5oNr8DFlDKogezg5dGNtlHFlw(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        debitCardApplyAndCreateViewModel.provisionCard(debitCardProductName, false, str, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.DIGITIZATION_TOKEN_PAYPAL);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8Dvtgy_jMUEzToSaogq3RLBrVSA(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult(new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure(new com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error(com.paypal.oslo.feature.debitcard.cardacquisition.ui.mapper.DebitErrorTypeToErrorReasonMapperKt.toErrorReason(debitErrorType)))));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CRRrMDoCOUhbGc2i_MPYUqj8fgM(com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType) {
        debitCardFundingOptionsCache.invalidateAll();
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.$r8$lambda$8Dvtgy_jMUEzToSaogq3RLBrVSA(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EkIQWbdzxt6kB5Ndj_Jb28t9lis(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$V3PqczkIcJDNjZDgu8S1oPkhh88(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1593721729, i, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenContent.<anonymous> (InContextAcquisitionLoadingScreen.kt:195)");
            }
            boolean z = debitCardApplyAndCreateUiState instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableFloatState mutableFloatState = (androidx.compose.runtime.MutableFloatState) rememberedValue;
            com.paypal.oslo.feature.debitcard.shared.ui.util.ProgressBarUtilKt.AnimateProgressValue(z, mutableFloatState, 0.25f, composer, 432, 0);
            androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.debitcard.R.drawable.feature_debit_card_nfc_loading, composer, 0), (java.lang.String) null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), NfcLoadingImageTestTag), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, composer, androidx.compose.ui.graphics.painter.Painter.$stable | 25008, 104);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getBottomCenter())), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_in_context_acquisition_loading_title, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.DisplayMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            com.paypal.pds.components.ProgressBarKt.ProgressBar(1.0f, mutableFloatState.getFloatValue(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), LoadingProgressBarTestTag), com.paypal.pds.components.ProgressBarStyle.Neutral.INSTANCE, 0, 0, 5000L, null, composer, 1576326, 176);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_in_context_acquisition_loading_subtitle, composer, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 48, 6, 1004);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_LbP3XkwzaxiElVasLWh4C576sY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InContextAcquisitionLoadingScreen(appNavigator, debitCardProductName, debitCardFundingOptionsCache, modifier, str, debitCardApplyAndCreateViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jHCRgrD28OWejuVMuLXJ0WKLZR8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1580245582);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1580245582, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenPreview (InContextAcquisitionLoadingScreen.kt:254)");
            }
            InContextAcquisitionLoadingScreenContent(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState.Provisioning(0, 1, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.$r8$lambda$jHCRgrD28OWejuVMuLXJ0WKLZR8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nMMU7JwZupiD1kgBXtb71UlWEnU(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiState debitCardApplyAndCreateUiState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InContextAcquisitionLoadingScreenContent(debitCardApplyAndCreateUiState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qfn-_dvsT2CG9bjkraiybDY4V3w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14232$r8$lambda$qfn_dvsT2CG9bjkraiybDY4V3w(com.paypal.oslo.feature.debitcard.shared.domain.cache.DebitCardFundingOptionsCache debitCardFundingOptionsCache, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        debitCardFundingOptionsCache.invalidateAll();
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt.$r8$lambda$EkIQWbdzxt6kB5Ndj_Jb28t9lis((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
