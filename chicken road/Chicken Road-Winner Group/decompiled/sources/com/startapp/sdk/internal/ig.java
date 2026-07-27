package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Display;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ig {

    /* renamed from: b, reason: collision with root package name */
    public int f3873b;

    /* renamed from: d, reason: collision with root package name */
    public final long f3875d;

    /* renamed from: e, reason: collision with root package name */
    public c2 f3876e;
    public SensorManager f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f3877g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f3878h;

    /* renamed from: i, reason: collision with root package name */
    public Pair f3879i;

    /* renamed from: j, reason: collision with root package name */
    public final ib f3880j;

    /* renamed from: k, reason: collision with root package name */
    public final r4 f3881k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3882l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3883m;

    /* renamed from: a, reason: collision with root package name */
    public int f3872a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3874c = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final fg f3884n = new fg(this);

    /* renamed from: o, reason: collision with root package name */
    public final hg f3885o = new hg(this);

    public ig(ib ibVar, ib ibVar2, r4 r4Var, Context context) {
        this.f3880j = ibVar;
        this.f3881k = r4Var;
        this.f3877g = ibVar2;
        this.f3878h = context;
        this.f3879i = new Pair(Integer.valueOf(((sf) ibVar2.a()).getInt("last_collected_day", 0)), Integer.valueOf(((sf) ibVar2.a()).getInt("daily_collected", 0)));
        SensorsData U2 = MetaData.E().U();
        if (U2 == null) {
            return;
        }
        this.f3875d = (long) ((AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT / U2.d()) * 0.95d);
        this.f3883m = U2.e();
    }

    public static boolean a(ig igVar, SensorEvent sensorEvent) {
        igVar.getClass();
        int type = sensorEvent.sensor.getType();
        long currentTimeMillis = System.currentTimeMillis();
        Long l3 = (Long) igVar.f3874c.get(Integer.valueOf(type));
        if (currentTimeMillis - (l3 == null ? 0L : l3.longValue()) < igVar.f3875d) {
            return true;
        }
        igVar.f3874c.put(Integer.valueOf(type), Long.valueOf(currentTimeMillis));
        return false;
    }

    public final void a(Context context, SensorsData sensorsData) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f = sensorManager;
        if (sensorManager == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.f3885o, intentFilter);
        } catch (Throwable th) {
            if (a(8)) {
                d9.a(th);
            }
        }
        SensorManager sensorManager2 = this.f;
        if (sensorManager2 != null) {
            sensorManager2.unregisterListener(this.f3884n);
        }
        int d3 = 1000000 / sensorsData.d();
        Sensor defaultSensor = this.f.getDefaultSensor(1);
        Sensor defaultSensor2 = this.f.getDefaultSensor(4);
        Sensor defaultSensor3 = this.f.getDefaultSensor(2);
        this.f.registerListener(this.f3884n, defaultSensor, d3);
        this.f.registerListener(this.f3884n, defaultSensor2, d3);
        this.f.registerListener(this.f3884n, defaultSensor3, d3);
    }

    public static void a(ig igVar, SensorEvent sensorEvent, SensorsData sensorsData) {
        JSONObject jSONObject;
        igVar.f3873b = ((sf) igVar.f3877g.a()).getInt("total_collected", 0);
        c2 c2Var = igVar.f3876e;
        if (c2Var == null || c2Var.f3526g.size() >= c2Var.f3527h) {
            igVar.f3876e = new c2(((com.startapp.sdk.common.advertisingid.b) igVar.f3880j.a()).a().f3940a, igVar.f3878h.getPackageName(), System.currentTimeMillis() + "", UUID.randomUUID().toString(), igVar.f3882l, igVar.a(), sensorsData.c());
            igVar.f3872a = 0;
        }
        int i3 = igVar.f3872a;
        igVar.f3872a = i3 + 1;
        tf tfVar = new tf(i3, sensorEvent.sensor.getType(), System.currentTimeMillis(), Arrays.copyOf(sensorEvent.values, 3));
        c2 c2Var2 = igVar.f3876e;
        c2Var2.f3526g.add(tfVar);
        if (c2Var2.f3526g.size() >= c2Var2.f3527h) {
            int i4 = Calendar.getInstance().get(6);
            if (((Integer) igVar.f3879i.first).intValue() == i4) {
                Pair pair = igVar.f3879i;
                igVar.f3879i = new Pair((Integer) pair.first, Integer.valueOf(((Integer) pair.second).intValue() + 1));
            } else {
                igVar.f3879i = new Pair(Integer.valueOf(i4), 1);
            }
            c2 c2Var3 = igVar.f3876e;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("advertisingId", c2Var3.f3521a);
                jSONObject2.put("bId", c2Var3.f3524d);
                jSONObject2.put("batchTimestamp", c2Var3.f3523c);
                jSONObject2.put("fp", c2Var3.f3522b);
                jSONObject2.put("isCharging", c2Var3.f3525e);
                jSONObject2.put("isScreenOn", c2Var3.f);
                JSONArray jSONArray = new JSONArray();
                for (tf tfVar2 : c2Var3.f3526g) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("sId", tfVar2.f4388a);
                    jSONObject3.put("n", tfVar2.f4389b);
                    jSONObject3.put("ts", tfVar2.f4390c);
                    JSONArray jSONArray2 = new JSONArray();
                    int length = tfVar2.f4391d.length;
                    for (int i5 = 0; i5 < length; i5++) {
                        jSONArray2.put(r5[i5]);
                    }
                    jSONObject3.put("v", jSONArray2);
                    jSONArray.put(jSONObject3);
                }
                jSONObject2.put("valueList", jSONArray);
                jSONObject = jSONObject2;
            } catch (Throwable th) {
                if (igVar.a(16)) {
                    d9.a(th);
                }
                jSONObject = null;
            }
            if (sensorsData.g()) {
                d9 d9Var = new d9(e9.f3628p);
                d9Var.f3575e = String.valueOf(jSONObject);
                d9Var.a();
            } else {
                d9 d9Var2 = new d9(e9.f3628p);
                d9Var2.f = jSONObject;
                d9Var2.a();
            }
            rf edit = ((sf) igVar.f3877g.a()).edit();
            int i6 = igVar.f3873b + 1;
            igVar.f3873b = i6;
            edit.putInt("total_collected", i6);
            edit.putLong("sensor_last_collected_time", System.currentTimeMillis());
            Integer num = (Integer) igVar.f3879i.first;
            int intValue = num.intValue();
            edit.a("last_collected_day", num);
            edit.f4299a.putInt("last_collected_day", intValue);
            Integer num2 = (Integer) igVar.f3879i.second;
            int intValue2 = num2.intValue();
            edit.a("daily_collected", num2);
            edit.f4299a.putInt("daily_collected", intValue2);
            edit.apply();
            igVar.a(igVar.f3873b == sensorsData.e());
        }
    }

    public final boolean a() {
        for (Display display : ((DisplayManager) this.f3878h.getSystemService("display")).getDisplays()) {
            if (display.getState() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z3) {
        try {
            SensorManager sensorManager = this.f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f3884n);
            }
            this.f3881k.getClass();
            SensorsData U2 = MetaData.E().U();
            this.f3876e = null;
            if (!z3 && U2 != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new gg(this), U2.a() * 1000);
            }
            this.f3878h.unregisterReceiver(this.f3885o);
        } catch (Throwable th) {
            if (a(32)) {
                d9.a(th);
            }
        }
    }

    public final void a(Context context) {
        int a3;
        try {
            this.f3881k.getClass();
            SensorsData U2 = MetaData.E().U();
            String str = ((com.startapp.sdk.common.advertisingid.b) this.f3880j.a()).a().f3940a;
            if (U2 != null) {
                this.f3881k.getClass();
                SensorsData U3 = MetaData.E().U();
                if (U3 != null && ((sf) this.f3877g.a()).getInt("total_collected", 0) != U3.e() && !str.equals(CommonUrlParts.Values.FALSE_INTEGER) && !str.equals("00000000-0000-0000-0000-000000000000")) {
                    long j3 = ((sf) this.f3877g.a()).getLong("sensor_last_collected_time", 0L);
                    if ((((Integer) this.f3879i.first).intValue() != Calendar.getInstance().get(6) || ((Integer) this.f3879i.second).intValue() != U2.f()) && (System.currentTimeMillis() - j3) / 1000 >= U2.a()) {
                        a(context, U2);
                        return;
                    }
                    if (((Integer) this.f3879i.first).intValue() == Calendar.getInstance().get(6) && ((Integer) this.f3879i.second).intValue() == U2.f()) {
                        a3 = (24 - Calendar.getInstance().get(11)) * 3600;
                    } else {
                        a3 = U2.a();
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new gg(this), a3 * 1000);
                }
            }
        } catch (Throwable th) {
            if (a(4)) {
                d9.a(th);
            }
        }
    }

    public final boolean a(int i3) {
        this.f3881k.getClass();
        SensorsData U2 = MetaData.E().U();
        ComponentInfoEventConfig b3 = U2 != null ? U2.b() : null;
        return b3 != null && b3.a((long) i3);
    }
}
