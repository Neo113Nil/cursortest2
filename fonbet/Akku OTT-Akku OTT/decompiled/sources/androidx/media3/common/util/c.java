package androidx.media3.common.util;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BackgroundThreadStateHandler) this.b).lambda$updateStateAsync$0(this.c);
                break;
            case 1:
                ((FirebaseMessaging) this.b).lambda$getToken$7((TaskCompletionSource) this.c);
                break;
            case 2:
                com.odehbros.flutter_file_downloader.downloader.d dVar = (com.odehbros.flutter_file_downloader.downloader.d) this.b;
                dVar.f.b((String) this.c);
                break;
            default:
                FlutterFirebaseMessagingPlugin.lambda$subscribeToTopic$4((Map) this.b, (TaskCompletionSource) this.c);
                break;
        }
    }
}
