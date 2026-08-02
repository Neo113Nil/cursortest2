package androidx.work.impl;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.u;
import com.google.firebase.FirebaseApp;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((Processor) this.b).lambda$startWork$1((u) this.c, (WorkerWrapper) this.d);
                break;
            default:
                ((FlutterFirebaseCorePlugin) this.b).lambda$firebaseAppToMap$0((FirebaseApp) this.c, (TaskCompletionSource) this.d);
                break;
        }
    }
}
