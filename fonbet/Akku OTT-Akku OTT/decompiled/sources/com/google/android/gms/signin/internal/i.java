package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.K;

/* loaded from: classes4.dex */
public final class i extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<i> CREATOR = new j();
    public final int a;
    public final K b;

    public i(int i, K k) {
        this.a = i;
        this.b = k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
