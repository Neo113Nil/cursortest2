package S1;

import K1.C3422b;
import K1.C3427g;
import K1.C3442w;
import K1.C3443x;
import K1.D;
import K1.T;
import K1.y;
import P1.A;
import P1.AbstractC3809p;
import P1.B;
import P1.F;
import Z1.u;
import Z1.v;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LeadingMarginSpan;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final a f25633a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25634b = 0;

    public static final class a extends CharacterStyle {
        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
        }
    }

    @NotNull
    public static final CharSequence a(@NotNull String str, float f7, @NotNull T t2, @NotNull List<C3422b.C0288b<D>> list, @NotNull List<C3422b.C0288b<C3442w>> list2, @NotNull Z1.d dVar, @NotNull InterfaceC6512o<? super AbstractC3809p, ? super F, ? super A, ? super B, ? extends Typeface> interfaceC6512o, boolean z11) {
        String str2;
        CharSequence charSequence;
        V1.i iVar;
        int i11;
        int i12;
        int i13;
        y a11;
        V1.o oVar;
        y a12;
        int i14 = 0;
        if (z11 && androidx.emoji2.text.j.j()) {
            K1.A s11 = t2.s();
            C3427g a13 = (s11 == null || (a12 = s11.a()) == null) ? null : C3427g.a(a12.b());
            str2 = str;
            charSequence = androidx.emoji2.text.j.c().n(0, str.length(), (a13 != null && a13.c() == 2) ? 1 : 0, str2);
            Intrinsics.f(charSequence);
        } else {
            str2 = str;
            charSequence = str2;
        }
        if (list.isEmpty() && list2.isEmpty()) {
            V1.o y11 = t2.y();
            oVar = V1.o.f27926c;
            if (Intrinsics.d(y11, oVar) && Hj0.T.e(t2.o())) {
                return charSequence;
            }
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        V1.i w11 = t2.w();
        iVar = V1.i.f27916c;
        if (Intrinsics.d(w11, iVar)) {
            T1.c.f(spannableString, f25633a, 0, str2.length());
        }
        K1.A s12 = t2.s();
        if (((s12 == null || (a11 = s12.a()) == null) ? false : a11.c()) && t2.p() == null) {
            T1.c.e(spannableString, t2.o(), f7, dVar);
        } else {
            V1.f p11 = t2.p();
            if (p11 == null) {
                p11 = V1.f.f27907c;
            }
            T1.c.d(spannableString, t2.o(), f7, dVar, p11);
        }
        V1.o y12 = t2.y();
        if (y12 != null) {
            i11 = 2;
            i12 = 1;
            if ((!u.c(y12.b(), Hj0.T.d(0)) || !u.c(y12.c(), Hj0.T.d(0))) && !Hj0.T.e(y12.b()) && !Hj0.T.e(y12.c())) {
                long d11 = u.d(y12.b());
                float Z02 = v.b(d11, 4294967296L) ? dVar.Z0(y12.b()) : v.b(d11, 8589934592L) ? u.e(y12.b()) * f7 : 0.0f;
                long d12 = u.d(y12.c());
                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(Z02), (int) Math.ceil(v.b(d12, 4294967296L) ? dVar.Z0(y12.c()) : v.b(d12, 8589934592L) ? u.e(y12.c()) * f7 : 0.0f)), 0, spannableString.length(), 33);
            }
        } else {
            i11 = 2;
            i12 = 1;
        }
        T1.c.g(spannableString, t2, list, dVar, interfaceC6512o);
        int size = list2.size();
        int i15 = 0;
        while (i15 < size) {
            C3422b.C0288b<C3442w> c0288b = list2.get(i15);
            C3442w a14 = c0288b.a();
            int b11 = c0288b.b();
            int c11 = c0288b.c();
            int i16 = i11;
            Object[] spans = spannableString.getSpans(b11, c11, androidx.emoji2.text.p.class);
            int i17 = i12;
            int length = spans.length;
            while (i14 < length) {
                spannableString.removeSpan((androidx.emoji2.text.p) spans[i14]);
                i14++;
            }
            a14.getClass();
            float e11 = u.e(0L);
            long d13 = u.d(0L);
            int i18 = v.b(d13, 4294967296L) ? 0 : v.b(d13, 8589934592L) ? i17 : i16;
            float e12 = u.e(0L);
            long d14 = u.d(0L);
            int i19 = v.b(d14, 4294967296L) ? 0 : v.b(d14, 8589934592L) ? i17 : i16;
            float g10 = dVar.g() * dVar.u1();
            if (C3443x.a(i17)) {
                i13 = 0;
            } else if (C3443x.a(i16)) {
                i13 = i17;
            } else {
                int i21 = 3;
                if (C3443x.a(3)) {
                    i13 = i16;
                } else {
                    int i22 = 4;
                    if (!C3443x.a(4)) {
                        i21 = 5;
                        if (!C3443x.a(5)) {
                            i22 = 6;
                            if (!C3443x.a(6)) {
                                if (!C3443x.a(7)) {
                                    throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                                }
                            }
                        }
                        i13 = i22;
                    }
                    i13 = i21;
                }
            }
            spannableString.setSpan(new N1.i(e11, e12, g10, i18, i19, i13), b11, c11, 33);
            i15++;
            i12 = i17;
            i14 = 0;
            i11 = i16;
        }
        return spannableString;
    }
}
