package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y52 extends AbstractC0823w0 {
    public static final Parcelable.Creator<y52> CREATOR = new jm1(24);

    /* JADX INFO: renamed from: j */
    public final String f9176j;

    /* JADX INFO: renamed from: k */
    public final long f9177k;

    /* JADX INFO: renamed from: l */
    public final int f9178l;

    public y52(int i, long j, String str) {
        this.f9176j = str;
        this.f9177k = j;
        this.f9178l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4658l(parcel, 1, this.f9176j);
        t22.m4662p(parcel, 2, 8);
        parcel.writeLong(this.f9177k);
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(this.f9178l);
        t22.m4665s(parcel, iM4663q);
    }
}
