package w2;

import d2.C0279i;

/* loaded from: classes.dex */
public final class D implements c0, o2.l {

    /* renamed from: a, reason: collision with root package name */
    public final C f10464a;

    public D(C c3) {
        this.f10464a = c3;
    }

    public final void a(Throwable th) {
        this.f10464a.dispose();
    }

    @Override // o2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return C0279i.f4852a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f10464a + ']';
    }
}
