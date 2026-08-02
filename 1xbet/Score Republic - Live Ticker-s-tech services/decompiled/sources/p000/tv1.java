package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tv1 implements o12 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hw1 f7617a;

    public tv1(hw1 hw1Var) {
        this.f7617a = hw1Var;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: a */
    public final void mo3188a(String str, String str2, Bundle bundle, long j) {
        hw1 hw1Var = this.f7617a;
        if (hw1Var.f3350a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            q01 q01Var = ou1.f5916a;
            String strM5656r = AbstractC0875xf.m5656r(str2, zg1.f9767m, zg1.f9762h);
            if (strM5656r != null) {
                str2 = strM5656r;
            }
            bundle2.putString("events", str2);
            ((n20) hw1Var.f3351b.f793k).mo3469d(bundle2.getString("events"));
        }
    }
}
