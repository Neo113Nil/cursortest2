package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class ServerPushProvisionRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzu();
    private final com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.tapandpay.issuer.UserAddress zzc;
    private final com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions zzd;

    ServerPushProvisionRequest(com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext pushProvisionSessionContext, java.lang.String str, com.google.android.gms.tapandpay.issuer.UserAddress userAddress, com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions extraOptions) {
        this.zza = pushProvisionSessionContext;
        this.zzb = str;
        this.zzc = userAddress;
        this.zzd = extraOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext pushProvisionSessionContext = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, pushProvisionSessionContext, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext zza;
        private java.lang.String zzb;
        private com.google.android.gms.tapandpay.issuer.UserAddress zzc;
        private com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions zzd;

        public com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest build() {
            return new com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        public com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.Builder setUserAddress(com.google.android.gms.tapandpay.issuer.UserAddress userAddress) {
            this.zzc = userAddress;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.Builder setSessionContext(com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext pushProvisionSessionContext) {
            this.zza = pushProvisionSessionContext;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.Builder setExtraOptions(com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions extraOptions) {
            this.zzd = extraOptions;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.Builder setDisplayName(java.lang.String str) {
            this.zzb = str;
            return this;
        }
    }

    public static class ExtraOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions> CREATOR = new com.google.android.gms.tapandpay.issuer.zzc();
        private boolean zza;
        private boolean zzb;

        public ExtraOptions(boolean z, boolean z2) {
            this.zza = z;
            this.zzb = z2;
        }

        public static com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions defaultOptions() {
            return new com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions(false, false);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, getServerSideAddressDeliveryEnabled());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, getVirtualCardsSetting());
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        public com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions setVirtualCardsSetting(boolean z) {
            this.zzb = z;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions setServerSideAddressDeliveryEnabled(boolean z) {
            this.zza = z;
            return this;
        }

        public boolean getVirtualCardsSetting() {
            return this.zzb;
        }

        public boolean getServerSideAddressDeliveryEnabled() {
            return this.zza;
        }
    }
}
