package androidx.window.embedding;

import android.content.Intent;
import androidx.window.extensions.core.util.function.Predicate;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ProgressiveMediaExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiFileChooserParams;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Predicate, ProgressiveMediaExtractor.Factory, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        ProgressiveMediaExtractor lambda$new$0;
        lambda$new$0 = ProgressiveMediaSource.Factory.lambda$new$0((ExtractorsFactory) this.b, playerId);
        return lambda$new$0;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$0((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            case 4:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$3$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$11$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiFileChooserParams.pigeon_newInstance$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", obj);
    }

    @Override // androidx.window.extensions.core.util.function.Predicate
    public boolean test(Object obj) {
        boolean translateActivityRule$lambda$15;
        translateActivityRule$lambda$15 = EmbeddingAdapter.translateActivityRule$lambda$15((ActivityRule) this.b, (Intent) obj);
        return translateActivityRule$lambda$15;
    }
}
