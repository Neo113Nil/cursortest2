package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class al1 extends AbstractC0823w0 {
    public static final Parcelable.Creator<al1> CREATOR = new C0936z2(23);

    /* JADX INFO: renamed from: j */
    public final int f238j;

    /* JADX INFO: renamed from: k */
    public final String f239k;

    /* JADX INFO: renamed from: l */
    public final long f240l;

    /* JADX INFO: renamed from: m */
    public final int f241m;

    /* JADX INFO: renamed from: n */
    public final boolean f242n;

    public al1(int i, int i2, long j, String str, boolean z) {
        this.f238j = i;
        this.f239k = str;
        this.f240l = j;
        this.f241m = i2;
        this.f242n = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f238j);
        t22.m4658l(parcel, 2, this.f239k);
        t22.m4662p(parcel, 3, 8);
        parcel.writeLong(this.f240l);
        t22.m4662p(parcel, 4, 4);
        parcel.writeInt(this.f241m);
        t22.m4662p(parcel, 5, 4);
        parcel.writeInt(this.f242n ? 1 : 0);
        t22.m4665s(parcel, iM4663q);
    }
}
