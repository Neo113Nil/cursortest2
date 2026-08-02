package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a§\u0001\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0010H\u0002\u001a2\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020!2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002\u001a_\u0010&\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010'\u001a\u00020(2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010)\u001aQ\u0010*\u001a\u00020\u00012\b\u0010+\u001a\u0004\u0018\u00010,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010/\u001a\u00020(2\b\b\u0002\u00100\u001a\u00020(H\u0003¢\u0006\u0002\u00101\u001a;\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020(2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u00104\u001a1\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u00020(2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u00108\u001a\u0018\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001\u001aT\u0010>\u001a\u00020\u00012\u0006\u0010:\u001a\u00020?2\u0006\u0010<\u001a\u00020=2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020D2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0014\b\u0002\u0010F\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00010\u000fH\u0001\u001a\u0015\u0010H\u001a\u00020\u00012\u0006\u0010I\u001a\u00020JH\u0003¢\u0006\u0002\u0010K\u001aO\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2!\u0010O\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bP\u0012\b\bQ\u0012\u0004\b\b(R\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002\u001a@\u0010U\u001a\u00020\u00012\u0006\u0010M\u001a\u00020V2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001\u001a\r\u0010Z\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006[²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010C\u001a\u00020DX\u008a\u0084\u0002²\u0006\f\u0010\\\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002²\u0006\n\u0010]\u001a\u00020(X\u008a\u008e\u0002"}, d2 = {"AutoSaveManageScreen", "", "goal", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "viewModel", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageViewModel;", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageViewModel;Landroidx/compose/runtime/Composer;II)V", "AutoSaveManageLoadingContent", "(Landroidx/compose/runtime/Composer;I)V", "AutoSaveManageReadyContent", "state", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Ready;", "onBack", "Lkotlin/Function0;", "onAmountSelect", "Lkotlin/Function1;", "", "onOtherSelect", "onAmountDisplayClick", "onFrequencyClick", "onAutoSaveInfoClick", "onFiClick", "onFiRetry", "onSave", "onTurnOffAutoSave", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState$Ready;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AutoSaveManageHeader", "goalTitle", "availableAmount", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getAmountIndex", "", "selectedAmount", "customAmount", "handleAmountSelection", "index", "AutoSaveManageAmountSection", "showCustomAmountDisplay", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SourceCard", "selectedFi", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "onClick", "onRetry", "isLoading", "isFiFetchError", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V", "AutoSaveManageFooter", "isSubmitting", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AutoSaveManageErrorContent", "isNetworkError", "onButtonClick", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "handleNavigateBackEffect", "effect", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect$NavigateBack;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "handleAutoSaveManageEffect", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageEffect;", "frequencySheetController", "Lcom/paypal/pds/components/BottomSheetController;", "fiSelectionSheetController", "addFiFlowState", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AddAdditionalFiFlowState;", "onResetAddFiFlowState", "onShowToast", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/FiToastType;", "TrackAutoSaveManageScreenState", "uiState", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState;", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveManageUiState;Landroidx/compose/runtime/Composer;I)V", "handleAddCardResult", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "onAddCardSuccess", "Lkotlin/ParameterName;", "name", "fiId", "onAddCardFail", "onAddCardCancel", "handleAddBankResult", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/banks/AddBankFlowNavResult;", "onAddBankSuccess", "onAddBankFail", "onAddBankCancel", "AutoSaveManageScreenPreview", "savings_prodRelease", "toastMessage", "showToast"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveManageScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0556  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoSaveManageScreen(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel4;
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object rememberedValue;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        java.lang.Object rememberedValue2;
        com.paypal.pds.components.BottomSheetController bottomSheetController2;
        java.lang.Object rememberedValue3;
        androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue4;
        androidx.compose.runtime.MutableState mutableState2;
        boolean changedInstance;
        boolean changedInstance2;
        java.lang.Object rememberedValue5;
        java.lang.Object rememberedValue6;
        boolean changedInstance3;
        boolean changedInstance4;
        java.lang.Object rememberedValue7;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        java.lang.Object rememberedValue8;
        boolean changedInstance5;
        boolean changed;
        boolean changedInstance6;
        boolean changedInstance7;
        boolean changed2;
        boolean changed3;
        java.lang.Object rememberedValue9;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState;
        com.paypal.pds.components.BottomSheetController bottomSheetController3;
        java.lang.Object obj;
        com.paypal.pds.components.BottomSheetController bottomSheetController4;
        final androidx.compose.runtime.MutableState mutableState3;
        final androidx.compose.runtime.MutableState mutableState4;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        androidx.compose.runtime.Composer composer5;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState2;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType;
        int i6;
        final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2 = goalSummaryDTO;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(579989872);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(goalSummaryDTO2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                autoSaveManageViewModel2 = autoSaveManageViewModel;
                if (startRestartGroup.changedInstance(autoSaveManageViewModel2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                autoSaveManageViewModel2 = autoSaveManageViewModel;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            autoSaveManageViewModel2 = autoSaveManageViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
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
                i4 = 0;
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel5 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i5 = i7 & (-113);
                autoSaveManageViewModel4 = autoSaveManageViewModel5;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(579989872, i5, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreen (AutoSaveManageScreen.kt:119)");
                }
                appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(autoSaveManageViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(autoSaveManageViewModel4.getAddAdditionalFiFlowState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                getHighSpeedVideoSizes((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState) collectAsStateWithLifecycle.getValue(), startRestartGroup, i4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue4;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_credit_card_error_toast_message, startRestartGroup, i4);
                changedInstance = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$AutoSaveManageScreen$1$1(autoSaveManageViewModel4, bottomSheetController2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue5;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$AutoSaveManageScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19046invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19046invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
                changedInstance3 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                changedInstance4 = startRestartGroup.changedInstance(bottomSheetController2);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if ((!changedInstance3 && !changedInstance4) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager = null;
                    rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$AutoSaveManageScreen$2$1(autoSaveManageViewModel4, bottomSheetController2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                } else {
                    navResultManager = null;
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue7;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$AutoSaveManageScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m19047invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19047invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue8, startRestartGroup, 3072);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance5 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                changed = startRestartGroup.changed(appNavigator);
                changedInstance6 = startRestartGroup.changedInstance(bottomSheetController);
                changedInstance7 = startRestartGroup.changedInstance(bottomSheetController2);
                changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2);
                changed3 = startRestartGroup.changed(stringResource);
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!(changedInstance5 | changed | changedInstance6 | changedInstance7 | changed2 | changed3) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$AutoSaveManageScreen$3$1(autoSaveManageViewModel4, appNavigator, bottomSheetController, bottomSheetController2, collectAsStateWithLifecycle2, stringResource, mutableState, mutableState2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9, startRestartGroup, 6);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                autoSaveManageUiState = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState) collectAsStateWithLifecycle.getValue();
                if (!(autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Loading)) {
                    startRestartGroup.startReplaceGroup(671471034);
                    AutoSaveManageLoadingContent(startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    goalSummaryDTO2 = goalSummaryDTO;
                    bottomSheetController3 = bottomSheetController2;
                    obj = null;
                    bottomSheetController4 = bottomSheetController;
                    mutableState3 = mutableState2;
                    autoSaveManageViewModel3 = autoSaveManageViewModel4;
                    mutableState4 = mutableState;
                    composer5 = startRestartGroup;
                } else {
                    if (autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) {
                        startRestartGroup.startReplaceGroup(671645099);
                        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready ready = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState;
                        if (ready.isShowingCustomAmountInput()) {
                            startRestartGroup.startReplaceGroup(671714446);
                            java.lang.String title = ready.getGoal().getTitle();
                            java.lang.String customAmount = ready.getCustomAmount();
                            boolean changedInstance8 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                            if (changedInstance8 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$kpjw7SSw7fppOAIwTj6agU7GKjM(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue10);
                            }
                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue10;
                            boolean changedInstance9 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                            if (changedInstance9 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$khYiygScNxkvH0uQ5kOddPZFRHE(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue11);
                            }
                            obj = null;
                            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputContentKt.CustomAmountInputContent(title, customAmount, function0, (kotlin.jvm.functions.Function1) rememberedValue11, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType.MANAGE_AUTOSAVE, startRestartGroup, 24576, 0);
                            startRestartGroup.endReplaceGroup();
                            bottomSheetController3 = bottomSheetController2;
                            bottomSheetController4 = bottomSheetController;
                            mutableState3 = mutableState2;
                            autoSaveManageViewModel3 = autoSaveManageViewModel4;
                            mutableState4 = mutableState;
                            composer4 = startRestartGroup;
                        } else {
                            obj = null;
                            startRestartGroup.startReplaceGroup(672179942);
                            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_changed_message, startRestartGroup, 0);
                            final java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_turned_off_message, startRestartGroup, 0);
                            boolean changedInstance10 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                            if (changedInstance10 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda20
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$eoiKoX3EGsBEVln7h8Q7bXjwD9U(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue12);
                            }
                            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue12;
                            boolean changedInstance11 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                            if (changedInstance11 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda21
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$TSl6SzKonh42JQjdRqN9f4KiXR4(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue13);
                            }
                            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue13;
                            boolean changedInstance12 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                            if (changedInstance12 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda23
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19028$r8$lambda$BVGqknEaeHIgSIQnxrd0bLCOp8(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue14);
                            }
                            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue14;
                            boolean changedInstance13 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                            if (changedInstance13 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda24
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19030$r8$lambda$CjuszGExPlUx97x9VE5YGO7HS4(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue15);
                            }
                            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue15;
                            boolean changedInstance14 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                            if (changedInstance14 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda25
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$xnHjmZL3tYZh9sNHgO_dTI8bf0Y(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue16);
                            }
                            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue16;
                            boolean changed4 = startRestartGroup.changed(appNavigator);
                            java.lang.Object rememberedValue17 = startRestartGroup.rememberedValue();
                            if (changed4 || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue17 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda26
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$_2KDZhdJURsSZq43uaSMGIkLalk(com.paypal.oslo.core.navigation.AppNavigator.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue17);
                            }
                            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue17;
                            boolean changedInstance15 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            java.lang.Object rememberedValue18 = startRestartGroup.rememberedValue();
                            if (changedInstance15 || rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue18 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda27
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19026$r8$lambda$2PuaMeUA0hWRzmTdWw5Fhs2d40(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue18);
                            }
                            kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) rememberedValue18;
                            boolean changedInstance16 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            boolean changed5 = startRestartGroup.changed(autoSaveManageUiState);
                            bottomSheetController3 = bottomSheetController2;
                            java.lang.Object rememberedValue19 = startRestartGroup.rememberedValue();
                            if ((changedInstance16 | changed5) || rememberedValue19 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue19 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda28
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19032$r8$lambda$FcHt33QSy0JNCW6ZQcWHbDhZ1Y(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this, autoSaveManageUiState);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue19);
                            }
                            kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) rememberedValue19;
                            boolean changedInstance17 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            boolean changed6 = startRestartGroup.changed(stringResource2);
                            bottomSheetController4 = bottomSheetController;
                            java.lang.Object rememberedValue20 = startRestartGroup.rememberedValue();
                            if ((changedInstance17 | changed6) || rememberedValue20 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue20 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19043$r8$lambda$yknnbUZqJul_qhjGSepCH3P1iM(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this, stringResource2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue20);
                            }
                            kotlin.jvm.functions.Function0 function09 = (kotlin.jvm.functions.Function0) rememberedValue20;
                            boolean changedInstance18 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
                            boolean changed7 = startRestartGroup.changed(stringResource3);
                            java.lang.Object rememberedValue21 = startRestartGroup.rememberedValue();
                            if ((changedInstance18 | changed7) || rememberedValue21 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue21 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19040$r8$lambda$ivh8BVxEWSFUp8wE0VqrjZdssk(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this, stringResource3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue21);
                            }
                            mutableState3 = mutableState2;
                            autoSaveManageViewModel3 = autoSaveManageViewModel4;
                            mutableState4 = mutableState;
                            composer4 = startRestartGroup;
                            AutoSaveManageReadyContent(ready, function02, function1, function03, function04, function05, function06, function07, function08, function09, (kotlin.jvm.functions.Function0) rememberedValue21, startRestartGroup, 0, 0);
                            composer4.endReplaceGroup();
                        }
                        composer4.endReplaceGroup();
                        composer3 = composer4;
                    } else {
                        bottomSheetController3 = bottomSheetController2;
                        obj = null;
                        bottomSheetController4 = bottomSheetController;
                        mutableState3 = mutableState2;
                        autoSaveManageViewModel3 = autoSaveManageViewModel4;
                        mutableState4 = mutableState;
                        if (autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error) {
                            startRestartGroup.startReplaceGroup(673804373);
                            boolean isNetworkError = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error) autoSaveManageUiState).isNetworkError();
                            boolean changedInstance19 = startRestartGroup.changedInstance(autoSaveManageViewModel3);
                            java.lang.Object rememberedValue22 = startRestartGroup.rememberedValue();
                            if (changedInstance19 || rememberedValue22 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue22 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19038$r8$lambda$XruQnHH16pEm27dPszrOmz8x6U(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue22);
                            }
                            kotlin.jvm.functions.Function0 function010 = (kotlin.jvm.functions.Function0) rememberedValue22;
                            boolean changedInstance20 = startRestartGroup.changedInstance(autoSaveManageViewModel3);
                            java.lang.Object rememberedValue23 = startRestartGroup.rememberedValue();
                            if (changedInstance20 || rememberedValue23 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue23 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19029$r8$lambda$B0CVpEd47ilMyFFIUnOyeHaCw(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue23);
                            }
                            AutoSaveManageErrorContent(isNetworkError, function010, (kotlin.jvm.functions.Function0) rememberedValue23, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                            composer3 = startRestartGroup;
                        } else {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(autoSaveManageUiState, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Initial.INSTANCE)) {
                                startRestartGroup.startReplaceGroup(160207990);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(674132446);
                            startRestartGroup.endReplaceGroup();
                            goalSummaryDTO2 = goalSummaryDTO;
                            autoSaveManageViewModel3.initialize(goalSummaryDTO2);
                            composer5 = startRestartGroup;
                        }
                    }
                    goalSummaryDTO2 = goalSummaryDTO;
                    composer5 = composer3;
                }
                autoSaveManageUiState2 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState) collectAsStateWithLifecycle.getValue();
                if (!(autoSaveManageUiState2 instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready)) {
                    composer5.startReplaceGroup(674420715);
                    boolean changed8 = composer5.changed(bottomSheetController4.getVisible());
                    java.lang.Object rememberedValue24 = composer5.rememberedValue();
                    if (changed8 || rememberedValue24 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.lang.Object frequencyState = bottomSheetController4.getVisible() ? ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState2).getFrequencyState() : obj;
                        composer5.updateRememberedValue(frequencyState);
                        rememberedValue24 = frequencyState;
                    }
                    com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) rememberedValue24;
                    boolean changedInstance21 = composer5.changedInstance(autoSaveManageViewModel3);
                    final com.paypal.pds.components.BottomSheetController bottomSheetController5 = bottomSheetController4;
                    boolean changedInstance22 = composer5.changedInstance(bottomSheetController5);
                    java.lang.Object rememberedValue25 = composer5.rememberedValue();
                    if ((changedInstance21 | changedInstance22) || rememberedValue25 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue25 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19042$r8$lambda$xC8KSqHS1BodnKf6UpQ5WhDb4(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this, bottomSheetController5, (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) obj2);
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue25);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue25;
                    boolean changedInstance23 = composer5.changedInstance(bottomSheetController5);
                    java.lang.Object rememberedValue26 = composer5.rememberedValue();
                    if (changedInstance23 || rememberedValue26 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue26 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19039$r8$lambda$hyMfFXtQnKZWIWJEkvPY1wZqaE(com.paypal.pds.components.BottomSheetController.this);
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue26);
                    }
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FrequencySelectionHalfSheetKt.FrequencySelectionHalfSheet(bottomSheetController5, function12, (kotlin.jvm.functions.Function0) rememberedValue26, false, frequencySelectionState == null ? ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState2).getFrequencyState() : frequencySelectionState, composer5, com.paypal.pds.components.BottomSheetController.$stable | 3072, 0);
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready ready2 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState2;
                    java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> financialInstruments = ready2.getFinancialInstruments();
                    com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState2 = ready2.getFrequencyState();
                    if (frequencyState2 == null || (frequencyType = frequencyState2.getSelectedFrequency()) == null) {
                        frequencyType = com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.WEEKLY;
                    }
                    com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType2 = frequencyType;
                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO selectedFi = ready2.getSelectedFi();
                    boolean booleanValue = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
                    java.lang.String str = (java.lang.String) mutableState4.getValue();
                    boolean changedInstance24 = composer5.changedInstance(autoSaveManageViewModel3);
                    final com.paypal.pds.components.BottomSheetController bottomSheetController6 = bottomSheetController3;
                    boolean changedInstance25 = composer5.changedInstance(bottomSheetController6);
                    java.lang.Object rememberedValue27 = composer5.rememberedValue();
                    if ((changedInstance24 | changedInstance25) || rememberedValue27 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue27 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$VK42vT2AvPuVozre0GXA9jecnss(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this, bottomSheetController6, (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO) obj2);
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue27);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue27;
                    boolean changedInstance26 = composer5.changedInstance(bottomSheetController6);
                    java.lang.Object rememberedValue28 = composer5.rememberedValue();
                    if (changedInstance26 || rememberedValue28 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue28 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$ZxNM80TqGs1jj0AtLkHQZaww2CI(com.paypal.pds.components.BottomSheetController.this);
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue28);
                    }
                    kotlin.jvm.functions.Function0 function011 = (kotlin.jvm.functions.Function0) rememberedValue28;
                    boolean changedInstance27 = composer5.changedInstance(autoSaveManageViewModel3);
                    java.lang.Object rememberedValue29 = composer5.rememberedValue();
                    if (changedInstance27 || rememberedValue29 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue29 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$WC_NUPAXXFuM_0ZZkWzEYtwIJmE(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.this);
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue29);
                    }
                    kotlin.jvm.functions.Function0 function012 = (kotlin.jvm.functions.Function0) rememberedValue29;
                    java.lang.Object rememberedValue30 = composer5.rememberedValue();
                    if (rememberedValue30 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue30 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$WxSxa787lolYYmsmmNty2eV0Ihk(androidx.compose.runtime.MutableState.this, mutableState4);
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue30);
                    }
                    composer2 = composer5;
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveFiSelectionHalfSheetKt.m18997AutoSaveFiSelectionHalfSheetcjrXe90(bottomSheetController6, financialInstruments, function13, function011, rememberNavResultRequestId2, rememberNavResultRequestId, frequencyType2, selectedFi, function012, booleanValue, str, (kotlin.jvm.functions.Function0) rememberedValue30, composer2, com.paypal.pds.components.BottomSheetController.$stable, 48, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer5;
                    composer2.startReplaceGroup(676432088);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 0;
            int i8 = i7;
            autoSaveManageViewModel4 = autoSaveManageViewModel2;
            i5 = i8;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
            androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(autoSaveManageViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(autoSaveManageViewModel4.getAddAdditionalFiFlowState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            getHighSpeedVideoSizes((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState) collectAsStateWithLifecycle3.getValue(), startRestartGroup, i4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            java.lang.String rememberNavResultRequestId3 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            java.lang.String rememberNavResultRequestId22 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, i4);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue4;
            java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_credit_card_error_toast_message, startRestartGroup, i4);
            changedInstance = startRestartGroup.changedInstance(autoSaveManageViewModel4);
            changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!(changedInstance | changedInstance2)) {
            }
            rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$AutoSaveManageScreen$1$1(autoSaveManageViewModel4, bottomSheetController2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue5;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId3, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
            changedInstance3 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
            changedInstance4 = startRestartGroup.changedInstance(bottomSheetController2);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!(changedInstance3 | changedInstance4)) {
            }
            navResultManager = null;
            rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$AutoSaveManageScreen$2$1(autoSaveManageViewModel4, bottomSheetController2, null);
            startRestartGroup.updateRememberedValue(rememberedValue7);
            kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) rememberedValue7;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId22, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue8, startRestartGroup, 3072);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance5 = startRestartGroup.changedInstance(autoSaveManageViewModel4);
            changed = startRestartGroup.changed(appNavigator);
            changedInstance6 = startRestartGroup.changedInstance(bottomSheetController);
            changedInstance7 = startRestartGroup.changedInstance(bottomSheetController2);
            changed2 = startRestartGroup.changed(collectAsStateWithLifecycle22);
            changed3 = startRestartGroup.changed(stringResource4);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!(changedInstance5 | changed | changedInstance6 | changedInstance7 | changed2 | changed3)) {
            }
            rememberedValue9 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$AutoSaveManageScreen$3$1(autoSaveManageViewModel4, appNavigator, bottomSheetController, bottomSheetController2, collectAsStateWithLifecycle22, stringResource4, mutableState, mutableState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue9);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9, startRestartGroup, 6);
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            autoSaveManageUiState = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState) collectAsStateWithLifecycle3.getValue();
            if (!(autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Loading)) {
            }
            autoSaveManageUiState2 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState) collectAsStateWithLifecycle3.getValue();
            if (!(autoSaveManageUiState2 instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready)) {
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            autoSaveManageViewModel3 = autoSaveManageViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$wiJOSR85orbfOknqoNF0OJdPWwA(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, autoSaveManageViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static final void AutoSaveManageLoadingContent(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-35055724);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-35055724, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageLoadingContent (AutoSaveManageScreen.kt:297)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.LOADING_CONTENT);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.Modifier.INSTANCE, null, null, null, startRestartGroup, 6, 14);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19037$r8$lambda$VtijitOL0WGR8OGk2ht2Y3X1b4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutoSaveManageReadyContent(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready ready, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function0<kotlin.Unit> function05, final kotlin.jvm.functions.Function0<kotlin.Unit> function06, final kotlin.jvm.functions.Function0<kotlin.Unit> function07, final kotlin.jvm.functions.Function0<kotlin.Unit> function08, final kotlin.jvm.functions.Function0<kotlin.Unit> function09, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ready, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function06, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function07, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function08, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function09, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(454685143);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(ready) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function05) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function07) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function08) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function09) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(454685143, i3, i4, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageReadyContent (AutoSaveManageScreen.kt:322)");
            }
            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
            int i5 = i4;
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
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_manage_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getMANAGE_BACK_BUTTON()), "auto_save_manage_top_bar"), null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1599007779, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$Yg3kfEHH6EG1VHCjGSEXHFNu0yQ(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 92);
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
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
            getHighSpeedVideoFpsRangesFor(ready.getGoal().getTitle(), ready.getGoal().getCurrentAmountFormatted(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.HEADER), startRestartGroup, 384, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            int i6 = i3;
            composer2 = startRestartGroup;
            getHighSpeedVideoSizes(ready.getSelectedAmount(), ready.getCustomAmount(), ready.getShowCustomAmountDisplay(), function1, function02, function03, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getMANAGE_AMOUNT_ZONE()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.AMOUNT_SECTION), composer2, (i3 << 3) & 523264, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommonKt.FrequencySelectionCard(ready.getFrequencyState(), function04, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getMANAGE_FREQUENCY_ZONE()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.FREQUENCY_CARD), function05, composer2, ((i6 >> 12) & 112) | ((i6 >> 9) & 7168), 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            getHighSpeedVideoFpsRangesFor(ready.getSelectedFi(), function06, function07, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getMANAGE_FI_ZONE()), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getMANAGE_FI_CARD_TAP()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.SOURCE_CARD), ready.isFiLoading(), ready.isFiFetchError(), composer2, (i6 >> 18) & 1008, 0);
            composer2.endNode();
            getHighSpeedVideoSizes(ready.isSubmitting(), function08, function09, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.FOOTER), composer2, ((i6 >> 24) & 112) | 3072 | ((i5 << 6) & 896), 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19035$r8$lambda$MIm080VfaiurDpIFEidlZzg6nI(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready.this, function0, function1, function02, function03, function04, function05, function06, function07, function08, function09, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.String str, final java.lang.String str2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(83257677);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(83257677, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageHeader (AutoSaveManageScreen.kt:413)");
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null);
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
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingSmall.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_amount_available, new java.lang.Object[]{str2}, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$k8BiHhNv3k5oRRPElfYJgBKIbxw(str, str2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final int getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2) {
        boolean z = (str2.length() <= 0 || kotlin.jvm.internal.Intrinsics.areEqual(str2, "0") || kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"10", "50", "150"}).contains(str2)) ? false : true;
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "10")) {
            return 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "50")) {
            return 1;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "150")) {
            return 2;
        }
        return z ? 3 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final java.lang.String str, final java.lang.String str2, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1222200528);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 1048576 : 524288;
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1222200528, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageAmountSection (AutoSaveManageScreen.kt:480)");
                }
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str, str2);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_automatically_add, startRestartGroup, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                boolean z2 = (i3 & 7168) == 2048;
                boolean z3 = (57344 & i3) == 16384;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19024$r8$lambda$0KidwhldMSCy33Aiko86YZ8mCw(kotlin.jvm.functions.Function1.this, function0, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommonKt.AmountSelectionCards(highSpeedVideoFpsRangesFor, (kotlin.jvm.functions.Function1) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.QUICK_AMOUNT_SELECTOR), startRestartGroup, 384, 0);
                java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(str2);
                boolean z4 = doubleOrNull != null && doubleOrNull.doubleValue() > 0.0d;
                if (z && z4) {
                    startRestartGroup.startReplaceGroup(-1844859420);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommonKt.CustomAmountDisplay(str2, function02, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "custom_amount_display_box"), startRestartGroup, ((i3 >> 3) & 14) | 384 | ((i3 >> 12) & 112), 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1844590340);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$oXHbwBsZPXSgGZz8nmsoQsXCSfw(str, str2, z, function1, function0, function02, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        androidx.compose.runtime.Composer composer2;
        final boolean z5;
        final boolean z6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(361138009);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(moneyMovementFiDTO) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
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
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        z5 = z3;
                        z6 = z4;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z7 = i4 != 0 ? false : z3;
                        boolean z8 = i5 != 0 ? false : z4;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(361138009, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SourceCard (AutoSaveManageScreen.kt:519)");
                        }
                        if (z8) {
                            startRestartGroup.startReplaceGroup(-230411256);
                            int i7 = i3 >> 3;
                            com.paypal.oslo.feature.savings.ui.savingshub.SavingsHubErrorTileKt.SavingsHubErrorTile(com.paypal.oslo.feature.savings.domain.model.savingshub.registry.SavingsHubComponentType.Unknown, function02, modifier3, z7, startRestartGroup, (i7 & 112) | 6 | (i7 & 896) | (i7 & 7168), 0);
                            startRestartGroup.endReplaceGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final androidx.compose.ui.Modifier modifier4 = modifier3;
                                final boolean z9 = z7;
                                final boolean z10 = z8;
                                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda36
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$pBe4LMNGFoeJyq15BIftTHyfBdk(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.this, function0, function02, modifier4, z9, z10, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                };
                                endRestartGroup.updateScope(function2);
                                return;
                            }
                            return;
                        }
                        startRestartGroup.startReplaceGroup(-230195031);
                        startRestartGroup.endReplaceGroup();
                        final boolean z11 = z7;
                        androidx.compose.ui.Modifier modifier5 = modifier3;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.CardKt.Card(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, false, null, null, function0, startRestartGroup, (i3 << 15) & 3670016, 31), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-316635201, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda37
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$a3_2hjCxiTos1T1Ty3MwVi_G_AI(z11, moneyMovementFiDTO, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 502);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z5 = z11;
                        z6 = z8;
                        modifier2 = modifier5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda38
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19036$r8$lambda$V95o4rjTTFvjnuKzbli9oZs2Dc(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.this, function0, function02, modifier2, z5, z6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
                z4 = z2;
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z2;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1441280751);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1441280751, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageFooter (AutoSaveManageScreen.kt:620)");
                }
                androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getMANAGE_ACTIONS_ZONE());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, module);
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
                boolean z2 = !z;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_save, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getMANAGE_UPDATE_BUTTON()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.SAVE_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, z2, z, startRestartGroup, ((i4 << 24) & 234881024) | ((i4 >> 3) & 14) | 1769472, 24);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_turn_off, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getMANAGE_REMOVE_SCHEDULE_BUTTON()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.TURN_OFF_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, z2, false, composer2, ((i4 >> 6) & 14) | 1769472, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$iH6A_u3VIXIMunYP0QGB7VT5G2k(z, function0, function02, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AutoSaveManageErrorContent(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-735710632);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-735710632, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageErrorContent (AutoSaveManageScreen.kt:660)");
            }
            com.paypal.pds.core.Icon icon = z ? com.paypal.pds.core.Icon.Warning.INSTANCE : com.paypal.pds.core.Icon.Information.INSTANCE;
            if (z) {
                startRestartGroup.startReplaceGroup(-337092930);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_service_unavailable, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-337011617);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_review_error_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.oslo.feature.savings.ui.basescreen.SavingsAccountErrorScreenKt.SavingsAccountErrorScreen(icon, stringResource, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_retry, startRestartGroup, 0), function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveManageTags.ERROR_CONTENT), null, function02, startRestartGroup, ((i2 << 6) & 7168) | 24576 | ((i2 << 12) & 3670016), 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$_MWdYstAgrEk2M0t61Uz2famuEs(z, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handleNavigateBackEffect(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack navigateBack, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigateBack, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19045$r8$lambda$zDlJ5mr4lwmm6QSwghqQVYVDIw(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ void handleAutoSaveManageEffect$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect autoSaveManageEffect, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState addAdditionalFiFlowState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 64) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$86u2NgdUCUGJTNGqw54VgRVZ2bQ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType) obj2);
                }
            };
        }
        handleAutoSaveManageEffect(autoSaveManageEffect, appNavigator, bottomSheetController, bottomSheetController2, addAdditionalFiFlowState, function0, function1);
    }

    public static final void handleAutoSaveManageEffect(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect autoSaveManageEffect, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState addAdditionalFiFlowState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveManageEffect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addAdditionalFiFlowState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (autoSaveManageEffect instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack) {
            handleNavigateBackEffect((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack) autoSaveManageEffect, appNavigator);
            return;
        }
        if (autoSaveManageEffect instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFrequencySheet) {
            bottomSheetController.showSheet();
            return;
        }
        if (autoSaveManageEffect instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionSheet) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(addAdditionalFiFlowState, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.Idle.INSTANCE)) {
                bottomSheetController2.showSheet();
                return;
            } else {
                if (kotlin.jvm.internal.Intrinsics.areEqual(addAdditionalFiFlowState, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.InProgress.INSTANCE)) {
                    return;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(addAdditionalFiFlowState, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState.Completed.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                function0.invoke();
                return;
            }
        }
        if (autoSaveManageEffect instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateToAddCard) {
            bottomSheetController2.hideSheet();
        } else {
            if (!(autoSaveManageEffect instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function1.invoke(((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.ShowFiSelectionWithToast) autoSaveManageEffect).getToastType());
            bottomSheetController2.showSheet();
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1642906683);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(autoSaveManageUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1642906683, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.TrackAutoSaveManageScreenState (AutoSaveManageScreen.kt:762)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.String rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                if ((autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Initial) || (autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Loading)) {
                    rememberedValue = "loading";
                } else if (autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) {
                    rememberedValue = "content";
                } else {
                    if (!(autoSaveManageUiState instanceof com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    rememberedValue = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Error) autoSaveManageUiState).isNetworkError() ? "error_network" : "error_server";
                }
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.lang.String str = (java.lang.String) rememberedValue;
            boolean changed = startRestartGroup.changed(str);
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$TrackAutoSaveManageScreenState$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$TrackAutoSaveManageScreenState$1$1(str, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19034$r8$lambda$KUQ3QiWol7BMTZaRfxbqgOC8(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handleAddBankResult(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult addBankFlowNavResult, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankFlowNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome outcome = addBankFlowNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) {
            com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome outcome2 = addBankFlowNavResult.getOutcome();
            kotlin.jvm.internal.Intrinsics.checkNotNull(outcome2, "");
            java.util.List<com.paypal.oslo.feature.wallet.api.navigation.result.banks.LinkedBankAccount> linkedBankAccounts = ((com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Success) outcome2).getLinkedBankAccounts();
            function1.invoke(linkedBankAccounts.isEmpty() ? "" : linkedBankAccounts.get(0).getAccountId());
            return;
        }
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Cancelled) {
            function02.invoke();
        } else {
            if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.Outcome.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function0.invoke();
        }
    }

    /* renamed from: $r8$lambda$0KidwhldMSCy33Aik-o86YZ8mCw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19024$r8$lambda$0KidwhldMSCy33Aiko86YZ8mCw(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i) {
        if (i == 0) {
            function1.invoke("10");
        } else if (i == 1) {
            function1.invoke("50");
        } else if (i == 2) {
            function1.invoke("150");
        } else if (i == 3) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2PuaMeUA0hWRzmTdWw5Fhs2d4-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19026$r8$lambda$2PuaMeUA0hWRzmTdWw5Fhs2d40(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.showFiSelection();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7DHlhO_Lo2DS6If-V2Qc5-YN4kg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19027$r8$lambda$7DHlhO_Lo2DS6IfV2Qc5YN4kg(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.savings.di.navigation.AutoSaveInfoSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$86u2NgdUCUGJTNGqw54VgRVZ2bQ(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType fiToastType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiToastType, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B-VGqknEaeHIgSIQnxrd0bLCOp8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19028$r8$lambda$BVGqknEaeHIgSIQnxrd0bLCOp8(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.onOtherAmountClick();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B0CVpEd47il-MyFFIUnOyeHaC-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19029$r8$lambda$B0CVpEd47ilMyFFIUnOyeHaCw(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.onBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CjuszGExPlUx97x9VE5YGO7-HS4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19030$r8$lambda$CjuszGExPlUx97x9VE5YGO7HS4(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.onAmountDisplayClick();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ETatEUV83J_-25DCMWR3b43qzWQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19031$r8$lambda$ETatEUV83J_25DCMWR3b43qzWQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-932323499);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-932323499, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenPreview (AutoSaveManageScreen.kt:856)");
            }
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready ready = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready(new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO("goal-123", "Vacation Fund", "goal_icon", "$250.50", "$5,000.00", 0.05d, true, false, (com.paypal.oslo.feature.savings.domain.model.TransferSettingsData) null, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, false, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, 3968, (kotlin.jvm.internal.DefaultConstructorMarker) null), "50", "150.00", null, null, kotlin.collections.CollectionsKt.emptyList(), false, false, false, true, false, false, null, 7616, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda22
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19033$r8$lambda$JXp2gk3_LnlGEaNxKRYa8idens((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue7;
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) rememberedValue8;
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) rememberedValue9;
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            composer2 = startRestartGroup;
            AutoSaveManageReadyContent(ready, function0, function1, function02, function03, function04, function05, function06, function07, function08, (kotlin.jvm.functions.Function0) rememberedValue10, startRestartGroup, 920350128, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19031$r8$lambda$ETatEUV83J_25DCMWR3b43qzWQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FcHt33QS-y0JNCW6ZQcWHbDhZ1Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19032$r8$lambda$FcHt33QSy0JNCW6ZQcWHbDhZ1Y(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState) {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel.refreshFinancialInstruments$default(autoSaveManageViewModel, ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready) autoSaveManageUiState).getLastAddedFiId(), false, 2, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JXp2gk3_LnlGE-aNxKRYa8idens, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19033$r8$lambda$JXp2gk3_LnlGEaNxKRYa8idens(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KUQ3QiWol-7BMT-ZaRfxbqgOC-8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19034$r8$lambda$KUQ3QiWol7BMTZaRfxbqgOC8(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState autoSaveManageUiState, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(autoSaveManageUiState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MIm080V-faiurDpIFEidlZzg6nI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19035$r8$lambda$MIm080VfaiurDpIFEidlZzg6nI(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageUiState.Ready ready, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, kotlin.jvm.functions.Function0 function06, kotlin.jvm.functions.Function0 function07, kotlin.jvm.functions.Function0 function08, kotlin.jvm.functions.Function0 function09, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoSaveManageReadyContent(ready, function0, function1, function02, function03, function04, function05, function06, function07, function08, function09, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NBrhxJ3n1QSEft92jysCpCIKMq0(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2028647387, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SourceCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AutoSaveManageScreen.kt:554)");
            }
            if (moneyMovementFiDTO != null) {
                composer.startReplaceGroup(949540244);
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.fiselection.FiSelectionComponentsKt.FiImage(moneyMovementFiDTO, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(949620007);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TSl6SzKonh42JQjdRqN9f4KiXR4(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        autoSaveManageViewModel.onAmountSelected(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$StMIIP_tzcCBIdDhj_18YqK8K0k(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String displayName;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(853265931, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SourceCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AutoSaveManageScreen.kt:577)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            if (moneyMovementFiDTO == null) {
                composer.startReplaceGroup(-440447830);
                composer.endReplaceGroup();
                displayName = null;
            } else {
                composer.startReplaceGroup(1648359991);
                displayName = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTOKt.getDisplayName(moneyMovementFiDTO, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_fi_selection_paypal_balance, composer, 0));
                composer.endReplaceGroup();
            }
            if (displayName == null) {
                displayName = "";
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(displayName, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
            if (moneyMovementFiDTO == null) {
                composer.startReplaceGroup(-440055866);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-440055865);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.utility.FisUtilityKt.getFiSubText(moneyMovementFiDTO, composer, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
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

    /* renamed from: $r8$lambda$V9-5o4rjTTFvjnuKzbli9oZs2Dc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19036$r8$lambda$V95o4rjTTFvjnuKzbli9oZs2Dc(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(moneyMovementFiDTO, function0, function02, modifier, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VK42vT2AvPuVozre0GXA9jecnss(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyMovementFiDTO, "");
        autoSaveManageViewModel.onFiSelected(moneyMovementFiDTO);
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VtijitOL0WGR8O-Gk2ht2Y3X1b4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19037$r8$lambda$VtijitOL0WGR8OGk2ht2Y3X1b4(int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoSaveManageLoadingContent(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WC_NUPAXXFuM_0ZZkWzEYtwIJmE(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.markAddFiFlowInProgress();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WxSxa787lolYYmsmmNty2eV0Ihk(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        mutableState2.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XruQnHH16pEm27dPszrOmz8x-6U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19038$r8$lambda$XruQnHH16pEm27dPszrOmz8x6U(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.retry();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yg3kfEHH6EG1VHCjGSEXHFNu0yQ(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1599007779, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageReadyContent.<anonymous>.<anonymous> (AutoSaveManageScreen.kt:332)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZxNM80TqGs1jj0AtLkHQZaww2CI(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_2KDZhdJURsSZq43uaSMGIkLalk(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.m19027$r8$lambda$7DHlhO_Lo2DS6IfV2Qc5YN4kg((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_MWdYstAgrEk2M0t61Uz2famuEs(boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        AutoSaveManageErrorContent(z, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a3_2hjCxiTos1T1Ty3MwVi_G_AI(boolean z, final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-316635201, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SourceCard.<anonymous> (AutoSaveManageScreen.kt:535)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 54);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, weight$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            if (moneyMovementFiDTO != null || z) {
                composer.startReplaceGroup(1853677172);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 11, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1710paddingqDBjuR0$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor3);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2028647387, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$NBrhxJ3n1QSEft92jysCpCIKMq0(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 3120, 1);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1854145179);
                composer.endReplaceGroup();
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, z, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.ComposableSingletons$AutoSaveManageScreenKt.INSTANCE.getLambda$1197882352$savings_prodRelease(), composer, 3120, 1);
            if (moneyMovementFiDTO != null || z) {
                composer.startReplaceGroup(-349138911);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
                com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(853265931, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$StMIIP_tzcCBIdDhj_18YqK8K0k(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 3120, 1);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-347935739);
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, com.paypal.pds.components.ShimmerStyle.Rounded.INSTANCE, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(638301398, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageScreenKt.$r8$lambda$hs6Sj58zRGaj00YcM6AmBVWHPGk(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3120, 1);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eoiKoX3EGsBEVln7h8Q7bXjwD9U(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.onBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hs6Sj58zRGaj00YcM6AmBVWHPGk(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(638301398, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.SourceCard.<anonymous>.<anonymous>.<anonymous> (AutoSaveManageScreen.kt:603)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_review_change, composer, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, composer, 1769472, 412);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hyMfF-XtQnKZWIWJEkvPY1wZqaE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19039$r8$lambda$hyMfFXtQnKZWIWJEkvPY1wZqaE(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iH6A_u3VIXIMunYP0QGB7VT5G2k(boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(z, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ivh-8BVxEWSFUp8wE0VqrjZdssk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19040$r8$lambda$ivh8BVxEWSFUp8wE0VqrjZdssk(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, java.lang.String str) {
        autoSaveManageViewModel.onTurnOffAutoSave(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k8BiHhNv3k5oRRPElfYJgBKIbxw(java.lang.String str, java.lang.String str2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(str, str2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$khYiygScNxkvH0uQ5kOddPZFRHE(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        autoSaveManageViewModel.onCustomAmountSave(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kpjw7SSw7fppOAIwTj6agU7GKjM(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.onCustomAmountCancel();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oXHbwBsZPXSgGZz8nmsoQsXCSfw(java.lang.String str, java.lang.String str2, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(str, str2, z, function1, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pBe4LMNGFoeJyq15BIftTHyfBdk(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(moneyMovementFiDTO, function0, function02, modifier, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wiJOSR85orbfOknqoNF0OJdPWwA(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoSaveManageScreen(goalSummaryDTO, autoSaveManageViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xC8KSqH-S1Bo-dnKf6UpQ5WhDb4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19042$r8$lambda$xC8KSqHS1BodnKf6UpQ5WhDb4(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencySelectionState, "");
        autoSaveManageViewModel.onFrequencySelected(frequencySelectionState);
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.String access$AutoSaveManageScreen$lambda$5(androidx.compose.runtime.MutableState mutableState) {
        return (java.lang.String) mutableState.getValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xnHjmZL3tYZh9sNHgO_dTI8bf0Y(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel) {
        autoSaveManageViewModel.onFrequencyClick();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yknnbUZqJul_qhjGSepCH3P1i-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19043$r8$lambda$yknnbUZqJul_qhjGSepCH3P1iM(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageViewModel autoSaveManageViewModel, java.lang.String str) {
        autoSaveManageViewModel.onSave(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zDlJ5mr4lwmm6QSwghq-QVYVDIw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19045$r8$lambda$zDlJ5mr4lwmm6QSwghqQVYVDIw(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveManageEffect.NavigateBack navigateBack, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult result = navigateBack.getResult();
        if (result instanceof com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Success) {
            navigationScope.goBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.success(((com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Success) result).getMessage()));
        } else if (result instanceof com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Error) {
            navigationScope.goBackWithResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.error(((com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Error) result).getMessage()));
        } else {
            if (!(result instanceof com.paypal.oslo.feature.savings.navigation.result.AutoSaveManageNavResult.Back)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            navigationScope.goBack();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleAddCardResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = addCardFlowNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) {
            function1.invoke(((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) outcome).getCard().getId());
            return;
        }
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) {
            function0.invoke();
            return;
        }
        if (!(outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason reason = ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled) outcome).getReason();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(reason, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        function02.invoke();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState access$AutoSaveManageScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AddAdditionalFiFlowState) state.getValue();
    }
}
