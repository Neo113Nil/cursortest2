package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;

/* renamed from: androidx.media3.exoplayer.analytics.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0361i0 implements ListenerSet.Event, ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0361i0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onDrmKeysLoaded((AnalyticsListener.EventTime) this.b);
                break;
            case 1:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$58((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onSeekStarted((AnalyticsListener.EventTime) this.b);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$8$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            case 4:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$19((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            default:
                Messages.SharedPreferencesApi.lambda$setUp$1((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
        }
    }
}
