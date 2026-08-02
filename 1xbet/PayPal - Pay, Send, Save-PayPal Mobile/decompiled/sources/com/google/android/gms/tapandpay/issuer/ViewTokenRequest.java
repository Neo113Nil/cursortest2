package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class ViewTokenRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.ViewTokenRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzab();
    final java.lang.String zza;
    final int zzb;
    final java.lang.String zzc;

    ViewTokenRequest(java.lang.String str, int i, java.lang.String str2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private java.lang.String zza;
        private int zzb;
        private java.lang.String zzc;

        public com.google.android.gms.tapandpay.issuer.ViewTokenRequest build() {
            return new com.google.android.gms.tapandpay.issuer.ViewTokenRequest(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.tapandpay.issuer.ViewTokenRequest.Builder setWalletId(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.ViewTokenRequest.Builder setTokenServiceProvider(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.ViewTokenRequest.Builder setIssuerTokenId(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }
}
