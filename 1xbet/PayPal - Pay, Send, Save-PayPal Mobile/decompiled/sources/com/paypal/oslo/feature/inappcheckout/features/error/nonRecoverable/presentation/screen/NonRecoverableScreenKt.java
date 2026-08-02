package com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u000b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"NonRecoverableWebViewErrorScreen", "", "canGoBackToMerchant", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/NonRecoverableScreenActions;", "merchantDetails", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "modifier", "Landroidx/compose/ui/Modifier;", "primaryButtonModifier", "(ZLcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/NonRecoverableScreenActions;Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "(Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/NonRecoverableScreenActions;Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NonRecoverableWebViewErrorScreenNoCTA", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;Landroidx/compose/runtime/Composer;I)V", "NonRecoverableWebViewErrorScreenNoCTAPreview", "(Landroidx/compose/runtime/Composer;I)V", "NonRecoverableWebViewErrorScreenPreview", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NonRecoverableScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NonRecoverableWebViewErrorScreen(final boolean z, final com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions, final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier3;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        final androidx.compose.ui.Modifier modifier5;
        final androidx.compose.ui.Modifier modifier6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonRecoverableScreenActions, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(53806170);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(nonRecoverableScreenActions) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(merchantDetails) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier3 = modifier;
            i3 |= startRestartGroup.changed(modifier3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier4 = modifier2;
                i3 |= startRestartGroup.changed(modifier4) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier5 = modifier3;
                    modifier6 = modifier4;
                } else {
                    androidx.compose.ui.Modifier modifier7 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier3;
                    androidx.compose.ui.Modifier modifier8 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier4;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(53806170, i3, -1, "com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableWebViewErrorScreen (NonRecoverableScreen.kt:30)");
                    }
                    boolean z2 = (i3 & 112) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt.$r8$lambda$vZR2iTPMyFNnhllmA1FFOMlFhZk(com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 1);
                    if (z) {
                        startRestartGroup.startReplaceGroup(917135587);
                        Camera2StreamConfigurationMap(nonRecoverableScreenActions, merchantDetails, modifier7, modifier8, startRestartGroup, (i3 >> 3) & 8190, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(917363778);
                        getHighSpeedVideoFpsRangesFor(merchantDetails, startRestartGroup, (i3 >> 6) & 14);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier7;
                    modifier6 = modifier8;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt.$r8$lambda$i8eIPJpY9aumV0UY1B_NFIZMcq4(z, nonRecoverableScreenActions, merchantDetails, modifier5, modifier6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            modifier4 = modifier2;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier3 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier4 = modifier2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions, final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier3;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        final androidx.compose.ui.Modifier modifier5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(815774206);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(nonRecoverableScreenActions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(merchantDetails) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier3 = modifier;
            i3 |= startRestartGroup.changed(modifier3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier4 = modifier2;
                i3 |= startRestartGroup.changed(modifier4) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier5 = modifier3;
                } else {
                    androidx.compose.ui.Modifier modifier6 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier3;
                    androidx.compose.ui.Modifier modifier7 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier4;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(815774206, i3, -1, "com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableWebViewErrorScreen (NonRecoverableScreen.kt:51)");
                    }
                    com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfig nonRecoverableErrorConfig = com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfig.INSTANCE;
                    androidx.compose.ui.Modifier modifier8 = modifier6 == null ? androidx.compose.ui.Modifier.INSTANCE : modifier6;
                    kotlin.jvm.functions.Function0<kotlin.Unit> onNonRecoverableOkClick = nonRecoverableScreenActions.getOnNonRecoverableOkClick();
                    androidx.compose.ui.Modifier modifier9 = modifier7 == null ? androidx.compose.ui.Modifier.INSTANCE : modifier7;
                    com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfig nonRecoverableErrorConfig2 = nonRecoverableErrorConfig;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.oslo.feature.inappcheckout.features.error.base.screen.WebViewErrorScreenKt.WebViewErrorScreen(nonRecoverableErrorConfig2, merchantDetails, modifier8, modifier9, onNonRecoverableOkClick, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, (i3 & 112) | 196614, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier6;
                    modifier4 = modifier7;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier10 = modifier4;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt.$r8$lambda$4XN_Zb0QbfByo4jYU_TUQSZmzwU(com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions.this, merchantDetails, modifier5, modifier10, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            modifier4 = modifier2;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier3 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier4 = modifier2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1490702555);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(merchantDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1490702555, i2, -1, "com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableWebViewErrorScreenNoCTA (NonRecoverableScreen.kt:65)");
            }
            com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfigNoCTA nonRecoverableErrorConfigNoCTA = com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfigNoCTA.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda3
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.inappcheckout.features.error.base.screen.WebViewErrorScreenKt.WebViewErrorScreen(nonRecoverableErrorConfigNoCTA, merchantDetails, null, null, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, ((i2 << 3) & 112) | 221190, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt.m15439$r8$lambda$R37Ch1B6xIYyfwgTDrCXkyBw48(com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4XN_Zb0QbfByo4jYU_TUQSZmzwU(com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions, com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Modifier modifier2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(nonRecoverableScreenActions, merchantDetails, modifier, modifier2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R37Ch1-B6xIYyfwgTDrCXkyBw48, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15439$r8$lambda$R37Ch1B6xIYyfwgTDrCXkyBw48(com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(merchantDetails, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YPA9ttaGYwUTc23gzwYmXKfVLdE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(189209752);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(189209752, updateChangedFlags, -1, "com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableWebViewErrorScreenPreview (NonRecoverableScreen.kt:84)");
            }
            Camera2StreamConfigurationMap(new com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions(null, null, 3, null), new com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails("adidas", "2MERCHANT", null, 4, null), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt.$r8$lambda$YPA9ttaGYwUTc23gzwYmXKfVLdE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i8eIPJpY9aumV0UY1B_NFIZMcq4(boolean z, com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions, com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Modifier modifier2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NonRecoverableWebViewErrorScreen(z, nonRecoverableScreenActions, merchantDetails, modifier, modifier2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k0Fn7Ut77Ceqxh81PAwBBzbMp8E(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1756659475);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1756659475, updateChangedFlags, -1, "com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableWebViewErrorScreenNoCTAPreview (NonRecoverableScreen.kt:76)");
            }
            getHighSpeedVideoFpsRangesFor(new com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails("Nike", "1MERCHANT", null, 4, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.screen.NonRecoverableScreenKt.$r8$lambda$k0Fn7Ut77Ceqxh81PAwBBzbMp8E(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vZR2iTPMyFNnhllmA1FFOMlFhZk(com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.NonRecoverableScreenActions nonRecoverableScreenActions) {
        nonRecoverableScreenActions.getOnBackPressIntercept().invoke();
        return kotlin.Unit.INSTANCE;
    }
}
