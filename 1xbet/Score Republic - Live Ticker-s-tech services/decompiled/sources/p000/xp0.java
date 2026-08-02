package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xp0 extends AbstractC0823w0 {
    public static final Parcelable.Creator<xp0> CREATOR = new C0936z2(26);

    /* JADX INFO: renamed from: j */
    public final int f9017j;

    /* JADX INFO: renamed from: k */
    public final int f9018k;

    /* JADX INFO: renamed from: l */
    public final int f9019l;

    /* JADX INFO: renamed from: m */
    public final long f9020m;

    /* JADX INFO: renamed from: n */
    public final long f9021n;

    /* JADX INFO: renamed from: o */
    public final String f9022o;

    /* JADX INFO: renamed from: p */
    public final String f9023p;

    /* JADX INFO: renamed from: q */
    public final int f9024q;

    /* JADX INFO: renamed from: r */
    public final int f9025r;

    public xp0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f9017j = i;
        this.f9018k = i2;
        this.f9019l = i3;
        this.f9020m = j;
        this.f9021n = j2;
        this.f9022o = str;
        this.f9023p = str2;
        this.f9024q = i4;
        this.f9025r = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 4);
        parcel.writeInt(this.f9017j);
        t22.m4662p(parcel, 2, 4);
        parcel.writeInt(this.f9018k);
        t22.m4662p(parcel, 3, 4);
        parcel.writeInt(this.f9019l);
        t22.m4662p(parcel, 4, 8);
        parcel.writeLong(this.f9020m);
        t22.m4662p(parcel, 5, 8);
        parcel.writeLong(this.f9021n);
        t22.m4658l(parcel, 6, this.f9022o);
        t22.m4658l(parcel, 7, this.f9023p);
        t22.m4662p(parcel, 8, 4);
        parcel.writeInt(this.f9024q);
        t22.m4662p(parcel, 9, 4);
        parcel.writeInt(this.f9025r);
        t22.m4665s(parcel, iM4663q);
    }
}
