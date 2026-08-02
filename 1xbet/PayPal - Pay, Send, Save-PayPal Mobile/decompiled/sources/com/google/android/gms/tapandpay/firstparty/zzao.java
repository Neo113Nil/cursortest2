package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzao extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzao> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzap();
    final int zza;
    final int zzb;

    zzao(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzao)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzao zzaoVar = (com.google.android.gms.tapandpay.firstparty.zzao) obj;
        return this.zza == zzaoVar.zza && this.zzb == zzaoVar.zzb;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("cdcvmExpirationInSecs", java.lang.Integer.valueOf(this.zza)).add("cdcvmTransactionLimit", java.lang.Integer.valueOf(this.zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
