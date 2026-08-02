package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001aE\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u0010\u001a\u008f\u0001\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\f2.\u0010\u0018\u001a*\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001c\u0012\u0004\u0012\u00020\u00010\u00192\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0004\b \u0010!\u001a\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0000\u001a)\u0010&\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010)\u001a)\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010-\u001a\r\u0010.\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010/¨\u00060²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\f\u00102\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002"}, d2 = {com.paypal.oslo.feature.bnplservicing.logger.BnplServLoggerConstants.Screens.MAKE_A_PAYMENT_SCREEN, "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentViewModel;Landroidx/compose/runtime/Composer;II)V", "EffectHandler", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;", "onShowPaymentError", "Lkotlin/Function0;", "onOpenPaymentAuthorization", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/bnplservicing/ui/document/DocumentsHalfSheetModel;", "(Lkotlinx/coroutines/flow/Flow;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MakeAPaymentChangeFiHalfSheetSetUp", "uiState", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiState;", "addCardRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "addBankRequestId", "onNewlyAddedFiConsume", "onDismiss", "Lkotlin/Function4;", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "", "onOpenAgreementLink", "changeFiViewModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiViewModel;", "MakeAPaymentChangeFiHalfSheetSetUp-m7m1syQ", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiState;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/ChangeFiViewModel;Landroidx/compose/runtime/Composer;II)V", "mapAddFiTypeToSupportedType", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/SupportedFundingInstrumentTypeForAddition;", "addFiType", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/AddFundingInstrumentType;", "ScreenContent", "onEvent", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SuccessContent", "uiModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MakePaymentPreview", "(Landroidx/compose/runtime/Composer;I)V", "bnpl-servicing_prodRelease", "showPaymentErrorSheet", "singleDocumentModel"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MakeAPaymentScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MakeAPaymentScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel2;
        final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel4;
        java.lang.Object rememberedValue;
        final androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue2;
        boolean changedInstance;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$1$1 rememberedValue3;
        boolean changedInstance2;
        java.lang.Object rememberedValue4;
        boolean changedInstance3;
        java.lang.Object rememberedValue5;
        boolean changedInstance4;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$4$1 rememberedValue6;
        java.lang.Object rememberedValue7;
        java.lang.Object rememberedValue8;
        boolean changedInstance5;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$7$1 rememberedValue9;
        boolean changedInstance6;
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$8$1 rememberedValue10;
        java.lang.Object rememberedValue11;
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-323932374);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                makeAPaymentViewModel2 = makeAPaymentViewModel;
                if (startRestartGroup.changedInstance(makeAPaymentViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                makeAPaymentViewModel2 = makeAPaymentViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            makeAPaymentViewModel2 = makeAPaymentViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
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
                i4 = i6 & (-113);
                makeAPaymentViewModel4 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-323932374, i4, -1, "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreen (MakeAPaymentScreen.kt:94)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(makeAPaymentViewModel4.getUiState$bnpl_servicing_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.String addCardNavResultRequestId = makeAPaymentViewModel4.getAddCardNavResultRequestId();
                java.lang.String addBankNavResultRequestId = makeAPaymentViewModel4.getAddBankNavResultRequestId();
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(makeAPaymentViewModel4);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$1$1(makeAPaymentViewModel4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                changedInstance2 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$TcT0VgDRwcXqIkLCQAJi6Ehi3lI(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt.m12540AddCardFlowResultHandlerrtGRyWw(addCardNavResultRequestId, (kotlin.jvm.functions.Function1) rememberedValue4, null, startRestartGroup, 0, 4);
                changedInstance3 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$tSJd1KWzz4gnxC_aPH7ikbrhU5Y(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.this, (java.util.List) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt.m12539AddBankFlowResultHandlerrtGRyWw(addBankNavResultRequestId, (kotlin.jvm.functions.Function1) rememberedValue5, null, startRestartGroup, 0, 4);
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState makeAPaymentUiState = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState) collectAsStateWithLifecycle.getValue();
                changedInstance4 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$4$1(makeAPaymentViewModel4);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                getHighSpeedVideoSizes(makeAPaymentUiState, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit>) ((kotlin.reflect.KFunction) rememberedValue6), startRestartGroup, 0);
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> uiEffect$bnpl_servicing_prodRelease = makeAPaymentViewModel4.getUiEffect$bnpl_servicing_prodRelease();
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$cQ02ysX4Wz4sfHsw130su80CZAU(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue7;
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$A75iwPXsfQ7WsSlVueOmanM5AVE(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                int i7 = (i4 << 3) & 112;
                getHighSpeedVideoFpsRangesFor(uiEffect$bnpl_servicing_prodRelease, appNavigator, function0, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, i7 | 3456);
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState makeAPaymentUiState2 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState) collectAsStateWithLifecycle.getValue();
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils makeAPaymentUtils = com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils.INSTANCE;
                changedInstance5 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$7$1(makeAPaymentViewModel4);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                kotlin.jvm.functions.Function0<kotlin.Unit> createOnNewlyAddedFiConsumeCallback = makeAPaymentUtils.createOnNewlyAddedFiConsumeCallback((kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue9));
                com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils makeAPaymentUtils2 = com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils.INSTANCE;
                changedInstance6 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changedInstance6 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$8$1(makeAPaymentViewModel4);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                kotlin.jvm.functions.Function4<java.lang.Boolean, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, java.lang.Boolean, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> createOnDismissCallback = makeAPaymentUtils2.createOnDismissCallback((kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue10));
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.m12589$r8$lambda$Eirie24KZE_B1H7KD3KBWDFpJo(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                makeAPaymentViewModel3 = makeAPaymentViewModel4;
                m12595MakeAPaymentChangeFiHalfSheetSetUpm7m1syQ(makeAPaymentUiState2, appNavigator, addCardNavResultRequestId, addBankNavResultRequestId, createOnNewlyAddedFiConsumeCallback, createOnDismissCallback, (kotlin.jvm.functions.Function1) rememberedValue11, null, startRestartGroup, i7 | 1572864, 128);
                if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(524297234);
                    java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                    if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = new com.paypal.pds.components.BottomSheetController();
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue12;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentTestTags.PROCESS_PAYMENT_ERROR_SHEET);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    boolean changedInstance7 = startRestartGroup.changedInstance(makeAPaymentViewModel3);
                    java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                    if (changedInstance7 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$L_s7tEm3Fld4Of_iG7CNt8OJmYQ(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.this, mutableState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue13;
                    java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                    if (rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$GDWrOqgIMxemTu42C1siG9_GEWY(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.makepayment.ProcessPaymentErrorSheetKt.ProcessPaymentErrorSheet(bottomSheetController, function02, (kotlin.jvm.functions.Function0) rememberedValue14, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 384);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(524795032);
                    startRestartGroup.endReplaceGroup();
                }
                documentsHalfSheetModel = (com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel) mutableState2.getValue();
                if (documentsHalfSheetModel != null) {
                    startRestartGroup.startReplaceGroup(524826372);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(524826373);
                    java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                    if (rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$NxhaYx8LvSLcxM_iepzfav4oMzU(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue15);
                    }
                    com.paypal.oslo.feature.bnplservicing.ui.document.SingleDocumentDownloaderKt.SingleDocumentDownloader(documentsHalfSheetModel, (kotlin.jvm.functions.Function0) rememberedValue15, null, startRestartGroup, 48, 4);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = i6;
            makeAPaymentViewModel4 = makeAPaymentViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(makeAPaymentViewModel4.getUiState$bnpl_servicing_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.String addCardNavResultRequestId2 = makeAPaymentViewModel4.getAddCardNavResultRequestId();
            java.lang.String addBankNavResultRequestId2 = makeAPaymentViewModel4.getAddBankNavResultRequestId();
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final androidx.compose.runtime.MutableState mutableState22 = (androidx.compose.runtime.MutableState) rememberedValue2;
            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(makeAPaymentViewModel4);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue3 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$1$1(makeAPaymentViewModel4, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            changedInstance2 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$TcT0VgDRwcXqIkLCQAJi6Ehi3lI(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.this, (java.lang.String) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt.m12540AddCardFlowResultHandlerrtGRyWw(addCardNavResultRequestId2, (kotlin.jvm.functions.Function1) rememberedValue4, null, startRestartGroup, 0, 4);
            changedInstance3 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$tSJd1KWzz4gnxC_aPH7ikbrhU5Y(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.this, (java.util.List) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt.m12539AddBankFlowResultHandlerrtGRyWw(addBankNavResultRequestId2, (kotlin.jvm.functions.Function1) rememberedValue5, null, startRestartGroup, 0, 4);
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState makeAPaymentUiState3 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState) collectAsStateWithLifecycle2.getValue();
            changedInstance4 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue6 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$4$1(makeAPaymentViewModel4);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            getHighSpeedVideoSizes(makeAPaymentUiState3, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit>) ((kotlin.reflect.KFunction) rememberedValue6), startRestartGroup, 0);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> uiEffect$bnpl_servicing_prodRelease2 = makeAPaymentViewModel4.getUiEffect$bnpl_servicing_prodRelease();
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue7;
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            int i72 = (i4 << 3) & 112;
            getHighSpeedVideoFpsRangesFor(uiEffect$bnpl_servicing_prodRelease2, appNavigator, function03, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, i72 | 3456);
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState makeAPaymentUiState22 = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState) collectAsStateWithLifecycle2.getValue();
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils makeAPaymentUtils3 = com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils.INSTANCE;
            changedInstance5 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue9 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$7$1(makeAPaymentViewModel4);
            startRestartGroup.updateRememberedValue(rememberedValue9);
            kotlin.jvm.functions.Function0<kotlin.Unit> createOnNewlyAddedFiConsumeCallback2 = makeAPaymentUtils3.createOnNewlyAddedFiConsumeCallback((kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue9));
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils makeAPaymentUtils22 = com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUtils.INSTANCE;
            changedInstance6 = startRestartGroup.changedInstance(makeAPaymentViewModel4);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (!changedInstance6) {
            }
            rememberedValue10 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$MakeAPaymentScreen$8$1(makeAPaymentViewModel4);
            startRestartGroup.updateRememberedValue(rememberedValue10);
            kotlin.jvm.functions.Function4<java.lang.Boolean, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, java.lang.Boolean, java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> createOnDismissCallback2 = makeAPaymentUtils22.createOnDismissCallback((kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue10));
            rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            makeAPaymentViewModel3 = makeAPaymentViewModel4;
            m12595MakeAPaymentChangeFiHalfSheetSetUpm7m1syQ(makeAPaymentUiState22, appNavigator, addCardNavResultRequestId2, addBankNavResultRequestId2, createOnNewlyAddedFiConsumeCallback2, createOnDismissCallback2, (kotlin.jvm.functions.Function1) rememberedValue11, null, startRestartGroup, i72 | 1572864, 128);
            if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            }
            documentsHalfSheetModel = (com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel) mutableState22.getValue();
            if (documentsHalfSheetModel != null) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            makeAPaymentViewModel3 = makeAPaymentViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.m12592$r8$lambda$VEhmlSoXXe7tDgTqrZs9gd7w2w(com.paypal.oslo.core.navigation.AppNavigator.this, makeAPaymentViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> flow, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-593135696);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-593135696, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.makepayment.EffectHandler (MakeAPaymentScreen.kt:177)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(flow);
            boolean z = (i2 & 112) == 32;
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 7168) == 2048;
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | changedInstance2 | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1(flow, appNavigator, context, function0, function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$_TS3sPYbfcwMFROHLxt1pn07M_c(kotlinx.coroutines.flow.Flow.this, appNavigator, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0290  */
    /* renamed from: MakeAPaymentChangeFiHalfSheetSetUp-m7m1syQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12595MakeAPaymentChangeFiHalfSheetSetUpm7m1syQ(final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState makeAPaymentUiState, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function4<? super java.lang.Boolean, ? super com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel, ? super java.lang.Boolean, ? super java.util.List<com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel>, kotlin.Unit> function4, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function1, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function12;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function13;
        boolean z;
        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function14;
        androidx.view.viewmodel.CreationExtras withCreationCallback;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-790948105);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(makeAPaymentUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function4) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
            }
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
            changeFiViewModel2 = changeFiViewModel;
        } else {
            changeFiViewModel2 = changeFiViewModel;
            if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(changeFiViewModel2) ? 8388608 : 4194304;
            }
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            changeFiViewModel3 = changeFiViewModel2;
            function13 = function12;
        } else {
            if (i4 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.m12591$r8$lambda$UDFBFUuxmCI8EReyFsRVOfZkxU((com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel5 = i5 != 0 ? null : changeFiViewModel2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-790948105, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentChangeFiHalfSheetSetUp (MakeAPaymentScreen.kt:221)");
            }
            final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success success = makeAPaymentUiState instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success ? (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success) makeAPaymentUiState : null;
            if (success == null) {
                startRestartGroup.startReplaceGroup(-943838403);
            } else {
                startRestartGroup.startReplaceGroup(-943838402);
                final com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel = success.getChangeFiHalfSheetModel();
                if (changeFiHalfSheetModel != null) {
                    startRestartGroup.startReplaceGroup(1783261701);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
                    if (changeFiViewModel5 == null) {
                        startRestartGroup.startReplaceGroup(-1853737250);
                        com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiFlowType flowType = changeFiHalfSheetModel.getFlowType();
                        java.lang.String selectedFundingInstrumentId = changeFiHalfSheetModel.getSelectedFundingInstrumentId();
                        int size = changeFiHalfSheetModel.getFundingInstruments().size();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(flowType);
                        sb.append("_");
                        sb.append(selectedFundingInstrumentId);
                        sb.append("_");
                        sb.append(size);
                        java.lang.String obj = sb.toString();
                        boolean changedInstance = startRestartGroup.changedInstance(changeFiHalfSheetModel);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$zU_XCVzfhA8s_bSzGra95GLYpYM(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel.this, (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.Factory) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue3;
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        z = false;
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function15);
                        } else {
                            withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function15);
                        }
                        changeFiViewModel4 = (com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.class), current, obj, createHiltViewModelFactory, withCreationCallback, startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        z = false;
                        startRestartGroup.startReplaceGroup(-1853737901);
                        startRestartGroup.endReplaceGroup();
                        changeFiViewModel4 = changeFiViewModel5;
                    }
                    java.util.List<java.lang.String> newlyAddedFiIds = success.getNewlyAddedFiIds();
                    boolean z2 = (i3 & 112) == 32 ? true : z;
                    boolean z3 = (i3 & 896) == 256;
                    boolean z4 = (i3 & 7168) == 2048;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((z2 | z3 | z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$SBIax87nLVFzFBdPZARf5KgOp68(com.paypal.oslo.core.navigation.AppNavigator.this, str, str2, (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    boolean z5 = (3670016 & i3) == 1048576;
                    boolean changedInstance2 = startRestartGroup.changedInstance(success);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((z5 | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$DoUTdK1muxEaJsAttNR5e170TNo(kotlin.jvm.functions.Function1.this, success, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    function14 = function12;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel6 = changeFiViewModel4;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetKt.ChangeFiHalfSheet(bottomSheetController, function16, function4, (kotlin.jvm.functions.Function1) rememberedValue5, newlyAddedFiIds, function0, changeFiViewModel6, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | ((i3 >> 9) & 896) | ((i3 << 3) & 458752), 0);
                    composer2.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    composer2.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function13 = function14;
                    changeFiViewModel3 = changeFiViewModel5;
                } else {
                    startRestartGroup.startReplaceGroup(1783261700);
                    startRestartGroup.endReplaceGroup();
                }
            }
            function14 = function12;
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            function13 = function14;
            changeFiViewModel3 = changeFiViewModel5;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.m12593$r8$lambda$lmwUqjNLpca63BS_lPvl_G4RtI(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.this, appNavigator, str, str2, function0, function4, function13, changeFiViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition mapAddFiTypeToSupportedType(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentType, "");
        int i = com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.WhenMappings.$EnumSwitchMapping$0[addFundingInstrumentType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.CREDIT_CARD;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.BANK;
        }
        if (i == 3) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState makeAPaymentUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(273872946);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(makeAPaymentUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(273872946, i2, -1, "com.paypal.oslo.feature.bnplservicing.ui.makepayment.ScreenContent (MakeAPaymentScreen.kt:291)");
            }
            androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, navigationBarsPadding);
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
            if (kotlin.jvm.internal.Intrinsics.areEqual(makeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Loading.INSTANCE)) {
                startRestartGroup.startReplaceGroup(888063036);
                com.paypal.oslo.feature.bnplservicing.ui.common.components.LoadingContentKt.LoadingContent(false, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
            } else if (makeAPaymentUiState instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success) {
                startRestartGroup.startReplaceGroup(888065076);
                getHighSpeedVideoSizes(((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success) makeAPaymentUiState).getUiModel(), function1, startRestartGroup, i2 & 112);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(makeAPaymentUiState, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Error.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(888061543);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(888067888);
                boolean z = (i2 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$pnIqfnQWuKRlbbW3TIefxJTGTGM(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt.ErrorContent((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentTestTags.ERROR_CONTENT), null, null, null, startRestartGroup, 48, 28);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$AtpY2K2jtyc9W8thIRfcuEl4Yyc(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0453  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        int i3;
        int i4;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.paypal.oslo.core.commonui.utils.RefText customAmountAlertMessage;
        java.lang.String str4;
        boolean z;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.Composer composer3;
        int i5;
        int i6;
        boolean z2;
        com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions termsAndConditions;
        java.lang.Object obj;
        final boolean z3;
        java.lang.String value;
        boolean changed;
        boolean z4;
        java.lang.Object rememberedValue2;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2043853397);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(makeAPaymentUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2;
        if (!startRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2043853397, i7, -1, "com.paypal.oslo.feature.bnplservicing.ui.makepayment.SuccessContent (MakeAPaymentScreen.kt:310)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel selectedFundingInstrument = makeAPaymentUiModel.getSelectedFundingInstrument();
            com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel defaultFundingInstrument = makeAPaymentUiModel.getDefaultFundingInstrument();
            boolean changed2 = startRestartGroup.changed(selectedFundingInstrument);
            boolean changed3 = startRestartGroup.changed(defaultFundingInstrument);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changed2 | changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel selectedFundingInstrument2 = makeAPaymentUiModel.getSelectedFundingInstrument();
                if (selectedFundingInstrument2 == null) {
                    selectedFundingInstrument2 = makeAPaymentUiModel.getDefaultFundingInstrument();
                }
                rememberedValue3 = selectedFundingInstrument2;
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel = (com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel) rememberedValue3;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentTestTags.SUCCESS_CONTENT);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            com.paypal.oslo.core.commonui.utils.RefText formAlertMessage = makeAPaymentUiModel.getFormAlertMessage();
            if (formAlertMessage != null) {
                startRestartGroup.startReplaceGroup(-1576448544);
                i3 = i7;
                i4 = 32;
                com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentTestTags.FORM_ALERT_BANNER), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, com.paypal.oslo.core.commonui.utils.RefTextKt.value(formAlertMessage, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 54, 120);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                startRestartGroup.endReplaceGroup();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            } else {
                startRestartGroup.startReplaceGroup(-1576448545);
                startRestartGroup.endReplaceGroup();
                i3 = i7;
                i4 = 32;
            }
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getPaymentAmountTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            if ((makeAPaymentUiModel.isAutopayEnabled() ? makeAPaymentUiModel : null) == null) {
                startRestartGroup.startReplaceGroup(-1576045080);
                startRestartGroup.endReplaceGroup();
                str = null;
            } else {
                startRestartGroup.startReplaceGroup(-1576045079);
                java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getAutopayOnTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                startRestartGroup.endReplaceGroup();
                str = value3;
            }
            java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> paymentOptions = makeAPaymentUiModel.getPaymentOptions();
            java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getOtherAmountLabel(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value5 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getEnterAmountHint(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.CustomAmountOption customAmountOption = makeAPaymentUiModel.getCustomAmountOption();
            if (customAmountOption == null || (amount = customAmountOption.getAmount()) == null || (str2 = amount.getCurrencyCode()) == null) {
                str2 = "USD";
            }
            com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsModel paymentOptionsModel = new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsModel(paymentOptions, new com.paypal.oslo.feature.bnplservicing.ui.common.components.OtherAmountModel(value4, value5, str2));
            java.lang.Integer selectedIndex = makeAPaymentUiModel.getSelectedIndex();
            java.lang.String selectedAmount = makeAPaymentUiModel.getSelectedAmount();
            if (selectedAmount != null) {
                java.util.List<com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption> paymentOptions2 = makeAPaymentUiModel.getPaymentOptions();
                if (!(paymentOptions2 instanceof java.util.Collection) || !paymentOptions2.isEmpty()) {
                    java.util.Iterator<T> it = paymentOptions2.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption) it.next()).getAmount(), selectedAmount)) {
                        }
                    }
                }
                str3 = selectedAmount;
                customAmountAlertMessage = makeAPaymentUiModel.getCustomAmountAlertMessage();
                if (customAmountAlertMessage != null) {
                    startRestartGroup.startReplaceGroup(-1575058257);
                    startRestartGroup.endReplaceGroup();
                    str4 = null;
                } else {
                    startRestartGroup.startReplaceGroup(919022994);
                    java.lang.String value6 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(customAmountAlertMessage, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    startRestartGroup.endReplaceGroup();
                    str4 = value6;
                }
                boolean isCustomAmountInError = makeAPaymentUiModel.isCustomAmountInError();
                boolean shouldShowOtherAmountOption = makeAPaymentUiModel.getShouldShowOtherAmountOption();
                java.util.Locale locale = makeAPaymentUiModel.getLocale();
                int i8 = i3 & 112;
                z = i8 != i4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$JUSsBQufTS0k82tW39ZTQmbf90A(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt.PaymentOptions(value2, paymentOptionsModel, (kotlin.jvm.functions.Function2) rememberedValue, null, str, selectedIndex, str3, str4, isCustomAmountInError, shouldShowOtherAmountOption, locale, startRestartGroup, 0, 0, 8);
                if (fundingInstrumentUiModel != null || fundingInstrumentUiModel.getAlert() == null) {
                    composer3 = startRestartGroup;
                    if (fundingInstrumentUiModel == null) {
                        composer3.startReplaceGroup(-1574385091);
                        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8());
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        i6 = 0;
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, companion);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        java.lang.String value7 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getPayWithTitle(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        z2 = true;
                        com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentMethodConfig paymentMethodConfig = new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentMethodConfig(com.paypal.oslo.core.commonui.utils.RefTextKt.value(fundingInstrumentUiModel.getTitle(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), com.paypal.oslo.core.commonui.utils.RefTextKt.value(fundingInstrumentUiModel.getSubTitle(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, fundingInstrumentUiModel.getFundingInstrument().getLogoUrl(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(547555702, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$3HZTM1s3A68m137gdsnQXWYJ6Lc(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, composer3, 54), 4, null);
                        java.lang.String value8 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getChangePaymentMethodLabel(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        i5 = i8;
                        boolean z5 = i5 == i4;
                        java.lang.Object rememberedValue4 = composer3.rememberedValue();
                        if (z5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$kRpk9pxkHhYRM2G4AcJh4Uf7mS0(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentMethodKt.PaymentMethod(value7, paymentMethodConfig, null, new com.paypal.oslo.feature.bnplservicing.ui.common.components.ChangeFiConfig(value8, (kotlin.jvm.functions.Function0) rememberedValue4), null, composer3, 0, 20);
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        i5 = i8;
                        i6 = 0;
                        z2 = true;
                        composer3.startReplaceGroup(-1573344824);
                        com.paypal.oslo.feature.bnplservicing.ui.common.components.EmptyPaymentMethodKt.EmptyPaymentMethod(com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getPayWithTitle(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getPaymentMethodEmptyMessage(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.Icon.Warning.INSTANCE, composer3, 3456, 0);
                        composer3.endReplaceGroup();
                    }
                } else {
                    composer3 = startRestartGroup;
                    composer3.startReplaceGroup(-1574764190);
                    com.paypal.oslo.feature.bnplservicing.ui.common.components.EmptyPaymentMethodKt.EmptyPaymentMethod(com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getPayWithTitle(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getPaymentMethodUnavailableMessage(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.Icon.Warning.INSTANCE, composer3, 3456, 0);
                    composer3.endReplaceGroup();
                    i5 = i8;
                    i6 = 0;
                    z2 = true;
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer3, i6);
                termsAndConditions = makeAPaymentUiModel.getTermsAndConditions();
                if (termsAndConditions == null) {
                    composer3.startReplaceGroup(-1572945730);
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.LegalConsentItem.Companion.implicit$default(com.paypal.pds.components.LegalConsentItem.INSTANCE, com.paypal.pds.core.RichTextKt.toRichText(com.paypal.oslo.core.commonui.utils.RefTextKt.value(termsAndConditions.getText(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(com.paypal.oslo.core.commonui.utils.RefTextKt.value(termsAndConditions.getLink(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable), termsAndConditions.getUrl()))), (com.paypal.pds.core.AnalyticsScope) null, 2, (java.lang.Object) null));
                    int i9 = i5 == i4 ? z2 ? 1 : 0 : i6;
                    java.lang.Object rememberedValue5 = composer3.rememberedValue();
                    if (i9 != 0 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$CXgQ2K8OUcnDVUIAy0boIv2Bd8s(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3, (java.lang.String) obj4);
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    obj = null;
                    com.paypal.pds.components.LegalConsentKt.LegalConsent(listOf, null, null, (kotlin.jvm.functions.Function3) rememberedValue5, null, composer3, com.paypal.pds.components.LegalConsentItem.$stable, 22);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    composer3.endReplaceGroup();
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                } else {
                    composer3.startReplaceGroup(-1572945731);
                    composer3.endReplaceGroup();
                    obj = null;
                }
                z3 = (fundingInstrumentUiModel == null && fundingInstrumentUiModel.getAlert() == null) ? z2 ? 1 : 0 : false;
                if (!z3) {
                    composer3.startReplaceGroup(-1572362868);
                    value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getConfirmAndPayButton(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(-1572282485);
                    value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(makeAPaymentUiModel.getContent().getChooseWayToPayButton(), composer3, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    composer3.endReplaceGroup();
                }
                java.lang.String str5 = value;
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, z2 ? 1 : 0, obj), com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentTestTags.CONFIRM_AND_PAY_BUTTON);
                boolean processingMakeAPayment = makeAPaymentUiModel.getProcessingMakeAPayment();
                changed = composer3.changed(z3);
                z4 = z2;
                if (i5 != i4) {
                    z4 = false;
                }
                rememberedValue2 = composer3.rememberedValue();
                if (((changed ? 1 : 0) | z4) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$lkkOfAyF7sa2KFWJ45HG67KePiE(z3, function1);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue2);
                }
                composer2 = composer3;
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, str5, testTag2, null, null, null, null, false, processingMakeAPayment, composer3, 384, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            str3 = null;
            customAmountAlertMessage = makeAPaymentUiModel.getCustomAmountAlertMessage();
            if (customAmountAlertMessage != null) {
            }
            boolean isCustomAmountInError2 = makeAPaymentUiModel.isCustomAmountInError();
            boolean shouldShowOtherAmountOption2 = makeAPaymentUiModel.getShouldShowOtherAmountOption();
            java.util.Locale locale2 = makeAPaymentUiModel.getLocale();
            int i82 = i3 & 112;
            if (i82 != i4) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$JUSsBQufTS0k82tW39ZTQmbf90A(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt.PaymentOptions(value2, paymentOptionsModel, (kotlin.jvm.functions.Function2) rememberedValue, null, str, selectedIndex, str3, str4, isCustomAmountInError2, shouldShowOtherAmountOption2, locale2, startRestartGroup, 0, 0, 8);
            if (fundingInstrumentUiModel != null) {
            }
            composer3 = startRestartGroup;
            if (fundingInstrumentUiModel == null) {
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer3, i6);
            termsAndConditions = makeAPaymentUiModel.getTermsAndConditions();
            if (termsAndConditions == null) {
            }
            if (fundingInstrumentUiModel == null) {
            }
            if (!z3) {
            }
            java.lang.String str52 = value;
            androidx.compose.ui.Modifier testTag22 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, z2 ? 1 : 0, obj), com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentTestTags.CONFIRM_AND_PAY_BUTTON);
            boolean processingMakeAPayment2 = makeAPaymentUiModel.getProcessingMakeAPayment();
            changed = composer3.changed(z3);
            z4 = z2;
            if (i5 != i4) {
            }
            rememberedValue2 = composer3.rememberedValue();
            if (((changed ? 1 : 0) | z4) == 0) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.$r8$lambda$lkkOfAyF7sa2KFWJ45HG67KePiE(z3, function1);
                }
            };
            composer3.updateRememberedValue(rememberedValue2);
            composer2 = composer3;
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, str52, testTag22, null, null, null, null, false, processingMakeAPayment2, composer3, 384, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.m12594$r8$lambda$mwNYHBFWL8kkQPmEWf4XJCo2B4(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.this, function1, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3HZTM1s3A68m137gdsnQXWYJ6Lc(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(547555702, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.makepayment.SuccessContent.<anonymous>.<anonymous>.<anonymous> (MakeAPaymentScreen.kt:376)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentMethodKt.DefaultFiIcon(fundingInstrumentUiModel.getFundingInstrument(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A75iwPXsfQ7WsSlVueOmanM5AVE(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsHalfSheetModel, "");
        mutableState.setValue(documentsHalfSheetModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AtpY2K2jtyc9W8thIRfcuEl4Yyc(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState makeAPaymentUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(makeAPaymentUiState, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CXgQ2K8OUcnDVUIAy0boIv2Bd8s(kotlin.jvm.functions.Function1 function1, int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.PaymentAuthorizationPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DoUTdK1muxEaJsAttNR5e170TNo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState.Success success, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentReducer.INSTANCE.buildPaymentAuthorizationDocument$bnpl_servicing_prodRelease(str, success.getUiModel()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EVIIVEujiiDoIm_n-gBwxfUcQ9A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12588$r8$lambda$EVIIVEujiiDoIm_ngBwxfUcQ9A(int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-640447786);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            i3 = updateChangedFlags;
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-640447786, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakePaymentPreview (MakeAPaymentScreen.kt:442)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider makeAPaymentContentProvider = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.content.MakeAPaymentContentProvider();
            i3 = updateChangedFlags;
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentContent(makeAPaymentContentProvider.getPaymentAmountTitle(), makeAPaymentContentProvider.getAutopayOnTitle(), makeAPaymentContentProvider.getOtherAmountLabel(), makeAPaymentContentProvider.getEnterAmountHint(), makeAPaymentContentProvider.getPayWithTitle(), makeAPaymentContentProvider.getChangePaymentMethodLabel(), makeAPaymentContentProvider.getPaymentMethodEmptyMessage(), makeAPaymentContentProvider.getPaymentMethodUnavailableMessage(), makeAPaymentContentProvider.getConfirmAndPayButton(), makeAPaymentContentProvider.getChooseWayToPayButton(), new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel.MakeAPaymentValidationContent(makeAPaymentContentProvider.getValidationContent().getMissingAmount(), makeAPaymentContentProvider.getValidationContent().getMissingFundingInstrument(), makeAPaymentContentProvider.getValidationContent().getInsufficientBalance(), makeAPaymentContentProvider.getValidationContent().amountBelowMinimum("$57.50"), makeAPaymentContentProvider.getValidationContent().amountAboveMaximum("$632.60"), makeAPaymentContentProvider.getValidationContent().getAmountExceedsInfo(), makeAPaymentContentProvider.getValidationContent().getAmountBelowInfo(), makeAPaymentContentProvider.getValidationContent().getAmountEqualsMaximum())), null, null, null, null, false, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption[]{new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption("$57.50", com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Next Payment")), new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOption("$632.50", com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Next Payment"))}), null, null, new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel(new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount("CARD_12345", "https://example.com/visa-logo.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.CARD, "Visa", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.VISA, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.CREDIT, "12/26", "Chase Freedom", "1234", null, 512, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Visa"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Visa •••• 1234"), false, new com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.Alert(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel.Alert.AlertContext.FUNDING_INSTRUMENT_ERROR, "Update required")), null, new com.paypal.oslo.feature.bnplservicing.common.model.TermsAndConditions(makeAPaymentContentProvider.getPaymentAuthorizationText(), makeAPaymentContentProvider.getPaymentAuthorizationLinkText(), ""), null, null, null, false, makeAPaymentContentProvider.getValidationContent().getMissingAmount(), null, false, null, null, null, false, null, 16709054, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.m12590$r8$lambda$SaL0aRW_K7Eu7Ad2Ap3qZbIYZs((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoSizes(makeAPaymentUiModel, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit>) rememberedValue, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = i3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt.m12588$r8$lambda$EVIIVEujiiDoIm_ngBwxfUcQ9A(i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Eirie24K-ZE_B1H7KD3KBWDFpJo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12589$r8$lambda$Eirie24KZE_B1H7KD3KBWDFpJo(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsHalfSheetModel, "");
        mutableState.setValue(documentsHalfSheetModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GDWrOqgIMxemTu42C1siG9_GEWY(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JUSsBQufTS0k82tW39ZTQmbf90A(kotlin.jvm.functions.Function1 function1, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected(i, str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L_s7tEm3Fld4Of_iG7CNt8OJmYQ(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        makeAPaymentViewModel.processEvent$bnpl_servicing_prodRelease(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ConfirmAndPayPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NxhaYx8LvSLcxM_iepzfav4oMzU(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SBIax87nLVFzFBdPZARf5KgOp68(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType addFundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFundingInstrumentType, "");
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition mapAddFiTypeToSupportedType = mapAddFiTypeToSupportedType(addFundingInstrumentType);
        if (mapAddFiTypeToSupportedType != null) {
            com.paypal.oslo.feature.bnplservicing.ui.common.WalletNavigationKt.m12541navigateToAddFundingInstrumenthEdsvIk(mapAddFiTypeToSupportedType, appNavigator, str, str2);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SaL0aRW_K7Eu7Ad2-Ap3qZbIYZs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12590$r8$lambda$SaL0aRW_K7Eu7Ad2Ap3qZbIYZs(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent makeAPaymentEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TcT0VgDRwcXqIkLCQAJi6Ehi3lI(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        makeAPaymentViewModel.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess(kotlin.collections.CollectionsKt.listOf(str)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UDFBFUuxmCI8ER-eyFsRVOfZkxU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12591$r8$lambda$UDFBFUuxmCI8EReyFsRVOfZkxU(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel documentsHalfSheetModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsHalfSheetModel, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VEhmlSoXXe7tDgTq-rZs9gd7w2w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12592$r8$lambda$VEhmlSoXXe7tDgTqrZs9gd7w2w(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MakeAPaymentScreen(appNavigator, makeAPaymentViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_TS3sPYbfcwMFROHLxt1pn07M_c(kotlinx.coroutines.flow.Flow flow, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(flow, appNavigator, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cQ02ysX4Wz4sfHsw130su80CZAU(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kRpk9pxkHhYRM2G4AcJh4Uf7mS0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangePaymentMethodPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lkkOfAyF7sa2KFWJ45HG67KePiE(boolean z, kotlin.jvm.functions.Function1 function1) {
        if (z) {
            function1.invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ConfirmAndPayPressed.INSTANCE);
        } else {
            function1.invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangePaymentMethodPressed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lmwUqjNLpca63BS-_lPvl_G4RtI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12593$r8$lambda$lmwUqjNLpca63BS_lPvl_G4RtI(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiState makeAPaymentUiState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function4 function4, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m12595MakeAPaymentChangeFiHalfSheetSetUpm7m1syQ(makeAPaymentUiState, appNavigator, str, str2, function0, function4, function1, changeFiViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mwNYHBF-WL8kkQPmEWf4XJCo2B4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12594$r8$lambda$mwNYHBFWL8kkQPmEWf4XJCo2B4(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(makeAPaymentUiModel, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit>) function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pnIqfnQWuKRlbbW3TIefxJTGTGM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.LoadData.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tSJd1KWzz4gnxC_aPH7ikbrhU5Y(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel makeAPaymentViewModel, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            makeAPaymentViewModel.processEvent$bnpl_servicing_prodRelease(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess(list));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel $r8$lambda$zU_XCVzfhA8s_bSzGra95GLYpYM(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiHalfSheetModel changeFiHalfSheetModel, com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs(changeFiHalfSheetModel.getCreditAccountId(), changeFiHalfSheetModel.getCreditProductIdentifier(), changeFiHalfSheetModel.getSelectedFundingInstrumentId(), changeFiHalfSheetModel.getFlowType(), new com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiArgs.FundingInstrumentSelectionContext(changeFiHalfSheetModel.getFundingInstruments(), changeFiHalfSheetModel.getSupportingFundingInstrumentsToAdd(), changeFiHalfSheetModel.getPaymentAuthorizationLink())));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.AddFundingInstrumentType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
