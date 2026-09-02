package com.goldenboot.saga.zone;

import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/goldenboot/saga/zone/PointerMaker;", "", "Lcom/goldenboot/saga/zone/RuntimeHeap;", "available", "Lcom/goldenboot/saga/zone/MenuDiff;", "source", "drainCache", "(JI)J", "consumed", "broadcastModule", "(JJI)J", "Lcom/goldenboot/saga/zone/WaveExecutor;", "pauseComponent", "(JLcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "prependArchive", "(JJLcom/goldenboot/saga/zone/ServiceRegulator;)Ljava/lang/Object;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PointerMaker {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator {
        @Deprecated
        public static long detachStream(PointerMaker pointerMaker, long j, int i) {
            return PointerMaker.super.drainCache(j, i);
        }

        @Deprecated
        public static Object evictLayout(PointerMaker pointerMaker, long j, long j2, ServiceRegulator serviceRegulator) {
            return PointerMaker.super.prependArchive(j, j2, serviceRegulator);
        }

        @Deprecated
        public static long growPayload(PointerMaker pointerMaker, long j, long j2, int i) {
            return PointerMaker.super.broadcastModule(j, j2, i);
        }

        @Deprecated
        public static Object injectMetric(PointerMaker pointerMaker, long j, ServiceRegulator serviceRegulator) {
            return PointerMaker.super.pauseComponent(j, serviceRegulator);
        }
    }

    static /* synthetic */ Object packState(PointerMaker pointerMaker, long j, long j2, ServiceRegulator serviceRegulator) {
        return WaveExecutor.growPayload(WaveExecutor.INSTANCE.evictLayout());
    }

    static /* synthetic */ Object renderBounds(PointerMaker pointerMaker, long j, ServiceRegulator serviceRegulator) {
        return WaveExecutor.growPayload(WaveExecutor.INSTANCE.evictLayout());
    }

    default long broadcastModule(long consumed, long available, int source) {
        return RuntimeHeap.INSTANCE.releaseHeader();
    }

    default long drainCache(long available, int source) {
        return RuntimeHeap.INSTANCE.releaseHeader();
    }

    default Object pauseComponent(long j, ServiceRegulator serviceRegulator) {
        return renderBounds(this, j, serviceRegulator);
    }

    default Object prependArchive(long j, long j2, ServiceRegulator serviceRegulator) {
        return packState(this, j, j2, serviceRegulator);
    }
}
