package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class JE extends AbstractC0715Xa {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f9915k = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f9916b;

    /* renamed from: c, reason: collision with root package name */
    public final PG f9917c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9918d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9919e;
    public final int[] f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f9920g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0715Xa[] f9921h;
    public final Object[] i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f9922j;

    public JE(AbstractC0715Xa[] abstractC0715XaArr, Object[] objArr, PG pg) {
        this.f9917c = pg;
        this.f9916b = pg.f11078b.length;
        this.f9921h = abstractC0715XaArr;
        int length = abstractC0715XaArr.length;
        this.f = new int[length];
        this.f9920g = new int[length];
        this.i = objArr;
        this.f9922j = new HashMap();
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i < abstractC0715XaArr.length) {
            AbstractC0715Xa abstractC0715Xa = abstractC0715XaArr[i];
            this.f9921h[i7] = abstractC0715Xa;
            this.f9920g[i7] = i5;
            this.f[i7] = i6;
            i5 += abstractC0715Xa.c();
            i6 += this.f9921h[i7].b();
            this.f9922j.put(objArr[i7], Integer.valueOf(i7));
            i++;
            i7++;
        }
        this.f9918d = i5;
        this.f9919e = i6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int a(Object obj) {
        int a5;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.f9922j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (a5 = this.f9921h[intValue].a(obj3)) != -1) {
                return this.f[intValue] + a5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int b() {
        return this.f9919e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int c() {
        return this.f9918d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C1785xa d(int i, C1785xa c1785xa, boolean z3) {
        int[] iArr = this.f;
        int i5 = AbstractC1260lo.i(iArr, i + 1, false, false);
        int i6 = this.f9920g[i5];
        this.f9921h[i5].d(i - iArr[i5], c1785xa, z3);
        c1785xa.f16290c += i6;
        if (z3) {
            Object obj = this.i[i5];
            Object obj2 = c1785xa.f16289b;
            obj2.getClass();
            c1785xa.f16289b = Pair.create(obj, obj2);
        }
        return c1785xa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C0603Ha e(int i, C0603Ha c0603Ha, long j5) {
        int[] iArr = this.f9920g;
        int i5 = AbstractC1260lo.i(iArr, i + 1, false, false);
        int i6 = iArr[i5];
        int i7 = this.f[i5];
        this.f9921h[i5].e(i - i6, c0603Ha, j5);
        Object obj = this.i[i5];
        if (!C0603Ha.f9395m.equals(c0603Ha.f9397a)) {
            obj = Pair.create(obj, c0603Ha.f9397a);
        }
        c0603Ha.f9397a = obj;
        c0603Ha.f9405k += i7;
        c0603Ha.f9406l += i7;
        return c0603Ha;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final Object f(int i) {
        int[] iArr = this.f;
        int i5 = AbstractC1260lo.i(iArr, i + 1, false, false);
        return Pair.create(this.i[i5], this.f9921h[i5].f(i - iArr[i5]));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int g(boolean z3) {
        if (this.f9916b != 0) {
            int i = 0;
            if (z3) {
                int[] iArr = this.f9917c.f11078b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                AbstractC0715Xa[] abstractC0715XaArr = this.f9921h;
                if (!abstractC0715XaArr[i].o()) {
                    return abstractC0715XaArr[i].g(z3) + this.f9920g[i];
                }
                i = p(i, z3);
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int h(boolean z3) {
        int i;
        int i5 = this.f9916b;
        if (i5 != 0) {
            if (z3) {
                int[] iArr = this.f9917c.f11078b;
                int length = iArr.length;
                i = length > 0 ? iArr[length - 1] : -1;
            } else {
                i = i5 - 1;
            }
            do {
                AbstractC0715Xa[] abstractC0715XaArr = this.f9921h;
                if (!abstractC0715XaArr[i].o()) {
                    return abstractC0715XaArr[i].h(z3) + this.f9920g[i];
                }
                i = q(i, z3);
            } while (i != -1);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int j(int i, int i5, boolean z3) {
        int[] iArr = this.f9920g;
        int i6 = AbstractC1260lo.i(iArr, i + 1, false, false);
        int i7 = iArr[i6];
        AbstractC0715Xa[] abstractC0715XaArr = this.f9921h;
        int j5 = abstractC0715XaArr[i6].j(i - i7, i5 != 2 ? i5 : 0, z3);
        if (j5 != -1) {
            return i7 + j5;
        }
        int p5 = p(i6, z3);
        while (p5 != -1 && abstractC0715XaArr[p5].o()) {
            p5 = p(p5, z3);
        }
        if (p5 != -1) {
            return abstractC0715XaArr[p5].g(z3) + iArr[p5];
        }
        if (i5 == 2) {
            return g(z3);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final int k(int i) {
        int[] iArr = this.f9920g;
        int i5 = AbstractC1260lo.i(iArr, i + 1, false, false);
        int i6 = iArr[i5];
        AbstractC0715Xa[] abstractC0715XaArr = this.f9921h;
        int k5 = abstractC0715XaArr[i5].k(i - i6);
        if (k5 != -1) {
            return i6 + k5;
        }
        int q5 = q(i5, false);
        while (q5 != -1 && abstractC0715XaArr[q5].o()) {
            q5 = q(q5, false);
        }
        if (q5 == -1) {
            return -1;
        }
        return abstractC0715XaArr[q5].h(false) + iArr[q5];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0715Xa
    public final C1785xa n(Object obj, C1785xa c1785xa) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f9922j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.f9920g[intValue];
        this.f9921h[intValue].n(obj3, c1785xa);
        c1785xa.f16290c += i;
        c1785xa.f16289b = obj;
        return c1785xa;
    }

    public final int p(int i, boolean z3) {
        if (!z3) {
            if (i >= this.f9916b - 1) {
                return -1;
            }
            return i + 1;
        }
        PG pg = this.f9917c;
        int i5 = pg.f11079c[i] + 1;
        int[] iArr = pg.f11078b;
        if (i5 < iArr.length) {
            return iArr[i5];
        }
        return -1;
    }

    public final int q(int i, boolean z3) {
        if (!z3) {
            if (i <= 0) {
                return -1;
            }
            return i - 1;
        }
        PG pg = this.f9917c;
        int i5 = pg.f11079c[i] - 1;
        if (i5 >= 0) {
            return pg.f11078b[i5];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JE(List list, PG pg) {
        this(r0, r1, pg);
        AbstractC0715Xa[] abstractC0715XaArr = new AbstractC0715Xa[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        int i5 = 0;
        while (it.hasNext()) {
            abstractC0715XaArr[i5] = ((InterfaceC1736wE) it.next()).a();
            i5++;
        }
        Object[] objArr = new Object[list.size()];
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((InterfaceC1736wE) it2.next()).d();
            i++;
        }
    }
}
