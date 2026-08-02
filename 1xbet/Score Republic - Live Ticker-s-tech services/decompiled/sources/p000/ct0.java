package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ct0 extends AbstractC0959zp {

    /* JADX INFO: renamed from: w */
    public final Iterable f1451w;

    public ct0(List list) {
        this.f1451w = list;
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: w */
    public final void mo173w(ft0 ft0Var) {
        InterfaceC0187eu interfaceC0187eu = EnumC0336iw.f3682j;
        try {
            Iterator it = this.f1451w.iterator();
            try {
                if (!it.hasNext()) {
                    ft0Var.mo172a(interfaceC0187eu);
                    ft0Var.onComplete();
                    return;
                }
                bt0 bt0Var = new bt0(ft0Var, it);
                ft0Var.mo172a(bt0Var);
                while (!bt0Var.f979l) {
                    try {
                        Object next = bt0Var.f978k.next();
                        zg1.m5905p(next, "The iterator returned a null value");
                        bt0Var.f977j.onNext(next);
                        if (bt0Var.f979l) {
                            return;
                        }
                        try {
                            if (!bt0Var.f978k.hasNext()) {
                                if (bt0Var.f979l) {
                                    return;
                                }
                                bt0Var.f977j.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            wo1.m5394u(th);
                            bt0Var.f977j.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        wo1.m5394u(th2);
                        bt0Var.f977j.onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                wo1.m5394u(th3);
                ft0Var.mo172a(interfaceC0187eu);
                ft0Var.onError(th3);
            }
        } catch (Throwable th4) {
            wo1.m5394u(th4);
            ft0Var.mo172a(interfaceC0187eu);
            ft0Var.onError(th4);
        }
    }
}
