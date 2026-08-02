package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.googlesignin.GoogleSignInApi;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$sendSignInLinkToEmail$13((GeneratedAndroidFirebaseAuth.VoidResult) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 1:
                GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.lambda$setUp$0((GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi) this.b, obj, reply);
                break;
            default:
                GoogleSignInApi.Companion.setUp$lambda$3$0((GoogleSignInApi) this.b, obj, reply);
                break;
        }
    }
}
