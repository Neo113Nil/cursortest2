package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new Z2.a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f11345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConnectionResult f11346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11348e;

    public zav(int i7, IBinder iBinder, ConnectionResult connectionResult, boolean z4, boolean z7) {
        this.f11344a = i7;
        this.f11345b = iBinder;
        this.f11346c = connectionResult;
        this.f11347d = z4;
        this.f11348e = z7;
    }

    public final boolean equals(Object obj) {
        Object p5;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (this.f11346c.equals(zavVar.f11346c)) {
            Object p7 = null;
            IBinder iBinder = this.f11345b;
            if (iBinder == null) {
                p5 = null;
            } else {
                int i7 = AbstractBinderC0805a.f11301a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                p5 = iInterfaceQueryLocalInterface instanceof InterfaceC0816l ? (InterfaceC0816l) iInterfaceQueryLocalInterface : new P(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            IBinder iBinder2 = zavVar.f11345b;
            if (iBinder2 != null) {
                int i8 = AbstractBinderC0805a.f11301a;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                p7 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0816l ? (InterfaceC0816l) iInterfaceQueryLocalInterface2 : new P(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            if (D.m(p5, p7)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11344a);
        Y4.D.n0(parcel, 2, this.f11345b);
        Y4.D.r0(parcel, 3, this.f11346c, i7, false);
        Y4.D.B0(parcel, 4, 4);
        parcel.writeInt(this.f11347d ? 1 : 0);
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(this.f11348e ? 1 : 0);
        Y4.D.z0(iX0, parcel);
    }
}
