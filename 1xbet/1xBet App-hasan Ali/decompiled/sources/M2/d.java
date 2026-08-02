package M2;

import Q2.P;
import Q2.Q;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.P5;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class d extends AbstractC2187a {
    public static final Parcelable.Creator<d> CREATOR = new C2.a(6);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3612k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f3613l;

    /* renamed from: m, reason: collision with root package name */
    public final IBinder f3614m;

    public d(boolean z3, IBinder iBinder, IBinder iBinder2) {
        Q q5;
        this.f3612k = z3;
        if (iBinder != null) {
            int i = P5.f11064l;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            q5 = queryLocalInterface instanceof Q ? (Q) queryLocalInterface : new P(iBinder);
        } else {
            q5 = null;
        }
        this.f3613l = q5;
        this.f3614m = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f3612k ? 1 : 0);
        Q q5 = this.f3613l;
        AbstractC2036a.d0(parcel, 2, q5 == null ? null : q5.asBinder());
        AbstractC2036a.d0(parcel, 3, this.f3614m);
        AbstractC2036a.m0(parcel, k02);
    }
}
