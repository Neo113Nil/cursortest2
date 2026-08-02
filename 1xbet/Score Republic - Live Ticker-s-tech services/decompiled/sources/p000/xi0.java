package p000;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xi0 extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi0 f8968a;

    public xi0(zi0 zi0Var) {
        this.f8968a = zi0Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        zi0 zi0Var = this.f8968a;
        if (zi0Var.f9779H.isShowing()) {
            zi0Var.mo3217c();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f8968a.dismiss();
    }
}
