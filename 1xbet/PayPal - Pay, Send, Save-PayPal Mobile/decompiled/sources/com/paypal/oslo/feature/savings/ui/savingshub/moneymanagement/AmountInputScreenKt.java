package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u001a]\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0018\u001ag\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010!\u001ao\u0010\"\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00172\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00050\u000b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0003¢\u0006\u0002\u0010(\u001a\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0017H\u0002\u001a\"\u0010+\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\tH\u0002\u001a#\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0003¢\u0006\u0002\u00100\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u00061²\u0006\n\u0010#\u001a\u00020\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u001a\u001a\u00020$X\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u008a\u008e\u0002"}, d2 = {"MaxAmountInputLength", "", "MaxAmountLimit", "", "AmountInputScreen", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "selectedGoal", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "onSubmit", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputSubmitData;", "onCancel", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "showAvailableAmount", "", "viewModel", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputViewModel;", "(Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputViewModel;Landroidx/compose/runtime/Composer;II)V", "getScreenTitle", "", "(Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "AmountInputContent", "customAmount", "frequencyState", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "validationError", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/ValidationError;", "onFrequencyClick", "onAutoSaveInfoClick", "(Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;ZLcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/ValidationError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AmountInputBottomSection", "selectedAmount", "Landroidx/compose/ui/text/input/TextFieldValue;", "submitButtonText", "onAmountSelect", "onAmountChange", "(Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Ljava/lang/String;Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/ValidationError;Landroidx/compose/runtime/Composer;II)V", "parseCurrencyString", "currencyString", "validateAmount", "amount", "AmountInputTopBar", "title", "onBackClick", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AmountInputScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AmountInputScreen(final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final boolean z2;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z3;
        int i6;
        int i7;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel3;
        int i8;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i9;
        androidx.compose.runtime.SnapshotMutationPolicy snapshotMutationPolicy;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        ?? r1;
        java.lang.String stringResource;
        final com.paypal.pds.components.BottomSheetController bottomSheetController2;
        int i10;
        int i11;
        androidx.compose.runtime.MutableState mutableState;
        java.lang.String str;
        androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        java.lang.String str2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel4;
        java.lang.Object obj;
        int i12;
        final androidx.compose.runtime.MutableState mutableState4;
        boolean z4;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel5;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2132557504);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(moneyManagementFlowType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(goalSummaryDTO) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z2 = z;
            } else {
                z2 = z;
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                }
            }
            if ((i & 1572864) != 0) {
                amountInputViewModel2 = amountInputViewModel;
                i3 |= ((i2 & 64) == 0 && startRestartGroup.changedInstance(amountInputViewModel2)) ? 1048576 : 524288;
            } else {
                amountInputViewModel2 = amountInputViewModel;
            }
            i5 = i3;
            if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    z3 = z2;
                    amountInputViewModel3 = amountInputViewModel2;
                    i6 = 4;
                    i8 = i5;
                    i7 = 2;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier5 = i13 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    z3 = i4 != 0 ? true : z2;
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
                        i7 = 2;
                        i6 = 4;
                        i5 &= -3670017;
                        amountInputViewModel3 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        i6 = 4;
                        i7 = 2;
                        amountInputViewModel3 = amountInputViewModel2;
                    }
                    i8 = i5;
                    modifier4 = modifier5;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2132557504, i8, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreen (AmountInputScreen.kt:101)");
                }
                final com.paypal.oslo.core.navigation.AppNavigator appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, i7, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.MutableState mutableState5 = (androidx.compose.runtime.MutableState) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.ui.text.input.TextFieldValue("0", androidx.compose.ui.text.TextRangeKt.TextRange(1), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, i7, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.MutableState mutableState6 = (androidx.compose.runtime.MutableState) rememberedValue2;
                int i14 = i8 & 14;
                boolean z5 = i14 == i6;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    if (moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE) {
                        java.time.LocalDate currentDate = com.paypal.oslo.feature.savings.util.DateTimeHandlerImpl.INSTANCE.getCurrentDate();
                        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.WEEKLY;
                        java.time.DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayOfWeek, "");
                        rememberedValue3 = new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState(frequencyType, dayOfWeek, currentDate);
                    } else {
                        rememberedValue3 = null;
                    }
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) rememberedValue3;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i9 = 2;
                    snapshotMutationPolicy = null;
                    rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(frequencySelectionState, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    i9 = 2;
                    snapshotMutationPolicy = null;
                }
                final androidx.compose.runtime.MutableState mutableState7 = (androidx.compose.runtime.MutableState) rememberedValue4;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i9, snapshotMutationPolicy);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.MutableState mutableState8 = (androidx.compose.runtime.MutableState) rememberedValue5;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController3 = (com.paypal.pds.components.BottomSheetController) rememberedValue6;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    bottomSheetController = bottomSheetController3;
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1690542461, i14, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.getScreenTitle (AmountInputScreen.kt:211)");
                } else {
                    bottomSheetController = bottomSheetController3;
                }
                int i15 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.WhenMappings.$EnumSwitchMapping$0[moneyManagementFlowType.ordinal()];
                if (i15 == 1) {
                    r1 = 0;
                    startRestartGroup.startReplaceGroup(-1113662283);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (i15 == 2 || i15 == 3) {
                    r1 = 0;
                    startRestartGroup.startReplaceGroup(-1113657387);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_add_money, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (i15 == 4 || i15 == 5) {
                    startRestartGroup.startReplaceGroup(-1113652321);
                    r1 = 0;
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_transfer_money_from, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1113664281);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_review, startRestartGroup, r1);
                androidx.compose.runtime.MutableState mutableState9 = mutableState7;
                java.lang.String str3 = stringResource;
                java.lang.String frequencyDisplayText = com.paypal.oslo.feature.savings.common.FrequencyDisplayUtilsKt.getFrequencyDisplayText((com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) mutableState9.getValue(), r1, startRestartGroup, r1, 2);
                com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState2 = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) mutableState9.getValue();
                boolean changedInstance = startRestartGroup.changedInstance(amountInputViewModel3);
                boolean z6 = (i8 & 896) == 256;
                boolean changed = startRestartGroup.changed(frequencyDisplayText);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (((changedInstance | z6) || changed) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    bottomSheetController2 = bottomSheetController;
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel7 = amountInputViewModel3;
                    i10 = 1;
                    i11 = i14;
                    mutableState = mutableState6;
                    str = str3;
                    mutableState2 = mutableState8;
                    mutableState3 = mutableState5;
                    str2 = frequencyDisplayText;
                    amountInputViewModel4 = amountInputViewModel3;
                    obj = null;
                    i12 = 4;
                    rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$AmountInputScreen$1$1(amountInputViewModel7, function1, frequencyDisplayText, mutableState7, null);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                } else {
                    str = str3;
                    mutableState = mutableState6;
                    bottomSheetController2 = bottomSheetController;
                    mutableState3 = mutableState5;
                    str2 = frequencyDisplayText;
                    amountInputViewModel4 = amountInputViewModel3;
                    i11 = i14;
                    mutableState2 = mutableState8;
                    obj = null;
                    i10 = 1;
                    i12 = 4;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(str2, frequencySelectionState2, goalSummaryDTO, (kotlin.jvm.functions.Function2) rememberedValue7, startRestartGroup, (i8 << 3) & 896);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, i10, obj);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i10, obj), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, windowInsetsPadding);
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
                getHighSpeedVideoFpsRanges(str, function0, startRestartGroup, (i8 >> 6) & 112);
                final androidx.compose.runtime.MutableState mutableState10 = mutableState;
                androidx.compose.runtime.MutableState mutableState11 = mutableState10;
                java.lang.String text = ((androidx.compose.ui.text.input.TextFieldValue) mutableState11.getValue()).getText();
                com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState3 = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) mutableState9.getValue();
                androidx.compose.runtime.MutableState mutableState12 = mutableState2;
                androidx.compose.runtime.MutableState mutableState13 = mutableState12;
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError) mutableState13.getValue();
                boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$g6Yf9Nah79h1JnCySAR1Qe7AU3I(com.paypal.pds.components.BottomSheetController.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue8;
                boolean changed2 = startRestartGroup.changed(appNavigator);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.m18991$r8$lambda$MqQVRXGsvTWySmFvUqRYne33E(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                int i16 = i8;
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel8 = amountInputViewModel4;
                androidx.compose.ui.Modifier modifier6 = modifier4;
                int i17 = i12;
                getHighSpeedVideoFpsRanges(moneyManagementFlowType, goalSummaryDTO, text, frequencySelectionState3, z3, validationError, function02, (kotlin.jvm.functions.Function0) rememberedValue9, androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, (i8 & 126) | ((i8 >> 3) & 57344), 0);
                final androidx.compose.runtime.MutableState mutableState14 = mutableState3;
                java.lang.String str4 = (java.lang.String) mutableState14.getValue();
                androidx.compose.ui.text.input.TextFieldValue textFieldValue = (androidx.compose.ui.text.input.TextFieldValue) mutableState11.getValue();
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    mutableState4 = mutableState12;
                    rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$W8QJWFMj3YVyyM_WB1uph34hNCU(androidx.compose.runtime.MutableState.this, mutableState10, mutableState4, (java.lang.String) obj2);
                        }
                    };
                    composer2 = startRestartGroup;
                    composer2.updateRememberedValue(rememberedValue10);
                } else {
                    composer2 = startRestartGroup;
                    mutableState4 = mutableState12;
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue10;
                java.lang.Object rememberedValue11 = composer2.rememberedValue();
                if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.m18992$r8$lambda$fP06nTbtQjYyKYZTTPQaI3BQT4(androidx.compose.runtime.MutableState.this, mutableState14, mutableState4, (androidx.compose.ui.text.input.TextFieldValue) obj2);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue11);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue11;
                int i18 = i11;
                boolean z7 = i18 == i17;
                if ((i16 & 112) == 32) {
                    amountInputViewModel5 = amountInputViewModel8;
                    z4 = true;
                } else {
                    z4 = false;
                    amountInputViewModel5 = amountInputViewModel8;
                }
                boolean changedInstance3 = composer2.changedInstance(amountInputViewModel5);
                java.lang.Object rememberedValue12 = composer2.rememberedValue();
                if (((z4 | z7) || changedInstance3) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel9 = amountInputViewModel5;
                    amountInputViewModel6 = amountInputViewModel5;
                    java.lang.Object obj2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$rIxpMHjKEDLVmQ1DJpugQ1rVx1M(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.this, goalSummaryDTO, amountInputViewModel9, mutableState10, mutableState4);
                        }
                    };
                    composer2.updateRememberedValue(obj2);
                    rememberedValue12 = obj2;
                } else {
                    amountInputViewModel6 = amountInputViewModel5;
                }
                getHighSpeedVideoFpsRanges(moneyManagementFlowType, str4, textFieldValue, stringResource2, function12, function13, (kotlin.jvm.functions.Function0) rememberedValue12, (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError) mutableState13.getValue(), composer2, i18 | 221184, 0);
                composer2.endNode();
                if (moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY || moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE || moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL) {
                    composer2.startReplaceGroup(87362546);
                    boolean changedInstance4 = composer2.changedInstance(bottomSheetController2);
                    java.lang.Object rememberedValue13 = composer2.rememberedValue();
                    if (changedInstance4 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$Nq4OHarzV6YtZy7YUf8zhu8sxTc(com.paypal.pds.components.BottomSheetController.this, mutableState7, (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) obj3);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue13;
                    boolean changedInstance5 = composer2.changedInstance(bottomSheetController2);
                    java.lang.Object rememberedValue14 = composer2.rememberedValue();
                    if (changedInstance5 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$sTg5IIBtOyLHHEwE4GEsNhJXvfc(com.paypal.pds.components.BottomSheetController.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.FrequencySelectionHalfSheetKt.FrequencySelectionHalfSheet(bottomSheetController2, function14, (kotlin.jvm.functions.Function0) rememberedValue14, moneyManagementFlowType != com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE, (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) mutableState9.getValue(), composer2, com.paypal.pds.components.BottomSheetController.$stable, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(87833436);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z2 = z3;
                modifier3 = modifier6;
                amountInputViewModel2 = amountInputViewModel6;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$dO3iradS9eylIidVPUcZWUzCNyE(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.this, goalSummaryDTO, function1, function0, modifier3, z2, amountInputViewModel2, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, final java.lang.String str, final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, final boolean z, final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        java.lang.String str2;
        int i4;
        int i5;
        java.lang.String stringResource;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1199780035);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(moneyManagementFlowType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(goalSummaryDTO) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(frequencySelectionState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(validationError == null ? -1 : validationError.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        int i6 = i2 & 256;
        if (i6 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
        }
        if (!startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1199780035, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputContent (AmountInputScreen.kt:235)");
            }
            java.lang.String frequencyDisplayText = com.paypal.oslo.feature.savings.common.FrequencyDisplayUtilsKt.getFrequencyDisplayText(frequencySelectionState, false, startRestartGroup, ((i3 >> 9) & 14) | 48, 0);
            int i7 = validationError == null ? -1 : com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.WhenMappings.$EnumSwitchMapping$1[validationError.ordinal()];
            if (i7 != -1) {
                if (i7 == 1) {
                    startRestartGroup.startReplaceGroup(1937394917);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_amount_validation_minimum, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (i7 == 2) {
                    startRestartGroup.startReplaceGroup(1937398181);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_amount_validation_maximum, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i7 != 3) {
                        startRestartGroup.startReplaceGroup(1937393330);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1937401797);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_amount_validation_exceeds_available, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                str2 = stringResource;
            } else {
                startRestartGroup.startReplaceGroup(-69975270);
                startRestartGroup.endReplaceGroup();
                str2 = null;
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing56(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AddMoney.INSTANCE.getAMOUNT_INPUT_ZONE()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AmountInputTags.CONTENT);
            androidx.compose.ui.Modifier modifier3 = companion;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
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
            if (moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY) {
                startRestartGroup.startReplaceGroup(-1584034955);
                java.lang.String title = goalSummaryDTO.getTitle();
                com.paypal.pds.core.Typography.HeadingSmall headingSmall = com.paypal.pds.core.Typography.HeadingSmall.INSTANCE;
                i4 = 0;
                i5 = 8388608;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(title, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), com.paypal.pds.core.ConstantsKt.getSpacing4(), 2, null), com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags.MoneyManagement.GOAL_TITLE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, headingSmall, startRestartGroup, 384, 6, 1000);
                startRestartGroup.endReplaceGroup();
            } else {
                i4 = 0;
                i5 = 8388608;
                startRestartGroup.startReplaceGroup(-1583625259);
                startRestartGroup.endReplaceGroup();
            }
            java.lang.String str3 = str;
            if (str3.length() == 0) {
                str3 = "0";
            }
            com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(str3, "USD", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags.MoneyManagement.AMOUNT_DISPLAY), com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Compact.INSTANCE, null, null, null, com.paypal.pds.core.Typography.DisplayLarge.INSTANCE, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, null, null, null, null, null, false, startRestartGroup, 113249712, 0, 32368);
            if (str2 != null) {
                startRestartGroup.startReplaceGroup(-1583076218);
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags.MoneyManagement.VALIDATION_ALERT), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1582744363);
                startRestartGroup.endReplaceGroup();
            }
            if (z) {
                startRestartGroup.startReplaceGroup(-1582611559);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_amount_available, new java.lang.Object[]{goalSummaryDTO.getCurrentAmountFormatted()}, startRestartGroup, i4), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags.MoneyManagement.AVAILABLE_AMOUNT), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1582267211);
                startRestartGroup.endReplaceGroup();
            }
            if (moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY || moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE || moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL) {
                startRestartGroup.startReplaceGroup(-1581950670);
                androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AddMoney.INSTANCE.getFREQUENCY_ZONE());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i4));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, module);
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
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommonKt.FrequencySelector(frequencyDisplayText, function0, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), startRestartGroup, (i3 >> 15) & 112, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, i4);
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                int i8 = (i3 & 29360128) == i5 ? 1 : i4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (i8 != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$ni9Cty8pEt8zpY8SqQ3CgT6CHI0(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion2, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6, 31), com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags.MoneyManagement.AUTO_SAVE_INFO);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i4));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_about_auto_save, startRestartGroup, i4), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelSmall.INSTANCE, startRestartGroup, 384, 6, 1018);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, i4);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Information.INSTANCE, null, null, com.paypal.pds.components.IconSize.XSmall.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27702, 4);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1580471691);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$LSmavn2yIJf4Z2QsB8Y0Mqu_sjk(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.this, goalSummaryDTO, str, frequencySelectionState, z, validationError, function0, function02, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, final java.lang.String str, final androidx.compose.ui.text.input.TextFieldValue textFieldValue, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError3;
        float f;
        int i5;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-986990045);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(moneyManagementFlowType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(textFieldValue) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        int i7 = i2 & 128;
        int i8 = 12582912;
        if (i7 == 0) {
            if ((12582912 & i) == 0) {
                i8 = startRestartGroup.changed(validationError == null ? -1 : validationError.ordinal()) ? 8388608 : 4194304;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                validationError2 = validationError;
            } else {
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError4 = i7 != 0 ? null : validationError;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-986990045, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputBottomSection (AmountInputScreen.kt:350)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AmountInputTags.BOTTOM_SECTION);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getBottom(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
                if (moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY || moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE) {
                    startRestartGroup.startReplaceGroup(620748876);
                    androidx.compose.ui.Modifier align = columnScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4(), com.paypal.pds.core.ConstantsKt.getSpacing2()), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally());
                    int i9 = ((i4 >> 9) & 112) | ((i4 >> 3) & 14);
                    validationError3 = validationError4;
                    f = 0.0f;
                    i5 = i4;
                    i6 = 1;
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommonKt.QuickAmountSelector(str, function1, align, validationError4 == com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.Camera2StreamConfigurationMap, startRestartGroup, i9, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(621126549);
                    startRestartGroup.endReplaceGroup();
                    validationError3 = validationError4;
                    i5 = i4;
                    i6 = 1;
                    f = 0.0f;
                }
                float f2 = f;
                com.paypal.oslo.core.commonui.components.NumericKeyboardKt.AmountKeyboard(textFieldValue, function12, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, i6, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.oslo.feature.savings.constants.SavingsConstants.AccessibilityTags.MoneyManagement.NUMERIC_KEYPAD), false, true, 7, startRestartGroup, ((i5 >> 6) & 14) | 221184 | ((i5 >> 12) & 112), 8);
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, i6, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), f2, 2, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyManagementCommonKt.MoneyManagementFooter(str2, function0, null, true, composer2, ((i5 >> 9) & 14) | 3072 | ((i5 >> 15) & 112), 4);
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                validationError2 = validationError3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.m18990$r8$lambda$GGBJBPNpKd_rPi6vtA_poQDg(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.this, str, textFieldValue, str2, function1, function12, function0, validationError2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= i8;
        i4 = i3;
        if (startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final double Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.String replace = new kotlin.text.Regex("[^0-9.]").replace(str, "");
        try {
            if (replace.length() == 0) {
                return 0.0d;
            }
            return java.lang.Double.parseDouble(replace);
        } catch (java.lang.NumberFormatException unused) {
            return 0.0d;
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1747127482);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1747127482, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputTopBar (AmountInputScreen.kt:470)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16()), "amount_input_top_bar");
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
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_back_content_description, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AddMoney.INSTANCE.getBACK_BUTTON()), null, null, false, null, null, function0, startRestartGroup, (i3 << 15) & 3670016, 31), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AmountInputTags.TOP_BAR_BACK_BUTTON), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27654, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AmountInputTags.TOP_BAR_TITLE), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1016);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.m18993$r8$lambda$glFbyVGAIoPvbKpq9owOk10UwU(str, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$GG-BJBPNpKd-_r-Pi6vtA_poQDg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18990$r8$lambda$GGBJBPNpKd_rPi6vtA_poQDg(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str, androidx.compose.ui.text.input.TextFieldValue textFieldValue, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(moneyManagementFlowType, str, textFieldValue, str2, function1, function12, function0, validationError, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LSmavn2yIJf4Z2QsB8Y0Mqu_sjk(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, boolean z, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(moneyManagementFlowType, goalSummaryDTO, str, frequencySelectionState, z, validationError, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MqQVRXGsvT-WySmFvUqRYne-33E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18991$r8$lambda$MqQVRXGsvTWySmFvUqRYne33E(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.$r8$lambda$cp9q1Wey2Dl2mMuv9ppeBzLAB2Y((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Nq4OHarzV6YtZy7YUf8zhu8sxTc(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencySelectionState, "");
        mutableState.setValue(frequencySelectionState);
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W8QJWFMj3YVyyM_WB1uph34hNCU(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        java.lang.String trimStart = kotlin.text.StringsKt.trimStart(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        if (trimStart.length() == 0) {
            trimStart = "0";
        }
        java.lang.String str2 = trimStart;
        mutableState2.setValue(new androidx.compose.ui.text.input.TextFieldValue(str2, androidx.compose.ui.text.TextRangeKt.TextRange(str2.length()), (androidx.compose.ui.text.TextRange) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        mutableState3.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cp9q1Wey2Dl2mMuv9ppeBzLAB2Y(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.savings.di.navigation.AutoSaveInfoSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dO3iradS9eylIidVPUcZWUzCNyE(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AmountInputScreen(moneyManagementFlowType, goalSummaryDTO, function1, function0, modifier, z, amountInputViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fP06nTbtQjYyKYZT-TPQaI3BQT4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18992$r8$lambda$fP06nTbtQjYyKYZTTPQaI3BQT4(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, androidx.compose.ui.text.input.TextFieldValue textFieldValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldValue, "");
        mutableState.setValue(textFieldValue);
        mutableState2.setValue("");
        mutableState3.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g6Yf9Nah79h1JnCySAR1Qe7AU3I(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$glFbyVGAIoPvbKpq9owOk10Uw-U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18993$r8$lambda$glFbyVGAIoPvbKpq9owOk10UwU(java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ni9Cty8pEt8zpY8SqQ3CgT6CHI0(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$rIxpMHjKEDLVmQ1DJpugQ1rVx1M(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError;
        java.lang.String text = ((androidx.compose.ui.text.input.TextFieldValue) mutableState.getValue()).getText();
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(text);
        boolean z = moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY || moneyManagementFlowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL;
        if (doubleOrNull == null || doubleOrNull.doubleValue() <= 0.0d) {
            validationError = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.Camera2StreamConfigurationMap;
        } else if (!z || doubleOrNull.doubleValue() < 100000.0d) {
            validationError = (moneyManagementFlowType != com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY || doubleOrNull.doubleValue() <= Camera2StreamConfigurationMap(goalSummaryDTO.getCurrentAmountFormatted())) ? null : com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            validationError = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.getHighSpeedVideoFpsRangesFor;
        }
        mutableState2.setValue(validationError);
        if (validationError == null) {
            amountInputViewModel.onSubmitClick(text, goalSummaryDTO);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sTg5IIBtOyLHHEwE4GEsNhJXvfc(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState access$AmountInputScreen$lambda$8(androidx.compose.runtime.MutableState mutableState) {
        return (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) mutableState.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.DELETE_GOAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.values().length];
            try {
                iArr2[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.Camera2StreamConfigurationMap.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.getHighSpeedVideoFpsRangesFor.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
