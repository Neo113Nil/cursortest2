package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiView;
import kotlin.jvm.functions.Function1;

/* renamed from: io.flutter.plugins.webviewflutter.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1019s0 implements BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ Object a;

    public /* synthetic */ C1019s0(Object obj) {
        this.a = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        PigeonApiView.Companion.setUpMessageHandlers$lambda$5$0((PigeonApiView) this.a, obj, reply);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiWebViewClient.urlLoading$lambda$0((Function1) this.a, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", obj);
    }
}
