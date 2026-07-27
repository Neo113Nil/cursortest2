package g0;

import I1.n;
import android.app.Activity;
import d2.C0279i;
import g2.InterfaceC0319c;
import h0.InterfaceC0324a;
import h2.EnumC0326a;
import o2.p;
import w2.InterfaceC1241u;
import y2.o;

/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310i extends i2.g implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f4967e;
    public /* synthetic */ InterfaceC1241u f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0303b f4968g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f4969h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310i(C0303b c0303b, Activity activity, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f4968g = c0303b;
        this.f4969h = activity;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        C0310i c0310i = new C0310i(this.f4968g, this.f4969h, interfaceC0319c);
        c0310i.f = (InterfaceC1241u) obj;
        return c0310i;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f4967e;
        if (i3 == 0) {
            X0.a.L(obj);
            o oVar = (o) this.f;
            n nVar = new n(1, oVar);
            C0303b c0303b = this.f4968g;
            ((InterfaceC0324a) c0303b.f4955b).a(this.f4969h, new S.c(), nVar);
            M.b bVar = new M.b(c0303b, 1, nVar);
            this.f4967e = 1;
            if (y2.i.b(oVar, bVar, this) == enumC0326a) {
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
        return ((C0310i) b((InterfaceC0319c) obj2, (o) obj)).g(C0279i.f4852a);
    }
}
