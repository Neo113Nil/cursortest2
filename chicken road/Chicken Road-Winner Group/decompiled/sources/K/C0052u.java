package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.AbstractC1242v;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052u extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public C0036d f897e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O f899h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052u(O o3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f899h = o3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0052u c0052u = new C0052u(this.f899h, interfaceC0319c);
        c0052u.f898g = obj;
        return c0052u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r4.a(r12, r11) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if ((r1 instanceof K.a0) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    @Override // i2.AbstractC0343b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        z2.e eVar;
        j0 j0Var;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f;
        C0279i c0279i = C0279i.f4852a;
        O o3 = this.f899h;
        if (i3 == 0) {
            X0.a.L(obj);
            z2.e eVar2 = (z2.e) this.f898g;
            this.f898g = eVar2;
            this.f = 1;
            Object n3 = AbstractC1242v.n(o3.f782c.d(), new I(o3, null), this);
            if (n3 != enumC0326a) {
                eVar = eVar2;
                obj = n3;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                X0.a.L(obj);
                return c0279i;
            }
            j0Var = this.f897e;
            eVar = (z2.e) this.f898g;
            X0.a.L(obj);
            z2.i iVar = new z2.i(new b0.i(6, new V1.b(new V1.b(new V1.b(new C0047o(o3, null), 19, (z2.p) o3.f786h.f729b), 21, new C0048p(2, null)), 20, new C0049q(j0Var, null))), new r(o3, (InterfaceC0319c) null));
            this.f898g = null;
            this.f897e = null;
            this.f = 3;
            if (!(eVar instanceof z2.s)) {
                throw ((z2.s) eVar).f10752a;
            }
            Object l3 = iVar.l(eVar, this);
            if (l3 != enumC0326a) {
                l3 = c0279i;
            }
            return l3 == enumC0326a ? enumC0326a : c0279i;
        }
        z2.e eVar3 = (z2.e) this.f898g;
        X0.a.L(obj);
        eVar = eVar3;
        j0Var = (j0) obj;
        if (j0Var instanceof C0036d) {
            Object obj2 = ((C0036d) j0Var).f829b;
            this.f898g = eVar;
            this.f897e = (C0036d) j0Var;
            this.f = 2;
        } else {
            if (j0Var instanceof k0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (j0Var instanceof c0) {
                throw ((c0) j0Var).f828b;
            }
        }
        z2.i iVar2 = new z2.i(new b0.i(6, new V1.b(new V1.b(new V1.b(new C0047o(o3, null), 19, (z2.p) o3.f786h.f729b), 21, new C0048p(2, null)), 20, new C0049q(j0Var, null))), new r(o3, (InterfaceC0319c) null));
        this.f898g = null;
        this.f897e = null;
        this.f = 3;
        if (!(eVar instanceof z2.s)) {
        }
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0052u) b((InterfaceC0319c) obj2, (z2.e) obj)).g(C0279i.f4852a);
    }
}
