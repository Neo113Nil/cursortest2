package com.paypal.oslo.feature.p2p.ui.webview;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\n\u001a\u0095\u0001\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2V\u0010\f\u001aR\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000¨\u0006\u0015"}, d2 = {"P2pWebViewScreen", "", "url", "", "title", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "analyticsSource", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "P2pWebViewScreenContent", "webViewContent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "createP2pWebViewConfiguration", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class P2pWebViewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void P2pWebViewScreen(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.lang.String str3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final java.lang.String str4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1055351076);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str4 = str3;
                i3 |= startRestartGroup.changed(str4) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str5 = i4 != 0 ? com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewDefaults.PAYMENT_LINK_WEBVIEW_SOURCE : str4;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1055351076, i3, -1, "com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreen (P2pWebViewScreen.kt:43)");
                    }
                    P2pWebViewScreenContent(str, str2, function0, str5, modifier4, com.paypal.oslo.feature.p2p.ui.webview.ComposableSingletons$P2pWebViewScreenKt.INSTANCE.m17468getLambda$1505552613$p2p_prodRelease(), startRestartGroup, (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | ((i3 >> 3) & 7168) | ((i3 << 3) & 57344), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    str4 = str5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt.m17469$r8$lambda$sS6TmclubTArTvrmXXyxWmHdQs(str, str2, function0, modifier3, str4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str4 = str3;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str4 = str3;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void P2pWebViewScreenContent(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str3, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function5, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(460060863);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function5) ? 131072 : 65536;
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(460060863, i3, -1, "com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenContent (P2pWebViewScreen.kt:87)");
                }
                boolean z = (i3 & 14) == 4;
                boolean z2 = (i3 & 112) == 32;
                boolean z3 = (i3 & 7168) == 2048;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = createP2pWebViewConfiguration(str, str2, str3);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue;
                int i5 = i3 >> 6;
                function5.invoke(secureWebViewConfiguration, function0, modifier4, startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | ((i3 >> 3) & 112) | (i5 & 896) | (i5 & 7168)));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.webview.P2pWebViewScreenKt.$r8$lambda$Hsuv18woHfwMvCCzdDFy1t7DGeY(str, str2, function0, str3, modifier3, function5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createP2pWebViewConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, str3, false, true, null, 16, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(str2, null, false, false, false, 30, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 101, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Hsuv18woHfwMvCCzdDFy1t7DGeY(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, java.lang.String str3, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function5 function5, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        P2pWebViewScreenContent(str, str2, function0, str3, modifier, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sS6TmclubTArTvrmXXyxWm-HdQs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17469$r8$lambda$sS6TmclubTArTvrmXXyxWmHdQs(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.lang.String str3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        P2pWebViewScreen(str, str2, function0, modifier, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
