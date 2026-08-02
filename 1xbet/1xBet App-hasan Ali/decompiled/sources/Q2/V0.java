package Q2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class V0 extends AbstractC2187a {
    public static final Parcelable.Creator<V0> CREATOR = new C0354d0(7);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4943k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4944l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4945m;

    public V0(J2.s sVar) {
        this(sVar.f2729a, sVar.f2730b, sVar.f2731c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f4943k ? 1 : 0);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f4944l ? 1 : 0);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f4945m ? 1 : 0);
        AbstractC2036a.m0(parcel, k02);
    }

    public V0(boolean z3, boolean z5, boolean z6) {
        this.f4943k = z3;
        this.f4944l = z5;
        this.f4945m = z6;
    }
}
