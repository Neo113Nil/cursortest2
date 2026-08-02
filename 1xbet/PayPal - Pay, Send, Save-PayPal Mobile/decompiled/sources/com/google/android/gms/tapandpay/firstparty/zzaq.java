package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzaq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzaq> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzar();
    final boolean zza;
    final int zzb;
    final int zzc;
    final int zzd;
    final boolean zze;

    zzaq(boolean z, int i, int i2, int i3, boolean z2) {
        this.zza = z;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzaq)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzaq zzaqVar = (com.google.android.gms.tapandpay.firstparty.zzaq) obj;
        return this.zza == zzaqVar.zza && this.zzb == zzaqVar.zzb && this.zzd == zzaqVar.zzd && this.zzc == zzaqVar.zzc && this.zze == zzaqVar.zze;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zzc), java.lang.Boolean.valueOf(this.zze));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("requireCdcvmPassing", java.lang.Boolean.valueOf(this.zza)).add("cdcvmExpirationInSecs", java.lang.Integer.valueOf(this.zzb)).add("unlockedTapLimit", java.lang.Integer.valueOf(this.zzc)).add("cdcvmTapLimit", java.lang.Integer.valueOf(this.zzd)).add("prioritizeOnlinePinOverCdcvm", java.lang.Boolean.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
