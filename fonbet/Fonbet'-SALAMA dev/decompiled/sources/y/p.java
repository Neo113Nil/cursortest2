package y;

import android.view.View;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import u.C1616e;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public q4.d f18120a;

    /* renamed from: b, reason: collision with root package name */
    public String f18121b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f18122c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18123d;

    /* renamed from: e, reason: collision with root package name */
    public long f18124e;

    /* renamed from: f, reason: collision with root package name */
    public float f18125f;

    public p() {
        this.f18122c = new float[3];
        this.f18123d = false;
        this.f18125f = Float.NaN;
    }

    public final float a(float f7, long j, View view, C1616e c1616e) {
        float[] fArr = this.f18122c;
        this.f18120a.f(f7, fArr);
        boolean z4 = true;
        float f8 = fArr[1];
        if (f8 == 0.0f) {
            this.f18123d = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f18125f)) {
            float c3 = c1616e.c(view, this.f18121b);
            this.f18125f = c3;
            if (Float.isNaN(c3)) {
                this.f18125f = 0.0f;
            }
        }
        float f9 = (float) (((((j - this.f18124e) * 1.0E-9d) * f8) + this.f18125f) % 1.0d);
        this.f18125f = f9;
        String str = this.f18121b;
        HashMap hashMap = (HashMap) c1616e.f16503b;
        if (hashMap.containsKey(view)) {
            HashMap hashMap2 = (HashMap) hashMap.get(view);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
            }
            if (hashMap2.containsKey(str)) {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f9;
                hashMap2.put(str, fArr2);
            } else {
                hashMap2.put(str, new float[]{f9});
                hashMap.put(view, hashMap2);
            }
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put(str, new float[]{f9});
            hashMap.put(view, hashMap3);
        }
        this.f18124e = j;
        float f10 = fArr[0];
        float sin = (((float) Math.sin(this.f18125f * 6.2831855f)) * f10) + fArr[2];
        if (f10 == 0.0f && f8 == 0.0f) {
            z4 = false;
        }
        this.f18123d = z4;
        return sin;
    }

    public abstract boolean b(float f7, long j, View view, C1616e c1616e);

    public void c(int i7) {
        System.err.println("Error no points added to " + this.f18121b);
    }

    public final String toString() {
        String str = this.f18121b;
        new DecimalFormat("##.##");
        return str;
    }
}
