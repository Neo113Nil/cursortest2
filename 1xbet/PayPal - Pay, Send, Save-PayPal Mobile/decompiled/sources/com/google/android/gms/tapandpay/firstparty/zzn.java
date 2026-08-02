package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzn extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzn> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzo();
    final com.google.android.gms.tapandpay.firstparty.AccountInfo zza;

    public zzn(com.google.android.gms.tapandpay.firstparty.AccountInfo accountInfo) {
        this.zza = accountInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
