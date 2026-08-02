package p000;

import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m52 extends rt1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f4979e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f4980f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m52(Object obj, f12 f12Var, int i) {
        super(f12Var);
        this.f4979e = i;
        this.f4980f = obj;
    }

    @Override // p000.rt1
    /* JADX INFO: renamed from: a */
    public final void mo23a() {
        int i = this.f4979e;
        Object obj = this.f4980f;
        switch (i) {
            case 0:
                q52 q52Var = (q52) obj;
                s52 s52Var = q52Var.f6390d;
                s52Var.mo11z();
                f02 f02Var = (f02) s52Var.f7192j;
                f02Var.f2252t.getClass();
                q52Var.m4038a(false, false, SystemClock.elapsedRealtime());
                qv1 qv1Var = f02Var.f2255w;
                f02.m1557j(qv1Var);
                f02Var.f2252t.getClass();
                qv1Var.m4202D(SystemClock.elapsedRealtime());
                break;
            case 1:
                a62 a62Var = (a62) obj;
                a62Var.m36F();
                ky1 ky1Var = ((f02) a62Var.f7192j).f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4608w.m5312a("Starting upload from DelayedRunnable");
                a62Var.f1566k.m5581q();
                break;
            default:
                x62 x62Var = (x62) obj;
                x62Var.mo1564c().mo11z();
                String str = (String) x62Var.f8837z.pollFirst();
                if (str != null) {
                    x62Var.mo1567f().getClass();
                    x62Var.f8819R = SystemClock.elapsedRealtime();
                    x62Var.mo1563b().f4608w.m5313b(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    x62.m5531S(x62Var.f8832u.f2242j, intent);
                }
                x62Var.m5539H();
                break;
        }
    }
}
