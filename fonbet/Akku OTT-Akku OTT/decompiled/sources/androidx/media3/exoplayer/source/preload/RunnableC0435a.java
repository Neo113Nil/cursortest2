package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;

/* renamed from: androidx.media3.exoplayer.source.preload.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0435a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC0435a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((BasePreloadManager) this.b).lambda$onPreloadCompleted$2((MediaSource) this.c);
                break;
            case 1:
                ((FlutterFirebaseMessagingPlugin) this.b).lambda$getToken$3((TaskCompletionSource) this.c);
                break;
            default:
                net.nfet.flutter.printing.h hVar = (net.nfet.flutter.printing.h) this.b;
                hVar.b.b(hVar, (String) this.c);
                break;
        }
    }
}
