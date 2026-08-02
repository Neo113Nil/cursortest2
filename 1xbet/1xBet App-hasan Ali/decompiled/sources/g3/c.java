package g3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class c extends AbstractC2187a {
    public static final Parcelable.Creator<c> CREATOR = new C2.a(15);

    /* renamed from: k, reason: collision with root package name */
    public final String f17159k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17160l;

    public c(String str, int i) {
        this.f17159k = str;
        this.f17160l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f17159k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f17160l);
        AbstractC2036a.m0(parcel, k02);
    }
}
