package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class C extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<C> CREATOR = new D();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    public C(String str, int i, int i2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = com.baseflow.permissionhandler.a.c(i) - 1;
        this.d = p.b(i2) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
