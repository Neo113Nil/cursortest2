package androidx.media3.exoplayer.analytics;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.work.WorkerKt;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class S implements ListenerSet.Event, CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ S(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Unit future$lambda$2;
        future$lambda$2 = WorkerKt.future$lambda$2((Executor) this.a, (Function0) this.b, completer);
        return future$lambda$2;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onVideoDisabled((AnalyticsListener.EventTime) this.a, (DecoderCounters) this.b);
    }
}
