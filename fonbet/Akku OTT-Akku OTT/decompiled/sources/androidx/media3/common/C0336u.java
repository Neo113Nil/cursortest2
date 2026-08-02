package androidx.media3.common;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.internal.p001authapiphone.zzab;
import fman.ge.smart_auth.SmartAuthPlugin;
import fman.ge.smart_auth.SmartAuthPlugin.c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.common.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0336u implements ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0336u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$53((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                ((AnalyticsListener) obj).onDrmSessionReleased((AnalyticsListener.EventTime) this.b);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        Context context;
        switch (this.a) {
            case 2:
                SmartAuthPlugin smartAuthPlugin = (SmartAuthPlugin) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                androidx.compose.runtime.J callback = new androidx.compose.runtime.J(reply, 2);
                Intrinsics.checkNotNullParameter(callback, "callback");
                smartAuthPlugin.b();
                smartAuthPlugin.c();
                smartAuthPlugin.d = callback;
                smartAuthPlugin.e = smartAuthPlugin.new c();
                IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
                Context context2 = smartAuthPlugin.a;
                Context context3 = null;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context = null;
                } else {
                    context = context2;
                }
                ContextCompat.registerReceiver(context, smartAuthPlugin.e, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND", null, 2);
                Context context4 = smartAuthPlugin.a;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context3 = context4;
                }
                new zzab(context3).startSmsRetriever();
                break;
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$20((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 4:
                Messages.SharedPreferencesApi.lambda$setUp$3((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
            default:
                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiWebChromeClient) this.b, obj, reply);
                break;
        }
    }
}
