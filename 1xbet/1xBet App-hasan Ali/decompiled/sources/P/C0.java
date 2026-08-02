package P;

import K0.C0196a;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.List;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class C0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public A0.P0 f4254k;

    /* renamed from: l, reason: collision with root package name */
    public int f4255l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4256m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F0 f4257n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E0 f4258o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0281a0 f4259p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(F0 f02, E0 e02, InterfaceC0281a0 interfaceC0281a0, a4.c cVar) {
        super(2, cVar);
        this.f4257n = f02;
        this.f4258o = e02;
        this.f4259p = interfaceC0281a0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0 c02 = new C0(this.f4257n, this.f4258o, this.f4259p, cVar);
        c02.f4256m = obj;
        return c02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s4.M m5;
        Object obj2;
        V.b bVar;
        p4.U u5;
        Throwable th;
        A0.P0 p02;
        F0 f02;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f4255l;
        if (i == 0) {
            G4.l.N(obj);
            p4.U j5 = AbstractC2282w.j(((InterfaceC2280u) this.f4256m).i());
            F0.v(this.f4257n, j5);
            A0.P0 j6 = Z.q.j(new C0196a(3, this.f4257n));
            Z z3 = this.f4257n.f4310w;
            try {
                do {
                    m5 = F0.f4288x;
                    obj2 = (S.b) m5.getValue();
                    bVar = (V.b) obj2;
                    U.c cVar = bVar.f5920m;
                    if (!cVar.containsKey(z3)) {
                        boolean isEmpty = bVar.isEmpty();
                        W.b bVar2 = W.b.f5999a;
                        if (isEmpty) {
                            bVar = new V.b(z3, z3, cVar.a(z3, new V.a(bVar2, bVar2)));
                        } else {
                            Object obj3 = bVar.f5919l;
                            Object obj4 = cVar.get(obj3);
                            kotlin.jvm.internal.l.c(obj4);
                            bVar = new V.b(bVar.f5918k, z3, cVar.a(obj3, new V.a(((V.a) obj4).f5915a, z3)).a(z3, new V.a(obj3, bVar2)));
                        }
                    }
                    if (obj2 != bVar) {
                        Object obj5 = t4.c.f19596b;
                        if (obj2 == null) {
                            obj2 = obj5;
                        }
                    }
                    break;
                } while (!m5.j(obj2, bVar));
                break;
                List u6 = F0.u(this.f4257n);
                int size = u6.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((C0327y) u6.get(i5)).s();
                }
                B0 b02 = new B0(this.f4258o, this.f4259p, null);
                this.f4256m = j5;
                this.f4254k = j6;
                this.f4255l = 1;
                if (AbstractC2282w.e(b02, this) == enumC0510a) {
                    return enumC0510a;
                }
                u5 = j5;
                p02 = j6;
            } catch (Throwable th2) {
                u5 = j5;
                th = th2;
                p02 = j6;
                p02.a();
                f02 = this.f4257n;
                synchronized (f02.f4291b) {
                    try {
                        if (f02.f4292c == u5) {
                            f02.f4292c = null;
                        }
                        f02.y();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                s4.M m6 = F0.f4288x;
                Z.b(this.f4257n.f4310w);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p02 = this.f4254k;
            u5 = (p4.U) this.f4256m;
            try {
                G4.l.N(obj);
            } catch (Throwable th4) {
                th = th4;
                p02.a();
                f02 = this.f4257n;
                synchronized (f02.f4291b) {
                }
            }
        }
        p02.a();
        F0 f03 = this.f4257n;
        synchronized (f03.f4291b) {
            try {
                if (f03.f4292c == u5) {
                    f03.f4292c = null;
                }
                f03.y();
            } catch (Throwable th5) {
                throw th5;
            }
        }
        s4.M m7 = F0.f4288x;
        Z.b(this.f4257n.f4310w);
        return W3.o.f6046a;
    }
}
