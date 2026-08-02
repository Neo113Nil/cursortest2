package P;

import a0.C0446b;
import a4.AbstractC0470a;
import k4.AbstractC2036a;
import p4.InterfaceC2278s;

/* loaded from: classes.dex */
public final class I0 extends AbstractC0470a implements InterfaceC2278s {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0446b f4323l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J0 f4324m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public I0(C0446b c0446b, J0 j02) {
        super(r0);
        p4.r rVar = p4.r.f18818k;
        this.f4323l = c0446b;
        this.f4324m = j02;
    }

    @Override // p4.InterfaceC2278s
    public final void k(a4.h hVar, Throwable th) {
        C0446b c0446b = this.f4323l;
        J0 j02 = this.f4324m;
        AbstractC2036a.Y(th, new C0328y0(4, c0446b, j02));
        j02.getClass();
        InterfaceC2278s interfaceC2278s = (InterfaceC2278s) j02.f4326k.l(p4.r.f18818k);
        if (interfaceC2278s == null) {
            throw th;
        }
        interfaceC2278s.k(hVar, th);
    }
}
