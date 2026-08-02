package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fv1 extends yk1 implements gv1 {
    public fv1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 2);
    }

    @Override // p000.gv1
    /* JADX INFO: renamed from: n */
    public final void mo785n(Bundle bundle) {
        Parcel parcelM5810d = m5810d();
        iu1.m2702b(parcelM5810d, bundle);
        m5806F(parcelM5810d, 1);
    }
}
