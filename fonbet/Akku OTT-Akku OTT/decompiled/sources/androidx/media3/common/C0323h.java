package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.lang.reflect.Type;

/* renamed from: androidx.media3.common.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0323h implements SimpleBasePlayer.PositionSupplier, ListenerSet.Event, ObjectConstructor, BasicMessageChannel.Reply, OnCompleteListener {
    public final /* synthetic */ Object a;

    public /* synthetic */ C0323h(Object obj) {
        this.a = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newSpecialCollectionConstructor$6;
        lambda$newSpecialCollectionConstructor$6 = ConstructorConstructor.lambda$newSpecialCollectionConstructor$6((Type) this.a);
        return lambda$newSpecialCollectionConstructor$6;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return ((Player) this.a).getCurrentPosition();
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$46((SimpleBasePlayer.State) this.a, (Player.Listener) obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$sendEmailVerification$8((GeneratedAndroidFirebaseAuth.VoidResult) this.a, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        KeyEventChannel.lambda$createReplyHandler$0((KeyEventChannel.EventResponseHandler) this.a, obj);
    }
}
