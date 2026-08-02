package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a1\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"TestTagThreeDsLoadingScreen", "", "TestTagThreeDsLoadingHeaderTitle", "TestTagThreeDsReassuranceLabel", "ReassuranceLabelDelayMs", "", "DotCount", "", "DefaultAnimationDurationMs", "LastDotIndexOffset", "", "ThreeDsInitScreen", "", "args", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenArgs;", "viewModel", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenViewModel;", "(Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenArgs;Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenViewModel;Landroidx/compose/runtime/Composer;II)V", "ThreeDsLoadingScreen", "cardLogoUrl", "headerTitle", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "reassuranceLabel", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/paypal/oslo/core/commonui/utils/RefText;Lcom/paypal/oslo/core/commonui/utils/RefText;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnimatedDots", "animationDurationMs", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ThreeDsLoadingScreenWithCardLogoPreview", "(Landroidx/compose/runtime/Composer;I)V", "ThreeDsLoadingScreenWithoutCardLogoPreview", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/threeds/init/ThreeDsInitScreenState;", "showReassuranceLabel", "", "progress"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ThreeDsInitScreenKt {
    public static final java.lang.String TestTagThreeDsLoadingHeaderTitle = "three_ds_loading_header_title";
    public static final java.lang.String TestTagThreeDsLoadingScreen = "three_ds_loading_screen";
    public static final java.lang.String TestTagThreeDsReassuranceLabel = "three_ds_reassurance_label";

    public static /* synthetic */ int $r8$lambda$MuKfSEh1mXdDpOg2wgzGXCrw2Ik(int i) {
        return -i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThreeDsInitScreen(final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenArgs threeDsInitScreenArgs, com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModel threeDsInitScreenViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModel threeDsInitScreenViewModel2;
        final com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModel threeDsInitScreenViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        boolean changedInstance;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsInitScreen$1$1 rememberedValue;
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState threeDsInitScreenState;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsInitScreenArgs, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-793431094);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(threeDsInitScreenArgs) : startRestartGroup.changedInstance(threeDsInitScreenArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                threeDsInitScreenViewModel2 = threeDsInitScreenViewModel;
                if (startRestartGroup.changedInstance(threeDsInitScreenViewModel2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                threeDsInitScreenViewModel2 = threeDsInitScreenViewModel;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            threeDsInitScreenViewModel2 = threeDsInitScreenViewModel;
        }
        int i5 = i3;
        boolean z2 = true;
        if (startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                i5 &= -113;
                threeDsInitScreenViewModel3 = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModelImpl.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-793431094, i5, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreen (ThreeDsInitScreen.kt:81)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(threeDsInitScreenViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(threeDsInitScreenViewModel3);
                if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !startRestartGroup.changedInstance(threeDsInitScreenArgs))) {
                    z2 = z;
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsInitScreen$1$1(threeDsInitScreenViewModel3, threeDsInitScreenArgs, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                threeDsInitScreenState = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState) collectAsStateWithLifecycle.getValue();
                if (!(threeDsInitScreenState instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowLoading)) {
                    startRestartGroup.startReplaceGroup(-1900319495);
                    com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen("", null, false, null, startRestartGroup, 390, 10);
                    startRestartGroup.endReplaceGroup();
                } else if (threeDsInitScreenState instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading) {
                    startRestartGroup.startReplaceGroup(-1900134208);
                    com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading showThreeDsLoading = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowThreeDsLoading) threeDsInitScreenState;
                    ThreeDsLoadingScreen(showThreeDsLoading.getCardLogoUrl(), showThreeDsLoading.getHeaderTitle(), showThreeDsLoading.getReassuranceLabel(), null, startRestartGroup, (com.paypal.oslo.core.commonui.utils.RefText.$stable << 3) | (com.paypal.oslo.core.commonui.utils.RefText.$stable << 6), 8);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(2016907214);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            z = false;
            threeDsInitScreenViewModel3 = threeDsInitScreenViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(threeDsInitScreenViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(threeDsInitScreenViewModel3);
            if ((i5 & 14) != 4) {
                z2 = z;
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | z2)) {
            }
            rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsInitScreen$1$1(threeDsInitScreenViewModel3, threeDsInitScreenArgs, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            threeDsInitScreenState = (com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState) collectAsStateWithLifecycle2.getValue();
            if (!(threeDsInitScreenState instanceof com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenState.ShowLoading)) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            threeDsInitScreenViewModel3 = threeDsInitScreenViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt.$r8$lambda$19O1gRMPNgX1tuc7XrWsjURH9S0(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenArgs.this, threeDsInitScreenViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThreeDsLoadingScreen(final java.lang.String str, final com.paypal.oslo.core.commonui.utils.RefText refText, final com.paypal.oslo.core.commonui.utils.RefText refText2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-382179481);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(refText) : startRestartGroup.changedInstance(refText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(refText2) : startRestartGroup.changedInstance(refText2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-382179481, i4, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsLoadingScreen (ThreeDsInitScreen.kt:113)");
                }
                com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1 rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1(null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.State produceState = androidx.compose.runtime.SnapshotStateKt.produceState(java.lang.Boolean.FALSE, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 6);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.pds.core.ConstantsKt.getSpacing48() + com.paypal.pds.core.ConstantsKt.getSpacing2()), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.pds.core.ConstantsKt.getSpacing48() + com.paypal.pds.core.ConstantsKt.getSpacing4()), 0.0f, 10, null), TestTagThreeDsLoadingScreen);
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
                androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                modifier3 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(refText, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | ((i4 >> 3) & 14)), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagThreeDsLoadingHeaderTitle), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 48, 6, 1004);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                boolean booleanValue = ((java.lang.Boolean) produceState.getValue()).booleanValue();
                androidx.compose.animation.core.TweenSpec tween$default = androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 7, null);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt.$r8$lambda$MuKfSEh1mXdDpOg2wgzGXCrw2Ik(((java.lang.Integer) obj).intValue()));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, booleanValue, (androidx.compose.ui.Modifier) null, androidx.compose.animation.EnterExitTransitionKt.slideInVertically(tween$default, (kotlin.jvm.functions.Function1) rememberedValue2).plus(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, 2, null)), (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1954200557, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt.$r8$lambda$0gUNfucHQfN9ei13eoa0jmWc0LM(com.paypal.oslo.core.commonui.utils.RefText.this, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 1572870, 26);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(m1602spacedBy0680j_4, centerVertically, startRestartGroup, 48);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.LogoPaypalMarkColor.INSTANCE), com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderMuted.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), startRestartGroup, 390, 0), com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.Unspecified.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 48);
                getHighSpeedVideoFpsRanges(1500, null, startRestartGroup, 6, 2);
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str, null, null, null, null, startRestartGroup, i4 & 14, 30), null, 2, null), null, com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.BackgroundBase.INSTANCE), null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 50);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt.m21087$r8$lambda$JOmh_SKrk2fvFPVzrCartbtafg(str, refText, refText2, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final int i, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-228912387);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-228912387, i4, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.AnimatedDots (ThreeDsInitScreen.kt:191)");
            }
            androidx.compose.runtime.State<java.lang.Float> animateFloat = androidx.compose.animation.core.InfiniteTransitionKt.animateFloat(androidx.compose.animation.core.InfiniteTransitionKt.rememberInfiniteTransition("dots", startRestartGroup, 6, 0), 0.0f, 4.0f, androidx.compose.animation.core.AnimationSpecKt.m1184infiniteRepeatable9IiC70o$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(i, 0, androidx.compose.animation.core.EasingKt.getLinearEasing(), 2, null), androidx.compose.animation.core.RepeatMode.Reverse, 0L, 4, null), "dotProgress", startRestartGroup, androidx.compose.animation.core.InfiniteTransition.$stable | 24624 | (androidx.compose.animation.core.InfiniteRepeatableSpec.$stable << 9), 0);
            java.lang.Object obj = com.paypal.pds.core.Color.ContentFaint.INSTANCE;
            java.lang.Object obj2 = com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE;
            int roundToInt = kotlin.math.MathKt.roundToInt(animateFloat.getValue().floatValue());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
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
            startRestartGroup.startReplaceGroup(-479905427);
            int i6 = 0;
            while (i6 < 5) {
                androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize8()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) (i6 == roundToInt % 5 ? obj : obj2), (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 0, 2), startRestartGroup, 0);
                i6++;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt.$r8$lambda$GBh_hsjHLPn3oLLvnVI8defb4AI(i, modifier, i2, i3, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0gUNfucHQfN9ei13eoa0jmWc0LM(com.paypal.oslo.core.commonui.utils.RefText refText, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1954200557, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsLoadingScreen.<anonymous>.<anonymous>.<anonymous> (ThreeDsInitScreen.kt:143)");
        }
        java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(refText, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
        com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
        int m8443getCentere0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(value, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagThreeDsReassuranceLabel), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk), null, false, 0, 0, null, bodyMedium, composer, 432, 6, 1000);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$19O1gRMPNgX1tuc7XrWsjURH9S0(com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenArgs threeDsInitScreenArgs, com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenViewModel threeDsInitScreenViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ThreeDsInitScreen(threeDsInitScreenArgs, threeDsInitScreenViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GBh_hsjHLPn3oLLvnVI8defb4AI(int i, androidx.compose.ui.Modifier modifier, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        getHighSpeedVideoFpsRanges(i, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JOmh_SK-rk2fvFPVzrCartbtafg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21087$r8$lambda$JOmh_SKrk2fvFPVzrCartbtafg(java.lang.String str, com.paypal.oslo.core.commonui.utils.RefText refText, com.paypal.oslo.core.commonui.utils.RefText refText2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ThreeDsLoadingScreen(str, refText, refText2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N348eetn870A0FQR_cfwxThyz0M(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(553841878);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(553841878, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsLoadingScreenWithoutCardLogoPreview (ThreeDsInitScreen.kt:238)");
            }
            ThreeDsLoadingScreen(null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("We're confirming your info with"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Just a few more seconds"), null, startRestartGroup, (com.paypal.oslo.core.commonui.utils.RefText.$stable << 3) | 6 | (com.paypal.oslo.core.commonui.utils.RefText.$stable << 6), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt.$r8$lambda$N348eetn870A0FQR_cfwxThyz0M(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SP5H54RgRV-0x7K0lJmXxEqn5EQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21088$r8$lambda$SP5H54RgRV0x7K0lJmXxEqn5EQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1298804218);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1298804218, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsLoadingScreenWithCardLogoPreview (ThreeDsInitScreen.kt:228)");
            }
            ThreeDsLoadingScreen("https://example.com/card-logo.png", com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("We're confirming your info with"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Just a few more seconds"), null, startRestartGroup, (com.paypal.oslo.core.commonui.utils.RefText.$stable << 3) | 6 | (com.paypal.oslo.core.commonui.utils.RefText.$stable << 6), 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt.m21088$r8$lambda$SP5H54RgRV0x7K0lJmXxEqn5EQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
