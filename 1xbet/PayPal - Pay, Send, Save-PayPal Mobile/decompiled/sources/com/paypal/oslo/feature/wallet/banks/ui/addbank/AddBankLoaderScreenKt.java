package com.paypal.oslo.feature.wallet.banks.ui.addbank;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\u001aK\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"AddBankLoaderScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "config", "Lcom/paypal/oslo/feature/wallet/common/MessageRotation;", "shouldShowClose", "", "onCloseClick", "Lkotlin/Function0;", "onTimeout", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/wallet/common/MessageRotation;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AddBankLoaderScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "AddBankLoaderScreenMiddleMessagePreview", "wallet_prodRelease", "currentMessageIndex", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddBankLoaderScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddBankLoaderScreen(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.wallet.common.MessageRotation messageRotation, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.oslo.feature.wallet.common.MessageRotation messageRotation2;
        boolean z2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.ui.Modifier.Companion companion;
        final boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        int i6;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-133601766);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                messageRotation2 = messageRotation;
                if (startRestartGroup.changedInstance(messageRotation2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                messageRotation2 = messageRotation;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            messageRotation2 = messageRotation;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 16384 : 8192;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            companion = modifier2;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                messageRotation2 = new com.paypal.oslo.feature.wallet.common.MessageRotation(androidx.camera.core.RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_loader_contacting_bank), java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_loader_sending_deposits), java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_loader_confirming), java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_loader_double_checking), java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_loader_almost_there)}));
                                i3 &= -113;
                            }
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if (i4 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$$ExternalSyntheticLambda0
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
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            }
                        }
                        int i9 = i3;
                        z3 = z2;
                        function05 = function03;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function04;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-133601766, i9, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreen (AddBankLoaderScreen.kt:69)");
                        }
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue3;
                        boolean changedInstance = startRestartGroup.changedInstance(messageRotation2);
                        boolean z4 = (57344 & i9) == 16384;
                        com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$AddBankLoaderScreen$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((changedInstance | z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$AddBankLoaderScreen$3$1(messageRotation2, function06, mutableIntState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(messageRotation2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i9 >> 3) & 14);
                        if (!messageRotation2.getMessages().isEmpty()) {
                            startRestartGroup.startReplaceGroup(1305614404);
                            str = androidx.compose.ui.res.StringResources_androidKt.stringResource(messageRotation2.getMessages().get(mutableIntState.getIntValue()).intValue(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1305686262);
                            startRestartGroup.endReplaceGroup();
                            str = "";
                        }
                        com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen(str, companion, z3, function05, startRestartGroup, ((i9 << 3) & 112) | (i9 & 896) | (i9 & 7168), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function04 = function06;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        z3 = z2;
                        function05 = function03;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final com.paypal.oslo.feature.wallet.common.MessageRotation messageRotation3 = messageRotation2;
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function04;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt.$r8$lambda$3HcjmhNPseXNUh03KW9CDXI1QGY(androidx.compose.ui.Modifier.this, messageRotation3, z3, function05, function07, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function04 = function02;
                if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function04 = function02;
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function04 = function02;
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3HcjmhNPseXNUh03KW9CDXI1QGY(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.wallet.common.MessageRotation messageRotation, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddBankLoaderScreen(modifier, messageRotation, z, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BT50z_lKsq_T6l7SjoLtjGss1sk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(814381108);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(814381108, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenMiddleMessagePreview (AddBankLoaderScreen.kt:120)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen("Double checking", null, true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 3462, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt.$r8$lambda$BT50z_lKsq_T6l7SjoLtjGss1sk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D4nZ-HPfcX_aQ_1efmm3l5dI_sQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20788$r8$lambda$D4nZHPfcX_aQ_1efmm3l5dI_sQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1746956374);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1746956374, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenPreview (AddBankLoaderScreen.kt:104)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.common.GenericLoaderScreenKt.GenericLoaderScreen("Contacting bank", null, true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 3462, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.addbank.AddBankLoaderScreenKt.m20788$r8$lambda$D4nZHPfcX_aQ_1efmm3l5dI_sQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
