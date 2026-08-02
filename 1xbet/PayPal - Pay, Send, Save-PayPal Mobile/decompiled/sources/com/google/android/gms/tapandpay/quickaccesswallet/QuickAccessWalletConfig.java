package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class QuickAccessWalletConfig extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig> CREATOR = new com.google.android.gms.tapandpay.quickaccesswallet.zzd();
    private int zza;
    private int zzb;
    private int zzc;
    private java.lang.String[] zzd;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig(null);
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig.Builder setCardHeightPx(int i) {
            this.zza.zzd(i);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig.Builder setCardWidthPx(int i) {
            this.zza.zzb(i);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig.Builder setCurrentWalletCardIds(java.lang.String[] strArr) {
            this.zza.zzh(strArr);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig.Builder setMaxCards(int i) {
            this.zza.zzf(i);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig quickAccessWalletConfig) {
            com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig quickAccessWalletConfig2 = new com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig(null);
            this.zza = quickAccessWalletConfig2;
            quickAccessWalletConfig2.zzb(quickAccessWalletConfig.zza());
            quickAccessWalletConfig2.zzd(quickAccessWalletConfig.zzc());
            quickAccessWalletConfig2.zzf(quickAccessWalletConfig.zze());
            quickAccessWalletConfig2.zzh(quickAccessWalletConfig.zzg());
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig build() {
            return this.zza;
        }
    }

    QuickAccessWalletConfig(int i, int i2, int i3, java.lang.String[] strArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = strArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig)) {
            return false;
        }
        com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig quickAccessWalletConfig = (com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(quickAccessWalletConfig.zza)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(quickAccessWalletConfig.zzb)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(quickAccessWalletConfig.zzc)) && java.util.Arrays.equals(this.zzd, quickAccessWalletConfig.zzd);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzd)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getCardWidthPx());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getCardHeightPx());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, getMaxCards());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 5, getCurrentWalletCardIds(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ QuickAccessWalletConfig(byte[] bArr) {
    }

    final /* synthetic */ void zzh(java.lang.String[] strArr) {
        this.zzd = strArr;
    }

    final /* synthetic */ java.lang.String[] zzg() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzc = i;
    }

    final /* synthetic */ int zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzb = i;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    public final int getMaxCards() {
        return this.zzc;
    }

    public final java.lang.String[] getCurrentWalletCardIds() {
        return this.zzd;
    }

    public final int getCardWidthPx() {
        return this.zza;
    }

    public final int getCardHeightPx() {
        return this.zzb;
    }

    private QuickAccessWalletConfig() {
        throw null;
    }
}
