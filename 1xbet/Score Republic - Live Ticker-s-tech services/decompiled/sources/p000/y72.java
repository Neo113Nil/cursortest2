package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y72 extends AbstractC0823w0 {
    public static final Parcelable.Creator<y72> CREATOR = new jm1(29);

    /* JADX INFO: renamed from: j */
    public final boolean f9205j;

    /* JADX INFO: renamed from: k */
    public final String f9206k;

    /* JADX INFO: renamed from: l */
    public final int f9207l;

    /* JADX INFO: renamed from: m */
    public final int f9208m;

    /* JADX INFO: renamed from: n */
    public final long f9209n;

    public y72(int i, int i2, long j, String str, boolean z) {
        this.f9205j = z;
        this.f9206k = str;
        this.f9207l = af0.m198m(i) - 1;
        this.f9208m = xe1.m5645q(i2) - 1;
        this.f9209n = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f9205j ? 1 : 0);
        t22.m4658l(parcel, 2, this.f9206k);
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(this.f9207l);
        t22.m4662p(parcel, 4, 4);
        parcel.writeInt(this.f9208m);
        t22.m4662p(parcel, 5, 8);
        parcel.writeLong(this.f9209n);
        t22.m4665s(parcel, iM4663q);
    }
}
