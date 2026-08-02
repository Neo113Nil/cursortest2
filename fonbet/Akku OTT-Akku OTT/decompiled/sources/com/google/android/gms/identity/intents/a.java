package com.google.android.gms.identity.intents;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator<UserAddressRequest> {
    @Override // android.os.Parcelable.Creator
    public final UserAddressRequest createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.y(parcel, readInt);
            } else {
                arrayList = b.k(parcel, readInt, CountrySpecification.CREATOR);
            }
        }
        b.l(parcel, z);
        UserAddressRequest userAddressRequest = new UserAddressRequest();
        userAddressRequest.a = arrayList;
        return userAddressRequest;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ UserAddressRequest[] newArray(int i) {
        return new UserAddressRequest[i];
    }
}
