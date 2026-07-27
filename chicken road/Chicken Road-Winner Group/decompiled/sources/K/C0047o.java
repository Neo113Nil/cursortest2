package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* renamed from: K.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047o extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f888e;
    public final /* synthetic */ O f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0047o(O o3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = o3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new C0047o(this.f, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f888e;
        if (i3 == 0) {
            X0.a.L(obj);
            this.f888e = 1;
            if (O.d(this.f, this) == enumC0326a) {
                return enumC0326a;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X0.a.L(obj);
        }
        return C0279i.f4852a;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0047o) b((InterfaceC0319c) obj2, (z2.e) obj)).g(C0279i.f4852a);
    }
}
