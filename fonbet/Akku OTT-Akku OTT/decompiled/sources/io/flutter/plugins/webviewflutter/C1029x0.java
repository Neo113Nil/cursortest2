package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import kotlin.jvm.functions.Function1;

/* renamed from: io.flutter.plugins.webviewflutter.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1029x0 implements BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ C1029x0(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        switch (this.a) {
            case 0:
                PigeonApiWebChromeClient.onShowFileChooser$lambda$0(this.b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", obj);
                break;
            default:
                PigeonApiWebViewClient.onPageStarted$lambda$0(this.b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", obj);
                break;
        }
    }
}
