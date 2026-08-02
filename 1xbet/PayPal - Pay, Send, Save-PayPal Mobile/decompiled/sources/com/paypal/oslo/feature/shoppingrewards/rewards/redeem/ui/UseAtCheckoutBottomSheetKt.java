package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052'\u0010\u0006\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"UseAtCheckoutBottomSheet", "", "uiData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/UseAtCheckoutUiData;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "onRegisterDismissCallback", "Lkotlin/Function1;", "Lkotlin/Function0;", "Lkotlin/ParameterName;", "name", com.sun.jna.Callback.METHOD_NAME, "viewModel", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutViewModel;", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/UseAtCheckoutUiData;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutViewModel;Landroidx/compose/runtime/Composer;II)V", "UseAtCheckoutContent", "onCtaClick", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/models/UseAtCheckoutUiData;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "UseAtCheckoutBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease", "uiState", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/UseAtCheckoutState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UseAtCheckoutBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UseAtCheckoutBottomSheet(final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData useAtCheckoutUiData, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> function1, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel useAtCheckoutViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel useAtCheckoutViewModel2;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel useAtCheckoutViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel useAtCheckoutViewModel4;
        int i5;
        int i6;
        boolean z;
        boolean changedInstance;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1 rememberedValue;
        boolean changedInstance2;
        boolean z2;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$2$1 rememberedValue2;
        boolean changedInstance3;
        boolean z3;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1 rememberedValue3;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState useAtCheckoutState;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useAtCheckoutUiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(191102244);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(useAtCheckoutUiData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                useAtCheckoutViewModel2 = useAtCheckoutViewModel;
                if (startRestartGroup.changedInstance(useAtCheckoutViewModel2)) {
                    i7 = 2048;
                    i3 |= i7;
                }
            } else {
                useAtCheckoutViewModel2 = useAtCheckoutViewModel;
            }
            i7 = 1024;
            i3 |= i7;
        } else {
            useAtCheckoutViewModel2 = useAtCheckoutViewModel;
        }
        int i8 = i3;
        if (startRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i6 = i8 & (-7169);
                    i4 = 256;
                    useAtCheckoutViewModel3 = useAtCheckoutViewModel2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(useAtCheckoutViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.view.OnBackPressedDispatcherOwner current = androidx.view.compose.LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalOnBackPressedDispatcherOwner.$stable);
                    if (current != null) {
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    if ((i6 & 896) == i4) {
                    }
                    changedInstance = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | z)) {
                    }
                    rememberedValue = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1(function1, useAtCheckoutViewModel3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    changedInstance2 = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
                    if ((i6 & 112) == 32) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance2 | z2)) {
                    }
                    rememberedValue2 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$2$1(useAtCheckoutViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    changedInstance3 = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
                    int i9 = i6 & 14;
                    if (i9 == 4) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!(changedInstance3 | z3)) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1(useAtCheckoutViewModel3, useAtCheckoutUiData, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    useAtCheckoutState = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState) collectAsStateWithLifecycle.getValue();
                    if (useAtCheckoutState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Initial) {
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                }
            } else if ((i2 & 8) != 0) {
                androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current2 == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, 0);
                if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                    empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                } else {
                    empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                }
                i4 = 256;
                useAtCheckoutViewModel4 = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i5 = i8 & (-7169);
                useAtCheckoutViewModel3 = useAtCheckoutViewModel4;
                i6 = i5;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(191102244, i6, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheet (UseAtCheckoutBottomSheet.kt:66)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(useAtCheckoutViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.view.OnBackPressedDispatcherOwner current3 = androidx.view.compose.LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalOnBackPressedDispatcherOwner.$stable);
                final androidx.view.OnBackPressedDispatcher onBackPressedDispatcher = current3 != null ? current3.getOnBackPressedDispatcher() : null;
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                z = (i6 & 896) == i4;
                changedInstance = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1(function1, useAtCheckoutViewModel3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                changedInstance2 = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
                z2 = (i6 & 112) == 32;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance2 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$2$1(useAtCheckoutViewModel3, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                changedInstance3 = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
                int i92 = i6 & 14;
                z3 = i92 == 4;
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(changedInstance3 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1(useAtCheckoutViewModel3, useAtCheckoutUiData, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                useAtCheckoutState = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState) collectAsStateWithLifecycle2.getValue();
                if (useAtCheckoutState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Initial) {
                    startRestartGroup.startReplaceGroup(1396856930);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(useAtCheckoutState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Ready)) {
                        startRestartGroup.startReplaceGroup(1396855232);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(1396858663);
                    boolean changedInstance4 = startRestartGroup.changedInstance(onBackPressedDispatcher);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt.m19493$r8$lambda$BrGxe_pqFHPH2yEvS3J32OQ7Cs(androidx.view.OnBackPressedDispatcher.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    UseAtCheckoutContent(useAtCheckoutUiData, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, i92, 0);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = 256;
            useAtCheckoutViewModel4 = useAtCheckoutViewModel2;
            i5 = i8;
            useAtCheckoutViewModel3 = useAtCheckoutViewModel4;
            i6 = i5;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(useAtCheckoutViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.view.OnBackPressedDispatcherOwner current32 = androidx.view.compose.LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalOnBackPressedDispatcherOwner.$stable);
            if (current32 != null) {
            }
            kotlin.Unit unit42 = kotlin.Unit.INSTANCE;
            if ((i6 & 896) == i4) {
            }
            changedInstance = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z)) {
            }
            rememberedValue = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$1$1(function1, useAtCheckoutViewModel3, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit42, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
            changedInstance2 = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
            if ((i6 & 112) == 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance2 | z2)) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$2$1(useAtCheckoutViewModel3, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            kotlin.Unit unit322 = kotlin.Unit.INSTANCE;
            changedInstance3 = startRestartGroup.changedInstance(useAtCheckoutViewModel3);
            int i922 = i6 & 14;
            if (i922 == 4) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!(changedInstance3 | z3)) {
            }
            rememberedValue3 = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$UseAtCheckoutBottomSheet$3$1(useAtCheckoutViewModel3, useAtCheckoutUiData, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit322, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            androidx.compose.ui.Modifier.Companion companion22 = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, maybeCachedBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            useAtCheckoutState = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState) collectAsStateWithLifecycle22.getValue();
            if (useAtCheckoutState instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutState.Initial) {
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            useAtCheckoutViewModel3 = useAtCheckoutViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel useAtCheckoutViewModel5 = useAtCheckoutViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt.m19494$r8$lambda$_EmpoCk7wd75ohttOZ32pxOOLg(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData.this, appNavigator, function1, useAtCheckoutViewModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UseAtCheckoutContent(final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData useAtCheckoutUiData, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useAtCheckoutUiData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-194868300);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(useAtCheckoutUiData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function03 = function02;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-194868300, i4, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutContent (UseAtCheckoutBottomSheet.kt:106)");
                }
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSize16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
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
                androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.weight(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(useAtCheckoutUiData.getImageUrl(), null, androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(250.0f)), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFillWidth(), startRestartGroup, 197040, 24);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(useAtCheckoutUiData.getTitle(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 2, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 0, 6, 1004);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize8()), startRestartGroup, 0);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(useAtCheckoutUiData.getDescription(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24(), 0.0f, 2, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 0, 6, 1004);
                startRestartGroup.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize24()), startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function03, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_use_at_checkout_details_cta_title, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i4 >> 3) & 14) | 1769856, 408);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function02 = function03;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt.$r8$lambda$wBBbfNEDpgpGdC7T8RKSx7lpeV4(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData.this, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void UseAtCheckoutBottomSheetPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(766426029);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(766426029, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetPreview (UseAtCheckoutBottomSheet.kt:164)");
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData useAtCheckoutUiData = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData("Use $10 at checkout", "You are about to use 1,000 points worth $10 at checkout.", "https://cdn-48c99f0db4284.static.engineering.dev.paypalinc.com/shopping/oslo-rewards/redeem-checkout.png");
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(null, null, 3, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt.$r8$lambda$fmhoViIVwmY443REZZd5ibVbfqs((kotlin.jvm.functions.Function0) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            UseAtCheckoutBottomSheet(useAtCheckoutUiData, appNavigator, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, 390, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.UseAtCheckoutBottomSheetKt.$r8$lambda$tGALFjMCjmI6yrZZ6OeE5RkXBFQ(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$BrGxe_pqFHPH2yEv-S3J32OQ7Cs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19493$r8$lambda$BrGxe_pqFHPH2yEvS3J32OQ7Cs(androidx.view.OnBackPressedDispatcher onBackPressedDispatcher) {
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_EmpoCk7wd75ohttOZ32px-OOLg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19494$r8$lambda$_EmpoCk7wd75ohttOZ32pxOOLg(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData useAtCheckoutUiData, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.UseAtCheckoutViewModel useAtCheckoutViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UseAtCheckoutBottomSheet(useAtCheckoutUiData, appNavigator, function1, useAtCheckoutViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fmhoViIVwmY443REZZd5ibVbfqs(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tGALFjMCjmI6yrZZ6OeE5RkXBFQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        UseAtCheckoutBottomSheetPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wBBbfNEDpgpGdC7T8RKSx7lpeV4(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.UseAtCheckoutUiData useAtCheckoutUiData, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        UseAtCheckoutContent(useAtCheckoutUiData, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
