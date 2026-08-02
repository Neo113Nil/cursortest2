package p000;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dw1 extends hu1 implements iv1 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f31 f1860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw1(zv1 zv1Var, f31 f31Var) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f1860b = f31Var;
    }

    @Override // p000.hu1
    /* JADX INFO: renamed from: a */
    public final boolean mo563a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        mo1322e();
        return true;
    }

    @Override // p000.iv1
    /* JADX INFO: renamed from: e */
    public final void mo1322e() {
        this.f1860b.run();
    }
}
