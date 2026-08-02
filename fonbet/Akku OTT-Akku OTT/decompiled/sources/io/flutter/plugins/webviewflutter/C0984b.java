package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.webviewflutter.PigeonApiHttpAuthHandler;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettingsCompat;
import kotlin.jvm.functions.Function1;

/* renamed from: io.flutter.plugins.webviewflutter.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0984b implements BasicMessageChannel.Reply, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0984b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 1:
                PigeonApiHttpAuthHandler.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiHttpAuthHandler) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettingsCompat.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiWebSettingsCompat) this.b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        AndroidWebkitLibraryPigeonInstanceManagerApi.removeStrongReference$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference", obj);
    }
}
