package io.flutter.plugins.firebase.crashlytics;

import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.webviewflutter.JavaScriptChannel;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FlutterFirebaseCrashlyticsPlugin.lambda$setUserIdentifier$9((Map) this.b, (TaskCompletionSource) this.c);
                break;
            default:
                ((JavaScriptChannel) this.b).lambda$postMessage$1((String) this.c);
                break;
        }
    }
}
