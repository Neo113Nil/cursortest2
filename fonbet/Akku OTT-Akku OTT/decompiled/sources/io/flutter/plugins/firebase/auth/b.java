package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements OnCompleteListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$signInWithEmailLink$8((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 1:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$9((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            case 2:
                Messages.UrlLauncherApi.lambda$setUp$2((Messages.UrlLauncherApi) this.b, obj, reply);
                break;
            case 3:
                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$2$0((PigeonApiFlutterAssetManager) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$15$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }
}
