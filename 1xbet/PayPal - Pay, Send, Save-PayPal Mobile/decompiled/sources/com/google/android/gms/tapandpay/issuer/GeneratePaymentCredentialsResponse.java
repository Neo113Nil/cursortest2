package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class GeneratePaymentCredentialsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse> CREATOR = new com.google.android.gms.tapandpay.issuer.zze();
    final byte[] zza;
    final byte[] zzb;
    final byte[] zzc;

    GeneratePaymentCredentialsResponse(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.zza = bArr;
        this.zzb = bArr2;
        this.zzc = bArr3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        byte[] bArr = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 1, bArr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        byte[] zza;
        byte[] zzb;
        byte[] zzc;

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse build() {
            return new com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse.Builder setOpaquePaymentCard(byte[] bArr) {
            this.zza = bArr;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse.Builder setGoogleOpaquePaymentCard(byte[] bArr) {
            this.zzb = bArr;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.GeneratePaymentCredentialsResponse.Builder setAuxiliaryOpaquePaymentCard(byte[] bArr) {
            this.zzc = bArr;
            return this;
        }
    }
}
