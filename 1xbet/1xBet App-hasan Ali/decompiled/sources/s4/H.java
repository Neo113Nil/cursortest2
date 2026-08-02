package s4;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* loaded from: classes.dex */
public final class H extends AbstractC0548i implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public int f19234k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ InterfaceC2369f f19235l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ int f19236m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f19237n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j5, a4.c cVar) {
        super(3, cVar);
        this.f19237n = j5;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        H h3 = new H(this.f19237n, (a4.c) obj3);
        h3.f19235l = (InterfaceC2369f) obj;
        h3.f19236m = intValue;
        return h3.invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        if (r1.d(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (p4.AbstractC2282w.f(Long.MAX_VALUE, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r1.d(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r1.d(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (p4.AbstractC2282w.f(0, r8) == r0) goto L32;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2369f interfaceC2369f;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19234k;
        J j5 = this.f19237n;
        if (i == 0) {
            G4.l.N(obj);
            interfaceC2369f = this.f19235l;
            if (this.f19236m > 0) {
                E e3 = E.f19227k;
                this.f19234k = 1;
            } else {
                j5.getClass();
                this.f19235l = interfaceC2369f;
                this.f19234k = 2;
            }
            return enumC0510a;
        }
        if (i != 1) {
            if (i == 2) {
                interfaceC2369f = this.f19235l;
                G4.l.N(obj);
                j5.getClass();
                E e5 = E.f19228l;
                this.f19235l = interfaceC2369f;
                this.f19234k = 3;
            } else if (i == 3) {
                interfaceC2369f = this.f19235l;
                G4.l.N(obj);
                j5.getClass();
                this.f19235l = interfaceC2369f;
                this.f19234k = 4;
            } else if (i == 4) {
                interfaceC2369f = this.f19235l;
                G4.l.N(obj);
                E e6 = E.f19229m;
                this.f19235l = null;
                this.f19234k = 5;
            } else if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        G4.l.N(obj);
        return W3.o.f6046a;
    }
}
