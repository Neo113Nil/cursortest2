package androidx.media3.exoplayer.source.preload;

import androidx.room.QueryInterceptorDatabase;

/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((PreloadMediaSource) this.b).lambda$clear$1();
                break;
            default:
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5((QueryInterceptorDatabase) this.b);
                break;
        }
    }
}
