package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import com.akku.ottapp.MainActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.googlesignin.GoogleSignInApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements ListenerSet.Event, OnSuccessListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$42((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.lambda$setUp$1((GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi) this.b, obj, reply);
                break;
            default:
                GoogleSignInApi.Companion.setUp$lambda$5$0((GoogleSignInApi) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        com.akku.ottapp.g gVar = (com.akku.ottapp.g) this.b;
        int i = MainActivity.e;
        gVar.invoke(obj);
    }
}
