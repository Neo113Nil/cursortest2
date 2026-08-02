package Q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: Q2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387u0 extends AbstractC2187a {
    public static final Parcelable.Creator<C0387u0> CREATOR = new C0354d0(2);

    /* renamed from: k, reason: collision with root package name */
    public final int f5058k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5059l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5060m;

    /* renamed from: n, reason: collision with root package name */
    public C0387u0 f5061n;

    /* renamed from: o, reason: collision with root package name */
    public IBinder f5062o;

    public C0387u0(int i, String str, String str2, C0387u0 c0387u0, IBinder iBinder) {
        this.f5058k = i;
        this.f5059l = str;
        this.f5060m = str2;
        this.f5061n = c0387u0;
        this.f5062o = iBinder;
    }

    public final J2.b a() {
        C0387u0 c0387u0 = this.f5061n;
        return new J2.b(this.f5058k, this.f5059l, this.f5060m, c0387u0 != null ? new J2.b(c0387u0.f5058k, c0387u0.f5059l, c0387u0.f5060m, null) : null);
    }

    public final J2.m b() {
        InterfaceC0383s0 c0381r0;
        C0387u0 c0387u0 = this.f5061n;
        J2.b bVar = c0387u0 == null ? null : new J2.b(c0387u0.f5058k, c0387u0.f5059l, c0387u0.f5060m, null);
        IBinder iBinder = this.f5062o;
        if (iBinder == null) {
            c0381r0 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c0381r0 = queryLocalInterface instanceof InterfaceC0383s0 ? (InterfaceC0383s0) queryLocalInterface : new C0381r0(iBinder);
        }
        return new J2.m(this.f5058k, this.f5059l, this.f5060m, bVar, c0381r0 != null ? new J2.q(c0381r0) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f5058k);
        AbstractC2036a.f0(parcel, 2, this.f5059l);
        AbstractC2036a.f0(parcel, 3, this.f5060m);
        AbstractC2036a.e0(parcel, 4, this.f5061n, i);
        AbstractC2036a.d0(parcel, 5, this.f5062o);
        AbstractC2036a.m0(parcel, k02);
    }
}
