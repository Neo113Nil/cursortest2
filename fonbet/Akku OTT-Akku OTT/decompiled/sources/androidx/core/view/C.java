package androidx.core.view;

import android.util.Pair;
import android.view.ViewConfiguration;
import androidx.core.util.Supplier;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import androidx.media3.exoplayer.source.preload.PreloadManagerListener;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitPairRule;
import androidx.window.extensions.core.util.function.Predicate;
import com.google.android.gms.cloudmessaging.C0819a;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiCustomViewCallback;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Supplier, ListenerSet.Event, Predicate, Continuation, OnSuccessListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        return Integer.valueOf(((ViewConfiguration) this.b).getScaledMaximumFlingVelocity());
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$39((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                BasePreloadManager.lambda$onPreloadCompleted$1((MediaSource) this.b, (PreloadManagerListener) obj);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 6:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$16((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 7:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$14$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            case 8:
                PigeonApiCustomViewCallback.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiCustomViewCallback) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$8$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((FirebaseMessaging) this.b).lambda$handleProxiedNotificationData$5((C0819a) obj);
    }

    @Override // androidx.window.extensions.core.util.function.Predicate
    public boolean test(Object obj) {
        boolean translateSplitPairRule$lambda$5;
        translateSplitPairRule$lambda$5 = EmbeddingAdapter.translateSplitPairRule$lambda$5((SplitPairRule) this.b, (Pair) obj);
        return translateSplitPairRule$lambda$5;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Task lambda$submitTaskOnSuccess$5;
        lambda$submitTaskOnSuccess$5 = CrashlyticsWorker.lambda$submitTaskOnSuccess$5((SuccessContinuation) this.b, task);
        return lambda$submitTaskOnSuccess$5;
    }
}
