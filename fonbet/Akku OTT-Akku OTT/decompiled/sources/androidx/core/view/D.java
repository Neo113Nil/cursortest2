package androidx.core.view;

import android.view.ViewConfiguration;
import androidx.core.util.Supplier;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.preload.PreloadException;
import androidx.media3.exoplayer.source.preload.PreloadManagerListener;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiDownloadListener;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Supplier, ListenerSet.Event, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ D(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        return Integer.valueOf(((ViewConfiguration) this.b).getScaledMinimumFlingVelocity());
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$40((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                ((PreloadManagerListener) obj).onError((PreloadException) this.b);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$17((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 4:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$1$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$9$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiDownloadListener.onDownloadStart$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", obj);
    }
}
