package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class N extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.p f774e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f776h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O f777i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f778j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f779k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(kotlin.jvm.internal.p pVar, O o3, Object obj, boolean z3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f776h = pVar;
        this.f777i = o3;
        this.f778j = obj;
        this.f779k = z3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        N n3 = new N(this.f776h, this.f777i, this.f778j, this.f779k, interfaceC0319c);
        n3.f775g = obj;
        return n3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r6.b(r3, r7) == r0) goto L16;
     */
    @Override // i2.AbstractC0343b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        Z z3;
        kotlin.jvm.internal.p pVar;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f;
        kotlin.jvm.internal.p pVar2 = this.f776h;
        Object obj2 = this.f778j;
        O o3 = this.f777i;
        if (i3 == 0) {
            X0.a.L(obj);
            Z z4 = (Z) this.f775g;
            i0 g3 = o3.g();
            this.f775g = z4;
            this.f774e = pVar2;
            this.f = 1;
            Integer num = new Integer(((AtomicInteger) g3.f857b.f729b).incrementAndGet());
            if (num != enumC0326a) {
                z3 = z4;
                obj = num;
                pVar = pVar2;
            }
            return enumC0326a;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
            if (this.f779k) {
                o3.f786h.x(new C0036d(obj2 != null ? obj2.hashCode() : 0, pVar2.f9671a, obj2));
            }
            return C0279i.f4852a;
        }
        pVar = this.f774e;
        z3 = (Z) this.f775g;
        X0.a.L(obj);
        pVar.f9671a = ((Number) obj).intValue();
        this.f775g = null;
        this.f774e = null;
        this.f = 2;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((N) b((InterfaceC0319c) obj2, (Z) obj)).g(C0279i.f4852a);
    }
}
