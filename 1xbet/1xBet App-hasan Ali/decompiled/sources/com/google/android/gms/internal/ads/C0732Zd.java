package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.Zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732Zd extends Kt {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f12494a;

    /* renamed from: c, reason: collision with root package name */
    public final Display f12496c;
    public float[] f;

    /* renamed from: g, reason: collision with root package name */
    public Jt f12499g;

    /* renamed from: h, reason: collision with root package name */
    public C0759ae f12500h;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f12497d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f12498e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f12495b = new Object();

    public C0732Zd(Context context) {
        this.f12494a = (SensorManager) context.getSystemService("sensor");
        this.f12496c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.Kt
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f12495b) {
            try {
                if (this.f == null) {
                    this.f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f12497d, fArr);
        int rotation = this.f12496c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f12497d, 2, 129, this.f12498e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f12497d, 129, 130, this.f12498e);
        } else if (rotation != 3) {
            System.arraycopy(this.f12497d, 0, this.f12498e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f12497d, 130, 1, this.f12498e);
        }
        float[] fArr2 = this.f12498e;
        float f = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f;
        float f5 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f5;
        float f6 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f6;
        synchronized (this.f12495b) {
            System.arraycopy(this.f12498e, 0, this.f, 0, 9);
        }
        C0759ae c0759ae = this.f12500h;
        if (c0759ae != null) {
            c0759ae.a();
        }
    }

    public final void b() {
        if (this.f12499g == null) {
            return;
        }
        this.f12494a.unregisterListener(this);
        this.f12499g.post(new C4(2));
        this.f12499g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f12495b) {
            try {
                float[] fArr2 = this.f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
