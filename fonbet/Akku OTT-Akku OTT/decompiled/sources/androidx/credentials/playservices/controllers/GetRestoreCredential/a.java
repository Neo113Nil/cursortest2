package androidx.credentials.playservices.controllers.GetRestoreCredential;

import com.google.android.gms.tasks.OnSuccessListener;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiFlutterAssetManager;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnSuccessListener, BasicMessageChannel.MessageHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 1:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$7((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            case 2:
                Messages.UrlLauncherApi.lambda$setUp$0((Messages.UrlLauncherApi) this.b, obj, reply);
                break;
            case 3:
                PigeonApiFlutterAssetManager.Companion.setUpMessageHandlers$lambda$0$0((PigeonApiFlutterAssetManager) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$13$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((Function1) this.b).invoke(obj);
    }
}
