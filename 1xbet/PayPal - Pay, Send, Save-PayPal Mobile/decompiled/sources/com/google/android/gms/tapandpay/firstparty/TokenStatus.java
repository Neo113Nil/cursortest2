package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class TokenStatus extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.TokenStatus> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzbn();
    final com.google.android.gms.tapandpay.firstparty.zzbl zza;
    final int zzb;
    final boolean zzc;
    final com.google.android.gms.tapandpay.firstparty.zzbl zzd;

    TokenStatus(com.google.android.gms.tapandpay.firstparty.zzbl zzblVar, int i, boolean z, com.google.android.gms.tapandpay.firstparty.zzbl zzblVar2) {
        this.zza = zzblVar;
        this.zzb = i;
        this.zzc = z;
        this.zzd = zzblVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.TokenStatus)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.TokenStatus tokenStatus = (com.google.android.gms.tapandpay.firstparty.TokenStatus) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, tokenStatus.zza) && this.zzb == tokenStatus.zzb && this.zzc == tokenStatus.zzc && com.google.android.gms.common.internal.Objects.equal(this.zzd, tokenStatus.zzd);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb), java.lang.Boolean.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("tokenReference", this.zza).add("tokenState", java.lang.Integer.valueOf(this.zzb)).add("isSelected", java.lang.Boolean.valueOf(this.zzc)).add("auxiliaryTokenReference", this.zzd).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
