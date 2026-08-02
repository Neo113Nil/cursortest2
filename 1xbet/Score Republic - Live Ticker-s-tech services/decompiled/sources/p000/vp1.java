package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vp1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<vp1> CREATOR = new jm1(1);

    /* JADX INFO: renamed from: j */
    public final long f8247j;

    /* JADX INFO: renamed from: k */
    public final int f8248k;

    /* JADX INFO: renamed from: l */
    public final long f8249l;

    public vp1(int i, long j, long j2) {
        this.f8247j = j;
        this.f8248k = i;
        this.f8249l = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 8);
        parcel.writeLong(this.f8247j);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f8248k);
        t22.m4662p(parcel, 3, 8);
        parcel.writeLong(this.f8249l);
        t22.m4665s(parcel, iM4663q);
    }
}
