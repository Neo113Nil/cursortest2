package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.room.QueryInterceptorDatabase;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmKeysRestored$3((DrmSessionEventListener) this.c);
                break;
            default:
                QueryInterceptorDatabase.execSQL$lambda$10((QueryInterceptorDatabase) this.b, (String) this.c);
                break;
        }
    }
}
