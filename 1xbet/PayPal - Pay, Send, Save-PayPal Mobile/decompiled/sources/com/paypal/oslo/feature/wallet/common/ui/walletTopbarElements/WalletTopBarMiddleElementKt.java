package com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\t\u001a3\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000*$\u0010\u0003\"\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006¨\u0006\u0012"}, d2 = {"TestTagText", "", "TestTagProgressBar", "WalletTopBarMiddleElement", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "WalletTopBarText", "text", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "WalletTopBarProgress", "progressValue", "", "maxValue", "stepCount", "", "currentStep", "(FFIILandroidx/compose/runtime/Composer;II)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WalletTopBarMiddleElementKt {
    public static final java.lang.String TestTagProgressBar = "WalletTopBar:ProgressBar";
    public static final java.lang.String TestTagText = "WalletTopBar:Text";

    public static final void WalletTopBarText(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1577723192);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1577723192, i2, -1, "com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarText (WalletTopBarMiddleElement.kt:45)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagText), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, (i2 & 14) | 48, 6, 1020);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarMiddleElementKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarMiddleElementKt.m21220$r8$lambda$werXODVC_QLggZxQIn0lVBEwOA(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WalletTopBarProgress(final float f, float f2, int i, int i2, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        float f4;
        final int i10;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1845147123);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(f) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i11 = i4 & 2;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            f3 = f2;
            i5 |= startRestartGroup.changed(f3) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i7 = i;
                i5 |= startRestartGroup.changed(i7) ? 256 : 128;
                i8 = i4 & 8;
                if (i8 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i9 = i2;
                    i5 |= startRestartGroup.changed(i9) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        f4 = f3;
                        i10 = i7;
                    } else {
                        f4 = i11 != 0 ? 100.0f : f3;
                        int i12 = i6 != 0 ? 1 : i7;
                        int i13 = i8 != 0 ? 0 : i9;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1845147123, i5, -1, "com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarProgress (WalletTopBarMiddleElement.kt:71)");
                        }
                        com.paypal.pds.components.ProgressBarStyle.Neutral neutral = com.paypal.pds.components.ProgressBarStyle.Neutral.INSTANCE;
                        int i14 = i5 << 3;
                        com.paypal.pds.components.ProgressBarKt.ProgressBar(f4, f, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing96()), TestTagProgressBar), neutral, i13, i12, 0L, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_progress_bar, startRestartGroup, 0), startRestartGroup, (i14 & 57344) | ((i5 >> 3) & 14) | 3072 | (i14 & 112) | ((i5 << 9) & 458752), 64);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        i10 = i12;
                        i9 = i13;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final float f5 = f4;
                        final int i15 = i9;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarMiddleElementKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.common.ui.walletTopbarElements.WalletTopBarMiddleElementKt.m21219$r8$lambda$Ny4CfFkIwdFmqk74VmyXMhtcsI(f, f5, i10, i15, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i9 = i2;
                if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i;
            i8 = i4 & 8;
            if (i8 != 0) {
            }
            i9 = i2;
            if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f2;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i4 & 8;
        if (i8 != 0) {
        }
        i9 = i2;
        if (startRestartGroup.shouldExecute((i5 & 1171) == 1170, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$Ny4CfFkIw-dFmqk74VmyXMhtcsI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21219$r8$lambda$Ny4CfFkIwdFmqk74VmyXMhtcsI(float f, float f2, int i, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        WalletTopBarProgress(f, f2, i, i2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$werXODVC_QLgg-ZxQIn0lVBEwOA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21220$r8$lambda$werXODVC_QLggZxQIn0lVBEwOA(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        WalletTopBarText(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
