package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IlIllIlIIl implements android.hardware.SensorEventListener {
    public final android.hardware.SensorManager IllIIIIllI;
    public final android.os.Handler lIIIIIllll;
    public int lIlIIIIlIl;
    public final android.hardware.Sensor llIIIlllll;
    public final com.microblink.blinkid.secured.llllllIllI llIIlIlIIl;
    public com.microblink.blinkid.hardware.accelerometer.ShakeCallback IlIllIlIIl = null;
    public final java.util.concurrent.atomic.AtomicBoolean IllIIIllII = new java.util.concurrent.atomic.AtomicBoolean(true);
    public long llIIlIIlll = -1;
    public java.util.Timer IIlIIIllIl = null;

    public IlIllIlIIl(android.content.Context context, com.microblink.blinkid.secured.llllllIllI llllllilli) {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.IllIIIIllI = sensorManager;
        this.llIIlIlIIl = llllllilli;
        this.llIIIlllll = sensorManager.getDefaultSensor(1);
        this.lIlIIIIlIl = java.lang.Math.round(83.333336f) * 1000;
        this.lIIIIIllll = new android.os.Handler();
    }

    public final void llIIlIlIIl() {
        com.microblink.blinkid.util.Log.v(this, "Registering accelerometer sensor listener {}", this);
        boolean registerListener = this.IllIIIIllI.registerListener(this, this.llIIIlllll, this.lIlIIIIlIl);
        this.IllIIIllII.set(true);
        this.IlIllIlIIl.onShakingStarted();
        if (registerListener) {
            java.util.Timer timer = new java.util.Timer("Accelerometer timer");
            this.IIlIIIllIl = timer;
            timer.schedule(new com.microblink.blinkid.secured.llIIlIlIIl(this), 0L, this.lIlIIIIlIl);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(android.hardware.Sensor sensor, int i) {
        com.microblink.blinkid.util.Log.i(this, "Accelerometer accuracy has changed", new java.lang.Object[0]);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        llIIlIlIIl(sensorEvent.values);
    }

    public final void llIIlIlIIl(float[] fArr) {
        if (this.llIIlIIlll >= 0) {
            if (java.lang.System.currentTimeMillis() - this.llIIlIIlll > 0) {
                int i = (int) ((r4 * 1000 * 0.33999997f) + (this.lIlIIIIlIl * 0.66f));
                this.lIlIIIIlIl = i;
                float f = (i / 1000.0f) / 1000.0f;
                this.llIIlIlIIl.llIIlIIlll = f / ((f * 1.0f) + f);
            }
        }
        com.microblink.blinkid.secured.llllllIllI llllllilli = this.llIIlIlIIl;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = llllllilli.llIIlIIlll;
        float f6 = 1.0f - f5;
        float f7 = (llllllilli.llIIIlllll * f6) + (f2 * f5);
        llllllilli.llIIIlllll = f7;
        float f8 = (llllllilli.IllIIIIllI * f6) + (f3 * f5);
        llllllilli.IllIIIIllI = f8;
        float f9 = (f6 * llllllilli.lIlIIIIlIl) + (f5 * f4);
        llllllilli.lIlIIIIlIl = f9;
        llllllilli.llIIlIlIIl = f2 - f7;
        llllllilli.IlIllIlIIl = f3 - f8;
        llllllilli.IllIIIllII = f4 - f9;
        if (!this.IllIIIllII.get()) {
            com.microblink.blinkid.secured.llllllIllI llllllilli2 = this.llIIlIlIIl;
            float f10 = llllllilli2.llIIlIlIIl;
            float f11 = llllllilli2.IlIllIlIIl;
            float f12 = llllllilli2.IllIIIllII;
            if (((float) java.lang.Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))) > 0.47f) {
                this.IllIIIllII.set(true);
                this.IlIllIlIIl.onShakingStarted();
                this.llIIlIIlll = java.lang.System.currentTimeMillis();
            }
        }
        if (this.IllIIIllII.get()) {
            com.microblink.blinkid.secured.llllllIllI llllllilli3 = this.llIIlIlIIl;
            float f13 = llllllilli3.llIIlIlIIl;
            float f14 = llllllilli3.IlIllIlIIl;
            float f15 = llllllilli3.IllIIIllII;
            if (((float) java.lang.Math.sqrt((f15 * f15) + (f14 * f14) + (f13 * f13))) < 0.2f) {
                this.IllIIIllII.set(false);
                this.IlIllIlIIl.onShakingStopped();
            }
        }
        this.llIIlIIlll = java.lang.System.currentTimeMillis();
    }
}
