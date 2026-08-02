package com.paypal.oslo.feature.debitcard.servicing.ui.widget;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a&\u0010\u0011\u001a\u00020\u0001*\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u001c¨\u0006\u001d²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"DebitCardWidgetContent", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "entryPoint", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;", "modifier", "Landroidx/compose/ui/Modifier;", "requestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetViewModel;", "DebitCardWidgetContent-3S_xH3g", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardEntryPoint;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetViewModel;Landroidx/compose/runtime/Composer;II)V", "HandleEffects", "HandleEffects-X8AxELA", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetViewModel;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "navigateWithOptionalResult", "destination", "Landroidx/navigation3/runtime/NavKey;", "navigateWithOptionalResult-iPWDtZM", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroidx/navigation3/runtime/NavKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RenderUiBasedOnState", "state", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetEvent;", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/widget/mvi/DebitCardWidgetState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardWidgetComposableKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0062  */
    /* renamed from: DebitCardWidgetContent-3S_xH3g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14537DebitCardWidgetContent3S_xH3g(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel2;
        final java.lang.String str2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        int i5;
        final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardEntryPoint, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1834529456);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardEntryPoint.ordinal()) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(str != null ? com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(str) : null) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    debitCardWidgetViewModel2 = debitCardWidgetViewModel;
                    if (startRestartGroup.changedInstance(debitCardWidgetViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    debitCardWidgetViewModel2 = debitCardWidgetViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                debitCardWidgetViewModel2 = debitCardWidgetViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    companion = modifier2;
                    debitCardWidgetViewModel3 = debitCardWidgetViewModel2;
                    z = false;
                    i5 = i3;
                    str2 = str;
                } else {
                    companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str3 = i4 != 0 ? null : str;
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
                        z = false;
                        i3 &= -57345;
                        debitCardWidgetViewModel2 = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    } else {
                        z = false;
                    }
                    i5 = i3;
                    debitCardWidgetViewModel3 = debitCardWidgetViewModel2;
                    str2 = str3;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1834529456, i5, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetContent (DebitCardWidgetComposable.kt:60)");
                }
                int i8 = i5;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(debitCardWidgetViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean z2 = (i8 & 112) == 32 ? true : z;
                boolean changedInstance = startRestartGroup.changedInstance(debitCardWidgetViewModel3);
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$DebitCardWidgetContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$DebitCardWidgetContent$1$1(debitCardEntryPoint, debitCardWidgetViewModel3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                androidx.lifecycle.Lifecycle.Event event = androidx.lifecycle.Lifecycle.Event.ON_START;
                boolean changedInstance2 = startRestartGroup.changedInstance(debitCardWidgetViewModel3);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.$r8$lambda$NeSI5gT7ndmUYwoNj5VI1JKKGEM(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.view.compose.LifecycleEffectKt.LifecycleEventEffect(event, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, 2);
                m14538HandleEffectsX8AxELA(debitCardWidgetViewModel3, appNavigator, str2, startRestartGroup, ((i8 >> 12) & 14) | ((i8 << 3) & 112) | ((i8 >> 3) & 896));
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState) collectAsStateWithLifecycle.getValue();
                boolean changedInstance3 = startRestartGroup.changedInstance(debitCardWidgetViewModel3);
                com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$DebitCardWidgetContent$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$DebitCardWidgetContent$3$1(debitCardWidgetViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                RenderUiBasedOnState(debitCardWidgetState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue3), companion, startRestartGroup, i8 & 896, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                debitCardWidgetViewModel2 = debitCardWidgetViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
                str2 = str;
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel4 = debitCardWidgetViewModel2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.$r8$lambda$jD1cVmLHluDwTdvKWvSfXIP7pKY(com.paypal.oslo.core.navigation.AppNavigator.this, debitCardEntryPoint, modifier3, str2, debitCardWidgetViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: HandleEffects-X8AxELA, reason: not valid java name */
    public static final void m14538HandleEffectsX8AxELA(final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-864097740);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(debitCardWidgetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str != null ? com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(str) : null) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-864097740, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.widget.HandleEffects (DebitCardWidgetComposable.kt:98)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(debitCardWidgetViewModel);
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 896) == 256;
            com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1(debitCardWidgetViewModel, appNavigator, str, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.$r8$lambda$5e1fFbkiR5YR9Ldpf_mXajSHZJI(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel.this, appNavigator, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderUiBasedOnState(final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1573109428);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitCardWidgetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1573109428, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.widget.RenderUiBasedOnState (DebitCardWidgetComposable.kt:175)");
                }
                androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(modifier4, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardWidgetAnalytics.INSTANCE.getMODULE());
                int i5 = i3 & 14;
                boolean z2 = i5 == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.m14534$r8$lambda$o9ULb34baNFEqfC2yLPYhh3NDc(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.this));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier available = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.available(module, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
                if (debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Loading) {
                    startRestartGroup.startReplaceGroup(2115308876);
                    com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel debitCardWidgetUiModel = new com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetUiModel(true, null, null, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.m14536$r8$lambda$zLUe3lt7J__1PsigU_ln_w5VmQ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetKt.DebitCardWidget(debitCardWidgetUiModel, (kotlin.jvm.functions.Function1) rememberedValue2, available, startRestartGroup, 48, 0);
                    startRestartGroup.endReplaceGroup();
                } else if (debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success) {
                    startRestartGroup.startReplaceGroup(2115554086);
                    com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success success = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success) debitCardWidgetState;
                    com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetKt.DebitCardWidget(success.getUiModel(), function1, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(available, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardWidgetAnalytics.INSTANCE.userIntent(success.getProductName(), "manage"))), startRestartGroup, i3 & 112, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState) {
                        startRestartGroup.startReplaceGroup(2116102011);
                        com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState emptyState = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState) debitCardWidgetState;
                        com.paypal.oslo.feature.debitcard.servicing.ui.widget.model.DebitCardWidgetEmptyStateUiModel uiModel = emptyState.getUiModel();
                        boolean z3 = i5 == 4;
                        z = (i3 & 112) == 32;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((z3 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.m14535$r8$lambda$qQZ1iUPhQ9rzNgVZKghRsfW4Tw(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.this, function1);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        modifier3 = modifier4;
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetKt.DebitCardWidgetEmptyState(uiModel, (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(available, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardWidgetAnalytics.INSTANCE.userIntent(emptyState.getUiModel().getProductName(), "enroll"))), null, startRestartGroup, 3072, 0);
                        composer2.endReplaceGroup();
                    } else {
                        modifier3 = modifier4;
                        composer2 = startRestartGroup;
                        if (!(debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error)) {
                            if (!(debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Idle) && !(debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Hidden)) {
                                composer2.startReplaceGroup(-70311922);
                                composer2.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(2117418457);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(2117151919);
                            z = (i3 & 112) == 32;
                            java.lang.Object rememberedValue4 = composer2.rememberedValue();
                            if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.$r8$lambda$T9_3lqqlTeDYObomeODsok3yK58(kotlin.jvm.functions.Function1.this);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue4);
                            }
                            com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetKt.DebitCardWidgetErrorState((kotlin.jvm.functions.Function0) rememberedValue4, available, composer2, 0, 0);
                            composer2.endReplaceGroup();
                        }
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                modifier3 = modifier4;
                composer2 = startRestartGroup;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.$r8$lambda$uWOVqXqtSe3tqLzpE2UNQOoDkbI(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5e1fFbkiR5YR9Ldpf_mXajSHZJI(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        m14538HandleEffectsX8AxELA(debitCardWidgetViewModel, appNavigator, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NeSI5gT7ndmUYwoNj5VI1JKKGEM(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel) {
        debitCardWidgetViewModel.processEvent(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RefreshData.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T9_3lqqlTeDYObomeODsok3yK58(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.RetryButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jD1cVmLHluDwTdvKWvSfXIP7pKY(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint debitCardEntryPoint, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m14537DebitCardWidgetContent3S_xH3g(appNavigator, debitCardEntryPoint, modifier, str, debitCardWidgetViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$o9ULb34baNFEqfC2yLPYhh-3NDc, reason: not valid java name */
    public static /* synthetic */ boolean m14534$r8$lambda$o9ULb34baNFEqfC2yLPYhh3NDc(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState) {
        return (debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Success) || (debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState) || (debitCardWidgetState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.Error);
    }

    /* renamed from: $r8$lambda$qQZ1-iUPhQ9rzNgVZKghRsfW4Tw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14535$r8$lambda$qQZ1iUPhQ9rzNgVZKghRsfW4Tw(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState, kotlin.jvm.functions.Function1 function1) {
        int i = com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState.EmptyState) debitCardWidgetState).getUiModel().getProductName().ordinal()];
        if (i == 1 || i == 2) {
            function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.EmptyStateApplyButtonClicked.INSTANCE);
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent.WidgetClicked.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qpsdRcNs2KvotNZvsB_4F9S2gCE(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rX_yJsOXYvfioqswYxUsqrTW7EA(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uWOVqXqtSe3tqLzpE2UNQOoDkbI(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetState debitCardWidgetState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderUiBasedOnState(debitCardWidgetState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zLUe3lt7J__1P-sigU_ln_w5VmQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14536$r8$lambda$zLUe3lt7J__1PsigU_ln_w5VmQ(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEvent debitCardWidgetEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWidgetEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: access$navigateWithOptionalResult-iPWDtZM, reason: not valid java name */
    public static final /* synthetic */ java.lang.Object m14539access$navigateWithOptionalResultiPWDtZM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final androidx.navigation3.runtime.NavKey navKey, kotlin.coroutines.Continuation continuation) {
        if (str != null) {
            appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetResult.CardCancelled.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.$r8$lambda$qpsdRcNs2KvotNZvsB_4F9S2gCE(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        } else {
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.$r8$lambda$rX_yJsOXYvfioqswYxUsqrTW7EA(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
