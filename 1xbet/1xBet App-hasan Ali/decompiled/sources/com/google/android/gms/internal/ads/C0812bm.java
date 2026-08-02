package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* renamed from: com.google.android.gms.internal.ads.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0812bm extends Kt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12901a;

    /* renamed from: b, reason: collision with root package name */
    public SensorManager f12902b;

    /* renamed from: c, reason: collision with root package name */
    public Sensor f12903c;

    /* renamed from: d, reason: collision with root package name */
    public long f12904d;

    /* renamed from: e, reason: collision with root package name */
    public int f12905e;
    public Ul f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12906g;

    public C0812bm(Context context) {
        this.f12901a = context;
    }

    @Override // com.google.android.gms.internal.ads.Kt
    public final void a(SensorEvent sensorEvent) {
        A7 a7 = F7.D8;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f5 = fArr[1] / 9.80665f;
            float f6 = fArr[2] / 9.80665f;
            float f7 = f6 * f6;
            float sqrt = (float) Math.sqrt(f7 + (f5 * f5) + (f * f));
            A7 a72 = F7.E8;
            D7 d7 = rVar.f5056c;
            if (sqrt >= ((Float) d7.a(a72)).floatValue()) {
                P2.o.f4767B.f4776j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f12904d + ((Integer) d7.a(F7.F8)).intValue() <= currentTimeMillis) {
                    if (this.f12904d + ((Integer) d7.a(F7.G8)).intValue() < currentTimeMillis) {
                        this.f12905e = 0;
                    }
                    T2.G.m("Shake detected.");
                    this.f12904d = currentTimeMillis;
                    int i = this.f12905e + 1;
                    this.f12905e = i;
                    Ul ul = this.f;
                    if (ul == null || i != ((Integer) d7.a(F7.H8)).intValue()) {
                        return;
                    }
                    ul.d(new Sl(0), Tl.f11671m);
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.f12906g) {
                    SensorManager sensorManager = this.f12902b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f12903c);
                        T2.G.m("Stopped listening for shake gestures.");
                    }
                    this.f12906g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.D8)).booleanValue()) {
                    if (this.f12902b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f12901a.getSystemService("sensor");
                        this.f12902b = sensorManager2;
                        if (sensorManager2 == null) {
                            U2.j.i("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f12903c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f12906g && (sensorManager = this.f12902b) != null && (sensor = this.f12903c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        P2.o.f4767B.f4776j.getClass();
                        this.f12904d = System.currentTimeMillis() - ((Integer) r1.f5056c.a(F7.F8)).intValue();
                        this.f12906g = true;
                        T2.G.m("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
