package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class QuickAccessWalletCard extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard> CREATOR = new com.google.android.gms.tapandpay.quickaccesswallet.zzc();
    private java.lang.String zza;
    private android.graphics.Bitmap zzb;
    private java.lang.String zzc;
    private com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[] zzd;
    private com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage[] zze;
    private long zzf;
    private long zzg;
    private java.lang.String zzh;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard(null);
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard.Builder setAvailableBalance(java.lang.String str) {
            this.zza.zzp(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard.Builder setAvailableTimestamp(long j) {
            this.zza.zzl(j);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard.Builder setCardId(java.lang.String str) {
            this.zza.zzb(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard.Builder setCardImage(android.graphics.Bitmap bitmap) {
            this.zza.zzd(bitmap);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard.Builder setContentDescription(java.lang.String str) {
            this.zza.zzf(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard.Builder setExpirationTimestamp(long j) {
            this.zza.zzn(j);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard.Builder setIconMessages(com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage[] cardIconMessageArr) {
            this.zza.zzj(cardIconMessageArr);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard.Builder setIntents(com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[] walletCardIntentArr) {
            this.zza.zzh(walletCardIntentArr);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard quickAccessWalletCard) {
            com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard quickAccessWalletCard2 = new com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard(null);
            this.zza = quickAccessWalletCard2;
            quickAccessWalletCard2.zzb(quickAccessWalletCard.zza());
            quickAccessWalletCard2.zzd(quickAccessWalletCard.zzc());
            quickAccessWalletCard2.zzf(quickAccessWalletCard.zze());
            quickAccessWalletCard2.zzh(quickAccessWalletCard.zzg());
            quickAccessWalletCard2.zzj(quickAccessWalletCard.zzi());
            quickAccessWalletCard2.zzl(quickAccessWalletCard.zzk());
            quickAccessWalletCard2.zzn(quickAccessWalletCard.zzm());
            quickAccessWalletCard2.zzp(quickAccessWalletCard.zzo());
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard build() {
            return this.zza;
        }
    }

    QuickAccessWalletCard(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2, com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[] walletCardIntentArr, com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage[] cardIconMessageArr, long j, long j2, java.lang.String str3) {
        this.zza = str;
        this.zzb = bitmap;
        this.zzc = str2;
        this.zzd = walletCardIntentArr;
        this.zze = cardIconMessageArr;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard)) {
            return false;
        }
        com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard quickAccessWalletCard = (com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, quickAccessWalletCard.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, quickAccessWalletCard.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, quickAccessWalletCard.zzc) && java.util.Arrays.equals(this.zzd, quickAccessWalletCard.zzd) && java.util.Arrays.equals(this.zze, quickAccessWalletCard.zze) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzf), java.lang.Long.valueOf(quickAccessWalletCard.zzf)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzg), java.lang.Long.valueOf(quickAccessWalletCard.zzg)) && com.google.android.gms.common.internal.Objects.equal(this.zzh, quickAccessWalletCard.zzh);
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        android.graphics.Bitmap bitmap = this.zzb;
        java.lang.String str2 = this.zzc;
        int hashCode = java.util.Arrays.hashCode(this.zzd);
        int hashCode2 = java.util.Arrays.hashCode(this.zze);
        long j = this.zzf;
        long j2 = this.zzg;
        return com.google.android.gms.common.internal.Objects.hashCode(str, bitmap, str2, java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(hashCode2), java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2), this.zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getCardId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getCardImage(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getContentDescription(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 4, getIntents(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, getIconMessages(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, getAvailableTimestamp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, getExpirationTimestamp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getAvailableBalance(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ QuickAccessWalletCard(byte[] bArr) {
    }

    final /* synthetic */ void zzp(java.lang.String str) {
        this.zzh = str;
    }

    final /* synthetic */ java.lang.String zzo() {
        return this.zzh;
    }

    final /* synthetic */ void zzn(long j) {
        this.zzg = j;
    }

    final /* synthetic */ long zzm() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(long j) {
        this.zzf = j;
    }

    final /* synthetic */ long zzk() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage[] cardIconMessageArr) {
        this.zze = cardIconMessageArr;
    }

    final /* synthetic */ com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage[] zzi() {
        return this.zze;
    }

    final /* synthetic */ void zzh(com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[] walletCardIntentArr) {
        this.zzd = walletCardIntentArr;
    }

    final /* synthetic */ com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[] zzg() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(java.lang.String str) {
        this.zzc = str;
    }

    final /* synthetic */ java.lang.String zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzd(android.graphics.Bitmap bitmap) {
        this.zzb = bitmap;
    }

    final /* synthetic */ android.graphics.Bitmap zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        this.zza = str;
    }

    final /* synthetic */ java.lang.String zza() {
        return this.zza;
    }

    public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[] getIntents() {
        return this.zzd;
    }

    public final com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage[] getIconMessages() {
        return this.zze;
    }

    public final long getExpirationTimestamp() {
        return this.zzg;
    }

    public final java.lang.String getContentDescription() {
        return this.zzc;
    }

    public final android.graphics.Bitmap getCardImage() {
        return this.zzb;
    }

    public final java.lang.String getCardId() {
        return this.zza;
    }

    public final long getAvailableTimestamp() {
        return this.zzf;
    }

    public final java.lang.String getAvailableBalance() {
        return this.zzh;
    }

    private QuickAccessWalletCard() {
        throw null;
    }
}
