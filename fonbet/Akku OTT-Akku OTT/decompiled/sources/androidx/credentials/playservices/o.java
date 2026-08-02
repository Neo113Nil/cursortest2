package androidx.credentials.playservices;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import dev.fluttercommunity.workmanager.pigeon.B;
import dev.fluttercommunity.workmanager.pigeon.t;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.pathprovider.Messages;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements OnFailureListener, ListenerSet.Event, ObjectConstructor, BasicMessageChannel.MessageHandler, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newDefaultConstructor$7;
        lambda$newDefaultConstructor$7 = ConstructorConstructor.lambda$newDefaultConstructor$7((String) this.b);
        return lambda$newDefaultConstructor$7;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$51((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$delete$0((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1((HiddenActivity) this.b, exc);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                B b = (B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                b.i((String) obj2, new t(reply, 0));
                break;
            case 4:
            default:
                Messages.PathProviderApi.lambda$setUp$0((Messages.PathProviderApi) this.b, obj, reply);
                break;
            case 5:
                GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.lambda$setUp$1((GeneratedAndroidFirebaseCore.FirebaseCoreHostApi) this.b, obj, reply);
                break;
        }
    }
}
