package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzr> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzs();
    final com.google.android.gms.tapandpay.firstparty.CardInfo[] zza;
    final com.google.android.gms.tapandpay.firstparty.AccountInfo zzb;
    final java.lang.String zzc;
    final java.lang.String zzd;
    final android.util.SparseArray zze;
    final byte[] zzf;

    public zzr(com.google.android.gms.tapandpay.firstparty.CardInfo[] cardInfoArr, com.google.android.gms.tapandpay.firstparty.AccountInfo accountInfo, java.lang.String str, java.lang.String str2, android.util.SparseArray sparseArray, byte[] bArr) {
        this.zza = cardInfoArr;
        this.zzb = accountInfo;
        this.zzc = str;
        this.zzd = str2;
        this.zze = sparseArray;
        this.zzf = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 2, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringSparseArray(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
