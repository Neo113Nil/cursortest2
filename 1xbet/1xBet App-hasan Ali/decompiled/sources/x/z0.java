package x;

import b4.EnumC0510a;
import c4.AbstractC0547h;
import c4.AbstractC0548i;
import h0.C1988b;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class z0 extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public int f20904l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2280u f20906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0548i f20907o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f20908p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T f20909q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z0(InterfaceC2280u interfaceC2280u, i4.f fVar, i4.c cVar, T t5, a4.c cVar2) {
        super(cVar2);
        this.f20906n = interfaceC2280u;
        this.f20907o = (AbstractC0548i) fVar;
        this.f20908p = (kotlin.jvm.internal.m) cVar;
        this.f20909q = t5;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c4.i, i4.f] */
    /* JADX WARN: Type inference failed for: r3v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        ?? r32 = this.f20908p;
        T t5 = this.f20909q;
        z0 z0Var = new z0(this.f20906n, this.f20907o, r32, t5, cVar);
        z0Var.f20905m = obj;
        return z0Var;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((t0.E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r10 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r10 == r0) goto L18;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r8v0, types: [c4.i, i4.f] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t0.E e3;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20904l;
        T t5 = this.f20909q;
        InterfaceC2280u interfaceC2280u = this.f20906n;
        if (i == 0) {
            G4.l.N(obj);
            e3 = (t0.E) this.f20905m;
            AbstractC2282w.p(interfaceC2280u, null, new v0(t5, null), 3);
            this.f20905m = e3;
            this.f20904l = 1;
            obj = Q0.b(e3, (r3 & 1) != 0, t0.k.f19490l, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                t0.s sVar = (t0.s) obj;
                if (sVar == null) {
                    AbstractC2282w.p(interfaceC2280u, null, new x0(t5, null), 3);
                } else {
                    sVar.a();
                    AbstractC2282w.p(interfaceC2280u, null, new y0(t5, null), 3);
                    this.f20908p.c(new C1988b(sVar.f19502c));
                }
                return W3.o.f6046a;
            }
            e3 = (t0.E) this.f20905m;
            G4.l.N(obj);
        }
        t0.s sVar2 = (t0.s) obj;
        sVar2.a();
        C2566L c2566l = Q0.f20706a;
        ?? r8 = this.f20907o;
        if (r8 != c2566l) {
            AbstractC2282w.p(interfaceC2280u, null, new w0(r8, t5, sVar2, null), 3);
        }
        this.f20905m = null;
        this.f20904l = 2;
        obj = Q0.d(e3, t0.k.f19490l, this);
    }
}
