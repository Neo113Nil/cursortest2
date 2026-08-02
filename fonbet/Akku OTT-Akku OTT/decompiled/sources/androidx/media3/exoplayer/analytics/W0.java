package androidx.media3.exoplayer.analytics;

import android.media.metrics.NetworkEvent;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* loaded from: classes3.dex */
public final /* synthetic */ class W0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ W0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaMetricsListener) this.b).lambda$maybeReportNetworkChange$1((NetworkEvent) this.c);
                break;
            default:
                ((CrashlyticsCore) this.b).lambda$setUserId$4((String) this.c);
                break;
        }
    }
}
