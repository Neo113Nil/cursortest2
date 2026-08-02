package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class I0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<I0> CREATOR = new J0();

    public final boolean equals(@Nullable Object obj) {
        return obj instanceof I0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
