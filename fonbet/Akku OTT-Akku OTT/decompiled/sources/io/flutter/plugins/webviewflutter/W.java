package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiSslCertificate;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class W implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ W(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 0:
                PigeonApiSslCertificate.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiSslCertificate) this.b, obj, reply);
                break;
            default:
                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$20$0((PigeonApiWebView) this.b, obj, reply);
                break;
        }
    }
}
