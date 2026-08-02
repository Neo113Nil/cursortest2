package I;

import E.InterfaceC0104i0;
import b4.EnumC0510a;
import c4.AbstractC0547h;
import e2.C1930k;
import t3.AbstractC2425d;

/* renamed from: I.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167u extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public int f2528l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2529m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1930k f2530n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ B.K f2531o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f2532p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167u(C1930k c1930k, B.K k5, InterfaceC0104i0 interfaceC0104i0, a4.c cVar) {
        super(cVar);
        this.f2530n = c1930k;
        this.f2531o = k5;
        this.f2532p = interfaceC0104i0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0167u c0167u = new C0167u(this.f2530n, this.f2531o, this.f2532p, cVar);
        c0167u.f2529m = obj;
        return c0167u;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0167u) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (t3.AbstractC2425d.f(r1, r9.f2530n, r9.f2531o, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (t3.AbstractC2425d.g(r1, r9.f2532p, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0034, code lost:
    
        if (r10 == r0) goto L32;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0.E e3;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2528l;
        if (i == 0) {
            G4.l.N(obj);
            e3 = (t0.E) this.f2529m;
            this.f2529m = e3;
            this.f2528l = 1;
            obj = AbstractC2425d.e(e3, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                return W3.o.f6046a;
            }
            e3 = (t0.E) this.f2529m;
            G4.l.N(obj);
        }
        t0.j jVar = (t0.j) obj;
        if (AbstractC2425d.A(jVar) && (jVar.f19487c & 33) != 0) {
            ?? r22 = jVar.f19485a;
            int size = r22.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (!((t0.s) r22.get(i5)).b()) {
                }
            }
            this.f2529m = null;
            this.f2528l = 2;
        }
        if (!AbstractC2425d.A(jVar)) {
            this.f2529m = null;
            this.f2528l = 3;
        }
        return W3.o.f6046a;
    }
}
