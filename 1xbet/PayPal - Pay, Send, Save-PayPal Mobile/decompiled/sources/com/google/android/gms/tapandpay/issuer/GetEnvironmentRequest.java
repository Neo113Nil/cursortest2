package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class GetEnvironmentRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzf();
    private java.lang.String zza;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest((byte[]) null);
        }

        public final com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest.Builder setWalletId(java.lang.String str) {
            this.zza.zzb(str);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest getEnvironmentRequest) {
            com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest getEnvironmentRequest2 = new com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest((byte[]) null);
            this.zza = getEnvironmentRequest2;
            getEnvironmentRequest2.zzb(getEnvironmentRequest.zza());
        }

        public final com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest build() {
            return this.zza;
        }
    }

    GetEnvironmentRequest(java.lang.String str) {
        this.zza = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getWalletId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ GetEnvironmentRequest(byte[] bArr) {
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        this.zza = str;
    }

    final /* synthetic */ java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String getWalletId() {
        return this.zza;
    }

    private GetEnvironmentRequest() {
        throw null;
    }
}
