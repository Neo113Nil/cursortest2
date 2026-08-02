package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class TokenizationOutcome extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.TokenizationOutcome> CREATOR = new com.google.android.gms.tapandpay.issuer.zzy();
    final int zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final java.lang.String zzd;

    TokenizationOutcome(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private int zza;
        private java.lang.String zzb;
        private java.lang.String zzc;
        private java.lang.String zzd;

        public com.google.android.gms.tapandpay.issuer.TokenizationOutcome build() {
            return new com.google.android.gms.tapandpay.issuer.TokenizationOutcome(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public com.google.android.gms.tapandpay.issuer.TokenizationOutcome.Builder setWalletId(java.lang.String str) {
            this.zzd = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.TokenizationOutcome.Builder setTokenStatus(int i) {
            this.zza = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.TokenizationOutcome.Builder setIssuerTokenId(java.lang.String str) {
            this.zzb = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.TokenizationOutcome.Builder setAuxIssuerTokenId(java.lang.String str) {
            this.zzc = str;
            return this;
        }
    }

    public final java.lang.String getWalletId() {
        return this.zzd;
    }

    public final int getTokenStatus() {
        return this.zza;
    }

    public final boolean getTokenResult() {
        return this.zza == 0;
    }

    public final java.lang.String getIssuerTokenId() {
        return this.zzb;
    }

    public final java.lang.String getAuxIssuerTokenId() {
        return this.zzc;
    }
}
