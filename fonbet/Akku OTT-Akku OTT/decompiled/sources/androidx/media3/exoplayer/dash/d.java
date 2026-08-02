package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.source.preload.PreCacheHelper;
import androidx.room.AutoCloser;
import com.facebook.internal.n;
import com.facebook.internal.p;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(p.b bVar, n nVar) {
        this.a = 3;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DashMediaSource) this.b).lambda$new$0();
                break;
            case 1:
                ((PreCacheHelper) this.b).lambda$stop$1();
                break;
            case 2:
                AutoCloser.executeAutoCloser$lambda$0((AutoCloser) this.b);
                break;
            default:
                ((p.b) this.b).onSuccess();
                break;
        }
    }

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
