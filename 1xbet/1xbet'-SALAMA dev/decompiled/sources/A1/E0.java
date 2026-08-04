package A1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class E0 extends AbstractC0007a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final HashMap f88A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f89d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f91f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f92x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final R0[] f93y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object[] f94z;

    public E0(ArrayList arrayList, p018c2.Z z4) {
        super(z4);
        int size = arrayList.size();
        this.f91f = new int[size];
        this.f92x = new int[size];
        this.f93y = new R0[size];
        this.f94z = new Object[size];
        this.f88A = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i7 = 0;
        while (it.hasNext()) {
            InterfaceC0036o0 interfaceC0036o0 = (InterfaceC0036o0) it.next();
            this.f93y[i7] = interfaceC0036o0.b();
            this.f92x[i7] = iO;
            this.f91f[i7] = iH;
            iO += this.f93y[i7].o();
            iH += this.f93y[i7].h();
            this.f94z[i7] = interfaceC0036o0.a();
            this.f88A.put(this.f94z[i7], Integer.valueOf(i7));
            i7++;
        }
        this.f89d = iO;
        this.f90e = iH;
    }

    @Override // A1.R0
    public final int h() {
        return this.f90e;
    }

    @Override // A1.R0
    public final int o() {
        return this.f89d;
    }

    @Override // A1.AbstractC0007a
    public final int q(Object obj) {
        Integer num = (Integer) this.f88A.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // A1.AbstractC0007a
    public final int r(int i7) {
        return p151v2.t.e(this.f91f, i7 + 1, false, false);
    }

    @Override // A1.AbstractC0007a
    public final int s(int i7) {
        return p151v2.t.e(this.f92x, i7 + 1, false, false);
    }

    @Override // A1.AbstractC0007a
    public final Object t(int i7) {
        return this.f94z[i7];
    }

    @Override // A1.AbstractC0007a
    public final int u(int i7) {
        return this.f91f[i7];
    }

    @Override // A1.AbstractC0007a
    public final int v(int i7) {
        return this.f92x[i7];
    }

    @Override // A1.AbstractC0007a
    public final R0 y(int i7) {
        return this.f93y[i7];
    }
}
