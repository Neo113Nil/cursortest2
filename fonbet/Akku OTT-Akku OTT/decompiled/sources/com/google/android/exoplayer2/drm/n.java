package com.google.android.exoplayer2.drm;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.x;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((OfflineLicenseHelper) this.b).lambda$releaseManagerOnHandlerThread$4((x) this.c);
                break;
            case 1:
                com.tekartik.sqflite.g gVar = (com.tekartik.sqflite.g) this.b;
                com.tekartik.sqflite.f fVar = (com.tekartik.sqflite.f) this.c;
                gVar.getClass();
                fVar.b.run();
                gVar.f = fVar;
                gVar.e.run();
                break;
            default:
                ((FlutterFirebaseMessagingPlugin) this.b).lambda$requestPermissions$12((TaskCompletionSource) this.c);
                break;
        }
    }
}
