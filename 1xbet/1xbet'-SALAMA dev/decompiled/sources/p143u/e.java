package p143u;

import android.view.View;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f16506c = new e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f16507d = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f16509b;

    public e(int i7) {
        this.f16508a = i7;
        switch (i7) {
            case 1:
                this.f16509b = new HashMap();
                break;
            default:
                this.f16509b = "identity";
                break;
        }
    }

    public static e d(String str) {
        int i7;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new d(str);
        }
        if (str.startsWith("spline")) {
            j jVar = new j(0);
            jVar.f16509b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i8 = 0;
            while (iIndexOf2 != -1) {
                dArr[i8] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i8++;
            }
            dArr[i8] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i8 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d7 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            int i9 = 0;
            while (i9 < dArrCopyOf.length) {
                double d8 = dArrCopyOf[i9];
                int i10 = i9 + length2;
                dArr2[i10][0] = d8;
                j jVar2 = jVar;
                double d9 = ((double) i9) * d7;
                dArr3[i10] = d9;
                if (i9 > 0) {
                    int i11 = (length2 * 2) + i9;
                    dArr2[i11][0] = d8 + 1.0d;
                    dArr3[i11] = d9 + 1.0d;
                    i7 = 1;
                    int i12 = i9 - 1;
                    dArr2[i12][0] = (d8 - 1.0d) - d7;
                    dArr3[i12] = (d9 - 1.0d) - d7;
                } else {
                    i7 = 1;
                }
                i9 += i7;
                jVar = jVar2;
            }
            j jVar3 = jVar;
            g gVar = new g(dArr3, dArr2);
            PrintStream printStream = System.out;
            printStream.println(" 0 " + gVar.d(0.0d));
            printStream.println(" 1 " + gVar.d(1.0d));
            jVar3.f16528e = gVar;
            return jVar3;
        }
        if (str.startsWith("Schlick")) {
            h hVar = new h(0);
            hVar.f16509b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            hVar.f16517e = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i13 = iIndexOf4 + 1;
            hVar.f16518f = Double.parseDouble(str.substring(i13, str.indexOf(44, i13)).trim());
            return hVar;
        }
        switch (str) {
            case "accelerate":
                return new d("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new d("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new d("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new d("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new d("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new d("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f16507d));
                return f16506c;
        }
    }

    public double b(double d7) {
        return 1.0d;
    }

    public float c(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = (HashMap) this.f16509b;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public String toString() {
        switch (this.f16508a) {
            case 0:
                return (String) this.f16509b;
            default:
                return super.toString();
        }
    }

    public double a(double d7) {
        return d7;
    }
}
