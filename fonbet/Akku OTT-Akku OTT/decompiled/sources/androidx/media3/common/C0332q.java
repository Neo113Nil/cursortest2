package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.FlutterFirebaseMultiFactor;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.pathprovider.Messages;

/* renamed from: androidx.media3.common.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0332q implements ListenerSet.Event, ObjectConstructor, BasicMessageChannel.MessageHandler, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0332q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$get$3;
        lambda$get$3 = ConstructorConstructor.lambda$get$3((String) this.b);
        return lambda$get$3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$49((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseMultiFactor.lambda$enrollPhone$0((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$5$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            default:
                Messages.PathProviderApi.lambda$setUp$5((Messages.PathProviderApi) this.b, obj, reply);
                break;
        }
    }
}
