package androidx.media3.exoplayer.source.preload;

import androidx.activity.RunnableC0178k;
import androidx.media3.exoplayer.source.MediaSource;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;

/* renamed from: androidx.media3.exoplayer.source.preload.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0436b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ RunnableC0436b(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((BasePreloadManager) obj3).lambda$onPreloadError$4((PreloadException) obj2, (MediaSource) obj);
                break;
            default:
                com.tekartik.sqflite.d dVar = (com.tekartik.sqflite.d) obj;
                HashMap hashMap = com.tekartik.sqflite.u.c;
                com.tekartik.sqflite.operation.c cVar = new com.tekartik.sqflite.operation.c((MethodCall) obj3, (MethodChannel.Result) obj2);
                dVar.k(cVar, new RunnableC0178k(3, dVar, cVar));
                break;
        }
    }
}
