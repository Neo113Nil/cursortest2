package androidx.media3.exoplayer.source.preload;

import androidx.room.QueryInterceptorDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class A implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ A(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((PreloadMediaSource) this.b).checkForPreloadError();
                break;
            case 1:
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1((QueryInterceptorDatabase) this.b);
                break;
            default:
                ((AtomicBoolean) this.b).set(true);
                break;
        }
    }
}
