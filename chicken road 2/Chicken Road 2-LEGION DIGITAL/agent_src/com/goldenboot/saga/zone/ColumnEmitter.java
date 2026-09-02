package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ColumnEmitter extends ModuleAllocator {
    public float evictLayout;
    public final int growPayload;

    public ColumnEmitter(float f) {
        super(null);
        this.evictLayout = f;
        this.growPayload = 1;
    }

    public final float clipOrigin() {
        return this.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    public void detachStream() {
        this.evictLayout = 0.0f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ColumnEmitter) && ((ColumnEmitter) obj).evictLayout == this.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    public float evictLayout(int i) {
        if (i == 0) {
            return this.evictLayout;
        }
        return 0.0f;
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    /* renamed from: flushSample, reason: merged with bridge method [inline-methods] */
    public ColumnEmitter injectMetric() {
        return new ColumnEmitter(0.0f);
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    public int growPayload() {
        return this.growPayload;
    }

    public int hashCode() {
        return Float.hashCode(this.evictLayout);
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    public void releaseHeader(int i, float f) {
        if (i == 0) {
            this.evictLayout = f;
        }
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.evictLayout;
    }
}
