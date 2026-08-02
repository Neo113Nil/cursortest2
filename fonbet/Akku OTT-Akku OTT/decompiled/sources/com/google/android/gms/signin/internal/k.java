package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.internal.M;

/* loaded from: classes4.dex */
public final class k extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<k> CREATOR = new l();
    public final int a;
    public final C0852b b;

    @Nullable
    public final M c;

    public k(int i, C0852b c0852b, @Nullable M m) {
        this.a = i;
        this.b = c0852b;
        this.c = m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
