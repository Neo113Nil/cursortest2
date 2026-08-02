package X3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import k4.AbstractC2036a;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class l extends AbstractC2036a {
    public static Object[] A0(Object[] objArr, int i, int i5) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        AbstractC2036a.u(i5, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i, i5);
        kotlin.jvm.internal.l.e("copyOfRange(...)", copyOfRange);
        return copyOfRange;
    }

    public static void B0(Object[] objArr, int i, int i5) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        Arrays.fill(objArr, i, i5, (Object) null);
    }

    public static void C0(long[] jArr, long j5) {
        int length = jArr.length;
        kotlin.jvm.internal.l.f("<this>", jArr);
        Arrays.fill(jArr, 0, length, j5);
    }

    public static ArrayList E0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int F0(long[] jArr) {
        kotlin.jvm.internal.l.f("<this>", jArr);
        return jArr.length - 1;
    }

    public static int G0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static char H0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static void I0(Object[] objArr, Comparator comparator, int i, int i5) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        kotlin.jvm.internal.l.f("comparator", comparator);
        Arrays.sort(objArr, i, i5, comparator);
    }

    public static List J0(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new j(objArr, false)) : AbstractC2346c.A(objArr[0]) : v.f6090k;
    }

    public static List o0(Object[] objArr) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.l.e("asList(...)", asList);
        return asList;
    }

    public static boolean p0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        return G0(objArr, obj) >= 0;
    }

    public static boolean q0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!q0((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void r0(int i, int i5, int i6, byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.l.f("<this>", bArr);
        kotlin.jvm.internal.l.f("destination", bArr2);
        System.arraycopy(bArr, i5, bArr2, i, i6 - i5);
    }

    public static void s0(int i, int i5, int i6, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.l.f("<this>", iArr);
        kotlin.jvm.internal.l.f("destination", iArr2);
        System.arraycopy(iArr, i5, iArr2, i, i6 - i5);
    }

    public static void t0(int i, int i5, int i6, Object[] objArr, Object[] objArr2) {
        kotlin.jvm.internal.l.f("<this>", objArr);
        kotlin.jvm.internal.l.f("destination", objArr2);
        System.arraycopy(objArr, i5, objArr2, i, i6 - i5);
    }

    public static void u0(char[] cArr, char[] cArr2, int i, int i5, int i6) {
        kotlin.jvm.internal.l.f("<this>", cArr);
        kotlin.jvm.internal.l.f("destination", cArr2);
        System.arraycopy(cArr, i5, cArr2, i, i6 - i5);
    }

    public static void v0(long[] jArr, long[] jArr2, int i, int i5, int i6) {
        kotlin.jvm.internal.l.f("<this>", jArr);
        kotlin.jvm.internal.l.f("destination", jArr2);
        System.arraycopy(jArr, i5, jArr2, i, i6 - i5);
    }

    public static /* synthetic */ void w0(int i, int i5, int i6, byte[] bArr, byte[] bArr2) {
        if ((i6 & 4) != 0) {
            i = 0;
        }
        r0(0, i, i5, bArr, bArr2);
    }

    public static /* synthetic */ void x0(int i, int i5, int i6, int[] iArr, int[] iArr2) {
        if ((i6 & 2) != 0) {
            i = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = iArr.length;
        }
        s0(i, 0, i5, iArr, iArr2);
    }

    public static /* synthetic */ void y0(int i, int i5, int i6, Object[] objArr, Object[] objArr2) {
        if ((i6 & 4) != 0) {
            i = 0;
        }
        t0(0, i, i5, objArr, objArr2);
    }

    public static byte[] z0(byte[] bArr, int i, int i5) {
        kotlin.jvm.internal.l.f("<this>", bArr);
        AbstractC2036a.u(i5, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i5);
        kotlin.jvm.internal.l.e("copyOfRange(...)", copyOfRange);
        return copyOfRange;
    }
}
