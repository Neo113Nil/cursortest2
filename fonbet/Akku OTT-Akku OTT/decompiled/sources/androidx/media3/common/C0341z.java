package androidx.media3.common;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import com.google.android.gms.tasks.OnSuccessListener;
import com.razorpay.PhoneNumberHintHelper;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.sharedpreferences.SharedPreferencesAsyncApi;
import io.flutter.plugins.webviewflutter.PigeonApiClientCertRequest;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.media3.common.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0341z implements ListenerSet.Event, ActivityResultCallback, OnSuccessListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0341z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$57((SimpleBasePlayer.State) this.b, (Player.Listener) obj);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        com.facebook.login.w tmp0 = (com.facebook.login.w) this.b;
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke((ActivityResult) obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 3:
                GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.lambda$setUp$5((GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi) this.b, obj, reply);
                break;
            case 4:
                SharedPreferencesAsyncApi.Companion.setUp$lambda$0$0((SharedPreferencesAsyncApi) this.b, obj, reply);
                break;
            default:
                PigeonApiClientCertRequest.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiClientCertRequest) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        PhoneNumberHintHelper.m1709triggerPhoneNumberHintApi$lambda0((Activity) this.b, (PendingIntent) obj);
    }
}
