package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class SetQuickAccessWalletCardsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest> CREATOR = new com.google.android.gms.tapandpay.quickaccesswallet.zze();
    private int zza;
    private android.accounts.Account zzb;
    private com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[] zzc;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest(null);
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest.Builder setAccount(android.accounts.Account account) {
            this.zza.zzd(account);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest.Builder setCards(com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[] quickAccessWalletCardArr) {
            this.zza.zzf(quickAccessWalletCardArr);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest.Builder setSource(int i) {
            this.zza.zzb(i);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest) {
            com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest2 = new com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest(null);
            this.zza = setQuickAccessWalletCardsRequest2;
            setQuickAccessWalletCardsRequest2.zzb(setQuickAccessWalletCardsRequest.zza());
            setQuickAccessWalletCardsRequest2.zzd(setQuickAccessWalletCardsRequest.zzc());
            setQuickAccessWalletCardsRequest2.zzf(setQuickAccessWalletCardsRequest.zze());
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest build() {
            return this.zza;
        }
    }

    SetQuickAccessWalletCardsRequest(int i, android.accounts.Account account, com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.zza = i;
        this.zzb = account;
        this.zzc = quickAccessWalletCardArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest)) {
            return false;
        }
        com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (com.google.android.gms.tapandpay.quickaccesswallet.SetQuickAccessWalletCardsRequest) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(setQuickAccessWalletCardsRequest.zza)) && com.google.android.gms.common.internal.Objects.equal(this.zzb, setQuickAccessWalletCardsRequest.zzb) && java.util.Arrays.equals(this.zzc, setQuickAccessWalletCardsRequest.zzc);
    }

    public final int hashCode() {
        int i = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), this.zzb, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getSource());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 3, getCards(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ SetQuickAccessWalletCardsRequest(byte[] bArr) {
    }

    final /* synthetic */ void zzf(com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.zzc = quickAccessWalletCardArr;
    }

    final /* synthetic */ com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[] zze() {
        return this.zzc;
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

    public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[] getCards() {
        return this.zzc;
    }

    public final android.accounts.Account getAccount() {
        return this.zzb;
    }

    private SetQuickAccessWalletCardsRequest() {
        throw null;
    }
}
