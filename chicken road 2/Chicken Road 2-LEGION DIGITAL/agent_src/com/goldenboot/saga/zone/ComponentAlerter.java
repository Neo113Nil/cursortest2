package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/goldenboot/saga/zone/SelectionHub;", "Lcom/goldenboot/saga/zone/ContentQueue;", "evictLayout", "Lcom/goldenboot/saga/zone/SelectionHub;", "()Lcom/goldenboot/saga/zone/SelectionHub;", "LocalPinnableContainer", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentAlerter {
    private static final SelectionHub evictLayout = CellAllocator.updateTimer(null, ActivityMutator.reduceScope, 1, null);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/goldenboot/saga/zone/ContentQueue;", "evictLayout", "()Lcom/goldenboot/saga/zone/ContentQueue;"}, k = 3, mv = {2, 0, 0})
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ContentQueue invoke() {
            return null;
        }
    }

    public static final SelectionHub evictLayout() {
        return evictLayout;
    }
}
