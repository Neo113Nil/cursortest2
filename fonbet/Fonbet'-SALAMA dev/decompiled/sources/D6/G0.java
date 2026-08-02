package D6;

import f6.C1111d;
import i6.C1288e;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;

/* loaded from: classes2.dex */
public final class G0 extends I6.t {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f1792e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public G0(InterfaceC1287d interfaceC1287d, InterfaceC1292i interfaceC1292i) {
        super(interfaceC1287d, interfaceC1292i.get(r0) == null ? interfaceC1292i.plus(r0) : interfaceC1292i);
        H0 h02 = H0.f1793a;
        this.f1792e = new ThreadLocal();
        if (interfaceC1287d.getContext().get(C1288e.f14067a) instanceof A) {
            return;
        }
        Object m7 = I6.a.m(interfaceC1292i, null);
        I6.a.g(interfaceC1292i, m7);
        S(interfaceC1292i, m7);
    }

    public final boolean R() {
        boolean z4 = this.threadLocalIsSet && this.f1792e.get() == null;
        this.f1792e.remove();
        return !z4;
    }

    public final void S(InterfaceC1292i interfaceC1292i, Object obj) {
        this.threadLocalIsSet = true;
        this.f1792e.set(new C1111d(interfaceC1292i, obj));
    }

    @Override // I6.t, D6.s0
    public final void i(Object obj) {
        if (this.threadLocalIsSet) {
            C1111d c1111d = (C1111d) this.f1792e.get();
            if (c1111d != null) {
                I6.a.g((InterfaceC1292i) c1111d.f13000a, c1111d.f13001b);
            }
            this.f1792e.remove();
        }
        Object r7 = E.r(obj);
        InterfaceC1287d interfaceC1287d = this.f3757d;
        InterfaceC1292i context = interfaceC1287d.getContext();
        Object m7 = I6.a.m(context, null);
        G0 w7 = m7 != I6.a.f3721f ? E.w(interfaceC1287d, context, m7) : null;
        try {
            this.f3757d.resumeWith(r7);
        } finally {
            if (w7 == null || w7.R()) {
                I6.a.g(context, m7);
            }
        }
    }
}
