package a2;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* renamed from: a2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096F extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1807e;
    public final /* synthetic */ C0100J f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1808g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f1809h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096F(C0100J c0100j, String str, String str2, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = c0100j;
        this.f1808g = str;
        this.f1809h = str2;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new C0096F(this.f, this.f1808g, this.f1809h, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f1807e;
        if (i3 == 0) {
            X0.a.L(obj);
            this.f1807e = 1;
            if (C0100J.l(this.f, this.f1808g, this.f1809h, this) == enumC0326a) {
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
        return ((C0096F) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
