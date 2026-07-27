package N2;

import D4.InterfaceC0022w;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1445p;

/* renamed from: N2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120k extends m4.h implements InterfaceC1445p {

    /* renamed from: a, reason: collision with root package name */
    public int f2096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f2097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f2098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120k(H h3, List list, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.f2097b = h3;
        this.f2098c = list;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new C0120k(this.f2097b, this.f2098c, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0120k) create((InterfaceC0022w) obj, (InterfaceC1218d) obj2)).invokeSuspend(f4.v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.f2096a;
        if (i2 == 0) {
            e5.g.y(obj);
            this.f2096a = 1;
            obj = H.i(this.f2097b, this.f2098c, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e5.g.y(obj);
        }
        return obj;
    }
}
