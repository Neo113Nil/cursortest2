package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.util.List;

/* renamed from: K.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037e extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f835e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037e(List list, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f836g = list;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0037e c0037e = new C0037e(this.f836g, interfaceC0319c);
        c0037e.f = obj;
        return c0037e;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f835e;
        if (i3 == 0) {
            X0.a.L(obj);
            C0044l c0044l = (C0044l) this.f;
            this.f835e = 1;
            if (X0.a.d(this.f836g, c0044l, this) == enumC0326a) {
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
        return ((C0037e) b((InterfaceC0319c) obj2, (C0044l) obj)).g(C0279i.f4852a);
    }
}
