package androidx.media3.exoplayer.analytics;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final /* synthetic */ class J implements ListenerSet.Event, ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ J(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onPlayerError((AnalyticsListener.EventTime) this.b, (PlaybackException) this.c);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onVideoDecoderReleased((AnalyticsListener.EventTime) this.b, (String) this.c);
                break;
        }
    }
}
