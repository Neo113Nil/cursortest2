package com.paypal.oslo.feature.dataprivacy.ui.screens;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a5\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"DataPrivacyWebViewSource", "", "ALLOWED_HOSTS", "", "isUrlAllowed", "", "url", "DataPrivacyWebViewScreen", "", "title", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "data-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataPrivacyWebViewScreenKt {
    public static final java.lang.String DataPrivacyWebViewSource = "data-privacy-webview";
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"www.paypal.com", "help.xoom.com", "www.zettle.com"});

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.String host;
        java.util.Set<java.lang.String> set;
        try {
            host = new java.net.URI(str).getHost();
            set = getHighSpeedVideoFpsRanges;
        } catch (java.lang.Exception unused) {
        }
        if ((set instanceof java.util.Collection) && set.isEmpty()) {
            return false;
        }
        for (java.lang.String str2 : set) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(host, str2)) {
                return true;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(host);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(".");
            sb.append(str2);
            if (kotlin.text.StringsKt.endsWith$default(host, sb.toString(), false, 2, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DataPrivacyWebViewScreen(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2094291487);
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
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2094291487, i4, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.DataPrivacyWebViewScreen (DataPrivacyWebViewScreen.kt:60)");
                }
                if (!getHighResolutionOutputSizeshNQ4ISI(str)) {
                    startRestartGroup.startReplaceGroup(-1952057922);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean z2 = (i4 & 896) == 256;
                    com.paypal.oslo.feature.dataprivacy.ui.screens.DataPrivacyWebViewScreenKt$DataPrivacyWebViewScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.dataprivacy.ui.screens.DataPrivacyWebViewScreenKt$DataPrivacyWebViewScreen$1$1(function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final androidx.compose.ui.Modifier modifier5 = modifier4;
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.DataPrivacyWebViewScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.dataprivacy.ui.screens.DataPrivacyWebViewScreenKt.$r8$lambda$44ENcVpoIRQdnkS6ZcIIiER581Y(str, str2, function0, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
                startRestartGroup.startReplaceGroup(-1951991613);
                startRestartGroup.endReplaceGroup();
                boolean z3 = (i4 & 14) == 4;
                boolean z4 = (i4 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z3 || z4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    z = true;
                    rememberedValue2 = new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, DataPrivacyWebViewSource, false, false, null, 24, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(str2, null, false, false, false, 30, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 101, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                } else {
                    z = true;
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue2;
                boolean z5 = (i4 & 896) == 256 ? z : false;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    startRestartGroup.updateRememberedValue(function0);
                    rememberedValue3 = function0;
                }
                com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue3, modifier4, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | ((i4 >> 3) & 896), 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.DataPrivacyWebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.DataPrivacyWebViewScreenKt.$r8$lambda$oBZd2BGmXMTxJ3lb7awlKGGRQ_M(str, str2, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                };
                endRestartGroup.updateScope(function2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$44ENcVpoIRQdnkS6ZcIIiER581Y(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DataPrivacyWebViewScreen(str, str2, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oBZd2BGmXMTxJ3lb7awlKGGRQ_M(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DataPrivacyWebViewScreen(str, str2, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
