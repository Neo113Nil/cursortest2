package m3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class r extends AbstractC2187a {
    public static final Parcelable.Creator<r> CREATOR = new C2.a(24);

    /* renamed from: k, reason: collision with root package name */
    public final int f18096k;

    /* renamed from: l, reason: collision with root package name */
    public final IBinder f18097l;

    /* renamed from: m, reason: collision with root package name */
    public final j3.b f18098m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18099n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f18100o;

    public r(int i, IBinder iBinder, j3.b bVar, boolean z3, boolean z5) {
        this.f18096k = i;
        this.f18097l = iBinder;
        this.f18098m = bVar;
        this.f18099n = z3;
        this.f18100o = z5;
    }

    public final boolean equals(Object obj) {
        Object g5;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f18098m.equals(rVar.f18098m)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f18097l;
        if (iBinder == null) {
            g5 = null;
        } else {
            int i = AbstractBinderC2091a.f18021l;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            g5 = queryLocalInterface instanceof i ? (i) queryLocalInterface : new G(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        IBinder iBinder2 = rVar.f18097l;
        if (iBinder2 != null) {
            int i5 = AbstractBinderC2091a.f18021l;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof i ? (i) queryLocalInterface2 : new G(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
        }
        return v.g(g5, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f18096k);
        AbstractC2036a.d0(parcel, 2, this.f18097l);
        AbstractC2036a.e0(parcel, 3, this.f18098m, i);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f18099n ? 1 : 0);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f18100o ? 1 : 0);
        AbstractC2036a.m0(parcel, k02);
    }
}
