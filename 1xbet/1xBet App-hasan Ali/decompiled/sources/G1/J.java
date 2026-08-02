package G1;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class J extends M {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1868d;

    public static float[] g(String str) {
        return new float[]{Float.valueOf(Float.parseFloat(str)).floatValue()};
    }

    public static int[] h(String str) {
        return new int[]{((Number) M.f1871a.c(str)).intValue()};
    }

    public static long[] i(String str) {
        return new long[]{((Number) M.f1872b.c(str)).longValue()};
    }

    public static boolean[] j(String str) {
        return new boolean[]{((Boolean) M.f1873c.c(str)).booleanValue()};
    }

    @Override // G1.M
    public final Object a(String str, Bundle bundle) {
        switch (this.f1868d) {
            case 0:
                return (boolean[]) L1.a.j(bundle, "bundle", str, "key", str);
            case 1:
                return (float[]) L1.a.j(bundle, "bundle", str, "key", str);
            case 2:
                return (int[]) L1.a.j(bundle, "bundle", str, "key", str);
            case 3:
                return (long[]) L1.a.j(bundle, "bundle", str, "key", str);
            default:
                return (String[]) L1.a.j(bundle, "bundle", str, "key", str);
        }
    }

    @Override // G1.M
    public final String b() {
        switch (this.f1868d) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case 2:
                return "integer[]";
            case 3:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // G1.M
    public final Object c(String str) {
        switch (this.f1868d) {
            case 0:
                return j(str);
            case 1:
                return g(str);
            case 2:
                return h(str);
            case 3:
                return i(str);
            default:
                return new String[]{str};
        }
    }

    @Override // G1.M
    public final Object d(String str, Object obj) {
        switch (this.f1868d) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return j(str);
                }
                boolean[] j5 = j(str);
                int length = zArr.length;
                boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(j5, 0, copyOf, length, 1);
                kotlin.jvm.internal.l.c(copyOf);
                return copyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return g(str);
                }
                float[] g5 = g(str);
                int length2 = fArr.length;
                float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(g5, 0, copyOf2, length2, 1);
                kotlin.jvm.internal.l.c(copyOf2);
                return copyOf2;
            case 2:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return h(str);
                }
                int[] h3 = h(str);
                int length3 = iArr.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(h3, 0, copyOf3, length3, 1);
                kotlin.jvm.internal.l.c(copyOf3);
                return copyOf3;
            case 3:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return i(str);
                }
                long[] i = i(str);
                int length4 = jArr.length;
                long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(i, 0, copyOf4, length4, 1);
                kotlin.jvm.internal.l.c(copyOf4);
                return copyOf4;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                kotlin.jvm.internal.l.c(copyOf5);
                return (String[]) copyOf5;
        }
    }

    @Override // G1.M
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f1868d) {
            case 0:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 2:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 3:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putLongArray(str, (long[]) obj);
                break;
            default:
                kotlin.jvm.internal.l.f("key", str);
                bundle.putStringArray(str, (String[]) obj);
                break;
        }
    }

    @Override // G1.M
    public final boolean f(Object obj, Object obj2) {
        Boolean[] boolArr;
        Float[] fArr;
        Integer[] numArr;
        Long[] lArr;
        switch (this.f1868d) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                Boolean[] boolArr2 = null;
                if (zArr != null) {
                    boolArr = new Boolean[zArr.length];
                    int length = zArr.length;
                    for (int i = 0; i < length; i++) {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                } else {
                    boolArr = null;
                }
                if (zArr2 != null) {
                    boolArr2 = new Boolean[zArr2.length];
                    int length2 = zArr2.length;
                    for (int i5 = 0; i5 < length2; i5++) {
                        boolArr2[i5] = Boolean.valueOf(zArr2[i5]);
                    }
                }
                return X3.l.q0(boolArr, boolArr2);
            case 1:
                float[] fArr2 = (float[]) obj;
                float[] fArr3 = (float[]) obj2;
                Float[] fArr4 = null;
                if (fArr2 != null) {
                    fArr = new Float[fArr2.length];
                    int length3 = fArr2.length;
                    for (int i6 = 0; i6 < length3; i6++) {
                        fArr[i6] = Float.valueOf(fArr2[i6]);
                    }
                } else {
                    fArr = null;
                }
                if (fArr3 != null) {
                    fArr4 = new Float[fArr3.length];
                    int length4 = fArr3.length;
                    for (int i7 = 0; i7 < length4; i7++) {
                        fArr4[i7] = Float.valueOf(fArr3[i7]);
                    }
                }
                return X3.l.q0(fArr, fArr4);
            case 2:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                Integer[] numArr2 = null;
                if (iArr != null) {
                    numArr = new Integer[iArr.length];
                    int length5 = iArr.length;
                    for (int i8 = 0; i8 < length5; i8++) {
                        numArr[i8] = Integer.valueOf(iArr[i8]);
                    }
                } else {
                    numArr = null;
                }
                if (iArr2 != null) {
                    numArr2 = new Integer[iArr2.length];
                    int length6 = iArr2.length;
                    for (int i9 = 0; i9 < length6; i9++) {
                        numArr2[i9] = Integer.valueOf(iArr2[i9]);
                    }
                }
                return X3.l.q0(numArr, numArr2);
            case 3:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                Long[] lArr2 = null;
                if (jArr != null) {
                    lArr = new Long[jArr.length];
                    int length7 = jArr.length;
                    for (int i10 = 0; i10 < length7; i10++) {
                        lArr[i10] = Long.valueOf(jArr[i10]);
                    }
                } else {
                    lArr = null;
                }
                if (jArr2 != null) {
                    lArr2 = new Long[jArr2.length];
                    int length8 = jArr2.length;
                    for (int i11 = 0; i11 < length8; i11++) {
                        lArr2[i11] = Long.valueOf(jArr2[i11]);
                    }
                }
                return X3.l.q0(lArr, lArr2);
            default:
                return X3.l.q0((String[]) obj, (String[]) obj2);
        }
    }
}
