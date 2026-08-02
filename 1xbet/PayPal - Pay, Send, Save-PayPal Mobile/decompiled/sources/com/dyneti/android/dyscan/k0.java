package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class k0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.dyneti.android.dyscan.CreditCard(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.dyneti.android.dyscan.CreditCard[i];
    }
}
