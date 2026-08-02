package t0;

import r.C2316B;
import r.C2338p;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final R.e f19483a = new R.e(new C2411h[16]);

    /* renamed from: b, reason: collision with root package name */
    public final C2316B f19484b = new C2316B(10);

    public boolean a(C2338p c2338p, InterfaceC2637x interfaceC2637x, D3.l lVar, boolean z3) {
        R.e eVar = this.f19483a;
        Object[] objArr = eVar.f5106k;
        int i = eVar.f5108m;
        boolean z5 = false;
        for (int i5 = 0; i5 < i; i5++) {
            z5 = ((C2411h) objArr[i5]).a(c2338p, interfaceC2637x, lVar, z3) || z5;
        }
        return z5;
    }

    public void b(D3.l lVar) {
        R.e eVar = this.f19483a;
        int i = eVar.f5108m;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C2411h) eVar.f5106k[i]).f19478d.f12512a == 0) {
                eVar.l(i);
            }
        }
    }
}
