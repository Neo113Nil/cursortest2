package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000\u001a\u0010\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a'\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a \u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u0018\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\tH\u0000¨\u0006$²\u0006\f\u0010%\u001a\u0004\u0018\u00010\tX\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u008e\u0002"}, d2 = {"SavingsAmountInputScreen", "", "goal", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "modifier", "Landroidx/compose/ui/Modifier;", "preselectedFiType", "", "viewModel", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputViewModel;", "transactionErrorToastManager", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/TransactionErrorToastManager;", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputViewModel;Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/TransactionErrorToastManager;Landroidx/compose/runtime/Composer;II)V", "createReviewDestination", "Lcom/paypal/oslo/feature/savings/di/navigation/SavingsReviewDestination;", "submitData", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AmountInputSubmitData;", "handleNavigateBack", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "handleSubmitToReview", "destination", "reviewRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "handleSubmitToReview-Mpu6F-A", "(Lcom/paypal/oslo/feature/savings/di/navigation/SavingsReviewDestination;Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "handleMoneyManagementSuccess", "result", "Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;", "autoSaveSuccessMessage", "getToastMessageForErrorCode", "context", "Landroid/content/Context;", "errorCode", "savings_prodRelease", "toastMessage", "showToast", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsAmountInputScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsAmountInputScreen(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        int i5;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager2;
        int i6;
        final java.lang.String str3;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel3;
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel4;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager4;
        int i7;
        androidx.compose.ui.Modifier modifier3;
        java.lang.String str4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.String str5;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager5;
        java.lang.String str6;
        androidx.compose.ui.Modifier modifier4;
        int i8;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel5;
        int i9;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager6;
        kotlin.Unit unit;
        java.lang.String str7;
        final androidx.compose.runtime.MutableState mutableState;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        final java.lang.String str8;
        boolean z;
        final java.lang.String str9;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        int i10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(381823142);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(goalSummaryDTO) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(moneyManagementFlowType.ordinal()) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    amountInputViewModel2 = amountInputViewModel;
                    i3 |= startRestartGroup.changedInstance(amountInputViewModel2) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            transactionErrorToastManager2 = transactionErrorToastManager;
                            if (startRestartGroup.changedInstance(transactionErrorToastManager2)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            transactionErrorToastManager2 = transactionErrorToastManager;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        transactionErrorToastManager2 = transactionErrorToastManager;
                    }
                    i6 = i3;
                    if (!startRestartGroup.shouldExecute((i6 & 74899) == 74898, i6 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                            amountInputViewModel4 = amountInputViewModel2;
                            transactionErrorToastManager4 = transactionErrorToastManager2;
                            modifier3 = modifier2;
                            str4 = str2;
                            i7 = i6;
                        } else {
                            androidx.compose.ui.Modifier modifier5 = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            java.lang.String str10 = i4 != 0 ? null : str2;
                            amountInputViewModel4 = i5 != 0 ? null : amountInputViewModel2;
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
                                i6 &= -458753;
                                transactionErrorToastManager4 = ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManagerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManagerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0)).getTransactionErrorToastManager();
                            } else {
                                transactionErrorToastManager4 = transactionErrorToastManager2;
                            }
                            i7 = i6;
                            modifier3 = modifier5;
                            str4 = str10;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(381823142, i7, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreen (SavingsAmountInputScreen.kt:70)");
                        }
                        final com.paypal.oslo.core.navigation.AppNavigator appNavigator = (com.paypal.oslo.core.navigation.AppNavigator) startRestartGroup.consume(com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator());
                        java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                        if (amountInputViewModel4 == null) {
                            startRestartGroup.startReplaceGroup(1859840107);
                            androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                            if (current2 == null) {
                                throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                            }
                            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, 0);
                            if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                            } else {
                                empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                            }
                            str5 = rememberNavResultRequestId;
                            transactionErrorToastManager5 = transactionErrorToastManager4;
                            str6 = str4;
                            modifier4 = modifier3;
                            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel6 = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty2, startRestartGroup, 0, 0);
                            startRestartGroup.endReplaceGroup();
                            amountInputViewModel5 = amountInputViewModel6;
                            i8 = i7;
                        } else {
                            str5 = rememberNavResultRequestId;
                            transactionErrorToastManager5 = transactionErrorToastManager4;
                            str6 = str4;
                            modifier4 = modifier3;
                            i8 = i7;
                            startRestartGroup.startReplaceGroup(1859839704);
                            startRestartGroup.endReplaceGroup();
                            amountInputViewModel5 = amountInputViewModel4;
                        }
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            i9 = 2;
                            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        } else {
                            i9 = 2;
                        }
                        final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, i9, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue2;
                        android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_setup_success_message, startRestartGroup, 0);
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager7 = transactionErrorToastManager5;
                        boolean changedInstance = startRestartGroup.changedInstance(transactionErrorToastManager7);
                        boolean changedInstance2 = startRestartGroup.changedInstance(context);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((changedInstance || changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            transactionErrorToastManager6 = transactionErrorToastManager7;
                            unit = unit2;
                            str7 = stringResource;
                            mutableState = mutableState3;
                            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$SavingsAmountInputScreen$1$1(transactionErrorToastManager7, context, mutableState2, mutableState3, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        } else {
                            transactionErrorToastManager6 = transactionErrorToastManager7;
                            unit = unit2;
                            str7 = stringResource;
                            mutableState = mutableState3;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                        boolean changed = startRestartGroup.changed(str7);
                        boolean changed2 = startRestartGroup.changed(appNavigator);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((changed || changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            navResultManager = null;
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$SavingsAmountInputScreen$2$1(str7, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        } else {
                            navResultManager = null;
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$SavingsAmountInputScreen$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m19019invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m19019invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str11) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
                                    return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str11);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str5, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                        boolean changed3 = startRestartGroup.changed(appNavigator);
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (changed3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt.$r8$lambda$EcgC3RBIalTDki8sNcfASq8Og3s(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                        boolean z2 = (i8 & 112) == 32;
                        if ((i8 & 7168) == 2048) {
                            str8 = str5;
                            z = true;
                        } else {
                            str8 = str5;
                            z = false;
                        }
                        boolean changed4 = startRestartGroup.changed(str8);
                        boolean changed5 = startRestartGroup.changed(appNavigator);
                        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (((z2 | z | changed4) || changed5) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            str9 = str6;
                            rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt.m19017$r8$lambda$nSdJMAcxiJKrP9XWC7VkPwYEk(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.this, str9, str8, appNavigator, (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        } else {
                            str9 = str6;
                        }
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue7;
                        androidx.compose.ui.Modifier modifier6 = modifier4;
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.SavingsAmountInput.SCREEN);
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
                        java.lang.String str11 = str9;
                        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputScreenKt.AmountInputScreen(moneyManagementFlowType, goalSummaryDTO, function1, function0, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), false, amountInputViewModel5, startRestartGroup, ((i8 >> 3) & 14) | 24576 | ((i8 << 3) & 112), 32);
                        java.lang.String str12 = (java.lang.String) mutableState2.getValue();
                        if (str12 == null) {
                            startRestartGroup.startReplaceGroup(-189876499);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-189876498);
                            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                                startRestartGroup.startReplaceGroup(-2054113118);
                                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing56(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing56())), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.SavingsAmountInput.TOAST);
                                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt.$r8$lambda$injIzMzGHM382DrgvnYO8wRPSqs(androidx.compose.runtime.MutableState.this, mutableState2, ((java.lang.Boolean) obj).booleanValue());
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue8);
                                }
                                com.paypal.pds.components.ToastKt.Toast(str12, testTag2, null, (kotlin.jvm.functions.Function1) rememberedValue8, startRestartGroup, 3072, 4);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-2053497644);
                                startRestartGroup.endReplaceGroup();
                            }
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        }
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier6;
                        transactionErrorToastManager3 = transactionErrorToastManager6;
                        amountInputViewModel3 = amountInputViewModel4;
                        str3 = str11;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        str3 = str2;
                        amountInputViewModel3 = amountInputViewModel2;
                        transactionErrorToastManager3 = transactionErrorToastManager2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt.m19016$r8$lambda$ai_5ttGws_0_2fx_G8uCCGrOk(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO.this, moneyManagementFlowType, modifier2, str3, amountInputViewModel3, transactionErrorToastManager3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                amountInputViewModel2 = amountInputViewModel;
                if ((196608 & i) != 0) {
                }
                i6 = i3;
                if (!startRestartGroup.shouldExecute((i6 & 74899) == 74898, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str2 = str;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            amountInputViewModel2 = amountInputViewModel;
            if ((196608 & i) != 0) {
            }
            i6 = i3;
            if (!startRestartGroup.shouldExecute((i6 & 74899) == 74898, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        amountInputViewModel2 = amountInputViewModel;
        if ((196608 & i) != 0) {
        }
        i6 = i3;
        if (!startRestartGroup.shouldExecute((i6 & 74899) == 74898, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination createReviewDestination$default(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData amountInputSubmitData, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return createReviewDestination(amountInputSubmitData, moneyManagementFlowType, str);
    }

    public static final com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination createReviewDestination(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData amountInputSubmitData, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInputSubmitData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
        return new com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination(amountInputSubmitData.getAmount(), amountInputSubmitData.getSelectedGoal(), moneyManagementFlowType, amountInputSubmitData.getFrequencyText(), amountInputSubmitData.getFrequency(), amountInputSubmitData.getStartDate(), str);
    }

    public static final void handleNavigateBack(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt.$r8$lambda$0bRXSyez32i_eMCnQIS_taJazwE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: handleSubmitToReview-Mpu6F-A, reason: not valid java name */
    public static final void m19018handleSubmitToReviewMpu6FA(final com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination savingsReviewDestination, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsReviewDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt.$r8$lambda$n1W2X67dZF8gBLkZ0k30g8U6UXM(com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static final void handleMoneyManagementSuccess(final com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult, final java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementSuccessNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.SavingsAmountInputScreenKt.m19015$r8$lambda$RPAR97ofXuvmprmpDB_O_Mys(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult.this, str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final java.lang.String getToastMessageForErrorCode(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -1757489910:
                if (str.equals("DECLINED_WEEKLY_RETRY_LIMIT_REACHED")) {
                    java.lang.String string = context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_transfer_weekly_limit_reached);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    return string;
                }
                return str;
            case -1021290772:
                if (str.equals("DECLINED_MONTHLY_RECEIVING_LIMIT_REACHED")) {
                    java.lang.String string2 = context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_transfer_monthly_limit_reached);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                    return string2;
                }
                return str;
            case 586361282:
                if (str.equals("DECLINED_WEEKLY_RECEIVING_LIMIT_REACHED")) {
                    java.lang.String string3 = context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_transfer_weekly_limit_reached);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                    return string3;
                }
                return str;
            case 1284843316:
                if (str.equals("DECLINED_MONTHLY_RETRY_LIMIT_REACHED")) {
                    java.lang.String string4 = context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_transfer_monthly_limit_reached);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                    return string4;
                }
                return str;
            default:
                return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult] */
    /* renamed from: $r8$lambda$--RPAR97ofX-uvmprmpDB_O_Mys, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19015$r8$lambda$RPAR97ofXuvmprmpDB_O_Mys(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType flowType = moneyManagementSuccessNavResult.getFlowType();
        com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult2 = moneyManagementSuccessNavResult;
        if (flowType == com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE) {
            moneyManagementSuccessNavResult2 = com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult.INSTANCE.success(str);
        }
        navigationScope.goBackWithResult(moneyManagementSuccessNavResult2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0bRXSyez32i_eMCnQIS_taJazwE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EcgC3RBIalTDki8sNcfASq8Og3s(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        handleNavigateBack(appNavigator);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$a-i_5ttGws_0-_2fx_G8uCCGrOk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19016$r8$lambda$ai_5ttGws_0_2fx_G8uCCGrOk(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputViewModel amountInputViewModel, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.TransactionErrorToastManager transactionErrorToastManager, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsAmountInputScreen(goalSummaryDTO, moneyManagementFlowType, modifier, str, amountInputViewModel, transactionErrorToastManager, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$injIzMzGHM382DrgvnYO8wRPSqs(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, boolean z) {
        if (!z) {
            mutableState.setValue(java.lang.Boolean.FALSE);
            mutableState2.setValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n1W2X67dZF8gBLkZ0k30g8U6UXM(com.paypal.oslo.feature.savings.di.navigation.SavingsReviewDestination savingsReviewDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(savingsReviewDestination);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nSdJMAc-xiJ-KrP9XWC7VkPwYEk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19017$r8$lambda$nSdJMAcxiJKrP9XWC7VkPwYEk(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AmountInputSubmitData amountInputSubmitData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountInputSubmitData, "");
        m19018handleSubmitToReviewMpu6FA(createReviewDestination(amountInputSubmitData, moneyManagementFlowType, str), str2, appNavigator);
        return kotlin.Unit.INSTANCE;
    }
}
