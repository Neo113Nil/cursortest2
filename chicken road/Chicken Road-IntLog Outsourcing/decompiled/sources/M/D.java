package M;

import f4.C0430g;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class D extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f1560a;

    /* renamed from: b, reason: collision with root package name */
    public int f1561b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f1562c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f1563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(P p5, int i2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1563d = p5;
        this.f1564e = i2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        D d6 = new D(this.f1563d, this.f1564e, interfaceC1218d);
        d6.f1562c = ((Boolean) obj).booleanValue();
        return d6;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((D) create(bool, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i2;
        boolean z;
        k0 k0Var;
        boolean z5;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        boolean z6 = this.f1561b;
        P p5 = this.f1563d;
        try {
        } catch (Throwable th2) {
            if (z6 != 0) {
                j0 g6 = p5.g();
                this.f1560a = th2;
                this.f1562c = z6;
                this.f1561b = 2;
                Integer a6 = g6.a();
                if (a6 == enumC1260a) {
                    return enumC1260a;
                }
                z = z6;
                th = th2;
                obj = a6;
            } else {
                boolean z7 = z6;
                th = th2;
                i2 = this.f1564e;
                z = z7;
            }
        }
        if (z6 == 0) {
            e5.g.y(obj);
            boolean z8 = this.f1562c;
            this.f1562c = z8;
            this.f1561b = 1;
            obj = P.f(p5, z8, this);
            z6 = z8;
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (z6 != 1) {
                if (z6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.f1562c;
                th = this.f1560a;
                e5.g.y(obj);
                i2 = ((Number) obj).intValue();
                d0 d0Var = new d0(i2, th);
                z5 = z;
                k0Var = d0Var;
                return new C0430g(k0Var, Boolean.valueOf(z5));
            }
            boolean z9 = this.f1562c;
            e5.g.y(obj);
            z6 = z9;
        }
        k0Var = (k0) obj;
        z5 = z6;
        return new C0430g(k0Var, Boolean.valueOf(z5));
    }
}
