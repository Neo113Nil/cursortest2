package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzaf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = b.t(parcel, readInt);
            } else if (c != 3) {
                b.y(parcel, readInt);
            } else {
                bundle = b.b(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new PaymentMethodTokenizationParameters(i, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentMethodTokenizationParameters[i];
    }
}
