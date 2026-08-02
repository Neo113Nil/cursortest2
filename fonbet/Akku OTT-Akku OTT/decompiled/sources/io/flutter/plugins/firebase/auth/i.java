package io.flutter.plugins.firebase.auth;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp authPigeonFirebaseApp, GeneratedAndroidFirebaseAuth.Result result, Boolean bool) {
        this.c = authPigeonFirebaseApp;
        this.d = result;
        this.b = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FlutterFirebaseAuthUser.lambda$getIdToken$1((GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp) this.c, (GeneratedAndroidFirebaseAuth.Result) this.d, this.b);
                break;
            default:
                FlutterFirebaseCorePlugin.lambda$setAutomaticResourceManagementEnabled$7((String) this.c, this.b, (TaskCompletionSource) this.d);
                break;
        }
    }

    public /* synthetic */ i(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        this.c = str;
        this.b = bool;
        this.d = taskCompletionSource;
    }
}
