package androidx.media3.exoplayer.video;

import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.ui.PlayerControlView;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((VideoSink.Listener) this.b).onFrameAvailableForRendering();
                break;
            default:
                ((PlayerControlView) this.b).updateProgress();
                break;
        }
    }
}
