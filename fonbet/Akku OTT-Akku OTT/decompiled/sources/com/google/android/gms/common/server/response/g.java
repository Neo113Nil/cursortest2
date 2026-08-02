package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes4.dex */
public final class g extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<g> CREATOR = new e();
    public final int a;
    public final String b;
    public final a.C0113a c;

    public g(a.C0113a c0113a, String str, int i) {
        this.a = i;
        this.b = str;
        this.c = c0113a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public g(a.C0113a c0113a, String str) {
        this.a = 1;
        this.b = str;
        this.c = c0113a;
    }
}
