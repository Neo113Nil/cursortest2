package androidx.fragment.app;

import android.os.Bundle;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.RandomTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.common.collect.G;
import fman.ge.smart_auth.SmartAuthPlugin;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiAndroidMessage;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements FragmentResultListener, ListenerSet.Event, Consumer, TrackSelectionUtil.AdaptiveTrackSelectionFactory, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((G.a) this.b).c((CuesWithTiming) obj);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        ExoTrackSelection lambda$createTrackSelections$0;
        lambda$createTrackSelections$0 = ((RandomTrackSelection.Factory) this.b).lambda$createTrackSelections$0(definition);
        return lambda$createTrackSelections$0;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$55((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        FragmentKt.setFragmentResultListener$lambda$0((Function2) this.b, str, bundle);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        List a;
        switch (this.a) {
            case 4:
                SmartAuthPlugin smartAuthPlugin = (SmartAuthPlugin) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                try {
                    smartAuthPlugin.b();
                    a = CollectionsKt.listOf((Object) null);
                } catch (Throwable th) {
                    a = com.google.android.gms.common.p.a(th);
                }
                reply.reply(a);
                break;
            case 5:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$22((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 6:
                Messages.SharedPreferencesApi.lambda$setUp$5((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
            case 7:
                PigeonApiAndroidMessage.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiAndroidMessage) this.b, obj, reply);
                break;
            default:
                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$2$0((PigeonApiWebChromeClient) this.b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiWebViewClient.onReceivedSslError$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", obj);
    }
}
