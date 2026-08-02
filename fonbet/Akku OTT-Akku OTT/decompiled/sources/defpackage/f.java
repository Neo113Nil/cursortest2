package defpackage;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.RequirementsWatcher;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import dev.fluttercommunity.workmanager.pigeon.B;
import dev.fluttercommunity.workmanager.pigeon.z;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.FlutterFirebaseMultiFactor;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.pathprovider.Messages;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements BasicMessageChannel.MessageHandler, OnFailureListener, ListenerSet.Event, RequirementsWatcher.Listener, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$52((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseMultiFactor.lambda$getSession$2((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.handleCreatePassword$lambda$14$lambda$13((HiddenActivity) this.b, exc);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List b;
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                try {
                    b = CollectionsKt.listOf(hVar.isEnabled());
                } catch (Throwable th) {
                    b = k.b(th);
                }
                reply.reply(b);
                break;
            case 4:
                B b2 = (B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                b2.g(new z(reply, 0));
                break;
            case 5:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$2$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            default:
                Messages.PathProviderApi.lambda$setUp$2((Messages.PathProviderApi) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.scheduler.RequirementsWatcher.Listener
    public void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i) {
        ((DownloadManager) this.b).onRequirementsStateChanged(requirementsWatcher, i);
    }
}
