package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1407p {
    public static final /* synthetic */ int K = 0;

    /* renamed from: A, reason: collision with root package name */
    public final C1242lE f14885A;

    /* renamed from: B, reason: collision with root package name */
    public final int f14886B;

    /* renamed from: C, reason: collision with root package name */
    public final int f14887C;

    /* renamed from: D, reason: collision with root package name */
    public final int f14888D;

    /* renamed from: E, reason: collision with root package name */
    public final int f14889E;

    /* renamed from: F, reason: collision with root package name */
    public final int f14890F;

    /* renamed from: G, reason: collision with root package name */
    public final int f14891G;

    /* renamed from: H, reason: collision with root package name */
    public final int f14892H;

    /* renamed from: I, reason: collision with root package name */
    public final int f14893I;
    public int J;

    /* renamed from: a, reason: collision with root package name */
    public final String f14894a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14895b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1044gv f14896c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14897d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14898e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14899g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14900h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14901j;

    /* renamed from: k, reason: collision with root package name */
    public final C5 f14902k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14903l;

    /* renamed from: m, reason: collision with root package name */
    public final String f14904m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14905n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14906o;

    /* renamed from: p, reason: collision with root package name */
    public final List f14907p;

    /* renamed from: q, reason: collision with root package name */
    public final C1334nG f14908q;

    /* renamed from: r, reason: collision with root package name */
    public final long f14909r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f14910s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14911t;

    /* renamed from: u, reason: collision with root package name */
    public final int f14912u;

    /* renamed from: v, reason: collision with root package name */
    public final float f14913v;

    /* renamed from: w, reason: collision with root package name */
    public final int f14914w;

    /* renamed from: x, reason: collision with root package name */
    public final float f14915x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f14916y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14917z;

    static {
        new C1407p(new C1649uH());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    public C1407p(C1649uH c1649uH) {
        boolean z3;
        String str;
        this.f14894a = c1649uH.f15839a;
        String a5 = AbstractC1260lo.a(c1649uH.f15842d);
        this.f14897d = a5;
        if (c1649uH.f15841c.isEmpty() && c1649uH.f15840b != null) {
            this.f14896c = AbstractC1044gv.n(new L(a5, c1649uH.f15840b));
            this.f14895b = c1649uH.f15840b;
        } else if (c1649uH.f15841c.isEmpty() || c1649uH.f15840b != null) {
            if (!c1649uH.f15841c.isEmpty() || c1649uH.f15840b != null) {
                for (int i = 0; i < c1649uH.f15841c.size(); i++) {
                    if (!((L) c1649uH.f15841c.get(i)).f10290b.equals(c1649uH.f15840b)) {
                    }
                }
                z3 = false;
                AbstractC1668us.a0(z3);
                this.f14896c = c1649uH.f15841c;
                this.f14895b = c1649uH.f15840b;
            }
            z3 = true;
            AbstractC1668us.a0(z3);
            this.f14896c = c1649uH.f15841c;
            this.f14895b = c1649uH.f15840b;
        } else {
            AbstractC1044gv abstractC1044gv = c1649uH.f15841c;
            this.f14896c = abstractC1044gv;
            Iterator it = abstractC1044gv.iterator();
            while (true) {
                C0954ev c0954ev = (C0954ev) it;
                if (!c0954ev.hasNext()) {
                    str = ((L) abstractC1044gv.get(0)).f10290b;
                    break;
                }
                L l5 = (L) c0954ev.next();
                if (TextUtils.equals(l5.f10289a, a5)) {
                    str = l5.f10290b;
                    break;
                }
            }
            this.f14895b = str;
        }
        this.f14898e = c1649uH.f15843e;
        this.f = c1649uH.f;
        int i5 = c1649uH.f15844g;
        this.f14899g = i5;
        int i6 = c1649uH.f15845h;
        this.f14900h = i6;
        this.i = i6 != -1 ? i6 : i5;
        this.f14901j = c1649uH.i;
        this.f14902k = c1649uH.f15846j;
        this.f14903l = c1649uH.f15847k;
        this.f14904m = c1649uH.f15848l;
        this.f14905n = c1649uH.f15849m;
        this.f14906o = c1649uH.f15850n;
        List list = c1649uH.f15851o;
        this.f14907p = list == null ? Collections.EMPTY_LIST : list;
        C1334nG c1334nG = c1649uH.f15852p;
        this.f14908q = c1334nG;
        this.f14909r = c1649uH.f15853q;
        this.f14910s = c1649uH.f15854r;
        this.f14911t = c1649uH.f15855s;
        this.f14912u = c1649uH.f15856t;
        this.f14913v = c1649uH.f15857u;
        int i7 = c1649uH.f15858v;
        this.f14914w = i7 == -1 ? 0 : i7;
        float f = c1649uH.f15859w;
        this.f14915x = f == -1.0f ? 1.0f : f;
        this.f14916y = c1649uH.f15860x;
        this.f14917z = c1649uH.f15861y;
        this.f14885A = c1649uH.f15862z;
        this.f14886B = c1649uH.f15831A;
        this.f14887C = c1649uH.f15832B;
        this.f14888D = c1649uH.f15833C;
        int i8 = c1649uH.f15834D;
        this.f14889E = i8 == -1 ? 0 : i8;
        int i9 = c1649uH.f15835E;
        this.f14890F = i9 != -1 ? i9 : 0;
        this.f14891G = c1649uH.f15836F;
        this.f14892H = c1649uH.f15837G;
        int i10 = c1649uH.f15838H;
        if (i10 != 0 || c1334nG == null) {
            this.f14893I = i10;
        } else {
            this.f14893I = 1;
        }
    }

    public final C1649uH a() {
        return new C1649uH(this);
    }

    public final boolean b(C1407p c1407p) {
        List list = this.f14907p;
        if (list.size() != c1407p.f14907p.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c1407p.f14907p.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1407p.class != obj.getClass()) {
            return false;
        }
        C1407p c1407p = (C1407p) obj;
        int i5 = this.J;
        return (i5 == 0 || (i = c1407p.J) == 0 || i5 == i) && this.f14898e == c1407p.f14898e && this.f == c1407p.f && this.f14899g == c1407p.f14899g && this.f14900h == c1407p.f14900h && this.f14905n == c1407p.f14905n && this.f14909r == c1407p.f14909r && this.f14911t == c1407p.f14911t && this.f14912u == c1407p.f14912u && this.f14914w == c1407p.f14914w && this.f14917z == c1407p.f14917z && this.f14886B == c1407p.f14886B && this.f14887C == c1407p.f14887C && this.f14888D == c1407p.f14888D && this.f14889E == c1407p.f14889E && this.f14890F == c1407p.f14890F && this.f14891G == c1407p.f14891G && this.f14893I == c1407p.f14893I && Float.compare(this.f14913v, c1407p.f14913v) == 0 && Float.compare(this.f14915x, c1407p.f14915x) == 0 && Objects.equals(this.f14894a, c1407p.f14894a) && Objects.equals(this.f14895b, c1407p.f14895b) && this.f14896c.equals(c1407p.f14896c) && Objects.equals(this.f14901j, c1407p.f14901j) && Objects.equals(this.f14903l, c1407p.f14903l) && Objects.equals(this.f14904m, c1407p.f14904m) && Objects.equals(this.f14897d, c1407p.f14897d) && Arrays.equals(this.f14916y, c1407p.f14916y) && Objects.equals(this.f14902k, c1407p.f14902k) && Objects.equals(this.f14885A, c1407p.f14885A) && Objects.equals(this.f14908q, c1407p.f14908q) && b(c1407p);
    }

    public final int hashCode() {
        int i = this.J;
        if (i != 0) {
            return i;
        }
        String str = this.f14894a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f14895b;
        int hashCode2 = this.f14896c.hashCode() + ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f14897d;
        int hashCode3 = ((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f14898e) * 31) + this.f) * 961) + this.f14899g) * 31) + this.f14900h) * 31;
        String str4 = this.f14901j;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C5 c5 = this.f14902k;
        int hashCode5 = (hashCode4 + (c5 == null ? 0 : c5.hashCode())) * 961;
        String str5 = this.f14903l;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int n5 = ((((((((((((((((((AbstractC2107A.n(this.f14915x, (AbstractC2107A.n(this.f14913v, (((((((((hashCode6 + (this.f14904m != null ? r1.hashCode() : 0)) * 31) + this.f14905n) * 31) + ((int) this.f14909r)) * 31) + this.f14911t) * 31) + this.f14912u) * 31, 31) + this.f14914w) * 31, 31) + this.f14917z) * 31) + this.f14886B) * 31) + this.f14887C) * 31) + this.f14888D) * 31) + this.f14889E) * 31) + this.f14890F) * 31) + this.f14891G) * 31) - 1) * 31) - 1) * 31) + this.f14893I;
        this.J = n5;
        return n5;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14885A);
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f14894a);
        sb.append(", ");
        sb.append(this.f14895b);
        sb.append(", ");
        sb.append(this.f14903l);
        sb.append(", ");
        sb.append(this.f14904m);
        sb.append(", ");
        sb.append(this.f14901j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.f14897d);
        sb.append(", [");
        sb.append(this.f14911t);
        sb.append(", ");
        sb.append(this.f14912u);
        sb.append(", ");
        sb.append(this.f14913v);
        sb.append(", ");
        sb.append(valueOf);
        sb.append("], [");
        sb.append(this.f14886B);
        sb.append(", ");
        return L1.a.o(sb, this.f14887C, "])");
    }
}
