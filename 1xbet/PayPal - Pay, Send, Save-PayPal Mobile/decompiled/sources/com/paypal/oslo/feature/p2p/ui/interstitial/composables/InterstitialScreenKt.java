package com.paypal.oslo.feature.p2p.ui.interstitial.composables;

@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u009d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u000528\b\u0002\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u000728\b\u0002\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001aM\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u001326\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0016\u001a\u0085\u0001\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u001b28\b\u0002\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u001d\u001aw\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u001b28\b\u0002\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010!\u001a\u001f\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010%\u001aS\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u001b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010*\u001a\r\u0010+\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,\u001a\r\u0010-\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,\u001a\r\u0010.\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,\u001a\r\u0010/\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010,¨\u00060²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.SCREEN, "", "screenModel", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialScreenModel;", "modifier", "Landroidx/compose/ui/Modifier;", "onButtonAction", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "Lkotlin/ParameterName;", "name", "action", "", "isPrimary", "onLinkClick", "", "text", "url", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/viewmodel/InterstitialViewModel;", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialScreenModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/paypal/oslo/feature/p2p/ui/interstitial/viewmodel/InterstitialViewModel;Landroidx/compose/runtime/Composer;II)V", "InterstitialScreenEffects", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/viewmodel/InterstitialViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "InterstitialScreenContainer", "uiState", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/state/InterstitialUiState;", "onPrimaryClick", "Lkotlin/Function1;", "onSecondaryClick", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/state/InterstitialUiState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "InterstitialContent", "content", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/state/InterstitialContentState;", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/state/InterstitialContentState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "BulletPointItem", "bulletPoint", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBulletPointModel;", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialBulletPointModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InterstitialButtonSection", "primaryButton", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;", "secondaryButton", "(Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialButtonModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InterstitialScreenFullContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "InterstitialScreenRichBodyPreview", "InterstitialScreenBodyContentPreview", "InterstitialScreenMinimalPreview", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InterstitialScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InterstitialScreen(final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialScreenModel interstitialScreenModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, ? super java.lang.Boolean, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22, com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, ? super java.lang.Boolean, kotlin.Unit> function23;
        int i5;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24;
        com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel2;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, ? super java.lang.Boolean, kotlin.Unit> function25;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function26;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, ? super java.lang.Boolean, kotlin.Unit> function27;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function28;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i6;
        final com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel3;
        boolean changedInstance;
        boolean z;
        com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreen$3$1 rememberedValue;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialScreenModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2086090449);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(interstitialScreenModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            interstitialViewModel2 = interstitialViewModel;
                            if (startRestartGroup.changedInstance(interstitialViewModel2)) {
                                i7 = 16384;
                                i3 |= i7;
                            }
                        } else {
                            interstitialViewModel2 = interstitialViewModel;
                        }
                        i7 = 8192;
                        i3 |= i7;
                    } else {
                        interstitialViewModel2 = interstitialViewModel;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            companion = modifier2;
                        } else {
                            companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$jj3Jl_vmaf3ctuRtTK6_IkY1v8Y((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction) obj, ((java.lang.Boolean) obj2).booleanValue());
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                function27 = (kotlin.jvm.functions.Function2) rememberedValue4;
                            } else {
                                function27 = function23;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$G8guiz7jvlkwwEPswilJ3n0fYdE((java.lang.String) obj, (java.lang.String) obj2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                function28 = (kotlin.jvm.functions.Function2) rememberedValue5;
                            } else {
                                function28 = function24;
                            }
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
                                i6 = i3 & (-57345);
                                interstitialViewModel3 = (com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                                function25 = function27;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-2086090449, i6, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreen (InterstitialScreen.kt:92)");
                                }
                                changedInstance = startRestartGroup.changedInstance(interstitialViewModel3);
                                int i9 = i6 & 14;
                                z = i9 == 4;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreen$3$1(interstitialViewModel3, interstitialScreenModel, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(interstitialScreenModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i9);
                                int i10 = i6;
                                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(interstitialViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                                Camera2StreamConfigurationMap(interstitialViewModel3, function25, startRestartGroup, ((i10 >> 12) & 14) | ((i10 >> 3) & 112));
                                com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState interstitialUiState = (com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState) collectAsStateWithLifecycle.getValue();
                                changedInstance2 = startRestartGroup.changedInstance(interstitialViewModel3);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$6WV5Fwr4QZjs9pyeEtHg4n5llho(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel.this, (com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                changedInstance3 = startRestartGroup.changedInstance(interstitialViewModel3);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$Yabyi7Tgi0UQJOyGeGG9tps0IkQ(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel.this, (com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                int i11 = (i10 & 112) | ((i10 << 3) & 57344);
                                com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel4 = interstitialViewModel3;
                                InterstitialScreenContainer(interstitialUiState, companion, function1, (kotlin.jvm.functions.Function1) rememberedValue3, function28, startRestartGroup, i11, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                interstitialViewModel2 = interstitialViewModel4;
                                function26 = function28;
                            } else {
                                function23 = function27;
                                function24 = function28;
                            }
                        }
                        i6 = i3;
                        function25 = function23;
                        function28 = function24;
                        interstitialViewModel3 = interstitialViewModel2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        changedInstance = startRestartGroup.changedInstance(interstitialViewModel3);
                        int i92 = i6 & 14;
                        if (i92 == 4) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | z)) {
                        }
                        rememberedValue = new com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreen$3$1(interstitialViewModel3, interstitialScreenModel, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(interstitialScreenModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i92);
                        int i102 = i6;
                        androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(interstitialViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        Camera2StreamConfigurationMap(interstitialViewModel3, function25, startRestartGroup, ((i102 >> 12) & 14) | ((i102 >> 3) & 112));
                        com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState interstitialUiState2 = (com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState) collectAsStateWithLifecycle2.getValue();
                        changedInstance2 = startRestartGroup.changedInstance(interstitialViewModel3);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changedInstance2) {
                        }
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$6WV5Fwr4QZjs9pyeEtHg4n5llho(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel.this, (com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        changedInstance3 = startRestartGroup.changedInstance(interstitialViewModel3);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance3) {
                        }
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$Yabyi7Tgi0UQJOyGeGG9tps0IkQ(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel.this, (com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        int i112 = (i102 & 112) | ((i102 << 3) & 57344);
                        com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel42 = interstitialViewModel3;
                        InterstitialScreenContainer(interstitialUiState2, companion, function12, (kotlin.jvm.functions.Function1) rememberedValue3, function28, startRestartGroup, i112, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        interstitialViewModel2 = interstitialViewModel42;
                        function26 = function28;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        function25 = function23;
                        function26 = function24;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel5 = interstitialViewModel2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$jLoboRK7UCXmKETGOitoiOMT6to(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialScreenModel.this, modifier3, function25, function26, interstitialViewModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function24 = function22;
                if ((i & 24576) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((i & 24576) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, ? super java.lang.Boolean, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-995848499);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(interstitialViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-995848499, i2, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenEffects (InterstitialScreen.kt:136)");
            }
            androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            androidx.view.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleOwner);
            boolean changedInstance2 = startRestartGroup.changedInstance(interstitialViewModel);
            boolean z = (i2 & 112) == 32;
            com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changedInstance2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$InterstitialScreenEffects$1$1(lifecycleOwner, interstitialViewModel, function2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(lifecycle, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.m17289$r8$lambda$_y2jieQbRS5L4kZz3t8pF93GFQ(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel.this, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InterstitialScreenContainer(final com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState interstitialUiState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function12, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function13;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function14;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function15;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function16;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function17;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialUiState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1912249254);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(interstitialUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function14 = function12;
                    i3 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            function15 = function13;
                            function22 = function2;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$NQySX_8Dpf1VrHieHvCtAZIbjW0((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function16 = (kotlin.jvm.functions.Function1) rememberedValue;
                            } else {
                                function16 = function13;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$8k7WLZyaarIyN9ht9cemGlCztT0((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function17 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            } else {
                                function17 = function14;
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$jD7CIpZCXiTAauMrHGIbDRP9W4c((java.lang.String) obj, (java.lang.String) obj2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function23 = (kotlin.jvm.functions.Function2) rememberedValue3;
                            } else {
                                function23 = function2;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1912249254, i3, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenContainer (InterstitialScreen.kt:163)");
                            }
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.SCREEN);
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
                            if (interstitialUiState instanceof com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.Initial) {
                                startRestartGroup.startReplaceGroup(-1568153889);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                if (!(interstitialUiState instanceof com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.Content)) {
                                    startRestartGroup.startReplaceGroup(365054764);
                                    startRestartGroup.endReplaceGroup();
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                startRestartGroup.startReplaceGroup(-1568022883);
                                getHighSpeedVideoSizes(((com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.Content) interstitialUiState).getContent(), function16, function17, function23, startRestartGroup, (i3 >> 3) & 8176, 0);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function15 = function16;
                            function14 = function17;
                            function22 = function23;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function18 = function14;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.m17288$r8$lambda$L0aUWxIeZHBjA0wvJhcGSOwYVk(com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.this, modifier3, function15, function18, function22, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function14 = function12;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function14 = function12;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function14 = function12;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialContentState interstitialContentState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function12, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-5985016);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(interstitialContentState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function23 = function22;
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.m17293$r8$lambda$wdewoSFP_YnZAIu284rR9ThfA((java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function24 = (kotlin.jvm.functions.Function2) rememberedValue;
                } else {
                    function24 = function22;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-5985016, i3, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialContent (InterstitialScreen.kt:195)");
                }
                androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), rememberScrollState, false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource image = interstitialContentState.getImage();
                if (image instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Url) {
                    startRestartGroup.startReplaceGroup(-46502215);
                    com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Url) image).getUrl(), null, null, null, null, startRestartGroup, 0, 30), "", null, null, com.paypal.pds.components.ImageCornerRadius.Radius24, com.paypal.pds.components.ImageAspectRatio.Landscape16x9, null, startRestartGroup, 221232, 76);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    i4 = 0;
                } else {
                    i4 = 0;
                    if (image instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Drawable) {
                        startRestartGroup.startReplaceGroup(-46053087);
                        com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Drawable) image).getResId(), startRestartGroup, 0), "", null, null, com.paypal.pds.components.ImageCornerRadius.Radius24, com.paypal.pds.components.ImageAspectRatio.Landscape16x9, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 221232, 76);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (image != null) {
                            startRestartGroup.startReplaceGroup(552687005);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(-45651823);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(interstitialContentState.getTitle(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.TITLE), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 48, 6, 1020);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, i4);
                com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent body = interstitialContentState.getBody();
                if (body instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain) {
                    startRestartGroup.startReplaceGroup(-45136634);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain) body).getText(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.BODY), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 48, 6, 1020);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, i4);
                    startRestartGroup.endReplaceGroup();
                } else if (body instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich) {
                    startRestartGroup.startReplaceGroup(-44765781);
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich) body).getRichText(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.BODY), null, null, null, null, false, 0, 0, null, function24, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, null, startRestartGroup, 48, ((i3 >> 9) & 14) | 48, 5116);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, i4);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (body != null) {
                        startRestartGroup.startReplaceGroup(552731168);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-44375987);
                    startRestartGroup.endReplaceGroup();
                }
                if (!interstitialContentState.getBulletPoints().isEmpty()) {
                    startRestartGroup.startReplaceGroup(-44246748);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.BULLET_POINTS);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i4);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i4));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-935063044);
                    java.util.Iterator<T> it = interstitialContentState.getBulletPoints().iterator();
                    while (it.hasNext()) {
                        getHighSpeedVideoSizes((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel) it.next(), null, startRestartGroup, i4, 2);
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-43937306);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (interstitialContentState.getPrimaryButton() != null || interstitialContentState.getSecondaryButton() != null) {
                    startRestartGroup.startReplaceGroup(1890864025);
                    getHighResolutionOutputSizeshNQ4ISI(interstitialContentState.getPrimaryButton(), interstitialContentState.getSecondaryButton(), function1, function12, null, startRestartGroup, (i3 << 3) & 8064, 16);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1891132144);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function23 = function24;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$_tZbKdPAmuEdXK3MEjVFxPF0G7s(com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialContentState.this, function1, function12, function23, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function22 = function2;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel interstitialBulletPointModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-643015782);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(interstitialBulletPointModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-643015782, i3, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.BulletPointItem (InterstitialScreen.kt:297)");
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier4, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource iconSource = interstitialBulletPointModel.getIconSource();
                if (iconSource instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon) {
                    startRestartGroup.startReplaceGroup(1139013412);
                    com.paypal.pds.components.AvatarKt.Avatar(((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon) iconSource).getIcon().getAvatarSource(), null, com.paypal.pds.components.AvatarSize.Large.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Large.$stable << 6, 58);
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                } else if (iconSource instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.Url) {
                    startRestartGroup.startReplaceGroup(1139221670);
                    modifier3 = modifier4;
                    com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.Url) iconSource).getUrl(), null, null, null, null, startRestartGroup, 0, 30), "", androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24()), null, com.paypal.pds.components.ImageCornerRadius.None, null, null, startRestartGroup, 24624, 104);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier3 = modifier4;
                    if (iconSource != null) {
                        startRestartGroup.startReplaceGroup(2114949822);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1139521905);
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("•", null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 6, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    composer2.endReplaceGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(interstitialBulletPointModel.getText(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer2, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                }
                composer2 = startRestartGroup;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(interstitialBulletPointModel.getText(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer2, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.m17291$r8$lambda$j0hBTcfROvjRbk7fziqfvcHAA(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel, final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        int i5;
        boolean z;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-23414815);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(interstitialButtonModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(interstitialButtonModel2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-23414815, i4, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialButtonSection (InterstitialScreen.kt:343)");
                }
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                if (interstitialButtonModel != null && interstitialButtonModel2 != null) {
                    startRestartGroup.startReplaceGroup(203189690);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.PRIMARY_BUTTON);
                    java.lang.String text = interstitialButtonModel.getText();
                    com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    boolean z2 = (i4 & 896) == 256;
                    boolean z3 = (i4 & 14) == 4;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$NWhV345Bpdx5Il7o4XoT4TQ1MQE(kotlin.jvm.functions.Function1.this, interstitialButtonModel);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    modifier3 = modifier4;
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, text, testTag, null, null, primary, large, false, false, startRestartGroup, 1769856, 408);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.SECONDARY_BUTTON);
                    java.lang.String text2 = interstitialButtonModel2.getText();
                    com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    boolean z4 = (i4 & 7168) == 2048;
                    boolean z5 = (i4 & 112) == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z4 | z5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda18
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.m17286$r8$lambda$BfSbQ0NHjaEryG5H06jEhh5Zz0(kotlin.jvm.functions.Function1.this, interstitialButtonModel2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, text2, testTag2, null, null, secondary, large2, false, false, startRestartGroup, 1769856, 408);
                } else {
                    modifier3 = modifier4;
                    startRestartGroup.startReplaceGroup(204021327);
                    if (interstitialButtonModel == null) {
                        startRestartGroup.startReplaceGroup(204080350);
                        startRestartGroup.endReplaceGroup();
                        i5 = i4;
                        z = false;
                    } else {
                        startRestartGroup.startReplaceGroup(204080351);
                        androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.PRIMARY_BUTTON);
                        java.lang.String text3 = interstitialButtonModel.getText();
                        com.paypal.pds.components.ButtonStyle.Primary primary2 = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                        com.paypal.pds.components.ButtonSize.Large large3 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                        boolean z6 = (i4 & 896) == 256;
                        boolean changed = startRestartGroup.changed(interstitialButtonModel);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((z6 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.m17292$r8$lambda$m966N5tczVctjroI9Rw1vGtcT8(kotlin.jvm.functions.Function1.this, interstitialButtonModel);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        i5 = i4;
                        z = false;
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, text3, testTag3, null, null, primary2, large3, false, false, startRestartGroup, 1769856, 408);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (interstitialButtonModel2 == null) {
                        startRestartGroup.startReplaceGroup(204514970);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(204514971);
                        androidx.compose.ui.Modifier testTag4 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenTestTags.SECONDARY_BUTTON);
                        java.lang.String text4 = interstitialButtonModel2.getText();
                        com.paypal.pds.components.ButtonStyle.Outline outline = com.paypal.pds.components.ButtonStyle.Outline.INSTANCE;
                        com.paypal.pds.components.ButtonSize.Large large4 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                        boolean z7 = (i5 & 7168) == 2048 ? true : z;
                        boolean changed2 = startRestartGroup.changed(interstitialButtonModel2);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((changed2 | z7) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.m17290$r8$lambda$hc41jJFCrnCpV5ppl7yCJ2AHcc(kotlin.jvm.functions.Function1.this, interstitialButtonModel2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, text4, testTag4, null, null, outline, large4, false, false, startRestartGroup, 1769856, 408);
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$em4lciM5BlHOeRUAbavbcZ9grpE(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel.this, interstitialButtonModel2, function1, function12, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$-BfSbQ0NHjaEryG5H06jEhh5Zz0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17286$r8$lambda$BfSbQ0NHjaEryG5H06jEhh5Zz0(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel) {
        function1.invoke(interstitialButtonModel.getAction());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6WV5Fwr4QZjs9pyeEtHg4n5llho(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
        interstitialViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.PrimaryButtonClicked(interstitialAction));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$7KfqeFzHuxou0hsQ-kb8yCZY92A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17287$r8$lambda$7KfqeFzHuxou0hsQkb8yCZY92A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1707148617);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1707148617, updateChangedFlags, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenRichBodyPreview (InterstitialScreen.kt:476)");
            }
            InterstitialScreenContainer(new com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.Content(new com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialContentState("Agree", new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Rich(com.paypal.pds.core.RichTextKt.toRichText("By continuing, you agree to our Term of Service", kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to("Term of Service", com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder.WEB_VIEW_PRODUCTION_BASE_URL)))), null, new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel("Get Started", com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.GetStarted.INSTANCE), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel("Learn More", com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.LearnMore.INSTANCE), null, 36, null)), null, null, null, null, startRestartGroup, 0, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.m17287$r8$lambda$7KfqeFzHuxou0hsQkb8yCZY92A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8k7WLZyaarIyN9ht9cemGlCztT0(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A1F9PSgrRODN12OfjnaJScQV1Ak(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1461784722);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1461784722, updateChangedFlags, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenMinimalPreview (InterstitialScreen.kt:556)");
            }
            InterstitialScreenContainer(new com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.Content(new com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialContentState("Title", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel[]{new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel("Bullet point 1", null, 2, null), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel("Bullet point 2", null, 2, null)}), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel("Continue", com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Continue.INSTANCE), null, null, 50, null)), null, null, null, null, startRestartGroup, 0, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$A1F9PSgrRODN12OfjnaJScQV1Ak(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G8guiz7jvlkwwEPswilJ3n0fYdE(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L-0aUWxIeZHBjA0wvJhcGSOwYVk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17288$r8$lambda$L0aUWxIeZHBjA0wvJhcGSOwYVk(com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState interstitialUiState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InterstitialScreenContainer(interstitialUiState, modifier, function1, function12, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NQySX_8Dpf1VrHieHvCtAZIbjW0(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NWhV345Bpdx5Il7o4XoT4TQ1MQE(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel) {
        function1.invoke(interstitialButtonModel.getAction());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WUMVmjMAa6fOzxsBvzX9eq_lf3Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(459909700);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(459909700, updateChangedFlags, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenBodyContentPreview (InterstitialScreen.kt:512)");
            }
            InterstitialScreenContainer(new com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.Content(new com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialContentState("Pay friends on Paypal and Venmo", null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel[]{new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel("Send money instantly to friends and family", new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon(com.paypal.pds.core.Icon.Camera.INSTANCE)), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel("Connect with your contacts across PayPal and Venmo", new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon(com.paypal.pds.core.Icon.Heart.INSTANCE)), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel("Safe and secure payments", new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon(com.paypal.pds.core.Icon.Trophy.INSTANCE))}), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel("Get Started", com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.GetStarted.INSTANCE), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel("Learn More", com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.LearnMore.INSTANCE), null, 34, null)), null, null, null, null, startRestartGroup, 0, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$WUMVmjMAa6fOzxsBvzX9eq_lf3Q(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yabyi7Tgi0UQJOyGeGG9tps0IkQ(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
        interstitialViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.interstitial.events.InterstitialEvent.SecondaryButtonClicked(interstitialAction));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_tZbKdPAmuEdXK3MEjVFxPF0G7s(com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialContentState interstitialContentState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(interstitialContentState, function1, function12, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_y2jieQbRS5L4kZz3t8-pF93GFQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17289$r8$lambda$_y2jieQbRS5L4kZz3t8pF93GFQ(com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(interstitialViewModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cMGXE62Wo8HsHuXzTYeMni16ksY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-557631689);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-557631689, updateChangedFlags, -1, "com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenFullContentPreview (InterstitialScreen.kt:430)");
            }
            InterstitialScreenContainer(new com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialUiState.Content(new com.paypal.oslo.feature.p2p.ui.interstitial.state.InterstitialContentState("Pay friends on Paypal and Venmo", new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBodyContent.Plain("Send and receive money easily with PayPal. Here's what you can do:"), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel[]{new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel("Send money instantly to friends and family", new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon(com.paypal.pds.core.Icon.Camera.INSTANCE)), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel("Connect with your contacts across PayPal and Venmo", new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon(com.paypal.pds.core.Icon.Heart.INSTANCE)), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel("Safe and secure payments", new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon(com.paypal.pds.core.Icon.Trophy.INSTANCE))}), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel("Get Started", com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.GetStarted.INSTANCE), new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel("Not Now", com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.NotNow.INSTANCE), null)), null, null, null, null, startRestartGroup, 0, 30);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.interstitial.composables.InterstitialScreenKt.$r8$lambda$cMGXE62Wo8HsHuXzTYeMni16ksY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$em4lciM5BlHOeRUAbavbcZ9grpE(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(interstitialButtonModel, interstitialButtonModel2, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hc-41jJFCrnCpV5ppl7yCJ2AHcc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17290$r8$lambda$hc41jJFCrnCpV5ppl7yCJ2AHcc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel) {
        function1.invoke(interstitialButtonModel.getAction());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j0hBTcfROvjRbk-7fziqf-vcHAA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17291$r8$lambda$j0hBTcfROvjRbk7fziqfvcHAA(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialBulletPointModel interstitialBulletPointModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(interstitialBulletPointModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jD7CIpZCXiTAauMrHGIbDRP9W4c(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jLoboRK7UCXmKETGOitoiOMT6to(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialScreenModel interstitialScreenModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, com.paypal.oslo.feature.p2p.ui.interstitial.viewmodel.InterstitialViewModel interstitialViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InterstitialScreen(interstitialScreenModel, modifier, function2, function22, interstitialViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jj3Jl_vmaf3ctuRtTK6_IkY1v8Y(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction interstitialAction, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interstitialAction, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m966-N5tczVctjroI9Rw1vGtcT8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17292$r8$lambda$m966N5tczVctjroI9Rw1vGtcT8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialButtonModel interstitialButtonModel) {
        function1.invoke(interstitialButtonModel.getAction());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wdewoSFP_YnZAIu284r-R9Thf-A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17293$r8$lambda$wdewoSFP_YnZAIu284rR9ThfA(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }
}
