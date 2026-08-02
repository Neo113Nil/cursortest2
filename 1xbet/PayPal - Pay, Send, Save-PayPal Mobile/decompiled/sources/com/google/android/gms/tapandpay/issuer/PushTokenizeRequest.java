package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public class PushTokenizeRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.PushTokenizeRequest> CREATOR = new com.google.android.gms.tapandpay.issuer.zzp();
    final int zza;
    final int zzb;
    final byte[] zzc;
    final java.lang.String zzd;
    final java.lang.String zze;
    final com.google.android.gms.tapandpay.issuer.UserAddress zzf;
    final boolean zzg;
    final int[] zzh;
    final android.os.IBinder zzi;
    final com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo zzj;
    final com.google.android.gms.tapandpay.issuer.SupervisedUserInfo zzk;
    final java.lang.String[] zzl;
    final com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions zzm;

    PushTokenizeRequest(int i, int i2, byte[] bArr, java.lang.String str, java.lang.String str2, com.google.android.gms.tapandpay.issuer.UserAddress userAddress, boolean z, int[] iArr, android.os.IBinder iBinder, com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo cobadgedTokenInfo, com.google.android.gms.tapandpay.issuer.SupervisedUserInfo supervisedUserInfo, java.lang.String[] strArr, com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions pushTokenizeExtraOptions) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = bArr;
        this.zzd = str;
        this.zze = str2;
        this.zzf = userAddress;
        this.zzg = z;
        this.zzh = iArr;
        this.zzi = iBinder;
        this.zzj = cobadgedTokenInfo;
        this.zzk = supervisedUserInfo;
        this.zzl = strArr;
        this.zzm = pushTokenizeExtraOptions;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.issuer.PushTokenizeRequest)) {
            return false;
        }
        com.google.android.gms.tapandpay.issuer.PushTokenizeRequest pushTokenizeRequest = (com.google.android.gms.tapandpay.issuer.PushTokenizeRequest) obj;
        return this.zza == pushTokenizeRequest.zza && this.zzb == pushTokenizeRequest.zzb && java.util.Arrays.equals(this.zzc, pushTokenizeRequest.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, pushTokenizeRequest.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, pushTokenizeRequest.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, pushTokenizeRequest.zzf) && this.zzg == pushTokenizeRequest.zzg && java.util.Arrays.equals(this.zzh, pushTokenizeRequest.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, pushTokenizeRequest.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, pushTokenizeRequest.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzk, pushTokenizeRequest.zzk) && java.util.Arrays.equals(this.zzl, pushTokenizeRequest.zzl) && com.google.android.gms.common.internal.Objects.equal(this.zzm, pushTokenizeRequest.zzm);
    }

    public int hashCode() {
        int i = this.zza;
        int i2 = this.zzb;
        int hashCode = java.util.Arrays.hashCode(this.zzc);
        java.lang.String str = this.zzd;
        java.lang.String str2 = this.zze;
        com.google.android.gms.tapandpay.issuer.UserAddress userAddress = this.zzf;
        boolean z = this.zzg;
        int hashCode2 = java.util.Arrays.hashCode(this.zzh);
        android.os.IBinder iBinder = this.zzi;
        com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo cobadgedTokenInfo = this.zzj;
        com.google.android.gms.tapandpay.issuer.SupervisedUserInfo supervisedUserInfo = this.zzk;
        int hashCode3 = java.util.Arrays.hashCode(this.zzl);
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(hashCode), str, str2, userAddress, java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(hashCode2), iBinder, cobadgedTokenInfo, supervisedUserInfo, java.lang.Integer.valueOf(hashCode3), this.zzm);
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("network", java.lang.Integer.valueOf(this.zza)).add("tokenServiceProvider", java.lang.Integer.valueOf(this.zzb)).add("opaquePaymentCard", java.util.Arrays.toString(this.zzc)).add("lastDigits", this.zzd).add("displayName", this.zze).add("userAddress", this.zzf).add("isTransit", java.lang.Boolean.valueOf(this.zzg)).add("supportedCallbackRequestTypes", java.util.Arrays.toString(this.zzh)).add("pushTokenizeCallbacksBinder", this.zzi).add("cobadgedTokenInfo", this.zzj).add("supervisedUserInfo", this.zzk).add("supportedTokenRequestorIds", java.util.Arrays.toString(this.zzl)).add("pushTokenizeExtraOptions", this.zzm).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 9, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 10, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 13, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public static class Builder {
        private int zza;
        private int zzb;
        private byte[] zzc;
        private java.lang.String zzd;
        private java.lang.String zze;
        private com.google.android.gms.tapandpay.issuer.UserAddress zzf;
        private boolean zzg;
        private java.util.concurrent.Executor zzh;
        private com.google.android.gms.tapandpay.issuer.WalletAvailabilityChecker zzi;
        private com.google.android.gms.tapandpay.issuer.PaymentCredentialsGenerator zzj;
        private com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo zzk;
        private com.google.android.gms.tapandpay.issuer.SupervisedUserInfo zzl;
        private com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions zzm;

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest build() {
            com.google.android.gms.tapandpay.issuer.PushTokenizeCallbacks tryCreate = com.google.android.gms.tapandpay.issuer.PushTokenizeCallbacks.tryCreate(this.zzh, this.zzi, this.zzj, this.zzk);
            int i = this.zza;
            int i2 = this.zzb;
            byte[] bArr = this.zzc;
            java.lang.String str = this.zzd;
            java.lang.String str2 = this.zze;
            com.google.android.gms.tapandpay.issuer.UserAddress userAddress = this.zzf;
            boolean z = this.zzg;
            int[] supportedCallbackRequestTypes = tryCreate == null ? new int[0] : tryCreate.getSupportedCallbackRequestTypes();
            if (tryCreate == null) {
                tryCreate = null;
            }
            com.google.android.gms.tapandpay.issuer.PushTokenizeCallbacks pushTokenizeCallbacks = tryCreate;
            com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo cobadgedTokenInfo = this.zzk;
            com.google.android.gms.tapandpay.issuer.SupervisedUserInfo supervisedUserInfo = this.zzl;
            com.google.android.gms.tapandpay.issuer.PaymentCredentialsGenerator paymentCredentialsGenerator = this.zzj;
            java.lang.String[] strArr = paymentCredentialsGenerator == null ? new java.lang.String[0] : (java.lang.String[]) paymentCredentialsGenerator.getSupportedTokenRequestorIds().toArray(new java.lang.String[0]);
            com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions pushTokenizeExtraOptions = this.zzm;
            if (pushTokenizeExtraOptions == null) {
                pushTokenizeExtraOptions = com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions.defaultOptions();
            }
            return new com.google.android.gms.tapandpay.issuer.PushTokenizeRequest(i, i2, bArr, str, str2, userAddress, z, supportedCallbackRequestTypes, pushTokenizeCallbacks, cobadgedTokenInfo, supervisedUserInfo, strArr, pushTokenizeExtraOptions);
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setWalletAvailabilityChecker(com.google.android.gms.tapandpay.issuer.WalletAvailabilityChecker walletAvailabilityChecker) {
            this.zzi = walletAvailabilityChecker;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setUserAddress(com.google.android.gms.tapandpay.issuer.UserAddress userAddress) {
            this.zzf = userAddress;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setTokenServiceProvider(int i) {
            this.zzb = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setSupervisedUserInfo(com.google.android.gms.tapandpay.issuer.SupervisedUserInfo supervisedUserInfo) {
            this.zzl = supervisedUserInfo;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setPushTokenizeExtraOptions(com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions pushTokenizeExtraOptions) {
            this.zzm = pushTokenizeExtraOptions;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setPaymentCredentialsGenerator(com.google.android.gms.tapandpay.issuer.PaymentCredentialsGenerator paymentCredentialsGenerator) {
            this.zzj = paymentCredentialsGenerator;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setOpaquePaymentCard(byte[] bArr) {
            this.zzc = bArr;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setNetwork(int i) {
            this.zza = i;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setLastDigits(java.lang.String str) {
            this.zzd = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setIsTransit(boolean z) {
            this.zzg = z;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setDisplayName(java.lang.String str) {
            this.zze = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setCobadgedTokenInfo(com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo cobadgedTokenInfo) {
            this.zzk = cobadgedTokenInfo;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.Builder setCallbackRequestExecutor(java.util.concurrent.Executor executor) {
            this.zzh = executor;
            return this;
        }
    }
}
