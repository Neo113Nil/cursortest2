package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.provider.Settings;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ฅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0690 implements InterfaceC1253 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Context f1883;

    public C0690(Context context) {
        this.f1883 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1253
    public final String getName() {
        return StringFog.decrypt("PTxr/cFiV4Q+NVD52XhXhA==\n", "X1kDnLcLOPY=\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:54:0x0183, B:56:0x01ac, B:57:0x01bc, B:59:0x01c9, B:60:0x01d9), top: B:53:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9 A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:54:0x0183, B:56:0x01ac, B:57:0x01bc, B:59:0x01c9, B:60:0x01d9), top: B:53:0x0183 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151 A[Catch: Exception -> 0x015a, TRY_LEAVE, TryCatch #2 {Exception -> 0x015a, blocks: (B:39:0x013b, B:66:0x0151), top: B:38:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1253
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0474 mo5481() {
        int i;
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z;
        float size;
        Float f;
        Float valueOf;
        String decrypt;
        int i2;
        ArrayList arrayList = new ArrayList();
        SensorManager sensorManager = (SensorManager) this.f1883.getSystemService(StringFog.decrypt("8S2pmATq\n", "gkjH62uYf60=\n"));
        if (sensorManager == null) {
            arrayList.add(60);
            return new C0474(false, arrayList, null, StringFog.decrypt("d8tKjLs8lYJKz0Oapm6tjUXYRZa4L7qPQQ==\n", "JK4k/9RO2OM=\n"));
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(6);
        Sensor defaultSensor4 = sensorManager.getDefaultSensor(2);
        if (defaultSensor2 == null) {
            arrayList.add(61);
        }
        if (defaultSensor3 == null) {
            arrayList.add(62);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        float[] fArr = {Float.NaN};
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("PrAdP1lpbNcduSY7QXNs1y+0GC5DZXE=\n", "fNV1Xi8AA6U=\n"));
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        C0696 c0696 = new C0696(copyOnWriteArrayList2, copyOnWriteArrayList3, new float[]{Float.NaN}, fArr);
        if (defaultSensor != null) {
            i = 0;
            try {
                try {
                    sensorManager.registerListener(c0696, defaultSensor, 0, handler);
                } catch (InterruptedException unused) {
                    copyOnWriteArrayList = copyOnWriteArrayList3;
                    Thread.currentThread().interrupt();
                    sensorManager.unregisterListener(c0696);
                    handlerThread.quitSafely();
                    double m5637 = m5637(copyOnWriteArrayList2);
                    if (copyOnWriteArrayList2.isEmpty()) {
                    }
                    if (copyOnWriteArrayList2.isEmpty()) {
                    }
                    if (size > 0.9f) {
                    }
                    double m56372 = m5637(copyOnWriteArrayList);
                    i2 = Settings.System.getInt(this.f1883.getContentResolver(), StringFog.decrypt("TJF+eZgD7qpNm2t0iQPUu0w=\n", "P/IMHP1tscg=\n"), -1);
                    if (i2 >= 0) {
                    }
                }
            } catch (Throwable th) {
                sensorManager.unregisterListener(c0696);
                handlerThread.quitSafely();
                throw th;
            }
        } else {
            i = 0;
        }
        if (defaultSensor2 != null) {
            sensorManager.registerListener(c0696, defaultSensor2, i, handler);
        }
        if (defaultSensor3 != null) {
            sensorManager.registerListener(c0696, defaultSensor3, i, handler);
        }
        if (defaultSensor4 != null) {
            sensorManager.registerListener(c0696, defaultSensor4, i, handler);
        }
        copyOnWriteArrayList = copyOnWriteArrayList3;
        try {
            handler.postDelayed(new RunnableC0695(countDownLatch), 500L);
            countDownLatch.await(600L, TimeUnit.MILLISECONDS);
            sensorManager.unregisterListener(c0696);
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
            sensorManager.unregisterListener(c0696);
            handlerThread.quitSafely();
            double m56373 = m5637(copyOnWriteArrayList2);
            if (copyOnWriteArrayList2.isEmpty()) {
            }
            if (copyOnWriteArrayList2.isEmpty()) {
                arrayList.add(60);
            }
            if (size > 0.9f) {
            }
            double m563722 = m5637(copyOnWriteArrayList);
            i2 = Settings.System.getInt(this.f1883.getContentResolver(), StringFog.decrypt("TJF+eZgD7qpNm2t0iQPUu0w=\n", "P/IMHP1tscg=\n"), -1);
            if (i2 >= 0) {
            }
        }
        handlerThread.quitSafely();
        double m563732 = m5637(copyOnWriteArrayList2);
        if (copyOnWriteArrayList2.isEmpty()) {
            size = 0.0f;
            z = true;
        } else {
            Iterator it = copyOnWriteArrayList2.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                float[] fArr2 = (float[]) it.next();
                if (Math.abs(fArr2[2]) + Math.abs(fArr2[1]) + Math.abs(fArr2[0]) < 0.05f) {
                    i3++;
                }
            }
            z = true;
            size = i3 / copyOnWriteArrayList2.size();
        }
        if (copyOnWriteArrayList2.isEmpty() && defaultSensor != null) {
            arrayList.add(60);
        }
        if (size > 0.9f) {
            arrayList.add(63);
        }
        double m5637222 = m5637(copyOnWriteArrayList);
        try {
            i2 = Settings.System.getInt(this.f1883.getContentResolver(), StringFog.decrypt("TJF+eZgD7qpNm2t0iQPUu0w=\n", "P/IMHP1tscg=\n"), -1);
        } catch (Exception unused3) {
        }
        if (i2 >= 0) {
            f = Float.valueOf(i2 / 255.0f);
            if (f != null) {
                arrayList.add(64);
            }
            if (defaultSensor3 == null) {
            }
            if (!Float.isNaN(fArr[0])) {
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringFog.decrypt("jsGmczkZciKCx7FzJyphP4bDq3Uw\n", "76LFFlV8AE0=\n"), m563732);
            jSONObject.put(StringFog.decrypt("4dMHSIpcnvvj/BRVkF6f6OM=\n", "hqp1J/k/8Ys=\n"), m5637222);
            jSONObject.put(StringFog.decrypt("UC6NJNBNOwhFJa0q6Usg\n", "Kkv/S50iT2E=\n"), size);
            if (f != null) {
            }
            jSONObject.put(StringFog.decrypt("cFl4p5+qGvhtSm4=\n", "GDgL9+3PaYs=\n"), z);
            if (valueOf != null) {
            }
            decrypt = jSONObject.toString();
            return new C0474(arrayList.isEmpty(), arrayList, decrypt, null);
        }
        f = null;
        if (f != null && f.floatValue() == 0.0f) {
            arrayList.add(64);
        }
        if (defaultSensor3 == null) {
            z = false;
        }
        valueOf = !Float.isNaN(fArr[0]) ? null : Float.valueOf(fArr[0]);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(StringFog.decrypt("jsGmczkZciKCx7FzJyphP4bDq3Uw\n", "76LFFlV8AE0=\n"), m563732);
            jSONObject2.put(StringFog.decrypt("4dMHSIpcnvvj/BRVkF6f6OM=\n", "hqp1J/k/8Ys=\n"), m5637222);
            jSONObject2.put(StringFog.decrypt("UC6NJNBNOwhFJa0q6Usg\n", "Kkv/S50iT2E=\n"), size);
            if (f != null) {
                jSONObject2.put(StringFog.decrypt("bGy+XFPlId19bQ==\n", "Dh7XOzuRT7g=\n"), f.floatValue());
            }
            jSONObject2.put(StringFog.decrypt("cFl4p5+qGvhtSm4=\n", "GDgL9+3PaYs=\n"), z);
            if (valueOf != null) {
                jSONObject2.put(StringFog.decrypt("B9KJnPqB0ass2oue+6bMug/diYb3\n", "arPu8p/1uMg=\n"), valueOf.floatValue());
            }
            decrypt = jSONObject2.toString();
        } catch (Exception unused4) {
            decrypt = StringFog.decrypt("cP4=\n", "C4MI9ede5hM=\n");
        }
        return new C0474(arrayList.isEmpty(), arrayList, decrypt, null);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static double m5637(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (copyOnWriteArrayList.size() < 2) {
            return 0.0d;
        }
        double d = 0.0d;
        for (int i = 0; i <= 2; i++) {
            double d2 = 0.0d;
            while (copyOnWriteArrayList.iterator().hasNext()) {
                d2 += ((float[]) r6.next())[i];
            }
            double size = d2 / copyOnWriteArrayList.size();
            double d3 = 0.0d;
            while (copyOnWriteArrayList.iterator().hasNext()) {
                double d4 = ((float[]) r6.next())[i] - size;
                d3 += d4 * d4;
            }
            d += d3 / copyOnWriteArrayList.size();
        }
        return d / 3.0d;
    }
}
