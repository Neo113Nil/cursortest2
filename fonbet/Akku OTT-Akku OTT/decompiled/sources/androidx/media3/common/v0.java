package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements ListenerSet.Event, ObjectConstructor, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newSpecialCollectionConstructor$5;
        lambda$newSpecialCollectionConstructor$5 = ConstructorConstructor.lambda$newSpecialCollectionConstructor$5((Type) this.b);
        return lambda$newSpecialCollectionConstructor$5;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$45((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                ((AnalyticsListener) obj).onDrmKeysRestored((AnalyticsListener.EventTime) this.b);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$sendEmailVerification$7((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }
}
