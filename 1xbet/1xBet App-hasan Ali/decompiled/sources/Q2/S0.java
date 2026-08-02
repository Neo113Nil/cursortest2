package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class S0 extends AbstractC2187a {
    public static final Parcelable.Creator<S0> CREATOR = new C0354d0(5);

    /* renamed from: k, reason: collision with root package name */
    public final int f4939k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4940l;

    public S0(int i, int i5) {
        this.f4939k = i;
        this.f4940l = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f4939k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f4940l);
        AbstractC2036a.m0(parcel, k02);
    }
}
