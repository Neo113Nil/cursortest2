package androidx.activity;

import android.content.Context;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.ui.LegacyPlayerControlView;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FullyDrawnReporter.reportRunnable$lambda$0((FullyDrawnReporter) this.b);
                break;
            case 1:
                ((VideoSink.Listener) this.b).onFirstFrameRendered();
                break;
            case 2:
                ((LegacyPlayerControlView) this.b).updateProgress();
                break;
            default:
                ProfileInstallerInitializer.writeInBackground((Context) this.b);
                break;
        }
    }
}
