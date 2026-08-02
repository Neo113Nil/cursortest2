package androidx.webkit;

import androidx.webkit.WebViewCompat;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.urllauncher.Messages;
import io.flutter.plugins.webviewflutter.PigeonApiGeolocationPermissionsCallback;
import io.flutter.plugins.webviewflutter.PigeonApiWebSettings;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements WebViewCompat.WebViewStartUpCallback, OnCompleteListener, BasicMessageChannel.MessageHandler, BasicMessageChannel.Reply {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        FlutterFirebaseAuthPlugin.lambda$signInWithEmailAndPassword$7((GeneratedAndroidFirebaseAuth.Result) this.b, task);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.a) {
            case 2:
                GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.lambda$setUp$10((GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi) this.b, obj, reply);
                break;
            case 3:
                Messages.UrlLauncherApi.lambda$setUp$3((Messages.UrlLauncherApi) this.b, obj, reply);
                break;
            default:
                PigeonApiWebSettings.Companion.setUpMessageHandlers$lambda$16$0((PigeonApiWebSettings) this.b, obj, reply);
                break;
        }
    }

    @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
    public void onSuccess(WebViewStartUpResult webViewStartUpResult) {
        WebViewCompat.lambda$startUpWebView$1((WebViewCompat.WebViewStartUpCallback) this.b, webViewStartUpResult);
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(Object obj) {
        PigeonApiGeolocationPermissionsCallback.pigeon_newInstance$lambda$0((Function1) this.b, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", obj);
    }
}
