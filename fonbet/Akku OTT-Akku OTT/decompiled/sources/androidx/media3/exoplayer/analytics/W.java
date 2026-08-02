package androidx.media3.exoplayer.analytics;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class W implements ListenerSet.Event, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ W(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object asListenableFuture$lambda$0;
        asListenableFuture$lambda$0 = CoroutineAdapterKt.asListenableFuture$lambda$0((kotlinx.coroutines.S) this.a, this.b, completer);
        return asListenableFuture$lambda$0;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onPlaylistMetadataChanged((AnalyticsListener.EventTime) this.a, (MediaMetadata) this.b);
    }
}
