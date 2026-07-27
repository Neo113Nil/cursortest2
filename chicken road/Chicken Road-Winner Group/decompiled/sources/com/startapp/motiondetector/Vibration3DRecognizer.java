package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class Vibration3DRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double frequency;

    /* renamed from: x, reason: collision with root package name */
    private final VibrationRecognizer f2877x;
    private final VibrationRecognizer y;

    /* renamed from: z, reason: collision with root package name */
    private final VibrationRecognizer f2878z;

    public Vibration3DRecognizer(VibrationRecognizer vibrationRecognizer, VibrationRecognizer vibrationRecognizer2, VibrationRecognizer vibrationRecognizer3) {
        this.f2877x = vibrationRecognizer;
        this.y = vibrationRecognizer2;
        this.f2878z = vibrationRecognizer3;
    }

    public void add(long j3, double d3, double d4, double d5) {
        this.f2877x.add(j3, d3);
        this.y.add(j3, d4);
        this.f2878z.add(j3, d5);
        double amplitude = this.f2877x.getAmplitude();
        double amplitude2 = this.y.getAmplitude();
        double amplitude3 = this.f2878z.getAmplitude();
        double d6 = amplitude + amplitude2 + amplitude3;
        if (d6 <= 0.0d) {
            this.frequency = 0.0d;
            this.amplitude = 0.0d;
            return;
        }
        this.frequency = ((this.f2877x.getFrequency() * amplitude) / d6) + ((this.y.getFrequency() * amplitude2) / d6) + ((this.f2878z.getFrequency() * amplitude3) / d6);
        this.amplitude = d6 / 3.0d;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f2877x.reset();
        this.y.reset();
        this.f2878z.reset();
        this.frequency = 0.0d;
        this.amplitude = 0.0d;
    }
}
