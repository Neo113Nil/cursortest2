package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class Ml extends Kt {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f10710a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f10711b;

    /* renamed from: c, reason: collision with root package name */
    public float f10712c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public Float f10713d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public long f10714e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10715g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10716h;
    public Ul i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10717j;

    public Ml(Context context) {
        P2.o.f4767B.f4776j.getClass();
        this.f10714e = System.currentTimeMillis();
        this.f = 0;
        this.f10715g = false;
        this.f10716h = false;
        this.i = null;
        this.f10717j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f10710a = sensorManager;
        if (sensorManager != null) {
            this.f10711b = sensorManager.getDefaultSensor(4);
        } else {
            this.f10711b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Kt
    public final void a(SensorEvent sensorEvent) {
        A7 a7 = F7.I8;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            P2.o.f4767B.f4776j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j5 = this.f10714e;
            A7 a72 = F7.K8;
            D7 d7 = rVar.f5056c;
            if (j5 + ((Integer) d7.a(a72)).intValue() < currentTimeMillis) {
                this.f = 0;
                this.f10714e = currentTimeMillis;
                this.f10715g = false;
                this.f10716h = false;
                this.f10712c = this.f10713d.floatValue();
            }
            float floatValue = this.f10713d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f10713d = Float.valueOf(floatValue);
            float f = this.f10712c;
            A7 a73 = F7.J8;
            if (floatValue > ((Float) d7.a(a73)).floatValue() + f) {
                this.f10712c = this.f10713d.floatValue();
                this.f10716h = true;
            } else if (this.f10713d.floatValue() < this.f10712c - ((Float) d7.a(a73)).floatValue()) {
                this.f10712c = this.f10713d.floatValue();
                this.f10715g = true;
            }
            if (this.f10713d.isInfinite()) {
                this.f10713d = Float.valueOf(0.0f);
                this.f10712c = 0.0f;
            }
            if (this.f10715g && this.f10716h) {
                T2.G.m("Flick detected.");
                this.f10714e = currentTimeMillis;
                int i = this.f + 1;
                this.f = i;
                this.f10715g = false;
                this.f10716h = false;
                Ul ul = this.i;
                if (ul == null || i != ((Integer) d7.a(F7.L8)).intValue()) {
                    return;
                }
                ul.d(new Sl(1), Tl.f11671m);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f10717j && (sensorManager = this.f10710a) != null && (sensor = this.f10711b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f10717j = false;
                    T2.G.m("Stopped listening for flick gestures.");
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
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.I8)).booleanValue()) {
                    if (!this.f10717j && (sensorManager = this.f10710a) != null && (sensor = this.f10711b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f10717j = true;
                        T2.G.m("Listening for flick gestures.");
                    }
                    if (this.f10710a == null || this.f10711b == null) {
                        U2.j.i("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
