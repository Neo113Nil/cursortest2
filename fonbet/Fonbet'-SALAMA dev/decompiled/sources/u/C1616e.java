package u;

import android.view.View;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1616e {

    /* renamed from: c, reason: collision with root package name */
    public static final C1616e f16500c = new C1616e(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f16501d = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16502a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f16503b;

    public C1616e(int i7) {
        this.f16502a = i7;
        switch (i7) {
            case 1:
                this.f16503b = new HashMap();
                break;
            default:
                this.f16503b = "identity";
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015d, code lost:
    
        if (r21.equals("linear") == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1616e d(String str) {
        int i7;
        char c3 = 3;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C1615d(str);
        }
        if (str.startsWith("spline")) {
            j jVar = new j(0);
            jVar.f16503b = str;
            double[] dArr = new double[str.length() / 2];
            int indexOf = str.indexOf(40) + 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i8 = 0;
            while (indexOf2 != -1) {
                dArr[i8] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i8++;
            }
            dArr[i8] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr, i8 + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d7 = 1.0d / length2;
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            int i9 = 0;
            while (i9 < copyOf.length) {
                double d8 = copyOf[i9];
                int i10 = i9 + length2;
                dArr2[i10][0] = d8;
                j jVar2 = jVar;
                double d9 = i9 * d7;
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
            C1618g c1618g = new C1618g(dArr3, dArr2);
            PrintStream printStream = System.out;
            printStream.println(" 0 " + c1618g.d(0.0d));
            printStream.println(" 1 " + c1618g.d(1.0d));
            jVar3.f16522e = c1618g;
            return jVar3;
        }
        if (str.startsWith("Schlick")) {
            h hVar = new h(0);
            hVar.f16503b = str;
            int indexOf3 = str.indexOf(40);
            int indexOf4 = str.indexOf(44, indexOf3);
            hVar.f16511e = Double.parseDouble(str.substring(indexOf3 + 1, indexOf4).trim());
            int i13 = indexOf4 + 1;
            hVar.f16512f = Double.parseDouble(str.substring(i13, str.indexOf(44, i13)).trim());
            return hVar;
        }
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -1102672091:
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                return new C1615d("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C1615d("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C1615d("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new C1615d("cubic(1, 1, 0, 0)");
            case 4:
                return new C1615d("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new C1615d("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f16501d));
                return f16500c;
        }
    }

    public double b(double d7) {
        return 1.0d;
    }

    public float c(View view, String str) {
        HashMap hashMap;
        float[] fArr;
        HashMap hashMap2 = (HashMap) this.f16503b;
        if (hashMap2.containsKey(view) && (hashMap = (HashMap) hashMap2.get(view)) != null && hashMap.containsKey(str) && (fArr = (float[]) hashMap.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public String toString() {
        switch (this.f16502a) {
            case 0:
                return (String) this.f16503b;
            default:
                return super.toString();
        }
    }

    public double a(double d7) {
        return d7;
    }
}
