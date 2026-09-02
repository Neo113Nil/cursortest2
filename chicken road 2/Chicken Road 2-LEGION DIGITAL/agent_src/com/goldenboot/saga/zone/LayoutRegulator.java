package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.BadgeNormalizer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class LayoutRegulator implements BorderHook, Map, KMutableMap {
    public final Collection attachConfig;
    public final Set connectPatch;
    public final Set notifyMessage;
    public ScopedFormer reduceScope;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends ScopedFormer {
        public int detachStream;
        public BadgeNormalizer injectMetric;

        public ActivityMutator(long j, BadgeNormalizer badgeNormalizer) {
            super(j);
            this.injectMetric = badgeNormalizer;
        }

        public final BadgeNormalizer applyTask() {
            return this.injectMetric;
        }

        public final void connectJob(int i) {
            this.detachStream = i;
        }

        @Override // com.goldenboot.saga.zone.ScopedFormer
        public ScopedFormer detachStream(long j) {
            return new ActivityMutator(j, this.injectMetric);
        }

        public final void drawField(BadgeNormalizer badgeNormalizer) {
            this.injectMetric = badgeNormalizer;
        }

        @Override // com.goldenboot.saga.zone.ScopedFormer
        public void injectMetric(ScopedFormer scopedFormer) {
            Object obj;
            Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            ActivityMutator activityMutator = (ActivityMutator) scopedFormer;
            obj = AlarmGuard.evictLayout;
            synchronized (obj) {
                this.injectMetric = activityMutator.injectMetric;
                this.detachStream = activityMutator.detachStream;
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
        }

        public final int popBlueprint() {
            return this.detachStream;
        }
    }

    public LayoutRegulator() {
        BadgeNormalizer evictLayout = PopupOperation.evictLayout();
        ItemGovernor dispatchTimezone = WaveBenchmark.dispatchTimezone();
        ActivityMutator activityMutator = new ActivityMutator(dispatchTimezone.applyTask(), evictLayout);
        if (!(dispatchTimezone instanceof SaveFilter)) {
            activityMutator.flushSample(new ActivityMutator(KeyboardGate.injectMetric(1), evictLayout));
        }
        this.reduceScope = activityMutator;
        this.notifyMessage = new PaletteNotifier(this);
        this.connectPatch = new WindowEncoder(this);
        this.attachConfig = new KeyboardScheduler(this);
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public void applyTask(ScopedFormer scopedFormer) {
        Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.reduceScope = (ActivityMutator) scopedFormer;
    }

    @Override // java.util.Map
    public void clear() {
        ItemGovernor injectMetric;
        ScopedFormer releaseHeader = releaseHeader();
        Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        ActivityMutator activityMutator = (ActivityMutator) WaveBenchmark.unlockMessage((ActivityMutator) releaseHeader);
        activityMutator.applyTask();
        BadgeNormalizer evictLayout = PopupOperation.evictLayout();
        if (evictLayout != activityMutator.applyTask()) {
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            ActivityMutator activityMutator2 = (ActivityMutator) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                clipOrigin((ActivityMutator) WaveBenchmark.growCallback(activityMutator2, this, injectMetric), evictLayout);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        }
    }

    public final int clipOrigin(ActivityMutator activityMutator, BadgeNormalizer badgeNormalizer) {
        Object obj;
        int popBlueprint;
        obj = AlarmGuard.evictLayout;
        synchronized (obj) {
            activityMutator.drawField(badgeNormalizer);
            popBlueprint = activityMutator.popBlueprint();
            activityMutator.connectJob(popBlueprint + 1);
        }
        return popBlueprint;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return resetDelta().applyTask().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return resetDelta().applyTask().containsValue(obj);
    }

    public final boolean decodePath(Object obj) {
        Object obj2;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.areEqual(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    public final boolean detachStream(ActivityMutator activityMutator, int i, BadgeNormalizer badgeNormalizer) {
        Object obj;
        boolean z;
        obj = AlarmGuard.evictLayout;
        synchronized (obj) {
            if (activityMutator.popBlueprint() == i) {
                activityMutator.drawField(badgeNormalizer);
                z = true;
                activityMutator.connectJob(activityMutator.popBlueprint() + 1);
            } else {
                z = false;
            }
        }
        return z;
    }

    public int drawRequest() {
        return resetDelta().applyTask().size();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return popBlueprint();
    }

    public Collection gatherAdapter() {
        return this.attachConfig;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return resetDelta().applyTask().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return resetDelta().applyTask().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return serializeOffset();
    }

    public final int notifyMessage() {
        return resetDelta().popBlueprint();
    }

    public Set popBlueprint() {
        return this.notifyMessage;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        Object obj3;
        BadgeNormalizer applyTask;
        int popBlueprint;
        Object put;
        ItemGovernor injectMetric;
        boolean detachStream;
        do {
            obj3 = AlarmGuard.evictLayout;
            synchronized (obj3) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                ActivityMutator activityMutator = (ActivityMutator) WaveBenchmark.unlockMessage((ActivityMutator) releaseHeader);
                applyTask = activityMutator.applyTask();
                popBlueprint = activityMutator.popBlueprint();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            BadgeNormalizer.ActivityMutator builder = applyTask.builder();
            put = builder.put(obj, obj2);
            BadgeNormalizer build = builder.build();
            if (Intrinsics.areEqual(build, applyTask)) {
                break;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            ActivityMutator activityMutator2 = (ActivityMutator) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                detachStream = detachStream((ActivityMutator) WaveBenchmark.growCallback(activityMutator2, this, injectMetric), popBlueprint, build);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!detachStream);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        Object obj;
        BadgeNormalizer applyTask;
        int popBlueprint;
        ItemGovernor injectMetric;
        boolean detachStream;
        do {
            obj = AlarmGuard.evictLayout;
            synchronized (obj) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                ActivityMutator activityMutator = (ActivityMutator) WaveBenchmark.unlockMessage((ActivityMutator) releaseHeader);
                applyTask = activityMutator.applyTask();
                popBlueprint = activityMutator.popBlueprint();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            BadgeNormalizer.ActivityMutator builder = applyTask.builder();
            builder.putAll(map);
            BadgeNormalizer build = builder.build();
            if (Intrinsics.areEqual(build, applyTask)) {
                return;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            ActivityMutator activityMutator2 = (ActivityMutator) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                detachStream = detachStream((ActivityMutator) WaveBenchmark.growCallback(activityMutator2, this, injectMetric), popBlueprint, build);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!detachStream);
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public ScopedFormer releaseHeader() {
        return this.reduceScope;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        Object obj2;
        BadgeNormalizer applyTask;
        int popBlueprint;
        Object remove;
        ItemGovernor injectMetric;
        boolean detachStream;
        do {
            obj2 = AlarmGuard.evictLayout;
            synchronized (obj2) {
                ScopedFormer releaseHeader = releaseHeader();
                Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                ActivityMutator activityMutator = (ActivityMutator) WaveBenchmark.unlockMessage((ActivityMutator) releaseHeader);
                applyTask = activityMutator.applyTask();
                popBlueprint = activityMutator.popBlueprint();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            Intrinsics.checkNotNull(applyTask);
            BadgeNormalizer.ActivityMutator builder = applyTask.builder();
            remove = builder.remove(obj);
            BadgeNormalizer build = builder.build();
            if (Intrinsics.areEqual(build, applyTask)) {
                break;
            }
            ScopedFormer releaseHeader2 = releaseHeader();
            Intrinsics.checkNotNull(releaseHeader2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            ActivityMutator activityMutator2 = (ActivityMutator) releaseHeader2;
            synchronized (WaveBenchmark.mapJob()) {
                injectMetric = ItemGovernor.releaseHeader.injectMetric();
                detachStream = detachStream((ActivityMutator) WaveBenchmark.growCallback(activityMutator2, this, injectMetric), popBlueprint, build);
            }
            WaveBenchmark.cancelArchive(injectMetric, this);
        } while (!detachStream);
        return remove;
    }

    public final ActivityMutator resetDelta() {
        ScopedFormer releaseHeader = releaseHeader();
        Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (ActivityMutator) WaveBenchmark.locateSignal((ActivityMutator) releaseHeader, this);
    }

    public Set serializeOffset() {
        return this.connectPatch;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return drawRequest();
    }

    public String toString() {
        ScopedFormer releaseHeader = releaseHeader();
        Intrinsics.checkNotNull(releaseHeader, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((ActivityMutator) WaveBenchmark.unlockMessage((ActivityMutator) releaseHeader)).applyTask() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return gatherAdapter();
    }
}
