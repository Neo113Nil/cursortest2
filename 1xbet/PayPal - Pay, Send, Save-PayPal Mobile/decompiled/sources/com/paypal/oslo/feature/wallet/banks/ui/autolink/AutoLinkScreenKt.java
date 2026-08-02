package com.paypal.oslo.feature.wallet.banks.ui.autolink;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010!X\u008a\u0084\u0002"}, d2 = {"AutoLinkScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "aggregatorName", "", "externalBankId", "countryCode", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.INTEGRATION_TYPE_KEY, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;", "bankName", "bankLogoUrl", "credentialToken", "action", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "bank", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;", "instrumentId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkViewModel;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/IntegrationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Lcom/paypal/oslo/feature/wallet/banks/domain/model/InstantBankConfirmationBankDetails;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkViewModel;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;III)V", "AutoLinkScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "isExitFrictionShown", "", "event", "Lcom/paypal/oslo/feature/wallet/banks/ui/autolink/AutoLinkEvent;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmFlowType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AutoLinkScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoLinkScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, final com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, final java.lang.String str7, final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel2;
        final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        java.lang.Object rememberedValue;
        final androidx.compose.runtime.MutableState mutableState;
        java.lang.Object rememberedValue2;
        boolean changedInstance;
        boolean z;
        boolean z2;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6;
        boolean z9;
        boolean z10;
        boolean z11;
        com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$2$1 rememberedValue3;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel5;
        androidx.compose.runtime.MutableState mutableState2;
        boolean z12;
        boolean changed;
        boolean changedInstance2;
        com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1 rememberedValue4;
        kotlin.coroutines.Continuation continuation;
        java.lang.Object rememberedValue5;
        final androidx.compose.runtime.MutableState mutableState3;
        java.lang.Object rememberedValue6;
        boolean changedInstance3;
        com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$5$1 rememberedValue7;
        boolean changedInstance4;
        java.lang.Object rememberedValue8;
        java.lang.Object rememberedValue9;
        java.lang.Object rememberedValue10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integrationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1679297864);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i7 = 128;
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        int i8 = 1024;
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(integrationType.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changed(str4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(str5) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(str6) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changed(externalBankAccessAction.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= startRestartGroup.changed(instantBankConfirmationBankDetails) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(str7) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(addFIFlow.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4096) == 0 && startRestartGroup.changedInstance(autoLinkViewModel)) {
                i7 = 256;
            }
            i5 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8192) == 0 && startRestartGroup.changedInstance(bankSharedViewModel)) {
                i8 = 2048;
            }
            i5 |= i8;
        }
        int i9 = i5;
        if (startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i9 & 1171) == 1170) ? false : true, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i3 & 4096) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    autoLinkViewModel3 = (com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                    i9 &= -897;
                } else {
                    autoLinkViewModel3 = autoLinkViewModel;
                }
                if ((i3 & 8192) != 0) {
                    java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                    kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                    androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, startRestartGroup, 0);
                    if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    i9 &= -7169;
                    bankSharedViewModel3 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                    int i10 = i9;
                    com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel4 = autoLinkViewModel3;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1679297864, i4, i10, "com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreen (AutoLinkScreen.kt:81)");
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.$r8$lambda$ONclfuASIJRBUIxqwuZ6weqYTo0(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 54, 0);
                    changedInstance = startRestartGroup.changedInstance(autoLinkViewModel4);
                    z = (i4 & 112) != 32;
                    z2 = (i4 & 896) != 256;
                    bankSharedViewModel4 = bankSharedViewModel3;
                    z3 = (i4 & 7168) != 2048;
                    z4 = (57344 & i4) != 16384;
                    z5 = (458752 & i4) != 131072;
                    z6 = (3670016 & i4) != 1048576;
                    z7 = (29360128 & i4) != 8388608;
                    z8 = (234881024 & i4) != 67108864;
                    i6 = i4;
                    z9 = (1879048192 & i4) != 536870912;
                    z10 = (i10 & 14) != 4;
                    z11 = (i10 & 112) != 32;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((!(changedInstance | z | z2 | z3 | z4 | z5 | z6 | z7 | z8 | z9 | z10) && !z11) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        bankSharedViewModel5 = bankSharedViewModel4;
                        mutableState2 = mutableState;
                        z12 = true;
                        rememberedValue3 = new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$2$1(autoLinkViewModel4, str, str2, str3, integrationType, str4, str5, str6, externalBankAccessAction, instantBankConfirmationBankDetails, str7, addFIFlow, null);
                        composer2 = startRestartGroup;
                        composer2.updateRememberedValue(rememberedValue3);
                    } else {
                        mutableState2 = mutableState;
                        composer2 = startRestartGroup;
                        bankSharedViewModel5 = bankSharedViewModel4;
                        z12 = true;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str, str2, str6, (kotlin.jvm.functions.Function2) rememberedValue3, composer2, ((i6 >> 3) & 126) | ((i6 >> 15) & 896));
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(autoLinkViewModel4.getEvents(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer2, 0, 7);
                    com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent autoLinkEvent = (com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent) collectAsStateWithLifecycle.getValue();
                    changed = composer2.changed(collectAsStateWithLifecycle);
                    final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel6 = bankSharedViewModel5;
                    changedInstance2 = composer2.changedInstance(bankSharedViewModel6);
                    if ((i6 & 14) != 4) {
                        z12 = false;
                    }
                    rememberedValue4 = composer2.rememberedValue();
                    if ((!(changed | changedInstance2) && !z12) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        continuation = null;
                        rememberedValue4 = new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1(bankSharedViewModel6, appNavigator, collectAsStateWithLifecycle, null);
                        composer2.updateRememberedValue(rememberedValue4);
                    } else {
                        continuation = null;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(autoLinkEvent, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 0);
                    java.lang.String loaderMessage = com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.getLoaderMessage((com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel6.getConfirmFlowType(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer2, 0, 7).getValue(), composer2, 0);
                    rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        mutableState3 = mutableState2;
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.$r8$lambda$voeeprwKL6eKE59GFEUfZbNQMOU(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    } else {
                        mutableState3 = mutableState2;
                    }
                    com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen(loaderMessage, null, false, (kotlin.jvm.functions.Function0) rememberedValue5, composer2, 3072, 6);
                    rememberedValue6 = composer2.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new com.paypal.pds.components.BottomSheetController();
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue6;
                    boolean booleanValue = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
                    changedInstance3 = composer2.changedInstance(bottomSheetController);
                    rememberedValue7 = composer2.rememberedValue();
                    if (!changedInstance3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$5$1(bottomSheetController, mutableState3, continuation);
                        composer2.updateRememberedValue(rememberedValue7);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, composer2, 0);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, composer2, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_plaid_exit_friction_description, composer2, 0);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, composer2, 0);
                    java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, composer2, 0);
                    com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                    changedInstance4 = composer2.changedInstance(bankSharedViewModel6);
                    rememberedValue8 = composer2.rememberedValue();
                    if (!changedInstance4 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.m20824$r8$lambda$N8VbErSqR7mYUfkPwrKVYKfBYg(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue8);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue8;
                    rememberedValue9 = composer2.rememberedValue();
                    if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.$r8$lambda$DuUh2vqbqGlLmVdxxCGhZozdpes(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue9;
                    rememberedValue10 = composer2.rememberedValue();
                    if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.$r8$lambda$t5b0DX8vZKcQQQWuPgMMM9fuNpI(androidx.compose.runtime.MutableState.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController, stringResource, stringResource2, stringResource3, stringResource4, null, warning, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue10, composer2, com.paypal.pds.components.BottomSheetController.$stable | 907542528, 32);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    autoLinkViewModel2 = autoLinkViewModel4;
                    bankSharedViewModel2 = bankSharedViewModel6;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 4096) != 0) {
                    i9 &= -897;
                }
                if ((i3 & 8192) != 0) {
                    i9 &= -7169;
                }
                autoLinkViewModel3 = autoLinkViewModel;
            }
            bankSharedViewModel3 = bankSharedViewModel;
            int i102 = i9;
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel42 = autoLinkViewModel3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 54, 0);
            changedInstance = startRestartGroup.changedInstance(autoLinkViewModel42);
            if ((i4 & 112) != 32) {
            }
            if ((i4 & 896) != 256) {
            }
            bankSharedViewModel4 = bankSharedViewModel3;
            if ((i4 & 7168) != 2048) {
            }
            if ((57344 & i4) != 16384) {
            }
            if ((458752 & i4) != 131072) {
            }
            if ((3670016 & i4) != 1048576) {
            }
            if ((29360128 & i4) != 8388608) {
            }
            if ((234881024 & i4) != 67108864) {
            }
            i6 = i4;
            if ((1879048192 & i4) != 536870912) {
            }
            if ((i102 & 14) != 4) {
            }
            if ((i102 & 112) != 32) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!(changedInstance | z | z2 | z3 | z4 | z5 | z6 | z7 | z8 | z9 | z10 | z11)) {
            }
            bankSharedViewModel5 = bankSharedViewModel4;
            mutableState2 = mutableState;
            z12 = true;
            rememberedValue3 = new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$2$1(autoLinkViewModel42, str, str2, str3, integrationType, str4, str5, str6, externalBankAccessAction, instantBankConfirmationBankDetails, str7, addFIFlow, null);
            composer2 = startRestartGroup;
            composer2.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, str2, str6, (kotlin.jvm.functions.Function2) rememberedValue3, composer2, ((i6 >> 3) & 126) | ((i6 >> 15) & 896));
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(autoLinkViewModel42.getEvents(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer2, 0, 7);
            com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent autoLinkEvent2 = (com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent) collectAsStateWithLifecycle2.getValue();
            changed = composer2.changed(collectAsStateWithLifecycle2);
            final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel62 = bankSharedViewModel5;
            changedInstance2 = composer2.changedInstance(bankSharedViewModel62);
            if ((i6 & 14) != 4) {
            }
            rememberedValue4 = composer2.rememberedValue();
            if (!(changed | changedInstance2 | z12)) {
            }
            continuation = null;
            rememberedValue4 = new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$3$1(bankSharedViewModel62, appNavigator, collectAsStateWithLifecycle2, null);
            composer2.updateRememberedValue(rememberedValue4);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(autoLinkEvent2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 0);
            java.lang.String loaderMessage2 = com.paypal.oslo.feature.wallet.banks.ui.openbanking.aggregator.plaid.LaunchPlaidFlowKt.getLoaderMessage((com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(bankSharedViewModel62.getConfirmFlowType(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, composer2, 0, 7).getValue(), composer2, 0);
            rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen(loaderMessage2, null, false, (kotlin.jvm.functions.Function0) rememberedValue5, composer2, 3072, 6);
            rememberedValue6 = composer2.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue6;
            boolean booleanValue2 = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
            changedInstance3 = composer2.changedInstance(bottomSheetController2);
            rememberedValue7 = composer2.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue7 = new com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$AutoLinkScreen$5$1(bottomSheetController2, mutableState3, continuation);
            composer2.updateRememberedValue(rememberedValue7);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, composer2, 0);
            java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, composer2, 0);
            java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_plaid_exit_friction_description, composer2, 0);
            java.lang.String stringResource32 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, composer2, 0);
            java.lang.String stringResource42 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_no_continue, composer2, 0);
            com.paypal.pds.core.Icon.Warning warning2 = com.paypal.pds.core.Icon.Warning.INSTANCE;
            changedInstance4 = composer2.changedInstance(bankSharedViewModel62);
            rememberedValue8 = composer2.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.m20824$r8$lambda$N8VbErSqR7mYUfkPwrKVYKfBYg(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                }
            };
            composer2.updateRememberedValue(rememberedValue8);
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue8;
            rememberedValue9 = composer2.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue9;
            rememberedValue10 = composer2.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController2, stringResource5, stringResource22, stringResource32, stringResource42, null, warning2, function03, function022, (kotlin.jvm.functions.Function0) rememberedValue10, composer2, com.paypal.pds.components.BottomSheetController.$stable | 907542528, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            autoLinkViewModel2 = autoLinkViewModel42;
            bankSharedViewModel2 = bankSharedViewModel62;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            autoLinkViewModel2 = autoLinkViewModel;
            bankSharedViewModel2 = bankSharedViewModel;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.$r8$lambda$LkhVYNfK6zmgvL6yRNt9jf80jZY(com.paypal.oslo.core.navigation.AppNavigator.this, str, str2, str3, integrationType, str4, str5, str6, externalBankAccessAction, instantBankConfirmationBankDetails, str7, addFIFlow, autoLinkViewModel2, bankSharedViewModel2, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DuUh2vqbqGlLmVdxxCGhZozdpes(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LkhVYNfK6zmgvL6yRNt9jf80jZY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.banks.domain.model.IntegrationType integrationType, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.InstantBankConfirmationBankDetails instantBankConfirmationBankDetails, java.lang.String str7, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkViewModel autoLinkViewModel, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        AutoLinkScreen(appNavigator, str, str2, str3, integrationType, str4, str5, str6, externalBankAccessAction, instantBankConfirmationBankDetails, str7, addFIFlow, autoLinkViewModel, bankSharedViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N8VbErSqR7mYUfkPwrKV-YKfBYg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20824$r8$lambda$N8VbErSqR7mYUfkPwrKVYKfBYg(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel) {
        bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ONclfuASIJRBUIxqwuZ6weqYTo0(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QlsUyj7ZxpmRhhv9beTToT3P-wc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20825$r8$lambda$QlsUyj7ZxpmRhhv9beTToT3Pwc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(918866802);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(918866802, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenPreview (AutoLinkScreen.kt:164)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen("Linking your bank", null, false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 3078, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkScreenKt.m20825$r8$lambda$QlsUyj7ZxpmRhhv9beTToT3Pwc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t5b0DX8vZKcQQQWuPgMMM9fuNpI(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$voeeprwKL6eKE59GFEUfZbNQMOU(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent access$AutoLinkScreen$lambda$5(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.ui.autolink.AutoLinkEvent) state.getValue();
    }
}
