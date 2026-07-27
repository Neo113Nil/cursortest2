package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class HighPassFilter implements SignalProcessor, Valuable {
    private final double newPart;
    private final double oldPart;
    private double result;

    public HighPassFilter(double d3) {
        double d4 = d3 + 1.0d;
        this.oldPart = d3 / d4;
        this.newPart = 1.0d / d4;
    }

    public void add(double d3) {
        this.result = (d3 * this.newPart) + (this.oldPart * this.result);
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.result;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.result = 0.0d;
    }
}
