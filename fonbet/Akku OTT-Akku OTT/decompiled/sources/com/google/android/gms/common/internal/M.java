package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.internal.InterfaceC0869k;

/* loaded from: classes4.dex */
public final class M extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<M> CREATOR = new N();
    public final int a;

    @Nullable
    public final IBinder b;
    public final C0852b c;
    public final boolean d;
    public final boolean e;

    public M(int i, @Nullable IBinder iBinder, C0852b c0852b, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = c0852b;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        Object q0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        if (!this.c.equals(m.c)) {
            return false;
        }
        Object obj2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            q0Var = null;
        } else {
            int i = InterfaceC0869k.a.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            q0Var = queryLocalInterface instanceof InterfaceC0869k ? (InterfaceC0869k) queryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = m.b;
        if (iBinder2 != null) {
            int i2 = InterfaceC0869k.a.a;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            obj2 = queryLocalInterface2 instanceof InterfaceC0869k ? (InterfaceC0869k) queryLocalInterface2 : new q0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return C0874p.a(q0Var, obj2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.f(parcel, 2, this.b);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
