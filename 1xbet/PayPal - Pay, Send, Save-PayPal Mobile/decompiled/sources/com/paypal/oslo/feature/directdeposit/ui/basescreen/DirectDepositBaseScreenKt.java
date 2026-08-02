package com.paypal.oslo.feature.directdeposit.ui.basescreen;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032K\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\u009a\u0001\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032K\u0010\u0005\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0001\u001a\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¨\u0006\u001a²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002"}, d2 = {"DirectDepositBaseScreen", "", "onBackClick", "Lkotlin/Function0;", "onNavigateToSmartRoute", "onNavigateToDepositForm", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "routingNumber", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "bankName", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/directdeposit/ui/basescreen/DirectDepositBaseViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/directdeposit/ui/basescreen/DirectDepositBaseViewModel;Landroidx/compose/runtime/Composer;II)V", "DirectDepositBaseScreenContent", "uiState", "Lcom/paypal/oslo/feature/directdeposit/ui/basescreen/DirectDepositBaseUiState;", "onShowSummary", "onShowIntro", "(Lcom/paypal/oslo/feature/directdeposit/ui/basescreen/DirectDepositBaseUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "handleShowSummaryIntent", "handleShowIntroIntent", "directdeposit_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositBaseScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DirectDepositBaseScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        androidx.compose.ui.Modifier modifier4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        final com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel4;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2047214501);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    directDepositBaseViewModel2 = directDepositBaseViewModel;
                    if (startRestartGroup.changedInstance(directDepositBaseViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    directDepositBaseViewModel2 = directDepositBaseViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                directDepositBaseViewModel2 = directDepositBaseViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier4 = modifier2;
                    i4 = 1;
                    i5 = i3;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
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
                        com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel5 = (com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i5 = i3 & (-57345);
                        modifier4 = companion;
                        directDepositBaseViewModel4 = directDepositBaseViewModel5;
                        i4 = 1;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-2047214501, i5, -1, "com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreen (DirectDepositBaseScreen.kt:49)");
                        }
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(directDepositBaseViewModel4.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, i4, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                        composer2 = startRestartGroup;
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (!composer2.getInserting()) {
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
                        com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState = (com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState) collectAsStateWithLifecycle.getValue();
                        changedInstance = composer2.changedInstance(directDepositBaseViewModel4);
                        rememberedValue = composer2.rememberedValue();
                        if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.$r8$lambda$3nxXnZwT4tUB4EH8BYs207NCEfI(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                        changedInstance2 = composer2.changedInstance(directDepositBaseViewModel4);
                        rememberedValue2 = composer2.rememberedValue();
                        if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.$r8$lambda$loI_9GEBQoDCxv3w2T9DtQMiwds(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.this);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        Camera2StreamConfigurationMap(directDepositBaseUiState, function0, function02, function3, function03, (kotlin.jvm.functions.Function0) rememberedValue2, composer2, (i5 << 3) & 8176);
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        directDepositBaseViewModel3 = directDepositBaseViewModel4;
                    } else {
                        i4 = 1;
                        i5 = i3;
                        modifier4 = companion;
                    }
                }
                directDepositBaseViewModel4 = directDepositBaseViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(directDepositBaseViewModel4.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, i4, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                composer2 = startRestartGroup;
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState2 = (com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState) collectAsStateWithLifecycle2.getValue();
                changedInstance = composer2.changedInstance(directDepositBaseViewModel4);
                rememberedValue = composer2.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.$r8$lambda$3nxXnZwT4tUB4EH8BYs207NCEfI(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) rememberedValue;
                changedInstance2 = composer2.changedInstance(directDepositBaseViewModel4);
                rememberedValue2 = composer2.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.$r8$lambda$loI_9GEBQoDCxv3w2T9DtQMiwds(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel.this);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
                Camera2StreamConfigurationMap(directDepositBaseUiState2, function0, function02, function3, function032, (kotlin.jvm.functions.Function0) rememberedValue2, composer2, (i5 << 3) & 8176);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                directDepositBaseViewModel3 = directDepositBaseViewModel4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                directDepositBaseViewModel3 = directDepositBaseViewModel2;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.$r8$lambda$OADFRVANlSE7aC5ANUWOG_sDYqM(kotlin.jvm.functions.Function0.this, function02, function3, modifier3, directDepositBaseViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(602547976);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(directDepositBaseUiState) : startRestartGroup.changedInstance(directDepositBaseUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(602547976, i2, -1, "com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenContent (DirectDepositBaseScreen.kt:75)");
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(directDepositBaseUiState, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Loading.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1838797235);
                com.paypal.pds.components.LoaderKt.Loader(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE), null, null, null, startRestartGroup, 0, 14);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(directDepositBaseUiState, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Eligible.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1838920057);
                int i3 = i2 << 12;
                com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.DirectDepositSummaryScreen(null, null, function0, null, null, null, function02, function3, function04, startRestartGroup, (i3 & 29360128) | ((i2 << 3) & 896) | (3670016 & i3) | ((i2 << 9) & 234881024), 59);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(directDepositBaseUiState, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.BundleProvisioned.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1839257182);
                com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt.DirectDepositIntroScreen(null, function0, function03, startRestartGroup, (i2 & 112) | ((i2 >> 6) & 896), 1);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(directDepositBaseUiState, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Ineligible.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(directDepositBaseUiState, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.Error.INSTANCE)) {
                startRestartGroup.startReplaceGroup(1839502392);
                com.paypal.oslo.feature.directdeposit.ui.error.composable.DirectDepositErrorScreenKt.DirectDepositErrorScreen(com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FATAL, function0, function0, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE), false, startRestartGroup, (i2 & 112) | 6 | ((i2 << 3) & 896), 16);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(directDepositBaseUiState, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.NetworkError.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-771968633);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(1839808083);
                com.paypal.oslo.feature.directdeposit.ui.error.composable.DirectDepositErrorScreenKt.DirectDepositErrorScreen(com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.NO_NETWORK, function0, function0, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE), false, startRestartGroup, (i2 & 112) | 6 | ((i2 << 3) & 896), 16);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.m14690$r8$lambda$qOWFA3sRaBzAN2Nng_Bw2u8UUQ(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState.this, function0, function02, function3, function03, function04, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void handleShowSummaryIntent(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositBaseViewModel, "");
        directDepositBaseViewModel.processIntent((com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent) com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent.ShowSummary.INSTANCE);
    }

    public static final void handleShowIntroIntent(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositBaseViewModel, "");
        directDepositBaseViewModel.processIntent((com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent) com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseIntent.ShowIntro.INSTANCE);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3nxXnZwT4tUB4EH8BYs207NCEfI(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel) {
        handleShowSummaryIntent(directDepositBaseViewModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OADFRVANlSE7aC5ANUWOG_sDYqM(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function3 function3, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DirectDepositBaseScreen(function0, function02, function3, modifier, directDepositBaseViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$loI_9GEBQoDCxv3w2T9DtQMiwds(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseViewModel directDepositBaseViewModel) {
        handleShowIntroIntent(directDepositBaseViewModel);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qO-WFA3sRaBzAN2Nng_Bw2u8UUQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14690$r8$lambda$qOWFA3sRaBzAN2Nng_Bw2u8UUQ(com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseUiState directDepositBaseUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(directDepositBaseUiState, function0, function02, function3, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
