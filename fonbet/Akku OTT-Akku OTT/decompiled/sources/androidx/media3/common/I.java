package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class I implements ListenerSet.Event, BasicMessageChannel.MessageHandler, Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ I(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$37((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List a;
        switch (this.a) {
            case 1:
                com.github.droibit.flutter.plugins.customtabs.c cVar = (com.github.droibit.flutter.plugins.customtabs.c) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                try {
                    a = CollectionsKt.listOf(cVar.d((Map) ((List) obj).get(0)));
                } catch (Throwable th) {
                    a = com.github.droibit.flutter.plugins.customtabs.h.a(th);
                }
                reply.reply(a);
                break;
            case 2:
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$5$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$13((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 4:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$11$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            case 5:
                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$2$0((PigeonApiCookieManager) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$submitTask$2;
        lambda$submitTask$2 = CrashlyticsWorker.lambda$submitTask$2((Callable) this.b, task);
        return lambda$submitTask$2;
    }
}
