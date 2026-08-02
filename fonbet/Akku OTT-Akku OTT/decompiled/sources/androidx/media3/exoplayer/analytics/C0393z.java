package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import java.io.Serializable;

/* renamed from: androidx.media3.exoplayer.analytics.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0393z implements ListenerSet.Event, ListenerSet.Event {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ C0393z(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((AnalyticsListener) obj).onVideoDecoderReleased((AnalyticsListener.EventTime) this.b, (String) this.c);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).onDrmSessionManagerError((AnalyticsListener.EventTime) this.b, (Exception) this.c);
                break;
        }
    }
}
