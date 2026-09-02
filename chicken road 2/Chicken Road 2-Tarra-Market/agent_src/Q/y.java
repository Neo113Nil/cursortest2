package Q;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y extends R.a {
    public static final Parcelable.Creator<y> CREATOR = new K.c(11);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f480a;

    /* renamed from: b, reason: collision with root package name */
    public N.d[] f481b;

    /* renamed from: c, reason: collision with root package name */
    public int f482c;

    /* renamed from: d, reason: collision with root package name */
    public C0006d f483d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        Bundle bundle = this.f480a;
        if (bundle != null) {
            int L2 = V.a.L(parcel, 1);
            parcel.writeBundle(bundle);
            V.a.M(parcel, L2);
        }
        V.a.J(parcel, 2, this.f481b, i2);
        V.a.N(parcel, 3, 4);
        parcel.writeInt(this.f482c);
        V.a.H(parcel, 4, this.f483d, i2);
        V.a.M(parcel, L);
    }
}
