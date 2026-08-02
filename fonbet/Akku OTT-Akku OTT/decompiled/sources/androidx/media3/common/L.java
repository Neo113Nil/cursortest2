package androidx.media3.common;

import android.app.Activity;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.extensions.core.util.function.Predicate;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiDownloadListener;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;

/* loaded from: classes3.dex */
public final /* synthetic */ class L implements ListenerSet.Event, Predicate, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ L(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$41((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$18((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 3:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$2$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            case 4:
                PigeonApiDownloadListener.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiDownloadListener) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$10$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.window.extensions.core.util.function.Predicate
    public boolean test(Object obj) {
        boolean translateActivityRule$lambda$13;
        translateActivityRule$lambda$13 = EmbeddingAdapter.translateActivityRule$lambda$13((ActivityRule) this.b, (Activity) obj);
        return translateActivityRule$lambda$13;
    }
}
