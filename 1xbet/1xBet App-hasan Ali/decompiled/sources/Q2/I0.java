package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class I0 extends AbstractC2187a {
    public static final Parcelable.Creator<I0> CREATOR = new C0354d0(3);

    /* renamed from: k, reason: collision with root package name */
    public final int f4925k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4926l;

    /* renamed from: m, reason: collision with root package name */
    public final String f4927m;

    public I0(int i, int i5, String str) {
        this.f4925k = i;
        this.f4926l = i5;
        this.f4927m = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f4925k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f4926l);
        AbstractC2036a.f0(parcel, 3, this.f4927m);
        AbstractC2036a.m0(parcel, k02);
    }
}
