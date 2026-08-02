package e2;

import A1.X;
import E4.y;
import F1.m;
import F1.s;
import F1.v;
import android.util.SparseArray;
import d6.C0977k;
import v2.AbstractC1664a;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007d implements m {

    /* renamed from: A, reason: collision with root package name */
    public static final y f12583A = new y();

    /* renamed from: a, reason: collision with root package name */
    public final F1.k f12584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12585b;

    /* renamed from: c, reason: collision with root package name */
    public final X f12586c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f12587d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f12588e;

    /* renamed from: f, reason: collision with root package name */
    public C0977k f12589f;

    /* renamed from: x, reason: collision with root package name */
    public long f12590x;

    /* renamed from: y, reason: collision with root package name */
    public s f12591y;

    /* renamed from: z, reason: collision with root package name */
    public X[] f12592z;

    public C1007d(F1.k kVar, int i7, X x4) {
        this.f12584a = kVar;
        this.f12585b = i7;
        this.f12586c = x4;
    }

    public final void a(C0977k c0977k, long j, long j3) {
        this.f12589f = c0977k;
        this.f12590x = j3;
        boolean z4 = this.f12588e;
        F1.k kVar = this.f12584a;
        if (!z4) {
            kVar.e(this);
            if (j != -9223372036854775807L) {
                kVar.g(0L, j);
            }
            this.f12588e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        kVar.g(0L, j);
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f12587d;
            if (i7 >= sparseArray.size()) {
                return;
            }
            C1006c c1006c = (C1006c) sparseArray.valueAt(i7);
            if (c0977k == null) {
                c1006c.f12581e = c1006c.f12579c;
            } else {
                c1006c.f12582f = j3;
                v t7 = c0977k.t(c1006c.f12577a);
                c1006c.f12581e = t7;
                X x4 = c1006c.f12580d;
                if (x4 != null) {
                    t7.a(x4);
                }
            }
            i7++;
        }
    }

    @Override // F1.m
    public final void m(s sVar) {
        this.f12591y = sVar;
    }

    @Override // F1.m
    public final void n() {
        SparseArray sparseArray = this.f12587d;
        X[] xArr = new X[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            X x4 = ((C1006c) sparseArray.valueAt(i7)).f12580d;
            AbstractC1664a.i(x4);
            xArr[i7] = x4;
        }
        this.f12592z = xArr;
    }

    @Override // F1.m
    public final v r(int i7, int i8) {
        SparseArray sparseArray = this.f12587d;
        C1006c c1006c = (C1006c) sparseArray.get(i7);
        if (c1006c == null) {
            AbstractC1664a.h(this.f12592z == null);
            c1006c = new C1006c(i7, i8, i8 == this.f12585b ? this.f12586c : null);
            C0977k c0977k = this.f12589f;
            long j = this.f12590x;
            if (c0977k == null) {
                c1006c.f12581e = c1006c.f12579c;
            } else {
                c1006c.f12582f = j;
                v t7 = c0977k.t(i8);
                c1006c.f12581e = t7;
                X x4 = c1006c.f12580d;
                if (x4 != null) {
                    t7.a(x4);
                }
            }
            sparseArray.put(i7, c1006c);
        }
        return c1006c;
    }
}
