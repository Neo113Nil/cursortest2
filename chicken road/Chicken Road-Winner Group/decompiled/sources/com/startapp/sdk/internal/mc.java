package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import com.startapp.motiondetector.AmortizedMaximum;
import com.startapp.motiondetector.Utils;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class mc {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f4049i = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Context f4050a;

    /* renamed from: b, reason: collision with root package name */
    public final sf f4051b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f4052c;

    /* renamed from: d, reason: collision with root package name */
    public nc f4053d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4054e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public Sensor f4055g;

    /* renamed from: h, reason: collision with root package name */
    public final kc f4056h = new kc(this);

    public mc(Context context, sf sfVar, p4 p4Var, Handler handler) {
        this.f4050a = context;
        this.f4051b = sfVar;
        this.f4052c = handler;
    }

    public final boolean a(int i3) {
        if (this.f4054e) {
            MotionMetadata J2 = MetaData.E().J();
            if (J2 == null || !J2.u()) {
                J2 = null;
            }
            if (J2 != null && (i3 & J2.j()) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (this.f4053d != null) {
            rf edit = this.f4051b.edit();
            float longBitsToDouble = (float) Double.longBitsToDouble(this.f4053d.f4105d.get());
            edit.a("e9142de3c7cc5952", Float.valueOf(longBitsToDouble));
            edit.f4299a.putFloat("e9142de3c7cc5952", longBitsToDouble);
            long j3 = this.f4053d.f4106e.get();
            edit.a("7783513af1730383", Long.valueOf(j3));
            edit.f4299a.putLong("7783513af1730383", j3);
            edit.apply();
            if (a(4)) {
                d9 d9Var = new d9(e9.f3617d);
                d9Var.f3574d = "MP.save";
                d9Var.f3575e = String.format(Locale.ENGLISH, "%.6f", Double.valueOf(a()));
                d9Var.a();
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        MotionMetadata J2 = MetaData.E().J();
        MotionMetadata motionMetadata = (J2 == null || !J2.u()) ? null : J2;
        if (motionMetadata == null || (sensorManager = (SensorManager) this.f4050a.getSystemService("sensor")) == null || this.f4055g != null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        int min = Math.min(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, (int) (si.f(motionMetadata.r()) * 1000)), 100000);
        if (defaultSensor == null || !sensorManager.registerListener(this.f4056h, defaultSensor, min)) {
            return;
        }
        this.f4055g = defaultSensor;
        double d3 = this.f4051b.getFloat("e9142de3c7cc5952", 0.0f);
        long j3 = this.f4051b.getLong("7783513af1730383", 0L);
        nc ncVar = this.f4053d;
        if (ncVar != null) {
            ncVar.interrupt();
            this.f4053d = null;
        }
        if (this.f4053d == null) {
            nc ncVar2 = new nc("startapp-mp-" + f4049i.incrementAndGet(), motionMetadata, motionMetadata.q(), d3, j3);
            this.f4053d = ncVar2;
            ncVar2.start();
        }
        if (a(1)) {
            d9 d9Var = new d9(e9.f3617d);
            d9Var.f3574d = "MP.start";
            d9Var.f3575e = defaultSensor.getName() + StringUtils.COMMA + defaultSensor.getMinDelay() + StringUtils.COMMA + defaultSensor.getPower();
            d9Var.a();
        }
    }

    public final void d() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f4050a.getSystemService("sensor");
        if (sensorManager == null || (sensor = this.f4055g) == null) {
            return;
        }
        sensorManager.unregisterListener(this.f4056h, sensor);
        this.f4055g = null;
        b();
        nc ncVar = this.f4053d;
        if (ncVar != null) {
            ncVar.interrupt();
            this.f4053d = null;
        }
        if (a(2)) {
            d9 d9Var = new d9(e9.f3617d);
            d9Var.f3574d = "MP.stop";
            d9Var.a();
        }
    }

    public final double a() {
        MotionMetadata J2 = MetaData.E().J();
        if (J2 == null || !J2.u()) {
            J2 = null;
        }
        if (J2 == null) {
            return -1.0d;
        }
        nc ncVar = this.f4053d;
        if (ncVar != null) {
            return Double.longBitsToDouble(ncVar.f4104c.get());
        }
        return this.f4051b.getFloat("e9142de3c7cc5952", 0.0f) * AmortizedMaximum.calcImpact(System.currentTimeMillis(), this.f4051b.getLong("7783513af1730383", 0L), J2.b(), J2.a(), J2.c(), Utils.logisticalFunction(0.0d, J2.a(), J2.c()));
    }
}
