package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzd> CREATOR = new com.google.android.gms.tapandpay.firstparty.zze();
    final int zza;
    final com.google.android.gms.tapandpay.firstparty.zzb zzb;

    public zzd(int i, com.google.android.gms.tapandpay.firstparty.zzb zzbVar) {
        this.zza = i;
        this.zzb = zzbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
