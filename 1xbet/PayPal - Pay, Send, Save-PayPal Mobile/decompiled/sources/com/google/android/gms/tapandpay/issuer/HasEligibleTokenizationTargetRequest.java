package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class HasEligibleTokenizationTargetRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzi();
    private final java.lang.String zza;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;

    HasEligibleTokenizationTargetRequest(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private java.lang.String zza;
        private int zzb;
        private int zzc;
        private java.lang.String zzd;

        public com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest build() {
            return new com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest.Builder setTokenServiceProvider(int i) {
            this.zzc = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest.Builder setNetwork(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest.Builder setIssuerName(java.lang.String str) {
            this.zzd = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest.Builder setIdentifier(java.lang.String str) {
            this.zza = str;
            return this;
        }
    }
}
