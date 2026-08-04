package p165y;

import android.view.View;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import p120q4.d;
import p143u.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f18126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f18128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18131f;

    public p() {
        this.f18128c = new float[3];
        this.f18129d = false;
        this.f18131f = Float.NaN;
    }

    public final float a(float f7, long j, View view, e eVar) {
        float[] fArr = this.f18128c;
        this.f18126a.f(f7, fArr);
        boolean z4 = true;
        float f8 = fArr[1];
        if (f8 == 0.0f) {
            this.f18129d = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f18131f)) {
            float fC = eVar.c(view, this.f18127b);
            this.f18131f = fC;
            if (Float.isNaN(fC)) {
                this.f18131f = 0.0f;
            }
        }
        float f9 = (float) (((((j - this.f18130e) * 1.0E-9d) * ((double) f8)) + ((double) this.f18131f)) % 1.0d);
        this.f18131f = f9;
        String str = this.f18127b;
        HashMap map = (HashMap) eVar.f16509b;
        if (map.containsKey(view)) {
            HashMap map2 = (HashMap) map.get(view);
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = (float[]) map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f9;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f9});
                map.put(view, map2);
            }
        } else {
            HashMap map3 = new HashMap();
            map3.put(str, new float[]{f9});
            map.put(view, map3);
        }
        this.f18130e = j;
        float f10 = fArr[0];
        float fSin = (((float) Math.sin(this.f18131f * 6.2831855f)) * f10) + fArr[2];
        if (f10 == 0.0f && f8 == 0.0f) {
            z4 = false;
        }
        this.f18129d = z4;
        return fSin;
    }

    public abstract boolean b(float f7, long j, View view, e eVar);

    public void c(int i7) {
        System.err.println("Error no points added to " + this.f18127b);
    }

    public final String toString() {
        String str = this.f18127b;
        new DecimalFormat("##.##");
        return str;
    }
}
