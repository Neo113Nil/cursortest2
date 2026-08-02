package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class V implements BasicMessageChannel.Reply, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ V(Object obj) {
        this.a = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebView.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiWebView) this.a, obj, reply);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiSslCertificate.pigeon_newInstance$lambda$0((Function1) this.a, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", obj);
    }
}
