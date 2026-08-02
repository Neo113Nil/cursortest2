package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzz> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzaa();
    final int zza;
    final long zzb;

    public zzz(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzz)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzz zzzVar = (com.google.android.gms.tapandpay.firstparty.zzz) obj;
        return this.zza == zzzVar.zza && this.zzb == zzzVar.zzb;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Long.valueOf(this.zzb));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("result", java.lang.Integer.valueOf(this.zza)).add("timeMillis", java.lang.Long.valueOf(this.zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
