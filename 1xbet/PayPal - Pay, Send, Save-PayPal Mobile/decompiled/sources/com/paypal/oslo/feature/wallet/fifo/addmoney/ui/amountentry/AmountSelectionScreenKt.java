package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001as\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\b0\u00162!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\b0\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\bH\u0001¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\bH\u0001¢\u0006\u0002\u0010 \"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\"²\u0006\n\u0010\u0019\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"TestTagAmountDisplay", "", "TestTagNextButton", "TestTagAmountOptions", "TestTagAmountValidationError", "TestTagToolBar", "TestTagAmountEntryCurrencyRow", "AmountSelectionScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "addMoneyConfig", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "viewModel", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionViewModel;Landroidx/compose/runtime/Composer;II)V", "AmountSelectionScreenContent", "uiState", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState;", "onNextClick", "Lkotlin/Function0;", "onAmountChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "amount", "onErrorAction", "errrorMessage", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AmountSelectionScreenLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "AmountSelectionScreenLoadedPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AmountSelectionScreenKt {
    public static final java.lang.String TestTagAmountDisplay = "paypal_amount_display";
    public static final java.lang.String TestTagAmountEntryCurrencyRow = "amount_entry_currency_row";
    public static final java.lang.String TestTagAmountOptions = "amount_options";
    public static final java.lang.String TestTagAmountValidationError = "amount_validation_error";
    public static final java.lang.String TestTagNextButton = "next_button";
    public static final java.lang.String TestTagToolBar = "tool_bar";

    /* JADX WARN: Removed duplicated region for block: B:102:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AmountSelectionScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel2;
        androidx.compose.runtime.Composer composer2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel3;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.State collectAsStateWithLifecycle;
        boolean changedInstance;
        int i5;
        boolean z;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        boolean changedInstance2;
        boolean z2;
        java.lang.Object rememberedValue4;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        java.lang.Object rememberedValue5;
        boolean z3;
        java.lang.Object rememberedValue6;
        kotlin.Unit unit;
        boolean changedInstance3;
        boolean z4;
        java.lang.String str;
        boolean changed;
        boolean z5;
        boolean changed2;
        java.lang.Object rememberedValue7;
        androidx.compose.runtime.Composer composer3;
        kotlin.Unit unit2;
        boolean z6;
        boolean changedInstance4;
        java.lang.Object rememberedValue8;
        boolean changedInstance5;
        java.lang.Object rememberedValue9;
        java.lang.Object rememberedValue10;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1398881460);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(addMoneyConfig) : startRestartGroup.changedInstance(addMoneyConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                amountSelectionViewModel2 = amountSelectionViewModel;
                if (startRestartGroup.changedInstance(amountSelectionViewModel2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                amountSelectionViewModel2 = amountSelectionViewModel;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            amountSelectionViewModel2 = amountSelectionViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
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
                com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel4 = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i3 & (-897);
                amountSelectionViewModel3 = amountSelectionViewModel4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1398881460, i4, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreen (AmountSelectionScreen.kt:121)");
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("0", null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(amountSelectionViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                java.lang.String rememberNavResultRequestId2 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
                changedInstance = startRestartGroup.changedInstance(amountSelectionViewModel3);
                i5 = i4 & 14;
                z = i5 != 4;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1(amountSelectionViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m21269invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21269invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
                changedInstance2 = startRestartGroup.changedInstance(amountSelectionViewModel3);
                z2 = i5 != 4;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if ((!changedInstance2 && !z2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager = null;
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$2$1(amountSelectionViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    navResultManager = null;
                }
                kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) rememberedValue4;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m21270invokehN0UB1M(navResultManager2, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m21270invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2, java.lang.String str2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager2, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                            return navResultManager2.m11582getScopedResultFlowInternalDpEMydE(str2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId2, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
                z3 = i5 != 4;
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$vvXU2MTYVt9_qlUNz6TwgNkgDLE(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0, 1);
                unit = kotlin.Unit.INSTANCE;
                changedInstance3 = startRestartGroup.changedInstance(amountSelectionViewModel3);
                if (i5 != 4) {
                    str = rememberNavResultRequestId;
                    z4 = true;
                } else {
                    z4 = false;
                    str = rememberNavResultRequestId;
                }
                changed = startRestartGroup.changed(str);
                z5 = (i4 & 112) != 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(addMoneyConfig));
                changed2 = startRestartGroup.changed(rememberNavResultRequestId2);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if ((!(changedInstance3 | z4 | changed | z5) && !changed2) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    composer3 = startRestartGroup;
                    unit2 = unit;
                    z6 = false;
                    rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1(amountSelectionViewModel3, appNavigator, str, rememberNavResultRequestId2, mutableState, addMoneyConfig, null);
                    composer3.updateRememberedValue(rememberedValue7);
                } else {
                    composer3 = startRestartGroup;
                    unit2 = unit;
                    z6 = false;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, composer3, 6);
                androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer3, 48, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer3, 6));
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, z6 ? 1 : 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, z6 ? 1 : 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, windowInsetsPadding);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error) {
                    composer3.startReplaceGroup(-220381817);
                    com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.WalletTopBar(new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1543833893, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$mz7A2Bz_eqt0gYhOSYF8xSPyyZM(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, composer3, 54), null, null, 6, null), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "tool_bar"), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), composer3, z6 ? 1 : 0, z6 ? 1 : 0);
                    composer3.endReplaceGroup();
                } else {
                    composer3.startReplaceGroup(-219404480);
                    composer3.endReplaceGroup();
                }
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getBottomCenter(), z6);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, z6 ? 1 : 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (!composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState amountSelectionState = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState) collectAsStateWithLifecycle.getValue();
                changedInstance4 = composer3.changedInstance(amountSelectionViewModel3);
                rememberedValue8 = composer3.rememberedValue();
                if (!changedInstance4 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21263$r8$lambda$TroD6GG5qwMqyy1fO9iN7Kldew(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel.this);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue8;
                changedInstance5 = composer3.changedInstance(amountSelectionViewModel3);
                rememberedValue9 = composer3.rememberedValue();
                if (!changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21267$r8$lambda$eOB8cs3c8vXJgS1h4kAtbNkzI(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel.this, (java.lang.String) obj);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue9);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue9;
                if (i5 == 4) {
                    z6 = true;
                }
                rememberedValue10 = composer3.rememberedValue();
                if (!z6 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$vFoMK22PtDVfIabePEPtHWLQJkI(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue10);
                }
                composer2 = composer3;
                amountSelectionViewModel2 = amountSelectionViewModel3;
                AmountSelectionScreenContent(amountSelectionState, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue10, null, composer2, 0, 16);
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = i3;
            amountSelectionViewModel3 = amountSelectionViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
            collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(amountSelectionViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.String rememberNavResultRequestId3 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            java.lang.String rememberNavResultRequestId22 = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(startRestartGroup, 0);
            changedInstance = startRestartGroup.changedInstance(amountSelectionViewModel3);
            i5 = i4 & 14;
            if (i5 != 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance | z)) {
            }
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$1$1(amountSelectionViewModel3, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) rememberedValue2;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId3, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 3072);
            changedInstance2 = startRestartGroup.changedInstance(amountSelectionViewModel3);
            if (i5 != 4) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!(changedInstance2 | z2)) {
            }
            navResultManager = null;
            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$2$1(amountSelectionViewModel3, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) rememberedValue4;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, startRestartGroup, 0);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId22, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, 3072);
            if (i5 != 4) {
            }
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$vvXU2MTYVt9_qlUNz6TwgNkgDLE(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue6);
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0, 1);
            unit = kotlin.Unit.INSTANCE;
            changedInstance3 = startRestartGroup.changedInstance(amountSelectionViewModel3);
            if (i5 != 4) {
            }
            changed = startRestartGroup.changed(str);
            if ((i4 & 112) != 32) {
            }
            changed2 = startRestartGroup.changed(rememberNavResultRequestId22);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!(changedInstance3 | z4 | changed | z5 | changed2)) {
            }
            composer3 = startRestartGroup;
            unit2 = unit;
            z6 = false;
            rememberedValue7 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1(amountSelectionViewModel3, appNavigator, str, rememberNavResultRequestId22, mutableState2, addMoneyConfig, null);
            composer3.updateRememberedValue(rememberedValue7);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, composer3, 6);
            androidx.compose.ui.Modifier windowInsetsPadding2 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer3, 48, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getNavigationBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, composer3, 6));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, z6 ? 1 : 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, z6 ? 1 : 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, windowInsetsPadding2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer3.startReusableNode();
            if (!composer3.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error) {
            }
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getBottomCenter(), z6);
            int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, z6 ? 1 : 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer3.startReusableNode();
            if (!composer3.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState amountSelectionState2 = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState) collectAsStateWithLifecycle.getValue();
            changedInstance4 = composer3.changedInstance(amountSelectionViewModel3);
            rememberedValue8 = composer3.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21263$r8$lambda$TroD6GG5qwMqyy1fO9iN7Kldew(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel.this);
                }
            };
            composer3.updateRememberedValue(rememberedValue8);
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue8;
            changedInstance5 = composer3.changedInstance(amountSelectionViewModel3);
            rememberedValue9 = composer3.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21267$r8$lambda$eOB8cs3c8vXJgS1h4kAtbNkzI(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel.this, (java.lang.String) obj);
                }
            };
            composer3.updateRememberedValue(rememberedValue9);
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue9;
            if (i5 == 4) {
            }
            rememberedValue10 = composer3.rememberedValue();
            if (!z6) {
            }
            rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$vFoMK22PtDVfIabePEPtHWLQJkI(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj);
                }
            };
            composer3.updateRememberedValue(rememberedValue10);
            composer2 = composer3;
            amountSelectionViewModel2 = amountSelectionViewModel3;
            AmountSelectionScreenContent(amountSelectionState2, function02, function12, (kotlin.jvm.functions.Function1) rememberedValue10, null, composer2, 0, 16);
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$hLGBO0MMEEFr_T_DBZqEy5VI7Do(com.paypal.oslo.core.navigation.AppNavigator.this, addMoneyConfig, amountSelectionViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AmountSelectionScreenContent(final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState amountSelectionState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance;
        java.lang.String str;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountSelectionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-841711384);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(amountSelectionState) ? 4 : 2) | i;
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
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-841711384, i4, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenContent (AmountSelectionScreen.kt:288)");
                }
                if (amountSelectionState instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading) {
                    startRestartGroup.startReplaceGroup(-1404447797);
                    androidx.compose.ui.Modifier modifier6 = modifier5;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.AddMoneyReviewScreenKt.TestTagLoaderSpinner);
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
                    com.paypal.pds.components.LoaderKt.Loader(null, com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, com.paypal.pds.components.LoaderSize.Large.$stable << 3, 13);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                    modifier4 = modifier6;
                } else {
                    androidx.compose.ui.Modifier modifier7 = modifier5;
                    if (amountSelectionState instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error) {
                        startRestartGroup.startReplaceGroup(-1404065784);
                        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error error = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Error) amountSelectionState;
                        final java.lang.String asString = com.paypal.oslo.feature.wallet.common.ui.UiTextKt.asString(error.getErrorMessage(), startRestartGroup, 0);
                        com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                        java.lang.String asString2 = com.paypal.oslo.feature.wallet.common.ui.UiTextKt.asString(error.getErrorDesc(), startRestartGroup, 0);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_ok, startRestartGroup, 0);
                        int i6 = i4 & 7168;
                        boolean z = i6 == 2048;
                        boolean changed = startRestartGroup.changed(asString);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21265$r8$lambda$__t81hDa0RZTLg4nmEJ8TdccA0(kotlin.jvm.functions.Function1.this, asString);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                        boolean z2 = i6 == 2048;
                        boolean changed2 = startRestartGroup.changed(asString);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((changed2 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$LeIOBsc4SvdBiXm7Qfi0Bc7XrsA(kotlin.jvm.functions.Function1.this, asString);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(warning, asString, asString2, stringResource, true, null, false, function02, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 24582, 96);
                        startRestartGroup.endReplaceGroup();
                        modifier4 = modifier7;
                    } else if (amountSelectionState instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded) {
                        startRestartGroup.startReplaceGroup(-1403358674);
                        androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded loaded = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded) amountSelectionState;
                        com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(loaded.getSelectedAmount(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_currency_code, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "paypal_amount_display"), null, null, null, null, null, null, null, null, null, null, null, false, startRestartGroup, 384, 0, 32760);
                        if (loaded.getAmountValidationError() != null) {
                            startRestartGroup.startReplaceGroup(124645622);
                            columnScopeInstance = columnScopeInstance2;
                            com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(loaded.getAmountValidationError().intValue(), startRestartGroup, 0), columnScopeInstance2.align(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAmountValidationError), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 0);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        } else {
                            startRestartGroup.startReplaceGroup(124645621);
                            startRestartGroup.endReplaceGroup();
                            columnScopeInstance = columnScopeInstance2;
                        }
                        java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_add_currency_code, startRestartGroup, 0);
                        java.lang.String currencyCode = loaded.getCurrencyCode();
                        if (currencyCode != null) {
                            stringResource2 = currencyCode;
                        }
                        try {
                            str = java.util.Currency.getInstance(stringResource2).getDisplayName();
                        } catch (java.lang.IllegalArgumentException unused) {
                            str = stringResource2;
                        }
                        final java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Currency, ".concat(java.lang.String.valueOf(str))), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), com.paypal.pds.core.ConstantsKt.getSpacing24()), "amount_entry_currency_row");
                        boolean changed3 = startRestartGroup.changed(value);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$ZHz9h_3oAUk8OfaBJoWeuiTpaQU(value, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag2, (kotlin.jvm.functions.Function1) rememberedValue3);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clearAndSetSemantics);
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
                        com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.pds.core.FlagKt.rememberFlagPainter(kotlin.text.StringsKt.take(stringResource2, 2), com.paypal.pds.core.FlagSize.Small.INSTANCE, startRestartGroup, com.paypal.pds.core.FlagSize.Small.$stable << 3, 0), null, 2, null), null, com.paypal.pds.components.AvatarSize.Small.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Small.$stable << 6, 58);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(loaded.getCurrencyCode(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt.TestTagCurrencySelectorText), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 48, 6, 1020);
                        startRestartGroup.endNode();
                        java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> amountList = loaded.getAmountList();
                        int i7 = i4 & 896;
                        boolean z3 = i7 == 256;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda17
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$57_pja66rDBTMCmXzZgPh4CGBkI(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountOptionsKt.AmountOptions(amountList, (kotlin.jvm.functions.Function1) rememberedValue4, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAmountOptions), startRestartGroup, 384, 0);
                        java.lang.String selectedAmount = loaded.getSelectedAmount();
                        boolean z4 = i7 == 256;
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (z4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$zU0PbVmu7r0nPlLVuLRE9OjcT3k(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        com.paypal.oslo.core.commonui.components.NumericKeyboardKt.AmountKeyboard(selectedAmount, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue5, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), 0, true, false, startRestartGroup, 24576, 40);
                        modifier4 = modifier7;
                        composer3 = startRestartGroup;
                        com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_next, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), "next_button"), null, null, null, null, false, false, startRestartGroup, (i4 >> 3) & 14, 504);
                        composer3.endNode();
                        composer3.endReplaceGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        composer2 = composer3;
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.startReplaceGroup(-1430775686);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                composer3 = startRestartGroup;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                composer2 = composer3;
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$j0vBX3stc8is3NdKWzgntUG22q8(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.this, function0, function1, function12, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AmountSelectionScreenLoadingPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2123461123);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2123461123, i, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenLoadingPreview (AmountSelectionScreen.kt:415)");
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading loading = com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda21
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$67LVSmV2r1WM6btH8K6jaawThnU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$ZKG0UsI2fRyRcEoZhd5G3M7nUUw((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AmountSelectionScreenContent(loading, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3510, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21264$r8$lambda$X0FWJUbs1rFLbJG8oxe4WBo948(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AmountSelectionScreenLoadedPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1902367408);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1902367408, i, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenLoadedPreview (AmountSelectionScreen.kt:426)");
            }
            java.util.List<java.lang.String> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"25.0", "50.1", "75", "100"});
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
            for (java.lang.String str : listOf) {
                arrayList.add(new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem(str, "USD", kotlin.jvm.internal.Intrinsics.areEqual(str, "25")));
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded loaded = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded(arrayList, "25444.0", null, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_next), 4, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda10
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$gYnvbMfE6dOkYUOIQaIPM0ZNiq4((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$gDWHyWBhf7GjVlIvuaeRF2Iu6B0((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            AmountSelectionScreenContent(loaded, function0, function1, (kotlin.jvm.functions.Function1) rememberedValue3, null, startRestartGroup, 3504, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21266$r8$lambda$abxCmpEB6dXWJfYHRbjR936pGs(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$57_pja66rDBTMCmXzZgPh4CGBkI(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountOptionItem, "");
        function1.invoke(amountOptionItem.getAmount());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$67LVSmV2r1WM6btH8K6jaawThnU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AP2xa3KwkwQl1s0OgtXozdv4BVc(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21262$r8$lambda$Fj00vY8h98ZT3gPjCM3qcWLyUY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Fj-00vY8h98ZT3gPjCM3qcWLyUY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21262$r8$lambda$Fj00vY8h98ZT3gPjCM3qcWLyUY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.CancellationReason.UserNavigatedBack.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LeIOBsc4SvdBiXm7Qfi0Bc7XrsA(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TroD6GG5qwMqyy1fO9iN7-Kldew, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21263$r8$lambda$TroD6GG5qwMqyy1fO9iN7Kldew(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel) {
        amountSelectionViewModel.onNextClick();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$X0FWJUbs-1rFLbJG8oxe4WBo948, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21264$r8$lambda$X0FWJUbs1rFLbJG8oxe4WBo948(int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountSelectionScreenLoadingPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZHz9h_3oAUk8OfaBJoWeuiTpaQU(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZKG0UsI2fRyRcEoZhd5G3M7nUUw(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$__t8-1hDa0RZTLg4nmEJ8TdccA0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21265$r8$lambda$__t81hDa0RZTLg4nmEJ8TdccA0(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$abx-CmpEB6dXWJfYHRbjR936pGs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21266$r8$lambda$abxCmpEB6dXWJfYHRbjR936pGs(int i, androidx.compose.runtime.Composer composer, int i2) {
        AmountSelectionScreenLoadedPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$eOB8cs3c8vXJgS1h4kAtbNk--zI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21267$r8$lambda$eOB8cs3c8vXJgS1h4kAtbNkzI(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        amountSelectionViewModel.onAmountChange(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gDWHyWBhf7GjVlIvuaeRF2Iu6B0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gYnvbMfE6dOkYUOIQaIPM0ZNiq4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hLGBO0MMEEFr_T_DBZqEy5VI7Do(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AmountSelectionScreen(appNavigator, addMoneyConfig, amountSelectionViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$j0vBX3stc8is3NdKWzgntUG22q8(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState amountSelectionState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AmountSelectionScreenContent(amountSelectionState, function0, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lNwRnOn7ffgIESHUR7zG-tgHBMs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21268$r8$lambda$lNwRnOn7ffgIESHUR7zGtgHBMs(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.CancellationReason.UserNavigatedBack.INSTANCE)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mz7A2Bz_eqt0gYhOSYF8xSPyyZM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1543833893, i, -1, "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreen.<anonymous>.<anonymous> (AmountSelectionScreen.kt:213)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$AP2xa3KwkwQl1s0OgtXozdv4BVc(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarLeadingElementKt.WalletTopBarBack((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s6ShNp2HA8t7oDF1E6owXbLmmv8(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult(new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.Outcome.Error(str)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vFoMK22PtDVfIabePEPtHWLQJkI(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.$r8$lambda$s6ShNp2HA8t7oDF1E6owXbLmmv8(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vvXU2MTYVt9_qlUNz6TwgNkgDLE(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.m21268$r8$lambda$lNwRnOn7ffgIESHUR7zGtgHBMs((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zU0PbVmu7r0nPlLVuLRE9OjcT3k(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.String access$AmountSelectionScreen$lambda$1(androidx.compose.runtime.MutableState mutableState) {
        return (java.lang.String) mutableState.getValue();
    }
}
