package Q;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i extends R.a {
    public static final Parcelable.Creator<i> CREATOR = new K.c(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f440a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f441b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f442c;

    /* renamed from: d, reason: collision with root package name */
    public final int f443d;

    /* renamed from: e, reason: collision with root package name */
    public final int f444e;

    public i(int i2, int i3, int i4, boolean z2, boolean z3) {
        this.f440a = i2;
        this.f441b = z2;
        this.f442c = z3;
        this.f443d = i3;
        this.f444e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.N(parcel, 1, 4);
        parcel.writeInt(this.f440a);
        V.a.N(parcel, 2, 4);
        parcel.writeInt(this.f441b ? 1 : 0);
        V.a.N(parcel, 3, 4);
        parcel.writeInt(this.f442c ? 1 : 0);
        V.a.N(parcel, 4, 4);
        parcel.writeInt(this.f443d);
        V.a.N(parcel, 5, 4);
        parcel.writeInt(this.f444e);
        V.a.M(parcel, L);
    }
}
