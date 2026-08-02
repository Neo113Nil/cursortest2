package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class WalletCardIntentExtra extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra> CREATOR = new com.google.android.gms.tapandpay.quickaccesswallet.zzg();
    private java.lang.String zza;
    private int zzb;
    private java.lang.String zzc;
    private byte[] zzd;
    private boolean zze;
    private int zzf;
    private long zzg;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra(null);
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra.Builder setKey(java.lang.String str) {
            this.zza.zzb(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra.Builder setValueBoolean(boolean z) {
            this.zza.zzj(z);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra.Builder setValueBytes(byte[] bArr) {
            this.zza.zzh(bArr);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra.Builder setValueInt(int i) {
            this.zza.zzl(i);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra.Builder setValueLong(long j) {
            this.zza.zzn(j);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra.Builder setValueString(java.lang.String str) {
            this.zza.zzf(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra.Builder setValueType(int i) {
            this.zza.zzd(i);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra walletCardIntentExtra) {
            com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra walletCardIntentExtra2 = new com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra(null);
            this.zza = walletCardIntentExtra2;
            walletCardIntentExtra2.zzb(walletCardIntentExtra.zza());
            walletCardIntentExtra2.zzd(walletCardIntentExtra.zzc());
            walletCardIntentExtra2.zzf(walletCardIntentExtra.zze());
            walletCardIntentExtra2.zzh(walletCardIntentExtra.zzg());
            walletCardIntentExtra2.zzj(walletCardIntentExtra.zzi());
            walletCardIntentExtra2.zzl(walletCardIntentExtra.zzk());
            walletCardIntentExtra2.zzn(walletCardIntentExtra.zzm());
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra build() {
            return this.zza;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ValueType {
        public static final int BOOLEAN = 3;
        public static final int BYTES = 2;
        public static final int INT = 4;
        public static final int LONG = 5;
        public static final int STRING = 1;
        public static final int VALUE_TYPE_UNKNOWN = 0;
    }

    WalletCardIntentExtra(java.lang.String str, int i, java.lang.String str2, byte[] bArr, boolean z, int i2, long j) {
        this.zza = str;
        this.zzb = i;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = z;
        this.zzf = i2;
        this.zzg = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra)) {
            return false;
        }
        com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra walletCardIntentExtra = (com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, walletCardIntentExtra.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(walletCardIntentExtra.zzb)) && com.google.android.gms.common.internal.Objects.equal(this.zzc, walletCardIntentExtra.zzc) && java.util.Arrays.equals(this.zzd, walletCardIntentExtra.zzd) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(walletCardIntentExtra.zze)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzf), java.lang.Integer.valueOf(walletCardIntentExtra.zzf)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzg), java.lang.Long.valueOf(walletCardIntentExtra.zzg));
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int i = this.zzb;
        return com.google.android.gms.common.internal.Objects.hashCode(str, java.lang.Integer.valueOf(i), this.zzc, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.zzd)), java.lang.Boolean.valueOf(this.zze), java.lang.Integer.valueOf(this.zzf), java.lang.Long.valueOf(this.zzg));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getKey(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getValueType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getValueString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getValueBytes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, getValueBoolean());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, getValueInt());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, getValueLong());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ WalletCardIntentExtra(byte[] bArr) {
    }

    final /* synthetic */ void zzn(long j) {
        this.zzg = j;
    }

    final /* synthetic */ long zzm() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzf = i;
    }

    final /* synthetic */ int zzk() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(boolean z) {
        this.zze = z;
    }

    final /* synthetic */ boolean zzi() {
        return this.zze;
    }

    final /* synthetic */ void zzh(byte[] bArr) {
        this.zzd = bArr;
    }

    final /* synthetic */ byte[] zzg() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(java.lang.String str) {
        this.zzc = str;
    }

    final /* synthetic */ java.lang.String zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzd(int i) {
        this.zzb = i;
    }

    final /* synthetic */ int zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzb(java.lang.String str) {
        this.zza = str;
    }

    final /* synthetic */ java.lang.String zza() {
        return this.zza;
    }

    public final int getValueType() {
        return this.zzb;
    }

    public final java.lang.String getValueString() {
        return this.zzc;
    }

    public final long getValueLong() {
        return this.zzg;
    }

    public final int getValueInt() {
        return this.zzf;
    }

    public final byte[] getValueBytes() {
        return this.zzd;
    }

    public final boolean getValueBoolean() {
        return this.zze;
    }

    public final java.lang.String getKey() {
        return this.zza;
    }

    private WalletCardIntentExtra() {
        throw null;
    }
}
