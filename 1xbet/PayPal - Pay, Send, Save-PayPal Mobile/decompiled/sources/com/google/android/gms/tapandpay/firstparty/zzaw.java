package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzaw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzaw> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzax();
    final boolean zza;
    final boolean zzb;
    final boolean zzc;
    final int zzd;

    public zzaw(boolean z, boolean z2, boolean z3, int i) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzaw)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzaw zzawVar = (com.google.android.gms.tapandpay.firstparty.zzaw) obj;
        return this.zza == zzawVar.zza && this.zzb == zzawVar.zzb && this.zzc == zzawVar.zzc && this.zzd == zzawVar.zzd;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza), java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("transactions", java.lang.Boolean.valueOf(this.zza)).add("plasticTransactions", java.lang.Boolean.valueOf(this.zzb)).add("promotions", java.lang.Boolean.valueOf(this.zzc)).add("bitMask", java.lang.Integer.valueOf(this.zzd)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
