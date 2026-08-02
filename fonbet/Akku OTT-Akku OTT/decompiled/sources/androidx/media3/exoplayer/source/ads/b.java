package androidx.media3.exoplayer.source.ads;

import androidx.media3.exoplayer.source.preload.PreloadMediaSource;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.room.QueryInterceptorDatabase;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((AdsMediaSource) this.b).maybeUpdateSourceInfo();
                break;
            case 1:
                ((PreloadMediaSource) this.b).lambda$releasePreloadMediaSource$3();
                break;
            case 2:
                ((SphericalGLSurfaceView) this.b).lambda$onDetachedFromWindow$0();
                break;
            default:
                QueryInterceptorDatabase.beginTransaction$lambda$0((QueryInterceptorDatabase) this.b);
                break;
        }
    }
}
