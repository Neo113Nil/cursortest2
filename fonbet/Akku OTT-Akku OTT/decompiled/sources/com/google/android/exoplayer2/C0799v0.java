package com.google.android.exoplayer2;

import android.content.Context;
import androidx.media3.exoplayer.analytics.C0348c;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.gms.auth.api.identity.C0814h;
import com.google.android.gms.auth.api.identity.C0816j;
import com.google.android.gms.internal.p000authapi.zbat;
import fman.ge.smart_auth.SmartAuthPlugin;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiCertificate;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.google.android.exoplayer2.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0799v0 implements ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0799v0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$35((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
                break;
            default:
                ((AnalyticsListener) obj).onPlayerReleased((AnalyticsListener.EventTime) this.b);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                SmartAuthPlugin smartAuthPlugin = (SmartAuthPlugin) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                androidx.compose.runtime.I callback = new androidx.compose.runtime.I(reply, 1);
                Intrinsics.checkNotNullParameter(callback, "callback");
                smartAuthPlugin.d = callback;
                C0814h c0814h = new C0814h(0);
                Intrinsics.checkNotNullExpressionValue(c0814h, "build(...)");
                Context context = smartAuthPlugin.a;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context = null;
                }
                zbat b = C0816j.b(context);
                Intrinsics.checkNotNullExpressionValue(b, "getSignInClient(...)");
                b.getPhoneNumberHintIntent(c0814h).addOnSuccessListener(new androidx.media3.common.D(new androidx.work.impl.model.a(smartAuthPlugin, 1), 2)).addOnFailureListener(new C0348c(callback, 2));
                break;
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$3((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 4:
                Messages.SharedPreferencesApi.lambda$setUp$7((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
            case 5:
                PigeonApiCertificate.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiCertificate) this.b, obj, reply);
                break;
            case 6:
                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$4$0((PigeonApiWebChromeClient) this.b, obj, reply);
                break;
            default:
                PigeonApiWebViewClient.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiWebViewClient) this.b, obj, reply);
                break;
        }
    }
}
