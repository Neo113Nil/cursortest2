package io.sentry.android.replay.util;

import A1.RunnableC0032m0;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.ReplayRecording;
import io.sentry.SentryOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class PersistableLinkedList extends ConcurrentLinkedDeque<RRWebEvent> {
    public static final int $stable = 8;
    private final s6.a cacheProvider;
    private final SentryOptions options;
    private final ScheduledExecutorService persistingExecutor;
    private final String propertyName;

    public PersistableLinkedList(String str, SentryOptions sentryOptions, ScheduledExecutorService scheduledExecutorService, s6.a aVar) {
        h.e(str, "propertyName");
        h.e(sentryOptions, RRWebOptionsEvent.EVENT_TAG);
        h.e(scheduledExecutorService, "persistingExecutor");
        h.e(aVar, "cacheProvider");
        this.propertyName = str;
        this.options = sentryOptions;
        this.persistingExecutor = scheduledExecutorService;
        this.cacheProvider = aVar;
    }

    private final void persistRecording() {
        ReplayCache replayCache = (ReplayCache) this.cacheProvider.invoke();
        if (replayCache == null) {
            return;
        }
        ReplayRecording replayRecording = new ReplayRecording();
        replayRecording.setPayload(new ArrayList(this));
        if (this.options.getThreadChecker().isMainThread()) {
            this.persistingExecutor.submit(new RunnableC0032m0(this, replayRecording, replayCache, 22));
            return;
        }
        StringWriter stringWriter = new StringWriter();
        this.options.getSerializer().serialize(replayRecording, new BufferedWriter(stringWriter));
        replayCache.persistSegmentValues$sentry_android_replay_release(this.propertyName, stringWriter.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void persistRecording$lambda$1(PersistableLinkedList persistableLinkedList, ReplayRecording replayRecording, ReplayCache replayCache) {
        h.e(persistableLinkedList, "this$0");
        h.e(replayRecording, "$recording");
        h.e(replayCache, "$cache");
        StringWriter stringWriter = new StringWriter();
        persistableLinkedList.options.getSerializer().serialize(replayRecording, new BufferedWriter(stringWriter));
        replayCache.persistSegmentValues$sentry_android_replay_release(persistableLinkedList.propertyName, stringWriter.toString());
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean addAll(Collection<? extends RRWebEvent> collection) {
        h.e(collection, "elements");
        boolean zAddAll = super.addAll(collection);
        persistRecording();
        return zAddAll;
    }

    public /* bridge */ boolean contains(RRWebEvent rRWebEvent) {
        return super.contains((Object) rRWebEvent);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public boolean add(RRWebEvent rRWebEvent) {
        h.e(rRWebEvent, "element");
        boolean zAdd = super.add(rRWebEvent);
        persistRecording();
        return zAdd;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof RRWebEvent) {
            return contains((RRWebEvent) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(RRWebEvent rRWebEvent) {
        return super.remove((Object) rRWebEvent);
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof RRWebEvent) {
            return remove((RRWebEvent) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentLinkedDeque, java.util.Deque, java.util.Queue
    public RRWebEvent remove() {
        RRWebEvent rRWebEvent = (RRWebEvent) super.remove();
        persistRecording();
        h.d(rRWebEvent, "result");
        return rRWebEvent;
    }
}
