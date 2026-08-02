package com.paypal.oslo.feature.businessprofile.ui.landingpage;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002'\u0010\t\u001a#\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0005\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "url", "source", "Lkotlin/Function2;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "Landroidx/compose/ui/Modifier;", "", "Landroidx/compose/runtime/Composable;", "webViewContent", "SalesToolsWebView", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SalesToolsWebViewKt {
    public static final void SalesToolsWebView(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function4<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function4, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1637009365);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1637009365, i2, -1, "com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsWebView (SalesToolsWebView.kt:28)");
            }
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsWebViewConfigurationKt.createSalesToolsWebViewConfiguration$default(str, str2, true, false, false, 24, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            function4.invoke((com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.businessprofile.constants.BusinessProfileConstants.Test.MANAGE_PROFILE_WEB_VIEW_TAG), startRestartGroup, java.lang.Integer.valueOf((i2 & 896) | com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsWebViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessprofile.ui.landingpage.SalesToolsWebViewKt.$r8$lambda$6ab9lkCOayJBif_yUkdtvYo285s(str, str2, function4, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6ab9lkCOayJBif_yUkdtvYo285s(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function4 function4, int i, androidx.compose.runtime.Composer composer, int i2) {
        SalesToolsWebView(str, str2, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
