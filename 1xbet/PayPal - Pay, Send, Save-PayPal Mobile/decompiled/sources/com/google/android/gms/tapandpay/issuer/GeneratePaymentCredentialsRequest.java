package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class GeneratePaymentCredentialsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzd();
    final java.lang.String zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final java.lang.String zzd;
    final boolean zze;
    final boolean zzf;

    GeneratePaymentCredentialsRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private java.lang.String zza;
        private java.lang.String zzb;
        private java.lang.String zzc;
        private java.lang.String zzd;
        private boolean zze;
        private boolean zzf;

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest build() {
            return new com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest.Builder setWalletId(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest.Builder setTokenRequestorId(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest.Builder setStableHardwareId(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest.Builder setServerSessionId(java.lang.String str) {
            this.zzd = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest.Builder setGoogleOpaquePaymentCardRequested(boolean z) {
            this.zze = z;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsRequest.Builder setAuxiliaryOpaquePaymentCardRequested(boolean z) {
            this.zzf = z;
            return this;
        }
    }

    public java.lang.String getWalletId() {
        return this.zzb;
    }

    public java.lang.String getTokenRequestorId() {
        return this.zzc;
    }

    public java.lang.String getStableHardwareId() {
        return this.zza;
    }

    public java.lang.String getServerSessionId() {
        return this.zzd;
    }

    public boolean getGoogleOpaquePaymentCardRequested() {
        return this.zze;
    }

    public boolean getAuxiliaryOpaquePaymentCardRequested() {
        return this.zzf;
    }
}
