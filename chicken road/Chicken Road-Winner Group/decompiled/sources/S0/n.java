package S0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n extends T0.a {
    public static final Parcelable.Creator<n> CREATOR = new H.j(10);

    /* renamed from: a, reason: collision with root package name */
    public final int f1347a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f1348b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.b f1349c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1350d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1351e;

    public n(int i3, IBinder iBinder, P0.b bVar, boolean z3, boolean z4) {
        this.f1347a = i3;
        this.f1348b = iBinder;
        this.f1349c = bVar;
        this.f1350d = z3;
        this.f1351e = z4;
    }

    public final boolean equals(Object obj) {
        Object c3;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f1349c.equals(nVar.f1349c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.f1348b;
        if (iBinder == null) {
            c3 = null;
        } else {
            int i3 = AbstractBinderC0058a.f1298d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            c3 = queryLocalInterface instanceof e ? (e) queryLocalInterface : new C(iBinder);
        }
        IBinder iBinder2 = nVar.f1348b;
        if (iBinder2 != null) {
            int i4 = AbstractBinderC0058a.f1298d;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof e ? (e) queryLocalInterface2 : new C(iBinder2);
        }
        return r.e(c3, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f1347a);
        F2.b.L(parcel, 2, this.f1348b);
        F2.b.M(parcel, 3, this.f1349c, i3);
        F2.b.S(parcel, 4, 4);
        parcel.writeInt(this.f1350d ? 1 : 0);
        F2.b.S(parcel, 5, 4);
        parcel.writeInt(this.f1351e ? 1 : 0);
        F2.b.R(parcel, Q2);
    }
}
