package S1;

import K1.AbstractC3429i;
import K1.C3422b;
import K1.D;
import K1.V;
import K1.W;
import P1.A;
import P1.AbstractC3809p;
import P1.B;
import P1.C3799f;
import P1.F;
import P1.I;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137 A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpannableString a(@NotNull C3422b c3422b, @NotNull Z1.d dVar, @NotNull AbstractC3809p.a aVar, @NotNull r rVar) {
        R1.c o11;
        long c11;
        V1.i iVar;
        V1.i iVar2;
        F f7;
        SpannableString spannableString = new SpannableString(c3422b.h());
        List<C3422b.C0288b<D>> f11 = c3422b.f();
        if (f11 != null) {
            int size = f11.size();
            for (int i11 = 0; i11 < size; i11++) {
                C3422b.C0288b<D> c0288b = f11.get(i11);
                D a11 = c0288b.a();
                int b11 = c0288b.b();
                int c12 = c0288b.c();
                D a12 = D.a(a11);
                T1.c.b(spannableString, a12.f(), b11, c12);
                T1.c.c(spannableString, a12.j(), dVar, b11, c12);
                if (a12.m() != null || a12.k() != null) {
                    F m11 = a12.m();
                    if (m11 == null) {
                        m11 = F.f21509g;
                    }
                    A k11 = a12.k();
                    spannableString.setSpan(new StyleSpan(C3799f.c(m11, k11 != null ? k11.b() : 0)), b11, c12, 33);
                }
                if (a12.h() != null) {
                    if (a12.h() instanceof I) {
                        spannableString.setSpan(new TypefaceSpan(((I) a12.h()).e()), b11, c12, 33);
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        AbstractC3809p h11 = a12.h();
                        B l11 = a12.l();
                        int b12 = l11 != null ? l11.b() : 1;
                        f7 = F.f21509g;
                        Object value = aVar.a(h11, f7, 0, b12).getValue();
                        Intrinsics.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
                        spannableString.setSpan(h.f25658a.a((Typeface) value), b11, c12, 33);
                        if (a12.r() != null) {
                            V1.i r11 = a12.r();
                            iVar = V1.i.f27916c;
                            if (r11.d(iVar)) {
                                spannableString.setSpan(new UnderlineSpan(), b11, c12, 33);
                            }
                            V1.i r12 = a12.r();
                            iVar2 = V1.i.f27917d;
                            if (r12.d(iVar2)) {
                                spannableString.setSpan(new StrikethroughSpan(), b11, c12, 33);
                            }
                        }
                        if (a12.t() != null) {
                            spannableString.setSpan(new ScaleXSpan(a12.t().b()), b11, c12, 33);
                        }
                        o11 = a12.o();
                        if (o11 != null) {
                            T1.c.f(spannableString, T1.a.f26504a.a(o11), b11, c12);
                        }
                        c11 = a12.c();
                        if (c11 == 16) {
                            T1.c.f(spannableString, new BackgroundColorSpan(C7811b0.i(c11)), b11, c12);
                        }
                    }
                }
                if (a12.r() != null) {
                }
                if (a12.t() != null) {
                }
                o11 = a12.o();
                if (o11 != null) {
                }
                c11 = a12.c();
                if (c11 == 16) {
                }
            }
        }
        List i12 = c3422b.i(c3422b.length());
        int size2 = i12.size();
        for (int i13 = 0; i13 < size2; i13++) {
            C3422b.C0288b c0288b2 = (C3422b.C0288b) i12.get(i13);
            spannableString.setSpan(T1.e.a((V) c0288b2.a()), c0288b2.b(), c0288b2.c(), 33);
        }
        List j11 = c3422b.j(c3422b.length());
        int size3 = j11.size();
        for (int i14 = 0; i14 < size3; i14++) {
            C3422b.C0288b c0288b3 = (C3422b.C0288b) j11.get(i14);
            spannableString.setSpan(rVar.c((W) c0288b3.a()), c0288b3.b(), c0288b3.c(), 33);
        }
        List b13 = c3422b.b(c3422b.length());
        int size4 = b13.size();
        for (int i15 = 0; i15 < size4; i15++) {
            C3422b.C0288b<AbstractC3429i> c0288b4 = (C3422b.C0288b) b13.get(i15);
            if (c0288b4.g() != c0288b4.e()) {
                AbstractC3429i f12 = c0288b4.f();
                if ((f12 instanceof AbstractC3429i.b) && f12.a() == null) {
                    AbstractC3429i f13 = c0288b4.f();
                    Intrinsics.g(f13, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    spannableString.setSpan(rVar.b(new C3422b.C0288b<>(c0288b4.g(), c0288b4.e(), (AbstractC3429i.b) f13)), c0288b4.g(), c0288b4.e(), 33);
                } else {
                    spannableString.setSpan(rVar.a(c0288b4), c0288b4.g(), c0288b4.e(), 33);
                }
            }
        }
        return spannableString;
    }
}
