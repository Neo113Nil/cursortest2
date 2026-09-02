package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ContextSwitch {
    public static final int detachStream;
    public static final ContextSwitch evictLayout = new ContextSwitch();
    public static final float[] growPayload;
    public static final float[] injectMetric;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public final float evictLayout;
        public final float growPayload;

        public ActivityMutator(float f, float f2) {
            this.evictLayout = f;
            this.growPayload = f2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivityMutator)) {
                return false;
            }
            ActivityMutator activityMutator = (ActivityMutator) obj;
            return Float.compare(this.evictLayout, activityMutator.evictLayout) == 0 && Float.compare(this.growPayload, activityMutator.growPayload) == 0;
        }

        public final float evictLayout() {
            return this.evictLayout;
        }

        public final float growPayload() {
            return this.growPayload;
        }

        public int hashCode() {
            return (Float.hashCode(this.evictLayout) * 31) + Float.hashCode(this.growPayload);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.evictLayout + ", velocityCoefficient=" + this.growPayload + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        growPayload = fArr;
        float[] fArr2 = new float[101];
        injectMetric = fArr2;
        TabRegistry.growPayload(fArr, fArr2, 100);
        detachStream = 8;
    }

    public final double evictLayout(float f, float f2) {
        return Math.log((Math.abs(f) * 0.35f) / f2);
    }

    public final ActivityMutator growPayload(float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float connectJob = CellEntry.connectJob(f, 0.0f, 1.0f);
        float f4 = 100;
        int i = (int) (f4 * connectJob);
        if (i < 100) {
            float f5 = i / f4;
            int i2 = i + 1;
            float f6 = i2 / f4;
            float[] fArr = growPayload;
            float f7 = fArr[i];
            float f8 = (fArr[i2] - f7) / (f6 - f5);
            f3 = f7 + ((connectJob - f5) * f8);
            f2 = f8;
        }
        return new ActivityMutator(f3, f2);
    }
}
