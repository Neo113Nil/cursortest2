package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class GetStableHardwareIdRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzg();
    private java.lang.String zza;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest((byte[]) null);
        }

        public final com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest.Builder setWalletId(java.lang.String str) {
            this.zza.zzb(str);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest getStableHardwareIdRequest) {
            com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest getStableHardwareIdRequest2 = new com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest((byte[]) null);
            this.zza = getStableHardwareIdRequest2;
            getStableHardwareIdRequest2.zzb(getStableHardwareIdRequest.zza());
        }

        public final com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest build() {
            return this.zza;
        }
    }

    GetStableHardwareIdRequest(java.lang.String str) {
        this.zza = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest) obj).zza);
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

    /* synthetic */ GetStableHardwareIdRequest(byte[] bArr) {
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

    private GetStableHardwareIdRequest() {
        throw null;
    }
}
