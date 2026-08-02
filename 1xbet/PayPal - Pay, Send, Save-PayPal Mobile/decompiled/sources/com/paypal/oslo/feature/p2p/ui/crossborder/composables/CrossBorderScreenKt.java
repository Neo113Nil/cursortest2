package com.paypal.oslo.feature.p2p.ui.crossborder.composables;

@kotlin.Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aø\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2w\u0010\f\u001as\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032d\b\u0002\u0010\u001b\u001a^\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!H\u0001¢\u0006\u0002\u0010\"\u001aí\u0001\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00182\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u00103\u001a\u0002042\u0014\b\u0002\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u00106\u001a\u00020\u00182\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u00107\u001a\u000208H\u0001¢\u0006\u0004\b9\u0010:¨\u0006;²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002"}, d2 = {"CrossBorderScreen", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "", "initialAmount", "sendCurrencyCode", "receiveCurrencyCode", "receiveCurrencyId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "", "onCloseClick", "Lkotlin/Function0;", "onNavigateToReview", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "sendAmount", "amount", "intent", "fxQuoteId", "onNavigateToCurrencyPicker", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/p2p/api/navigation/CurrencyPickerDestination;", "isEditMode", "", "editModeIntent", "initialReceiveAmount", "onDoneClick", "Lkotlin/Function4;", "receiveAmount", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/viewmodels/CrossBorderViewModel;", "amountScreenComponentsOverride", "Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function4;Lcom/paypal/oslo/feature/p2p/ui/crossborder/viewmodels/CrossBorderViewModel;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Landroidx/compose/runtime/Composer;III)V", "CrossBorderScreenContent", "uiState", "Lcom/paypal/oslo/feature/p2p/ui/crossborder/state/CrossBorderUiState;", "amountScreenComponents", "sendFlagPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "receiveFlagPainter", "showSendButton", "showRequestButton", "isSendLoading", "isRequestLoading", "onAmountChange", "onSendCurrencyClick", "onReceiveCurrencyClick", "onSendClick", "onRequestClick", "modifier", "Landroidx/compose/ui/Modifier;", "onReceiveAmountChange", "isEmbeddedMode", "actionButtonPadding", "Landroidx/compose/ui/unit/Dp;", "CrossBorderScreenContent-J_wp3Mo", "(Lcom/paypal/oslo/feature/p2p/ui/crossborder/state/CrossBorderUiState;Lcom/paypal/oslo/feature/moneymovement/api/amount/AmountScreenComponents;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;ZZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;FLandroidx/compose/runtime/Composer;III)V", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossBorderScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:222:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CrossBorderScreen(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.util.List<java.lang.String> list, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function5<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function5, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination, kotlin.Unit> function1, boolean z, java.lang.String str6, java.lang.String str7, kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function4, com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final boolean z2;
        java.lang.String str8;
        java.lang.String str9;
        kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function42;
        com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel2;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function43;
        com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel3;
        java.lang.String str10;
        kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function44;
        com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel4;
        boolean z3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents3;
        int i7;
        kotlin.Unit unit;
        int i8;
        com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel5;
        java.lang.String str11;
        java.util.List<java.lang.String> list2;
        kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function45;
        int i9;
        boolean z4;
        java.lang.String str12;
        final androidx.compose.runtime.State state;
        boolean z5;
        final kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function46;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1882714286);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        int i10 = 1024;
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(str5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function5) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        int i12 = i3 & 1024;
        if (i12 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(str6) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i13 = i3 & 2048;
        if (i13 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(str7) ? 32 : 16;
        }
        int i14 = i5;
        int i15 = i3 & 4096;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i2 & 384) == 0) {
            i14 |= startRestartGroup.changedInstance(function4) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8192) == 0 && startRestartGroup.changedInstance(crossBorderViewModel)) {
                    i10 = 2048;
                }
                i14 |= i10;
            }
            i6 = i3 & 16384;
            if (i6 == 0) {
                i14 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i14 |= startRestartGroup.changedInstance(amountScreenComponents) ? 16384 : 8192;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        boolean z6 = i11 != 0 ? false : z;
                        java.lang.String str13 = i12 != 0 ? "" : str6;
                        java.lang.String str14 = i13 != 0 ? "" : str7;
                        if (i15 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function4
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                        return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$J15b1jazfxH4t4HykFeo2J8O0vg((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) obj4);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function43 = (kotlin.jvm.functions.Function4) rememberedValue;
                        } else {
                            function43 = function4;
                        }
                        if ((i3 & 8192) != 0) {
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
                            crossBorderViewModel3 = (com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            i14 &= -7169;
                        } else {
                            crossBorderViewModel3 = crossBorderViewModel;
                        }
                        str10 = str13;
                        str9 = str14;
                        amountScreenComponents2 = i6 != 0 ? null : amountScreenComponents;
                        function44 = function43;
                        crossBorderViewModel4 = crossBorderViewModel3;
                        z3 = z6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8192) != 0) {
                            i14 &= -7169;
                        }
                        z3 = z;
                        str10 = str6;
                        str9 = str7;
                        function44 = function4;
                        crossBorderViewModel4 = crossBorderViewModel;
                        amountScreenComponents2 = amountScreenComponents;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1882714286, i4, i14, "com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreen (CrossBorderScreen.kt:91)");
                    }
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    if (amountScreenComponents2 == null) {
                        startRestartGroup.startReplaceGroup(37665902);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(context, "");
                            rememberedValue2 = ((com.paypal.oslo.feature.p2p.ui.transfer.AmountScreenComponentsEntryPoint) dagger.hilt.android.EntryPointAccessors.fromActivity((android.app.Activity) context, com.paypal.oslo.feature.p2p.ui.transfer.AmountScreenComponentsEntryPoint.class)).amountScreenComponents();
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        amountScreenComponents3 = (com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents) rememberedValue2;
                    } else {
                        startRestartGroup.startReplaceGroup(-1107164682);
                        startRestartGroup.endReplaceGroup();
                        amountScreenComponents3 = amountScreenComponents2;
                    }
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(crossBorderViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    boolean changedInstance = startRestartGroup.changedInstance(crossBorderViewModel4);
                    boolean z7 = (i4 & 14) == 4;
                    boolean z8 = (i4 & 112) == 32;
                    boolean z9 = (i4 & 896) == 256;
                    boolean z10 = (i4 & 7168) == 2048;
                    boolean z11 = (57344 & i4) == 16384;
                    boolean changedInstance2 = startRestartGroup.changedInstance(list);
                    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function47 = function44;
                    int i16 = i4 & 1879048192;
                    boolean z12 = i16 == 536870912;
                    int i17 = i4;
                    boolean z13 = (i14 & 14) == 4;
                    int i18 = i14;
                    boolean z14 = (i14 & 112) == 32;
                    com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$CrossBorderScreen$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if (((changedInstance | z7 | z8 | z9 | z10 | z11 | changedInstance2 | z12 | z13) || z14) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i7 = i17;
                        unit = unit2;
                        i8 = i18;
                        crossBorderViewModel5 = crossBorderViewModel4;
                        java.lang.String str15 = str10;
                        str11 = str10;
                        list2 = list;
                        function45 = function47;
                        i9 = i16;
                        z4 = z3;
                        str12 = str5;
                        rememberedValue3 = new com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$CrossBorderScreen$2$1(crossBorderViewModel4, str, str2, str3, str4, str5, list, z3, str15, str9, null);
                        composer2 = startRestartGroup;
                        composer2.updateRememberedValue(rememberedValue3);
                    } else {
                        unit = unit2;
                        function45 = function47;
                        composer2 = startRestartGroup;
                        crossBorderViewModel5 = crossBorderViewModel4;
                        i9 = i16;
                        z4 = z3;
                        str11 = str10;
                        i7 = i17;
                        i8 = i18;
                        str12 = str5;
                        list2 = list;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 6);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    final com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel6 = crossBorderViewModel5;
                    boolean changedInstance3 = composer2.changedInstance(crossBorderViewModel6);
                    boolean z15 = (i7 & 29360128) == 8388608;
                    com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$CrossBorderScreen$3$1 rememberedValue4 = composer2.rememberedValue();
                    if ((changedInstance3 | z15) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$CrossBorderScreen$3$1(crossBorderViewModel6, function5, null);
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, 6);
                    androidx.compose.ui.graphics.painter.Painter rememberFlagPainter = com.paypal.pds.core.FlagKt.rememberFlagPainter(kotlin.text.StringsKt.take(str3, 2), com.paypal.pds.core.FlagSize.XSmall.INSTANCE, composer2, com.paypal.pds.core.FlagSize.XSmall.$stable << 3, 0);
                    androidx.compose.ui.graphics.painter.Painter rememberFlagPainter2 = com.paypal.pds.core.FlagKt.rememberFlagPainter(str12, com.paypal.pds.core.FlagSize.XSmall.INSTANCE, composer2, (com.paypal.pds.core.FlagSize.XSmall.$stable << 3) | ((i7 >> 12) & 14), 0);
                    boolean changed = composer2.changed(list2);
                    int i19 = i9;
                    boolean z16 = i19 == 536870912;
                    java.lang.Object rememberedValue5 = composer2.rememberedValue();
                    if ((changed | z16) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = java.lang.Boolean.valueOf(!z4 && (list.isEmpty() || list2.contains(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend)));
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    boolean booleanValue = ((java.lang.Boolean) rememberedValue5).booleanValue();
                    boolean changed2 = composer2.changed(list2);
                    boolean z17 = i19 == 536870912;
                    java.lang.Object rememberedValue6 = composer2.rememberedValue();
                    if ((changed2 | z17) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = java.lang.Boolean.valueOf(!z4 && (list.isEmpty() || list2.contains(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest)));
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    boolean booleanValue2 = ((java.lang.Boolean) rememberedValue6).booleanValue();
                    boolean z18 = ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) collectAsStateWithLifecycle.getValue()).isUpdatingIntent() && kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) collectAsStateWithLifecycle.getValue()).getPendingIntent(), com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend);
                    boolean z19 = ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) collectAsStateWithLifecycle.getValue()).isUpdatingIntent() && kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) collectAsStateWithLifecycle.getValue()).getPendingIntent(), com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest);
                    float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer2, 6), composer2, 0).getBottom() + com.paypal.pds.core.ConstantsKt.getSpacing36());
                    java.lang.Object rememberedValue7 = composer2.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new com.paypal.pds.components.BottomSheetController();
                        composer2.updateRememberedValue(rememberedValue7);
                    }
                    final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue7;
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    if (((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) collectAsStateWithLifecycle.getValue()).isError()) {
                        composer2.startReplaceGroup(-1566463201);
                        boolean changedInstance4 = composer2.changedInstance(crossBorderViewModel6);
                        boolean z20 = (i7 & 3670016) == 1048576;
                        java.lang.Object rememberedValue8 = composer2.rememberedValue();
                        if ((changedInstance4 | z20) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.m17277$r8$lambda$Ah_xlM3IusB0Arau0Ofcbm3Dew(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this, function0);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        com.paypal.oslo.feature.p2p.ui.common.error.InlineNetworkErrorKt.InlineNetworkError((kotlin.jvm.functions.Function0) rememberedValue8, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer2, 48, 0);
                        composer2.endReplaceGroup();
                        state = collectAsStateWithLifecycle;
                        function46 = function45;
                    } else {
                        composer2.startReplaceGroup(-1566111940);
                        com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState crossBorderUiState = (com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) collectAsStateWithLifecycle.getValue();
                        boolean isEditMode = ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) collectAsStateWithLifecycle.getValue()).isEditMode();
                        androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        boolean changedInstance5 = composer2.changedInstance(crossBorderViewModel6);
                        java.lang.Object rememberedValue9 = composer2.rememberedValue();
                        if (changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$ZmniTovXk2Uf1rbXLbQiXFRBbrA(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this, (java.lang.String) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue9);
                        }
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue9;
                        java.lang.Object rememberedValue10 = composer2.rememberedValue();
                        if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit4;
                                    unit4 = kotlin.Unit.INSTANCE;
                                    return unit4;
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue10);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue10;
                        if ((i7 & 234881024) == 67108864) {
                            state = collectAsStateWithLifecycle;
                            z5 = true;
                        } else {
                            state = collectAsStateWithLifecycle;
                            z5 = false;
                        }
                        boolean changed3 = composer2.changed(state);
                        java.lang.Object rememberedValue11 = composer2.rememberedValue();
                        if ((z5 | changed3) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$j9oqx2aGC9b6wTYe0EzXS0OeFEg(kotlin.jvm.functions.Function1.this, state);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue11);
                        }
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue11;
                        boolean changedInstance6 = composer2.changedInstance(crossBorderViewModel6);
                        java.lang.Object rememberedValue12 = composer2.rememberedValue();
                        if (changedInstance6 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$m_WrBwGzryf11EfUWWIgfDz7GUk(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue12);
                        }
                        kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue12;
                        boolean changed4 = composer2.changed(state);
                        boolean changedInstance7 = composer2.changedInstance(bottomSheetController);
                        boolean changedInstance8 = composer2.changedInstance(crossBorderViewModel6);
                        java.lang.Object rememberedValue13 = composer2.rememberedValue();
                        if ((changed4 | changedInstance7 | changedInstance8) || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$JGYtzkkLq1G_UYkFVEHknjioSVI(com.paypal.pds.components.BottomSheetController.this, crossBorderViewModel6, state);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue13);
                        }
                        kotlin.jvm.functions.Function0 function05 = (kotlin.jvm.functions.Function0) rememberedValue13;
                        boolean changedInstance9 = composer2.changedInstance(crossBorderViewModel6);
                        java.lang.Object rememberedValue14 = composer2.rememberedValue();
                        if (changedInstance9 || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue14 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.m17276$r8$lambda$7kykd3pLL9Ve2IV1fPhB3XyNiQ(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this, (java.lang.String) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue14);
                        }
                        kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue14;
                        boolean z21 = (i8 & 896) == 256;
                        boolean changed5 = composer2.changed(state);
                        java.lang.Object rememberedValue15 = composer2.rememberedValue();
                        if ((z21 || changed5) || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            function46 = function45;
                            rememberedValue15 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$Q1ggQ32UFNNDjplSZ8lLVtqNkFA(kotlin.jvm.functions.Function4.this, state);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue15);
                        } else {
                            function46 = function45;
                        }
                        m17282CrossBorderScreenContentJ_wp3Mo(crossBorderUiState, amountScreenComponents3, rememberFlagPainter, rememberFlagPainter2, booleanValue, booleanValue2, z18, z19, function12, function02, function03, function04, function05, function0, fillMaxSize$default2, function13, isEditMode, (kotlin.jvm.functions.Function0) rememberedValue15, m8601constructorimpl, composer2, (androidx.compose.ui.graphics.painter.Painter.$stable << 6) | 805306368 | (androidx.compose.ui.graphics.painter.Painter.$stable << 9), ((i7 >> 9) & 7168) | 24576, 0);
                        if (((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).isUpdatingIntent()) {
                            composer2.startReplaceGroup(-1563732814);
                            androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default3);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayKt.P2pLoadingOverlay(com.paypal.oslo.feature.p2p.ui.components.P2pLoadingOverlayStyle.SemiTransparent.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer2, 54, 0);
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1563371478);
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                    }
                    java.lang.String sendAmount = ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSendAmount();
                    java.lang.String sendCurrencyCode = ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSendCurrencyCode();
                    boolean changed6 = composer2.changed(sendAmount);
                    boolean changed7 = composer2.changed(sendCurrencyCode);
                    java.lang.Object rememberedValue16 = composer2.rememberedValue();
                    if ((changed6 | changed7) || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue16 = crossBorderViewModel6.formatAmountWithCurrency(((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSendAmount(), ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSendCurrencyCode());
                        composer2.updateRememberedValue(rememberedValue16);
                    }
                    java.lang.String str16 = (java.lang.String) rememberedValue16;
                    java.lang.String receiveAmount = ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getReceiveAmount();
                    java.lang.String receiveCurrencyCode = ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getReceiveCurrencyCode();
                    boolean changed8 = composer2.changed(receiveAmount);
                    boolean changed9 = composer2.changed(receiveCurrencyCode);
                    java.lang.Object rememberedValue17 = composer2.rememberedValue();
                    if ((changed8 | changed9) || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue17 = crossBorderViewModel6.formatAmountWithCurrency(((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getReceiveAmount(), ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getReceiveCurrencyCode());
                        composer2.updateRememberedValue(rememberedValue17);
                    }
                    java.lang.String str17 = (java.lang.String) rememberedValue17;
                    boolean changedInstance10 = composer2.changedInstance(crossBorderViewModel6);
                    java.lang.Object rememberedValue18 = composer2.rememberedValue();
                    if (changedInstance10 || rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue18 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.m17281$r8$lambda$zKQchIifc3d9lOPJltvFSS9BKQ(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel.this, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue18);
                    }
                    final kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue18;
                    boolean changed10 = composer2.changed(function14);
                    java.lang.Object rememberedValue19 = composer2.rememberedValue();
                    if (changed10 || rememberedValue19 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue19 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$nvnY5fukSVM1Ousyw8USy1Kyo0o(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue19);
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue19;
                    boolean changed11 = composer2.changed(function14);
                    java.lang.Object rememberedValue20 = composer2.rememberedValue();
                    if (changed11 || rememberedValue20 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue20 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$lrcGPrcbfBrMku5Dfm0cQ9d0UDg(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue20);
                    }
                    kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) rememberedValue20;
                    java.lang.Object rememberedValue21 = composer2.rememberedValue();
                    if (rememberedValue21 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue21 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit4;
                                unit4 = kotlin.Unit.INSTANCE;
                                return unit4;
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue21);
                    }
                    kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function48 = function46;
                    com.paypal.oslo.feature.p2p.ui.components.CurrencyGetPaidBottomSheetKt.CurrencyGetPaidBottomSheet(bottomSheetController, str16, str17, function06, function07, (kotlin.jvm.functions.Function0) rememberedValue21, composer2, com.paypal.pds.components.BottomSheetController.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str8 = str11;
                    function42 = function48;
                    crossBorderViewModel2 = crossBorderViewModel6;
                    z2 = z4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    z2 = z;
                    str8 = str6;
                    str9 = str7;
                    function42 = function4;
                    crossBorderViewModel2 = crossBorderViewModel;
                    amountScreenComponents2 = amountScreenComponents;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.lang.String str18 = str8;
                    final java.lang.String str19 = str9;
                    final kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function49 = function42;
                    final com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel7 = crossBorderViewModel2;
                    final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents4 = amountScreenComponents2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.$r8$lambda$IGVmge1ZEONkDS52u0KylKq0Cn0(str, str2, str3, str4, str5, list, function0, function5, function1, z2, str18, str19, function49, crossBorderViewModel7, amountScreenComponents4, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 3072) == 0) {
        }
        i6 = i3 & 16384;
        if (i6 == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0190  */
    /* renamed from: CrossBorderScreenContent-J_wp3Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17282CrossBorderScreenContentJ_wp3Mo(final com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState crossBorderUiState, final com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, final androidx.compose.ui.graphics.painter.Painter painter, final androidx.compose.ui.graphics.painter.Painter painter2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, boolean z5, kotlin.jvm.functions.Function0<kotlin.Unit> function06, float f, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        final boolean z6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        final float f2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        float f3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        boolean z7;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function16;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crossBorderUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1688345614);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(crossBorderUiState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(amountScreenComponents) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? startRestartGroup.changed(painter2) : startRestartGroup.changedInstance(painter2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changed(z4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changedInstance(function02) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function03) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function04) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function05) ? 2048 : 1024;
        }
        int i9 = i5;
        int i10 = i3 & 16384;
        if (i10 != 0) {
            i9 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i9 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i6 = i3 & 32768;
            if (i6 == 0) {
                i9 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i9 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
            }
            i7 = i3 & 65536;
            if (i7 == 0) {
                i9 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i9 |= startRestartGroup.changed(z5) ? 1048576 : 524288;
            }
            i8 = i3 & 131072;
            if (i8 == 0) {
                i9 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i9 |= startRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
            }
            if ((i2 & 100663296) == 0) {
                i9 |= ((i3 & 262144) == 0 && startRestartGroup.changed(f)) ? 67108864 : 33554432;
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i9) != 38347922, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 262144) != 0) {
                        i9 &= -234881025;
                    }
                    function16 = function12;
                    z7 = z5;
                    function09 = function06;
                    f3 = f;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    if (i6 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.m17280$r8$lambda$fbUyQrCu265cS1yse4CLJgLYPQ((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    boolean z8 = i7 != 0 ? false : z5;
                    if (i8 != 0) {
                        modifier = companion;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        function15 = function14;
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function08 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    } else {
                        modifier = companion;
                        function15 = function14;
                        function08 = function06;
                    }
                    if ((i3 & 262144) != 0) {
                        i9 &= -234881025;
                        function09 = function08;
                        f3 = com.paypal.pds.core.ConstantsKt.getSpacing24();
                    } else {
                        f3 = f;
                        function09 = function08;
                    }
                    z7 = z8;
                    function16 = function15;
                }
                int i11 = i9;
                androidx.compose.ui.Modifier modifier3 = modifier;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    composer3 = startRestartGroup;
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1688345614, i4, i11, "com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenContent (CrossBorderScreen.kt:284)");
                } else {
                    composer3 = startRestartGroup;
                }
                int i12 = i4;
                composer2 = composer3;
                int i13 = i12 >> 6;
                int i14 = i11 << 12;
                int i15 = i12 >> 15;
                com.paypal.oslo.feature.p2p.ui.transfer.composables.TransferScreenContentKt.m17460TransferScreenContentmSLTCI4(new com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.CrossBorder(crossBorderUiState.getSendAmount(), crossBorderUiState.getSendCurrencyCode(), painter, crossBorderUiState.getReceiveAmount(), crossBorderUiState.getReceiveCurrencyCode(), painter2, crossBorderUiState.getExchangeRate(), crossBorderUiState.isLoadingReceiveAmount(), function1, function16, function0, function02, true, crossBorderUiState.getSendMoney(), crossBorderUiState.getReceiveMoney()), amountScreenComponents, z, z2, z7, function03, function04, function09, modifier3, null, function05, z3, z4, crossBorderUiState.getAreButtonsEnabled(), f3, composer2, androidx.compose.ui.graphics.painter.Painter.$stable | androidx.compose.ui.graphics.painter.Painter.$stable | (i12 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & (i11 >> 6)) | (458752 & i14) | (3670016 & i14) | (i11 & 29360128) | (234881024 & i14), ((i11 >> 12) & 57344) | (i15 & 896) | ((i11 >> 9) & 14) | (i15 & 112), 512);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                function13 = function16;
                z6 = z7;
                function07 = function09;
                f2 = f3;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier2 = modifier;
                function13 = function12;
                z6 = z5;
                function07 = function06;
                f2 = f;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.crossborder.composables.CrossBorderScreenKt.m17278$r8$lambda$LL4zg2XsSWlsCAWj7FF5DDk9rQ(com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState.this, amountScreenComponents, painter, painter2, z, z2, z3, z4, function1, function0, function02, function03, function04, function05, modifier2, function13, z6, function07, f2, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i6 = i3 & 32768;
        if (i6 == 0) {
        }
        i7 = i3 & 65536;
        if (i7 == 0) {
        }
        i8 = i3 & 131072;
        if (i8 == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (38347923 & i9) != 38347922, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$7kykd3pLL9V-e2IV1fPhB3XyNiQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17276$r8$lambda$7kykd3pLL9Ve2IV1fPhB3XyNiQ(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        crossBorderViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ReceiveAmountChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ah_xlM3IusB0Arau0O-fcbm3Dew, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17277$r8$lambda$Ah_xlM3IusB0Arau0Ofcbm3Dew(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, kotlin.jvm.functions.Function0 function0) {
        crossBorderViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.ErrorDismissed.INSTANCE);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IGVmge1ZEONkDS52u0KylKq0Cn0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function5 function5, kotlin.jvm.functions.Function1 function1, boolean z, java.lang.String str6, java.lang.String str7, kotlin.jvm.functions.Function4 function4, com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        CrossBorderScreen(str, str2, str3, str4, str5, list, function0, function5, function1, z, str6, str7, function4, crossBorderViewModel, amountScreenComponents, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J15b1jazfxH4t4HykFeo2J8O0vg(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JGYtzkkLq1G_UYkFVEHknjioSVI(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, androidx.compose.runtime.State state) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getReceiveCurrencyCode(), ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSendCurrencyCode())) {
            bottomSheetController.showSheet();
        } else {
            crossBorderViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, false, 2, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L-L4zg2XsSWlsCAWj7FF5DDk9rQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17278$r8$lambda$LL4zg2XsSWlsCAWj7FF5DDk9rQ(com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState crossBorderUiState, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, androidx.compose.ui.graphics.painter.Painter painter, androidx.compose.ui.graphics.painter.Painter painter2, boolean z, boolean z2, boolean z3, boolean z4, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function12, boolean z5, kotlin.jvm.functions.Function0 function06, float f, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m17282CrossBorderScreenContentJ_wp3Mo(crossBorderUiState, amountScreenComponents, painter, painter2, z, z2, z3, z4, function1, function0, function02, function03, function04, function05, modifier, function12, z5, function06, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q1ggQ32UFNNDjplSZ8lLVtqNkFA(kotlin.jvm.functions.Function4 function4, androidx.compose.runtime.State state) {
        function4.invoke(((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSendAmount(), ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getReceiveAmount(), ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getReceiveCurrencyCode(), ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getFxQuoteId());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZmniTovXk2Uf1rbXLbQiXFRBbrA(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        crossBorderViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.SendAmountChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fbUyQrCu26-5cS1yse4CLJgLYPQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17280$r8$lambda$fbUyQrCu265cS1yse4CLJgLYPQ(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j9oqx2aGC9b6wTYe0EzXS0OeFEg(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.State state) {
        function1.invoke(new com.paypal.oslo.feature.p2p.api.navigation.CurrencyPickerDestination(((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getTransferAttemptId(), ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSendAmount(), ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSendCurrencyCode(), (java.util.List) ((com.paypal.oslo.feature.p2p.ui.crossborder.state.CrossBorderUiState) state.getValue()).getSupportedIntents(), false, (java.lang.String) null, false, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lrcGPrcbfBrMku5Dfm0cQ9d0UDg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m_WrBwGzryf11EfUWWIgfDz7GUk(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel) {
        crossBorderViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionSend, false, 2, null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nvnY5fukSVM1Ousyw8USy1Kyo0o(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zKQc-hIifc3d9lOPJltvFSS9BKQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17281$r8$lambda$zKQchIifc3d9lOPJltvFSS9BKQ(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, boolean z) {
        crossBorderViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.crossborder.events.CrossBorderEvent.UpdateAmountAndIntent(com.paypal.oslo.feature.p2p.ui.transfer.TransferScreenKt.IntentActionRequest, z));
        return kotlin.Unit.INSTANCE;
    }
}
