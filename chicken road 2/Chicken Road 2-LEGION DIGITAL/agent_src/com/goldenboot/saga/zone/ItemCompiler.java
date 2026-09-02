package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ItemCompiler extends ModuleAllocator {
    public float evictLayout;
    public float growPayload;
    public final int injectMetric;

    public ItemCompiler(float f, float f2) {
        super(null);
        this.evictLayout = f;
        this.growPayload = f2;
        this.injectMetric = 2;
    }

    public final float clipOrigin() {
        return this.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    public void detachStream() {
        this.evictLayout = 0.0f;
        this.growPayload = 0.0f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ItemCompiler)) {
            return false;
        }
        ItemCompiler itemCompiler = (ItemCompiler) obj;
        return itemCompiler.evictLayout == this.evictLayout && itemCompiler.growPayload == this.growPayload;
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    public float evictLayout(int i) {
        if (i == 0) {
            return this.evictLayout;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.growPayload;
    }

    public final float flushSample() {
        return this.growPayload;
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    public int growPayload() {
        return this.injectMetric;
    }

    public int hashCode() {
        return (Float.hashCode(this.evictLayout) * 31) + Float.hashCode(this.growPayload);
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    public void releaseHeader(int i, float f) {
        if (i == 0) {
            this.evictLayout = f;
        } else {
            if (i != 1) {
                return;
            }
            this.growPayload = f;
        }
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.evictLayout + ", v2 = " + this.growPayload;
    }

    @Override // com.goldenboot.saga.zone.ModuleAllocator
    /* renamed from: updateTimer, reason: merged with bridge method [inline-methods] */
    public ItemCompiler injectMetric() {
        return new ItemCompiler(0.0f, 0.0f);
    }
}
