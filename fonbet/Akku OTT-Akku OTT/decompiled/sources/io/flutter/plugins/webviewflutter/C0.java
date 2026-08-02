package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class C0 implements BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ C0(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        switch (this.a) {
            case 0:
                PigeonApiWebChromeClient.onGeolocationPermissionsHidePrompt$lambda$0(this.b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", obj);
                break;
            default:
                PigeonApiWebViewClient.onReceivedHttpAuthRequest$lambda$0(this.b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", obj);
                break;
        }
    }
}
