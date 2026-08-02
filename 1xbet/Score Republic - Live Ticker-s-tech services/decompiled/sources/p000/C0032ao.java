package p000;

import android.app.Application;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ao */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0032ao implements oy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f577a;

    /* JADX INFO: renamed from: b */
    public final C0256go f578b;

    public /* synthetic */ C0032ao(C0256go c0256go, int i) {
        this.f577a = i;
        this.f578b = c0256go;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f577a;
        C0256go c0256go = this.f578b;
        switch (i) {
            case 0:
                InterfaceC0826w3 interfaceC0826w3 = (InterfaceC0826w3) c0256go.f2822j.get();
                yd0.m5764c(interfaceC0826w3);
                return interfaceC0826w3;
            case 1:
                C0900y3 c0900y3 = (C0900y3) c0256go.f2823k.get();
                yd0.m5764c(c0900y3);
                return c0900y3;
            case 2:
                w30 w30Var = (w30) c0256go.f2819g.get();
                yd0.m5764c(w30Var);
                return w30Var;
            case 3:
                Application application = (Application) c0256go.f2813a.get();
                yd0.m5764c(application);
                return application;
            case 4:
                Executor executor = (Executor) c0256go.f2831s.get();
                yd0.m5764c(executor);
                return executor;
            case 5:
                C0652re c0652re = (C0652re) c0256go.f2826n.get();
                yd0.m5764c(c0652re);
                return c0652re;
            case 6:
                C0666rs c0666rs = (C0666rs) c0256go.f2829q.get();
                yd0.m5764c(c0666rs);
                return c0666rs;
            case 7:
                hb1 hb1Var = (hb1) c0256go.f2824l.get();
                yd0.m5764c(hb1Var);
                return hb1Var;
            case 8:
                AbstractC0727tf abstractC0727tf = (AbstractC0727tf) c0256go.f2815c.get();
                yd0.m5764c(abstractC0727tf);
                return abstractC0727tf;
            case 9:
                yc0 yc0Var = (yc0) c0256go.f2827o.get();
                yd0.m5764c(yc0Var);
                return yc0Var;
            case 10:
                Executor executor2 = (Executor) c0256go.f2830r.get();
                yd0.m5764c(executor2);
                return executor2;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                w30 w30Var2 = (w30) c0256go.f2820h.get();
                yd0.m5764c(w30Var2);
                return w30Var2;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                px0 px0Var = (px0) c0256go.f2821i.get();
                yd0.m5764c(px0Var);
                return px0Var;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                py0 py0Var = (py0) c0256go.f2814b.get();
                yd0.m5764c(py0Var);
                return py0Var;
            case 14:
                xz0 xz0Var = (xz0) c0256go.f2828p.get();
                yd0.m5764c(xz0Var);
                return xz0Var;
            default:
                p51 p51Var = (p51) c0256go.f2818f.get();
                yd0.m5764c(p51Var);
                return p51Var;
        }
    }
}
