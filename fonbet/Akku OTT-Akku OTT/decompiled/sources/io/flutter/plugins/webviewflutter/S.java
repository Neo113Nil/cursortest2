package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiPermissionRequest;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class S implements BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ Object a;

    public /* synthetic */ S(Object obj) {
        this.a = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiPermissionRequest.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiPermissionRequest) this.a, obj, reply);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiWebView.pigeon_newInstance$lambda$0((Function1) this.a, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", obj);
    }
}
