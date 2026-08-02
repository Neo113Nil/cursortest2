package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class ReachableDeviceWalletInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo> CREATOR = new com.google.android.gms.tapandpay.issuer.zzr();
    private java.lang.String zza;
    private java.lang.String zzb;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo(null);
        }

        public final com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo.Builder setDisplayName(java.lang.String str) {
            this.zza.zzd(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo.Builder setWalletId(java.lang.String str) {
            this.zza.zzb(str);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo reachableDeviceWalletInfo) {
            com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo reachableDeviceWalletInfo2 = new com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo(null);
            this.zza = reachableDeviceWalletInfo2;
            reachableDeviceWalletInfo2.zzb(reachableDeviceWalletInfo.zza());
            reachableDeviceWalletInfo2.zzd(reachableDeviceWalletInfo.zzc());
        }

        public final com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo build() {
            return this.zza;
        }
    }

    ReachableDeviceWalletInfo(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo)) {
            return false;
        }
        com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo reachableDeviceWalletInfo = (com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, reachableDeviceWalletInfo.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, reachableDeviceWalletInfo.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getWalletId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ ReachableDeviceWalletInfo(byte[] bArr) {
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zzb = str;
    }

    final /* synthetic */ java.lang.String zzc() {
        return this.zzb;
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

    public final java.lang.String getDisplayName() {
        return this.zzb;
    }

    private ReachableDeviceWalletInfo() {
        throw null;
    }
}
