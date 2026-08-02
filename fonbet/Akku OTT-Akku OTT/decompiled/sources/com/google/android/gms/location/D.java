package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes4.dex */
public final class D extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<D> CREATOR = new E();
    public final String a;
    public final String b;
    public final String c;

    public D(String str, String str2, String str3) {
        this.c = str;
        this.a = str2;
        this.b = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 5, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
