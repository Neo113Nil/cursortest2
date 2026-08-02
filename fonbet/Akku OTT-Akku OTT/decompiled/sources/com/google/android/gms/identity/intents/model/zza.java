package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zza implements Parcelable.Creator<CountrySpecification> {
    @Override // android.os.Parcelable.Creator
    public final CountrySpecification createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.y(parcel, readInt);
            } else {
                str = b.g(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new CountrySpecification(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CountrySpecification[] newArray(int i) {
        return new CountrySpecification[i];
    }
}
