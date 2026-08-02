package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gm1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<gm1> CREATOR = new C0936z2(28);

    /* JADX INFO: renamed from: j */
    public final int f2805j;

    /* JADX INFO: renamed from: k */
    public final IBinder f2806k;

    /* JADX INFO: renamed from: l */
    public final C0253gl f2807l;

    /* JADX INFO: renamed from: m */
    public final boolean f2808m;

    /* JADX INFO: renamed from: n */
    public final boolean f2809n;

    public gm1(int i, IBinder iBinder, C0253gl c0253gl, boolean z, boolean z2) {
        this.f2805j = i;
        this.f2806k = iBinder;
        this.f2807l = c0253gl;
        this.f2808m = z;
        this.f2809n = z2;
    }

    public final boolean equals(Object obj) {
        Object x82Var;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof gm1)) {
                return false;
            }
            gm1 gm1Var = (gm1) obj;
            if (!this.f2807l.equals(gm1Var.f2807l)) {
                return false;
            }
            Object x82Var2 = null;
            IBinder iBinder = this.f2806k;
            if (iBinder == null) {
                x82Var = null;
            } else {
                int i = AbstractBinderC0935z1.f9565c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                x82Var = iInterfaceQueryLocalInterface instanceof wb0 ? (wb0) iInterfaceQueryLocalInterface : new x82(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = gm1Var.f2806k;
            if (iBinder2 != null) {
                int i2 = AbstractBinderC0935z1.f9565c;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                x82Var2 = iInterfaceQueryLocalInterface2 instanceof wb0 ? (wb0) iInterfaceQueryLocalInterface2 : new x82(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!AbstractC0477mo.m3406e(x82Var, x82Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f2805j);
        t22.m4655i(parcel, 2, this.f2806k);
        t22.m4657k(parcel, 3, this.f2807l, i);
        t22.m4662p(parcel, 4, 4);
        parcel.writeInt(this.f2808m ? 1 : 0);
        t22.m4662p(parcel, 5, 4);
        parcel.writeInt(this.f2809n ? 1 : 0);
        t22.m4665s(parcel, iM4663q);
    }
}
