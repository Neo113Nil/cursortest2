package E5;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import n3.AbstractC1464a;

/* renamed from: E5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0187e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y3.i f2359b;

    /* renamed from: c, reason: collision with root package name */
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
                HashMap hashMap = C0188f.f2361z;
                try {
                    HashMap hashMap2 = new HashMap();
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(iVar);
                    FirebaseUser firebaseUser = firebaseAuth.f11854f;
                    String a2 = firebaseAuth.a();
                    P L7 = firebaseUser == null ? null : AbstractC1464a.L(firebaseUser);
                    if (a2 != null) {
                        hashMap2.put("APP_LANGUAGE_CODE", a2);
                    }
                    if (L7 != null) {
                        hashMap2.put("APP_CURRENT_USER", AbstractC1464a.H(L7));
                    }
                    taskCompletionSource.setResult(hashMap2);
                    break;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            default:
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(iVar, taskCompletionSource);
                break;
        }
    }
}
