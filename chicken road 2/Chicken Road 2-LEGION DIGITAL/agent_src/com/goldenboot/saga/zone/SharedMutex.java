package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SharedMutex {
    public final EmitterSwitch evictLayout;
    public final Integer growPayload;

    public SharedMutex(EmitterSwitch emitterSwitch, Integer num) {
        this.evictLayout = emitterSwitch;
        this.growPayload = num;
    }

    public static /* synthetic */ SharedMutex growPayload(SharedMutex sharedMutex, EmitterSwitch emitterSwitch, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            emitterSwitch = sharedMutex.evictLayout;
        }
        if ((i & 2) != 0) {
            num = sharedMutex.growPayload;
        }
        return sharedMutex.evictLayout(emitterSwitch, num);
    }

    public final EmitterSwitch detachStream() {
        return this.evictLayout;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedMutex)) {
            return false;
        }
        SharedMutex sharedMutex = (SharedMutex) obj;
        return Intrinsics.areEqual(this.evictLayout, sharedMutex.evictLayout) && Intrinsics.areEqual(this.growPayload, sharedMutex.growPayload);
    }

    public final SharedMutex evictLayout(EmitterSwitch emitterSwitch, Integer num) {
        return new SharedMutex(emitterSwitch, num);
    }

    public int hashCode() {
        int hashCode = this.evictLayout.hashCode() * 31;
        Integer num = this.growPayload;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final Integer injectMetric() {
        return this.growPayload;
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.evictLayout + ", groupOffset=" + this.growPayload + ')';
    }
}
