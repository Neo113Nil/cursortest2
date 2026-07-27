package K;

import d2.C0279i;
import g2.InterfaceC0319c;

/* renamed from: K.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039g extends i2.g implements o2.l {

    /* renamed from: e, reason: collision with root package name */
    public int f846e;

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        int i3 = this.f846e;
        if (i3 == 0) {
            X0.a.L(obj);
            this.f846e = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        X0.a.L(obj);
        return C0279i.f4852a;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        C0039g c0039g = new C0039g(1, (InterfaceC0319c) obj);
        C0279i c0279i = C0279i.f4852a;
        c0039g.g(c0279i);
        return c0279i;
    }
}
