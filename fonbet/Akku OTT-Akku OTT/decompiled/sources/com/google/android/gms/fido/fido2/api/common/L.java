package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class L extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<L> CREATOR = new M();
    public final long a;

    public L(long j) {
        this.a = Long.valueOf(j).longValue();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof L) && this.a == ((L) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
