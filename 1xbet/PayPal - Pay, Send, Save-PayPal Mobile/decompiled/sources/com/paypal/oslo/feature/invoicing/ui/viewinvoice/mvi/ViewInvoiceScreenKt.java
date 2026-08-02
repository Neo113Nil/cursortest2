package com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aX\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032/\b\u0002\u0010\u000b\u001a)\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\f¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\r*R\b\u0000\u0010\u0000\"%\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u00062%\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0006¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"InvoiceWebViewContent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/Function0;", "", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "ViewInvoiceScreen", "viewModel", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel;", "onBackClick", "webViewContent", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/InvoiceWebViewContent;", "(Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/viewmodel/ViewInvoiceViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "invoicing_prodRelease", "uiState", "Lcom/paypal/oslo/feature/invoicing/ui/viewinvoice/mvi/ViewInvoiceState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewInvoiceScreenKt {
    public static final void ViewInvoiceScreen(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel2;
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function52;
        final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function53;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(200435689);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                viewInvoiceViewModel2 = viewInvoiceViewModel;
                if (startRestartGroup.changedInstance(viewInvoiceViewModel2)) {
                    i5 = 4;
                    i3 = i5 | i;
                }
            } else {
                viewInvoiceViewModel2 = viewInvoiceViewModel;
            }
            i5 = 2;
            i3 = i5 | i;
        } else {
            viewInvoiceViewModel2 = viewInvoiceViewModel;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
            function52 = function5;
        } else {
            function52 = function5;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function52) ? 256 : 128;
            }
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
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
                    viewInvoiceViewModel2 = (com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -15;
                } else {
                    i4 = 0;
                }
                if (i6 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                }
                function52 = i7 != 0 ? com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ComposableSingletons$ViewInvoiceScreenKt.INSTANCE.m15582getLambda$618514130$invoicing_prodRelease() : function5;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                i4 = 0;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(200435689, i3, -1, "com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreen (ViewInvoiceScreen.kt:82)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(viewInvoiceViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState) collectAsStateWithLifecycle.getValue(), startRestartGroup, i4);
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(viewInvoiceViewModel2);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$2$1(viewInvoiceViewModel2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            androidx.lifecycle.Lifecycle.Event event = androidx.lifecycle.Lifecycle.Event.ON_RESUME;
            boolean changed = startRestartGroup.changed(rememberUpdatedState);
            boolean changedInstance2 = startRestartGroup.changedInstance(viewInvoiceViewModel2);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changed | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt.$r8$lambda$Cso45WWkTT2DCww7k6lG9xIdiwU(androidx.compose.runtime.State.this, viewInvoiceViewModel2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.view.compose.LifecycleEffectKt.LifecycleEventEffect(event, null, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 6, 2);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(viewInvoiceViewModel2);
            boolean z = (i3 & 112) == 32;
            boolean changedInstance4 = startRestartGroup.changedInstance(context);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance3 | z | changedInstance4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$ViewInvoiceScreen$4$1(viewInvoiceViewModel2, function02, context, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState viewInvoiceState = (com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState) collectAsStateWithLifecycle.getValue();
            if (viewInvoiceState instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready) {
                startRestartGroup.startReplaceGroup(1176924942);
                com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready ready = (com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready) viewInvoiceState;
                startRestartGroup.startMovableGroup(-654768374, java.lang.Integer.valueOf(ready.getRefreshKey()));
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration webViewConfiguration = ready.getWebViewConfiguration();
                boolean changedInstance5 = startRestartGroup.changedInstance(viewInvoiceViewModel2);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt.m15583$r8$lambda$vS713aKcQahAm9Y3BUJTm5cotg(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                function52.invoke(webViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue5, androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | ((i3 << 3) & 7168)));
                startRestartGroup.endMovableGroup();
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function53 = function52;
            } else {
                startRestartGroup.startReplaceGroup(-654773380);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            function53 = function5;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel3 = viewInvoiceViewModel2;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceScreenKt.$r8$lambda$cSdUjIGrJGnrBfSFcovtRdr3IWg(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel.this, function03, function53, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Cso45WWkTT2DCww7k6lG9xIdiwU(androidx.compose.runtime.State state, com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel) {
        com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState viewInvoiceState = (com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState) state.getValue();
        if ((viewInvoiceState instanceof com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready) && ((com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceState.Ready) viewInvoiceState).getShouldRefreshOnResume()) {
            viewInvoiceViewModel.processEvent(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnRefreshRequested.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cSdUjIGrJGnrBfSFcovtRdr3IWg(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function5 function5, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ViewInvoiceScreen(viewInvoiceViewModel, function0, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vS713aKc-QahAm9Y3BUJTm5cotg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15583$r8$lambda$vS713aKcQahAm9Y3BUJTm5cotg(com.paypal.oslo.feature.invoicing.ui.viewinvoice.viewmodel.ViewInvoiceViewModel viewInvoiceViewModel) {
        viewInvoiceViewModel.processEvent(com.paypal.oslo.feature.invoicing.ui.viewinvoice.mvi.ViewInvoiceEvent.OnBackPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
