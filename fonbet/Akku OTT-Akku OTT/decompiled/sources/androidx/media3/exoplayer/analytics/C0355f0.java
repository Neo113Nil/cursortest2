package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.analytics.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0355f0 implements ListenerSet.Event, ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0355f0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        List lambda$selectTextTrack$4;
        lambda$selectTextTrack$4 = DefaultTrackSelector.lambda$selectTextTrack$4((DefaultTrackSelector.Parameters) this.b, (String) this.c, i, trackGroup, iArr);
        return lambda$selectTextTrack$4;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onUpstreamDiscarded((AnalyticsListener.EventTime) this.b, (MediaLoadData) this.c);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.b, (PlaybackParameters) this.c);
                break;
        }
    }
}
