package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, d2 = {"TestTagToolBar", "", "WithdrawMoneyReviewScreen", "", "config", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "commonComponents", "Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewViewModel;", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/moneymovement/api/shared/components/CommonComponents;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyReviewViewModel;Landroidx/compose/runtime/Composer;II)V", "WithdrawMoneyReviewScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState;", "showDismissSheet", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WithdrawMoneyReviewScreenKt {
    public static final java.lang.String TestTagToolBar = "test_toolbar";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WithdrawMoneyReviewScreen(final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel4;
        int i5;
        java.lang.String rememberNavResultRequestId;
        boolean z;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        boolean changedInstance;
        java.lang.Object rememberedValue3;
        java.lang.Object rememberedValue4;
        boolean changedInstance2;
        java.lang.Object rememberedValue5;
        java.lang.Object rememberedValue6;
        boolean changedInstance3;
        java.lang.Object rememberedValue7;
        java.lang.Object rememberedValue8;
        boolean changedInstance4;
        boolean z2;
        boolean changed;
        boolean z3;
        java.lang.Object rememberedValue9;
        java.lang.String str;
        boolean z4;
        boolean changedInstance5;
        java.lang.Object rememberedValue10;
        androidx.compose.runtime.SnapshotMutationPolicy snapshotMutationPolicy;
        java.lang.Object rememberedValue11;
        final androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue12;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content content;
        boolean changedInstance6;
        java.lang.Object rememberedValue13;
        boolean changedInstance7;
        java.lang.Object rememberedValue14;
        boolean changedInstance8;
        boolean changed2;
        boolean z5;
        boolean changed3;
        boolean changed4;
        boolean changed5;
        java.lang.Object rememberedValue15;
        final com.paypal.pds.components.BottomSheetController bottomSheetController2;
        boolean z6;
        boolean changedInstance9;
        java.lang.Object rememberedValue16;
        boolean z7;
        java.lang.Object rememberedValue17;
        java.lang.Object rememberedValue18;
        int i6;
        boolean changedInstance10;
        java.lang.Object rememberedValue19;
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawMoneyReviewConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commonComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1875579481);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(withdrawMoneyReviewConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(commonComponents) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    withdrawMoneyReviewViewModel2 = withdrawMoneyReviewViewModel;
                    if (startRestartGroup.changedInstance(withdrawMoneyReviewViewModel2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    withdrawMoneyReviewViewModel2 = withdrawMoneyReviewViewModel;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                withdrawMoneyReviewViewModel2 = withdrawMoneyReviewViewModel;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                withdrawMoneyReviewViewModel3 = withdrawMoneyReviewViewModel2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        withdrawMoneyReviewViewModel4 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                        i5 = i4 & (-458753);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1875579481, i5, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreen (WithdrawMoneyReviewScreen.kt:66)");
                        }
                        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(withdrawMoneyReviewViewModel4.getUiState$wallet_prodRelease(), null, startRestartGroup, 0, 1);
                        rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                        final java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                        final java.lang.String rememberNavResultRequestId3 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                        java.lang.String rememberNavResultRequestId4 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                        int i9 = i5 & 112;
                        z = i9 != 32;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1(appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m21349invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21349invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId4, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                        changedInstance = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$2$1(withdrawMoneyReviewViewModel4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue3;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$$inlined$NavResultEffect-rtGRyWw$2
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m21350invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21350invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                        changedInstance2 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$3$1(withdrawMoneyReviewViewModel4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue5;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$$inlined$NavResultEffect-rtGRyWw$3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m21351invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21351invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
                        changedInstance3 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!changedInstance3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1(withdrawMoneyReviewViewModel4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        kotlin.jvm.functions.Function2 function24 = (kotlin.jvm.functions.Function2) rememberedValue7;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager4 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$$inlined$NavResultEffect-rtGRyWw$4
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m21352invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21352invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId3, resolveNavResultManager4, function24, (kotlin.jvm.functions.Function2) rememberedValue8, startRestartGroup, 3072);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance4 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                        z2 = i9 != 32;
                        changed = startRestartGroup.changed(rememberNavResultRequestId4);
                        z3 = (i5 & 7168) != 2048;
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if ((!(changedInstance4 | z2 | changed) && !z3) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            str = rememberNavResultRequestId;
                            rememberedValue9 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$5$1(withdrawMoneyReviewViewModel4, appNavigator, rememberNavResultRequestId4, function0, null);
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        } else {
                            str = rememberNavResultRequestId;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9, startRestartGroup, 6);
                        java.lang.String balanceId = withdrawMoneyReviewConfig.getBalanceId();
                        z4 = (i5 & 14) != 4;
                        changedInstance5 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                        rememberedValue10 = startRestartGroup.rememberedValue();
                        if ((!z4 && !changedInstance5) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            snapshotMutationPolicy = null;
                            rememberedValue10 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$6$1(withdrawMoneyReviewConfig, withdrawMoneyReviewViewModel4, null);
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        } else {
                            snapshotMutationPolicy = null;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(balanceId, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue10, startRestartGroup, 0);
                        rememberedValue11 = startRestartGroup.rememberedValue();
                        if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        }
                        mutableState = (androidx.compose.runtime.MutableState) rememberedValue11;
                        rememberedValue12 = startRestartGroup.rememberedValue();
                        if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new com.paypal.pds.components.BottomSheetController();
                            startRestartGroup.updateRememberedValue(rememberedValue12);
                        }
                        bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue12;
                        final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig = new com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_bank_or_debit_card, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_bank, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_money_add_fi_bank_subtitle, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_add_fi_card_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_money_add_fi_card_subtitle, startRestartGroup, 0));
                        androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(modifier4), 0.0f, 1, null)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.useNode();
                        } else {
                            startRestartGroup.createNode(constructor);
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState withdrawMoneyUIState = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState) collectAsState.getValue();
                        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState withdrawMoneyUIState2 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState) collectAsState.getValue();
                        content = !(withdrawMoneyUIState2 instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content) ? (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content) withdrawMoneyUIState2 : null;
                        if (content != null || (r1 = content.getAllWithdrawalOptions()) == null) {
                            java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> emptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> list = emptyList;
                        changedInstance6 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                        rememberedValue13 = startRestartGroup.rememberedValue();
                        if (!changedInstance6 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue13 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$7$1$1(withdrawMoneyReviewViewModel4);
                            startRestartGroup.updateRememberedValue(rememberedValue13);
                        }
                        kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue13;
                        changedInstance7 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                        rememberedValue14 = startRestartGroup.rememberedValue();
                        if (!changedInstance7 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$B8w8e9Y7FSdqK9BghkhT7jEFQLw(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue14);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue14;
                        changedInstance8 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                        changed2 = startRestartGroup.changed(addFIConfig);
                        z5 = i9 != 32;
                        changed3 = startRestartGroup.changed(str);
                        changed4 = startRestartGroup.changed(rememberNavResultRequestId2);
                        changed5 = startRestartGroup.changed(rememberNavResultRequestId3);
                        rememberedValue15 = startRestartGroup.rememberedValue();
                        if ((!(changedInstance8 | changed2 | z5 | changed3 | changed4) && !changed5) || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel5 = withdrawMoneyReviewViewModel4;
                            bottomSheetController2 = bottomSheetController;
                            final java.lang.String str2 = str;
                            z6 = false;
                            java.lang.Object obj = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$0gbzoXq6VXhcVVYLAX5VxtM_vjs(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.this, addFIConfig, appNavigator, str2, rememberNavResultRequestId2, rememberNavResultRequestId3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(obj);
                            rememberedValue15 = obj;
                        } else {
                            bottomSheetController2 = bottomSheetController;
                            z6 = false;
                        }
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue15;
                        changedInstance9 = startRestartGroup.changedInstance(bottomSheetController2);
                        rememberedValue16 = startRestartGroup.rememberedValue();
                        if (!changedInstance9 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$40FrEmuc75M5lGaUfW30BNw5jyQ(com.paypal.pds.components.BottomSheetController.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue16);
                        }
                        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue16;
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) kFunction;
                        z7 = i9 != 32 ? true : z6;
                        rememberedValue17 = startRestartGroup.rememberedValue();
                        if (!z7 || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue17 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.m21346$r8$lambda$gOXlW8YfM0ujSvRnXlJ1nj_5A(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue17);
                        }
                        kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue17;
                        rememberedValue18 = startRestartGroup.rememberedValue();
                        if (rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue18 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$07C6StFerpbYrlqeFeFajsEfmyg(androidx.compose.runtime.MutableState.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue18);
                        }
                        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel6 = withdrawMoneyReviewViewModel4;
                        final com.paypal.pds.components.BottomSheetController bottomSheetController3 = bottomSheetController2;
                        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenContentKt.WithdrawMoneyReviewScreenContent(withdrawMoneyUIState, withdrawMoneyReviewConfig, commonComponents, null, function02, function03, function04, function1, function05, list, function0, (kotlin.jvm.functions.Function0) rememberedValue18, startRestartGroup, ((i5 << 3) & 112) | (i5 & 896), ((i5 >> 9) & 14) | 48, 8);
                        startRestartGroup.endNode();
                        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            startRestartGroup = startRestartGroup;
                            i6 = 0;
                            startRestartGroup.startReplaceGroup(-2129234679);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup = startRestartGroup;
                            startRestartGroup.startReplaceGroup(-2130116102);
                            i6 = 0;
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_cancel_this_transaction, startRestartGroup, 0);
                            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_yes_cancel_it, startRestartGroup, 0);
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_back, startRestartGroup, 0);
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            boolean z8 = i9 == 32;
                            java.lang.Object rememberedValue20 = startRestartGroup.rememberedValue();
                            if (z8 || rememberedValue20 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue20 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.m21344$r8$lambda$AjwtGC85jGAydPoXS8HxymQTY(com.paypal.oslo.core.navigation.AppNavigator.this, mutableState);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue20);
                            }
                            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue20;
                            java.lang.Object rememberedValue21 = startRestartGroup.rememberedValue();
                            if (rememberedValue21 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue21 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.m21348$r8$lambda$uVX5Qp9gsCEPg6Fa0N5k1Oo8k(androidx.compose.runtime.MutableState.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue21);
                            }
                            com.paypal.oslo.feature.wallet.fifo.common.ui.DismissTransactionBottomSheetKt.DismissTransactionBottomSheet(stringResource, stringResource2, stringResource3, companion, function06, (kotlin.jvm.functions.Function0) rememberedValue21, startRestartGroup, 199680, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState withdrawMoneyUIState3 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState) collectAsState.getValue();
                        com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content content2 = !(withdrawMoneyUIState3 instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content) ? (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content) withdrawMoneyUIState3 : null;
                        java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_money_ineligible_fi_title, startRestartGroup, i6);
                        java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_transfer_money_ineligible_fi_description, startRestartGroup, i6);
                        java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> ineligibleFundingInstruments = (content2 != null || (withdrawFISection = content2.getWithdrawFISection()) == null) ? null : withdrawFISection.getIneligibleFundingInstruments();
                        java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> emptyList2 = ineligibleFundingInstruments != null ? kotlin.collections.CollectionsKt.emptyList() : ineligibleFundingInstruments;
                        changedInstance10 = startRestartGroup.changedInstance(bottomSheetController3);
                        rememberedValue19 = startRestartGroup.rememberedValue();
                        if (!changedInstance10 || rememberedValue19 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue19 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$6vbV5IAt80mt_70dDUFfWoLL47o(com.paypal.pds.components.BottomSheetController.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue19);
                        }
                        com.paypal.oslo.feature.wallet.fifo.common.IneligibleFundingInstrumentModalKt.IneligibleFundingInstrumentModal(bottomSheetController3, stringResource4, stringResource5, emptyList2, null, (kotlin.jvm.functions.Function0) rememberedValue19, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 16);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        withdrawMoneyReviewViewModel3 = withdrawMoneyReviewViewModel6;
                        modifier3 = modifier4;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    modifier4 = modifier2;
                }
                withdrawMoneyReviewViewModel4 = withdrawMoneyReviewViewModel2;
                i5 = i4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(withdrawMoneyReviewViewModel4.getUiState$wallet_prodRelease(), null, startRestartGroup, 0, 1);
                rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                final java.lang.String rememberNavResultRequestId22 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                final java.lang.String rememberNavResultRequestId32 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                java.lang.String rememberNavResultRequestId42 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                int i92 = i5 & 112;
                if (i92 != 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$1$1(appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function2 function25 = (kotlin.jvm.functions.Function2) rememberedValue;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager5 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId42, resolveNavResultManager5, function25, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
                changedInstance = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$2$1(withdrawMoneyReviewViewModel4, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) rememberedValue3;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, 3072);
                changedInstance2 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$3$1(withdrawMoneyReviewViewModel4, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                kotlin.jvm.functions.Function2 function232 = (kotlin.jvm.functions.Function2) rememberedValue5;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager32 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId22, resolveNavResultManager32, function232, (kotlin.jvm.functions.Function2) rememberedValue6, startRestartGroup, 3072);
                changedInstance3 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$4$1(withdrawMoneyReviewViewModel4, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
                kotlin.jvm.functions.Function2 function242 = (kotlin.jvm.functions.Function2) rememberedValue7;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager42 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId32, resolveNavResultManager42, function242, (kotlin.jvm.functions.Function2) rememberedValue8, startRestartGroup, 3072);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance4 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                if (i92 != 32) {
                }
                changed = startRestartGroup.changed(rememberNavResultRequestId42);
                if ((i5 & 7168) != 2048) {
                }
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!(changedInstance4 | z2 | changed | z3)) {
                }
                str = rememberNavResultRequestId;
                rememberedValue9 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$5$1(withdrawMoneyReviewViewModel4, appNavigator, rememberNavResultRequestId42, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9, startRestartGroup, 6);
                java.lang.String balanceId2 = withdrawMoneyReviewConfig.getBalanceId();
                if ((i5 & 14) != 4) {
                }
                changedInstance5 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!(z4 | changedInstance5)) {
                }
                snapshotMutationPolicy = null;
                rememberedValue10 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$6$1(withdrawMoneyReviewConfig, withdrawMoneyReviewViewModel4, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(balanceId2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue10, startRestartGroup, 0);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue11;
                rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue12;
                final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig2 = new com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_bank_or_debit_card, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_bank, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_money_add_fi_bank_subtitle, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_add_fi_card_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_money_add_fi_card_subtitle, startRestartGroup, 0));
                androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(modifier4), 0.0f, 1, null)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState withdrawMoneyUIState4 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState) collectAsState2.getValue();
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState withdrawMoneyUIState22 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState) collectAsState2.getValue();
                if (!(withdrawMoneyUIState22 instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content)) {
                }
                if (content != null) {
                }
                java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> emptyList3 = kotlin.collections.CollectionsKt.emptyList();
                java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> list2 = emptyList3;
                changedInstance6 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                rememberedValue13 = startRestartGroup.rememberedValue();
                if (!changedInstance6) {
                }
                rememberedValue13 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreen$7$1$1(withdrawMoneyReviewViewModel4);
                startRestartGroup.updateRememberedValue(rememberedValue13);
                kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) rememberedValue13;
                changedInstance7 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                rememberedValue14 = startRestartGroup.rememberedValue();
                if (!changedInstance7) {
                }
                rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$B8w8e9Y7FSdqK9BghkhT7jEFQLw(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue14);
                kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue14;
                changedInstance8 = startRestartGroup.changedInstance(withdrawMoneyReviewViewModel4);
                changed2 = startRestartGroup.changed(addFIConfig2);
                if (i92 != 32) {
                }
                changed3 = startRestartGroup.changed(str);
                changed4 = startRestartGroup.changed(rememberNavResultRequestId22);
                changed5 = startRestartGroup.changed(rememberNavResultRequestId32);
                rememberedValue15 = startRestartGroup.rememberedValue();
                if (!(changedInstance8 | changed2 | z5 | changed3 | changed4 | changed5)) {
                }
                final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel52 = withdrawMoneyReviewViewModel4;
                bottomSheetController2 = bottomSheetController;
                final java.lang.String str22 = str;
                z6 = false;
                java.lang.Object obj2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$0gbzoXq6VXhcVVYLAX5VxtM_vjs(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel.this, addFIConfig2, appNavigator, str22, rememberNavResultRequestId22, rememberNavResultRequestId32);
                    }
                };
                startRestartGroup.updateRememberedValue(obj2);
                rememberedValue15 = obj2;
                kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) rememberedValue15;
                changedInstance9 = startRestartGroup.changedInstance(bottomSheetController2);
                rememberedValue16 = startRestartGroup.rememberedValue();
                if (!changedInstance9) {
                }
                rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$40FrEmuc75M5lGaUfW30BNw5jyQ(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue16);
                kotlin.jvm.functions.Function0 function042 = (kotlin.jvm.functions.Function0) rememberedValue16;
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) kFunction2;
                if (i92 != 32) {
                }
                rememberedValue17 = startRestartGroup.rememberedValue();
                if (!z7) {
                }
                rememberedValue17 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.m21346$r8$lambda$gOXlW8YfM0ujSvRnXlJ1nj_5A(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue17);
                kotlin.jvm.functions.Function0 function052 = (kotlin.jvm.functions.Function0) rememberedValue17;
                rememberedValue18 = startRestartGroup.rememberedValue();
                if (rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel62 = withdrawMoneyReviewViewModel4;
                final com.paypal.pds.components.BottomSheetController bottomSheetController32 = bottomSheetController2;
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenContentKt.WithdrawMoneyReviewScreenContent(withdrawMoneyUIState4, withdrawMoneyReviewConfig, commonComponents, null, function022, function032, function042, function12, function052, list2, function0, (kotlin.jvm.functions.Function0) rememberedValue18, startRestartGroup, ((i5 << 3) & 112) | (i5 & 896), ((i5 >> 9) & 14) | 48, 8);
                startRestartGroup.endNode();
                if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                }
                com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState withdrawMoneyUIState32 = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState) collectAsState2.getValue();
                if (!(withdrawMoneyUIState32 instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content)) {
                }
                java.lang.String stringResource42 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_money_ineligible_fi_title, startRestartGroup, i6);
                java.lang.String stringResource52 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_transfer_money_ineligible_fi_description, startRestartGroup, i6);
                if (content2 != null) {
                }
                if (ineligibleFundingInstruments != null) {
                }
                changedInstance10 = startRestartGroup.changedInstance(bottomSheetController32);
                rememberedValue19 = startRestartGroup.rememberedValue();
                if (!changedInstance10) {
                }
                rememberedValue19 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$6vbV5IAt80mt_70dDUFfWoLL47o(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue19);
                com.paypal.oslo.feature.wallet.fifo.common.IneligibleFundingInstrumentModalKt.IneligibleFundingInstrumentModal(bottomSheetController32, stringResource42, stringResource52, emptyList2, null, (kotlin.jvm.functions.Function0) rememberedValue19, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 16);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                withdrawMoneyReviewViewModel3 = withdrawMoneyReviewViewModel62;
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$dPPSidqDz2_GY1kNJCaGHOIELUo(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig.this, appNavigator, commonComponents, function0, modifier3, withdrawMoneyReviewViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$07C6StFerpbYrlqeFeFajsEfmyg(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0WGpMsqU47gDwmxf0hEPd0Rzsxk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0gbzoXq6VXhcVVYLAX5VxtM_vjs(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel, com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType addFIDestination = withdrawMoneyReviewViewModel.getAddFIDestination(addFIConfig);
        if (addFIDestination instanceof com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddFI) {
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fi.AddFIFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$CFdCeGZRJhtJFYqaBVCZJ5wodEo(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else if (addFIDestination instanceof com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddBank) {
            appNavigator.m11575navigateForResultInternaluBl809w(str2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.m21343$r8$lambda$4I0c54ZHWI1cvhhUnBfFeUA4nQ(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            if (!(addFIDestination instanceof com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddCard)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            appNavigator.m11575navigateForResultInternaluBl809w(str3, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.m21347$r8$lambda$ksm0sEnM2DID6SsC_dCvHkneM(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$40FrEmuc75M5lGaUfW30BNw5jyQ(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4I0c54ZHWI1cvhhUnBfF-eUA4nQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21343$r8$lambda$4I0c54ZHWI1cvhhUnBfFeUA4nQ(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType addFINavigationType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(((com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddBank) addFINavigationType).getDestination());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6vbV5IAt80mt_70dDUFfWoLL47o(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AjwtGC85jGAy-dPoXS8H-xymQTY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21344$r8$lambda$AjwtGC85jGAydPoXS8HxymQTY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$0WGpMsqU47gDwmxf0hEPd0Rzsxk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B8w8e9Y7FSdqK9BghkhT7jEFQLw(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel) {
        withdrawMoneyReviewViewModel.onTransferClick();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CFdCeGZRJhtJFYqaBVCZJ5wodEo(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType addFINavigationType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(((com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddFI) addFINavigationType).getDestination());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$I8iq-DS-eLu0XmUrikSc0P2mn2o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21345$r8$lambda$I8iqDSeLu0XmUrikSc0P2mn2o(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IuqGbVUjvpObR5hkwwhmrtqLd8U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1537239909);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1537239909, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenPreview (WithdrawMoneyReviewScreen.kt:256)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig(50.0d, "", "USD");
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(kotlin.collections.CollectionsKt.emptyList(), null, 2, null);
            com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents = new com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$WithdrawMoneyReviewScreenPreview$1$1
                @Override // com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents
                public final void Header(com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig headerConfig, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData headerData, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderCallbacks headerCallbacks, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer2, int i3) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerConfig, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerData, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerCallbacks, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
                    composer2.startReplaceGroup(143391551);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(143391551, i3, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenPreview.<anonymous>.<no name provided>.Header (WithdrawMoneyReviewScreen.kt:272)");
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                }
            };
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            WithdrawMoneyReviewScreen(withdrawMoneyReviewConfig, appNavigator, commonComponents, (kotlin.jvm.functions.Function0) rememberedValue, null, null, startRestartGroup, 3072, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.$r8$lambda$IuqGbVUjvpObR5hkwwhmrtqLd8U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dPPSidqDz2_GY1kNJCaGHOIELUo(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.moneymovement.api.shared.components.CommonComponents commonComponents, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewViewModel withdrawMoneyReviewViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WithdrawMoneyReviewScreen(withdrawMoneyReviewConfig, appNavigator, commonComponents, function0, modifier, withdrawMoneyReviewViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$gOXlW8YfM--0ujSvRnXlJ1nj_5A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21346$r8$lambda$gOXlW8YfM0ujSvRnXlJ1nj_5A(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyReviewScreenKt.m21345$r8$lambda$I8iqDSeLu0XmUrikSc0P2mn2o((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ks-m0-sEnM2DID6SsC_dCvHkneM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21347$r8$lambda$ksm0sEnM2DID6SsC_dCvHkneM(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType addFINavigationType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(((com.paypal.oslo.feature.wallet.fifo.common.ui.AddFINavigationType.AddCard) addFINavigationType).getDestination());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uVX5Qp9g-sCEPg6Fa0N5-k1Oo8k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21348$r8$lambda$uVX5Qp9gsCEPg6Fa0N5k1Oo8k(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }
}
