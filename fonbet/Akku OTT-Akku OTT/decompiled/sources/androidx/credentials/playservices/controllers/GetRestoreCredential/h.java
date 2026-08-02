package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0728q;
import com.facebook.internal.C0711g;
import com.facebook.internal.J;
import com.facebook.internal.w;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements OnSuccessListener, J.d, KeyEventChannel.EventResponseHandler, OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ Object a;

    public /* synthetic */ h(Object obj) {
        this.a = obj;
    }

    @Override // com.facebook.internal.J.d
    public void a(Bundle bundle, C0728q c0728q) {
        C0711g this$0 = (C0711g) this.a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity == null) {
            return;
        }
        Intent intent = activity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "fragmentActivity.intent");
        activity.setResult(c0728q == null ? -1 : 0, w.f(intent, bundle, c0728q));
        activity.finish();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$sendPasswordResetEmail$12((GeneratedAndroidFirebaseAuth.VoidResult) this.a, task);
    }

    @Override // io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler
    public void onFrameworkResponse(boolean z) {
        ((KeyboardManager.Responder.OnKeyEventHandledCallback) this.a).onKeyEventHandled(z);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$1((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.a, obj, reply);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((Function1) this.a).invoke(obj);
    }
}
