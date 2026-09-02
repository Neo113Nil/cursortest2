package com.goldenboot.saga.zone;

import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PointerSet extends TransitionTimer {
    public WeakReference detachStream;
    public final String growPayload = "SaveableStateHolder_BackStackEntryKey";
    public final UUID injectMetric;

    public PointerSet(androidx.lifecycle.FeatureStreamer featureStreamer) {
        UUID uuid = (UUID) featureStreamer.evictLayout("SaveableStateHolder_BackStackEntryKey");
        if (uuid == null) {
            uuid = UUID.randomUUID();
            featureStreamer.injectMetric("SaveableStateHolder_BackStackEntryKey", uuid);
        }
        this.injectMetric = uuid;
    }

    public final WeakReference applyTask() {
        WeakReference weakReference = this.detachStream;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
        return null;
    }

    @Override // com.goldenboot.saga.zone.TransitionTimer
    public void flushSample() {
        super.flushSample();
        RestoreReader restoreReader = (RestoreReader) applyTask().get();
        if (restoreReader != null) {
            restoreReader.releaseHeader(this.injectMetric);
        }
        applyTask().clear();
    }

    public final void popBlueprint(WeakReference weakReference) {
        this.detachStream = weakReference;
    }

    public final UUID updateTimer() {
        return this.injectMetric;
    }
}
