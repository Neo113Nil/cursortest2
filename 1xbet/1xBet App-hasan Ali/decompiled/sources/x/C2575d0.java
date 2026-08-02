package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: x.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2575d0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20751k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20752l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f20753m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2575d0(C2589k0 c2589k0, long j5, a4.c cVar) {
        super(2, cVar);
        this.f20752l = c2589k0;
        this.f20753m = j5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2575d0(this.f20752l, this.f20753m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2575d0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r9 != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r9 == r0) goto L25;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20751k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        C2604s0 c2604s0 = this.f20752l.f20810N;
        this.f20751k = 1;
        P p5 = c2604s0.f20866d;
        P p6 = P.f20696l;
        long j5 = this.f20753m;
        long a5 = p5 == p6 ? W0.q.a(j5, 0.0f, 0.0f, 1) : W0.q.a(j5, 0.0f, 0.0f, 2);
        C2601q0 c2601q0 = new C2601q0(c2604s0, null);
        v.k0 k0Var = c2604s0.f20864b;
        if (k0Var == null || !(c2604s0.f20863a.c() || c2604s0.f20863a.a())) {
            C2601q0 c2601q02 = new C2601q0(c2601q0.f20856n, this);
            c2601q02.f20855m = a5;
            invokeSuspend = c2601q02.invokeSuspend(oVar);
        } else {
            invokeSuspend = k0Var.e(a5, c2601q0, this);
        }
    }
}
