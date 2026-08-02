package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0854d;

/* loaded from: classes4.dex */
public final class f0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();
    public Bundle a;
    public C0854d[] b;
    public int c;

    @Nullable
    public C0864f d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.o(parcel, 2, this.b, i);
        int i2 = this.c;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(i2);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 4, this.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
