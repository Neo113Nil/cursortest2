package com.paypal.oslo.feature.wallet.common.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a&\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010*\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\u001e\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0010*\u0004\u0018\u00010\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"TestTagWalletTopBar", "", "TestTagLeading", "TestTagLeadingSpacer", "TestTagMiddle", "TestTagTrailing", "TestTagTrailingSpacer", com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.TestTagWalletTopBar, "", "config", "Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toTopBarElement", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$NavAction;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "toWalletTopBarProgress", "Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;", "(Lcom/paypal/oslo/feature/wallet/api/ui/config/WalletUIModels$Progress;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "WalletTopBarProgressBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "WalletTopBarTextPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WalletTopBarKt {
    public static final java.lang.String TestTagLeading = "WalletTopBar:Leading";
    public static final java.lang.String TestTagLeadingSpacer = "WalletTopBar:LeadingSpacer";
    public static final java.lang.String TestTagMiddle = "WalletTopBar:Middle";
    public static final java.lang.String TestTagTrailing = "WalletTopBar:Trailing";
    public static final java.lang.String TestTagTrailingSpacer = "WalletTopBar:TrailingSpacer";
    public static final java.lang.String TestTagWalletTopBar = "WalletTopBar";

    public static final void WalletTopBar(final com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletTopBarConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1699051681);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(walletTopBarConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1699051681, i3, -1, "com.paypal.oslo.feature.wallet.common.ui.WalletTopBar (WalletTopBar.kt:78)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier, TestTagWalletTopBar);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            if (walletTopBarConfig.getLeadingElement() == null) {
                startRestartGroup.startReplaceGroup(-282624906);
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), TestTagLeadingSpacer), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-282453569);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagLeading);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                walletTopBarConfig.getLeadingElement().invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagMiddle);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag3);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> middleElement = walletTopBarConfig.getMiddleElement();
            if (middleElement == null) {
                startRestartGroup.startReplaceGroup(1673247118);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1716543699);
                middleElement.invoke(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            startRestartGroup.endNode();
            if (walletTopBarConfig.getTrailingElement() == null) {
                startRestartGroup.startReplaceGroup(-282119947);
                androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), TestTagTrailingSpacer), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-281946936);
                androidx.compose.ui.Modifier testTag4 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagTrailing);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                walletTopBarConfig.getTrailingElement().invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.$r8$lambda$oHqmC2wE__uUr7hBakCBjVxL1a8(com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> toTopBarElement(final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navAction, "");
        if ((i2 & 1) != 0) {
            java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
            androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, composer, 0);
            if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            bankSharedViewModel = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1806352216, i, -1, "com.paypal.oslo.feature.wallet.common.ui.toTopBarElement (WalletTopBar.kt:133)");
        }
        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1771652059, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.m21218$r8$lambda$1r8zp2RP78UKiI0SlUwzkRKEn0(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.this, bankSharedViewModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberComposableLambda;
    }

    public static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> toWalletTopBarProgress(final com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1510629651, i, -1, "com.paypal.oslo.feature.wallet.common.ui.toWalletTopBarProgress (WalletTopBar.kt:172)");
        }
        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1804614736, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.$r8$lambda$y5wRGThholhrp6uw1N11UfzvWWM(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberComposableLambda;
    }

    public static final void WalletTopBarProgressBarPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2117329145);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2117329145, i, -1, "com.paypal.oslo.feature.wallet.common.ui.WalletTopBarProgressBarPreview (WalletTopBar.kt:195)");
            }
            WalletTopBar(new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$WalletTopBarKt.INSTANCE.getLambda$1166933899$wallet_prodRelease(), com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$WalletTopBarKt.INSTANCE.getLambda$415384746$wallet_prodRelease(), com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$WalletTopBarKt.INSTANCE.m21203getLambda$336164407$wallet_prodRelease()), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.$r8$lambda$3qT_pPjZqhgJOU8k7597bKgSAf4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void WalletTopBarTextPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1048452726);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1048452726, i, -1, "com.paypal.oslo.feature.wallet.common.ui.WalletTopBarTextPreview (WalletTopBar.kt:213)");
            }
            WalletTopBar(new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$WalletTopBarKt.INSTANCE.getLambda$1421216370$wallet_prodRelease(), com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$WalletTopBarKt.INSTANCE.getLambda$1670494771$wallet_prodRelease(), com.paypal.oslo.feature.wallet.common.ui.ComposableSingletons$WalletTopBarKt.INSTANCE.getLambda$1919773172$wallet_prodRelease()), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.$r8$lambda$Fhi0HeMf1GkW26bS9ai6jnmt2cw(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1r8zp-2RP78UKiI0SlUwzkRKEn0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21218$r8$lambda$1r8zp2RP78UKiI0SlUwzkRKEn0(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction navAction, final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1771652059, i, -1, "com.paypal.oslo.feature.wallet.common.ui.toTopBarElement.<anonymous> (WalletTopBar.kt:134)");
            }
            int i2 = com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.WhenMappings.$EnumSwitchMapping$0[navAction.ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(-1566542797);
                boolean changedInstance = composer.changedInstance(bankSharedViewModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.$r8$lambda$vuKsxYujoNAT5LG21uIzhupO5cU(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarLeadingElementKt.WalletTopBarBack((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
                composer.endReplaceGroup();
            } else if (i2 == 2) {
                composer.startReplaceGroup(-1566258155);
                boolean changedInstance2 = composer.changedInstance(bankSharedViewModel);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.$r8$lambda$anm3w2SxTd7p1cOrrmAWYfHJXZ8(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarTrailingElementKt.WalletTopBarClose((kotlin.jvm.functions.Function0) rememberedValue2, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (i2 != 3) {
                    composer.startReplaceGroup(1750580641);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1565973575);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_skip, composer, 0);
                boolean changedInstance3 = composer.changedInstance(bankSharedViewModel);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.$r8$lambda$7pn2RBQk3YPpqfX6AglujYVYpDs(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarTrailingElementKt.WalletTopBarButton(stringResource, null, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0, 2);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3qT_pPjZqhgJOU8k7597bKgSAf4(int i, androidx.compose.runtime.Composer composer, int i2) {
        WalletTopBarProgressBarPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7pn2RBQk3YPpqfX6AglujYVYpDs(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel) {
        bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fhi0HeMf1GkW26bS9ai6jnmt2cw(int i, androidx.compose.runtime.Composer composer, int i2) {
        WalletTopBarTextPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$anm3w2SxTd7p1cOrrmAWYfHJXZ8(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel) {
        bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oHqmC2wE__uUr7hBakCBjVxL1a8(com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WalletTopBar(walletTopBarConfig, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vuKsxYujoNAT5LG21uIzhupO5cU(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel) {
        bankSharedViewModel.finishFlowWithResult(new com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.Outcome.Cancelled(com.paypal.oslo.feature.wallet.banks.navigation.result.BankFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$y5wRGThholhrp6uw1N11UfzvWWM(com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress progress, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1804614736, i, -1, "com.paypal.oslo.feature.wallet.common.ui.toWalletTopBarProgress.<anonymous> (WalletTopBar.kt:173)");
            }
            if (progress instanceof com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous) {
                composer.startReplaceGroup(-1171882579);
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous continuous = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Continuous) progress;
                com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarMiddleElementKt.WalletTopBarProgress(continuous.getCurrentProgress(), continuous.getRange().getEnd(), 0, 0, composer, 0, 12);
                composer.endReplaceGroup();
            } else if (progress instanceof com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented) {
                composer.startReplaceGroup(-1171668028);
                com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented segmented = (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress.Segmented) progress;
                com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarMiddleElementKt.WalletTopBarProgress(segmented.getCurrentProgress(), 0.0f, segmented.getTotalSegments(), segmented.getCurrentSegment(), composer, 0, 2);
                composer.endReplaceGroup();
            } else {
                if (progress != null) {
                    composer.startReplaceGroup(932026992);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1171452083);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.CLOSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.SKIP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
