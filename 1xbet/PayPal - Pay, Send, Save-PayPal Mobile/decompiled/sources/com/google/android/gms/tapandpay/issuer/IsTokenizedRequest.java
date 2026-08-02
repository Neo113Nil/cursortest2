package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class IsTokenizedRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.IsTokenizedRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzj();
    final java.lang.String zza;
    final int zzb;
    final int zzc;
    final java.lang.String zzd;
    final java.lang.String zze;

    IsTokenizedRequest(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str2;
        this.zze = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        java.lang.String zza;
        private java.lang.String zzb;
        private int zzc;
        private int zzd;
        private java.lang.String zze;

        public com.google.android.gms.tapandpay.issuer.IsTokenizedRequest build() {
            return new com.google.android.gms.tapandpay.issuer.IsTokenizedRequest(this.zzb, this.zzc, this.zzd, this.zze, this.zza);
        }

        public com.google.android.gms.tapandpay.issuer.IsTokenizedRequest.Builder setWalletId(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.IsTokenizedRequest.Builder setTokenServiceProvider(int i) {
            this.zzd = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.IsTokenizedRequest.Builder setNetwork(int i) {
            this.zzc = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.IsTokenizedRequest.Builder setIssuerName(java.lang.String str) {
            this.zze = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.IsTokenizedRequest.Builder setIdentifier(java.lang.String str) {
            this.zzb = str;
            return this;
        }
    }
}
