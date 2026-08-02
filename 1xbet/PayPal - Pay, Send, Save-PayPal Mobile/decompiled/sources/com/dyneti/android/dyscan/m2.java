package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class m2 implements android.hardware.SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f3325a;
    public boolean b = false;
    public boolean c = false;
    public final float[] d = new float[3];
    public final float[] e = new float[3];
    public final float[] f = new float[9];
    public final float[] g = new float[3];
    public java.lang.Float h = null;
    public java.lang.Float i = null;
    public float j = 0.0f;
    public int k = 0;

    public m2(android.hardware.SensorManager sensorManager) {
        this.f3325a = sensorManager;
    }

    public final float[] a() {
        if (!this.b) {
            return null;
        }
        android.hardware.SensorManager.getRotationMatrix(this.f, null, this.d, this.e);
        android.hardware.SensorManager.getOrientation(this.f, this.g);
        return this.g;
    }

    public final void b() {
        android.hardware.Sensor defaultSensor = this.f3325a.getDefaultSensor(2);
        if (defaultSensor != null) {
            this.f3325a.registerListener(this, defaultSensor, 3);
        }
        android.hardware.Sensor defaultSensor2 = this.f3325a.getDefaultSensor(1);
        if (defaultSensor2 != null) {
            this.f3325a.registerListener(this, defaultSensor2, 3);
        }
    }

    public final void c() {
        this.f3325a.unregisterListener(this);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            float[] fArr2 = this.d;
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.b = true;
            return;
        }
        if (sensorEvent.sensor.getType() == 2) {
            float[] fArr3 = sensorEvent.values;
            float f = fArr3[0];
            float f2 = fArr3[1];
            float f3 = fArr3[2];
            float sqrt = (float) java.lang.Math.sqrt((f3 * f3) + (f2 * f2) + (f * f));
            java.lang.Float f4 = this.h;
            if (f4 == null || sqrt > f4.floatValue()) {
                this.h = java.lang.Float.valueOf(sqrt);
            }
            java.lang.Float f5 = this.i;
            if (f5 == null || sqrt < f5.floatValue()) {
                this.i = java.lang.Float.valueOf(sqrt);
            }
            this.j += sqrt;
            this.k++;
            float[] fArr4 = sensorEvent.values;
            float[] fArr5 = this.e;
            java.lang.System.arraycopy(fArr4, 0, fArr5, 0, fArr5.length);
            this.c = true;
        }
    }
}
