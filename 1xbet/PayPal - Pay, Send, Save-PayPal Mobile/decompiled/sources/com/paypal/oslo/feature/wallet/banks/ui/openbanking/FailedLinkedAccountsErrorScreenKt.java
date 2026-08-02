package com.paypal.oslo.feature.wallet.banks.ui.openbanking;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u0087\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001aO\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010#\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006$²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u0084\u0002"}, d2 = {"TestTagHeader", "", "TestTagAvatar", "TestTagNotLinkedLabel", "TestTagPrimaryButton", "TestTagSecondaryButton", "FailedLinkedAccountsErrorScreen", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "icon", "Lcom/paypal/pds/core/Icon;", "failedBankAccounts", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/FailedBankAccountResult;", "primaryButtonText", "secondaryButtonText", "onPrimaryButtonClick", "Lkotlin/Function0;", "onSecondaryButtonClick", "bankLogoBase64", "shouldShowNotLinkedTitle", "", "shouldShowIndividualErrorMessage", "topBarConfig", "Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZZLcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;Landroidx/compose/runtime/Composer;III)V", "viewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel;", "onCloseClick", "onGoBackClick", "bankSharedViewModel", "Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;", "(Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/banks/ui/BankSharedViewModel;Lcom/paypal/oslo/feature/wallet/common/ui/WalletTopBarConfig;Landroidx/compose/runtime/Composer;II)V", "ErrorScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "navigateTo", "Lcom/paypal/oslo/feature/wallet/banks/ui/openbanking/FailedLinkedAccountsErrorViewModel$NavigateTo;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FailedLinkedAccountsErrorScreenKt {
    public static final java.lang.String TestTagAvatar = "FailedLinkedAccountsErrorScreen:Avatar";
    public static final java.lang.String TestTagHeader = "FailedLinkedAccountsErrorScreen:Header";
    public static final java.lang.String TestTagNotLinkedLabel = "FailedLinkedAccountsErrorScreen:NotLinkedLabel";
    public static final java.lang.String TestTagPrimaryButton = "FailedLinkedAccountsErrorScreen:PrimaryButton";
    public static final java.lang.String TestTagSecondaryButton = "FailedLinkedAccountsErrorScreen:SecondaryButton";

    /* JADX WARN: Code restructure failed: missing block: B:70:0x012c, code lost:
    
        if (r4.changed(r53) != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FailedLinkedAccountsErrorScreen(final java.lang.String str, final java.lang.String str2, final com.paypal.pds.core.Icon icon, final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list, final java.lang.String str3, final java.lang.String str4, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str5, boolean z, boolean z2, com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        java.lang.String str6;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str7;
        final boolean z3;
        boolean z4;
        com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig2;
        java.lang.String str8;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        java.lang.String str9;
        boolean z8;
        com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1970797280);
        int i6 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        int i7 = 32;
        if ((i & 48) == 0) {
            i6 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= startRestartGroup.changed(icon) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= startRestartGroup.changedInstance(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= startRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i6 |= startRestartGroup.changed(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i6 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i6 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        int i8 = i3 & 256;
        if (i8 != 0) {
            i6 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i6 |= startRestartGroup.changed(str5) ? 67108864 : 33554432;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i6 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i6 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i4 = i2 | 6;
            str6 = "";
        } else {
            str6 = "";
            i4 = (i2 & 6) == 0 ? i2 | (startRestartGroup.changed(z2) ? 4 : 2) : i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2048) != 0) {
            }
            i7 = 16;
            i4 |= i7;
        }
        if (startRestartGroup.shouldExecute(((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                str8 = i8 != 0 ? str6 : str5;
                z5 = i9 != 0 ? true : z;
                z6 = i10 != 0 ? false : z2;
                if ((i3 & 2048) != 0) {
                    z7 = z5;
                    i5 = i4 & (-113);
                    str9 = str8;
                    z8 = z6;
                    walletTopBarConfig3 = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, null, 7, null);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1970797280, i6, i5, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreen (FailedLinkedAccountsErrorScreen.kt:106)");
                    }
                    androidx.compose.ui.Modifier systemBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2));
                    final boolean z9 = z8;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, systemBarsPadding);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    final java.lang.String str10 = str9;
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.WalletTopBar(walletTopBarConfig3, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), startRestartGroup, (i5 >> 3) & 14, 0);
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
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
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    int i11 = i6;
                    walletTopBarConfig2 = walletTopBarConfig3;
                    java.lang.String str11 = str6;
                    com.paypal.pds.components.HeaderKt.Header(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagHeader), str2, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Center, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1801668225, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.m20924$r8$lambda$BHS0GTFYCLxEM3Xk1rsU1BJviI(com.paypal.pds.core.Icon.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, (i6 & 14) | 221232 | ((i6 << 3) & 896), 72);
                    startRestartGroup.endNode();
                    if (!z7) {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1886754839);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_not_linked, composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagNotLinkedLabel), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 432, 6, 1016);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.pds.core.ConstantsKt.getSpacing8() + com.paypal.pds.core.ConstantsKt.getSpacing2())), composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(-1886381010);
                        composer2.endReplaceGroup();
                    }
                    androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, weight$default2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    composer2.startReplaceGroup(-232642651);
                    java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list2 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (final com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult failedBankAccountResult : list2) {
                        java.lang.String issuerName = failedBankAccountResult.getIssuerName();
                        arrayList.add(com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.asListItem(failedBankAccountResult, issuerName == null ? str11 : issuerName, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(193320787, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.m20925$r8$lambda$NcJbPJDd_fVb0VEpqhW_r6Z75E(str10, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, composer2, 54), com.paypal.oslo.feature.wallet.banks.ui.openbanking.ComposableSingletons$FailedLinkedAccountsErrorScreenKt.INSTANCE.m20918getLambda$35966670$wallet_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-265254127, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$QDDHS6WywF3wsIOOCJQuy6jTt24(z9, failedBankAccountResult, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, composer2, 54), composer2, 28032));
                    }
                    composer2.endReplaceGroup();
                    com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.BankList(arrayList, composer2, 0);
                    composer2.endNode();
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy5 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                    int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1710paddingqDBjuR0$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (!composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance5 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    com.paypal.pds.components.ButtonKt.Button(function0, str3, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), TestTagPrimaryButton), null, null, null, null, false, false, composer3, ((i11 >> 18) & 14) | 384 | ((i11 >> 9) & 112), 504);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
                    com.paypal.pds.components.ButtonKt.Button(function02, str4, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), TestTagSecondaryButton), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, false, false, composer3, ((i11 >> 21) & 14) | 196992 | ((i11 >> 12) & 112), 472);
                    composer2.endNode();
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str7 = str10;
                    z4 = z9;
                    z3 = z7;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i3 & 2048) != 0) {
                    i4 &= -113;
                }
                str8 = str5;
                z5 = z;
                z6 = z2;
            }
            z7 = z5;
            str9 = str8;
            z8 = z6;
            i5 = i4;
            walletTopBarConfig3 = walletTopBarConfig;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.ui.Modifier systemBarsPadding2 = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.systemBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2));
            final boolean z92 = z8;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy6 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode6 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, systemBarsPadding2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            final java.lang.String str102 = str9;
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, columnMeasurePolicy6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl6, java.lang.Integer.valueOf(hashCode6), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance6 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.wallet.common.ui.WalletTopBarKt.WalletTopBar(walletTopBarConfig3, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), startRestartGroup, (i5 >> 3) & 14, 0);
            androidx.compose.ui.Modifier weight$default3 = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance6, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy22 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default3);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, columnMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance22 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default2 = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy32 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode32 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier32 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor32 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl32 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, columnMeasurePolicy32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, currentCompositionLocalMap32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl32, java.lang.Integer.valueOf(hashCode32), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, materializeModifier32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance32 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            int i112 = i6;
            walletTopBarConfig2 = walletTopBarConfig3;
            java.lang.String str112 = str6;
            com.paypal.pds.components.HeaderKt.Header(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagHeader), str2, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Center, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1801668225, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.m20924$r8$lambda$BHS0GTFYCLxEM3Xk1rsU1BJviI(com.paypal.pds.core.Icon.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, (i6 & 14) | 221232 | ((i6 << 3) & 896), 72);
            startRestartGroup.endNode();
            if (!z7) {
            }
            androidx.compose.ui.Modifier weight$default22 = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance22, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy42 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int hashCode42 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap42 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier42 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, weight$default22);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor42 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl42 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl42, columnMeasurePolicy42, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl42, currentCompositionLocalMap42, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl42, java.lang.Integer.valueOf(hashCode42), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl42, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl42, materializeModifier42, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance42 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            composer2.startReplaceGroup(-232642651);
            java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> list22 = list;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list22, 10));
            while (r0.hasNext()) {
            }
            composer2.endReplaceGroup();
            com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.BankList(arrayList2, composer2, 0);
            composer2.endNode();
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy52 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int hashCode52 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap52 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier52 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1710paddingqDBjuR0$default2);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor52 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl52 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl52, columnMeasurePolicy52, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl52, currentCompositionLocalMap52, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl52, java.lang.Integer.valueOf(hashCode52), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl52, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl52, materializeModifier52, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance52 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.runtime.Composer composer32 = composer2;
            com.paypal.pds.components.ButtonKt.Button(function0, str3, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), TestTagPrimaryButton), null, null, null, null, false, false, composer32, ((i112 >> 18) & 14) | 384 | ((i112 >> 9) & 112), 504);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            com.paypal.pds.components.ButtonKt.Button(function02, str4, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), TestTagSecondaryButton), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, false, false, composer32, ((i112 >> 21) & 14) | 196992 | ((i112 >> 12) & 112), 472);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            str7 = str102;
            z4 = z92;
            z3 = z7;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            str7 = str5;
            z3 = z;
            z4 = z2;
            walletTopBarConfig2 = walletTopBarConfig;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z10 = z4;
            final com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig4 = walletTopBarConfig2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$T1DDyzi1y4F_tjFBWIvv_x41n_Y(str, str2, icon, list, str3, str4, function0, function02, str7, z3, z10, walletTopBarConfig4, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FailedLinkedAccountsErrorScreen(final com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel failedLinkedAccountsErrorViewModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        java.lang.String str2;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel2;
        com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig2;
        final com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel3;
        com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig4;
        int i3;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel4;
        com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig5;
        java.lang.String str4;
        com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel5;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        java.lang.String stringResource3;
        java.lang.String stringResource4;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedLinkedAccountsErrorViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-109118884);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(failedLinkedAccountsErrorViewModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            str2 = str;
            i5 |= startRestartGroup.changed(str2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    bankSharedViewModel2 = bankSharedViewModel;
                    if (startRestartGroup.changedInstance(bankSharedViewModel2)) {
                        i4 = 16384;
                        i5 |= i4;
                    }
                } else {
                    bankSharedViewModel2 = bankSharedViewModel;
                }
                i4 = 8192;
                i5 |= i4;
            } else {
                bankSharedViewModel2 = bankSharedViewModel;
            }
            if ((196608 & i) != 0) {
                walletTopBarConfig2 = walletTopBarConfig;
                i5 |= ((i2 & 32) == 0 && startRestartGroup.changed(walletTopBarConfig2)) ? 131072 : 65536;
            } else {
                walletTopBarConfig2 = walletTopBarConfig;
            }
            if (startRestartGroup.shouldExecute((74899 & i5) == 74898, i5 & 1)) {
                startRestartGroup.skipToGroupEnd();
                walletTopBarConfig3 = walletTopBarConfig;
                str3 = str2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    java.lang.String str5 = i6 != 0 ? "" : str2;
                    if ((i2 & 16) != 0) {
                        java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                        androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) consume;
                        bankSharedViewModel3 = (com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel.class), viewModelStoreOwner, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner, startRestartGroup, 0), viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                        i5 &= -57345;
                    } else {
                        bankSharedViewModel3 = bankSharedViewModel2;
                    }
                    if ((i2 & 32) != 0) {
                        walletTopBarConfig4 = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1481869266, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$UGu0cIDqobZhf1HJjrND85EolQc(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), 3, null);
                        i5 &= -458753;
                    } else {
                        walletTopBarConfig4 = walletTopBarConfig;
                    }
                    i3 = i5;
                    bankSharedViewModel4 = bankSharedViewModel3;
                    walletTopBarConfig5 = walletTopBarConfig4;
                    str4 = str5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i5 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i5 &= -458753;
                    }
                    i3 = i5;
                    str4 = str2;
                    walletTopBarConfig5 = walletTopBarConfig2;
                    bankSharedViewModel4 = bankSharedViewModel2;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-109118884, i3, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreen (FailedLinkedAccountsErrorScreen.kt:234)");
                }
                int i7 = i3;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(failedLinkedAccountsErrorViewModel.getNavigateToDestination(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo navigateTo = (com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo) collectAsStateWithLifecycle.getValue();
                boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                boolean changedInstance = startRestartGroup.changedInstance(bankSharedViewModel4);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$FailedLinkedAccountsErrorScreen$4$1(bankSharedViewModel4, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(navigateTo, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                if (failedLinkedAccountsErrorViewModel.getErrorScreenType() instanceof com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) {
                    startRestartGroup.startReplaceGroup(530757564);
                    if (((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType() == com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsFailType.TERMINAL) {
                        startRestartGroup.startReplaceGroup(530820494);
                        com.paypal.pds.core.Icon.Alert alert = com.paypal.pds.core.Icon.Alert.INSTANCE;
                        if (failedLinkedAccountsErrorViewModel.getFailedLinkedAccounts().size() == 1) {
                            startRestartGroup.startReplaceGroup(530906240);
                            stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getTitleSingle(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(531013438);
                            stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getTitleMultiple(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (failedLinkedAccountsErrorViewModel.getFailedLinkedAccounts().size() == 1) {
                            startRestartGroup.startReplaceGroup(531194106);
                            stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getDescriptionSingle(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(531307256);
                            stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getDescriptionMultiple(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        com.paypal.pds.components.AvatarEmphasis.Custom custom = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE);
                        java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getPrimaryButtonText(), startRestartGroup, 0);
                        boolean changedInstance2 = startRestartGroup.changedInstance(failedLinkedAccountsErrorViewModel);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$FailedLinkedAccountsErrorScreen$5$1(failedLinkedAccountsErrorViewModel);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue2;
                        com.paypal.pds.core.Icon.Alert alert2 = alert;
                        com.paypal.pds.components.AvatarEmphasis.Custom custom2 = custom;
                        boolean z = (i7 & 112) == 32;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$6zikSCpw8a4yqW2HSuZkSWiKr28(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        bankSharedViewModel5 = bankSharedViewModel4;
                        com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(alert2, stringResource3, stringResource4, stringResource5, true, custom2, false, (kotlin.jvm.functions.Function0) rememberedValue3, (kotlin.jvm.functions.Function0) kFunction, startRestartGroup, 24582, 64);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        bankSharedViewModel5 = bankSharedViewModel4;
                        startRestartGroup.startReplaceGroup(531955435);
                        if (failedLinkedAccountsErrorViewModel.getFailedLinkedAccounts().size() == 1) {
                            startRestartGroup.startReplaceGroup(532024224);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getTitleSingle(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(532131422);
                            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getTitleMultiple(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (failedLinkedAccountsErrorViewModel.getFailedLinkedAccounts().size() == 1) {
                            startRestartGroup.startReplaceGroup(532312090);
                            stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getDescriptionSingle(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(532425240);
                            stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getDescriptionMultiple(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getPrimaryButtonText(), startRestartGroup, 0);
                        java.lang.String stringResource7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(((com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.ErrorScreenType.SingleType) failedLinkedAccountsErrorViewModel.getErrorScreenType()).getFailType().getSecondaryButtonText(), startRestartGroup, 0);
                        com.paypal.pds.core.Icon.Alert alert3 = com.paypal.pds.core.Icon.Alert.INSTANCE;
                        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> failedLinkedAccounts = failedLinkedAccountsErrorViewModel.getFailedLinkedAccounts();
                        boolean changedInstance3 = startRestartGroup.changedInstance(failedLinkedAccountsErrorViewModel);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$FailedLinkedAccountsErrorScreen$7$1(failedLinkedAccountsErrorViewModel);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        com.paypal.pds.core.Icon.Alert alert4 = alert3;
                        kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue4);
                        boolean z2 = (i7 & 896) == 256;
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$1B03n6OTdX_d2E4BL4oJqqpuMD0(kotlin.jvm.functions.Function0.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        FailedLinkedAccountsErrorScreen(stringResource, stringResource2, alert4, failedLinkedAccounts, stringResource6, stringResource7, function03, (kotlin.jvm.functions.Function0) rememberedValue5, str4, false, false, walletTopBarConfig5, startRestartGroup, ((i7 << 15) & 234881024) | 384, (i7 >> 12) & 112, 1536);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    bankSharedViewModel5 = bankSharedViewModel4;
                    startRestartGroup.startReplaceGroup(533152128);
                    startRestartGroup.startReplaceGroup(-1783914570);
                    java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult> failedLinkedAccounts2 = failedLinkedAccountsErrorViewModel.getFailedLinkedAccounts();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(failedLinkedAccounts2, 10));
                    for (com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult failedBankAccountResult : failedLinkedAccounts2) {
                        arrayList.add(com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult.copy$default(failedBankAccountResult, null, null, null, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModelKt.toFailedLinkedAccountsFailType(failedBankAccountResult.getErrorType()).getErrorMessage(), startRestartGroup, 0), null, null, 111, null));
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    startRestartGroup.endReplaceGroup();
                    java.lang.String stringResource8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_title_multiple, startRestartGroup, 0);
                    com.paypal.pds.core.Icon.Alert alert5 = com.paypal.pds.core.Icon.Alert.INSTANCE;
                    java.lang.String stringResource9 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_link_different_bank, startRestartGroup, 0);
                    java.lang.String stringResource10 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_account_link_failure_go_back, startRestartGroup, 0);
                    boolean changedInstance4 = startRestartGroup.changedInstance(failedLinkedAccountsErrorViewModel);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$FailedLinkedAccountsErrorScreen$10$1(failedLinkedAccountsErrorViewModel);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    com.paypal.pds.core.Icon.Alert alert6 = alert5;
                    kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue6);
                    boolean z3 = (i7 & 896) == 256;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$QrRz4JN5Qc8saiSORLvuWQGA82c(kotlin.jvm.functions.Function0.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    FailedLinkedAccountsErrorScreen(stringResource8, "", alert6, arrayList2, stringResource9, stringResource10, function04, (kotlin.jvm.functions.Function0) rememberedValue7, str4, false, true, walletTopBarConfig5, startRestartGroup, ((i7 << 15) & 234881024) | 805306800, ((i7 >> 12) & 112) | 6, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                str3 = str4;
                walletTopBarConfig3 = walletTopBarConfig5;
                bankSharedViewModel2 = bankSharedViewModel5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel6 = bankSharedViewModel2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$sh8ADFfRTSsbTg23G0Bjdgcd9HA(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.this, function0, function02, str3, bankSharedViewModel6, walletTopBarConfig3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        str2 = str;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i5) == 74898, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ErrorScreenPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2006795243);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2006795243, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.ErrorScreenPreview (FailedLinkedAccountsErrorScreen.kt:322)");
            }
            com.paypal.pds.core.Icon.Alert alert = com.paypal.pds.core.Icon.Alert.INSTANCE;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult("123", "1234", com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType.CHECKING, "Bank of America", "Something went wrong", (com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType) null, (java.lang.String) null, 96, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig = new com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig(null, null, com.paypal.oslo.feature.wallet.banks.ui.openbanking.ComposableSingletons$FailedLinkedAccountsErrorScreenKt.INSTANCE.getLambda$414514701$wallet_prodRelease(), 3, null);
            com.paypal.pds.core.Icon.Alert alert2 = alert;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda12
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            FailedLinkedAccountsErrorScreen("This account can’t be linked", "They have reached their linking limit and can’t be added to your PayPal account.", alert2, listOf, "Link a Different Bank", "Go back", function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, false, true, walletTopBarConfig, startRestartGroup, 14377398, 6, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$x3yb0SuJl07R2W3vWGNgdM0_x4M(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1B03n6OTdX_d2E4BL4oJqqpuMD0(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6zikSCpw8a4yqW2HSuZkSWiKr28(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BHS-0GTFYCLxEM3Xk1rsU1BJviI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20924$r8$lambda$BHS0GTFYCLxEM3Xk1rsU1BJviI(com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1801668225, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FailedLinkedAccountsErrorScreen.kt:129)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(icon), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAvatar), com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundMuted.INSTANCE), null, null, composer, (com.paypal.pds.components.AvatarSize.XLarge.$stable << 6) | 48, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NcJ-bPJDd_fVb0VEpqhW_r6Z75E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20925$r8$lambda$NcJbPJDd_fVb0VEpqhW_r6Z75E(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(193320787, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FailedLinkedAccountsErrorScreen.kt:158)");
            }
            com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.BankLogo(str, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QDDHS6WywF3wsIOOCJQuy6jTt24(boolean z, com.paypal.oslo.feature.wallet.banks.domain.model.FailedBankAccountResult failedBankAccountResult, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-265254127, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FailedLinkedAccountsErrorScreen.kt:162)");
            }
            if (z) {
                composer.startReplaceGroup(554202050);
                java.lang.String errorMessage = failedBankAccountResult.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "";
                }
                com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.GetBottomElement(errorMessage, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(554308721);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$QrRz4JN5Qc8saiSORLvuWQGA82c(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rjj2hmx33mDIOAuuC2ZqWOwQdik(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T1DDyzi1y4F_tjFBWIvv_x41n_Y(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, java.util.List list, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str5, boolean z, boolean z2, com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        FailedLinkedAccountsErrorScreen(str, str2, icon, list, str3, str4, function0, function02, str5, z, z2, walletTopBarConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UGu0cIDqobZhf1HJjrND85EolQc(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1481869266, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreen.<anonymous> (FailedLinkedAccountsErrorScreen.kt:232)");
            }
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorScreenKt.$r8$lambda$Rjj2hmx33mDIOAuuC2ZqWOwQdik(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarTrailingElementKt.WalletTopBarClose((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sh8ADFfRTSsbTg23G0Bjdgcd9HA(com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel failedLinkedAccountsErrorViewModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str, com.paypal.oslo.feature.wallet.banks.ui.BankSharedViewModel bankSharedViewModel, com.paypal.oslo.feature.wallet.common.ui.WalletTopBarConfig walletTopBarConfig, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FailedLinkedAccountsErrorScreen(failedLinkedAccountsErrorViewModel, function0, function02, str, bankSharedViewModel, walletTopBarConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x3yb0SuJl07R2W3vWGNgdM0_x4M(int i, androidx.compose.runtime.Composer composer, int i2) {
        ErrorScreenPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo access$FailedLinkedAccountsErrorScreen$lambda$3(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.banks.ui.openbanking.FailedLinkedAccountsErrorViewModel.NavigateTo) state.getValue();
    }
}
