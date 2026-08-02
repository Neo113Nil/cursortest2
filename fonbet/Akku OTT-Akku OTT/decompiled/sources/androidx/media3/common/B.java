package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest;

/* loaded from: classes3.dex */
public final /* synthetic */ class B implements ListenerSet.Event, Continuation, FirebaseInstanceIdInternal.NewTokenListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ B(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$59((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$10((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 4:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$6$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            default:
                PigeonApiClientCertRequest.Companion.setUpMessageHandlers$lambda$2$0((PigeonApiClientCertRequest) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        ((FirebaseMessaging) this.b).lambda$new$1(str);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean onReportSendComplete;
        onReportSendComplete = ((SessionReportingCoordinator) this.b).onReportSendComplete(task);
        return Boolean.valueOf(onReportSendComplete);
    }
}
