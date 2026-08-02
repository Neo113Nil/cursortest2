package androidx.lifecycle;

import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.preload.BasePreloadManager;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
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
                ((DispatchQueue) this.b).enqueue((Runnable) this.c);
                break;
            case 1:
                ((BasePreloadManager) this.b).lambda$onPreloadSkipped$5((MediaSource) this.c);
                break;
            case 2:
                ((FirebaseMessaging) this.b).lambda$deleteToken$8((TaskCompletionSource) this.c);
                break;
            default:
                net.nfet.flutter.printing.h hVar = (net.nfet.flutter.printing.h) this.b;
                hVar.b.b(hVar, (String) this.c);
                break;
        }
    }
}
