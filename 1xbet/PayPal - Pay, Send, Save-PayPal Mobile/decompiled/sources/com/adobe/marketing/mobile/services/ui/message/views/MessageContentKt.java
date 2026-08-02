package com.adobe.marketing.mobile.services.ui.message.views;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;", "inAppMessageSettings", "Lkotlin/Function1;", "", "", "onHeightReceived", "Landroid/webkit/WebView;", "onCreated", "MessageContent", "(Landroidx/compose/ui/Modifier;Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageSettings;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class MessageContentKt {
    public static final void MessageContent(final androidx.compose.ui.Modifier modifier, final com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppMessageSettings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-581754426);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-581754426, i, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageContent (MessageContent.kt:36)");
        }
        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(new kotlin.jvm.functions.Function1<android.content.Context, android.webkit.WebView>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageContentKt$MessageContent$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ android.webkit.WebView invoke(android.content.Context context) {
                android.content.Context context2 = context;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "");
                android.webkit.WebView webView = new android.webkit.WebView(context2);
                kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function13 = function1;
                kotlin.jvm.functions.Function1<android.webkit.WebView, kotlin.Unit> function14 = function12;
                com.adobe.marketing.mobile.services.ui.message.InAppMessageSettings inAppMessageSettings2 = inAppMessageSettings;
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "MessageContent", "Creating MessageContent", new java.lang.Object[0]);
                webView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
                webView.addJavascriptInterface(new com.adobe.marketing.mobile.services.ui.message.DefaultInAppMessageEventHandler.WebViewJavascriptInterface(function13), "inAppContentHeightHandler");
                function14.invoke(webView);
                webView.loadDataWithBaseURL(com.adobe.marketing.mobile.services.ui.message.InAppMessagePresentable.BASE_URL, inAppMessageSettings2.getContent(), "text/html", java.nio.charset.StandardCharsets.UTF_8.name(), null);
                return webView;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        }, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.draw.ClipKt.clip(modifier, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(inAppMessageSettings.getCornerRadius()))), com.adobe.marketing.mobile.services.ui.message.views.MessageTestTags.MESSAGE_CONTENT), null, startRestartGroup, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.services.ui.message.views.MessageContentKt$MessageContent$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.services.ui.message.views.MessageContentKt.MessageContent(androidx.compose.ui.Modifier.this, inAppMessageSettings, function1, function12, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        });
    }
}
