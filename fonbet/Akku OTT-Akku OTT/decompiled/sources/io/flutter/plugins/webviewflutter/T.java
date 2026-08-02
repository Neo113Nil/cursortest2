package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiPermissionRequest;
import io.flutter.plugins.webviewflutter.PigeonApiWebView;

/* loaded from: classes3.dex */
public final /* synthetic */ class T implements BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ T(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 0:
                PigeonApiPermissionRequest.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiPermissionRequest) this.b, obj, reply);
                break;
            default:
                PigeonApiWebView.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiWebView) this.b, obj, reply);
                break;
        }
    }
}
