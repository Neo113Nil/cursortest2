package M2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class a extends AbstractC2187a {
    public static final Parcelable.Creator<a> CREATOR = new C2.a(5);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3604k;

    /* renamed from: l, reason: collision with root package name */
    public final IBinder f3605l;

    public a(boolean z3, IBinder iBinder) {
        this.f3604k = z3;
        this.f3605l = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f3604k ? 1 : 0);
        AbstractC2036a.d0(parcel, 2, this.f3605l);
        AbstractC2036a.m0(parcel, k02);
    }
}
