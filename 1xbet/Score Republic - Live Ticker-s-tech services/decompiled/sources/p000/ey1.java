package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ey1 extends AbstractC0575pb {
    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IInterface mo717b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof nx1 ? (nx1) iInterfaceQueryLocalInterface : new kx1(iBinder);
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: i */
    public final int mo719i() {
        return 12451000;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: m */
    public final String mo720m() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: n */
    public final String mo721n() {
        return "com.google.android.gms.measurement.START";
    }
}
