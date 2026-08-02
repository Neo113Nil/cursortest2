package F5;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2764b;

    public /* synthetic */ d(int i7, TaskCompletionSource taskCompletionSource) {
        this.f2763a = i7;
        this.f2764b = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TaskCompletionSource taskCompletionSource = this.f2764b;
        switch (this.f2763a) {
            case 0:
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(taskCompletionSource);
                break;
            case 1:
                HashMap hashMap = G5.d.f3055e;
                try {
                    taskCompletionSource.setResult(new HashMap());
                    break;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 2:
                HashMap hashMap2 = H5.e.f3360y;
                try {
                    taskCompletionSource.setResult(null);
                    break;
                } catch (Exception e8) {
                    taskCompletionSource.setException(e8);
                    return;
                }
            default:
                HashMap hashMap3 = K5.b.f4087c;
                taskCompletionSource.setResult(new HashMap());
                break;
        }
    }
}
