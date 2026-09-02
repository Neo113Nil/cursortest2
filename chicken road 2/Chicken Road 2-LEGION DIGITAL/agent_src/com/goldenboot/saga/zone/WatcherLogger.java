package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class WatcherLogger extends ProgressIndex implements SystemSwitch {
    public static final ActivityMutator resetDelta = new ActivityMutator(null);
    public static final WatcherLogger inflateAdapter = new WatcherLogger(1, 0);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WatcherLogger evictLayout() {
            return WatcherLogger.inflateAdapter;
        }

        public ActivityMutator() {
        }
    }

    public WatcherLogger(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // com.goldenboot.saga.zone.ProgressIndex
    public boolean equals(Object obj) {
        if (!(obj instanceof WatcherLogger)) {
            return false;
        }
        if (isEmpty() && ((WatcherLogger) obj).isEmpty()) {
            return true;
        }
        WatcherLogger watcherLogger = (WatcherLogger) obj;
        return applyTask() == watcherLogger.applyTask() && serializeOffset() == watcherLogger.serializeOffset();
    }

    public Integer expandArgs() {
        return Integer.valueOf(serializeOffset());
    }

    public Integer findTask() {
        return Integer.valueOf(applyTask());
    }

    @Override // com.goldenboot.saga.zone.ProgressIndex
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (applyTask() * 31) + serializeOffset();
    }

    @Override // com.goldenboot.saga.zone.ProgressIndex
    public boolean isEmpty() {
        return applyTask() > serializeOffset();
    }

    @Override // com.goldenboot.saga.zone.ProgressIndex
    public String toString() {
        return applyTask() + ".." + serializeOffset();
    }
}
