package K;

import d2.C0274d;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public final class E extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public Throwable f742e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f743g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O f744h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f745i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(O o3, int i3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f744h = o3;
        this.f745i = i3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        E e3 = new E(this.f744h, this.f745i, interfaceC0319c);
        e3.f743g = ((Boolean) obj).booleanValue();
        return e3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        Throwable th;
        int i3;
        boolean z3;
        j0 j0Var;
        boolean z4;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        boolean z5 = this.f;
        O o3 = this.f744h;
        try {
        } catch (Throwable th2) {
            if (z5 != 0) {
                i0 g3 = o3.g();
                this.f742e = th2;
                this.f743g = z5;
                this.f = 2;
                Integer a3 = g3.a();
                if (a3 != enumC0326a) {
                    z3 = z5;
                    th = th2;
                    obj = a3;
                }
            } else {
                boolean z6 = z5;
                th = th2;
                i3 = this.f745i;
                z3 = z6;
            }
        }
        if (z5 == 0) {
            X0.a.L(obj);
            boolean z7 = this.f743g;
            this.f743g = z7;
            this.f = 1;
            obj = O.f(o3, z7, this);
            z5 = z7;
            if (obj == enumC0326a) {
                return enumC0326a;
            }
        } else {
            if (z5 != 1) {
                if (z5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = this.f743g;
                th = this.f742e;
                X0.a.L(obj);
                i3 = ((Number) obj).intValue();
                c0 c0Var = new c0(th, i3);
                z4 = z3;
                j0Var = c0Var;
                return new C0274d(j0Var, Boolean.valueOf(z4));
            }
            boolean z8 = this.f743g;
            X0.a.L(obj);
            z5 = z8;
        }
        j0Var = (j0) obj;
        z4 = z5;
        return new C0274d(j0Var, Boolean.valueOf(z4));
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) b((InterfaceC0319c) obj2, bool)).g(C0279i.f4852a);
    }
}
