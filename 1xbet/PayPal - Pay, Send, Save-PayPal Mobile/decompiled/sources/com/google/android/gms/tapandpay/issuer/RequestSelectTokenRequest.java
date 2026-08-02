package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class RequestSelectTokenRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzt();
    final int zza;
    final java.lang.String zzb;
    final java.lang.String zzc;

    RequestSelectTokenRequest(int i, java.lang.String str, java.lang.String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private int zza;
        private java.lang.String zzb;
        private java.lang.String zzc;

        public com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest build() {
            return new com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest.Builder setWalletId(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest.Builder setTokenServiceProvider(int i) {
            this.zza = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest.Builder setIssuerTokenId(java.lang.String str) {
            this.zzb = str;
            return this;
        }
    }
}
