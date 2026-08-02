package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiSslErrorHandler;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;

/* renamed from: io.flutter.plugins.webviewflutter.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1005l0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1005l0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 0:
                PigeonApiSslErrorHandler.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiSslErrorHandler) this.b, obj, reply);
                break;
            default:
                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$13$0((PigeonApiWebView) this.b, obj, reply);
                break;
        }
    }
}
