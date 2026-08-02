package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;
import kotlin.jvm.functions.Function1;

/* renamed from: io.flutter.plugins.webviewflutter.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1001j0 implements BasicMessageChannel.Reply, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ C1001j0(Object obj) {
        this.a = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiWebView.Companion.setUpMessageHandlers$lambda$11$0((PigeonApiWebView) this.a, obj, reply);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiSslErrorHandler.pigeon_newInstance$lambda$0((Function1) this.a, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", obj);
    }
}
