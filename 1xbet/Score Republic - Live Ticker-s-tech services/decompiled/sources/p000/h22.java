package p000;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class h22 extends e90 {
    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: b */
    public final IInterface mo717b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return iInterfaceQueryLocalInterface instanceof f22 ? (f22) iInterfaceQueryLocalInterface : new f22(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService", 2);
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: f */
    public final C0451lz[] mo718f() {
        return AbstractC0477mo.f5110g;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: i */
    public final int mo719i() {
        return 9410000;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: m */
    public final String mo720m() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: n */
    public final String mo721n() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
