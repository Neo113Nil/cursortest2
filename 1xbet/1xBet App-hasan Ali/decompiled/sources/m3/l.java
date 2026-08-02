package m3;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class l extends AbstractC2187a {
    public static final Parcelable.Creator<l> CREATOR = new C2.a(25);

    /* renamed from: k, reason: collision with root package name */
    public final int f18079k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18080l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18081m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18082n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18083o;

    public l(int i, int i5, int i6, boolean z3, boolean z5) {
        this.f18079k = i;
        this.f18080l = z3;
        this.f18081m = z5;
        this.f18082n = i5;
        this.f18083o = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f18079k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f18080l ? 1 : 0);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f18081m ? 1 : 0);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f18082n);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f18083o);
        AbstractC2036a.m0(parcel, k02);
    }
}
