package androidx.media3.exoplayer.analytics;

import android.media.metrics.TrackChangeEvent;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* loaded from: classes3.dex */
public final /* synthetic */ class V0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ V0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaMetricsListener) this.b).lambda$reportTrackChangeEvent$3((TrackChangeEvent) this.c);
                break;
            case 1:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$audioSinkError$8((Exception) this.c);
                break;
            case 2:
                Util.lambda$transformFutureAsync$1((com.google.common.util.concurrent.x) this.b, (com.google.common.util.concurrent.u) this.c);
                break;
            default:
                ((CrashlyticsCore) this.b).lambda$logFatalException$8((Throwable) this.c);
                break;
        }
    }
}
