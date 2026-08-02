package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class TokenizeRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.TokenizeRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzz();
    final int zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final int zzd;
    final java.lang.String zze;

    TokenizeRequest(int i, java.lang.String str, java.lang.String str2, int i2, java.lang.String str3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private int zza;
        private java.lang.String zzb;
        private java.lang.String zzc;
        private int zzd;
        private java.lang.String zze;

        public com.google.android.gms.tapandpay.issuer.TokenizeRequest build() {
            return new com.google.android.gms.tapandpay.issuer.TokenizeRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        public com.google.android.gms.tapandpay.issuer.TokenizeRequest.Builder setWalletId(java.lang.String str) {
            this.zze = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.TokenizeRequest.Builder setTokenServiceProvider(int i) {
            this.zza = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.TokenizeRequest.Builder setIssuerTokenId(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.TokenizeRequest.Builder setCardNetwork(int i) {
            this.zzd = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.TokenizeRequest.Builder setCardDisplayName(java.lang.String str) {
            this.zzc = str;
            return this;
        }
    }
}
