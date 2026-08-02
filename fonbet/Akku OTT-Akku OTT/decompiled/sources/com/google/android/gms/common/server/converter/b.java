package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class b extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public final int a;
    public final a b;

    public b(int i, a aVar) {
        this.a = i;
        this.b = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public b(a aVar) {
        this.a = 1;
        this.b = aVar;
    }
}
