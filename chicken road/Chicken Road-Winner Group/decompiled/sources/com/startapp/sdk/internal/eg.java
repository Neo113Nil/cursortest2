package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3646a;

    /* renamed from: c, reason: collision with root package name */
    public final SensorManager f3648c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f3649d;
    public final cg f = new cg(this);

    /* renamed from: b, reason: collision with root package name */
    public final bg f3647b = new bg();

    /* renamed from: e, reason: collision with root package name */
    public int f3650e = 0;

    public eg(Context context, w1 w1Var) {
        this.f3646a = null;
        this.f3648c = (SensorManager) context.getSystemService("sensor");
        this.f3649d = w1Var;
        this.f3646a = new HashMap();
        SensorsConfig T2 = MetaData.E().T();
        a(13, T2.a());
        a(9, T2.b());
        a(5, T2.d());
        a(10, T2.e());
        a(2, T2.f());
        a(6, T2.g());
        a(12, T2.i());
        a(11, T2.j());
        a(16, T2.c());
    }

    public final void a() {
        Sensor defaultSensor;
        for (Integer num : this.f3646a.keySet()) {
            int intValue = num.intValue();
            dg dgVar = (dg) this.f3646a.get(num);
            if (Build.VERSION.SDK_INT >= dgVar.f3594a && (defaultSensor = this.f3648c.getDefaultSensor(intValue)) != null) {
                this.f3648c.registerListener(this.f, defaultSensor, dgVar.f3595b);
                this.f3650e++;
            }
        }
    }

    public final void b() {
        this.f3648c.unregisterListener(this.f);
    }

    public final void a(int i3, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f3646a.put(Integer.valueOf(i3), new dg(baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
