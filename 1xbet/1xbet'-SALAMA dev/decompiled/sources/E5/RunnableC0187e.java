package E5;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;

/* JADX INFO: renamed from: E5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0187e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y3.i f2359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2360c;

    public /* synthetic */ RunnableC0187e(Y3.i iVar, TaskCompletionSource taskCompletionSource, int i7) {
        this.f2358a = i7;
        this.f2359b = iVar;
        this.f2360c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y3.i iVar = this.f2359b;
        TaskCompletionSource taskCompletionSource = this.f2360c;
        switch (this.f2358a) {
            case 0:
                HashMap map = C0188f.f2361z;
                try {
                    HashMap map2 = new HashMap();
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(iVar);
                    FirebaseUser firebaseUser = firebaseAuth.f11854f;
                    String strA = firebaseAuth.a();
                    P pL = firebaseUser == null ? null : p097n3.a.L(firebaseUser);
                    if (strA != null) {
                        map2.put("APP_LANGUAGE_CODE", strA);
                    }
                    if (pL != null) {
                        map2.put("APP_CURRENT_USER", p097n3.a.H(pL));
                    }
                    taskCompletionSource.setResult(map2);
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
                break;
            default:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(iVar, taskCompletionSource);
                break;
        }
    }
}
