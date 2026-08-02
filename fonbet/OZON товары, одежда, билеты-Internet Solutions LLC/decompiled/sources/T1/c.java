package T1;

import K1.C3422b;
import K1.C3424d;
import K1.D;
import K1.T;
import N1.g;
import N1.h;
import N1.j;
import N1.k;
import N1.l;
import P1.A;
import P1.AbstractC3809p;
import P1.B;
import P1.F;
import V1.f;
import V1.i;
import V1.m;
import Z1.u;
import Z1.v;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import fd.InterfaceC6512o;
import hd.C6915b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k1.C7459e;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7811b0;
import l1.F0;
import l1.H0;
import l1.K0;
import n1.AbstractC8413f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {
    private static final float a(long j11, float f7, Z1.d dVar) {
        float e11;
        long d11 = u.d(j11);
        if (v.b(d11, 4294967296L)) {
            if (dVar.u1() <= 1.05d) {
                return dVar.Z0(j11);
            }
            e11 = u.e(j11) / u.e(dVar.r(f7));
        } else {
            if (!v.b(d11, 8589934592L)) {
                return Float.NaN;
            }
            e11 = u.e(j11);
        }
        return e11 * f7;
    }

    public static final void b(@NotNull Spannable spannable, long j11, int i11, int i12) {
        if (j11 != 16) {
            f(spannable, new ForegroundColorSpan(C7811b0.i(j11)), i11, i12);
        }
    }

    public static final void c(@NotNull Spannable spannable, long j11, @NotNull Z1.d dVar, int i11, int i12) {
        long d11 = u.d(j11);
        if (v.b(d11, 4294967296L)) {
            f(spannable, new AbsoluteSizeSpan(C6915b.c(dVar.Z0(j11)), false), i11, i12);
        } else if (v.b(d11, 8589934592L)) {
            f(spannable, new RelativeSizeSpan(u.e(j11)), i11, i12);
        }
    }

    public static final void d(@NotNull Spannable spannable, long j11, float f7, @NotNull Z1.d dVar, @NotNull f fVar) {
        float a11 = a(j11, f7, dVar);
        if (Float.isNaN(a11)) {
            return;
        }
        spannable.setSpan(new h(a11, (spannable.length() == 0 || kotlin.text.h.M(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), (fVar.c() & 1) > 0, (fVar.c() & 16) > 0, fVar.b()), 0, spannable.length(), 33);
    }

    public static final void e(@NotNull Spannable spannable, long j11, float f7, @NotNull Z1.d dVar) {
        float a11 = a(j11, f7, dVar);
        if (Float.isNaN(a11)) {
            return;
        }
        spannable.setSpan(new g(a11), 0, spannable.length(), 33);
    }

    public static final void f(@NotNull Spannable spannable, @NotNull Object obj, int i11, int i12) {
        spannable.setSpan(obj, i11, i12, 33);
    }

    public static final void g(@NotNull Spannable spannable, @NotNull T t2, @NotNull List<C3422b.C0288b<D>> list, @NotNull Z1.d dVar, @NotNull InterfaceC6512o<? super AbstractC3809p, ? super F, ? super A, ? super B, ? extends Typeface> interfaceC6512o) {
        long j11;
        i iVar;
        i iVar2;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C3422b.C0288b<D> c0288b = list.get(i12);
            C3422b.C0288b<D> c0288b2 = c0288b;
            if (d.a(c0288b2.f()) || c0288b2.f().l() != null) {
                arrayList.add(c0288b);
            }
        }
        D d11 = (d.a(t2.H()) || t2.k() != null) ? new D(0L, 0L, t2.l(), t2.j(), t2.k(), t2.h(), (String) null, 0L, (V1.a) null, (m) null, (R1.c) null, 0L, (i) null, (H0) null, 65475) : null;
        b bVar = new b(spannable, interfaceC6512o);
        if (arrayList.size() > 1) {
            int size2 = arrayList.size();
            int i13 = size2 * 2;
            Integer[] numArr = new Integer[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                numArr[i14] = 0;
            }
            int size3 = arrayList.size();
            for (int i15 = 0; i15 < size3; i15++) {
                C3422b.C0288b c0288b3 = (C3422b.C0288b) arrayList.get(i15);
                numArr[i15] = Integer.valueOf(c0288b3.g());
                numArr[i15 + size2] = Integer.valueOf(c0288b3.e());
            }
            Integer[] numArr2 = numArr;
            Intrinsics.checkNotNullParameter(numArr2, "<this>");
            if (numArr2.length > 1) {
                Arrays.sort(numArr2);
            }
            int intValue = ((Number) C7705l.C(numArr)).intValue();
            int i16 = 0;
            while (i16 < i13) {
                Integer num = numArr[i16];
                int intValue2 = num.intValue();
                if (intValue2 != intValue) {
                    int size4 = arrayList.size();
                    D d12 = d11;
                    for (int i17 = i11; i17 < size4; i17++) {
                        C3422b.C0288b c0288b4 = (C3422b.C0288b) arrayList.get(i17);
                        if (c0288b4.g() != c0288b4.e() && C3424d.f(intValue, intValue2, c0288b4.g(), c0288b4.e())) {
                            D d13 = (D) c0288b4.f();
                            d12 = d12 == null ? d13 : d12.x(d13);
                        }
                    }
                    if (d12 != null) {
                        bVar.invoke(d12, Integer.valueOf(intValue), num);
                    }
                    intValue = intValue2;
                }
                i16++;
                i11 = 0;
            }
        } else if (!arrayList.isEmpty()) {
            D d14 = (D) ((C3422b.C0288b) arrayList.get(0)).f();
            if (d11 != null) {
                d14 = d11.x(d14);
            }
            bVar.invoke(d14, Integer.valueOf(((C3422b.C0288b) arrayList.get(0)).g()), Integer.valueOf(((C3422b.C0288b) arrayList.get(0)).e()));
        }
        int size5 = list.size();
        int i18 = 0;
        boolean z11 = false;
        while (true) {
            j11 = 4294967296L;
            if (i18 >= size5) {
                break;
            }
            C3422b.C0288b<D> c0288b5 = list.get(i18);
            int g10 = c0288b5.g();
            int e11 = c0288b5.e();
            if (g10 >= 0 && g10 < spannable.length() && e11 > g10 && e11 <= spannable.length()) {
                int g11 = c0288b5.g();
                int e12 = c0288b5.e();
                D f7 = c0288b5.f();
                V1.a d15 = f7.d();
                if (d15 != null) {
                    spannable.setSpan(new N1.a(d15.b()), g11, e12, 33);
                }
                b(spannable, f7.f(), g11, e12);
                AbstractC7799Q e13 = f7.e();
                float b11 = f7.b();
                if (e13 != null) {
                    if (e13 instanceof K0) {
                        b(spannable, ((K0) e13).a(), g11, e12);
                    } else {
                        spannable.setSpan(new U1.b((F0) e13, b11), g11, e12, 33);
                    }
                }
                i r11 = f7.r();
                if (r11 != null) {
                    iVar = i.f27916c;
                    boolean d16 = r11.d(iVar);
                    iVar2 = i.f27917d;
                    spannable.setSpan(new l(d16, r11.d(iVar2)), g11, e12, 33);
                }
                c(spannable, f7.j(), dVar, g11, e12);
                String i19 = f7.i();
                if (i19 != null) {
                    spannable.setSpan(new N1.b(i19), g11, e12, 33);
                }
                m t11 = f7.t();
                if (t11 != null) {
                    spannable.setSpan(new ScaleXSpan(t11.b()), g11, e12, 33);
                    spannable.setSpan(new k(t11.c()), g11, e12, 33);
                }
                R1.c o11 = f7.o();
                if (o11 != null) {
                    f(spannable, a.f26504a.a(o11), g11, e12);
                }
                long c11 = f7.c();
                if (c11 != 16) {
                    f(spannable, new BackgroundColorSpan(C7811b0.i(c11)), g11, e12);
                }
                H0 q11 = f7.q();
                if (q11 != null) {
                    int i21 = C7811b0.i(q11.c());
                    float g12 = C7459e.g(q11.d());
                    float h11 = C7459e.h(q11.d());
                    float b12 = q11.b();
                    if (b12 == 0.0f) {
                        b12 = Float.MIN_VALUE;
                    }
                    spannable.setSpan(new j(g12, h11, b12, i21), g11, e12, 33);
                }
                AbstractC8413f g13 = f7.g();
                if (g13 != null) {
                    spannable.setSpan(new U1.a(g13), g11, e12, 33);
                }
                D f11 = c0288b5.f();
                if (v.b(u.d(f11.n()), 4294967296L) || v.b(u.d(f11.n()), 8589934592L)) {
                    z11 = true;
                }
            }
            i18++;
        }
        if (z11) {
            int size6 = list.size();
            int i22 = 0;
            while (i22 < size6) {
                C3422b.C0288b<D> c0288b6 = list.get(i22);
                int g14 = c0288b6.g();
                int e14 = c0288b6.e();
                D f12 = c0288b6.f();
                if (g14 >= 0 && g14 < spannable.length() && e14 > g14 && e14 <= spannable.length()) {
                    long n11 = f12.n();
                    long d17 = u.d(n11);
                    Object fVar = v.b(d17, j11) ? new N1.f(dVar.Z0(n11)) : v.b(d17, 8589934592L) ? new N1.e(u.e(n11)) : null;
                    if (fVar != null) {
                        spannable.setSpan(fVar, g14, e14, 33);
                    }
                }
                i22++;
                j11 = 4294967296L;
            }
        }
    }
}
