package y;

import C0.C0090i;
import android.view.View;
import c5.C0820a;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import w1.C1759x1;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public C0820a f18102a;

    /* renamed from: b, reason: collision with root package name */
    public String f18103b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18104c = new ArrayList();

    public static f c(String str) {
        if (str.startsWith("CUSTOM")) {
            C1793c c1793c = new C1793c();
            c1793c.f18100d = new float[1];
            return c1793c;
        }
        switch (str) {
            case "rotationX":
                return new C1792b(3);
            case "rotationY":
                return new C1792b(4);
            case "translationX":
                return new C1792b(7);
            case "translationY":
                return new C1792b(8);
            case "translationZ":
                return new C1792b(9);
            case "progress":
                e eVar = new e();
                eVar.f18101d = false;
                return eVar;
            case "scaleX":
                return new C1792b(5);
            case "scaleY":
                return new C1792b(6);
            case "waveVariesBy":
                return new C1792b(0);
            case "rotation":
                return new C1792b(2);
            case "elevation":
                return new C1792b(1);
            case "transitionPathRotate":
                return new C1794d();
            case "alpha":
                return new C1792b(0);
            case "waveOffset":
                return new C1792b(0);
            default:
                return null;
        }
    }

    public final float a(float f7) {
        C0820a c0820a = this.f18102a;
        q4.d dVar = (q4.d) c0820a.f10439g;
        if (dVar != null) {
            dVar.e(f7, (double[]) c0820a.f10440h);
        } else {
            double[] dArr = (double[]) c0820a.f10440h;
            dArr[0] = ((float[]) c0820a.f10437e)[0];
            dArr[1] = ((float[]) c0820a.f10438f)[0];
            dArr[2] = ((float[]) c0820a.f10434b)[0];
        }
        double[] dArr2 = (double[]) c0820a.f10440h;
        return (float) ((((C1759x1) c0820a.f10433a).O(f7, dArr2[1]) * ((double[]) c0820a.f10440h)[2]) + dArr2[0]);
    }

    public final float b(float f7) {
        C0820a c0820a = this.f18102a;
        q4.d dVar = (q4.d) c0820a.f10439g;
        double d7 = 0.0d;
        if (dVar != null) {
            double d8 = f7;
            dVar.h(d8, (double[]) c0820a.f10441i);
            ((q4.d) c0820a.f10439g).e(d8, (double[]) c0820a.f10440h);
        } else {
            double[] dArr = (double[]) c0820a.f10441i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d9 = f7;
        double d10 = ((double[]) c0820a.f10440h)[1];
        C1759x1 c1759x1 = (C1759x1) c0820a.f10433a;
        double O7 = c1759x1.O(d9, d10);
        double d11 = ((double[]) c0820a.f10440h)[1];
        double d12 = ((double[]) c0820a.f10441i)[1];
        double M7 = c1759x1.M(d9) + d11;
        if (d9 <= 0.0d) {
            d9 = 1.0E-5d;
        } else if (d9 >= 1.0d) {
            d9 = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch((double[]) c1759x1.f17926c, d9);
        if (binarySearch <= 0 && binarySearch != 0) {
            int i7 = -binarySearch;
            int i8 = i7 - 1;
            float[] fArr = (float[]) c1759x1.f17925b;
            float f8 = fArr[i8];
            int i9 = i7 - 2;
            float f9 = fArr[i9];
            double[] dArr2 = (double[]) c1759x1.f17926c;
            double d13 = dArr2[i8];
            double d14 = dArr2[i9];
            double d15 = (f8 - f9) / (d13 - d14);
            d7 = (f9 - (d15 * d14)) + (d9 * d15);
        }
        double cos = Math.cos(6.283185307179586d * M7);
        double[] dArr3 = (double[]) c0820a.f10441i;
        return (float) ((cos * (d7 + d12) * 6.283185307179586d * ((double[]) c0820a.f10440h)[2]) + (O7 * dArr3[2]) + dArr3[0]);
    }

    public abstract void d(View view, float f7);

    public final void e() {
        ArrayList arrayList = this.f18104c;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C0090i(5));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        C0820a c0820a = new C0820a();
        C1759x1 c1759x1 = new C1759x1(23, false);
        c1759x1.f17925b = new float[0];
        c1759x1.f17926c = new double[0];
        c0820a.f10433a = c1759x1;
        c0820a.f10434b = new float[size];
        c0820a.f10435c = new double[size];
        c0820a.f10436d = new float[size];
        c0820a.f10437e = new float[size];
        c0820a.f10438f = new float[size];
        float[] fArr = new float[size];
        this.f18102a = c0820a;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        C0820a c0820a2 = this.f18102a;
        double[] dArr3 = (double[]) c0820a2.f10435c;
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, dArr3.length, 3);
        float[] fArr2 = (float[]) c0820a2.f10434b;
        c0820a2.f10440h = new double[fArr2.length + 2];
        c0820a2.f10441i = new double[fArr2.length + 2];
        double d7 = dArr3[0];
        float[] fArr3 = (float[]) c0820a2.f10436d;
        C1759x1 c1759x12 = (C1759x1) c0820a2.f10433a;
        if (d7 > 0.0d) {
            c1759x12.B(0.0d, fArr3[0]);
        }
        int length = dArr3.length - 1;
        if (dArr3[length] < 1.0d) {
            c1759x12.B(1.0d, fArr3[length]);
        }
        int i7 = 0;
        while (i7 < dArr4.length) {
            double[] dArr5 = dArr4[i7];
            dArr5[0] = ((float[]) c0820a2.f10437e)[i7];
            dArr5[1] = ((float[]) c0820a2.f10438f)[i7];
            dArr5[2] = fArr2[i7];
            c1759x12.B(dArr3[i7], fArr3[i7]);
            i7++;
            dArr2 = dArr2;
        }
        double[][] dArr6 = dArr2;
        int i8 = 0;
        double d8 = 0.0d;
        while (true) {
            if (i8 >= ((float[]) c1759x12.f17925b).length) {
                break;
            }
            d8 += r5[i8];
            i8++;
        }
        int i9 = 1;
        double d9 = 0.0d;
        while (true) {
            float[] fArr4 = (float[]) c1759x12.f17925b;
            if (i9 >= fArr4.length) {
                break;
            }
            int i10 = i9 - 1;
            float f7 = (fArr4[i10] + fArr4[i9]) / 2.0f;
            double[] dArr7 = (double[]) c1759x12.f17926c;
            d9 = ((dArr7[i9] - dArr7[i10]) * f7) + d9;
            i9++;
            dArr4 = dArr4;
        }
        double[][] dArr8 = dArr4;
        int i11 = 0;
        while (true) {
            float[] fArr5 = (float[]) c1759x12.f17925b;
            if (i11 >= fArr5.length) {
                break;
            }
            fArr5[i11] = (float) (fArr5[i11] * (d8 / d9));
            i11++;
        }
        ((double[]) c1759x12.f17927d)[0] = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr6 = (float[]) c1759x12.f17925b;
            if (i12 >= fArr6.length) {
                break;
            }
            int i13 = i12 - 1;
            float f8 = (fArr6[i13] + fArr6[i12]) / 2.0f;
            double[] dArr9 = (double[]) c1759x12.f17926c;
            double d10 = dArr9[i12] - dArr9[i13];
            double[] dArr10 = (double[]) c1759x12.f17927d;
            dArr10[i12] = (d10 * f8) + dArr10[i13];
            i12++;
        }
        if (dArr3.length > 1) {
            c0820a2.f10439g = q4.d.c(0, dArr3, dArr8);
        } else {
            c0820a2.f10439g = null;
        }
        q4.d.c(0, dArr, dArr6);
    }

    public final String toString() {
        String str = this.f18103b;
        new DecimalFormat("##.##");
        Iterator it = this.f18104c.iterator();
        if (!it.hasNext()) {
            return str;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
