package s4;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* renamed from: s4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2376m extends AbstractC0548i implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public int f19285k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ InterfaceC2369f f19286l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f19287m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0548i f19288n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2376m(i4.e eVar, a4.c cVar) {
        super(3, cVar);
        this.f19288n = (AbstractC0548i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c4.i, i4.e] */
    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        C2376m c2376m = new C2376m(this.f19288n, (a4.c) obj3);
        c2376m.f19286l = (InterfaceC2369f) obj;
        c2376m.f19287m = obj2;
        return c2376m.invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.d(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r3v1, types: [c4.i, i4.e] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2369f interfaceC2369f;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19285k;
        if (i == 0) {
            G4.l.N(obj);
            interfaceC2369f = this.f19286l;
            Object obj2 = this.f19287m;
            this.f19286l = interfaceC2369f;
            this.f19285k = 1;
            obj = this.f19288n.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                return W3.o.f6046a;
            }
            interfaceC2369f = this.f19286l;
            G4.l.N(obj);
        }
        this.f19286l = null;
        this.f19285k = 2;
    }
}
