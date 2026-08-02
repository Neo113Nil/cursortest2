package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.area.WindowAreaSessionCallback;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0((CredentialProviderCreatePublicKeyCredentialController) this.b);
                break;
            case 1:
                WindowAreaControllerImpl.transferActivityToWindowArea$lambda$1((WindowAreaSessionCallback) this.b);
                break;
            case 2:
                ((DefaultTimeBar) this.b).lambda$new$0();
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.didReinitializeFirebaseCore$lambda$0((TaskCompletionSource) this.b);
                break;
        }
    }
}
