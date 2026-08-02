package com.paypal.oslo.feature.moneymovement.ui.success.composable;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0016"}, d2 = {"MMPSuccessScreen", "", "config", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;", "modifier", "Landroidx/compose/ui/Modifier;", "callbacks", "Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;", "moneyAmountFormatter", "Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;", "formatDaysRemaining", "Lkotlin/Function1;", "Lkotlin/time/Instant;", "", "(Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenConfig;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenData;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/moneymovement/api/success/MMPSuccessScreenCallbacks;Lcom/paypal/oslo/feature/moneymovement/domain/util/MoneyAmountFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MMPSuccessScreenPayPalLinkWithMediaPreview", "(Landroidx/compose/runtime/Composer;I)V", "MMPSuccessScreenStandardPreview", "MMPSuccessScreenConversionRatePreview", "MMPSuccessScreenPaymentLinkDisclosurePreview", "money-movement_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MMPSuccessScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MMPSuccessScreen(final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, kotlin.jvm.functions.Function1<? super kotlin.time.Instant, java.lang.String> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks2;
        int i4;
        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter2;
        int i5;
        kotlin.jvm.functions.Function1<? super kotlin.time.Instant, java.lang.String> function12;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks3;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks4;
        kotlin.jvm.functions.Function1<? super kotlin.time.Instant, java.lang.String> function13;
        com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter4;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mMPSuccessScreenData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(581518645);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mMPSuccessScreenConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(mMPSuccessScreenData) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    mMPSuccessScreenCallbacks2 = mMPSuccessScreenCallbacks;
                    if (startRestartGroup.changed(mMPSuccessScreenCallbacks2)) {
                        i6 = 2048;
                        i3 |= i6;
                    }
                } else {
                    mMPSuccessScreenCallbacks2 = mMPSuccessScreenCallbacks;
                }
                i6 = 1024;
                i3 |= i6;
            } else {
                mMPSuccessScreenCallbacks2 = mMPSuccessScreenCallbacks;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                moneyAmountFormatter2 = moneyAmountFormatter;
                i3 |= startRestartGroup.changedInstance(moneyAmountFormatter2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            companion = modifier2;
                            mMPSuccessScreenCallbacks3 = mMPSuccessScreenCallbacks2;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if ((i2 & 8) != 0) {
                                mMPSuccessScreenCallbacks3 = com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.Companion.invoke$default(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks.INSTANCE, null, null, null, 7, null);
                                i3 &= -7169;
                            } else {
                                mMPSuccessScreenCallbacks3 = mMPSuccessScreenCallbacks2;
                            }
                            if (i4 != 0) {
                                moneyAmountFormatter2 = null;
                            }
                            if (i5 != 0) {
                                modifier3 = companion;
                                mMPSuccessScreenCallbacks4 = mMPSuccessScreenCallbacks3;
                                function13 = null;
                                moneyAmountFormatter4 = moneyAmountFormatter2;
                                int i8 = i3;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(581518645, i8, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreen (MMPSuccessScreen.kt:127)");
                                }
                                final com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant rememberSuccessScreenVariant = com.paypal.oslo.feature.moneymovement.ui.success.MMPSuccessScreenStateKt.rememberSuccessScreenVariant(mMPSuccessScreenConfig, mMPSuccessScreenData, startRestartGroup, i8 & 126);
                                final com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter5 = moneyAmountFormatter4;
                                final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks5 = mMPSuccessScreenCallbacks4;
                                final kotlin.jvm.functions.Function1<? super kotlin.time.Instant, java.lang.String> function14 = function13;
                                com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks6 = mMPSuccessScreenCallbacks4;
                                composer2 = startRestartGroup;
                                com.paypal.oslo.feature.moneymovement.ui.success.composable.SuccessScreenLayoutKt.SuccessScreenLayout(rememberSuccessScreenVariant, modifier3, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(245786441, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.m15677$r8$lambda$HEN2SrvrD9edcXEtgrY3NhjOXw(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig.this, mMPSuccessScreenCallbacks4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1559716854, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.$r8$lambda$lAZ4Dar5TchJH3bEYq79kExsfdc(com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant.this, mMPSuccessScreenData, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-702538661, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function3
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                        return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.m15678$r8$lambda$YpXa6e3BEfC1KhFuVnl6z8qyjA(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig.this, mMPSuccessScreenData, moneyAmountFormatter5, mMPSuccessScreenCallbacks5, function14, (androidx.compose.foundation.layout.ColumnScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                    }
                                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-875756148, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.$r8$lambda$2NRZerZiTsFp_MQxKkexj2h7Pgc(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig.this, mMPSuccessScreenData, mMPSuccessScreenCallbacks4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ((i8 >> 3) & 112) | 224640, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                mMPSuccessScreenCallbacks2 = mMPSuccessScreenCallbacks6;
                                modifier2 = modifier3;
                                moneyAmountFormatter3 = moneyAmountFormatter4;
                                function12 = function13;
                            }
                        }
                        modifier3 = companion;
                        mMPSuccessScreenCallbacks4 = mMPSuccessScreenCallbacks3;
                        moneyAmountFormatter4 = moneyAmountFormatter2;
                        function13 = function12;
                        int i82 = i3;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        final com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant rememberSuccessScreenVariant2 = com.paypal.oslo.feature.moneymovement.ui.success.MMPSuccessScreenStateKt.rememberSuccessScreenVariant(mMPSuccessScreenConfig, mMPSuccessScreenData, startRestartGroup, i82 & 126);
                        final com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter52 = moneyAmountFormatter4;
                        final com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks52 = mMPSuccessScreenCallbacks4;
                        final kotlin.jvm.functions.Function1 function142 = function13;
                        com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks62 = mMPSuccessScreenCallbacks4;
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.moneymovement.ui.success.composable.SuccessScreenLayoutKt.SuccessScreenLayout(rememberSuccessScreenVariant2, modifier3, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(245786441, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.m15677$r8$lambda$HEN2SrvrD9edcXEtgrY3NhjOXw(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig.this, mMPSuccessScreenCallbacks4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1559716854, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.$r8$lambda$lAZ4Dar5TchJH3bEYq79kExsfdc(com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant.this, mMPSuccessScreenData, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-702538661, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.m15678$r8$lambda$YpXa6e3BEfC1KhFuVnl6z8qyjA(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig.this, mMPSuccessScreenData, moneyAmountFormatter52, mMPSuccessScreenCallbacks52, function142, (androidx.compose.foundation.layout.ColumnScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-875756148, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.$r8$lambda$2NRZerZiTsFp_MQxKkexj2h7Pgc(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig.this, mMPSuccessScreenData, mMPSuccessScreenCallbacks4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, ((i82 >> 3) & 112) | 224640, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        mMPSuccessScreenCallbacks2 = mMPSuccessScreenCallbacks62;
                        modifier2 = modifier3;
                        moneyAmountFormatter3 = moneyAmountFormatter4;
                        function12 = function13;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        moneyAmountFormatter3 = moneyAmountFormatter2;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        final kotlin.jvm.functions.Function1<? super kotlin.time.Instant, java.lang.String> function15 = function12;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.$r8$lambda$ZTvEOFFZNwF1EnXak_Lkiio4ZK8(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig.this, mMPSuccessScreenData, modifier2, mMPSuccessScreenCallbacks2, moneyAmountFormatter3, function15, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            moneyAmountFormatter2 = moneyAmountFormatter;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        moneyAmountFormatter2 = moneyAmountFormatter;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2NRZerZiTsFp_MQxKkexj2h7Pgc(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-875756148, i, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreen.<anonymous> (MMPSuccessScreen.kt:190)");
            }
            com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroupKt.MMPActionButtonGroup(mMPSuccessScreenConfig.getActionButtonGroupConfig(), mMPSuccessScreenData.getActionButtonGroupData(), mMPSuccessScreenCallbacks.getActionButtonCallbacks(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 5, null), composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AIi8CKE_bXJrv3tpFlaHzazAjB0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-498353855);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-498353855, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenStandardPreview (MMPSuccessScreen.kt:251)");
            }
            MMPSuccessScreen(new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.dualHorizontal(), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, false, false, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.TO, null, null, false, false, 231, null), true, true, false, false, false, 64, null), new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData(new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData("Done", false, "Share", false, null, false, false, false, false, null, null, null, null, null, 16378, null), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(com.paypal.oslo.feature.moneymovement.api.domain.Intent.SENT, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "500"), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(null, "Alice Johnson", "AJ"), null, null, null, null, 120, null), null, "Your payment has been sent successfully.", null, null, null, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "500"), 116, null), null, null, null, null, startRestartGroup, 0, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.$r8$lambda$AIi8CKE_bXJrv3tpFlaHzazAjB0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FjzYeubjmdvQkNCiPyAj-GRnEVI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15676$r8$lambda$FjzYeubjmdvQkNCiPyAjGRnEVI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-342668006);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-342668006, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenConversionRatePreview (MMPSuccessScreen.kt:289)");
            }
            MMPSuccessScreen(new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary(), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, false, false, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.TO, null, null, false, false, 231, null), true, true, false, false, false, 64, null), new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData(new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData("Done", false, null, false, null, false, false, false, false, null, null, null, null, null, 16382, null), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(com.paypal.oslo.feature.moneymovement.api.domain.Intent.SENT, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "25.20"), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(null, "Third Wave Coffee", "TW"), null, null, null, null, 120, null), "$1 USD = ₹89.53 INR. Rate includes a spread.", "Oct 14, 2025 12:15 PM – Transaction ID 2K112344Q", null, null, null, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "25.20"), 112, null), null, null, null, null, startRestartGroup, 0, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.m15676$r8$lambda$FjzYeubjmdvQkNCiPyAjGRnEVI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$H-EN2SrvrD9edcXEtgrY3NhjOXw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15677$r8$lambda$HEN2SrvrD9edcXEtgrY3NhjOXw(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(245786441, i, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreen.<anonymous> (MMPSuccessScreen.kt:134)");
            }
            if (mMPSuccessScreenConfig.getShowCloseButton()) {
                composer.startReplaceGroup(-1373992718);
                com.paypal.oslo.feature.moneymovement.ui.success.composable.SuccessScreenSectionsKt.SuccessTopBar(mMPSuccessScreenCallbacks.getOnCloseButtonClick(), null, composer, 0, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1373968693);
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

    /* renamed from: $r8$lambda$YpXa6e3BE-fC1KhFuVnl6z8qyjA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15678$r8$lambda$YpXa6e3BEfC1KhFuVnl6z8qyjA(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-702538661, i, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreen.<anonymous> (MMPSuccessScreen.kt:148)");
            }
            com.paypal.oslo.feature.moneymovement.ui.success.composable.SuccessScreenSectionsKt.SuccessHeaderSection(mMPSuccessScreenConfig.getHeaderConfig(), mMPSuccessScreenData.getHeaderData(), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), moneyAmountFormatter, composer, 0, 0);
            java.lang.String conversionRate = mMPSuccessScreenData.getConversionRate();
            if (conversionRate == null) {
                composer.startReplaceGroup(-1165929056);
            } else {
                composer.startReplaceGroup(-1165929055);
                com.paypal.oslo.feature.moneymovement.ui.success.composable.SuccessScreenSectionsKt.SuccessConversionRateSection(conversionRate, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), composer, 0, 0);
            }
            composer.endReplaceGroup();
            if (com.paypal.oslo.feature.moneymovement.ui.success.MMPSuccessScreenStateKt.shouldShowDisclaimerSection(mMPSuccessScreenConfig, mMPSuccessScreenData)) {
                composer.startReplaceGroup(-1373992718);
                com.paypal.oslo.feature.moneymovement.ui.success.composable.SuccessScreenSectionsKt.SuccessDisclaimerSection(mMPSuccessScreenData.getDisclaimerText(), mMPSuccessScreenData.getLinks(), mMPSuccessScreenCallbacks.getOnLinkClick(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), composer, 0, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1373968693);
                composer.endReplaceGroup();
            }
            com.paypal.oslo.feature.moneymovement.api.success.Disclosure disclosure = mMPSuccessScreenData.getDisclosure();
            if (disclosure == null) {
                composer.startReplaceGroup(-1165929056);
            } else {
                composer.startReplaceGroup(-1165929055);
                com.paypal.oslo.feature.moneymovement.ui.success.composable.SuccessScreenSectionsKt.SuccessDisclosureSection(disclosure, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null), function1, composer, 0, 0);
            }
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZTvEOFFZNwF1EnXak_Lkiio4ZK8(com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenCallbacks mMPSuccessScreenCallbacks, com.paypal.oslo.feature.moneymovement.domain.util.MoneyAmountFormatter moneyAmountFormatter, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MMPSuccessScreen(mMPSuccessScreenConfig, mMPSuccessScreenData, modifier, mMPSuccessScreenCallbacks, moneyAmountFormatter, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lAZ4Dar5TchJH3bEYq79kExsfdc(com.paypal.oslo.feature.moneymovement.ui.success.SuccessScreenVariant successScreenVariant, com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData mMPSuccessScreenData, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1559716854, i, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreen.<anonymous> (MMPSuccessScreen.kt:141)");
            }
            com.paypal.oslo.feature.moneymovement.ui.success.composable.SuccessScreenSectionsKt.SuccessHeroContent(successScreenVariant, mMPSuccessScreenData.getMediaUrl(), mMPSuccessScreenData.getPaypalLinkAmount(), null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t6_HC5Bz0ZS9KEsPxM2cPdVPWsA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-949926409);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-949926409, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenPaymentLinkDisclosurePreview (MMPSuccessScreen.kt:327)");
            }
            com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig mMPSuccessScreenConfig = new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary(), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, false, false, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.FOR, null, null, false, false, 231, null), true, true, false, true, false, 64, null);
            com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData actionButtonGroupData = new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData("Done", false, null, false, null, false, false, false, false, null, null, null, null, null, 16382, null);
            com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData headerData = new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(com.paypal.oslo.feature.moneymovement.api.domain.Intent.SEND, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "50.00"), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Contact(null, "Jane Smith", "JS"), null, null, null, null, 120, null);
            kotlin.time.Instant fromEpochMilliseconds = kotlin.time.Instant.INSTANCE.fromEpochMilliseconds(java.lang.System.currentTimeMillis());
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            MMPSuccessScreen(mMPSuccessScreenConfig, new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData(actionButtonGroupData, headerData, null, "We'll let Jane Smith know that you sent money. Help Center", kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to("Help Center", "https://www.paypal.com/us/smarthelp/home")), new com.paypal.oslo.feature.moneymovement.api.success.Disclosure(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.moneymovement.api.success.PostTransactionDisclosure.PaymentLinkDisclosure(1, fromEpochMilliseconds.m24018plusLRDsOJo(kotlin.time.DurationKt.toDuration(14, kotlin.time.DurationUnit.DAYS))))), null, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "50.00"), 68, null), null, null, null, null, startRestartGroup, 0, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.$r8$lambda$t6_HC5Bz0ZS9KEsPxM2cPdVPWsA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$xr2c9v6jyTiaj1H6n5E1Es-TiBk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15679$r8$lambda$xr2c9v6jyTiaj1H6n5E1EsTiBk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-652872101);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-652872101, updateChangedFlags, -1, "com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenPayPalLinkWithMediaPreview (MMPSuccessScreen.kt:211)");
            }
            MMPSuccessScreen(new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenConfig(com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupConfig.INSTANCE.singlePrimary(), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderConfig(false, false, false, com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderTrailing.FOR, null, null, false, false, 231, null), true, true, true, true, false, 64, null), new com.paypal.oslo.feature.moneymovement.api.success.MMPSuccessScreenData(new com.paypal.oslo.feature.moneymovement.api.amount.component.actionbuttongroup.ActionButtonGroupData("Done", false, null, false, null, false, false, false, false, null, null, null, null, null, 16382, null), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.HeaderData(com.paypal.oslo.feature.moneymovement.api.domain.Intent.SEND, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "100.00"), new com.paypal.oslo.feature.moneymovement.api.shared.components.header.Destination.Pool(null, "Birthday Party Fund"), null, null, null, null, 120, null), null, "This link can be accepted by anyone, so share it with someone you trust. Help Center", kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to("Help Center", "https://www.paypal.com/us/smarthelp/home")), null, "https://media.tenor.com/gvFu_BUA8pMAAAAC/celebration-celebrate.gif", com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.INSTANCE.fiat("USD", "100"), 36, null), null, null, null, null, startRestartGroup, 0, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.moneymovement.ui.success.composable.MMPSuccessScreenKt.m15679$r8$lambda$xr2c9v6jyTiaj1H6n5E1EsTiBk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
