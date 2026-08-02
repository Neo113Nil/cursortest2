package com.paypal.oslo.feature.inappcheckout.ui.thanks.screen;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a7\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, d2 = {"ThanksScreen", "", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "thanksScreenData", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;", "viewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/viewmodel/ThanksViewModel;", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Lcom/paypal/oslo/feature/inappcheckout/domain/model/ThanksScreenData;Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/viewmodel/ThanksViewModel;Landroidx/compose/runtime/Composer;II)V", "PayPalHeader", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ThanksContent", "merchantName", "", "showReturnToMerchantButton", "", "onReturnToMerchantClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "defaultMerchantName", "context", "Landroid/content/Context;", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "inappcheckout_prodRelease", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$State;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThanksScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThanksScreen(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, final com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData, com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel2;
        final com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel3;
        com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel4;
        boolean changedInstance;
        boolean z;
        boolean changedInstance2;
        com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1 rememberedValue;
        boolean changedInstance3;
        boolean z2;
        com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$2$1 rememberedValue2;
        boolean changedInstance4;
        java.lang.Object rememberedValue3;
        boolean changedInstance5;
        java.lang.Object rememberedValue4;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thanksScreenData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1254215998);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(inAppCheckoutCoordinator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(thanksScreenData) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                thanksViewModel2 = thanksViewModel;
                if (startRestartGroup.changedInstance(thanksViewModel2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                thanksViewModel2 = thanksViewModel;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            thanksViewModel2 = thanksViewModel;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                    thanksViewModel3 = thanksViewModel2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(thanksViewModel3.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(thanksViewModel3);
                    if ((i5 & 14) == 4) {
                    }
                    changedInstance2 = startRestartGroup.changedInstance(context);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | z | changedInstance2)) {
                    }
                    rememberedValue = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1(thanksViewModel3, inAppCheckoutCoordinator, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    changedInstance3 = startRestartGroup.changedInstance(thanksViewModel3);
                    if ((i5 & 112) == 32) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance3 | z2)) {
                    }
                    rememberedValue2 = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$2$1(thanksViewModel3, thanksScreenData, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(thanksScreenData, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i5 >> 3) & 14);
                    changedInstance4 = startRestartGroup.changedInstance(thanksViewModel3);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance4) {
                    }
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.$r8$lambda$Bfsbzy23iJLogJ9ClPkVsAyS1bk(com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 1);
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.statusBarHeight(startRestartGroup, 0), 0.0f, 0.0f, 13, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    PayPalHeader(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), startRestartGroup, 0, 0);
                    java.lang.String merchantName = ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State) collectAsStateWithLifecycle.getValue()).getMerchantName();
                    boolean showReturnToMerchantButton = ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State) collectAsStateWithLifecycle.getValue()).getShowReturnToMerchantButton();
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    changedInstance5 = startRestartGroup.changedInstance(thanksViewModel3);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance5) {
                    }
                    rememberedValue4 = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda1(thanksViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    ThanksContent(merchantName, showReturnToMerchantButton, fillMaxSize$default, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 384, 0);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                }
            } else if ((i2 & 4) != 0) {
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                thanksViewModel4 = (com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                i5 &= -897;
                thanksViewModel3 = thanksViewModel4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1254215998, i5, -1, "com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreen (ThanksScreen.kt:66)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(thanksViewModel3.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(thanksViewModel3);
                z = (i5 & 14) == 4;
                changedInstance2 = startRestartGroup.changedInstance(context2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1(thanksViewModel3, inAppCheckoutCoordinator, context2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                changedInstance3 = startRestartGroup.changedInstance(thanksViewModel3);
                z2 = (i5 & 112) == 32;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance3 | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$2$1(thanksViewModel3, thanksScreenData, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(thanksScreenData, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i5 >> 3) & 14);
                changedInstance4 = startRestartGroup.changedInstance(thanksViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.$r8$lambda$Bfsbzy23iJLogJ9ClPkVsAyS1bk(com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 1);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.statusBarHeight(startRestartGroup, 0), 0.0f, 0.0f, 13, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default2);
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
                PayPalHeader(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), startRestartGroup, 0, 0);
                java.lang.String merchantName2 = ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State) collectAsStateWithLifecycle2.getValue()).getMerchantName();
                boolean showReturnToMerchantButton2 = ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State) collectAsStateWithLifecycle2.getValue()).getShowReturnToMerchantButton();
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                changedInstance5 = startRestartGroup.changedInstance(thanksViewModel3);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda1(thanksViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                ThanksContent(merchantName2, showReturnToMerchantButton2, fillMaxSize$default2, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 384, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            thanksViewModel4 = thanksViewModel2;
            thanksViewModel3 = thanksViewModel4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(thanksViewModel3.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            android.content.Context context22 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(thanksViewModel3);
            if ((i5 & 14) == 4) {
            }
            changedInstance2 = startRestartGroup.changedInstance(context22);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z | changedInstance2)) {
            }
            rememberedValue = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1(thanksViewModel3, inAppCheckoutCoordinator, context22, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            changedInstance3 = startRestartGroup.changedInstance(thanksViewModel3);
            if ((i5 & 112) == 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance3 | z2)) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$2$1(thanksViewModel3, thanksScreenData, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(thanksScreenData, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i5 >> 3) & 14);
            changedInstance4 = startRestartGroup.changedInstance(thanksViewModel3);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.$r8$lambda$Bfsbzy23iJLogJ9ClPkVsAyS1bk(com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 1);
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default22 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.statusBarHeight(startRestartGroup, 0), 0.0f, 0.0f, 13, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy22 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default22);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            PayPalHeader(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally()), startRestartGroup, 0, 0);
            java.lang.String merchantName22 = ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State) collectAsStateWithLifecycle22.getValue()).getMerchantName();
            boolean showReturnToMerchantButton22 = ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State) collectAsStateWithLifecycle22.getValue()).getShowReturnToMerchantButton();
            androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            changedInstance5 = startRestartGroup.changedInstance(thanksViewModel3);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue4 = new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda1(thanksViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            ThanksContent(merchantName22, showReturnToMerchantButton22, fillMaxSize$default22, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 384, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            thanksViewModel3 = thanksViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel5 = thanksViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.$r8$lambda$0B5mdMOJwS5aFjyc78yOkbhBujY(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, thanksScreenData, thanksViewModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PayPalHeader(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-982672008);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-982672008, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.PayPalHeader (ThanksScreen.kt:103)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(modifier3, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_paypal_logo, startRestartGroup, 0), com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_paypal_logo, new java.lang.Object[0], startRestartGroup, 0), androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(90.0f), com.paypal.pds.core.ConstantsKt.getSize32()), 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(250.0f), 0.0f, 11, null), androidx.compose.ui.Alignment.INSTANCE.getCenter()), androidx.compose.ui.layout.ContentScale.INSTANCE.getInside(), null, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 3072, 112);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.$r8$lambda$O2Y6FbmlPWcT2mVM4fB9aW5RuB8(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThanksContent(final java.lang.String str, final boolean z, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-398126803);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-398126803, i4, -1, "com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksContent (ThanksScreen.kt:128)");
                }
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier3, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier4 = modifier3;
                com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt.InAppCheckoutLoader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutTestTags.THANKS_SCREEN_LOADER), com.paypal.oslo.feature.inappcheckout.ui.common.LoaderSize.Large.INSTANCE, 0, 0, startRestartGroup, 54, 12);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 8, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_thanks, new java.lang.Object[0], startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                if (!z) {
                    startRestartGroup.startReplaceGroup(202697844);
                    int i7 = com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_description_text_template;
                    if (str == null) {
                        startRestartGroup.startReplaceGroup(2084755389);
                        i5 = 0;
                        str2 = defaultMerchantName(context, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        i5 = 0;
                        startRestartGroup.startReplaceGroup(2084754893);
                        startRestartGroup.endReplaceGroup();
                        str2 = str;
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, i7, new java.lang.Object[]{str2}, startRestartGroup, i5), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(203190558);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_redirect_description_text, new java.lang.Object[0], startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing4(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 384, 6, 1000);
                    java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_return_to_merchant_link_default, new java.lang.Object[0], startRestartGroup, 0);
                    com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Primary primary = com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Primary.INSTANCE;
                    com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Medium medium = com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Medium.INSTANCE;
                    boolean z2 = (i4 & 7168) == 2048;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.m15579$r8$lambda$sAZt6gnVrTKKqypzGdUnsjaGjM(kotlin.jvm.functions.Function0.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButtonKt.InAppCheckoutCTAButton(rememberStringValue, (kotlin.jvm.functions.Function0) rememberedValue, null, primary, medium, false, false, startRestartGroup, 27648, 100);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.$r8$lambda$R9D_IUSGYmWnK72F5J1oTJ5CJpM(str, z, modifier5, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.String defaultMerchantName(android.content.Context context, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(198594569, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.defaultMerchantName (ThanksScreen.kt:186)");
        }
        java.lang.String rememberStringValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_default_merchant_name, new java.lang.Object[0], composer, i & 14);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberStringValue;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0B5mdMOJwS5aFjyc78yOkbhBujY(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.domain.model.ThanksScreenData thanksScreenData, com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ThanksScreen(inAppCheckoutCoordinator, thanksScreenData, thanksViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bfsbzy23iJLogJ9ClPkVsAyS1bk(com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel) {
        thanksViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleBackPress.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O2Y6FbmlPWcT2mVM4fB9aW5RuB8(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayPalHeader(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R9D_IUSGYmWnK72F5J1oTJ5CJpM(java.lang.String str, boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ThanksContent(str, z, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WXhuDxzHB0PEE-TX07zdrp6pIeQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15578$r8$lambda$WXhuDxzHB0PEETX07zdrp6pIeQ(com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel) {
        thanksViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.HandleReturnToMerchantButtonClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sAZt6gnVrTKKqypzGdUns-jaGjM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15579$r8$lambda$sAZt6gnVrTKKqypzGdUnsjaGjM(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
