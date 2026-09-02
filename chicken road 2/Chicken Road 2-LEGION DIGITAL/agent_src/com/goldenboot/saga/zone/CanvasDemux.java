package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class CanvasDemux {

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements ContainerEntry {
        public final List evictLayout;

        public ActivityMutator(ModuleAllocator moduleAllocator, float f, float f2) {
            WatcherLogger attachConfig = CellEntry.attachConfig(0, moduleAllocator.growPayload());
            ArrayList arrayList = new ArrayList(ContainerStage.gatherAdapter(attachConfig, 10));
            Iterator it = attachConfig.iterator();
            while (it.hasNext()) {
                arrayList.add(new SurfaceSignal(f, f2, moduleAllocator.evictLayout(((SubscriberChunk) it).nextInt())));
            }
            this.evictLayout = arrayList;
        }

        @Override // com.goldenboot.saga.zone.ContainerEntry
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public SurfaceSignal get(int i) {
            return (SurfaceSignal) this.evictLayout.get(i);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements ContainerEntry {
        public final SurfaceSignal evictLayout;

        public BounceHandler(float f, float f2) {
            this.evictLayout = new SurfaceSignal(f, f2, 0.0f, 4, null);
        }

        @Override // com.goldenboot.saga.zone.ContainerEntry
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public SurfaceSignal get(int i) {
            return this.evictLayout;
        }
    }

    public static final ContainerEntry growPayload(ModuleAllocator moduleAllocator, float f, float f2) {
        return moduleAllocator != null ? new ActivityMutator(moduleAllocator, f, f2) : new BounceHandler(f, f2);
    }
}
