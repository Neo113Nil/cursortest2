package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList<Integer> arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z3 = b.m(parcel, readInt);
                    break;
                case 2:
                    z4 = b.m(parcel, readInt);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) b.f(parcel, readInt, CardRequirements.CREATOR);
                    break;
                case 4:
                    z5 = b.m(parcel, readInt);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) b.f(parcel, readInt, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = b.e(parcel, readInt);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) b.f(parcel, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case '\b':
                    transactionInfo = (TransactionInfo) b.f(parcel, readInt, TransactionInfo.CREATOR);
                    break;
                case '\t':
                    z2 = b.m(parcel, readInt);
                    break;
                case '\n':
                    str = b.g(parcel, readInt);
                    break;
                case 11:
                    bundle = b.b(parcel, readInt);
                    break;
                case '\f':
                    bArr = b.c(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new PaymentDataRequest(z3, z4, cardRequirements, z5, shippingAddressRequirements, arrayList, paymentMethodTokenizationParameters, transactionInfo, z2, str, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentDataRequest[i];
    }
}
