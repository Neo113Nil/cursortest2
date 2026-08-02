package androidx.activity.result;

import androidx.media3.common.e0;
import com.akku.ottapp.MainActivity;
import com.akku.ottapp.g;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleBasePlayer;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ActivityResultCallback, MethodChannel.MethodCallHandler, ListenerSet.Event, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ a(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        SimpleBasePlayer.lambda$updateStateAndInformListeners$41((SimpleBasePlayer.State) this.a, (Player.Listener) obj);
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ((Function1) this.a).invoke(obj);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.lambda$setUp$0((GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi) this.a, obj, reply);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        MainActivity mainActivity = (MainActivity) this.a;
        int i = MainActivity.e;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.areEqual(call.method, "requestIntegrityToken")) {
            result.notImplemented();
            return;
        }
        String str = (String) call.argument("nonce");
        if (str == null) {
            result.error("INVALID_NONCE", "Nonce is required", null);
            return;
        }
        try {
            IntegrityManager create = IntegrityManagerFactory.create(mainActivity.getApplicationContext());
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            Intrinsics.checkNotNull(create.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).build()).addOnSuccessListener(new e0(new g(result), 1)).addOnFailureListener(new com.akku.ottapp.d(result)));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            result.error("INTEGRITY_EXCEPTION", message, e.toString());
        }
    }
}
