package com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"TestTagAmountEntryScreenRoot", "", "TestTagAmountEntryBackButton", "TestTagAmountEntryCloseButton", "TestTagAmountEntryAvailableBalance", "TestTagAmountEntryCurrencyRow", "TestTagAmountEntryKeyboard", "TestTagAmountEntryContinueButton", "TestTagAmountEntryErrorAlert", "TransferAmountEntry", "", "amount", "callbacks", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/amountentry/TransferAmountCallbacks;", "currencyNavigation", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/amountentry/CurrencyNavigationContext;", "modifier", "Landroidx/compose/ui/Modifier;", "errorMessage", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/amountentry/TransferAmountCallbacks;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/amountentry/CurrencyNavigationContext;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "TransferAmountEntryPreview", "(Landroidx/compose/runtime/Composer;I)V", "TransferAmountEntryWithErrorPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransferAmountEntryKt {
    public static final java.lang.String TestTagAmountEntryAvailableBalance = "amount_entry_available_balance";
    public static final java.lang.String TestTagAmountEntryBackButton = "amount_entry_back_button";
    public static final java.lang.String TestTagAmountEntryCloseButton = "amount_entry_close_button";
    public static final java.lang.String TestTagAmountEntryContinueButton = "amount_entry_continue_button";
    public static final java.lang.String TestTagAmountEntryCurrencyRow = "amount_entry_currency_row";
    public static final java.lang.String TestTagAmountEntryErrorAlert = "amount_entry_error_alert";
    public static final java.lang.String TestTagAmountEntryKeyboard = "amount_entry_keyboard";
    public static final java.lang.String TestTagAmountEntryScreenRoot = "amount_entry_screen_root";

    /* JADX WARN: Removed duplicated region for block: B:104:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferAmountEntry(final java.lang.String str, final com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks transferAmountCallbacks, final com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext currencyNavigationContext, androidx.compose.ui.Modifier modifier, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str3;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str5;
        int i6;
        androidx.compose.runtime.Composer composer3;
        float f;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAmountCallbacks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyNavigationContext, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-984305059);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(transferAmountCallbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(currencyNavigationContext) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str3 = str2;
                i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    str4 = str3;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str6 = i4 != 0 ? null : str3;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-984305059, i5, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntry (TransferAmountEntry.kt:113)");
                    }
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), TestTagAmountEntryScreenRoot);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.$r8$lambda$JkQLViiqR7sRYrq5vrsZJpGPK9s((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1706padding3ABfNKs, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_back, startRestartGroup, 0);
                    com.paypal.pds.core.Icon.ArrowLeft arrowLeft = com.paypal.pds.core.Icon.ArrowLeft.INSTANCE;
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAmountEntryBackButton);
                    androidx.compose.ui.semantics.Role m7792boximpl = androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
                    int i10 = i5 & 112;
                    boolean z = i10 == 32;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.m21311$r8$lambda$GxbQaGx8Ug_3aDz6TyxmSuImOo(com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(testTag2, null, null, false, m7792boximpl, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, 23);
                    boolean changed = startRestartGroup.changed(stringResource);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.m21315$r8$lambda$wT2JasCgw1qZJLxJy_70zSYiVY(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.IconKt.Icon(arrowLeft, null, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m22100clickable_mRqjOc, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), null, null, startRestartGroup, 54, 24);
                    final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_close, startRestartGroup, 0);
                    com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
                    androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAmountEntryCloseButton);
                    androidx.compose.ui.semantics.Role m7792boximpl2 = androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
                    boolean z2 = i10 == 32;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.m21314$r8$lambda$YqZdWBZfrs5jNL5XrWvQLZAU6w(com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.ui.Modifier m22100clickable_mRqjOc2 = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(testTag3, null, null, false, m7792boximpl2, null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 6, 23);
                    boolean changed2 = startRestartGroup.changed(stringResource2);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.m21313$r8$lambda$XkQvzIIpaY18054JPDrBBtMw6A(stringResource2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.pds.components.IconKt.Icon(xMark, null, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m22100clickable_mRqjOc2, false, (kotlin.jvm.functions.Function1) rememberedValue5, 1, null), null, null, startRestartGroup, 54, 24);
                    startRestartGroup.endNode();
                    androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null));
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, navigationBarsPadding);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    java.lang.String currency = currencyNavigationContext.getConfig().getSelectedCurrency().getCurrency();
                    try {
                        str5 = java.util.Currency.getInstance(currency).getDisplayName();
                    } catch (java.lang.IllegalArgumentException unused) {
                        str5 = currency;
                    }
                    startRestartGroup.startReplaceGroup(362881032);
                    java.lang.String str7 = str;
                    if (str7.length() == 0) {
                        i6 = 0;
                        str7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_zero, startRestartGroup, 0);
                    } else {
                        i6 = 0;
                    }
                    startRestartGroup.endReplaceGroup();
                    int i11 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_transfer_amount_content_description;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str5);
                    final java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(i11, new java.lang.Object[]{str7, str5}, startRestartGroup, i6);
                    androidx.compose.ui.Modifier testTag4 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "paypal_amount_display");
                    boolean changed3 = startRestartGroup.changed(stringResource3);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.$r8$lambda$g7gtdVQ70eYJuTOiGnPLr3kv3cg(stringResource3, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    int i12 = i5 & 14;
                    com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(str, currency, androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag4, (kotlin.jvm.functions.Function1) rememberedValue6), null, null, null, null, com.paypal.pds.core.Typography.DisplayLarge.INSTANCE, com.paypal.pds.core.Typography.DisplayLarge.INSTANCE, null, null, null, null, null, false, startRestartGroup, i12 | 113246208, 0, 32376);
                    if (str6 == null) {
                        composer3 = startRestartGroup;
                        composer3.startReplaceGroup(-1634713401);
                        composer3.endReplaceGroup();
                        f = 0.0f;
                        i8 = 0;
                        i7 = 1;
                    } else {
                        composer3 = startRestartGroup;
                        composer3.startReplaceGroup(-1634713400);
                        f = 0.0f;
                        i7 = 1;
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 6);
                        i8 = 0;
                        int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer3);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.pds.components.ContextualAlertKt.ContextualAlert(str6, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAmountEntryErrorAlert), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, composer3, (com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6) | 48, 0);
                        composer3.endNode();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer3, 0);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        composer3.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    }
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer3, i8);
                    java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_transfer_available_balance_with_amount, new java.lang.Object[]{com.paypal.oslo.feature.wallet.fifo.common.util.CurrencyUtils.INSTANCE.getCurrencySymbol$wallet_prodRelease(currencyNavigationContext.getConfig().getSelectedCurrency().getCurrency()), java.lang.Double.valueOf(currencyNavigationContext.getConfig().getSelectedCurrency().getAvailableBalance()), currencyNavigationContext.getConfig().getSelectedCurrency().getCurrency()}, composer3, i8);
                    com.paypal.pds.core.Typography.BodySmall bodySmall = com.paypal.pds.core.Typography.BodySmall.INSTANCE;
                    int i13 = i7;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource4, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAmountEntryAvailableBalance), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, bodySmall, composer4, 432, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer3, 0);
                    com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencySelectorKt.CurrencySelector(currencyNavigationContext.getConfig(), currencyNavigationContext.getNavigator(), currencyNavigationContext.getOnCurrencySelect(), composer3, 0);
                    float f2 = f;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer4, 0);
                    com.paypal.oslo.core.commonui.components.NumericKeyboardKt.AmountKeyboard(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) transferAmountCallbacks.getOnAmountChange(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, i13, null), TestTagAmountEntryKeyboard), 0, true, true, composer4, i12 | 221568, 8);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer4, 0);
                    composer2 = composer4;
                    com.paypal.pds.components.ButtonKt.Button(transferAmountCallbacks.getOnContinue(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_next, composer4, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f2, i13, null), TestTagAmountEntryContinueButton), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, true, false, composer4, 12779904, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
                    composer2.endNode();
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str4 = str6;
                    modifier3 = modifier5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.$r8$lambda$ruwOB4t2xAlcM80Rnm0xQeTcBlA(str, transferAmountCallbacks, currencyNavigationContext, modifier3, str4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str3 = str2;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str3 = str2;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$2zp2-1Rw34umJHPUBQLdO9njmao, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21310$r8$lambda$2zp21Rw34umJHPUBQLdO9njmao(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GxbQaGx-8Ug_3aDz6TyxmSuImOo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21311$r8$lambda$GxbQaGx8Ug_3aDz6TyxmSuImOo(com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks transferAmountCallbacks) {
        transferAmountCallbacks.getOnCloseClick().invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HHOkcAkrVPvZHSGn5_bDWCmU73E(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1332296651);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1332296651, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryWithErrorPreview (TransferAmountEntry.kt:280)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency("USD", 1250.0d, (java.lang.String) null, "preview-balance-id", 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.$r8$lambda$PQz8ZzNd9iRRk14p6JiohZOc3g8((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks transferAmountCallbacks = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks(function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig(kotlin.collections.CollectionsKt.listOf(selectedCurrency), selectedCurrency);
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(kotlin.collections.CollectionsKt.emptyList(), null, 2, null);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.m21310$r8$lambda$2zp21Rw34umJHPUBQLdO9njmao((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            TransferAmountEntry("5000.00", transferAmountCallbacks, new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext(currencySelectorConfig, appNavigator, (kotlin.jvm.functions.Function1) rememberedValue4), null, "Amount exceeds available balance", startRestartGroup, 24582, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.$r8$lambda$HHOkcAkrVPvZHSGn5_bDWCmU73E(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IhwwI13P01wW27NOL7rC8bnlcgk(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCurrency, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JkQLViiqR7sRYrq5vrsZJpGPK9s(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PQz8ZzNd9iRRk14p6JiohZOc3g8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VZit9BCOy3VtlNkOWtCoDhioVYs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-446975893);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-446975893, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryPreview (TransferAmountEntry.kt:252)");
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency selectedCurrency = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency("USD", 1250.0d, (java.lang.String) null, "preview-balance-id", 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.$r8$lambda$c2ZlOgfTaTjPLif1uQGbI8BIWZU((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks transferAmountCallbacks = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks(function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3);
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig currencySelectorConfig = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.CurrencySelectorConfig(kotlin.collections.CollectionsKt.listOf(selectedCurrency), selectedCurrency);
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = new com.paypal.oslo.core.navigation.AppNavigator(kotlin.collections.CollectionsKt.emptyList(), null, 2, null);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.$r8$lambda$IhwwI13P01wW27NOL7rC8bnlcgk((com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.SelectedCurrency) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            TransferAmountEntry("25.00", transferAmountCallbacks, new com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext(currencySelectorConfig, appNavigator, (kotlin.jvm.functions.Function1) rememberedValue4), null, null, startRestartGroup, 6, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountEntryKt.$r8$lambda$VZit9BCOy3VtlNkOWtCoDhioVYs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XkQvzII-paY18054JPDrBBtMw6A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21313$r8$lambda$XkQvzIIpaY18054JPDrBBtMw6A(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YqZdWBZfrs5jNL-5XrWvQLZAU6w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21314$r8$lambda$YqZdWBZfrs5jNL5XrWvQLZAU6w(com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks transferAmountCallbacks) {
        transferAmountCallbacks.getOnCloseClick().invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c2ZlOgfTaTjPLif1uQGbI8BIWZU(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g7gtdVQ70eYJuTOiGnPLr3kv3cg(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ruwOB4t2xAlcM80Rnm0xQeTcBlA(java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.TransferAmountCallbacks transferAmountCallbacks, com.paypal.oslo.feature.wallet.fifo.transfer.ui.amountentry.CurrencyNavigationContext currencyNavigationContext, androidx.compose.ui.Modifier modifier, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TransferAmountEntry(str, transferAmountCallbacks, currencyNavigationContext, modifier, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wT2JasCgw1qZJLxJy_70z-SYiVY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21315$r8$lambda$wT2JasCgw1qZJLxJy_70zSYiVY(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
