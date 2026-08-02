package androidx.media3.common;

import android.util.Pair;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitPairRule;
import androidx.window.extensions.core.util.function.Predicate;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class K implements ListenerSet.Event, Predicate, BasicMessageChannel.MessageHandler, ListenerSet.Event, Continuation {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ K(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$38((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                ((AnalyticsListener) obj).onDrmKeysLoaded((AnalyticsListener.EventTime) this.b);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List a;
        switch (this.a) {
            case 2:
                com.github.droibit.flutter.plugins.customtabs.c cVar = (com.github.droibit.flutter.plugins.customtabs.c) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                try {
                    cVar.a((String) obj2);
                    a = CollectionsKt.listOf((Object) null);
                } catch (Throwable th) {
                    a = com.github.droibit.flutter.plugins.customtabs.h.a(th);
                }
                reply.reply(a);
                break;
            case 3:
            case 4:
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$7$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
            case 5:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$15((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 6:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$13$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.window.extensions.core.util.function.Predicate
    public boolean test(Object obj) {
        boolean translateSplitPairRule$lambda$3;
        translateSplitPairRule$lambda$3 = EmbeddingAdapter.translateSplitPairRule$lambda$3((SplitPairRule) this.b, (Pair) obj);
        return translateSplitPairRule$lambda$3;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$submitTaskOnSuccess$4;
        lambda$submitTaskOnSuccess$4 = CrashlyticsWorker.lambda$submitTaskOnSuccess$4((Callable) this.b, task);
        return lambda$submitTaskOnSuccess$4;
    }
}
