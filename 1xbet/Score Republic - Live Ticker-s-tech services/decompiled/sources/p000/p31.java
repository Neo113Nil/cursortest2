package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p31 extends AbstractC0823w0 {
    public static final Parcelable.Creator<p31> CREATOR = new jm1(2);

    /* JADX INFO: renamed from: j */
    public final int f5971j;

    /* JADX INFO: renamed from: k */
    public final boolean f5972k;

    /* JADX INFO: renamed from: l */
    public final boolean f5973l;

    /* JADX INFO: renamed from: m */
    public final int f5974m;

    /* JADX INFO: renamed from: n */
    public final int f5975n;

    public p31(int i, boolean z, boolean z2, int i2, int i3) {
        this.f5971j = i;
        this.f5972k = z;
        this.f5973l = z2;
        this.f5974m = i2;
        this.f5975n = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f5971j);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f5972k ? 1 : 0);
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(this.f5973l ? 1 : 0);
        t22.m4662p(parcel, 4, 4);
        parcel.writeInt(this.f5974m);
        t22.m4662p(parcel, 5, 4);
        parcel.writeInt(this.f5975n);
        t22.m4665s(parcel, iM4663q);
    }
}
