package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class cg implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg f3555a;

    public cg(eg egVar) {
        this.f3555a = egVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        JSONArray jSONArray;
        int a3 = this.f3555a.f3647b.a(sensorEvent);
        eg egVar = this.f3555a;
        if (a3 == egVar.f3650e) {
            egVar.b();
            eg egVar2 = this.f3555a;
            w1 w1Var = egVar2.f3649d;
            if (w1Var != null) {
                try {
                    jSONArray = egVar2.f3647b.a();
                } catch (Exception unused) {
                    jSONArray = null;
                }
                w1Var.a(jSONArray);
            }
        }
    }
}
