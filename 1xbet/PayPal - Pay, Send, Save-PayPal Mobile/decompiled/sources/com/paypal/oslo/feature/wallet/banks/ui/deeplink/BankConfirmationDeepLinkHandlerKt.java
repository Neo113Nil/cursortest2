package com.paypal.oslo.feature.wallet.banks.ui.deeplink;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/BankConfirmationDeepLink;", "destination", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "BankConfirmationDeepLinkHandler", "(Lcom/paypal/oslo/feature/wallet/api/navigation/BankConfirmationDeepLink;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "", "p0", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmFlowType;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/ConfirmFlowType;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "TestTagBankConfirmationDeepLinkLoader", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankConfirmationDeepLinkHandlerKt {
    public static final java.lang.String TestTagBankConfirmationDeepLinkLoader = "BankConfirmationDeepLinkLoader";

    public static final void BankConfirmationDeepLinkHandler(final com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink bankConfirmationDeepLink, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankConfirmationDeepLink, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1366974998);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bankConfirmationDeepLink) : startRestartGroup.changedInstance(bankConfirmationDeepLink) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1366974998, i2, -1, "com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandler (BankConfirmationDeepLinkHandler.kt:54)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(bankConfirmationDeepLink));
            boolean z2 = (i2 & 112) == 32;
            com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$BankConfirmationDeepLinkHandler$1$1(bankConfirmationDeepLink, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(bankConfirmationDeepLink, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i3 | com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink.$stable);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagBankConfirmationDeepLinkLoader), com.paypal.pds.components.LoaderSize.Large.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.LoaderSize.Large.$stable << 3) | 6, 12);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.deeplink.BankConfirmationDeepLinkHandlerKt.$r8$lambda$qccnbrgK15zFu9Eh8AGQDpPLN7M(com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        if (str == null) {
            return com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC;
        }
        if (kotlin.text.StringsKt.equals(str, "complete-instant-confirmation", true)) {
            return com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC;
        }
        java.util.Locale locale = java.util.Locale.US;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(upperCase, "-", "_", false, 4, (java.lang.Object) null);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.valueOf(replace$default));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType confirmFlowType = com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType.IBC;
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = confirmFlowType;
        }
        return (com.paypal.oslo.feature.wallet.api.ui.banks.config.ConfirmFlowType) m23436constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        if (str != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.util.Locale locale = java.util.Locale.US;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String upperCase = str.toUpperCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
            if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                m23436constructorimpl = bankAccountType;
            }
            com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType2 = (com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType) m23436constructorimpl;
            if (bankAccountType2 != null) {
                return bankAccountType2;
            }
        }
        return com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qccnbrgK15zFu9Eh8AGQDpPLN7M(com.paypal.oslo.feature.wallet.api.navigation.BankConfirmationDeepLink bankConfirmationDeepLink, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        BankConfirmationDeepLinkHandler(bankConfirmationDeepLink, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
