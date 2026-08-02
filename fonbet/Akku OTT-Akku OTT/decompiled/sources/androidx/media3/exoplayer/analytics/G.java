package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* loaded from: classes3.dex */
public final /* synthetic */ class G implements ListenerSet.Event, ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ G(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onDownstreamFormatChanged((AnalyticsListener.EventTime) this.b, (MediaLoadData) this.c);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.b, (DeviceInfo) this.c);
                break;
        }
    }
}
