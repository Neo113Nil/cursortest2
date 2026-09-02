package w;

import F.C0017s;
import x.InterfaceC0099a;

/* loaded from: classes.dex */
public final class i extends g0.i implements f0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0093b f1299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0017s f1300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C0093b c0093b, C0017s c0017s) {
        super(0);
        this.f1299c = c0093b;
        this.f1300d = c0017s;
    }

    @Override // f0.a
    public final Object a() {
        ((InterfaceC0099a) this.f1299c.f1285c).b(this.f1300d);
        return W.g.f394a;
    }
}
