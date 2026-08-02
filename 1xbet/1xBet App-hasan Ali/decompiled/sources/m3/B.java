package m3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class B extends AbstractC2187a {
    public static final Parcelable.Creator<B> CREATOR = new C2.a(26);

    /* renamed from: k, reason: collision with root package name */
    public Bundle f17999k;

    /* renamed from: l, reason: collision with root package name */
    public j3.d[] f18000l;

    /* renamed from: m, reason: collision with root package name */
    public int f18001m;

    /* renamed from: n, reason: collision with root package name */
    public C2096f f18002n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.b0(parcel, 1, this.f17999k);
        AbstractC2036a.i0(parcel, 2, this.f18000l, i);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f18001m);
        AbstractC2036a.e0(parcel, 4, this.f18002n, i);
        AbstractC2036a.m0(parcel, k02);
    }
}
