package androidx.media3.exoplayer.hls;

import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((HlsSampleStreamWrapper.Callback) this.b).onPrepared();
                break;
            default:
                ((StyledPlayerControlView) this.b).updateProgress();
                break;
        }
    }
}
