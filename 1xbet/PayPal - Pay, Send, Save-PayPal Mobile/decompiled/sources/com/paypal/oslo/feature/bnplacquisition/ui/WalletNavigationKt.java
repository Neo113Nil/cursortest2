package com.paypal.oslo.feature.bnplacquisition.ui;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u009d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032M\b\u0002\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00052%\b\u0002\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001ay\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032)\b\u0002\u0010\u0004\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\r2%\b\u0002\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001d\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0003¢\u0006\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"AddCardFlowResultHandler", "", "requestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "onSuccess", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cardId", "displayName", "last4Digits", "onError", "Lkotlin/Function1;", "errorMessage", "onCancel", "Lkotlin/Function0;", "AddCardFlowResultHandler-5lSOO6k", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AddBankFlowResultHandler", "", "accountIds", "AddBankFlowResultHandler-5lSOO6k", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "navigateToAddCard", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "addCardRequestId", "navigateToAddCard-hN0UB1M", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;)V", "navigateToAddBank", "addBankRequestId", "navigateToAddBank-hN0UB1M", "bnpl-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WalletNavigationKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0048  */
    /* renamed from: AddCardFlowResultHandler-5lSOO6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12281AddCardFlowResultHandler5lSOO6k(final java.lang.String str, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function32;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function33;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function34;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1488231929);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function32 = function3;
            i3 |= startRestartGroup.changedInstance(function32) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        function33 = function32;
                        function13 = function12;
                        function03 = function02;
                    } else {
                        if (i6 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function3
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                        return com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.$r8$lambda$sBl4yCzYfrVTDWydRMfFRowRrJo((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function34 = (kotlin.jvm.functions.Function3) rememberedValue;
                        } else {
                            function34 = function32;
                        }
                        if (i4 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1488231929, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.AddCardFlowResultHandler (WalletNavigation.kt:45)");
                        }
                        boolean z = (i3 & 112) == 32;
                        boolean z2 = (i3 & 896) == 256;
                        boolean z3 = (i3 & 7168) == 2048;
                        com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((z | z2 | z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler$4$1(function34, function12, function02, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler5lSOO6k$$inlined$NavResultEffectrtGRyWw$1 rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddCardFlowResultHandler-5lSOO6k$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m12285invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12285invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, (i3 & 14) | 3072);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function13 = function12;
                        function03 = function02;
                        function33 = function34;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.$r8$lambda$lHI4kGK7hhr5Bft61dR7_jOZiKg(str, function33, function13, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function12 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function32 = function3;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0048  */
    /* renamed from: AddBankFlowResultHandler-5lSOO6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12280AddBankFlowResultHandler5lSOO6k(final java.lang.String str, kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> function13;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> function15;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> function17;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-180880113);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function13 = function1;
            i3 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function14 = function12;
                i3 |= startRestartGroup.changedInstance(function14) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        function15 = function13;
                        function16 = function14;
                        function03 = function02;
                    } else {
                        if (i6 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.$r8$lambda$jLQadl7beyUD_WC5on2DIbRxWhw((java.util.List) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function17 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function17 = function13;
                        }
                        if (i4 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function14 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-180880113, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.AddBankFlowResultHandler (WalletNavigation.kt:87)");
                        }
                        boolean z = (i3 & 896) == 256;
                        boolean z2 = (i3 & 112) == 32;
                        boolean z3 = (i3 & 7168) == 2048;
                        com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler$4$1 rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((z | z2 | z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler$4$1(function14, function17, function02, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue4;
                        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
                        com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler5lSOO6k$$inlined$NavResultEffectrtGRyWw$1 rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$AddBankFlowResultHandler-5lSOO6k$$inlined$NavResultEffect-rtGRyWw$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                                    return m12284invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                                }

                                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m12284invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str2) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(str, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue5, startRestartGroup, (i3 & 14) | 3072);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function16 = function14;
                        function03 = function02;
                        function15 = function17;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.$r8$lambda$xPCR3xXlgzVVxBKXS9cUBfSQEXY(str, function15, function16, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function14 = function12;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function02 = function0;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function13 = function1;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function14 = function12;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: navigateToAddCard-hN0UB1M, reason: not valid java name */
    public static final void m12283navigateToAddCardhN0UB1M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.$r8$lambda$TrfJ17zgwyZQ5nOvuwhZKj9WqGQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: navigateToAddBank-hN0UB1M, reason: not valid java name */
    public static final void m12282navigateToAddBankhN0UB1M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.banks.AddBankFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.bnplacquisition.ui.WalletNavigationKt.m12278$r8$lambda$80UKf3MTRGEYLzY4b57KhcEzE4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$80UKf3MTRGEYLzY4b-57KhcEzE4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12278$r8$lambda$80UKf3MTRGEYLzY4b57KhcEzE4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.BNPL_ACQUISITION, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), (com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TrfJ17zgwyZQ5nOvuwhZKj9WqGQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.wallet.api.navigation.AddCardFlowDestination(new com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.BNPL_ACQUISITION, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 14, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Header.TopBar((java.lang.String) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardForm.Config((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, 127, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(false, false, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen.FORM, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jLQadl7beyUD_WC5on2DIbRxWhw(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lHI4kGK7hhr5Bft61dR7_jOZiKg(java.lang.String str, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m12281AddCardFlowResultHandler5lSOO6k(str, function3, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sBl4yCzYfrVTDWydRMfFRowRrJo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xPCR3xXlgzVVxBKXS9cUBfSQEXY(java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m12280AddBankFlowResultHandler5lSOO6k(str, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
