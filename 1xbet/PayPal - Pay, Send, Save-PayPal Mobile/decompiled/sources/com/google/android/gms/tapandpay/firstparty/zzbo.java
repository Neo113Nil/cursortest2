package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzbo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzbo> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzbp();
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;

    zzbo(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzbo)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzbo zzboVar = (com.google.android.gms.tapandpay.firstparty.zzbo) obj;
        return this.zza == zzboVar.zza && this.zzb == zzboVar.zzb && this.zzc == zzboVar.zzc && this.zzd == zzboVar.zzd;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("transactionDelivery", java.lang.Integer.valueOf(this.zza)).add("transactionLimit", java.lang.Integer.valueOf(this.zzb)).add("supportedTransactions", java.lang.Integer.valueOf(this.zzc)).add("deliveryPreference", java.lang.Integer.valueOf(this.zzd)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
