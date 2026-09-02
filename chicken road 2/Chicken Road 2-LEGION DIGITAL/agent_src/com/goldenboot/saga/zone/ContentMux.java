package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ContentMux implements PointerSender {
    public final SlideInteractor detachStream;
    public final int evictLayout;
    public final int growPayload;
    public final CachedEvent injectMetric;

    public ContentMux(int i, int i2, CachedEvent cachedEvent) {
        this.evictLayout = i;
        this.growPayload = i2;
        this.injectMetric = cachedEvent;
        this.detachStream = new SlideInteractor(new SubscriberSampler(injectMetric(), clipOrigin(), cachedEvent));
    }

    @Override // com.goldenboot.saga.zone.PointerSender
    public int clipOrigin() {
        return this.growPayload;
    }

    @Override // com.goldenboot.saga.zone.SchedulerSwitch
    public ModuleAllocator detachStream(long j, ModuleAllocator moduleAllocator, ModuleAllocator moduleAllocator2, ModuleAllocator moduleAllocator3) {
        return this.detachStream.detachStream(j, moduleAllocator, moduleAllocator2, moduleAllocator3);
    }

    @Override // com.goldenboot.saga.zone.SchedulerSwitch
    public ModuleAllocator flushSample(long j, ModuleAllocator moduleAllocator, ModuleAllocator moduleAllocator2, ModuleAllocator moduleAllocator3) {
        return this.detachStream.flushSample(j, moduleAllocator, moduleAllocator2, moduleAllocator3);
    }

    @Override // com.goldenboot.saga.zone.PointerSender
    public int injectMetric() {
        return this.evictLayout;
    }
}
