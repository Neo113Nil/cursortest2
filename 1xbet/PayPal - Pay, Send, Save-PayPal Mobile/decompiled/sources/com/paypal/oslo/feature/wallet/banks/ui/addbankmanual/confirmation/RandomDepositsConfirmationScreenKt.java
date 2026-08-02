package com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u001d\u001a\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0001H\u0000\u001a\f\u0010#\u001a\u00020$*\u00020%H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000¨\u0006&²\u0006\n\u0010'\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0018X\u008a\u008e\u0002"}, d2 = {"TestTagTitle", "", "TestTagBody", "TestTagFirstAmount", "TestTagSecondAmount", "TestTagButton", "TestTagClose", "NUMERIC_INPUT_REGEX", "Lkotlin/text/Regex;", "getNUMERIC_INPUT_REGEX", "()Lkotlin/text/Regex;", "MaxDepositAmountDigits", "", "RandomDepositsConfirmationScreen", "", "bankAccountDetails", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;", "onConfirmClick", "Lkotlin/Function2;", "onBackClick", "Lkotlin/Function0;", "onCloseClick", "onIbcFlowClick", "showBanner", "", "bannerTitle", "isLoading", "shouldShowBack", "showInstantConfirmationLink", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAccountDetails;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;ZZZLandroidx/compose/runtime/Composer;II)V", "getAmountFieldAlerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "isAmountAlertDisplayed", "text", "validate", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/ValidationResult;", "Lcom/paypal/oslo/feature/wallet/banks/ui/addbankmanual/confirmation/DepositAmounts;", "wallet_prodRelease", "firstAmount", "secondAmount", "isFirstAmountAlertDisplayed", "isSecondAmountAlertDisplayed"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RandomDepositsConfirmationScreenKt {
    public static final int MaxDepositAmountDigits = 2;
    public static final java.lang.String TestTagBody = "random_deposits_confirm_body";
    public static final java.lang.String TestTagButton = "random_deposits_confirm_button";
    public static final java.lang.String TestTagClose = "random_deposits_confirm_close";
    public static final java.lang.String TestTagFirstAmount = "random_deposits_confirm_first_amount";
    public static final java.lang.String TestTagSecondAmount = "random_deposits_confirm_second_amount";
    public static final java.lang.String TestTagTitle = "random_deposits_confirm_title";
    private static final kotlin.text.Regex getHighSpeedVideoFpsRangesFor = new kotlin.text.Regex("^\\d*$");

    public static final kotlin.text.Regex getNUMERIC_INPUT_REGEX() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RandomDepositsConfirmationScreen(final com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        java.lang.String str2;
        int i5;
        boolean z5;
        int i6;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        final java.lang.String str3;
        final boolean z9;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.MutableState mutableState;
        boolean z10;
        com.paypal.pds.components.BottomSheetController bottomSheetController;
        int i8;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        final androidx.compose.runtime.MutableState mutableState2;
        androidx.compose.runtime.MutableState mutableState3;
        ?? r0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1482707127);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bankAccountDetails) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(z) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                str2 = str;
            } else {
                str2 = str;
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(str2) ? 1048576 : 524288;
                }
            }
            i5 = i2 & 128;
            if (i5 == 0) {
                i3 |= 12582912;
                z5 = z2;
            } else {
                z5 = z2;
                if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(z5) ? 8388608 : 4194304;
                }
            }
            i6 = i2 & 256;
            if (i6 == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changed(z3) ? 67108864 : 33554432;
            }
            i7 = i2 & 512;
            if (i7 == 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i3 |= startRestartGroup.changed(z4) ? 536870912 : 268435456;
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                z6 = z;
                z7 = z4;
                z8 = z5;
                str3 = str2;
                z9 = z3;
            } else {
                boolean z11 = i9 != 0 ? false : z;
                java.lang.String str4 = i4 != 0 ? "" : str2;
                boolean z12 = i5 != 0 ? false : z5;
                boolean z13 = i6 != 0 ? false : z3;
                boolean z14 = i7 != 0 ? false : z4;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1482707127, i3, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreen (RandomDepositsConfirmationScreen.kt:147)");
                }
                java.lang.Object[] objArr = new java.lang.Object[0];
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState4 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                java.lang.Object[] objArr2 = new java.lang.Object[0];
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.MutableState mutableState5 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr2, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
                java.lang.Object[] objArr3 = new java.lang.Object[0];
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.MutableState mutableState6 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr3, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 48);
                java.lang.Object[] objArr4 = new java.lang.Object[0];
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.MutableState mutableState7 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr4, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 48);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue5;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) rememberedValue6;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                if (!z13) {
                    startRestartGroup.startReplaceGroup(595172274);
                    boolean changedInstance = startRestartGroup.changedInstance(coroutineScope2);
                    boolean changedInstance2 = startRestartGroup.changedInstance(bottomSheetController2);
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if ((changedInstance | changedInstance2) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.$r8$lambda$vBjpdQ8ktI2w0yYwh1JkSX8OAlI(kotlinx.coroutines.CoroutineScope.this, bottomSheetController2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, 0, 1);
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1635601579, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.$r8$lambda$6W4sREM8VQDPENhwKNlwL4lfXPo(kotlinx.coroutines.CoroutineScope.this, bottomSheetController2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1572870, 62);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(595914755);
                    boolean z15 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (z15 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.$r8$lambda$iRgGaOQs3miTaC_omNrPZTFSbZ0(kotlin.jvm.functions.Function0.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue8, startRestartGroup, 0, 1);
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(579601523, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.$r8$lambda$BH5TbQx3rDyWUYTYR3fGuuOkzv0(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, startRestartGroup, 196614, 94);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                if (z11) {
                    startRestartGroup.startReplaceGroup(-331968523);
                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, str4, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, ((i3 >> 12) & 896) | 48, 120);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-331777811);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_confirm_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), TestTagTitle), (java.lang.String) null, (java.lang.String) null, (com.paypal.pds.components.HeaderContentAlignment) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                int i10 = com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_confirm_body;
                java.lang.String name2 = bankAccountDetails.getIssuer().getName();
                java.lang.String displayName = com.paypal.oslo.feature.wallet.banks.ui.openbanking.LinkedAccountsSuccessScreenKt.toDisplayName(bankAccountDetails.getType(), startRestartGroup, 0);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(name2);
                sb.append(" ");
                sb.append(displayName);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(i10, new java.lang.Object[]{sb.toString(), bankAccountDetails.getLastNChars()}, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), TestTagBody), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1004);
                if (z14) {
                    startRestartGroup.startReplaceGroup(-330915174);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_confirm_trouble_finding, startRestartGroup, 0), null, null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8446getLefte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1006);
                    bottomSheetController = bottomSheetController2;
                    i8 = i3;
                    coroutineScope = coroutineScope2;
                    mutableState = mutableState5;
                    mutableState3 = mutableState6;
                    z10 = z14;
                    r0 = 0;
                    mutableState2 = mutableState7;
                    com.paypal.pds.components.LinkKt.Link(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_confirm_instantly_instead, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), function03, null, startRestartGroup, (i3 >> 6) & 896, 8);
                    startRestartGroup.endReplaceGroup();
                } else {
                    mutableState = mutableState5;
                    z10 = z14;
                    bottomSheetController = bottomSheetController2;
                    i8 = i3;
                    coroutineScope = coroutineScope2;
                    mutableState2 = mutableState7;
                    mutableState3 = mutableState6;
                    r0 = 0;
                    startRestartGroup.startReplaceGroup(-330404883);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.oslo.feature.wallet.banks.ui.confirmation.BankStatementKt.BankStatement(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), startRestartGroup, r0, r0);
                java.lang.String str5 = (java.lang.String) mutableState4.getValue();
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_confirm_first_amount, startRestartGroup, r0);
                androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, java.lang.Boolean.FALSE, (androidx.compose.ui.text.intl.LocaleList) null, 91, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), TestTagFirstAmount);
                com.paypal.pds.components.textinput.VisualTransformation.Currency currency = new com.paypal.pds.components.textinput.VisualTransformation.Currency(null, r0, 3, null);
                final androidx.compose.runtime.MutableState mutableState8 = mutableState3;
                java.util.List<com.paypal.pds.components.textinput.ValidationAlert> amountFieldAlerts = getAmountFieldAlerts(((java.lang.Boolean) mutableState8.getValue()).booleanValue(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_confirm_check_first_amount, startRestartGroup, r0));
                boolean changed = startRestartGroup.changed(mutableState8);
                boolean changed2 = startRestartGroup.changed(mutableState4);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if ((changed | changed2) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.$r8$lambda$BSnWY5eifiPQeW1Zu7MAKxQKKlY(androidx.compose.runtime.MutableState.this, mutableState4, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                com.paypal.pds.components.TextInputKt.TextInput(str5, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue9, testTag, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) currency, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) amountFieldAlerts, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 100663296, com.paypal.pds.components.textinput.VisualTransformation.Currency.$stable << 6, 110320);
                final androidx.compose.runtime.MutableState mutableState9 = mutableState;
                java.lang.String str6 = (java.lang.String) mutableState9.getValue();
                androidx.compose.foundation.text.KeyboardOptions keyboardOptions2 = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, java.lang.Boolean.FALSE, (androidx.compose.ui.text.intl.LocaleList) null, 91, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_confirm_second_amount, startRestartGroup, r0);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagSecondAmount);
                com.paypal.pds.components.textinput.VisualTransformation.Currency currency2 = new com.paypal.pds.components.textinput.VisualTransformation.Currency(null, r0, 3, null);
                java.util.List<com.paypal.pds.components.textinput.ValidationAlert> amountFieldAlerts2 = getAmountFieldAlerts(((java.lang.Boolean) mutableState2.getValue()).booleanValue(), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_random_deposits_confirm_check_second_amount, startRestartGroup, r0));
                boolean changed3 = startRestartGroup.changed(mutableState2);
                boolean changed4 = startRestartGroup.changed(mutableState9);
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if ((changed3 | changed4) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.$r8$lambda$1hvY8IeYlMsjnk8vYlh67_ikylo(androidx.compose.runtime.MutableState.this, mutableState9, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                com.paypal.pds.components.TextInputKt.TextInput(str6, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue10, testTag2, stringResource2, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions2, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) currency2, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) amountFieldAlerts2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 100663680, com.paypal.pds.components.textinput.VisualTransformation.Currency.$stable << 6, 110320);
                startRestartGroup.endNode();
                androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null))), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_confirm, startRestartGroup, r0);
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), TestTagButton);
                boolean changed5 = startRestartGroup.changed(mutableState4);
                boolean changed6 = startRestartGroup.changed(mutableState9);
                boolean z16 = (i8 & 112) != 32 ? r0 : true;
                boolean changed7 = startRestartGroup.changed(mutableState8);
                boolean changed8 = startRestartGroup.changed(mutableState2);
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if ((changed5 | changed6 | z16 | changed7 | changed8) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final androidx.compose.runtime.MutableState mutableState10 = mutableState2;
                    rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.m20805$r8$lambda$jaZbtYB7NV93DEIgFm0DTO5EyM(kotlin.jvm.functions.Function2.this, mutableState4, mutableState9, mutableState8, mutableState10);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue11, stringResource3, testTag3, null, null, null, large, false, z12, startRestartGroup, ((i8 << 3) & 234881024) | 1573248, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                boolean changedInstance3 = startRestartGroup.changedInstance(coroutineScope3);
                final com.paypal.pds.components.BottomSheetController bottomSheetController3 = bottomSheetController;
                boolean changedInstance4 = startRestartGroup.changedInstance(bottomSheetController3);
                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | changedInstance4) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.$r8$lambda$WoAZjKyZEY24JSstJvlr1sahEL0(kotlinx.coroutines.CoroutineScope.this, bottomSheetController3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue12;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.wallet.common.ui.ExitFrictionModalKt.ExitFrictionModal(bottomSheetController3, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_are_you_sure_you_want_to_exit, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_exit_friction_default_description, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_exit, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_stay, startRestartGroup, 0), null, null, function02, function04, function04, composer2, com.paypal.pds.components.BottomSheetController.$stable | ((i8 << 12) & 29360128), 96);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z6 = z11;
                str3 = str4;
                z8 = z12;
                z9 = z13;
                z7 = z10;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.m20803$r8$lambda$bwllyDTC5HPN6zVcMWd8YB97TQ(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails.this, function2, function0, function02, function03, z6, str3, z8, z9, z7, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.util.List<com.paypal.pds.components.textinput.ValidationAlert> getAmountFieldAlerts(boolean z, final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.m20806$r8$lambda$pZbtmNnRJttOC5gdQ3VPfT73eU(str, (java.lang.String) obj);
                }
            }));
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    public static final com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult validate(com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.DepositAmounts depositAmounts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmounts, "");
        if (depositAmounts.getFirstAmount().length() <= 0 || depositAmounts.getSecondAmount().length() <= 0) {
            return new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid(depositAmounts.getFirstAmount().length() == 0, depositAmounts.getSecondAmount().length() == 0);
        }
        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Valid.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1hvY8IeYlMsjnk8vYlh67_ikylo(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (getHighSpeedVideoFpsRangesFor.matches(str) && str.length() <= 2) {
            mutableState.setValue(java.lang.Boolean.FALSE);
            mutableState2.setValue(str);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6W4sREM8VQDPENhwKNlwL4lfXPo(final kotlinx.coroutines.CoroutineScope coroutineScope, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1635601579, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreen.<anonymous>.<anonymous> (RandomDepositsConfirmationScreen.kt:172)");
            }
            com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagClose);
            com.paypal.pds.core.Icon.XMark xMark2 = xMark;
            boolean changedInstance = composer.changedInstance(coroutineScope);
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt.m20802$r8$lambda$JOJoKHGDJs4aNsqs6YWBZ6l9HA(kotlinx.coroutines.CoroutineScope.this, bottomSheetController);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(xMark2, (kotlin.jvm.functions.Function0) rememberedValue, testTag, tertiary, medium, null, null, false, false, composer, 28038, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BH5TbQx3rDyWUYTYR3fGuuOkzv0(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(579601523, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreen.<anonymous>.<anonymous> (RandomDepositsConfirmationScreen.kt:190)");
            }
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function0, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, null, null, false, false, composer, 27654, 484);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BSnWY5eifiPQeW1Zu7MAKxQKKlY(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (getHighSpeedVideoFpsRangesFor.matches(str) && str.length() <= 2) {
            mutableState.setValue(java.lang.Boolean.FALSE);
            mutableState2.setValue(str);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JOJoKHGDJs4aNsqs6YWBZ-6l9HA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20802$r8$lambda$JOJoKHGDJs4aNsqs6YWBZ6l9HA(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$RandomDepositsConfirmationScreen$1$2$1$1$1(bottomSheetController, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WoAZjKyZEY24JSstJvlr1sahEL0(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$RandomDepositsConfirmationScreen$dismissExitFriction$1$1$1(bottomSheetController, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bwllyDTC5HPN6zVcMWd-8YB97TQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20803$r8$lambda$bwllyDTC5HPN6zVcMWd8YB97TQ(com.paypal.oslo.feature.wallet.banks.domain.model.BankAccountDetails bankAccountDetails, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RandomDepositsConfirmationScreen(bankAccountDetails, function2, function0, function02, function03, z, str, z2, z3, z4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iRgGaOQs3miTaC_omNrPZTFSbZ0(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$jaZbtYB7NV93D-EIgFm0DTO5EyM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20805$r8$lambda$jaZbtYB7NV93DEIgFm0DTO5EyM(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, androidx.compose.runtime.MutableState mutableState4) {
        androidx.compose.runtime.MutableState mutableState5 = mutableState;
        androidx.compose.runtime.MutableState mutableState6 = mutableState2;
        com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult validate = validate(new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.DepositAmounts((java.lang.String) mutableState5.getValue(), (java.lang.String) mutableState6.getValue()));
        if (validate instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Valid) {
            function2.invoke((java.lang.String) mutableState5.getValue(), (java.lang.String) mutableState6.getValue());
        } else {
            if (!(validate instanceof com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid invalid = (com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.ValidationResult.Invalid) validate;
            mutableState3.setValue(java.lang.Boolean.valueOf(invalid.isFirstAmountInvalid()));
            mutableState4.setValue(java.lang.Boolean.valueOf(invalid.isSecondAmountInvalid()));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pZ-btmNnRJttOC5gdQ3VPfT73eU, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m20806$r8$lambda$pZbtmNnRJttOC5gdQ3VPfT73eU(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vBjpdQ8ktI2w0yYwh1JkSX8OAlI(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.pds.components.BottomSheetController bottomSheetController) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.confirmation.RandomDepositsConfirmationScreenKt$RandomDepositsConfirmationScreen$1$1$1$1(bottomSheetController, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }
}
