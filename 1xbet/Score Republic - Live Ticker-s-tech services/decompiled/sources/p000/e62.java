package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class e62 extends AbstractC0823w0 {
    public static final Parcelable.Creator<e62> CREATOR = new jm1(25);

    /* JADX INFO: renamed from: j */
    public final long f1973j;

    /* JADX INFO: renamed from: k */
    public byte[] f1974k;

    /* JADX INFO: renamed from: l */
    public final String f1975l;

    /* JADX INFO: renamed from: m */
    public final Bundle f1976m;

    /* JADX INFO: renamed from: n */
    public final int f1977n;

    /* JADX INFO: renamed from: o */
    public final long f1978o;

    /* JADX INFO: renamed from: p */
    public String f1979p;

    public e62(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.f1973j = j;
        this.f1974k = bArr;
        this.f1975l = str;
        this.f1976m = bundle;
        this.f1977n = i;
        this.f1978o = j2;
        this.f1979p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM4663q = t22.m4663q(parcel, 20293);
        t22.m4662p(parcel, 1, 8);
        parcel.writeLong(this.f1973j);
        t22.m4653g(parcel, 2, this.f1974k);
        t22.m4658l(parcel, 3, this.f1975l);
        t22.m4652f(parcel, 4, this.f1976m);
        t22.m4662p(parcel, 5, 4);
        parcel.writeInt(this.f1977n);
        t22.m4662p(parcel, 6, 8);
        parcel.writeLong(this.f1978o);
        t22.m4658l(parcel, 7, this.f1979p);
        t22.m4665s(parcel, iM4663q);
    }
}
