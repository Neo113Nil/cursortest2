package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class M extends AbstractC2187a {
    public static final Parcelable.Creator<M> CREATOR = new C0354d0(0);

    /* renamed from: k, reason: collision with root package name */
    public final String f4931k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4932l;

    public M(String str, String str2) {
        this.f4931k = str;
        this.f4932l = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f4931k);
        AbstractC2036a.f0(parcel, 2, this.f4932l);
        AbstractC2036a.m0(parcel, k02);
    }
}
