package K0;

import A0.o1;
import K0.C0196a;
import Q2.C0375o;
import X3.C0442b;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import h0.C1989c;
import h0.C1991e;
import i0.AbstractC1998c;
import i0.InterfaceC2009n;
import java.util.ArrayList;
import k0.AbstractC2024d;
import k4.AbstractC2036a;

/* renamed from: K0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197b {

    /* renamed from: a, reason: collision with root package name */
    public final S0.d f2812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2813b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2814c;

    /* renamed from: d, reason: collision with root package name */
    public final L0.k f2815d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f2816e;
    public final Object f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0197b(S0.d dVar, int i, int i5, long j5) {
        int i6;
        int i7;
        CharSequence charSequence;
        O o5;
        int i8;
        O o6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c5;
        int i18;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        L0.k a5;
        int i19;
        C0197b c0197b;
        int i20;
        L0.k kVar;
        U0.b[] bVarArr;
        CharSequence charSequence2;
        Object obj;
        C1989c c1989c;
        float h3;
        int i21;
        Layout layout;
        int i22;
        this.f2812a = dVar;
        this.f2813b = i;
        this.f2814c = j5;
        if (W0.a.i(j5) != 0 || W0.a.j(j5) != 0) {
            Q0.a.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            Q0.a.a("maxLines should be greater than 0");
        }
        boolean z3 = i5 == 2;
        O o7 = dVar.f5255l;
        CharSequence charSequence3 = dVar.f5261r;
        if (z3) {
            i6 = 1;
            i7 = 0;
            charSequence = charSequence3;
            if (!W0.o.a(o7.f2805a.f2770h, AbstractC2036a.H(0))) {
                charSequence = charSequence3;
                if (!W0.o.a(o7.f2805a.f2770h, W0.o.f6021c)) {
                    int i23 = o7.f2806b.f2871a;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    charSequence = charSequence3;
                    if (i23 != Integer.MIN_VALUE && i23 != 5 && i23 != 4) {
                        int length = charSequence3.length();
                        charSequence = charSequence3;
                        if (length != 0) {
                            Spannable spannable = charSequence3 instanceof Spannable ? (Spannable) charSequence3 : null;
                            Spannable spannableString = spannable == null ? new SpannableString(charSequence3) : spannable;
                            boolean f = L0.h.f(spannableString, N0.c.class);
                            charSequence = spannableString;
                            if (!f) {
                                spannableString.setSpan(new N0.c(), spannableString.length() - 1, spannableString.length() - 1, 33);
                                charSequence = spannableString;
                            }
                        }
                    }
                }
            }
        } else {
            i6 = 1;
            i7 = 0;
            charSequence = charSequence3;
        }
        CharSequence charSequence4 = charSequence;
        this.f2816e = charSequence4;
        w wVar = o7.f2806b;
        int i24 = wVar.f2871a;
        int i25 = i24 == i6 ? 3 : i24 == 2 ? 4 : i24 == 3 ? 2 : (i24 != 5 && i24 == 6) ? 1 : i7;
        int i26 = i24 == 4 ? 1 : i7;
        if (wVar.f2877h != 2) {
            o5 = o7;
            i8 = i7;
        } else if (Build.VERSION.SDK_INT <= 32) {
            o5 = o7;
            i8 = 2;
        } else {
            o5 = o7;
            i8 = 4;
        }
        int i27 = wVar.f2876g;
        int i28 = i27 & 255;
        if (i28 != 1) {
            if (i28 == 2) {
                o6 = o5;
                i9 = 1;
            } else if (i28 == 3) {
                o6 = o5;
                i9 = 2;
            }
            i10 = (i27 >> 8) & 255;
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 1;
                } else if (i10 == 3) {
                    i11 = 2;
                } else if (i10 == 4) {
                    i11 = 3;
                }
                i12 = (i27 >> 16) & 255;
                if (i12 == 1) {
                    i13 = 2;
                } else {
                    i13 = 2;
                    if (i12 == 2) {
                        i14 = 1;
                        if (i5 != i13) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i5 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else {
                            if (i5 != 4) {
                                int i29 = i11;
                                i15 = 5;
                                i16 = i29;
                                i17 = 4;
                                c5 = ' ';
                                i18 = i14;
                                truncateAt = null;
                                a5 = a(i25, i26, truncateAt, i, i8, i9, i16, i18, charSequence4);
                                if (Build.VERSION.SDK_INT < 35 && dVar.f5260q.getLetterSpacing() != 0.0f && (i5 == i17 || i5 == i15)) {
                                    layout = a5.f;
                                    i22 = i7;
                                    if (layout.getEllipsisCount(i22) > 0) {
                                        int ellipsisStart = layout.getEllipsisStart(i22);
                                        int ellipsisCount = layout.getEllipsisCount(i22) + ellipsisStart;
                                        CharSequence subSequence = charSequence4.subSequence(i22, ellipsisStart);
                                        CharSequence subSequence2 = charSequence4.subSequence(ellipsisCount, charSequence4.length());
                                        CharSequence[] charSequenceArr = new CharSequence[3];
                                        charSequenceArr[i22] = subSequence;
                                        charSequenceArr[1] = "…";
                                        i19 = 2;
                                        charSequenceArr[2] = subSequence2;
                                        c0197b = this;
                                        i20 = i;
                                        a5 = c0197b.a(i25, i26, truncateAt, i20, i8, i9, i16, i18, TextUtils.concat(charSequenceArr));
                                        if (i5 == i19 || a5.a() <= W0.a.g(j5) || i20 <= 1) {
                                            c0197b.f2815d = a5;
                                        } else {
                                            int g5 = W0.a.g(j5);
                                            int i30 = 0;
                                            while (true) {
                                                i21 = a5.f3019g;
                                                if (i30 >= i21) {
                                                    break;
                                                }
                                                if (a5.e(i30) > g5) {
                                                    i21 = i30;
                                                    break;
                                                }
                                                i30++;
                                            }
                                            if (i21 >= 0 && i21 != c0197b.f2813b) {
                                                a5 = c0197b.a(i25, i26, truncateAt, i21 < 1 ? 1 : i21, i8, i9, i16, i18, c0197b.f2816e);
                                            }
                                            c0197b.f2815d = a5;
                                        }
                                        S0.d dVar2 = c0197b.f2812a;
                                        G g6 = o6.f2805a;
                                        dVar2.f5260q.c(g6.f2764a.d(), (Float.floatToRawIntBits(c0197b.b()) & 4294967295L) | (Float.floatToRawIntBits(c0197b.d()) << c5), g6.f2764a.a());
                                        kVar = c0197b.f2815d;
                                        if (kVar.f.getText() instanceof Spanned) {
                                            Layout layout2 = kVar.f;
                                            CharSequence text = layout2.getText();
                                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.text.Spanned", text);
                                            Spanned spanned = (Spanned) text;
                                            if (spanned.nextSpanTransition(-1, spanned.length(), U0.b.class) != spanned.length()) {
                                                CharSequence text2 = layout2.getText();
                                                kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.text.Spanned", text2);
                                                bVarArr = (U0.b[]) ((Spanned) text2).getSpans(0, layout2.getText().length(), U0.b.class);
                                                if (bVarArr != null) {
                                                    C0442b i31 = kotlin.jvm.internal.l.i(bVarArr);
                                                    while (i31.hasNext()) {
                                                        ((U0.b) i31.next()).f5847c.setValue(new C1991e((Float.floatToRawIntBits(c0197b.b()) & 4294967295L) | (Float.floatToRawIntBits(c0197b.d()) << c5)));
                                                    }
                                                }
                                                charSequence2 = c0197b.f2816e;
                                                if (charSequence2 instanceof Spanned) {
                                                    Spanned spanned2 = (Spanned) charSequence2;
                                                    Object[] spans = spanned2.getSpans(0, charSequence2.length(), N0.i.class);
                                                    ArrayList arrayList = new ArrayList(spans.length);
                                                    for (Object obj2 : spans) {
                                                        N0.i iVar = (N0.i) obj2;
                                                        int spanStart = spanned2.getSpanStart(iVar);
                                                        int spanEnd = spanned2.getSpanEnd(iVar);
                                                        int lineForOffset = c0197b.f2815d.f.getLineForOffset(spanStart);
                                                        boolean z5 = lineForOffset >= c0197b.f2813b;
                                                        boolean z6 = c0197b.f2815d.f.getEllipsisCount(lineForOffset) > 0 && spanEnd > c0197b.f2815d.f.getEllipsisStart(lineForOffset);
                                                        boolean z7 = spanEnd > c0197b.f2815d.f(lineForOffset);
                                                        if (z6 || z7 || z5) {
                                                            c1989c = null;
                                                        } else {
                                                            int ordinal = (c0197b.f2815d.f.isRtlCharAt(spanStart) ? V0.j.f5941l : V0.j.f5940k).ordinal();
                                                            if (ordinal == 0) {
                                                                h3 = c0197b.f2815d.h(spanStart, false);
                                                            } else {
                                                                if (ordinal != 1) {
                                                                    throw new D2.e();
                                                                }
                                                                float h4 = c0197b.f2815d.h(spanStart, false);
                                                                if (!iVar.f3738d) {
                                                                    Q0.a.b("PlaceholderSpan is not laid out yet.");
                                                                }
                                                                h3 = h4 - iVar.f3736b;
                                                            }
                                                            if (!iVar.f3738d) {
                                                                Q0.a.b("PlaceholderSpan is not laid out yet.");
                                                            }
                                                            float d5 = c0197b.f2815d.d(lineForOffset) - iVar.b();
                                                            c1989c = new C1989c(h3, d5, iVar.f3736b + h3, iVar.b() + d5);
                                                        }
                                                        arrayList.add(c1989c);
                                                    }
                                                    obj = arrayList;
                                                } else {
                                                    obj = X3.v.f6090k;
                                                }
                                                c0197b.f = obj;
                                            }
                                        }
                                        bVarArr = null;
                                        if (bVarArr != null) {
                                        }
                                        charSequence2 = c0197b.f2816e;
                                        if (charSequence2 instanceof Spanned) {
                                        }
                                        c0197b.f = obj;
                                    }
                                }
                                i19 = 2;
                                c0197b = this;
                                i20 = i;
                                if (i5 == i19) {
                                }
                                c0197b.f2815d = a5;
                                S0.d dVar22 = c0197b.f2812a;
                                G g62 = o6.f2805a;
                                dVar22.f5260q.c(g62.f2764a.d(), (Float.floatToRawIntBits(c0197b.b()) & 4294967295L) | (Float.floatToRawIntBits(c0197b.d()) << c5), g62.f2764a.a());
                                kVar = c0197b.f2815d;
                                if (kVar.f.getText() instanceof Spanned) {
                                }
                                bVarArr = null;
                                if (bVarArr != null) {
                                }
                                charSequence2 = c0197b.f2816e;
                                if (charSequence2 instanceof Spanned) {
                                }
                                c0197b.f = obj;
                            }
                            truncateAt2 = TextUtils.TruncateAt.START;
                        }
                        i18 = i14;
                        truncateAt = truncateAt2;
                        i17 = 4;
                        int i32 = i11;
                        i15 = 5;
                        i16 = i32;
                        c5 = ' ';
                        a5 = a(i25, i26, truncateAt, i, i8, i9, i16, i18, charSequence4);
                        if (Build.VERSION.SDK_INT < 35) {
                            layout = a5.f;
                            i22 = i7;
                            if (layout.getEllipsisCount(i22) > 0) {
                            }
                        }
                        i19 = 2;
                        c0197b = this;
                        i20 = i;
                        if (i5 == i19) {
                        }
                        c0197b.f2815d = a5;
                        S0.d dVar222 = c0197b.f2812a;
                        G g622 = o6.f2805a;
                        dVar222.f5260q.c(g622.f2764a.d(), (Float.floatToRawIntBits(c0197b.b()) & 4294967295L) | (Float.floatToRawIntBits(c0197b.d()) << c5), g622.f2764a.a());
                        kVar = c0197b.f2815d;
                        if (kVar.f.getText() instanceof Spanned) {
                        }
                        bVarArr = null;
                        if (bVarArr != null) {
                        }
                        charSequence2 = c0197b.f2816e;
                        if (charSequence2 instanceof Spanned) {
                        }
                        c0197b.f = obj;
                    }
                }
                i14 = i7;
                if (i5 != i13) {
                }
                i18 = i14;
                truncateAt = truncateAt2;
                i17 = 4;
                int i322 = i11;
                i15 = 5;
                i16 = i322;
                c5 = ' ';
                a5 = a(i25, i26, truncateAt, i, i8, i9, i16, i18, charSequence4);
                if (Build.VERSION.SDK_INT < 35) {
                }
                i19 = 2;
                c0197b = this;
                i20 = i;
                if (i5 == i19) {
                }
                c0197b.f2815d = a5;
                S0.d dVar2222 = c0197b.f2812a;
                G g6222 = o6.f2805a;
                dVar2222.f5260q.c(g6222.f2764a.d(), (Float.floatToRawIntBits(c0197b.b()) & 4294967295L) | (Float.floatToRawIntBits(c0197b.d()) << c5), g6222.f2764a.a());
                kVar = c0197b.f2815d;
                if (kVar.f.getText() instanceof Spanned) {
                }
                bVarArr = null;
                if (bVarArr != null) {
                }
                charSequence2 = c0197b.f2816e;
                if (charSequence2 instanceof Spanned) {
                }
                c0197b.f = obj;
            }
            i11 = i7;
            i12 = (i27 >> 16) & 255;
            if (i12 == 1) {
            }
            i14 = i7;
            if (i5 != i13) {
            }
            i18 = i14;
            truncateAt = truncateAt2;
            i17 = 4;
            int i3222 = i11;
            i15 = 5;
            i16 = i3222;
            c5 = ' ';
            a5 = a(i25, i26, truncateAt, i, i8, i9, i16, i18, charSequence4);
            if (Build.VERSION.SDK_INT < 35) {
            }
            i19 = 2;
            c0197b = this;
            i20 = i;
            if (i5 == i19) {
            }
            c0197b.f2815d = a5;
            S0.d dVar22222 = c0197b.f2812a;
            G g62222 = o6.f2805a;
            dVar22222.f5260q.c(g62222.f2764a.d(), (Float.floatToRawIntBits(c0197b.b()) & 4294967295L) | (Float.floatToRawIntBits(c0197b.d()) << c5), g62222.f2764a.a());
            kVar = c0197b.f2815d;
            if (kVar.f.getText() instanceof Spanned) {
            }
            bVarArr = null;
            if (bVarArr != null) {
            }
            charSequence2 = c0197b.f2816e;
            if (charSequence2 instanceof Spanned) {
            }
            c0197b.f = obj;
        }
        o6 = o5;
        i9 = i7;
        i10 = (i27 >> 8) & 255;
        if (i10 != 1) {
        }
        i11 = i7;
        i12 = (i27 >> 16) & 255;
        if (i12 == 1) {
        }
        i14 = i7;
        if (i5 != i13) {
        }
        i18 = i14;
        truncateAt = truncateAt2;
        i17 = 4;
        int i32222 = i11;
        i15 = 5;
        i16 = i32222;
        c5 = ' ';
        a5 = a(i25, i26, truncateAt, i, i8, i9, i16, i18, charSequence4);
        if (Build.VERSION.SDK_INT < 35) {
        }
        i19 = 2;
        c0197b = this;
        i20 = i;
        if (i5 == i19) {
        }
        c0197b.f2815d = a5;
        S0.d dVar222222 = c0197b.f2812a;
        G g622222 = o6.f2805a;
        dVar222222.f5260q.c(g622222.f2764a.d(), (Float.floatToRawIntBits(c0197b.b()) & 4294967295L) | (Float.floatToRawIntBits(c0197b.d()) << c5), g622222.f2764a.a());
        kVar = c0197b.f2815d;
        if (kVar.f.getText() instanceof Spanned) {
        }
        bVarArr = null;
        if (bVarArr != null) {
        }
        charSequence2 = c0197b.f2816e;
        if (charSequence2 instanceof Spanned) {
        }
        c0197b.f = obj;
    }

    public final L0.k a(int i, int i5, TextUtils.TruncateAt truncateAt, int i6, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        y yVar;
        float d5 = d();
        S0.d dVar = this.f2812a;
        S0.a aVar = S0.b.f5252a;
        z zVar = dVar.f5255l.f2807c;
        return new L0.k(charSequence, d5, dVar.f5260q, i, truncateAt, dVar.f5265v, (zVar == null || (yVar = zVar.f2881a) == null) ? false : yVar.f2880a, i6, i8, i9, i10, i7, i5, dVar.f5262s);
    }

    public final float b() {
        return this.f2815d.a();
    }

    /* JADX WARN: Type inference failed for: r13v25, types: [L0.a] */
    public final long c(C1989c c1989c, int i, o1 o1Var) {
        M0.d bVar;
        int i5;
        int[] iArr;
        SegmentFinder k5;
        RectF t5 = i0.F.t(c1989c);
        boolean z3 = i != 0 && i == 1;
        final C0196a c0196a = new C0196a(0, o1Var);
        int i6 = Build.VERSION.SDK_INT;
        L0.k kVar = this.f2815d;
        TextPaint textPaint = kVar.f3014a;
        Layout layout = kVar.f;
        if (i6 >= 34) {
            if (z3) {
                k5 = new M0.a(new v3.g(6, layout.getText(), kVar.j()));
            } else {
                G.q.q();
                k5 = G.q.k(G.q.j(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(t5, k5, new Layout.TextInclusionStrategy() { // from class: L0.a
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) C0196a.this.invoke(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            C0375o c5 = kVar.c();
            if (z3) {
                bVar = new v3.g(6, layout.getText(), kVar.j());
            } else {
                CharSequence text = layout.getText();
                bVar = i6 >= 29 ? new M0.b(text, textPaint) : new M0.c(text);
            }
            M0.d dVar = bVar;
            int lineForVertical = layout.getLineForVertical((int) t5.top);
            if (t5.top <= kVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < kVar.f3019g) {
                int i7 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) t5.bottom);
                if (lineForVertical2 != 0 || t5.bottom >= kVar.g(0)) {
                    int e3 = L0.h.e(kVar, layout, c5, i7, t5, dVar, c0196a, true);
                    while (true) {
                        i5 = i7;
                        if (e3 != -1 || i5 >= lineForVertical2) {
                            break;
                        }
                        i7 = i5 + 1;
                        e3 = L0.h.e(kVar, layout, c5, i7, t5, dVar, c0196a, true);
                    }
                    if (e3 != -1) {
                        int i8 = lineForVertical2;
                        int e5 = L0.h.e(kVar, layout, c5, i8, t5, dVar, c0196a, false);
                        while (e5 == -1 && i5 < i8) {
                            i8--;
                            e5 = L0.h.e(kVar, layout, c5, i8, t5, dVar, c0196a, false);
                        }
                        if (e5 != -1) {
                            iArr = new int[]{dVar.f(e3 + 1), dVar.g(e5 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? N.f2801b : F.b(iArr[0], iArr[1]);
    }

    public final float d() {
        return W0.a.h(this.f2814c);
    }

    public final void e(InterfaceC2009n interfaceC2009n) {
        Canvas a5 = AbstractC1998c.a(interfaceC2009n);
        L0.k kVar = this.f2815d;
        if (kVar.f3017d) {
            a5.save();
            a5.clipRect(0.0f, 0.0f, d(), b());
        }
        if (a5.getClipBounds(kVar.f3027p)) {
            int i = kVar.f3020h;
            if (i != 0) {
                a5.translate(0.0f, i);
            }
            L0.j jVar = L0.l.f3029a;
            jVar.f3013a = a5;
            kVar.f.draw(jVar);
            if (i != 0) {
                a5.translate(0.0f, (-1) * i);
            }
        }
        if (kVar.f3017d) {
            a5.restore();
        }
    }

    public final void f(InterfaceC2009n interfaceC2009n, long j5, i0.I i, V0.l lVar, AbstractC2024d abstractC2024d) {
        S0.f fVar = this.f2812a.f5260q;
        int i5 = fVar.f5270c;
        fVar.d(j5);
        fVar.f(i);
        fVar.g(lVar);
        fVar.e(abstractC2024d);
        fVar.b(3);
        e(interfaceC2009n);
        fVar.b(i5);
    }

    public final void g(InterfaceC2009n interfaceC2009n, i0.F f, float f5, i0.I i, V0.l lVar, AbstractC2024d abstractC2024d) {
        S0.f fVar = this.f2812a.f5260q;
        int i5 = fVar.f5270c;
        float d5 = d();
        float b3 = b();
        fVar.c(f, (Float.floatToRawIntBits(b3) & 4294967295L) | (Float.floatToRawIntBits(d5) << 32), f5);
        fVar.f(i);
        fVar.g(lVar);
        fVar.e(abstractC2024d);
        fVar.b(3);
        e(interfaceC2009n);
        fVar.b(i5);
    }
}
