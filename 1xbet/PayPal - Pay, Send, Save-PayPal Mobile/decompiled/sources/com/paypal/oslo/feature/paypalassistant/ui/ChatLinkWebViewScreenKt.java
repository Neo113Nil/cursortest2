package com.paypal.oslo.feature.paypalassistant.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2X\b\u0002\u0010\t\u001aR\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\b\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"ChatLinkWebViewSource", "", "ChatLinkWebViewScreen", "", "url", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "webViewContent", "Lkotlin/Function3;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "Lkotlin/ParameterName;", "name", "config", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "createChatLinkWebViewConfiguration", "paypal-assistant_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChatLinkWebViewScreenKt {
    public static final java.lang.String ChatLinkWebViewSource = "ppa-link";

    public static final void ChatLinkWebViewScreen(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(644795478);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function5) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                function5 = com.paypal.oslo.feature.paypalassistant.ui.ComposableSingletons$ChatLinkWebViewScreenKt.INSTANCE.getLambda$384282289$paypal_assistant_prodRelease();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(644795478, i3, -1, "com.paypal.oslo.feature.paypalassistant.ui.ChatLinkWebViewScreen (ChatLinkWebViewScreen.kt:45)");
            }
            boolean z = (i3 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = createChatLinkWebViewConfiguration(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue;
            final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 3) & 14);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.paypalassistant.ui.ChatLinkWebViewScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.paypalassistant.ui.ChatLinkWebViewScreenKt.$r8$lambda$MUm1f0_Po8mGYEiVqdUQqCbjylw(androidx.compose.runtime.State.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            function5.invoke(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue2, modifier, startRestartGroup, java.lang.Integer.valueOf(com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | 48 | (i3 & 896) | (i3 & 7168)));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final kotlin.jvm.functions.Function5<? super com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function52 = function5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.paypalassistant.ui.ChatLinkWebViewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.paypalassistant.ui.ChatLinkWebViewScreenKt.m17630$r8$lambda$lwYtF8n7_zzrr9fwhjfNijhzHc(str, function0, modifier2, function52, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createChatLinkWebViewConfiguration(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url url = new com.paypal.oslo.core.webview.ui.config.SecureWebViewContent.Url(str, ChatLinkWebViewSource, true, false, null, 16, null);
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(url, null, null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(null, null, false, false, true, 15, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, null, 102, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MUm1f0_Po8mGYEiVqdUQqCbjylw(androidx.compose.runtime.State state) {
        ((kotlin.jvm.functions.Function0) state.getValue()).invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lwYtF8n7_zzr-r9fwhjfNijhzHc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17630$r8$lambda$lwYtF8n7_zzrr9fwhjfNijhzHc(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function5 function5, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChatLinkWebViewScreen(str, function0, modifier, function5, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
