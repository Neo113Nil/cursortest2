package G4;

import java.util.HashMap;
import java.util.Iterator;
import k4.C1343e;
import w1.V0;

/* renamed from: G4.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0289w implements Y {

    /* renamed from: c, reason: collision with root package name */
    public int f3040c;

    /* renamed from: f, reason: collision with root package name */
    public final C0288v f3043f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3038a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final V0 f3039b = new V0(11);

    /* renamed from: d, reason: collision with root package name */
    public H4.n f3041d = H4.n.f3332b;

    /* renamed from: e, reason: collision with root package name */
    public long f3042e = 0;

    public C0289w(C0288v c0288v) {
        this.f3043f = c0288v;
    }

    @Override // G4.Y
    public final void a(C1343e c1343e, int i7) {
        V0 v02 = this.f3039b;
        v02.getClass();
        Iterator it = c1343e.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                break;
            }
            C0270c c0270c = new C0270c((H4.h) f7.next(), i7);
            v02.f17562b = ((C1343e) v02.f17562b).l(c0270c);
            v02.f17563c = ((C1343e) v02.f17563c).l(c0270c);
        }
        C c3 = this.f3043f.f3037i;
        Iterator it2 = c1343e.iterator();
        while (true) {
            E3.F f8 = (E3.F) it2;
            if (!((Iterator) f8.f1994b).hasNext()) {
                return;
            } else {
                c3.s((H4.h) f8.next());
            }
        }
    }

    @Override // G4.Y
    public final void b(Z z4) {
        this.f3038a.put(z4.f2953a, z4);
        int i7 = this.f3040c;
        int i8 = z4.f2954b;
        if (i8 > i7) {
            this.f3040c = i8;
        }
        long j = this.f3042e;
        long j3 = z4.f2955c;
        if (j3 > j) {
            this.f3042e = j3;
        }
    }

    @Override // G4.Y
    public final void c(Z z4) {
        b(z4);
    }

    @Override // G4.Y
    public final void d(C1343e c1343e, int i7) {
        V0 v02 = this.f3039b;
        v02.getClass();
        Iterator it = c1343e.iterator();
        while (true) {
            E3.F f7 = (E3.F) it;
            if (!((Iterator) f7.f1994b).hasNext()) {
                break;
            }
            C0270c c0270c = new C0270c((H4.h) f7.next(), i7);
            v02.f17562b = ((C1343e) v02.f17562b).t(c0270c);
            v02.f17563c = ((C1343e) v02.f17563c).t(c0270c);
        }
        C c3 = this.f3043f.f3037i;
        Iterator it2 = c1343e.iterator();
        while (true) {
            E3.F f8 = (E3.F) it2;
            if (!((Iterator) f8.f1994b).hasNext()) {
                return;
            } else {
                c3.q((H4.h) f8.next());
            }
        }
    }

    @Override // G4.Y
    public final int e() {
        return this.f3040c;
    }

    @Override // G4.Y
    public final C1343e f(int i7) {
        return this.f3039b.T(i7);
    }

    @Override // G4.Y
    public final H4.n g() {
        return this.f3041d;
    }

    @Override // G4.Y
    public final void h(H4.n nVar) {
        this.f3041d = nVar;
    }

    @Override // G4.Y
    public final void i(int i7) {
        this.f3039b.W(i7);
    }

    @Override // G4.Y
    public final Z j(E4.I i7) {
        return (Z) this.f3038a.get(i7);
    }
}
