package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzaj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzaj> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzak();
    final boolean zza;
    final boolean zzb;
    final boolean zzc;
    final boolean zzd;

    public zzaj(boolean z, boolean z2, boolean z3, boolean z4) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
