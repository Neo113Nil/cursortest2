package M;

import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class F extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public Object f1574a;

    /* renamed from: b, reason: collision with root package name */
    public int f1575b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f1576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f1577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(P p5, int i2, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f1577d = p5;
        this.f1578e = i2;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        F f3 = new F(this.f1577d, this.f1578e, interfaceC1218d);
        f3.f1576c = ((Boolean) obj).booleanValue();
        return f3;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) create(bool, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        int i2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i3 = this.f1575b;
        P p5 = this.f1577d;
        if (i3 == 0) {
            e5.g.y(obj);
            z = this.f1576c;
            this.f1576c = z;
            this.f1575b = 1;
            obj = p5.i(this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f1574a;
                e5.g.y(obj);
                i2 = ((Number) obj).intValue();
                return new C0075d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
            }
            z = this.f1576c;
            e5.g.y(obj);
        }
        if (!z) {
            obj2 = obj;
            i2 = this.f1578e;
            return new C0075d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
        }
        j0 g6 = p5.g();
        this.f1574a = obj;
        this.f1575b = 2;
        Integer a6 = g6.a();
        if (a6 == enumC1260a) {
            return enumC1260a;
        }
        obj2 = obj;
        obj = a6;
        i2 = ((Number) obj).intValue();
        return new C0075d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
    }
}
