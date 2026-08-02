package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class GetQuickAccessWalletConfigRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest> CREATOR = new com.google.android.gms.tapandpay.quickaccesswallet.zzb();
    private int zza;
    private android.accounts.Account zzb;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest(null);
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest.Builder setAccount(android.accounts.Account account) {
            this.zza.zzd(account);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest.Builder setSource(int i) {
            this.zza.zzb(i);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest) {
            com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest2 = new com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest(null);
            this.zza = getQuickAccessWalletConfigRequest2;
            getQuickAccessWalletConfigRequest2.zzb(getQuickAccessWalletConfigRequest.zza());
            getQuickAccessWalletConfigRequest2.zzd(getQuickAccessWalletConfigRequest.zzc());
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest build() {
            return this.zza;
        }
    }

    GetQuickAccessWalletConfigRequest(int i, android.accounts.Account account) {
        this.zza = i;
        this.zzb = account;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest)) {
            return false;
        }
        com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest = (com.google.android.gms.tapandpay.quickaccesswallet.GetQuickAccessWalletConfigRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(getQuickAccessWalletConfigRequest.zza)) && com.google.android.gms.common.internal.Objects.equal(this.zzb, getQuickAccessWalletConfigRequest.zzb);
    }

    public final int hashCode() {
        int i = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getSource());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ GetQuickAccessWalletConfigRequest(byte[] bArr) {
    }

    final /* synthetic */ void zzd(android.accounts.Account account) {
        this.zzb = account;
    }

    final /* synthetic */ android.accounts.Account zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    public final int getSource() {
        return this.zza;
    }

    public final android.accounts.Account getAccount() {
        return this.zzb;
    }

    private GetQuickAccessWalletConfigRequest() {
        throw null;
    }
}
