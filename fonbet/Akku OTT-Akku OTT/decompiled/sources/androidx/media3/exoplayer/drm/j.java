package androidx.media3.exoplayer.drm;

import android.graphics.SurfaceTexture;
import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmKeysLoaded$1((DrmSessionEventListener) this.c);
                break;
            case 1:
                ((AdsMediaSource) this.b).lambda$onChildSourceInfoRefreshed$2((Timeline) this.c);
                break;
            default:
                ((SphericalGLSurfaceView) this.b).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.c);
                break;
        }
    }
}
