package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class N extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<N> CREATOR = new O();
    public final boolean a;

    public N(boolean z) {
        this.a = Boolean.valueOf(z).booleanValue();
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof N) && this.a == ((N) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
