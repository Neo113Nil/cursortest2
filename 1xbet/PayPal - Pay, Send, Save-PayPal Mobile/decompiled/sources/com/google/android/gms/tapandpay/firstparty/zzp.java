package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzp> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzq();
    final com.google.android.gms.tapandpay.firstparty.CardInfo[] zza;

    public zzp(com.google.android.gms.tapandpay.firstparty.CardInfo[] cardInfoArr) {
        this.zza = cardInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
