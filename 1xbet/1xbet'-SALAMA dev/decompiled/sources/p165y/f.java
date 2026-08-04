package p165y;

import C0.C0090i;
import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import p019c5.a;
import p120q4.d;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f18108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18110c = new ArrayList();

    public static f c(String str) {
        if (str.startsWith("CUSTOM")) {
            c cVar = new c();
            cVar.f18106d = new float[1];
            return cVar;
        }
        switch (str) {
            case "rotationX":
                return new b(3);
            case "rotationY":
                return new b(4);
            case "translationX":
                return new b(7);
            case "translationY":
                return new b(8);
            case "translationZ":
                return new b(9);
            case "progress":
                e eVar = new e();
                eVar.f18107d = false;
                return eVar;
            case "scaleX":
                return new b(5);
            case "scaleY":
                return new b(6);
            case "waveVariesBy":
                return new b(0);
            case "rotation":
                return new b(2);
            case "elevation":
                return new b(1);
            case "transitionPathRotate":
                return new d();
            case "alpha":
                return new b(0);
            case "waveOffset":
                return new b(0);
            default:
                return null;
        }
    }

    public final float a(float f7) {
        a aVar = this.f18108a;
        d dVar = (d) aVar.f10439g;
        if (dVar != null) {
            dVar.e(f7, (double[]) aVar.f10440h);
        } else {
            double[] dArr = (double[]) aVar.f10440h;
            dArr[0] = ((float[]) aVar.f10437e)[0];
            dArr[1] = ((float[]) aVar.f10438f)[0];
            dArr[2] = ((float[]) aVar.f10434b)[0];
        }
        double[] dArr2 = (double[]) aVar.f10440h;
        return (float) ((((C1050x1) aVar.f10433a).O(f7, dArr2[1]) * ((double[]) aVar.f10440h)[2]) + dArr2[0]);
    }

    public final float b(float f7) {
        a aVar = this.f18108a;
        d dVar = (d) aVar.f10439g;
        double d7 = 0.0d;
        if (dVar != null) {
            double d8 = f7;
            dVar.h(d8, (double[]) aVar.f10441i);
            ((d) aVar.f10439g).e(d8, (double[]) aVar.f10440h);
        } else {
            double[] dArr = (double[]) aVar.f10441i;
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
        }
        double d9 = f7;
        double d10 = ((double[]) aVar.f10440h)[1];
        C1050x1 c1050x1 = (C1050x1) aVar.f10433a;
        double dO = c1050x1.O(d9, d10);
        double d11 = ((double[]) aVar.f10440h)[1];
        double d12 = ((double[]) aVar.f10441i)[1];
        double dM = c1050x1.M(d9) + d11;
        if (d9 <= 0.0d) {
            d9 = 1.0E-5d;
        } else if (d9 >= 1.0d) {
            d9 = 0.999999d;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) c1050x1.f17932c, d9);
        if (iBinarySearch <= 0 && iBinarySearch != 0) {
            int i7 = -iBinarySearch;
            int i8 = i7 - 1;
            float[] fArr = (float[]) c1050x1.f17931b;
            float f8 = fArr[i8];
            int i9 = i7 - 2;
            float f9 = fArr[i9];
            double[] dArr2 = (double[]) c1050x1.f17932c;
            double d13 = dArr2[i8];
            double d14 = dArr2[i9];
            double d15 = ((double) (f8 - f9)) / (d13 - d14);
            d7 = (((double) f9) - (d15 * d14)) + (d9 * d15);
        }
        double dCos = Math.cos(6.283185307179586d * dM);
        double[] dArr3 = (double[]) aVar.f10441i;
        return (float) ((dCos * (d7 + d12) * 6.283185307179586d * ((double[]) aVar.f10440h)[2]) + (dO * dArr3[2]) + dArr3[0]);
    }

    public abstract void d(View view, float f7);

    public final void e() {
        ArrayList arrayList = this.f18110c;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new C0090i(5));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        a aVar = new a();
        C1050x1 c1050x1 = new C1050x1(23, false);
        c1050x1.f17931b = new float[0];
        c1050x1.f17932c = new double[0];
        aVar.f10433a = c1050x1;
        aVar.f10434b = new float[size];
        aVar.f10435c = new double[size];
        aVar.f10436d = new float[size];
        aVar.f10437e = new float[size];
        aVar.f10438f = new float[size];
        float[] fArr = new float[size];
        this.f18108a = aVar;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        a aVar2 = this.f18108a;
        double[] dArr3 = (double[]) aVar2.f10435c;
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, dArr3.length, 3);
        float[] fArr2 = (float[]) aVar2.f10434b;
        aVar2.f10440h = new double[fArr2.length + 2];
        aVar2.f10441i = new double[fArr2.length + 2];
        double d7 = dArr3[0];
        float[] fArr3 = (float[]) aVar2.f10436d;
        C1050x1 c1050x2 = (C1050x1) aVar2.f10433a;
        if (d7 > 0.0d) {
            c1050x2.B(0.0d, fArr3[0]);
        }
        int length = dArr3.length - 1;
        if (dArr3[length] < 1.0d) {
            c1050x2.B(1.0d, fArr3[length]);
        }
        int i7 = 0;
        while (i7 < dArr4.length) {
            double[] dArr5 = dArr4[i7];
            dArr5[0] = ((float[]) aVar2.f10437e)[i7];
            dArr5[1] = ((float[]) aVar2.f10438f)[i7];
            dArr5[2] = fArr2[i7];
            c1050x2.B(dArr3[i7], fArr3[i7]);
            i7++;
            dArr2 = dArr2;
        }
        double[][] dArr6 = dArr2;
        int i8 = 0;
        double d8 = 0.0d;
        while (true) {
            float[] fArr4 = (float[]) c1050x2.f17931b;
            if (i8 >= fArr4.length) {
                break;
            }
            d8 += (double) fArr4[i8];
            i8++;
        }
        int i9 = 1;
        double d9 = 0.0d;
        while (true) {
            float[] fArr5 = (float[]) c1050x2.f17931b;
            if (i9 >= fArr5.length) {
                break;
            }
            int i10 = i9 - 1;
            float f7 = (fArr5[i10] + fArr5[i9]) / 2.0f;
            double[] dArr7 = (double[]) c1050x2.f17932c;
            d9 = ((dArr7[i9] - dArr7[i10]) * ((double) f7)) + d9;
            i9++;
            dArr4 = dArr4;
        }
        double[][] dArr8 = dArr4;
        int i11 = 0;
        while (true) {
            float[] fArr6 = (float[]) c1050x2.f17931b;
            if (i11 >= fArr6.length) {
                break;
            }
            fArr6[i11] = (float) (((double) fArr6[i11]) * (d8 / d9));
            i11++;
        }
        ((double[]) c1050x2.f17933d)[0] = 0.0d;
        int i12 = 1;
        while (true) {
            float[] fArr7 = (float[]) c1050x2.f17931b;
            if (i12 >= fArr7.length) {
                break;
            }
            int i13 = i12 - 1;
            float f8 = (fArr7[i13] + fArr7[i12]) / 2.0f;
            double[] dArr9 = (double[]) c1050x2.f17932c;
            double d10 = dArr9[i12] - dArr9[i13];
            double[] dArr10 = (double[]) c1050x2.f17933d;
            dArr10[i12] = (d10 * ((double) f8)) + dArr10[i13];
            i12++;
        }
        if (dArr3.length > 1) {
            aVar2.f10439g = d.c(0, dArr3, dArr8);
        } else {
            aVar2.f10439g = null;
        }
        d.c(0, dArr, dArr6);
    }

    public final String toString() {
        String str = this.f18109b;
        new DecimalFormat("##.##");
        Iterator it = this.f18110c.iterator();
        if (!it.hasNext()) {
            return str;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
