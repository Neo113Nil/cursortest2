package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet;

@kotlin.Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a*\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002\u001a\u001d\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u001a\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u001a6\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\fH\u0002\u001a)\u0010%\u001a\u00020\u00012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u001fH\u0003¢\u0006\u0002\u0010)\u001a\u0010\u0010*\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002\u001a\u001e\u0010+\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0006\u0012\u0004\u0018\u00010.0,2\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¨\u0006/²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\f\u00100\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020'X\u008a\u008e\u0002"}, d2 = {"ManageWalletScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/viewmodel/ManageWalletViewModel;Landroidx/compose/runtime/Composer;II)V", "getToastAnalyticsComponent", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Component;", "toastMessage", "", "walletLockedToast", "walletUnlockedToast", "walletRemovedToast", "TrackStatesAnalytics", "state", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managewallet/mvi/ManageWalletState;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Landroidx/compose/runtime/Composer;I)V", "CenteredLoader", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "getWalletInstruments", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "currentState", "getProvisionedTokenIds", "", "buildConfirmDeviceCallback", "Lkotlin/Function0;", "instrument", "provisionedTokenIds", "starPayClient", "Lcom/paypal/oslo/feature/starpay/api/StarPayClient;", "displayProductName", "ProvisioningRefreshOnResumeEffect", "needsRefresh", "", "onRefresh", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "shouldShowWidget", "getErrorDetails", "Lkotlin/Pair;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "", "debit-card_prodRelease", "cardIdToRemove", "needsRefreshOnResume"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageWalletScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x068e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManageWalletScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i5;
        final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel4;
        int i6;
        com.paypal.oslo.feature.starpay.api.StarPayClient rememberStarPayClient;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.MutableState mutableState2;
        java.lang.Object rememberedValue3;
        final androidx.compose.runtime.MutableState mutableState3;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        java.lang.String stringResource3;
        kotlin.Unit unit;
        boolean changedInstance;
        boolean z;
        boolean changed;
        boolean changed2;
        boolean changed3;
        java.lang.Object rememberedValue4;
        java.lang.String str;
        kotlin.Unit unit2;
        java.lang.String str2;
        androidx.compose.runtime.MutableState mutableState4;
        androidx.compose.runtime.MutableState mutableState5;
        java.lang.String str3;
        final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient;
        boolean changedInstance2;
        boolean changedInstance3;
        java.lang.Object rememberedValue5;
        java.lang.Object rememberedValue6;
        boolean changedInstance4;
        java.lang.Object rememberedValue7;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        androidx.compose.ui.Modifier modifier5;
        java.lang.String str4;
        java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> walletInstruments;
        final java.util.Set<java.lang.String> emptySet;
        final androidx.compose.runtime.MutableState mutableState6;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel5;
        boolean z2;
        boolean z3;
        final androidx.compose.runtime.MutableState mutableState7;
        kotlin.Pair pair;
        final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel6;
        boolean z4;
        androidx.compose.runtime.MutableState mutableState8;
        boolean z5;
        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel7;
        final androidx.compose.runtime.MutableState mutableState9;
        androidx.compose.runtime.MutableState mutableState10;
        java.lang.String str5;
        java.lang.Object rememberedValue8;
        java.lang.String str6;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component wallet_removed_success_toast;
        final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel8;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(679766220);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    manageWalletViewModel2 = manageWalletViewModel;
                    if (startRestartGroup.changedInstance(manageWalletViewModel2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    manageWalletViewModel2 = manageWalletViewModel;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                manageWalletViewModel2 = manageWalletViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    modifier4 = modifier2;
                } else {
                    modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
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
                        i5 = 0;
                        manageWalletViewModel4 = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i6 = i4 & (-897);
                        androidx.compose.ui.Modifier modifier6 = modifier4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(679766220, i6, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreen (ManageWalletScreen.kt:86)");
                        }
                        int i9 = i6;
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(manageWalletViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getUserIntent(manageWalletViewModel4.getProductName());
                        rememberStarPayClient = com.paypal.oslo.feature.starpay.api.StarPayClientProviderKt.rememberStarPayClient(startRestartGroup, i5);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue3;
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_lock_wallet_success, new java.lang.Object[]{com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, startRestartGroup, i5);
                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_unlock_wallet_success, new java.lang.Object[]{manageWalletViewModel4.getDisplayProductName(), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, startRestartGroup, i5);
                        stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_remove_wallet_success, new java.lang.Object[]{manageWalletViewModel4.getDisplayProductName(), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, startRestartGroup, i5);
                        unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(manageWalletViewModel4);
                        int i10 = i9 & 14;
                        z = i10 != 4;
                        changed = startRestartGroup.changed(stringResource);
                        changed2 = startRestartGroup.changed(stringResource2);
                        changed3 = startRestartGroup.changed(stringResource3);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((!(changedInstance | z | changed | changed2) && !changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            str = stringResource2;
                            unit2 = unit;
                            str2 = stringResource;
                            mutableState4 = mutableState2;
                            mutableState5 = mutableState;
                            str3 = stringResource3;
                            starPayClient = rememberStarPayClient;
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1(manageWalletViewModel4, appNavigator, stringResource, str, stringResource3, mutableState5, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        } else {
                            unit2 = unit;
                            str = stringResource2;
                            str2 = stringResource;
                            mutableState4 = mutableState2;
                            mutableState5 = mutableState;
                            str3 = stringResource3;
                            starPayClient = rememberStarPayClient;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        changedInstance2 = startRestartGroup.changedInstance(starPayClient);
                        changedInstance3 = startRestartGroup.changedInstance(manageWalletViewModel4);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!(changedInstance2 | changedInstance3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$2$1(manageWalletViewModel4, starPayClient, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                        getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState) collectAsStateWithLifecycle.getValue(), manageWalletViewModel4.getProductName(), startRestartGroup, 0);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    boolean booleanValue;
                                    booleanValue = ((java.lang.Boolean) androidx.compose.runtime.MutableState.this.getValue()).booleanValue();
                                    return java.lang.Boolean.valueOf(booleanValue);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                        changedInstance4 = startRestartGroup.changedInstance(manageWalletViewModel4);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!changedInstance4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$EH5G0_BN67WAor9K09ulJ_F0xbY(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.this, mutableState3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        getHighSpeedVideoFpsRangesFor(function0, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 6);
                        androidx.compose.ui.Modifier context = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier6, 0.0f, 1, null), kotlin.collections.CollectionsKt.listOf(userIntent));
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context);
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
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        manageWalletState = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState) collectAsStateWithLifecycle.getValue();
                        if (!(manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Initial)) {
                            startRestartGroup.startReplaceGroup(647670224);
                            startRestartGroup.endReplaceGroup();
                            boxScopeInstance = boxScopeInstance2;
                            z2 = true;
                            manageWalletViewModel5 = manageWalletViewModel4;
                            modifier5 = modifier6;
                            str4 = "";
                            mutableState7 = mutableState5;
                            mutableState6 = mutableState4;
                            z3 = false;
                        } else {
                            if (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) {
                                startRestartGroup.startReplaceGroup(647844692);
                                if (((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Loading) manageWalletState).getLoadingType() instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.LoadingType.Screen) {
                                    startRestartGroup.startReplaceGroup(648092134);
                                    com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = manageWalletViewModel4.getProductName();
                                    java.lang.String displayProductName = manageWalletViewModel4.getDisplayProductName();
                                    java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
                                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda19
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.m14451$r8$lambda$HlzNzcBwJ92BgwWc7SLrH7bPEE((com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue9);
                                    }
                                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue9;
                                    java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                                    if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        mutableState9 = mutableState4;
                                        rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$X9xjrXMrVhS0qLmFxu1WRTugakU(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                    } else {
                                        mutableState9 = mutableState4;
                                    }
                                    manageWalletViewModel7 = manageWalletViewModel4;
                                    boxScopeInstance = boxScopeInstance2;
                                    modifier5 = modifier6;
                                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt.ManageWalletContent(appNavigator, productName, displayProductName, emptyList, function1, manageWalletViewModel4, (kotlin.jvm.functions.Function1) rememberedValue10, userIntent, null, false, startRestartGroup, ((i9 << 9) & 458752) | i10 | 1600512 | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 21), com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS);
                                    startRestartGroup.endReplaceGroup();
                                    startRestartGroup = startRestartGroup;
                                } else {
                                    boxScopeInstance = boxScopeInstance2;
                                    manageWalletViewModel7 = manageWalletViewModel4;
                                    modifier5 = modifier6;
                                    mutableState9 = mutableState4;
                                    startRestartGroup.startReplaceGroup(648605308);
                                    startRestartGroup.endReplaceGroup();
                                }
                                getHighSpeedVideoSizes(null, startRestartGroup, 0, 1);
                                startRestartGroup.endReplaceGroup();
                                mutableState8 = mutableState9;
                                str4 = "";
                                manageWalletViewModel6 = manageWalletViewModel7;
                                z4 = false;
                                z5 = true;
                            } else {
                                boxScopeInstance = boxScopeInstance2;
                                final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel9 = manageWalletViewModel4;
                                modifier5 = modifier6;
                                androidx.compose.runtime.MutableState mutableState11 = mutableState4;
                                boolean z6 = manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess;
                                if (z6 || (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess)) {
                                    str4 = "";
                                    startRestartGroup.startReplaceGroup(648818774);
                                    if (z6) {
                                        walletInstruments = ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess) manageWalletState).getWalletInstruments();
                                    } else {
                                        walletInstruments = manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess ? ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess) manageWalletState).getWalletInstruments() : kotlin.collections.CollectionsKt.emptyList();
                                    }
                                    java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument> list = walletInstruments;
                                    boolean z7 = manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess;
                                    boolean z8 = (z7 && kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess) manageWalletState).getWidgetStatus(), com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.WidgetStatus.Failed.INSTANCE)) ? false : true;
                                    if (z6) {
                                        emptySet = ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsSuccess) manageWalletState).getProvisionedTokenIds();
                                    } else if (z7) {
                                        emptySet = ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetSuccess) manageWalletState).getProvisionedTokenIds();
                                    } else {
                                        emptySet = kotlin.collections.SetsKt.emptySet();
                                    }
                                    com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName2 = manageWalletViewModel9.getProductName();
                                    java.lang.String displayProductName2 = manageWalletViewModel9.getDisplayProductName();
                                    boolean changedInstance5 = startRestartGroup.changedInstance(emptySet);
                                    boolean changedInstance6 = startRestartGroup.changedInstance(starPayClient);
                                    boolean changedInstance7 = startRestartGroup.changedInstance(manageWalletViewModel9);
                                    java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                                    if ((changedInstance5 | changedInstance6 | changedInstance7) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$RDLvgei2WVcy2EKphUhPXql_41g(emptySet, starPayClient, manageWalletViewModel9, mutableState3, (com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue11);
                                    }
                                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue11;
                                    java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                                    if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        mutableState6 = mutableState11;
                                        rememberedValue12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$H2YQTOoPPYZkDHg5kSbXoogMZIY(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue12);
                                    } else {
                                        mutableState6 = mutableState11;
                                    }
                                    manageWalletViewModel5 = manageWalletViewModel9;
                                    composer2 = startRestartGroup;
                                    com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.components.ManageWalletContentKt.ManageWalletContent(appNavigator, productName2, displayProductName2, list, function12, manageWalletViewModel9, (kotlin.jvm.functions.Function1) rememberedValue12, userIntent, null, z8, startRestartGroup, (458752 & (i9 << 9)) | i10 | 1572864 | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 21), 256);
                                    if (z6) {
                                        composer2.startReplaceGroup(-1918692106);
                                        z2 = true;
                                        z3 = false;
                                        getHighSpeedVideoSizes(null, composer2, 0, 1);
                                    } else {
                                        z2 = true;
                                        z3 = false;
                                        composer2.startReplaceGroup(650102236);
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endReplaceGroup();
                                    mutableState7 = mutableState5;
                                    mutableState10 = mutableState7;
                                    str5 = (java.lang.String) mutableState10.getValue();
                                    if (str5 == null) {
                                        str5 = str4;
                                    }
                                    if (((java.lang.String) mutableState10.getValue()) != null) {
                                        z3 = z2;
                                    }
                                    rememberedValue8 = composer2.rememberedValue();
                                    if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$1Zll4kNjYFBx_i9RH4K7rjHof2Y(androidx.compose.runtime.MutableState.this);
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue8);
                                    }
                                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue8;
                                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null);
                                    str6 = (java.lang.String) mutableState10.getValue();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(str6, str2)) {
                                        wallet_removed_success_toast = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getWALLET_LOCKED_SUCCESS_TOAST();
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(str6, str)) {
                                        wallet_removed_success_toast = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getWALLET_UNLOCKED_SUCCESS_TOAST();
                                    } else {
                                        wallet_removed_success_toast = kotlin.jvm.internal.Intrinsics.areEqual(str6, str3) ? com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getWALLET_REMOVED_SUCCESS_TOAST() : com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getUNKNOWN_TOAST();
                                    }
                                    com.paypal.oslo.feature.debitcard.shared.ui.components.ShowToastKt.ShowToast(str5, z3, function02, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(m1710paddingqDBjuR0$default, wallet_removed_success_toast), composer2, 384, 0);
                                    composer2.endNode();
                                    if (((java.lang.String) mutableState6.getValue()) != null) {
                                        composer2.startReplaceGroup(151877856);
                                        java.lang.Object rememberedValue13 = composer2.rememberedValue();
                                        if (rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda7
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$eAFqtVjVHrtpdWG1Fl1mkC85dCg(androidx.compose.runtime.MutableState.this);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue13);
                                        }
                                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue13;
                                        java.lang.Object rememberedValue14 = composer2.rememberedValue();
                                        if (rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda15
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$mwaJfYZ2v1cmWqMbSelBP8zVy9I(androidx.compose.runtime.MutableState.this);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue14);
                                        }
                                        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue14;
                                        manageWalletViewModel8 = manageWalletViewModel5;
                                        boolean changedInstance8 = composer2.changedInstance(manageWalletViewModel8);
                                        java.lang.Object rememberedValue15 = composer2.rememberedValue();
                                        if (changedInstance8 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda16
                                                @Override // kotlin.jvm.functions.Function0
                                                public final java.lang.Object invoke() {
                                                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$WNN1y5eqT1YhgUGVYGbUZ8ngGMs(androidx.compose.runtime.MutableState.this, manageWalletViewModel8);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue15);
                                        }
                                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.RemoveWalletBottomSheetKt.RemoveWalletBottomSheet(function03, function04, (kotlin.jvm.functions.Function0) rememberedValue15, userIntent, composer2, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 54);
                                        composer2.endReplaceGroup();
                                    } else {
                                        manageWalletViewModel8 = manageWalletViewModel5;
                                        composer2.startReplaceGroup(152268022);
                                        composer2.endReplaceGroup();
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    manageWalletViewModel3 = manageWalletViewModel8;
                                    modifier3 = modifier5;
                                } else {
                                    boolean z9 = manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError;
                                    if (!z9 && !(manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError) && !(manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) && !(manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError)) {
                                        startRestartGroup.startReplaceGroup(-1918769313);
                                        startRestartGroup.endReplaceGroup();
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    startRestartGroup.startReplaceGroup(650356064);
                                    if (z9) {
                                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError walletInstrumentsError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.WalletInstrumentsError) manageWalletState;
                                        pair = kotlin.TuplesKt.to(walletInstrumentsError.getErrorType(), walletInstrumentsError.getRetryCount());
                                    } else if (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError) {
                                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError pushProvisioningWidgetError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.PushProvisioningWidgetError) manageWalletState;
                                        pair = kotlin.TuplesKt.to(pushProvisioningWidgetError.getErrorType(), pushProvisioningWidgetError.getRetryCount());
                                    } else if (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) {
                                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError lockUnlockError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.LockUnlockError) manageWalletState;
                                        pair = kotlin.TuplesKt.to(lockUnlockError.getErrorType(), lockUnlockError.getRetryCount());
                                    } else if (manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError) {
                                        com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError removeWalletError = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.RemoveWalletError) manageWalletState;
                                        pair = kotlin.TuplesKt.to(removeWalletError.getErrorType(), removeWalletError.getRetryCount());
                                    } else {
                                        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Unexpected ManageWalletState in getErrorDetails", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("stateName", manageWalletState.getName())), null, null, 12, null);
                                        throw new java.lang.IllegalStateException("Unexpected state in getErrorDetails: ".concat(java.lang.String.valueOf(manageWalletState.getName())).toString());
                                    }
                                    com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = (com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType) pair.component1();
                                    java.lang.Integer num = (java.lang.Integer) pair.component2();
                                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                    com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent2 = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getUserIntent(manageWalletViewModel9.getProductName());
                                    manageWalletViewModel6 = manageWalletViewModel9;
                                    boolean changedInstance9 = startRestartGroup.changedInstance(manageWalletViewModel6);
                                    java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                                    if (changedInstance9 || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue16 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.m14453$r8$lambda$c5Eiyb9kPsL8ixQPwufmo05AhE(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.this);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue16);
                                    }
                                    kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue16;
                                    boolean changedInstance10 = startRestartGroup.changedInstance(manageWalletViewModel6);
                                    java.lang.Object rememberedValue17 = startRestartGroup.rememberedValue();
                                    if (changedInstance10 || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue17 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$UYlGmLqjDF4EAvkcLXrzgQ49oF8(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.this);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue17);
                                    }
                                    z4 = false;
                                    mutableState8 = mutableState11;
                                    str4 = "";
                                    z5 = true;
                                    com.paypal.oslo.feature.debitcard.shared.ui.components.DebitErrorScreenKt.DebitErrorScreen(debitErrorType, function05, (kotlin.jvm.functions.Function0) rememberedValue17, userIntent2, fillMaxSize$default, false, num, null, startRestartGroup, (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 9) | 24576, 160);
                                    startRestartGroup.endReplaceGroup();
                                }
                            }
                            manageWalletViewModel5 = manageWalletViewModel6;
                            z3 = z4;
                            z2 = z5;
                            mutableState7 = mutableState5;
                            mutableState6 = mutableState8;
                        }
                        composer2 = startRestartGroup;
                        mutableState10 = mutableState7;
                        str5 = (java.lang.String) mutableState10.getValue();
                        if (str5 == null) {
                        }
                        if (((java.lang.String) mutableState10.getValue()) != null) {
                        }
                        rememberedValue8 = composer2.rememberedValue();
                        if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue8;
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null);
                        str6 = (java.lang.String) mutableState10.getValue();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(str6, str2)) {
                        }
                        com.paypal.oslo.feature.debitcard.shared.ui.components.ShowToastKt.ShowToast(str5, z3, function022, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(m1710paddingqDBjuR0$default2, wallet_removed_success_toast), composer2, 384, 0);
                        composer2.endNode();
                        if (((java.lang.String) mutableState6.getValue()) != null) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        manageWalletViewModel3 = manageWalletViewModel8;
                        modifier3 = modifier5;
                    }
                }
                i5 = 0;
                manageWalletViewModel4 = manageWalletViewModel2;
                i6 = i4;
                androidx.compose.ui.Modifier modifier62 = modifier4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i92 = i6;
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(manageWalletViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent3 = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getUserIntent(manageWalletViewModel4.getProductName());
                rememberStarPayClient = com.paypal.oslo.feature.starpay.api.StarPayClientProviderKt.rememberStarPayClient(startRestartGroup, i5);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue3;
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_lock_wallet_success, new java.lang.Object[]{com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, startRestartGroup, i5);
                stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_unlock_wallet_success, new java.lang.Object[]{manageWalletViewModel4.getDisplayProductName(), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, startRestartGroup, i5);
                stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_remove_wallet_success, new java.lang.Object[]{manageWalletViewModel4.getDisplayProductName(), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardConstants.GOOGLE_PAY}, startRestartGroup, i5);
                unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(manageWalletViewModel4);
                int i102 = i92 & 14;
                if (i102 != 4) {
                }
                changed = startRestartGroup.changed(stringResource);
                changed2 = startRestartGroup.changed(stringResource2);
                changed3 = startRestartGroup.changed(stringResource3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!(changedInstance | z | changed | changed2 | changed3)) {
                }
                str = stringResource2;
                unit2 = unit;
                str2 = stringResource;
                mutableState4 = mutableState2;
                mutableState5 = mutableState;
                str3 = stringResource3;
                starPayClient = rememberStarPayClient;
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1(manageWalletViewModel4, appNavigator, stringResource, str, stringResource3, mutableState5, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(starPayClient);
                changedInstance3 = startRestartGroup.changedInstance(manageWalletViewModel4);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | changedInstance3)) {
                }
                rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$2$1(manageWalletViewModel4, starPayClient, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState) collectAsStateWithLifecycle2.getValue(), manageWalletViewModel4.getProductName(), startRestartGroup, 0);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue6;
                changedInstance4 = startRestartGroup.changedInstance(manageWalletViewModel4);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$EH5G0_BN67WAor9K09ulJ_F0xbY(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel.this, mutableState3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
                getHighSpeedVideoFpsRangesFor(function06, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 6);
                androidx.compose.ui.Modifier context2 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier62, 0.0f, 1, null), kotlin.collections.CollectionsKt.listOf(userIntent3));
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, context2);
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
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                manageWalletState = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState) collectAsStateWithLifecycle2.getValue();
                if (!(manageWalletState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.Initial)) {
                }
                composer2 = startRestartGroup;
                mutableState10 = mutableState7;
                str5 = (java.lang.String) mutableState10.getValue();
                if (str5 == null) {
                }
                if (((java.lang.String) mutableState10.getValue()) != null) {
                }
                rememberedValue8 = composer2.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                kotlin.jvm.functions.Function0 function0222 = (kotlin.jvm.functions.Function0) rememberedValue8;
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default22 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null);
                str6 = (java.lang.String) mutableState10.getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(str6, str2)) {
                }
                com.paypal.oslo.feature.debitcard.shared.ui.components.ShowToastKt.ShowToast(str5, z3, function0222, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(m1710paddingqDBjuR0$default22, wallet_removed_success_toast), composer2, 384, 0);
                composer2.endNode();
                if (((java.lang.String) mutableState6.getValue()) != null) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                manageWalletViewModel3 = manageWalletViewModel8;
                modifier3 = modifier5;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                manageWalletViewModel3 = manageWalletViewModel2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$f_xpoUh9xGJ4B59Fpljmsh6Q26I(com.paypal.oslo.core.navigation.AppNavigator.this, modifier3, manageWalletViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2124112243);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(manageWalletState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2124112243, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.TrackStatesAnalytics (ManageWalletScreen.kt:284)");
            }
            com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntent = com.paypal.oslo.feature.debitcard.shared.analytics.ManageWalletAnalytics.INSTANCE.getUserIntent(debitCardProductName);
            kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(manageWalletState.getClass());
            boolean z = (i2 & 14) == 4;
            boolean changedInstance = startRestartGroup.changedInstance(userIntent);
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$TrackStatesAnalytics$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$TrackStatesAnalytics$1$1(manageWalletState, userIntent, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$wWiMrOLqr9C9ocEgsAPGkjEE3Wg(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState.this, debitCardProductName, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-433095361);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-433095361, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.CenteredLoader (ManageWalletScreen.kt:326)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_WALLET_MANAGEMENT_CENTERED_LOADER);
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
            com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$QjozijyS6j2vxbV7ogy9VMaTYDE(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final kotlin.jvm.functions.Function0<java.lang.Boolean> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-340154578);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-340154578, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ProvisioningRefreshOnResumeEffect (ManageWalletScreen.kt:395)");
            }
            final androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            boolean z = (i2 & 14) == 4;
            boolean z2 = (i2 & 112) == 32;
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleOwner);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.m14454$r8$lambda$ijROyjaR9vpA00kVOWS6xidimE(androidx.view.LifecycleOwner.this, function0, function02, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.m14452$r8$lambda$USLoFMrijyJPt8PPf4DnxKf8w(kotlin.jvm.functions.Function0.this, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Zll4kNjYFBx_i9RH4K7rjHof2Y(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6MfMbiQ_G86Id61nFskpHWLN-6g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14449$r8$lambda$6MfMbiQ_G86Id61nFskpHWLN6g(com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, java.lang.String str, java.lang.String str2) {
        starPayClient.resumePushProvisioning(new com.paypal.oslo.feature.starpay.api.ResumeProvisioningMetaData(str, com.paypal.oslo.feature.starpay.api.CardNetwork.MASTERCARD, com.paypal.oslo.feature.starpay.api.TokenServiceProvider.MASTERCARD, str2));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8CW-KfS23blpcCBpLD4jYM2JYyc, reason: not valid java name */
    public static /* synthetic */ void m14450$r8$lambda$8CWKfS23blpcCBpLD4jYM2JYyc(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME && ((java.lang.Boolean) function0.invoke()).booleanValue()) {
            function02.invoke();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EH5G0_BN67WAor9K09ulJ_F0xbY(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        manageWalletViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RefreshWalletData.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H2YQTOoPPYZkDHg5kSbXoogMZIY(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HlzNzcBwJ92BgwWc7SLrH7bPE-E, reason: not valid java name */
    public static /* synthetic */ kotlin.jvm.functions.Function0 m14451$r8$lambda$HlzNzcBwJ92BgwWc7SLrH7bPEE(com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstrument, "");
        return null;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QjozijyS6j2vxbV7ogy9VMaTYDE(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.jvm.functions.Function0 $r8$lambda$RDLvgei2WVcy2EKphUhPXql_41g(java.util.Set set, final com.paypal.oslo.feature.starpay.api.StarPayClient starPayClient, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, final androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletInstrument, "");
        final java.lang.String displayProductName = manageWalletViewModel.getDisplayProductName();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken token = walletInstrument.getToken();
        final java.lang.String externalReferenceId = token != null ? token.getExternalReferenceId() : null;
        final kotlin.jvm.functions.Function0 function0 = (externalReferenceId == null || !set.contains(externalReferenceId)) ? null : new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.m14449$r8$lambda$6MfMbiQ_G86Id61nFskpHWLN6g(com.paypal.oslo.feature.starpay.api.StarPayClient.this, externalReferenceId, displayProductName);
            }
        };
        if (function0 != null) {
            return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.$r8$lambda$lhI67JRrILke2egZbV9fV5hUjBA(kotlin.jvm.functions.Function0.this, mutableState);
                }
            };
        }
        return null;
    }

    /* renamed from: $r8$lambda$USLoF-MrijyJPt8PPf-4DnxKf8w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14452$r8$lambda$USLoFMrijyJPt8PPf4DnxKf8w(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UYlGmLqjDF4EAvkcLXrzgQ49oF8(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel) {
        manageWalletViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorCloseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$WNN1y5eqT1YhgUGVYGbUZ8ngGMs(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel) {
        java.lang.String str = (java.lang.String) mutableState.getValue();
        if (str != null) {
            manageWalletViewModel.processEvent(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.RemoveWalletClicked(str));
        }
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X9xjrXMrVhS0qLmFxu1WRTugakU(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c5Eiyb9kPsL8ixQPwufmo-05AhE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14453$r8$lambda$c5Eiyb9kPsL8ixQPwufmo05AhE(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel) {
        manageWalletViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEvent.ErrorRetryClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eAFqtVjVHrtpdWG1Fl1mkC85dCg(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f_xpoUh9xGJ4B59Fpljmsh6Q26I(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ManageWalletScreen(appNavigator, modifier, manageWalletViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ijROyjaR9vpA00kVOWS6x-idimE, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m14454$r8$lambda$ijROyjaR9vpA00kVOWS6xidimE(final androidx.view.LifecycleOwner lifecycleOwner, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$$ExternalSyntheticLambda10
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt.m14450$r8$lambda$8CWKfS23blpcCBpLD4jYM2JYyc(kotlin.jvm.functions.Function0.this, function02, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ProvisioningRefreshOnResumeEffect$lambda$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lhI67JRrILke2egZbV9fV5hUjBA(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mwaJfYZ2v1cmWqMbSelBP8zVy9I(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wWiMrOLqr9C9ocEgsAPGkjEE3Wg(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletState manageWalletState, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(manageWalletState, debitCardProductName, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
