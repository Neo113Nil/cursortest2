package K;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends R.a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f195b;

    public b(String str, int i2) {
        this.f194a = str;
        this.f195b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.I(parcel, 1, this.f194a);
        V.a.N(parcel, 2, 4);
        parcel.writeInt(this.f195b);
        V.a.M(parcel, L);
    }
}
