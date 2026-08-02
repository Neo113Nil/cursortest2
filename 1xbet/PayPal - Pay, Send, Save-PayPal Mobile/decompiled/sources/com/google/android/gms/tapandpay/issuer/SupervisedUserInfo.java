package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class SupervisedUserInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.SupervisedUserInfo> CREATOR = new com.google.android.gms.tapandpay.issuer.zzv();
    final java.lang.String zza;
    final com.google.android.gms.tapandpay.issuer.UserAddress zzb;
    final boolean zzc;

    SupervisedUserInfo(java.lang.String str, com.google.android.gms.tapandpay.issuer.UserAddress userAddress, boolean z) {
        this.zza = str;
        this.zzb = userAddress;
        this.zzc = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.issuer.SupervisedUserInfo)) {
            return false;
        }
        com.google.android.gms.tapandpay.issuer.SupervisedUserInfo supervisedUserInfo = (com.google.android.gms.tapandpay.issuer.SupervisedUserInfo) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, supervisedUserInfo.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, supervisedUserInfo.zzb) && this.zzc == supervisedUserInfo.zzc;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Boolean.valueOf(this.zzc));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("termsAndConditionsUrl", this.zza).add("parentAddress", this.zzb).add("supportsSupervisedDevices", java.lang.Boolean.valueOf(this.zzc)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private java.lang.String zza;
        private com.google.android.gms.tapandpay.issuer.UserAddress zzb;
        private boolean zzc;

        public com.google.android.gms.tapandpay.issuer.SupervisedUserInfo build() {
            return new com.google.android.gms.tapandpay.issuer.SupervisedUserInfo(this.zza, this.zzb, this.zzc);
        }

        public com.google.android.gms.tapandpay.issuer.SupervisedUserInfo.Builder setTermsAndConditionsUrl(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.SupervisedUserInfo.Builder setSupportsSupervisedDevices(boolean z) {
            this.zzc = z;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.SupervisedUserInfo.Builder setParentAddress(com.google.android.gms.tapandpay.issuer.UserAddress userAddress) {
            this.zzb = userAddress;
            return this;
        }
    }
}
