package M;

import D4.AbstractC0024y;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class J extends m4.h implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public Object f1589a;

    /* renamed from: b, reason: collision with root package name */
    public int f1590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f1591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1223i f1592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m4.h f1593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(P p5, InterfaceC1223i interfaceC1223i, InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.f1591c = p5;
        this.f1592d = interfaceC1223i;
        this.f1593e = (m4.h) interfaceC1445p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new J(this.f1591c, this.f1592d, this.f1593e, interfaceC1218d);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        return ((J) create((InterfaceC1218d) obj)).invokeSuspend(f4.v.f5689a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Type inference failed for: r6v0, types: [m4.h, t4.p] */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0075d c0075d;
        Object obj2;
        Object obj3;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f1590b;
        P p5 = this.f1591c;
        if (i2 == 0) {
            e5.g.y(obj);
            this.f1590b = 1;
            obj = P.f(p5, true, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = this.f1589a;
                    e5.g.y(obj);
                    return obj3;
                }
                c0075d = (C0075d) this.f1589a;
                e5.g.y(obj);
                obj2 = c0075d.f1667b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0075d.f1668c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (kotlin.jvm.internal.i.a(c0075d.f1667b, obj)) {
                    return obj;
                }
                this.f1589a = obj;
                this.f1590b = 3;
                if (p5.j(obj, true, this) == enumC1260a) {
                    return enumC1260a;
                }
                obj3 = obj;
                return obj3;
            }
            e5.g.y(obj);
        }
        c0075d = (C0075d) obj;
        I i3 = new I(this.f1593e, c0075d, null);
        this.f1589a = c0075d;
        this.f1590b = 2;
        obj = AbstractC0024y.w(this.f1592d, i3, this);
        if (obj == enumC1260a) {
            return enumC1260a;
        }
        obj2 = c0075d.f1667b;
        if ((obj2 == null ? obj2.hashCode() : 0) == c0075d.f1668c) {
        }
    }
}
