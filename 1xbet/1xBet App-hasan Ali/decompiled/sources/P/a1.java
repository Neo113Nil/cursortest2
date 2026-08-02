package P;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class a1 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f4440k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4441l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a4.h f4442m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s4.y f4443n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(a4.h hVar, s4.y yVar, a4.c cVar) {
        super(2, cVar);
        this.f4442m = hVar;
        this.f4443n = yVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        a1 a1Var = new a1(this.f4442m, this.f4443n, cVar);
        a1Var.f4441l = obj;
        return a1Var;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a1) create((C0318t0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r5.a(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (p4.AbstractC2282w.w(r4, r1, r6) == r0) goto L17;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f4440k;
        if (i == 0) {
            G4.l.N(obj);
            C0318t0 c0318t0 = (C0318t0) this.f4441l;
            a4.i iVar = a4.i.f6649k;
            a4.h hVar = this.f4442m;
            boolean a5 = kotlin.jvm.internal.l.a(hVar, iVar);
            s4.y yVar = this.f4443n;
            if (a5) {
                Y0 y02 = new Y0(c0318t0, 0);
                this.f4440k = 1;
            } else {
                Z0 z02 = new Z0(yVar, c0318t0, null);
                this.f4440k = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
