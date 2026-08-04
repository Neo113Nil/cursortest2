package W5;

import U5.AbstractC0442i;
import U5.C0450q;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class K extends P {
    public final C0539s1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0450q f6838k = C0450q.b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractC0442i[] f6839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L f6840m;

    public K(L l7, C0539s1 c0539s1, AbstractC0442i[] abstractC0442iArr) {
        this.f6840m = l7;
        this.j = c0539s1;
        this.f6839l = abstractC0442iArr;
    }

    @Override // W5.P, W5.InterfaceC0540t
    public final void d(R4.c cVar) {
        if (Boolean.TRUE.equals(this.j.f7363a.f6479f)) {
            ((ArrayList) cVar.f6064b).add("wait_for_ready");
        }
        super.d(cVar);
    }

    @Override // W5.P, W5.InterfaceC0540t
    public final void f(U5.l0 l0Var) {
        super.f(l0Var);
        synchronized (this.f6840m.f6846b) {
            try {
                L l7 = this.f6840m;
                if (l7.f6851g != null) {
                    boolean zRemove = l7.f6853i.remove(this);
                    if (!this.f6840m.h() && zRemove) {
                        L l8 = this.f6840m;
                        l8.f6848d.c(l8.f6850f);
                        L l9 = this.f6840m;
                        if (l9.j != null) {
                            l9.f6848d.c(l9.f6851g);
                            this.f6840m.f6851g = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6840m.f6848d.a();
    }

    @Override // W5.P
    public final void q(U5.l0 l0Var) {
        for (AbstractC0442i abstractC0442i : this.f6839l) {
            abstractC0442i.m(l0Var);
        }
    }
}
