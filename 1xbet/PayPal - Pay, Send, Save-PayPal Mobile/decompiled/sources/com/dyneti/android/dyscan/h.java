package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class h implements android.hardware.SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f3307a;
    public java.lang.Float b = null;
    public java.lang.Float c = null;
    public java.lang.Float d = null;
    public float e = 0.0f;
    public int f = 0;

    public h(android.hardware.SensorManager sensorManager) {
        this.f3307a = sensorManager;
    }

    public final void a() {
        android.hardware.Sensor defaultSensor = this.f3307a.getDefaultSensor(5);
        if (defaultSensor != null) {
            this.f3307a.registerListener(this, defaultSensor, 3);
        }
    }

    public final void b() {
        this.f3307a.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 5) {
            java.lang.Float valueOf = java.lang.Float.valueOf(sensorEvent.values[0]);
            this.b = valueOf;
            if (this.c == null || valueOf.floatValue() > this.c.floatValue()) {
                this.c = this.b;
            }
            if (this.d == null || this.b.floatValue() < this.d.floatValue()) {
                this.d = this.b;
            }
            this.e = this.b.floatValue() + this.e;
            this.f++;
        }
    }
}
