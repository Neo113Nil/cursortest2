package com.goldenboot.saga.zone;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public class EndpointArray {
    public static final /* synthetic */ AtomicReferenceFieldUpdater evictLayout = AtomicReferenceFieldUpdater.newUpdater(EndpointArray.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public EndpointArray(boolean z) {
        this._cur$volatile = new BreadcrumbTree(8, z);
    }

    public final boolean evictLayout(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = evictLayout;
        while (true) {
            BreadcrumbTree breadcrumbTree = (BreadcrumbTree) atomicReferenceFieldUpdater.get(this);
            int evictLayout2 = breadcrumbTree.evictLayout(obj);
            if (evictLayout2 == 0) {
                return true;
            }
            if (evictLayout2 == 1) {
                OverlayDelta.evictLayout(evictLayout, this, breadcrumbTree, breadcrumbTree.connectJob());
            } else if (evictLayout2 == 2) {
                return false;
            }
        }
    }

    public final void growPayload() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = evictLayout;
        while (true) {
            BreadcrumbTree breadcrumbTree = (BreadcrumbTree) atomicReferenceFieldUpdater.get(this);
            if (breadcrumbTree.detachStream()) {
                return;
            } else {
                OverlayDelta.evictLayout(evictLayout, this, breadcrumbTree, breadcrumbTree.connectJob());
            }
        }
    }

    public final int injectMetric() {
        return ((BreadcrumbTree) evictLayout.get(this)).flushSample();
    }

    public final Object releaseHeader() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = evictLayout;
        while (true) {
            BreadcrumbTree breadcrumbTree = (BreadcrumbTree) atomicReferenceFieldUpdater.get(this);
            Object peekRevision = breadcrumbTree.peekRevision();
            if (peekRevision != BreadcrumbTree.updateTimer) {
                return peekRevision;
            }
            OverlayDelta.evictLayout(evictLayout, this, breadcrumbTree, breadcrumbTree.connectJob());
        }
    }
}
