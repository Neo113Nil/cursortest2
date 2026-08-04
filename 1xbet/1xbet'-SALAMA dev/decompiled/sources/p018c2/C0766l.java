package p018c2;

import A1.AbstractC0007a;
import A1.R0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p151v2.t;

/* JADX INFO: renamed from: c2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0766l extends AbstractC0007a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final HashMap f10369A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f10372f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f10373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final R0[] f10374y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object[] f10375z;

    public C0766l(ArrayList arrayList, Z z4) {
        super(z4);
        int size = arrayList.size();
        this.f10372f = new int[size];
        this.f10373x = new int[size];
        this.f10374y = new R0[size];
        this.f10375z = new Object[size];
        this.f10369A = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i7 = 0;
        while (it.hasNext()) {
            C0769o c0769o = (C0769o) it.next();
            R0[] r0Arr = this.f10374y;
            C0776w c0776w = c0769o.f10378a.f10421o;
            r0Arr[i7] = c0776w;
            this.f10373x[i7] = iO;
            this.f10372f[i7] = iH;
            iO += c0776w.f10399b.o();
            iH += this.f10374y[i7].h();
            Object[] objArr = this.f10375z;
            Object obj = c0769o.f10379b;
            objArr[i7] = obj;
            this.f10369A.put(obj, Integer.valueOf(i7));
            i7++;
        }
        this.f10370d = iO;
        this.f10371e = iH;
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
        return t.e(this.f10372f, i7 + 1, false, false);
    }

    @Override // A1.AbstractC0007a
    public final int s(int i7) {
        return t.e(this.f10373x, i7 + 1, false, false);
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
