package com.goldenboot.saga.zone;

import androidx.compose.ui.RemoteCallback;
import kotlin.Metadata;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/RemoteCallback$LayerUseCase;", "Lcom/goldenboot/saga/zone/PlatformBroadcaster;", "T", "Lkotlin/Function0;", "Lcom/goldenboot/saga/zone/DpadBuilder;", "block", "evictLayout", "(Landroidx/compose/ui/RemoteCallback$LayerUseCase;Lcom/goldenboot/saga/zone/ElevationNode;)V", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObserverChannel {
    public static final <T extends RemoteCallback.LayerUseCase & PlatformBroadcaster> void evictLayout(T t, ElevationNode elevationNode) {
        ScopedFilter ownerScope = t.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new ScopedFilter(t);
            t.closeEdge(ownerScope);
        }
        LayoutConstructor.drawRequest(t).getSnapshotObserver().applyTask(ownerScope, ScopedFilter.INSTANCE.evictLayout(), elevationNode);
    }
}
