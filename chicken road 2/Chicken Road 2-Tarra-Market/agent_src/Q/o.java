package Q;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o extends R.a {
    public static final Parcelable.Creator<o> CREATOR = new K.c(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f457a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f458b;

    /* renamed from: c, reason: collision with root package name */
    public final N.b f459c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f460d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f461e;

    public o(int i2, IBinder iBinder, N.b bVar, boolean z2, boolean z3) {
        this.f457a = i2;
        this.f458b = iBinder;
        this.f459c = bVar;
        this.f460d = z2;
        this.f461e = z3;
    }

    public final boolean equals(Object obj) {
        Object f2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f459c.equals(oVar.f459c)) {
            Object obj2 = null;
            IBinder iBinder = this.f458b;
            if (iBinder == null) {
                f2 = null;
            } else {
                int i2 = AbstractBinderC0003a.f399b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                f2 = queryLocalInterface instanceof InterfaceC0008f ? (InterfaceC0008f) queryLocalInterface : new F(iBinder);
            }
            IBinder iBinder2 = oVar.f458b;
            if (iBinder2 != null) {
                int i3 = AbstractBinderC0003a.f399b;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof InterfaceC0008f ? (InterfaceC0008f) queryLocalInterface2 : new F(iBinder2);
            }
            if (s.e(f2, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.N(parcel, 1, 4);
        parcel.writeInt(this.f457a);
        IBinder iBinder = this.f458b;
        if (iBinder != null) {
            int L2 = V.a.L(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            V.a.M(parcel, L2);
        }
        V.a.H(parcel, 3, this.f459c, i2);
        V.a.N(parcel, 4, 4);
        parcel.writeInt(this.f460d ? 1 : 0);
        V.a.N(parcel, 5, 4);
        parcel.writeInt(this.f461e ? 1 : 0);
        V.a.M(parcel, L);
    }
}
