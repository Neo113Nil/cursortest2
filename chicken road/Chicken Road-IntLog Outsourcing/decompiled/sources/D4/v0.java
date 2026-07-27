package D4;

import f4.C0430g;
import k4.C1219e;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class v0 extends I4.t {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f546e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v0(InterfaceC1218d interfaceC1218d, InterfaceC1223i interfaceC1223i) {
        super(interfaceC1218d, interfaceC1223i.o(r0) == null ? interfaceC1223i.A(r0) : interfaceC1223i);
        w0 w0Var = w0.f547a;
        this.f546e = new ThreadLocal();
        if (interfaceC1218d.getContext().o(C1219e.f10719a) instanceof AbstractC0020u) {
            return;
        }
        Object n6 = I4.a.n(interfaceC1223i, null);
        I4.a.h(interfaceC1223i, n6);
        a0(interfaceC1223i, n6);
    }

    public final boolean Z() {
        boolean z = this.threadLocalIsSet && this.f546e.get() == null;
        this.f546e.remove();
        return !z;
    }

    public final void a0(InterfaceC1223i interfaceC1223i, Object obj) {
        this.threadLocalIsSet = true;
        this.f546e.set(new C0430g(interfaceC1223i, obj));
    }

    @Override // I4.t, D4.g0
    public final void m(Object obj) {
        if (this.threadLocalIsSet) {
            C0430g c0430g = (C0430g) this.f546e.get();
            if (c0430g != null) {
                I4.a.h((InterfaceC1223i) c0430g.f5668a, c0430g.f5669b);
            }
            this.f546e.remove();
        }
        Object o2 = AbstractC0024y.o(obj);
        InterfaceC1218d interfaceC1218d = this.f1321d;
        InterfaceC1223i context = interfaceC1218d.getContext();
        Object n6 = I4.a.n(context, null);
        v0 v4 = n6 != I4.a.f1285f ? AbstractC0024y.v(interfaceC1218d, context, n6) : null;
        try {
            this.f1321d.resumeWith(o2);
        } finally {
            if (v4 == null || v4.Z()) {
                I4.a.h(context, n6);
            }
        }
    }
}
