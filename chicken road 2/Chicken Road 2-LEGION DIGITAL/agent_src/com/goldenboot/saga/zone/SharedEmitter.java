package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SharedEmitter {
    public static final SharedEmitter drawField = drawField(PanelDelta.injectMetric, (float) ((PanelDelta.updateTimer(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    public final float applyTask;
    public final float clipOrigin;
    public final float detachStream;
    public final float evictLayout;
    public final float[] flushSample;
    public final float growPayload;
    public final float injectMetric;
    public final float popBlueprint;
    public final float releaseHeader;
    public final float updateTimer;

    public SharedEmitter(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.clipOrigin = f;
        this.evictLayout = f2;
        this.growPayload = f3;
        this.injectMetric = f4;
        this.detachStream = f5;
        this.releaseHeader = f6;
        this.flushSample = fArr;
        this.updateTimer = f7;
        this.applyTask = f8;
        this.popBlueprint = f9;
    }

    public static SharedEmitter drawField(float[] fArr, float f, float f2, float f3, boolean z) {
        float[][] fArr2 = PanelDelta.evictLayout;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f4;
        float f6 = fArr[1];
        float f7 = f5 + (fArr3[1] * f6);
        float f8 = fArr[2];
        float f9 = f7 + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[0] * f4) + (fArr4[1] * f6) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f4 * fArr5[0]) + (f6 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (f3 / 10.0f) + 0.8f;
        float detachStream = ((double) f12) >= 0.9d ? PanelDelta.detachStream(0.59f, 0.69f, (f12 - 0.9f) * 10.0f) : PanelDelta.detachStream(0.525f, 0.59f, (f12 - 0.8f) * 10.0f);
        float exp = z ? 1.0f : (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f12;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp};
        float f13 = 1.0f / ((5.0f * f) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (f14 * f) + (0.1f * f15 * f15 * ((float) Math.cbrt(f * 5.0d)));
        float updateTimer = PanelDelta.updateTimer(f2) / fArr[1];
        double d2 = updateTimer;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr7[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[2];
        float[] fArr8 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        return new SharedEmitter(updateTimer, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, detachStream, f12, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float[] applyTask() {
        return this.flushSample;
    }

    public float clipOrigin() {
        return this.growPayload;
    }

    public float detachStream() {
        return this.applyTask;
    }

    public float evictLayout() {
        return this.evictLayout;
    }

    public float flushSample() {
        return this.releaseHeader;
    }

    public float growPayload() {
        return this.detachStream;
    }

    public float injectMetric() {
        return this.updateTimer;
    }

    public float popBlueprint() {
        return this.popBlueprint;
    }

    public float releaseHeader() {
        return this.clipOrigin;
    }

    public float updateTimer() {
        return this.injectMetric;
    }
}
