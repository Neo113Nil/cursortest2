package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        CreditCardExpirationDate creditCardExpirationDate = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = b.g(parcel, readInt);
            } else if (c != 2) {
                b.y(parcel, readInt);
            } else {
                creditCardExpirationDate = (CreditCardExpirationDate) b.f(parcel, readInt, CreditCardExpirationDate.CREATOR);
            }
        }
        b.l(parcel, z);
        return new PaymentCardRecognitionResult(str, creditCardExpirationDate);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentCardRecognitionResult[i];
    }
}
