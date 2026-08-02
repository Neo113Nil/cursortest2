package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzbl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzbl> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzbm();
    final java.lang.String zza;
    final int zzb;

    zzbl(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzbl)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzbl zzblVar = (com.google.android.gms.tapandpay.firstparty.zzbl) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzblVar.zza) && this.zzb == zzblVar.zzb;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, java.lang.Integer.valueOf(this.zzb));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("tokenReferenceId", this.zza).add("tokenProvider", java.lang.Integer.valueOf(this.zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
