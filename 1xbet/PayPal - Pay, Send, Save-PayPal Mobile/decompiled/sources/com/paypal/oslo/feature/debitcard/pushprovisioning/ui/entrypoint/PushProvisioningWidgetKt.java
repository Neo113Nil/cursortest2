package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint;

@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0001¢\u0006\u0002\u0010\u0012\u001aQ\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001a\u001aC\u0010\u001b\u001a\u00020\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001e\u001a;\u0010\u001f\u001a\u00020\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010 \u001a,\u0010!\u001a\u00020\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0002\u001a$\u0010$\u001a\u00020\u00012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\u001a\u0018\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010'\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010)H\u0000¨\u0006*²\u0006\n\u0010\u0014\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"PushProvisioningWidget", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "config", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/model/PushProvisioningWidgetConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/PushProvisioningWidgetViewModel;", "onProvisionStatusListener", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetState;", "onPushProvisioningResult", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/model/PushProvisioningResult;", "onProvisioningWidgetClick", "Lkotlin/Function0;", "onErrorDismissListener", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/model/PushProvisioningWidgetConfig;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/PushProvisioningWidgetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PushProvisioningWidgetContent", "uiState", "Lcom/paypal/oslo/core/mvi/UiState;", "onEvent", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/entrypoint/mvi/PushProvisioningWidgetEvent;", "starPayClient", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "(Lcom/paypal/oslo/core/mvi/UiState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/model/PushProvisioningWidgetConfig;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddToWalletButton", "debitInstrument", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/model/PushProvisioningWidgetConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ErrorContent", "(Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/starpay/api/StarPayClient;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/ui/model/PushProvisioningWidgetConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "retryTokenEligibilityCheck", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "navigateToPushProvisionSetup", "trackPushProvisioningState", "widgetState", "trackPushProvisioningPrimaryWidgetStatus", "widgetStatus", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/PushProvisioningWidgetStatus;", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PushProvisioningWidgetKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PushProvisioningWidget(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel pushProvisioningWidgetViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel pushProvisioningWidgetViewModel2;
        int i4;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult, kotlin.Unit> function13;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel pushProvisioningWidgetViewModel3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState, kotlin.Unit> function15;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState, kotlin.Unit> function16;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult, kotlin.Unit> function17;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState, kotlin.Unit> function18;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult, kotlin.Unit> function19;
        final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel pushProvisioningWidgetViewModel4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        java.lang.Object obj;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(813321829);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(pushProvisioningWidgetConfig) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    pushProvisioningWidgetViewModel2 = pushProvisioningWidgetViewModel;
                    if (startRestartGroup.changedInstance(pushProvisioningWidgetViewModel2)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    pushProvisioningWidgetViewModel2 = pushProvisioningWidgetViewModel;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                pushProvisioningWidgetViewModel2 = pushProvisioningWidgetViewModel;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                function13 = function12;
                i3 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    function03 = function0;
                } else {
                    function03 = function0;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    function04 = function02;
                } else {
                    function04 = function02;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function04) ? 8388608 : 4194304;
                    }
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        function010 = function04;
                        modifier4 = modifier2;
                        pushProvisioningWidgetViewModel4 = pushProvisioningWidgetViewModel2;
                        function19 = function13;
                        function09 = function03;
                        function18 = function1;
                    } else {
                        modifier4 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
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
                            pushProvisioningWidgetViewModel2 = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$SomjzZX8x4qoTxzVMbrWoXQ4GT8((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function16 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function16 = function1;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$zMESSR3GR7Us7KmLtH_9C0Oyf14((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function17 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        } else {
                            function17 = function12;
                        }
                        if (i6 != 0) {
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda3
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
                        } else {
                            function07 = function03;
                        }
                        if (i7 != 0) {
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            function08 = (kotlin.jvm.functions.Function0) rememberedValue4;
                        } else {
                            function08 = function02;
                        }
                        function18 = function16;
                        function19 = function17;
                        pushProvisioningWidgetViewModel4 = pushProvisioningWidgetViewModel2;
                        function09 = function07;
                        function010 = function08;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(813321829, i3, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidget (PushProvisioningWidget.kt:110)");
                    }
                    com.paypal.oslo.feature.starpay.api.StarPayClient rememberStarPayClient = com.paypal.oslo.feature.starpay.api.StarPayClientProviderKt.rememberStarPayClient(startRestartGroup, 0);
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(pushProvisioningWidgetViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                    boolean changedInstance = startRestartGroup.changedInstance(pushProvisioningWidgetViewModel4);
                    boolean changedInstance2 = startRestartGroup.changedInstance(rememberStarPayClient);
                    int i10 = i3 & 112;
                    boolean z = i10 == 32;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((z | changedInstance | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$5$1(pushProvisioningWidgetViewModel4, rememberStarPayClient, pushProvisioningWidgetConfig, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(rememberStarPayClient, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                    com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState pushProvisioningWidgetState = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState) collectAsStateWithLifecycle.getValue();
                    boolean z2 = (i3 & 57344) == 16384;
                    boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((z2 | changed) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$6$1(function18, collectAsStateWithLifecycle, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(pushProvisioningWidgetState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 0);
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState) collectAsStateWithLifecycle.getValue()).getClass());
                    boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                    boolean z3 = i10 == 32;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if ((z3 | changed2) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$7$1(pushProvisioningWidgetConfig, collectAsStateWithLifecycle, null);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, startRestartGroup, 0);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean changedInstance3 = startRestartGroup.changedInstance(pushProvisioningWidgetViewModel4);
                    boolean z4 = (i3 & 14) == 4;
                    boolean changed3 = startRestartGroup.changed(rememberNavResultRequestId);
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if ((changedInstance3 | z4 | changed3) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$8$1(pushProvisioningWidgetViewModel4, appNavigator, rememberNavResultRequestId, null);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue8, startRestartGroup, 6);
                    boolean z5 = (i3 & 458752) == 131072;
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (z5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        navResultManager = null;
                        obj = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$9$1(function19, null);
                        startRestartGroup.updateRememberedValue(obj);
                    } else {
                        obj = rememberedValue9;
                        navResultManager = null;
                    }
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) obj;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                    java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$$inlined$NavResultEffect-rtGRyWw$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                return m14265invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                            }

                            /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                            public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14265invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                                return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue10, startRestartGroup, 3072);
                    boolean z6 = (3670016 & i3) == 1048576;
                    boolean changedInstance4 = startRestartGroup.changedInstance(pushProvisioningWidgetViewModel4);
                    java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                    if ((z6 | changedInstance4) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.m14263$r8$lambda$rYWqs2mdi3HfrRyrMon6enzCXE(kotlin.jvm.functions.Function0.this, pushProvisioningWidgetViewModel4, (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                    }
                    kotlin.jvm.functions.Function0<kotlin.Unit> function011 = function09;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult, kotlin.Unit> function110 = function19;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState, kotlin.Unit> function111 = function18;
                    getHighSpeedVideoSizes((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState) collectAsStateWithLifecycle.getValue(), (kotlin.jvm.functions.Function1) rememberedValue11, rememberStarPayClient, pushProvisioningWidgetConfig, function010, modifier4, startRestartGroup, (458752 & (i3 << 9)) | ((i3 << 6) & 7168) | ((i3 >> 9) & 57344), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function15 = function111;
                    function06 = function011;
                    pushProvisioningWidgetViewModel3 = pushProvisioningWidgetViewModel4;
                    function05 = function010;
                    function14 = function110;
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function14 = function12;
                    function05 = function02;
                    modifier3 = modifier2;
                    pushProvisioningWidgetViewModel3 = pushProvisioningWidgetViewModel2;
                    function06 = function03;
                    function15 = function1;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.m14260$r8$lambda$g0u3dNkxaHK9RX9gUaxCWHKxaA(com.paypal.oslo.core.navigation.AppNavigator.this, pushProvisioningWidgetConfig, modifier3, pushProvisioningWidgetViewModel3, function15, function14, function06, function05, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function13 = function12;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function13 = function12;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0171, code lost:
    
        if (r0 == null) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.core.mvi.UiState uiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.Modifier modifier5;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-761020322);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(starPayClient) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(pushProvisioningWidgetConfig) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier6 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-761020322, i3, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetContent (PushProvisioningWidget.kt:178)");
                }
                if ((uiState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Initial) || (uiState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Loading)) {
                    androidx.compose.ui.Modifier modifier7 = modifier6;
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(1576343156);
                    modifier4 = modifier7;
                    com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize48()), (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, true, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.ComposableSingletons$PushProvisioningWidgetKt.INSTANCE.getLambda$1811796435$debit_card_prodRelease(), composer2, 3504, 0);
                    composer2.endReplaceGroup();
                } else {
                    if (uiState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Success) {
                        startRestartGroup.startReplaceGroup(1576666424);
                        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Success success = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Success) uiState;
                        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData data = success.getData();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(data != null ? data.getPrimaryWidgetStatus() : null, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.AddToWallet.INSTANCE)) {
                            startRestartGroup.startReplaceGroup(1576782333);
                            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument = success.getData().getDebitInstrument();
                            int i5 = i3 >> 3;
                            modifier5 = modifier6;
                            getHighSpeedVideoSizes(function1, starPayClient, debitInstrument, pushProvisioningWidgetConfig, modifier6, startRestartGroup, (i3 & 7168) | (i5 & 126) | (i5 & 57344), 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            modifier5 = modifier6;
                            startRestartGroup.startReplaceGroup(1577111894);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                    } else {
                        modifier5 = modifier6;
                        if (uiState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Error) {
                            startRestartGroup.startReplaceGroup(1577302513);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(pushProvisioningWidgetConfig.getStyle(), com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetStyle.Condensed.INSTANCE)) {
                                startRestartGroup.startReplaceGroup(1577339806);
                                Camera2StreamConfigurationMap(function1, starPayClient, pushProvisioningWidgetConfig, modifier5, startRestartGroup, ((i3 >> 3) & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i3 >> 6) & 7168), 0);
                                startRestartGroup.endReplaceGroup();
                                composer2 = startRestartGroup;
                            } else if (pushProvisioningWidgetConfig.getShouldShowErrorScreen()) {
                                startRestartGroup.startReplaceGroup(1577631826);
                                androidx.compose.ui.unit.Dp m14270getErrorScreenHeightlTKBWiU = pushProvisioningWidgetConfig.m14270getErrorScreenHeightlTKBWiU();
                                if (m14270getErrorScreenHeightlTKBWiU != null) {
                                    companion = androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, m14270getErrorScreenHeightlTKBWiU.m8615unboximpl());
                                }
                                companion = androidx.compose.ui.Modifier.INSTANCE;
                                com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Error error = (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Error) uiState;
                                com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                                int retryCount = error.getRetryCount();
                                androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(modifier5), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null).then(companion);
                                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getUserIntent(pushProvisioningWidgetConfig.getProductName());
                                boolean z = (i3 & 112) == 32;
                                boolean changedInstance = startRestartGroup.changedInstance(starPayClient);
                                boolean z2 = (i3 & 7168) == 2048;
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if ((z | changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$2vYgxRQBp2vBUwFD5eGqrEywGiQ(kotlin.jvm.functions.Function1.this, starPayClient, pushProvisioningWidgetConfig);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                                boolean z3 = (i3 & 57344) == 16384;
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.m14261$r8$lambda$jKx95kZJLykUkAKiCHZNKbAqSc(kotlin.jvm.functions.Function0.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                composer2 = startRestartGroup;
                                com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(errorType, function02, (kotlin.jvm.functions.Function0) rememberedValue2, userIntent, then, false, java.lang.Integer.valueOf(retryCount), null, composer2, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 128);
                                composer2.endReplaceGroup();
                            } else {
                                composer2 = startRestartGroup;
                                composer2.startReplaceGroup(1578602436);
                                composer2.endReplaceGroup();
                            }
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = startRestartGroup;
                            composer2.startReplaceGroup(1578631731);
                            composer2.endReplaceGroup();
                        }
                    }
                    modifier4 = modifier5;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$zeBE2zgwVH3Ctm_kvpLx2k21SV4(com.paypal.oslo.core.mvi.UiState.this, function1, starPayClient, pushProvisioningWidgetConfig, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(743430371);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(starPayClient) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(debitInstrument) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(pushProvisioningWidgetConfig) ? 2048 : 1024;
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
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(743430371, i4, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.AddToWalletButton (PushProvisioningWidget.kt:256)");
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(pushProvisioningWidgetConfig.getStyle(), com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetStyle.Primary.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-1611855210);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                    boolean z = (i4 & 7168) == 2048;
                    boolean z2 = (i4 & 14) == 4;
                    boolean changedInstance = startRestartGroup.changedInstance(debitInstrument);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z | z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.m14262$r8$lambda$rAKAJKGkP4brIe0LUKuDXikz1A(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig.this, function1, debitInstrument);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    starPayClient.getAddToWalletButton((kotlin.jvm.functions.Function0) rememberedValue).invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                } else {
                    startRestartGroup.startReplaceGroup(-1611105351);
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$fVIQqJCeiW4KQcYR0_8HFYOFQhc((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(fillMaxWidth$default2, true, (kotlin.jvm.functions.Function1) rememberedValue2);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    modifier3 = modifier4;
                    com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Mobile.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27702, 4);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_add_to_wallet, new java.lang.Object[]{com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_WALLET}, startRestartGroup, 0), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 2, null), 1.0f, false, 2, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getUserIntent(pushProvisioningWidgetConfig.getProductName()), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext(new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Screen(pushProvisioningWidgetConfig.getScreenId()), null, com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getCOMPONENT_SUCCESS(), com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getADD_TO_WALLET_BUTTON(), 2, null)})), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    boolean z3 = (i4 & 14) == 4;
                    boolean changedInstance2 = startRestartGroup.changedInstance(debitInstrument);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changedInstance2 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$DSvlPjNn2nmvz5RTkZpx3TmHbYo(kotlin.jvm.functions.Function1.this, debitInstrument);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    starPayClient.getAddToWalletButtonCondensed((kotlin.jvm.functions.Function0) rememberedValue3).invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$CxwTsUuAnC1XAeNGdFl3RBomW2U(kotlin.jvm.functions.Function1.this, starPayClient, debitInstrument, pushProvisioningWidgetConfig, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-904352540);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(starPayClient) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(pushProvisioningWidgetConfig) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-904352540, i4, -1, "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.ErrorContent (PushProvisioningWidget.kt:333)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$Hro4prR21bCCaJvv9znJ26SlFWY((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(fillMaxWidth$default, true, (kotlin.jvm.functions.Function1) rememberedValue);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
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
                modifier3 = modifier4;
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Mobile.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27702, 4);
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 0.0f, 14, null), 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_operation_add_to_wallet, new java.lang.Object[]{com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_WALLET}, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_common_details_not_available, startRestartGroup, 0), null, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 2);
                startRestartGroup.endNode();
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_error_try_again, startRestartGroup, 0);
                com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Small small = com.paypal.pds.components.ButtonSize.Small.INSTANCE;
                androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics.INSTANCE.getERROR_MODULE()), com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics.INSTANCE.getERROR_SCREEN()), com.paypal.oslo.feature.debitcard.shared.analytics.DebitErrorScreenAnalytics.INSTANCE.getTRY_AGAIN_BUTTON()), kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getUserIntent(pushProvisioningWidgetConfig.getProductName())));
                boolean z = (i4 & 14) == 4;
                boolean changedInstance = startRestartGroup.changedInstance(starPayClient);
                boolean z2 = (i4 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z2 | changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.$r8$lambda$YuTYRQRWpyTxsz4YhIqRVOIljFs(kotlin.jvm.functions.Function1.this, starPayClient, pushProvisioningWidgetConfig);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, stringResource, context, null, null, secondary, small, false, false, startRestartGroup, 1769472, 408);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt.m14264$r8$lambda$y22hGQIz6qtqS1gDIVw0jqhy4(kotlin.jvm.functions.Function1.this, starPayClient, pushProvisioningWidgetConfig, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void trackPushProvisioningState(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState pushProvisioningWidgetState, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component_success;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetConfig, "");
        if (pushProvisioningWidgetState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Loading) {
            component_success = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getCOMPONENT_LOADING();
        } else {
            if (!(pushProvisioningWidgetState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Error)) {
                component = null;
                if (pushProvisioningWidgetState instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Success) {
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityUiData data = ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState.Success) pushProvisioningWidgetState).getData();
                    trackPushProvisioningPrimaryWidgetStatus(pushProvisioningWidgetConfig, data != null ? data.getPrimaryWidgetStatus() : null);
                    component_success = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getCOMPONENT_SUCCESS();
                }
                if (component == null) {
                    com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardComponent$default(pushProvisioningWidgetConfig.getScreenId(), component, com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getUserIntent(pushProvisioningWidgetConfig.getProductName()), null, 8, null);
                    return;
                }
                return;
            }
            component_success = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getCOMPONENT_ERROR();
        }
        component = component_success;
        if (component == null) {
        }
    }

    public static final void trackPushProvisioningPrimaryWidgetStatus(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus pushProvisioningWidgetStatus) {
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component_manage_wallet;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetConfig, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(pushProvisioningWidgetStatus, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.AddToWallet.INSTANCE)) {
            component_manage_wallet = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getCOMPONENT_ELIGIBLE();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(pushProvisioningWidgetStatus, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.Ineligible.INSTANCE)) {
            component_manage_wallet = com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getCOMPONENT_INELIGIBLE();
        } else {
            component_manage_wallet = kotlin.jvm.internal.Intrinsics.areEqual(pushProvisioningWidgetStatus, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.PushProvisioningWidgetStatus.ManageWallet.INSTANCE) ? com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getCOMPONENT_MANAGE_WALLET() : null;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component component = component_manage_wallet;
        if (component != null) {
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardComponent$default(pushProvisioningWidgetConfig.getScreenId(), component, com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getUserIntent(pushProvisioningWidgetConfig.getProductName()), null, 8, null);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2vYgxRQBp2vBUwFD5eGqrEywGiQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig) {
        function1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested(starPayClient, pushProvisioningWidgetConfig.getProductName()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CxwTsUuAnC1XAeNGdFl3RBomW2U(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(function1, starPayClient, debitInstrument, pushProvisioningWidgetConfig, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DSvlPjNn2nmvz5RTkZpx3TmHbYo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        function1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked(debitInstrument));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Hro4prR21bCCaJvv9znJ26SlFWY(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SomjzZX8x4qoTxzVMbrWoXQ4GT8(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState pushProvisioningWidgetState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetState, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YuTYRQRWpyTxsz4YhIqRVOIljFs(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig) {
        function1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.RetryTokenEligibilityCheckRequested(starPayClient, pushProvisioningWidgetConfig.getProductName()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fVIQqJCeiW4KQcYR0_8HFYOFQhc(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g0u3dNkxaHK9RX9gUaxCWHKxa-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14260$r8$lambda$g0u3dNkxaHK9RX9gUaxCWHKxaA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel pushProvisioningWidgetViewModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PushProvisioningWidget(appNavigator, pushProvisioningWidgetConfig, modifier, pushProvisioningWidgetViewModel, function1, function12, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jKx95kZJLykU-kAKiCHZNKbAqSc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14261$r8$lambda$jKx95kZJLykUkAKiCHZNKbAqSc(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rAKAJKGkP4brIe0LUKuDXikz-1A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14262$r8$lambda$rAKAJKGkP4brIe0LUKuDXikz1A(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument) {
        com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardItemPressed$default(pushProvisioningWidgetConfig.getScreenId(), com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getADD_TO_WALLET_BUTTON(), com.paypal.oslo.feature.debitcard.shared.analytics.PushProvisioningWidgetAnalytics.INSTANCE.getUserIntent(pushProvisioningWidgetConfig.getProductName()), null, 8, null);
        function1.invoke(new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked(debitInstrument));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rYWqs2mdi3HfrRyrMon6e-nzCXE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14263$r8$lambda$rYWqs2mdi3HfrRyrMon6enzCXE(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel pushProvisioningWidgetViewModel, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent pushProvisioningWidgetEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningWidgetEvent, "");
        if (pushProvisioningWidgetEvent instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetEvent.AddToWalletButtonClicked) {
            function0.invoke();
        }
        pushProvisioningWidgetViewModel.processEvent(pushProvisioningWidgetEvent);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$y22-hGQIz6-qtqS1gDIVw0jqhy4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14264$r8$lambda$y22hGQIz6qtqS1gDIVw0jqhy4(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(function1, starPayClient, pushProvisioningWidgetConfig, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zMESSR3GR7Us7KmLtH_9C0Oyf14(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult pushProvisioningResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushProvisioningResult, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zeBE2zgwVH3Ctm_kvpLx2k21SV4(com.paypal.oslo.core.mvi.UiState uiState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningWidgetConfig pushProvisioningWidgetConfig, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(uiState, function1, starPayClient, pushProvisioningWidgetConfig, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState access$PushProvisioningWidget$lambda$4(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetState) state.getValue();
    }
}
