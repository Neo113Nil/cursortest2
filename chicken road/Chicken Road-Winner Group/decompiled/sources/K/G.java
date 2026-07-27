package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public final class G extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public Object f754e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f755g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O f756h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f757i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(O o3, int i3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f756h = o3;
        this.f757i = i3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        G g3 = new G(this.f756h, this.f757i, interfaceC0319c);
        g3.f755g = ((Boolean) obj).booleanValue();
        return g3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // i2.AbstractC0343b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        boolean z3;
        Object obj2;
        int i3;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i4 = this.f;
        O o3 = this.f756h;
        if (i4 == 0) {
            X0.a.L(obj);
            z3 = this.f755g;
            this.f755g = z3;
            this.f = 1;
            obj = o3.i(this);
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f754e;
                X0.a.L(obj);
                i3 = ((Number) obj).intValue();
                return new C0036d(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
            }
            z3 = this.f755g;
            X0.a.L(obj);
        }
        if (!z3) {
            obj2 = obj;
            i3 = this.f757i;
            return new C0036d(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
        }
        i0 g3 = o3.g();
        this.f754e = obj;
        this.f = 2;
        Integer a3 = g3.a();
        if (a3 != enumC0326a) {
            obj2 = obj;
            obj = a3;
            i3 = ((Number) obj).intValue();
            return new C0036d(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
        }
        return enumC0326a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) b((InterfaceC0319c) obj2, bool)).g(C0279i.f4852a);
    }
}
