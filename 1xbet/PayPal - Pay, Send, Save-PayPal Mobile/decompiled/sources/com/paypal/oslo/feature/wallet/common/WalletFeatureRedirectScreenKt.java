package com.paypal.oslo.feature.wallet.common;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a?\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"WalletFeatureRedirectScreen", "", "onBackClick", "Lkotlin/Function0;", "title", "", "buttonText", "url", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "WalletFeatureRedirectScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WalletFeatureRedirectScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WalletFeatureRedirectScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str4;
        int i4;
        java.lang.String str5;
        int i5;
        java.lang.String str6;
        final java.lang.String str7;
        final java.lang.String str8;
        final java.lang.String str9;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1215197398);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str4 = str;
            i3 |= startRestartGroup.changed(str4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str5 = str2;
                i3 |= startRestartGroup.changed(str5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str6 = str3;
                    i3 |= startRestartGroup.changed(str6) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        str7 = str4;
                        str8 = str5;
                        str9 = str6;
                    } else {
                        java.lang.String str13 = i6 != 0 ? null : str4;
                        java.lang.String str14 = i4 != 0 ? null : str5;
                        java.lang.String str15 = i5 != 0 ? null : str6;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1215197398, i3, -1, "com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreen (WalletFeatureRedirectScreen.kt:38)");
                        }
                        if (str15 == null) {
                            startRestartGroup.startReplaceGroup(426410814);
                            str10 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_redirect_url, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(426410597);
                            startRestartGroup.endReplaceGroup();
                            str10 = str15;
                        }
                        final androidx.compose.ui.platform.UriHandler uriHandler = (androidx.compose.ui.platform.UriHandler) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalUriHandler());
                        com.paypal.pds.core.Icon.Warning warning = com.paypal.pds.core.Icon.Warning.INSTANCE;
                        if (str13 == null) {
                            startRestartGroup.startReplaceGroup(426416320);
                            str11 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_redirect_title, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(426416041);
                            startRestartGroup.endReplaceGroup();
                            str11 = str13;
                        }
                        if (str14 == null) {
                            startRestartGroup.startReplaceGroup(426420071);
                            str12 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_redirect_go_to_paypal, startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(426419637);
                            startRestartGroup.endReplaceGroup();
                            str12 = str14;
                        }
                        boolean changedInstance = startRestartGroup.changedInstance(uriHandler);
                        boolean changed = startRestartGroup.changed(str10);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.$r8$lambda$c9toT9zHB6xNPhCTC81bhPA8lnQ(androidx.compose.ui.platform.UriHandler.this, str10);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.oslo.feature.wallet.common.ErrorScreenKt.ErrorScreen(warning, str11, "", str12, false, null, false, function0, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, ((i3 << 21) & 29360128) | 390, 112);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        str7 = str13;
                        str8 = str14;
                        str9 = str15;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.$r8$lambda$iMt6Vyez8rBFRTNK1aiQjB38llY(kotlin.jvm.functions.Function0.this, str7, str8, str9, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                str6 = str3;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str5 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str6 = str3;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str4 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str5 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str6 = str3;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c9toT9zHB6xNPhCTC81bhPA8lnQ(androidx.compose.ui.platform.UriHandler uriHandler, java.lang.String str) {
        uriHandler.openUri(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iMt6Vyez8rBFRTNK1aiQjB38llY(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WalletFeatureRedirectScreen(function0, str, str2, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uq-gf6_qgzt9KbCN2C3qVLNGgko, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21197$r8$lambda$uqgf6_qgzt9KbCN2C3qVLNGgko(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-235663383);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-235663383, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenPreview (WalletFeatureRedirectScreen.kt:53)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            WalletFeatureRedirectScreen((kotlin.jvm.functions.Function0) rememberedValue, null, null, null, startRestartGroup, 6, 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.common.WalletFeatureRedirectScreenKt.m21197$r8$lambda$uqgf6_qgzt9KbCN2C3qVLNGgko(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
