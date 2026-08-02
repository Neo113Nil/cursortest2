package androidx.media3.exoplayer.analytics;

import androidx.media3.common.DeviceInfo;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.video.VideoSize;

/* loaded from: classes3.dex */
public final /* synthetic */ class N implements ListenerSet.Event, ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ N(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.b, (DeviceInfo) this.c);
                break;
            default:
                com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector.lambda$onVideoSizeChanged$56((AnalyticsListener.EventTime) this.b, (VideoSize) this.c, (com.google.android.exoplayer2.analytics.AnalyticsListener) obj);
                break;
        }
    }
}
