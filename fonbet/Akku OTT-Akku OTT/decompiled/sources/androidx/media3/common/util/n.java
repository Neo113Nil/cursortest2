package androidx.media3.common.util;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.u;
import com.google.common.util.concurrent.x;
import com.google.firebase.FirebaseApp;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Util.lambda$transformFutureAsync$1((x) this.b, (u) this.c);
                break;
            default:
                FlutterFirebaseAuthPlugin.lambda$getPluginConstantsForFirebaseApp$17((FirebaseApp) this.b, (TaskCompletionSource) this.c);
                break;
        }
    }
}
