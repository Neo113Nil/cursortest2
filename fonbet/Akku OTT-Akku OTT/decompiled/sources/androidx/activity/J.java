package androidx.activity;

import androidx.navigationevent.OnBackCompletedFallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.googlesignin.GoogleSignInApi;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements OnBackCompletedFallback, OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ J(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.navigationevent.OnBackCompletedFallback
    public void onBackCompletedFallback() {
        OnBackPressedDispatcher.eventDispatcher$lambda$0((OnBackPressedDispatcher) this.b);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$confirmPasswordReset$2((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.GenerateInterfaces.lambda$setUp$0((GeneratedAndroidFirebaseAuth.GenerateInterfaces) this.b, obj, reply);
                break;
            default:
                GoogleSignInApi.Companion.setUp$lambda$2$0((GoogleSignInApi) this.b, obj, reply);
                break;
        }
    }
}
