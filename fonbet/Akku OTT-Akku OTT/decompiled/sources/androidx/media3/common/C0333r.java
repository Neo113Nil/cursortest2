package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import com.google.android.datatransport.runtime.synchronization.b;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;
import java.util.Iterator;

/* renamed from: androidx.media3.common.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0333r implements ListenerSet.Event, b.a, ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0333r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b.a
    public Object execute() {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.o oVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.o) this.b;
        Iterator it = oVar.b.g().iterator();
        while (it.hasNext()) {
            oVar.c.a((com.google.android.datatransport.runtime.n) it.next(), 1);
        }
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$51((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                com.google.android.exoplayer2.SimpleBasePlayer.lambda$updateStateAndInformListeners$57((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$7$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            case 4:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$0((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            default:
                Messages.SharedPreferencesApi.lambda$setUp$0((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
        }
    }
}
