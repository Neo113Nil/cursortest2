package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.media3.common.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0340y implements ListenerSet.Event, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0340y(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$56((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$4((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 3:
                Messages.SharedPreferencesApi.lambda$setUp$8((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
            case 4:
            default:
                PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiWebViewClient) this.b, obj, reply);
                break;
            case 5:
                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$5$0((PigeonApiWebChromeClient) this.b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiClientCertRequest.pigeon_newInstance$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", obj);
    }
}
