package com.paypal.oslo.feature.taptopay.ui.shared.webview;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¨\u0006\r²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u008a\u0084\u0002"}, d2 = {"LegalWebViewScreen", "", "url", "", "title", "source", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createLegalWebViewConfiguration", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "taptopay_prodRelease", "currentOnBackClick"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LegalWebViewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LegalWebViewScreen(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-770756137);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-770756137, i3, -1, "com.paypal.oslo.feature.taptopay.ui.shared.webview.LegalWebViewScreen (LegalWebViewScreen.kt:45)");
                }
                boolean z = (i3 & 14) == 4;
                boolean z2 = (i3 & 112) == 32;
                boolean z3 = (i3 & 896) == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = createLegalWebViewConfiguration(str, str2, str3);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue;
                final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 9) & 14);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.webview.LegalWebViewScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.taptopay.ui.shared.webview.LegalWebViewScreenKt.$r8$lambda$4XryjOUSoWIeZ2Om5g9mw9cll1U(androidx.compose.runtime.State.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue2, modifier3, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48 | ((i3 >> 6) & 896), 8);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.webview.LegalWebViewScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.taptopay.ui.shared.webview.LegalWebViewScreenKt.$r8$lambda$HspDSRQrOtM6dZkvnejETEQrIO4(str, str2, str3, function0, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createLegalWebViewConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, str3, false, true, null, 16, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(str2, null, false, false, false, 30, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 101, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4XryjOUSoWIeZ2Om5g9mw9cll1U(androidx.compose.runtime.State state) {
        ((kotlin.jvm.functions.Function0) state.getValue()).invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HspDSRQrOtM6dZkvnejETEQrIO4(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LegalWebViewScreen(str, str2, str3, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
