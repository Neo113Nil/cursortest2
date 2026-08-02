package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Tracks;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;

/* renamed from: androidx.media3.exoplayer.analytics.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0387w implements ListenerSet.Event, ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0387w(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onTracksChanged((AnalyticsListener.EventTime) this.b, (Tracks) this.c);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onAudioSinkError((AnalyticsListener.EventTime) this.b, (Exception) this.c);
                break;
        }
    }
}
