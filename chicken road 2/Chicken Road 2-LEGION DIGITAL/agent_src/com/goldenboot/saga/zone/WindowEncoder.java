package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.BadgeNormalizer;
import com.goldenboot.saga.zone.LayoutRegulator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WindowEncoder extends WrapperFabricator {
    public WindowEncoder(LayoutRegulator layoutRegulator) {
        super(layoutRegulator);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) applyTask(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) serializeOffset(collection)).booleanValue();
    }

    public Void applyTask(Object obj) {
        AlarmGuard.growPayload();
        throw new ShadowBroadcaster();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return releaseHeader().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!releaseHeader().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: notifyMessage, reason: merged with bridge method [inline-methods] */
    public PaddingUtil iterator() {
        return new PaddingUtil(releaseHeader(), ((HeaderIndex) releaseHeader().resetDelta().applyTask().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return releaseHeader().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (releaseHeader().remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        Object obj;
        BadgeNormalizer applyTask;
        int popBlueprint;
        ItemGovernor injectMetric;
        boolean detachStream;
        Set offerHash = CursorCollector.offerHash(collection);
        LayoutRegulator releaseHeader = releaseHeader();
        boolean z = false;
        do {
            obj = AlarmGuard.evictLayout;
            synchronized (obj) {
                ScopedFormer releaseHeader2 = releaseHeader.releaseHeader();
                Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                LayoutRegulator.ActivityMutator activityMutator = (LayoutRegulator.ActivityMutator) WaveBenchmark.unlockMessage((LayoutRegulator.ActivityMutator) releaseHeader2);
                applyTask = activityMutator.applyTask();
                popBlueprint = activityMutator.popBlueprint();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            BadgeNormalizer.ActivityMutator builder = applyTask.builder();
            for (Map.Entry entry : releaseHeader.entrySet()) {
                if (!offerHash.contains(entry.getKey())) {
                    builder.remove(entry.getKey());
                    z = true;
                }
            }
            DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
            BadgeNormalizer build = builder.build();
            if (Intrinsics.areEqual(build, applyTask)) {
                break;
            }
            ScopedFormer releaseHeader3 = releaseHeader.releaseHeader();
            Intrinsics.checkNotNull(releaseHeader3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            LayoutRegulator.ActivityMutator activityMutator2 = (LayoutRegulator.ActivityMutator) releaseHeader3;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                detachStream = releaseHeader.detachStream((LayoutRegulator.ActivityMutator) WaveBenchmark.growCallback(activityMutator2, releaseHeader, injectMetric), popBlueprint, build);
            }
            WaveBenchmark.cancelArchive(injectMetric, releaseHeader);
        } while (!detachStream);
        return z;
    }

    public Void serializeOffset(Collection collection) {
        AlarmGuard.growPayload();
        throw new ShadowBroadcaster();
    }
}
