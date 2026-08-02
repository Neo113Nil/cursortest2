package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class AccountInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.AccountInfo> CREATOR = new com.google.android.gms.tapandpay.firstparty.zza();
    final java.lang.String zza;
    final java.lang.String zzb;
    final int zzc;

    AccountInfo(java.lang.String str, java.lang.String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.AccountInfo)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.AccountInfo accountInfo = (com.google.android.gms.tapandpay.firstparty.AccountInfo) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, accountInfo.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, accountInfo.zzb) && this.zzc == accountInfo.zzc;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Integer.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("accountId", this.zza).add("accountName", this.zzb).add("accountType", java.lang.Integer.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
