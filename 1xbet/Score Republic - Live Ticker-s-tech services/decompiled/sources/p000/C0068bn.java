package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: bn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0068bn extends bh0 implements h60 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f918k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f919l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f920m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0068bn(int i, Object obj, Object obj2) {
        super(1);
        this.f918k = i;
        this.f919l = obj;
        this.f920m = obj2;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) throws Throwable {
        kf1 kf1Var;
        int i = this.f918k;
        Object obj2 = this.f920m;
        Object obj3 = this.f919l;
        kf1 kf1Var2 = kf1.f4365a;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                C0283he c0283he = (C0283he) obj3;
                if (th == null) {
                    Object objM2605E = ((C0591pr) obj2).m2605E();
                    if (objM2605E instanceof md0) {
                        C0270h1.m2191g("This job has not completed yet");
                        return null;
                    }
                    if (objM2605E instanceof C0657rj) {
                        throw ((C0657rj) objM2605E).f6860a;
                    }
                    Object objM5991y = AbstractC0959zp.m5991y(objM2605E);
                    c0283he.f3183d = true;
                    C0356je c0356je = c0283he.f3181b;
                    if (c0356je == null || !c0356je.f3911k.m5018j(objM5991y)) {
                        return kf1Var2;
                    }
                    c0283he.f3180a = null;
                    c0283he.f3181b = null;
                    c0283he.f3182c = null;
                    return kf1Var2;
                }
                if (th instanceof CancellationException) {
                    c0283he.f3183d = true;
                    C0356je c0356je2 = c0283he.f3181b;
                    if (c0356je2 == null || !c0356je2.f3911k.cancel(true)) {
                        return kf1Var2;
                    }
                    c0283he.f3180a = null;
                    c0283he.f3181b = null;
                    c0283he.f3182c = null;
                    return kf1Var2;
                }
                c0283he.f3183d = true;
                C0356je c0356je3 = c0283he.f3181b;
                if (c0356je3 == null || !c0356je3.f3911k.mo4867k(th)) {
                    return kf1Var2;
                }
                c0283he.f3180a = null;
                c0283he.f3181b = null;
                c0283he.f3182c = null;
                return kf1Var2;
            default:
                Throwable th2 = (Throwable) obj;
                ((C0737tp) obj3).mo170i(th2);
                C0650rc c0650rc = (C0650rc) ((f71) obj2).f2336m;
                c0650rc.m4320f(th2, false);
                do {
                    Object objM4311E = c0650rc.m4311E();
                    if (objM4311E instanceof C0017ag) {
                        objM4311E = null;
                    }
                    if (objM4311E != null) {
                        ((io0) objM4311E).f3627b.m2611K(new C0657rj(th2 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th2, false));
                        kf1Var = kf1Var2;
                    } else {
                        kf1Var = null;
                    }
                } while (kf1Var != null);
                return kf1Var2;
        }
    }
}
