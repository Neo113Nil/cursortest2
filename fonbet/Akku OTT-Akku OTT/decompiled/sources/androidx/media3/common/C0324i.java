package androidx.media3.common;

import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.exoplayer.MetadataRetriever;
import androidx.media3.exoplayer.source.TrackGroupArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.imagepicker.Messages;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.common.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0324i implements SimpleBasePlayer.PositionSupplier, MetadataRetriever.MetadataRetrieverInternal.OnPreparedListener, BasicMessageChannel.MessageHandler, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0324i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
    public long get() {
        return ((Player) this.b).getContentPosition();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthUser.lambda$verifyBeforeUpdateEmail$18((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                dev.fluttercommunity.workmanager.pigeon.B b = (dev.fluttercommunity.workmanager.pigeon.B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type dev.fluttercommunity.workmanager.pigeon.InitializeRequest");
                b.e((dev.fluttercommunity.workmanager.pigeon.g) obj2, new dev.fluttercommunity.workmanager.pigeon.u(reply, 0));
                break;
            case 3:
            default:
                Messages.ImagePickerApi.lambda$setUp$0((Messages.ImagePickerApi) this.b, obj, reply);
                break;
            case 4:
                GeneratedAndroidFirebaseCore.FirebaseAppHostApi.lambda$setUp$0((GeneratedAndroidFirebaseCore.FirebaseAppHostApi) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.MetadataRetriever.MetadataRetrieverInternal.OnPreparedListener
    public void onPrepared(TrackGroupArray trackGroupArray, Timeline timeline) {
        ((MetadataRetriever) this.b).lambda$startPreparation$0(trackGroupArray, timeline);
    }
}
