package x;

import A0.C0022e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: x.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2558D extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20609k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20611m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t0.v f20612n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E.w0 f20613o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.K f20614p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2559E f20615q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2559E f20616r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0022e0 f20617s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2558D(C2589k0 c2589k0, t0.v vVar, E.w0 w0Var, i0.K k5, C2559E c2559e, C2559E c2559e2, C0022e0 c0022e0, a4.c cVar) {
        super(2, cVar);
        this.f20611m = c2589k0;
        this.f20612n = vVar;
        this.f20613o = w0Var;
        this.f20614p = k5;
        this.f20615q = c2559e;
        this.f20616r = c2559e2;
        this.f20617s = c0022e0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2559E c2559e = this.f20616r;
        C0022e0 c0022e0 = this.f20617s;
        C2558D c2558d = new C2558D(this.f20611m, this.f20612n, this.f20613o, this.f20614p, this.f20615q, c2559e, c0022e0, cVar);
        c2558d.f20610l = obj;
        return c2558d;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2558D) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [p4.u] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, p4.u] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6, types: [p4.u] */
    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        ?? r1 = this.f20609k;
        W3.o oVar = W3.o.f6046a;
        C2589k0 c2589k0 = this.f20611m;
        try {
            if (r1 == 0) {
                G4.l.N(obj);
                r1 = (InterfaceC2280u) this.f20610l;
                P p5 = c2589k0.f20799A;
                t0.v vVar = this.f20612n;
                E.w0 w0Var = this.f20613o;
                i0.K k5 = this.f20614p;
                C2559E c2559e = this.f20615q;
                C2559E c2559e2 = this.f20616r;
                C0022e0 c0022e0 = this.f20617s;
                this.f20610l = r1;
                this.f20609k = 1;
                float f = AbstractC2557C.f20606a;
                Object b3 = v.r.b(vVar, new C2555A(c2559e2, new kotlin.jvm.internal.v(), p5, w0Var, c0022e0, c2559e, k5, null), this);
                if (b3 != enumC0510a) {
                    b3 = oVar;
                }
                if (b3 == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r1 = (InterfaceC2280u) this.f20610l;
                G4.l.N(obj);
            }
        } catch (CancellationException e3) {
            r4.c cVar = c2589k0.f20803E;
            if (cVar != null) {
                cVar.q(r.f20857a);
            }
            if (!AbstractC2282w.o(r1)) {
                throw e3;
            }
        }
        return oVar;
    }
}
