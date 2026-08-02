package E;

import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import y.C2654j;
import y.C2655k;

/* loaded from: classes.dex */
public final class s0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public Object f1298k;

    /* renamed from: l, reason: collision with root package name */
    public int f1299l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f1300m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f1301n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2654j f1302o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(InterfaceC0289e0 interfaceC0289e0, long j5, C2654j c2654j, a4.c cVar) {
        super(2, cVar);
        this.f1300m = interfaceC0289e0;
        this.f1301n = j5;
        this.f1302o = c2654j;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new s0(this.f1300m, this.f1301n, this.f1302o, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r2.a(r1, r8) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0289e0 interfaceC0289e0;
        y.l lVar;
        y.l lVar2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1299l;
        C2654j c2654j = this.f1302o;
        InterfaceC0289e0 interfaceC0289e02 = this.f1300m;
        if (i == 0) {
            G4.l.N(obj);
            y.l lVar3 = (y.l) interfaceC0289e02.getValue();
            if (lVar3 != null) {
                C2655k c2655k = new C2655k(lVar3);
                if (c2654j != null) {
                    this.f1298k = interfaceC0289e02;
                    this.f1299l = 1;
                }
                interfaceC0289e0 = interfaceC0289e02;
            }
            lVar = new y.l(this.f1301n);
            if (c2654j != null) {
                this.f1298k = lVar;
                this.f1299l = 2;
                if (c2654j.a(lVar, this) != enumC0510a) {
                    lVar2 = lVar;
                    lVar = lVar2;
                }
                return enumC0510a;
            }
            interfaceC0289e02.setValue(lVar);
            return W3.o.f6046a;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar2 = (y.l) this.f1298k;
            G4.l.N(obj);
            lVar = lVar2;
            interfaceC0289e02.setValue(lVar);
            return W3.o.f6046a;
        }
        interfaceC0289e0 = (InterfaceC0289e0) this.f1298k;
        G4.l.N(obj);
        interfaceC0289e0.setValue(null);
        lVar = new y.l(this.f1301n);
        if (c2654j != null) {
        }
        interfaceC0289e02.setValue(lVar);
        return W3.o.f6046a;
    }
}
