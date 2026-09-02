package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public interface ContextOverseer {
    ModuleAllocator detachStream(ModuleAllocator moduleAllocator, ModuleAllocator moduleAllocator2);

    float evictLayout();

    ModuleAllocator growPayload(long j, ModuleAllocator moduleAllocator, ModuleAllocator moduleAllocator2);

    ModuleAllocator injectMetric(long j, ModuleAllocator moduleAllocator, ModuleAllocator moduleAllocator2);

    long releaseHeader(ModuleAllocator moduleAllocator, ModuleAllocator moduleAllocator2);
}
