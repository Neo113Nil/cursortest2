package com.startapp.sdk.internal;

import android.hardware.SensorEvent;
import com.startapp.motiondetector.TravelRecognizer;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class nc extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f4102a;

    /* renamed from: b, reason: collision with root package name */
    public final TravelRecognizer f4103b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f4104c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f4105d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f4106e;

    public nc(String str, MotionMetadata motionMetadata, int i3, double d3, long j3) {
        super(str);
        this.f4104c = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f4105d = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f4106e = new AtomicLong(0L);
        TravelRecognizer travelRecognizer = new TravelRecognizer(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f4103b = travelRecognizer;
        travelRecognizer.setTravelProbabilityMaximum(d3, j3);
        this.f4102a = new LinkedBlockingDeque(i3);
    }

    public final boolean a(SensorEvent sensorEvent) {
        return this.f4102a.offer(sensorEvent);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                SensorEvent sensorEvent = (SensorEvent) this.f4102a.take();
                if (sensorEvent == null) {
                    return;
                }
                TravelRecognizer travelRecognizer = this.f4103b;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                travelRecognizer.add(currentTimeMillis, j3, fArr[0], fArr[1], fArr[2]);
                this.f4104c.set(Double.doubleToRawLongBits(this.f4103b.getTravelProbability()));
                this.f4105d.set(Double.doubleToRawLongBits(this.f4103b.getTravelProbabilityMaximumValue()));
                this.f4106e.set(this.f4103b.getTravelProbabilityMaximumTime());
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                d9.a(th);
                return;
            }
        }
    }
}
