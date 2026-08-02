package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmKeysRemoved$4((DrmSessionEventListener) this.c);
                break;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$decoderReleased$7((String) this.c);
                break;
        }
    }
}
