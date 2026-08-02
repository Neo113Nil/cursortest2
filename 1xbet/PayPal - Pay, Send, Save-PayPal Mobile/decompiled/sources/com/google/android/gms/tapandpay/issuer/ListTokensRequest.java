package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class ListTokensRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.ListTokensRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzk();
    private java.lang.String zza;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.issuer.ListTokensRequest zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.issuer.ListTokensRequest((byte[]) null);
        }

        public final com.google.android.gms.tapandpay.issuer.ListTokensRequest.Builder setWalletId(java.lang.String str) {
            this.zza.zzb(str);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.issuer.ListTokensRequest listTokensRequest) {
            com.google.android.gms.tapandpay.issuer.ListTokensRequest listTokensRequest2 = new com.google.android.gms.tapandpay.issuer.ListTokensRequest((byte[]) null);
            this.zza = listTokensRequest2;
            listTokensRequest2.zzb(listTokensRequest.zza());
        }

        public final com.google.android.gms.tapandpay.issuer.ListTokensRequest build() {
            return this.zza;
        }
    }

    ListTokensRequest(java.lang.String str) {
        this.zza = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.tapandpay.issuer.ListTokensRequest) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.tapandpay.issuer.ListTokensRequest) obj).zza);
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

    /* synthetic */ ListTokensRequest(byte[] bArr) {
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

    private ListTokensRequest() {
        throw null;
    }
}
