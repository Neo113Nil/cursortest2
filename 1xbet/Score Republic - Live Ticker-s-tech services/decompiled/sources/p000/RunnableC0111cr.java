package p000;

import android.view.View;

/* JADX INFO: renamed from: cr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0111cr implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1431j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0443lr f1432k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ i91 f1433l;

    public /* synthetic */ RunnableC0111cr(C0443lr c0443lr, i91 i91Var, int i) {
        this.f1431j = i;
        this.f1432k = c0443lr;
        this.f1433l = i91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1431j;
        i91 i91Var = this.f1433l;
        C0443lr c0443lr = this.f1432k;
        switch (i) {
            case 0:
                c0443lr.m3278a(i91Var);
                break;
            case 1:
                if (c0443lr.f4884b.contains(i91Var)) {
                    int i2 = i91Var.f3486a;
                    View view = i91Var.f3488c.f1112P;
                    view.getClass();
                    j11.m2766a(i2, view, c0443lr.f4883a);
                }
                break;
            default:
                c0443lr.f4884b.remove(i91Var);
                c0443lr.f4885c.remove(i91Var);
                break;
        }
    }
}
