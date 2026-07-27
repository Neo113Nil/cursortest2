package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class HighPassFilter3D implements SignalProcessor, Valuable {
    private double magnitude;

    /* renamed from: x, reason: collision with root package name */
    private final HighPassFilter f2875x;
    private final HighPassFilter y;

    /* renamed from: z, reason: collision with root package name */
    private final HighPassFilter f2876z;

    public HighPassFilter3D(HighPassFilter highPassFilter, HighPassFilter highPassFilter2, HighPassFilter highPassFilter3) {
        this.f2875x = highPassFilter;
        this.y = highPassFilter2;
        this.f2876z = highPassFilter3;
    }

    public void add(double d3, double d4, double d5) {
        this.f2875x.add(d3);
        this.y.add(d4);
        this.f2876z.add(d5);
        this.magnitude = Math.sqrt((this.f2876z.getValue() * this.f2876z.getValue()) + (this.y.getValue() * this.y.getValue()) + (this.f2875x.getValue() * this.f2875x.getValue()));
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.magnitude;
    }

    public HighPassFilter getX() {
        return this.f2875x;
    }

    public HighPassFilter getY() {
        return this.y;
    }

    public HighPassFilter getZ() {
        return this.f2876z;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f2875x.reset();
        this.y.reset();
        this.f2876z.reset();
        this.magnitude = 0.0d;
    }
}
