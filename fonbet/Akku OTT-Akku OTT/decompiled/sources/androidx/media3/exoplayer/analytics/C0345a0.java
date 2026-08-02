package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.datatransport.runtime.firebase.transport.c;
import com.google.android.datatransport.runtime.synchronization.b;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.exoplayer.analytics.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0345a0 implements ListenerSet.Event, b.a, DefaultTrackSelector.TrackInfo.Factory {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0345a0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        List lambda$selectVideoTrack$2;
        lambda$selectVideoTrack$2 = DefaultTrackSelector.lambda$selectVideoTrack$2((DefaultTrackSelector.Parameters) this.a, (int[]) this.b, i, trackGroup, iArr);
        return lambda$selectVideoTrack$2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.b.a
    public Object execute() {
        com.google.android.datatransport.runtime.scheduling.jobscheduling.m mVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.m) this.a;
        Iterator it = ((HashMap) this.b).entrySet().iterator();
        while (it.hasNext()) {
            mVar.i.s(((Integer) r2.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onVideoEnabled((AnalyticsListener.EventTime) this.a, (DecoderCounters) this.b);
    }
}
