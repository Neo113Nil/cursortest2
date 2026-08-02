package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class T0 extends AbstractC2187a {
    public static final Parcelable.Creator<T0> CREATOR = new C0354d0(6);

    /* renamed from: k, reason: collision with root package name */
    public final String f4941k;

    public T0(String str) {
        this.f4941k = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 15, this.f4941k);
        AbstractC2036a.m0(parcel, k02);
    }
}
