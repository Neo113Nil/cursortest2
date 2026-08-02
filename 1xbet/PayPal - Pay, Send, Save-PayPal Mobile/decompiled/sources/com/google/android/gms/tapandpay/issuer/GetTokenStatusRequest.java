package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class GetTokenStatusRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzh();
    final int zza;
    final java.lang.String zzb;
    final java.lang.String zzc;

    GetTokenStatusRequest(int i, java.lang.String str, java.lang.String str2) {
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

        public com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest build() {
            return new com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest.Builder setWalletId(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest.Builder setTokenServiceProvider(int i) {
            this.zza = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest.Builder setIssuerTokenId(java.lang.String str) {
            this.zzb = str;
            return this;
        }
    }
}
