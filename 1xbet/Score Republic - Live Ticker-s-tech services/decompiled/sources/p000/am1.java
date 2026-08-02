package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class am1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<am1> CREATOR = new C0936z2(25);

    /* JADX INFO: renamed from: j */
    public final int f249j;

    /* JADX INFO: renamed from: k */
    public final C0253gl f250k;

    /* JADX INFO: renamed from: l */
    public final gm1 f251l;

    public am1(int i, C0253gl c0253gl, gm1 gm1Var) {
        this.f249j = i;
        this.f250k = c0253gl;
        this.f251l = gm1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f249j);
        t22.m4657k(parcel, 2, this.f250k, i);
        t22.m4657k(parcel, 3, this.f251l, i);
        t22.m4665s(parcel, iM4663q);
    }
}
