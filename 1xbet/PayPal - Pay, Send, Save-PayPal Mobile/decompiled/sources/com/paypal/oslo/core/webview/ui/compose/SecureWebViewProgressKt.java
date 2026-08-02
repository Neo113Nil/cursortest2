package com.paypal.oslo.core.webview.ui.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001a\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"ProgressComplete", "", "InitialProgress", "SecureWebViewProgressBar", "", "progressState", "Lcom/paypal/oslo/core/webview/ui/compose/PageProgressState;", "(Lcom/paypal/oslo/core/webview/ui/compose/PageProgressState;Landroidx/compose/runtime/Composer;I)V", "rememberPageProgressState", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/webview/ui/compose/PageProgressState;", "webview_release", "progress", "isLoading", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewProgressKt {
    public static final void SecureWebViewProgressBar(final com.paypal.oslo.core.webview.ui.compose.PageProgressState pageProgressState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageProgressState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(102046891);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(pageProgressState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(102046891, i2, -1, "com.paypal.oslo.core.webview.ui.compose.SecureWebViewProgressBar (SecureWebViewProgress.kt:41)");
            }
            androidx.compose.runtime.State<java.lang.Integer> progressState = pageProgressState.getProgressState();
            if (pageProgressState.isLoadingState().getValue().booleanValue()) {
                startRestartGroup.startReplaceGroup(-757716331);
                com.paypal.pds.components.ProgressBarKt.ProgressBar(100.0f, progressState.getValue().intValue(), androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f)), com.paypal.pds.components.ProgressBarStyle.Info.INSTANCE, 0, 0, 0L, null, startRestartGroup, 3456, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-757462441);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.webview.ui.compose.SecureWebViewProgressKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.webview.ui.compose.SecureWebViewProgressKt.$r8$lambda$6BOk1HpRLo56bdlrNG_cFSFt7Lo(com.paypal.oslo.core.webview.ui.compose.PageProgressState.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.core.webview.ui.compose.PageProgressState rememberPageProgressState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-914406601, i, -1, "com.paypal.oslo.core.webview.ui.compose.rememberPageProgressState (SecureWebViewProgress.kt:102)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.core.webview.ui.compose.PageProgressState();
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.core.webview.ui.compose.PageProgressState pageProgressState = (com.paypal.oslo.core.webview.ui.compose.PageProgressState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return pageProgressState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6BOk1HpRLo56bdlrNG_cFSFt7Lo(com.paypal.oslo.core.webview.ui.compose.PageProgressState pageProgressState, int i, androidx.compose.runtime.Composer composer, int i2) {
        SecureWebViewProgressBar(pageProgressState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
