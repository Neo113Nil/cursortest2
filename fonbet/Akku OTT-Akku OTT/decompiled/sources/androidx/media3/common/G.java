package androidx.media3.common;

import android.app.Activity;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitPlaceholderRule;
import androidx.window.extensions.core.util.function.Predicate;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class G implements ListenerSet.Event, Predicate, BasicMessageChannel.MessageHandler, Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ G(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$35((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List a;
        switch (this.a) {
            case 2:
                com.github.droibit.flutter.plugins.customtabs.c cVar = (com.github.droibit.flutter.plugins.customtabs.c) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                Object obj3 = list.get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    cVar.b(str, (Map) list.get(2), ((Boolean) obj3).booleanValue());
                    a = CollectionsKt.listOf((Object) null);
                } catch (Throwable th) {
                    a = com.github.droibit.flutter.plugins.customtabs.h.a(th);
                }
                reply.reply(a);
                break;
            case 3:
            case 4:
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$3$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
            case 5:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$11((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 6:
                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiCookieManager) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.window.extensions.core.util.function.Predicate
    public boolean test(Object obj) {
        boolean translateSplitPlaceholderRule$lambda$8;
        translateSplitPlaceholderRule$lambda$8 = EmbeddingAdapter.translateSplitPlaceholderRule$lambda$8((SplitPlaceholderRule) this.b, (Activity) obj);
        return translateSplitPlaceholderRule$lambda$8;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$submit$0;
        lambda$submit$0 = CrashlyticsWorker.lambda$submit$0((Callable) this.b, task);
        return lambda$submit$0;
    }
}
