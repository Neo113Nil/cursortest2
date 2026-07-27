package o1;

import a.AbstractC0169a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p1.AbstractC1380a;

/* loaded from: classes.dex */
public final class q extends AbstractC1380a {
    public static final Parcelable.Creator<q> CREATOR = new B1.c(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f11589a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f11590b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.b f11591c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11592d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11593e;

    public q(int i2, IBinder iBinder, l1.b bVar, boolean z, boolean z5) {
        this.f11589a = i2;
        this.f11590b = iBinder;
        this.f11591c = bVar;
        this.f11592d = z;
        this.f11593e = z5;
    }

    public final boolean equals(Object obj) {
        Object c1362g;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f11591c.equals(qVar.f11591c)) {
            Object obj2 = null;
            IBinder iBinder = this.f11590b;
            if (iBinder == null) {
                c1362g = null;
            } else {
                int i2 = AbstractBinderC1363a.f11525e;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c1362g = queryLocalInterface instanceof InterfaceC1369g ? (InterfaceC1369g) queryLocalInterface : new C1362G(iBinder);
            }
            IBinder iBinder2 = qVar.f11590b;
            if (iBinder2 != null) {
                int i3 = AbstractBinderC1363a.f11525e;
                IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                obj2 = queryLocalInterface2 instanceof InterfaceC1369g ? (InterfaceC1369g) queryLocalInterface2 : new C1362G(iBinder2);
            }
            if (u.j(c1362g, obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int R5 = AbstractC0169a.R(parcel, 20293);
        AbstractC0169a.T(parcel, 1, 4);
        parcel.writeInt(this.f11589a);
        AbstractC0169a.M(parcel, 2, this.f11590b);
        AbstractC0169a.N(parcel, 3, this.f11591c, i2);
        AbstractC0169a.T(parcel, 4, 4);
        parcel.writeInt(this.f11592d ? 1 : 0);
        AbstractC0169a.T(parcel, 5, 4);
        parcel.writeInt(this.f11593e ? 1 : 0);
        AbstractC0169a.S(parcel, R5);
    }
}
