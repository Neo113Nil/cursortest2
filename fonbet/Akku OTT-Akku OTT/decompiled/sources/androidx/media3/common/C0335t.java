package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.offline.DownloadManager;
import androidx.media3.exoplayer.scheduler.RequirementsWatcher;
import fman.ge.smart_auth.SmartAuthPlugin;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.common.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0335t implements ListenerSet.Event, RequirementsWatcher.Listener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0335t(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$52((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List a;
        switch (this.a) {
            case 2:
                SmartAuthPlugin smartAuthPlugin = (SmartAuthPlugin) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                try {
                    a = CollectionsKt.listOf(smartAuthPlugin.a());
                } catch (Throwable th) {
                    a = com.google.android.gms.common.p.a(th);
                }
                reply.reply(a);
                break;
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$1((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            default:
                Messages.SharedPreferencesApi.lambda$setUp$2((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.b).onRequirementsStateChanged(requirementsWatcher, i);
    }
}
