package androidx.media3.exoplayer.analytics;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.work.ListenableFutureKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class I implements ListenerSet.Event, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ I(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object launchFuture$lambda$1;
        launchFuture$lambda$1 = ListenableFutureKt.launchFuture$lambda$1((CoroutineContext) this.a, (kotlinx.coroutines.M) this.b, (Function2) this.c, completer);
        return launchFuture$lambda$1;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadCanceled((AnalyticsListener.EventTime) this.a, (LoadEventInfo) this.b, (MediaLoadData) this.c);
    }
}
