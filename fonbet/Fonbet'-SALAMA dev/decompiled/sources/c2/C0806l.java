package c2;

import A1.AbstractC0007a;
import A1.R0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: c2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806l extends AbstractC0007a {

    /* renamed from: A, reason: collision with root package name */
    public final HashMap f10369A;

    /* renamed from: d, reason: collision with root package name */
    public final int f10370d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10371e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f10372f;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f10373x;

    /* renamed from: y, reason: collision with root package name */
    public final R0[] f10374y;

    /* renamed from: z, reason: collision with root package name */
    public final Object[] f10375z;

    public C0806l(ArrayList arrayList, Z z4) {
        super(z4);
        int size = arrayList.size();
        this.f10372f = new int[size];
        this.f10373x = new int[size];
        this.f10374y = new R0[size];
        this.f10375z = new Object[size];
        this.f10369A = new HashMap();
        Iterator it = arrayList.iterator();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            C0809o c0809o = (C0809o) it.next();
            R0[] r0Arr = this.f10374y;
            C0816w c0816w = c0809o.f10378a.f10421o;
            r0Arr[i9] = c0816w;
            this.f10373x[i9] = i7;
            this.f10372f[i9] = i8;
            i7 += c0816w.f10399b.o();
            i8 += this.f10374y[i9].h();
            Object[] objArr = this.f10375z;
            Object obj = c0809o.f10379b;
            objArr[i9] = obj;
            this.f10369A.put(obj, Integer.valueOf(i9));
            i9++;
        }
        this.f10370d = i7;
        this.f10371e = i8;
    }

    @Override // A1.R0
    public final int h() {
        return this.f10371e;
    }

    @Override // A1.R0
    public final int o() {
        return this.f10370d;
    }

    @Override // A1.AbstractC0007a
    public final int q(Object obj) {
        Integer num = (Integer) this.f10369A.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // A1.AbstractC0007a
    public final int r(int i7) {
        return v2.t.e(this.f10372f, i7 + 1, false, false);
    }

    @Override // A1.AbstractC0007a
    public final int s(int i7) {
        return v2.t.e(this.f10373x, i7 + 1, false, false);
    }

    @Override // A1.AbstractC0007a
    public final Object t(int i7) {
        return this.f10375z[i7];
    }

    @Override // A1.AbstractC0007a
    public final int u(int i7) {
        return this.f10372f[i7];
    }

    @Override // A1.AbstractC0007a
    public final int v(int i7) {
        return this.f10373x[i7];
    }

    @Override // A1.AbstractC0007a
    public final R0 y(int i7) {
        return this.f10374y[i7];
    }
}
