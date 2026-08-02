package androidx.media3.common;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleExtractor;
import com.facebook.internal.C0715k;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import fman.ge.smart_auth.SmartAuthPlugin;
import fman.ge.smart_auth.SmartAuthPlugin.b;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiWebChromeClient;
import io.flutter.plugins.webviewflutter.PigeonApiWebViewClient;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.common.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0337v implements ListenerSet.Event, Consumer, C0715k.a, ObjectConstructor, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0337v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((SubtitleExtractor) this.b).lambda$parseAndWriteToOutput$0((CuesWithTiming) obj);
    }

    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        String str = (String) this.b;
        if (z) {
            try {
                com.facebook.internal.instrument.errorreport.a aVar = new com.facebook.internal.instrument.errorreport.a(str);
                if ((aVar.b == null || aVar.c == null) ? false : true) {
                    com.facebook.internal.instrument.j.g(aVar.a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newUnsafeAllocator$19;
        lambda$newUnsafeAllocator$19 = ConstructorConstructor.lambda$newUnsafeAllocator$19((Class) this.b);
        return lambda$newUnsafeAllocator$19;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$54((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        Context context;
        switch (this.a) {
            case 4:
                SmartAuthPlugin smartAuthPlugin = (SmartAuthPlugin) this.b;
                Intrinsics.checkNotNullParameter(reply, "reply");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                String str = (String) ((List) obj).get(0);
                androidx.compose.runtime.H callback = new androidx.compose.runtime.H(reply, 1);
                Intrinsics.checkNotNullParameter(callback, "callback");
                smartAuthPlugin.b();
                smartAuthPlugin.c();
                smartAuthPlugin.d = callback;
                smartAuthPlugin.f = smartAuthPlugin.new b();
                IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
                Context context2 = smartAuthPlugin.a;
                Context context3 = null;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                    context = null;
                } else {
                    context = context2;
                }
                ContextCompat.registerReceiver(context, smartAuthPlugin.f, intentFilter, "com.google.android.gms.auth.api.phone.permission.SEND", null, 2);
                Context context4 = smartAuthPlugin.a;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                } else {
                    context3 = context4;
                }
                new zzab(context3).startSmsUserConsent(str);
                break;
            case 5:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$21((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 6:
                Messages.SharedPreferencesApi.lambda$setUp$4((Messages.SharedPreferencesApi) this.b, obj, reply);
                break;
            default:
                PigeonApiWebChromeClient.Companion.setUpMessageHandlers$lambda$1$0((PigeonApiWebChromeClient) this.b, obj, reply);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiWebViewClient.pigeon_newInstance$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", obj);
    }
}
