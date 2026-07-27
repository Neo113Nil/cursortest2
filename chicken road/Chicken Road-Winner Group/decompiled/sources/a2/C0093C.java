package a2;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* renamed from: a2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093C extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1799e;
    public final /* synthetic */ C0100J f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f1801h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093C(C0100J c0100j, String str, String str2, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = c0100j;
        this.f1800g = str;
        this.f1801h = str2;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new C0093C(this.f, this.f1800g, this.f1801h, interfaceC0319c);
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f1799e;
        if (i3 == 0) {
            X0.a.L(obj);
            this.f1799e = 1;
            if (C0100J.l(this.f, this.f1800g, this.f1801h, this) == enumC0326a) {
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
        return ((C0093C) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
