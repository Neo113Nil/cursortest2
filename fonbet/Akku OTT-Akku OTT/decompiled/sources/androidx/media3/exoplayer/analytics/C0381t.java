package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

/* renamed from: androidx.media3.exoplayer.analytics.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0381t implements ListenerSet.Event, Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0381t(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.a).lambda$downstreamFormatChanged$5((MediaLoadData) this.b, (MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.a, (Metadata) this.b);
    }
}
