package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y02 extends AbstractC0823w0 {
    public static final Parcelable.Creator<y02> CREATOR = new jm1(21);

    /* JADX INFO: renamed from: j */
    public Bundle f9124j;

    /* JADX INFO: renamed from: k */
    public C0451lz[] f9125k;

    /* JADX INFO: renamed from: l */
    public int f9126l;

    /* JADX INFO: renamed from: m */
    public C0363jl f9127m;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4652f(parcel, 1, this.f9124j);
        t22.m4659m(parcel, 2, this.f9125k, i);
        int i2 = this.f9126l;
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(i2);
        t22.m4657k(parcel, 4, this.f9127m, i);
        t22.m4665s(parcel, iM4663q);
    }
}
