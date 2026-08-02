package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class WalletCardIntent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent> CREATOR = new com.google.android.gms.tapandpay.quickaccesswallet.zzf();
    private java.lang.String zza;
    private java.lang.String zzb;
    private com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra[] zzc;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent(null);
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent.Builder setAction(java.lang.String str) {
            this.zza.zzd(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent.Builder setClassName(java.lang.String str) {
            this.zza.zzb(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent.Builder setExtras(com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra[] walletCardIntentExtraArr) {
            this.zza.zzf(walletCardIntentExtraArr);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent walletCardIntent) {
            com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent walletCardIntent2 = new com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent(null);
            this.zza = walletCardIntent2;
            walletCardIntent2.zzb(walletCardIntent.zza());
            walletCardIntent2.zzd(walletCardIntent.zzc());
            walletCardIntent2.zzf(walletCardIntent.zze());
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent build() {
            return this.zza;
        }
    }

    WalletCardIntent(java.lang.String str, java.lang.String str2, com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = walletCardIntentExtraArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent)) {
            return false;
        }
        com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent walletCardIntent = (com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, walletCardIntent.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, walletCardIntent.zzb) && java.util.Arrays.equals(this.zzc, walletCardIntent.zzc);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getClassName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getAction(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, getExtras(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ WalletCardIntent(byte[] bArr) {
    }

    final /* synthetic */ void zzf(com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra[] walletCardIntentExtraArr) {
        this.zzc = walletCardIntentExtraArr;
    }

    final /* synthetic */ com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra[] zze() {
        return this.zzc;
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

    public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra[] getExtras() {
        return this.zzc;
    }

    public final java.lang.String getClassName() {
        return this.zza;
    }

    public final java.lang.String getAction() {
        return this.zzb;
    }

    private WalletCardIntent() {
        throw null;
    }
}
