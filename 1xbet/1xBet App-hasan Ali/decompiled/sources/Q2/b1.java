package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class b1 extends AbstractC2187a {
    public static final Parcelable.Creator<b1> CREATOR = new C0354d0(10);

    /* renamed from: k, reason: collision with root package name */
    public final int f4992k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4993l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4994m;

    /* renamed from: n, reason: collision with root package name */
    public final long f4995n;

    public b1(int i, int i5, long j5, String str) {
        this.f4992k = i;
        this.f4993l = i5;
        this.f4994m = str;
        this.f4995n = j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f4992k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f4993l);
        AbstractC2036a.f0(parcel, 3, this.f4994m);
        AbstractC2036a.n0(parcel, 4, 8);
        parcel.writeLong(this.f4995n);
        AbstractC2036a.m0(parcel, k02);
    }
}
