package K0;

import Q2.C0375o;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextUtils;
import h0.C1989c;
import i0.AbstractC2005j;
import i0.C2003h;
import java.util.ArrayList;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final K f2792a;

    /* renamed from: b, reason: collision with root package name */
    public final r f2793b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2794c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2795d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2796e;
    public final ArrayList f;

    public L(K k5, r rVar, long j5) {
        this.f2792a = k5;
        this.f2793b = rVar;
        this.f2794c = j5;
        ArrayList arrayList = rVar.f2859h;
        float f = 0.0f;
        this.f2795d = arrayList.isEmpty() ? 0.0f : ((t) arrayList.get(0)).f2862a.f2815d.d(0);
        if (!arrayList.isEmpty()) {
            t tVar = (t) X3.m.e0(arrayList);
            f = tVar.f2862a.f2815d.d(r4.f3019g - 1) + tVar.f;
        }
        this.f2796e = f;
        this.f = rVar.f2858g;
    }

    public final V0.j a(int i) {
        r rVar = this.f2793b;
        rVar.i(i);
        int length = ((C0203h) rVar.f2853a.f5042l).f2829l.length();
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(i == length ? X3.n.N(arrayList) : F.d(i, arrayList));
        return tVar.f2862a.f2815d.f.isRtlCharAt(tVar.d(i)) ? V0.j.f5941l : V0.j.f5940k;
    }

    public final C1989c b(int i) {
        float i5;
        float i6;
        float h3;
        float h4;
        r rVar = this.f2793b;
        rVar.h(i);
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(F.d(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        int d5 = tVar.d(i);
        CharSequence charSequence = c0197b.f2816e;
        if (d5 < 0 || d5 >= charSequence.length()) {
            StringBuilder v4 = AbstractC2107A.v(d5, "offset(", ") is out of bounds [0,");
            v4.append(charSequence.length());
            v4.append(')');
            Q0.a.a(v4.toString());
        }
        L0.k kVar = c0197b.f2815d;
        Layout layout = kVar.f;
        int lineForOffset = layout.getLineForOffset(d5);
        float g5 = kVar.g(lineForOffset);
        float e3 = kVar.e(lineForOffset);
        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d5);
        if (!z3 || isRtlCharAt) {
            if (z3 && isRtlCharAt) {
                h3 = kVar.i(d5, false);
                h4 = kVar.i(d5 + 1, true);
            } else if (isRtlCharAt) {
                h3 = kVar.h(d5, false);
                h4 = kVar.h(d5 + 1, true);
            } else {
                i5 = kVar.i(d5, false);
                i6 = kVar.i(d5 + 1, true);
            }
            float f = h3;
            i5 = h4;
            i6 = f;
        } else {
            i5 = kVar.h(d5, false);
            i6 = kVar.h(d5 + 1, true);
        }
        RectF rectF = new RectF(i5, g5, i6, e3);
        return tVar.a(new C1989c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final C1989c c(int i) {
        r rVar = this.f2793b;
        rVar.i(i);
        int length = ((C0203h) rVar.f2853a.f5042l).f2829l.length();
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(i == length ? X3.n.N(arrayList) : F.d(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        int d5 = tVar.d(i);
        CharSequence charSequence = c0197b.f2816e;
        if (d5 < 0 || d5 > charSequence.length()) {
            StringBuilder v4 = AbstractC2107A.v(d5, "offset(", ") is out of bounds [0,");
            v4.append(charSequence.length());
            v4.append(']');
            Q0.a.a(v4.toString());
        }
        L0.k kVar = c0197b.f2815d;
        float h3 = kVar.h(d5, false);
        int lineForOffset = kVar.f.getLineForOffset(d5);
        return tVar.a(new C1989c(h3, kVar.g(lineForOffset), h3, kVar.e(lineForOffset)));
    }

    public final int d(int i, boolean z3) {
        int f;
        r rVar = this.f2793b;
        rVar.j(i);
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(F.e(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        int i5 = i - tVar.f2865d;
        L0.k kVar = c0197b.f2815d;
        if (z3) {
            Layout layout = kVar.f;
            L0.j jVar = L0.l.f3029a;
            if (layout.getEllipsisCount(i5) <= 0 || kVar.f3015b != TextUtils.TruncateAt.END) {
                C0375o c5 = kVar.c();
                Layout layout2 = (Layout) c5.f5042l;
                f = c5.w(layout2.getLineEnd(i5), layout2.getLineStart(i5));
            } else {
                f = layout.getEllipsisStart(i5) + layout.getLineStart(i5);
            }
        } else {
            f = kVar.f(i5);
        }
        return f + tVar.f2863b;
    }

    public final int e(int i) {
        r rVar = this.f2793b;
        int length = ((C0203h) rVar.f2853a.f5042l).f2829l.length();
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(i >= length ? X3.n.N(arrayList) : i < 0 ? 0 : F.d(i, arrayList));
        return tVar.f2862a.f2815d.f.getLineForOffset(tVar.d(i)) + tVar.f2865d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l5 = (L) obj;
        return kotlin.jvm.internal.l.a(this.f2792a, l5.f2792a) && this.f2793b.equals(l5.f2793b) && W0.l.a(this.f2794c, l5.f2794c) && this.f2795d == l5.f2795d && this.f2796e == l5.f2796e && kotlin.jvm.internal.l.a(this.f, l5.f);
    }

    public final float f(int i) {
        r rVar = this.f2793b;
        rVar.j(i);
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(F.e(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        int i5 = i - tVar.f2865d;
        L0.k kVar = c0197b.f2815d;
        return kVar.f.getLineLeft(i5) + (i5 == kVar.f3019g + (-1) ? kVar.f3021j : 0.0f);
    }

    public final float g(int i) {
        r rVar = this.f2793b;
        rVar.j(i);
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(F.e(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        int i5 = i - tVar.f2865d;
        L0.k kVar = c0197b.f2815d;
        return kVar.f.getLineRight(i5) + (i5 == kVar.f3019g + (-1) ? kVar.f3022k : 0.0f);
    }

    public final int h(int i) {
        r rVar = this.f2793b;
        rVar.j(i);
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(F.e(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        return c0197b.f2815d.f.getLineStart(i - tVar.f2865d) + tVar.f2863b;
    }

    public final int hashCode() {
        int hashCode = (this.f2793b.hashCode() + (this.f2792a.hashCode() * 31)) * 31;
        long j5 = this.f2794c;
        return this.f.hashCode() + AbstractC2107A.n(this.f2796e, AbstractC2107A.n(this.f2795d, (((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31, 31), 31);
    }

    public final V0.j i(int i) {
        r rVar = this.f2793b;
        rVar.i(i);
        int length = ((C0203h) rVar.f2853a.f5042l).f2829l.length();
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(i == length ? X3.n.N(arrayList) : F.d(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        int d5 = tVar.d(i);
        L0.k kVar = c0197b.f2815d;
        return kVar.f.getParagraphDirection(kVar.f.getLineForOffset(d5)) == 1 ? V0.j.f5940k : V0.j.f5941l;
    }

    public final C2003h j(final int i, final int i5) {
        r rVar = this.f2793b;
        C0203h c0203h = (C0203h) rVar.f2853a.f5042l;
        if (i < 0 || i > i5 || i5 > c0203h.f2829l.length()) {
            StringBuilder w5 = AbstractC2107A.w("Start(", i, ") or End(", i5, ") is out of range [0..");
            w5.append(c0203h.f2829l.length());
            w5.append("), or start > end!");
            Q0.a.a(w5.toString());
        }
        if (i == i5) {
            return AbstractC2005j.a();
        }
        final C2003h a5 = AbstractC2005j.a();
        F.g(rVar.f2859h, F.b(i, i5), new i4.c() { // from class: K0.q
            @Override // i4.c
            public final Object c(Object obj) {
                t tVar = (t) obj;
                C0197b c0197b = tVar.f2862a;
                int d5 = tVar.d(i);
                int d6 = tVar.d(i5);
                CharSequence charSequence = c0197b.f2816e;
                if (d5 < 0 || d5 > d6 || d6 > charSequence.length()) {
                    StringBuilder w6 = AbstractC2107A.w("start(", d5, ") or end(", d6, ") is out of range [0..");
                    w6.append(charSequence.length());
                    w6.append("], or start > end!");
                    Q0.a.a(w6.toString());
                }
                Path path = new Path();
                L0.k kVar = c0197b.f2815d;
                kVar.f.getSelectionPath(d5, d6, path);
                int i6 = kVar.f3020h;
                if (i6 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i6);
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(tVar.f) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                int i7 = (int) 0;
                C2003h.this.f17279a.addPath(path, Float.intBitsToFloat(i7), Float.intBitsToFloat(i7));
                return W3.o.f6046a;
            }
        });
        return a5;
    }

    public final long k(int i) {
        int l5;
        int i5;
        int j5;
        r rVar = this.f2793b;
        rVar.i(i);
        int length = ((C0203h) rVar.f2853a.f5042l).f2829l.length();
        ArrayList arrayList = rVar.f2859h;
        t tVar = (t) arrayList.get(i == length ? X3.n.N(arrayList) : F.d(i, arrayList));
        C0197b c0197b = tVar.f2862a;
        int d5 = tVar.d(i);
        M0.e j6 = c0197b.f2815d.j();
        if (j6.i(j6.l(d5))) {
            j6.b(d5);
            l5 = d5;
            while (l5 != -1 && (!j6.i(l5) || j6.e(l5))) {
                l5 = j6.l(l5);
            }
        } else {
            j6.b(d5);
            l5 = j6.h(d5) ? (!j6.f(d5) || j6.d(d5)) ? j6.l(d5) : d5 : j6.d(d5) ? j6.l(d5) : -1;
        }
        if (l5 == -1) {
            l5 = d5;
        }
        if (j6.e(j6.j(d5))) {
            j6.b(d5);
            i5 = d5;
            while (i5 != -1 && (j6.i(i5) || !j6.e(i5))) {
                i5 = j6.j(i5);
            }
        } else {
            j6.b(d5);
            if (j6.d(d5)) {
                if (!j6.f(d5) || j6.h(d5)) {
                    j5 = j6.j(d5);
                    i5 = j5;
                } else {
                    i5 = d5;
                }
            } else if (j6.h(d5)) {
                j5 = j6.j(d5);
                i5 = j5;
            } else {
                i5 = -1;
            }
        }
        if (i5 != -1) {
            d5 = i5;
        }
        return tVar.b(F.b(l5, d5), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f2792a + ", multiParagraph=" + this.f2793b + ", size=" + ((Object) W0.l.b(this.f2794c)) + ", firstBaseline=" + this.f2795d + ", lastBaseline=" + this.f2796e + ", placeholderRects=" + this.f + ')';
    }
}
