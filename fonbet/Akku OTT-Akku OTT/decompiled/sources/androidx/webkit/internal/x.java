package androidx.webkit.internal;

import android.content.Intent;
import android.webkit.WebView;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.EnhancedIntentService;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((WebViewRenderProcessClient) this.b).onRenderProcessUnresponsive((WebView) this.c, (WebViewRenderProcess) this.d);
                break;
            case 1:
                ((EnhancedIntentService) this.b).lambda$processIntent$0((Intent) this.c, (TaskCompletionSource) this.d);
                break;
            default:
                ((FlutterFirebaseCrashlyticsPlugin) this.b).lambda$getPluginConstantsForFirebaseApp$12((TaskCompletionSource) this.c, (FirebaseApp) this.d);
                break;
        }
    }
}
