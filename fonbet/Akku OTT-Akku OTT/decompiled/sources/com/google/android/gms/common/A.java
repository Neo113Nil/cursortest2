package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

/* loaded from: classes4.dex */
public final class A extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<A> CREATOR = new B();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;

    public A(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) com.google.android.gms.dynamic.b.D(a.AbstractBinderC0114a.C(iBinder));
        this.e = z3;
        this.f = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.f(parcel, 4, new com.google.android.gms.dynamic.b(this.d));
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
