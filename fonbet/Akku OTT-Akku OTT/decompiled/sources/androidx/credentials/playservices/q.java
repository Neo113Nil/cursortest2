package androidx.credentials.playservices;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.datatransport.runtime.synchronization.b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import dev.fluttercommunity.workmanager.pigeon.B;
import dev.fluttercommunity.workmanager.pigeon.y;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.analytics.FirebaseAnalyticsHostApi;
import io.flutter.plugins.firebase.auth.FlutterFirebaseMultiFactor;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.pathprovider.Messages;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnFailureListener, ListenerSet.Event, ReorderingBufferQueue.OutputConsumer, b.a, ObjectConstructor, BasicMessageChannel.MessageHandler, OnCompleteListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$get$2;
        lambda$get$2 = ConstructorConstructor.lambda$get$2((String) this.b);
        return lambda$get$2;
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j, ParsableByteArray parsableByteArray) {
        ((FragmentedMp4Extractor) this.b).lambda$new$2(j, parsableByteArray);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b.a
    public Object execute() {
        return Integer.valueOf(((com.google.android.datatransport.runtime.scheduling.persistence.d) this.b).b());
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$48((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 7:
                FlutterFirebaseMultiFactor.lambda$unenroll$3((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
                break;
            default:
                FlutterFirebaseCrashlyticsPlugin.lambda$onMethodCall$11((MethodChannel.Result) this.b, task);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5((HiddenActivity) this.b, exc);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 5:
                B b = (B) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                b.h(new y(reply, 0));
                break;
            case 6:
                FirebaseAnalyticsHostApi.Companion.setUp$lambda$4$0((FirebaseAnalyticsHostApi) this.b, obj, reply);
                break;
            default:
                Messages.PathProviderApi.lambda$setUp$4((Messages.PathProviderApi) this.b, obj, reply);
                break;
        }
    }
}
