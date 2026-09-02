package com.goldenboot.saga.zone;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SequencePhase implements Serializable {
    public final Object connectPatch;
    public final Object notifyMessage;
    public final Object reduceScope;

    public SequencePhase(Object obj, Object obj2, Object obj3) {
        this.reduceScope = obj;
        this.notifyMessage = obj2;
        this.connectPatch = obj3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SequencePhase)) {
            return false;
        }
        SequencePhase sequencePhase = (SequencePhase) obj;
        return Intrinsics.areEqual(this.reduceScope, sequencePhase.reduceScope) && Intrinsics.areEqual(this.notifyMessage, sequencePhase.notifyMessage) && Intrinsics.areEqual(this.connectPatch, sequencePhase.connectPatch);
    }

    public final Object evictLayout() {
        return this.reduceScope;
    }

    public final Object growPayload() {
        return this.notifyMessage;
    }

    public int hashCode() {
        Object obj = this.reduceScope;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.notifyMessage;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.connectPatch;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final Object injectMetric() {
        return this.connectPatch;
    }

    public String toString() {
        return '(' + this.reduceScope + ", " + this.notifyMessage + ", " + this.connectPatch + ')';
    }
}
