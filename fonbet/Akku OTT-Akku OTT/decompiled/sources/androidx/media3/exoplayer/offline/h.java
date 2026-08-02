package androidx.media3.exoplayer.offline;

import androidx.media3.datasource.cache.CacheWriter;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.common.p;
import fman.ge.smart_auth.SmartAuthPlugin;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements CacheWriter.ProgressListener, ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$34((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List a;
        switch (this.a) {
            case 2:
                SmartAuthPlugin smartAuthPlugin = (SmartAuthPlugin) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                try {
                    smartAuthPlugin.c();
                    a = CollectionsKt.listOf((Object) null);
                } catch (Throwable th) {
                    a = p.a(th);
                }
                reply.reply(a);
                break;
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$2((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 4:
                Messages.SharedPreferencesApi.lambda$setUp$6((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
            default:
                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$3$0((PigeonApiWebChromeClient) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j2, long j3) {
        ((ProgressiveDownloader) this.b).onProgress(j, j2, j3);
    }
}
