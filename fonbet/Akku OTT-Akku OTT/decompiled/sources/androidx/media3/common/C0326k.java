package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.imagepicker.Messages;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.common.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0326k implements SimpleBasePlayer.PositionSupplier, ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0326k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return ((Player) this.b).getTotalBufferedDuration();
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        com.google.android.exoplayer2.SimpleBasePlayer.lambda$updateStateAndInformListeners$50((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                dev.fluttercommunity.workmanager.pigeon.B b = (dev.fluttercommunity.workmanager.pigeon.B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type dev.fluttercommunity.workmanager.pigeon.PeriodicTaskRequest");
                b.b((dev.fluttercommunity.workmanager.pigeon.k) obj2, new dev.fluttercommunity.workmanager.pigeon.A(reply, 0));
                break;
            case 3:
                GeneratedAndroidFirebaseCore.FirebaseAppHostApi.lambda$setUp$2((GeneratedAndroidFirebaseCore.FirebaseAppHostApi) this.b, obj, reply);
                break;
            default:
                Messages.ImagePickerApi.lambda$setUp$2((Messages.ImagePickerApi) this.b, obj, reply);
                break;
        }
    }
}
