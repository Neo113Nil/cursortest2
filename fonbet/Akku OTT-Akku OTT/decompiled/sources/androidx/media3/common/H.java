package androidx.media3.common;

import android.content.Intent;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.ReorderingBufferQueue;
import androidx.media3.extractor.ts.SeiReader;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitPlaceholderRule;
import androidx.window.extensions.core.util.function.Predicate;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiCookieManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class H implements ListenerSet.Event, ReorderingBufferQueue.OutputConsumer, Predicate, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
    public void consume(long j, ParsableByteArray parsableByteArray) {
        ((SeiReader) this.b).lambda$new$0(j, parsableByteArray);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$36((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List a;
        switch (this.a) {
            case 3:
                com.github.droibit.flutter.plugins.customtabs.c cVar = (com.github.droibit.flutter.plugins.customtabs.c) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                try {
                    cVar.c();
                    a = CollectionsKt.listOf((Object) null);
                } catch (Throwable th) {
                    a = com.github.droibit.flutter.plugins.customtabs.h.a(th);
                }
                reply.reply(a);
                break;
            case 4:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$12((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 5:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$10$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            case 6:
                PigeonApiCookieManager.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiCookieManager) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$4$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.window.extensions.core.util.function.Predicate
    public boolean test(Object obj) {
        boolean translateSplitPlaceholderRule$lambda$10;
        translateSplitPlaceholderRule$lambda$10 = EmbeddingAdapter.translateSplitPlaceholderRule$lambda$10((SplitPlaceholderRule) this.b, (Intent) obj);
        return translateSplitPlaceholderRule$lambda$10;
    }
}
