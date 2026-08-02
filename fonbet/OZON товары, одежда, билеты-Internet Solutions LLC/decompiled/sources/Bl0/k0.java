package Bl0;

import C.C2702w;
import I0.C3173b;
import J0.C3339s;
import J0.C3343t;
import J0.C3363y;
import S0.InterfaceC3967k;
import We.InterfaceC4865g;
import eg0.C6364b;
import l1.C7807Z;
import l1.C7811b0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* loaded from: classes8.dex */
public final class k0 {
    public static final C6364b a(InterfaceC4865g interfaceC4865g) {
        Object i11 = interfaceC4865g.request().i(uf0.b.class);
        if (i11 instanceof C6364b) {
            return (C6364b) i11;
        }
        return null;
    }

    private static String b(int i11, int i12, String str) {
        if (i11 < 0) {
            return O7.o.d("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return O7.o.d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException(Ej.b.a(i12, "negative size: "));
    }

    public static void c(long j11, String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(O7.o.d(str, Long.valueOf(j11)));
        }
    }

    public static void d(String str, boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(int i11, int i12) {
        String d11;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                d11 = O7.o.d("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    throw new IllegalArgumentException(Ej.b.a(i12, "negative size: "));
                }
                d11 = O7.o.d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(d11);
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void h(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(b(i11, i12, "index"));
        }
    }

    public static void i(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? b(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? b(i12, i13, "end index") : O7.o.d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    public static void j(long j11, String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(O7.o.d(str, Long.valueOf(j11)));
        }
    }

    public static void k(Object obj, String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(O7.o.d(str, obj));
        }
    }

    public static void l(String str, boolean z11) {
        if (!z11) {
            throw new IllegalStateException(str);
        }
    }

    public static void m(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    private static float n(float f7, float f11, InterfaceC3967k interfaceC3967k) {
        long w11 = ((C7807Z) interfaceC3967k.m(C3363y.a())).w();
        return (!((C3339s) interfaceC3967k.m(C3343t.d())).m() ? ((double) C7811b0.h(w11)) < 0.5d : ((double) C7811b0.h(w11)) > 0.5d) ? f11 : f7;
    }

    public static boolean o(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static float p(InterfaceC3967k interfaceC3967k, int i11) {
        return n(0.38f, 0.38f, interfaceC3967k);
    }

    public static float q(InterfaceC3967k interfaceC3967k) {
        return n(1.0f, 0.87f, interfaceC3967k);
    }

    public static float r(InterfaceC3967k interfaceC3967k) {
        return n(0.74f, 0.6f, interfaceC3967k);
    }

    public static long s(long j11, long j12) {
        long j13 = j11 + j12;
        if ((j11 ^ j13) >= 0 || (j11 ^ j12) < 0) {
            return j13;
        }
        StringBuilder d11 = C2702w.d(j11, "The calculation caused an overflow: ", " + ");
        d11.append(j12);
        throw new ArithmeticException(d11.toString());
    }

    public static long t(int i11, long j11) {
        if (i11 == -1) {
            if (j11 != Long.MIN_VALUE) {
                return -j11;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + i11);
        }
        if (i11 == 0) {
            return 0L;
        }
        if (i11 == 1) {
            return j11;
        }
        long j12 = i11;
        long j13 = j11 * j12;
        if (j13 / j12 == j11) {
            return j13;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j11 + " * " + i11);
    }

    public static long u(long j11, long j12) {
        long j13 = j11 - j12;
        if ((j11 ^ j13) >= 0 || (j11 ^ j12) >= 0) {
            return j13;
        }
        StringBuilder d11 = C2702w.d(j11, "The calculation caused an overflow: ", " - ");
        d11.append(j12);
        throw new ArithmeticException(d11.toString());
    }

    public static int v(long j11) {
        if (-2147483648L > j11 || j11 > 2147483647L) {
            throw new ArithmeticException(C3173b.b(j11, "Value cannot fit in an int: "));
        }
        return (int) j11;
    }

    public static void w(org.joda.time.b bVar, int i11, int i12, int i13) {
        if (i11 < i12 || i11 > i13) {
            throw new IllegalFieldValueException(bVar.C(), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
    }

    public static void x(DateTimeFieldType dateTimeFieldType, int i11, int i12, int i13) {
        if (i11 < i12 || i11 > i13) {
            throw new IllegalFieldValueException(dateTimeFieldType, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
    }
}
