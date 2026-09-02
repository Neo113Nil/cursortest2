package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class StreamConstructor implements BreadcrumbDispatcher {
    public final float notifyMessage;
    public final float reduceScope;

    public StreamConstructor(float f, float f2) {
        this.reduceScope = f;
        this.notifyMessage = f2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StreamConstructor)) {
            return false;
        }
        if (injectMetric() && ((StreamConstructor) obj).injectMetric()) {
            return true;
        }
        StreamConstructor streamConstructor = (StreamConstructor) obj;
        return this.reduceScope == streamConstructor.reduceScope && this.notifyMessage == streamConstructor.notifyMessage;
    }

    @Override // com.goldenboot.saga.zone.SystemSwitch
    /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
    public Float releaseHeader() {
        return Float.valueOf(this.notifyMessage);
    }

    @Override // com.goldenboot.saga.zone.SystemSwitch
    /* renamed from: growPayload, reason: merged with bridge method [inline-methods] */
    public Float clipOrigin() {
        return Float.valueOf(this.reduceScope);
    }

    public int hashCode() {
        if (injectMetric()) {
            return -1;
        }
        return (Float.hashCode(this.reduceScope) * 31) + Float.hashCode(this.notifyMessage);
    }

    public boolean injectMetric() {
        return this.reduceScope > this.notifyMessage;
    }

    public String toString() {
        return this.reduceScope + ".." + this.notifyMessage;
    }
}
