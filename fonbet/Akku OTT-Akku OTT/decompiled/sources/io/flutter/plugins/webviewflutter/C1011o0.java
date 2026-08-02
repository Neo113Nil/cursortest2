package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiView;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;

/* renamed from: io.flutter.plugins.webviewflutter.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1011o0 implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1011o0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 0:
                PigeonApiView.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiView) this.b, obj, reply);
                break;
            default:
                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$16$0((PigeonApiWebView) this.b, obj, reply);
                break;
        }
    }
}
