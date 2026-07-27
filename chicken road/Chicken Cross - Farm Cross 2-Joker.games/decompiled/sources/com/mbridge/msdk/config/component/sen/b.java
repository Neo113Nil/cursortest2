package com.mbridge.msdk.config.component.sen;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.mbridge.msdk.foundation.controller.c;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: NativeSensorEventPublisher.java */
/* loaded from: classes6.dex */
public class b {
    private final ArrayList<com.mbridge.msdk.config.component.sen.a> b = new ArrayList<>();
    private final SensorEventListener c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f9037a = (SensorManager) c.n().d().getSystemService("sensor");

    /* compiled from: NativeSensorEventPublisher.java */
    class a implements SensorEventListener {
        a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            String lowerCase = sensorEvent.sensor.getName().toLowerCase();
            float[] fArr = sensorEvent.values;
            HashMap hashMap = new HashMap();
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("type"), "accelerometer");
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("x"), String.valueOf(fArr[0]));
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("y"), String.valueOf(fArr[1]));
            hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("z"), String.valueOf(fArr[2]));
            float[] fArr2 = new float[3];
            float[] fArr3 = new float[3];
            float[] fArr4 = new float[3];
            float[] fArr5 = new float[9];
            float[] fArr6 = new float[9];
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr7 = sensorEvent.values;
                System.arraycopy(fArr7, 0, fArr2, 0, fArr7.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr8 = sensorEvent.values;
                System.arraycopy(fArr8, 0, fArr3, 0, fArr8.length);
            }
            if (lowerCase.contains("accelerometer")) {
                if (SensorManager.getRotationMatrix(fArr5, fArr6, fArr2, fArr3)) {
                    SensorManager.getOrientation(fArr5, fArr4);
                    Math.toDegrees(fArr4[0]);
                    float degrees = (float) Math.toDegrees(fArr4[1]);
                    float degrees2 = (float) Math.toDegrees(fArr4[2]);
                    float f = fArr[0];
                    float f2 = fArr[1];
                    float f3 = fArr[2];
                    double sqrt = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
                    hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("tileX"), String.valueOf(degrees));
                    hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("tileY"), String.valueOf(degrees2));
                    hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("magnitude"), String.valueOf(sqrt));
                }
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("type"), "accelerometer");
                b.this.a((HashMap<String, Object>) hashMap);
                return;
            }
            if (lowerCase.contains("magnetic")) {
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("type"), "magnetic");
                b.this.a((HashMap<String, Object>) hashMap);
            } else if (lowerCase.contains("gyroscope")) {
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("type"), "gyroscope");
                b.this.a((HashMap<String, Object>) hashMap);
            } else if (lowerCase.contains("rotation")) {
                float f4 = fArr[3];
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("type"), "rotation");
                hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("cos"), String.valueOf(f4));
                b.this.a((HashMap<String, Object>) hashMap);
            }
        }
    }

    public void b(com.mbridge.msdk.config.component.sen.a aVar) {
        if (aVar != null) {
            this.b.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.sen.a aVar) {
        if (this.b.contains(aVar)) {
            return;
        }
        this.b.add(aVar);
    }

    public void a() {
        SensorManager sensorManager = this.f9037a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.c);
        }
        this.b.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, Object> hashMap) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b("917002");
        bVar.a(hashMap);
        Iterator<com.mbridge.msdk.config.component.sen.a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b("917002");
        HashMap hashMap = new HashMap();
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("type"), str);
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE), a(str));
        hashMap.put(com.mbridge.msdk.config.component.common.util.c.c("reason"), str2);
        bVar.a(hashMap);
        Iterator<com.mbridge.msdk.config.component.sen.a> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private String a(String str) {
        if (str.contains("accelerometer")) {
            return "200001";
        }
        if (str.contains("magnetic")) {
            return "200002";
        }
        if (str.contains("gyroscope")) {
            return "200003";
        }
        if (str.contains("rotation")) {
            return "200004";
        }
        return "";
    }

    public void a(int i, String str, int i2) {
        try {
            Sensor defaultSensor = this.f9037a.getDefaultSensor(i);
            if (defaultSensor != null) {
                this.f9037a.registerListener(this.c, defaultSensor, i2);
            } else {
                a(str, str + " is not available");
            }
        } catch (Exception e) {
            a(str, e.getMessage());
        }
    }
}
