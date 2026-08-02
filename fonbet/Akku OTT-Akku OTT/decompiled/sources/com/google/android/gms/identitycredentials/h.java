package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class h implements Parcelable.Creator<GetCredentialRequest> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final GetCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int z = com.google.android.gms.common.internal.safeparcel.b.z(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        String str = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = com.google.android.gms.common.internal.safeparcel.b.k(parcel, readInt, e.CREATOR);
            } else if (c == 2) {
                bundle = com.google.android.gms.common.internal.safeparcel.b.b(parcel, readInt);
            } else if (c == 3) {
                str = com.google.android.gms.common.internal.safeparcel.b.g(parcel, readInt);
            } else if (c != 4) {
                com.google.android.gms.common.internal.safeparcel.b.y(parcel, readInt);
            } else {
                resultReceiver = (ResultReceiver) com.google.android.gms.common.internal.safeparcel.b.f(parcel, readInt, ResultReceiver.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.b.l(parcel, z);
        return new GetCredentialRequest(arrayList, bundle, str, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final GetCredentialRequest[] newArray(int i) {
        return new GetCredentialRequest[i];
    }
}
