package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class CardIconMessage extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage> CREATOR = new com.google.android.gms.tapandpay.quickaccesswallet.zza();
    private int[] zza;
    private int zzb;
    private java.lang.String zzc;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage(null);
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage.Builder setConditions(int[] iArr) {
            this.zza.zzb(iArr);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage.Builder setIcon(int i) {
            this.zza.zzd(i);
            return this;
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage.Builder setMessage(java.lang.String str) {
            this.zza.zzf(str);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage cardIconMessage) {
            com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage cardIconMessage2 = new com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage(null);
            this.zza = cardIconMessage2;
            cardIconMessage2.zzb(cardIconMessage.zza());
            cardIconMessage2.zzd(cardIconMessage.zzc());
            cardIconMessage2.zzf(cardIconMessage.zze());
        }

        public final com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage build() {
            return this.zza;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Condition {
        public static final int NFC_OFF = 3;
        public static final int NFC_ON = 2;
        public static final int PHONE_LOCKED = 4;
        public static final int TRUE = 1;
        public static final int UNKNOWN_CONDITION = 0;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Icon {
        public static final int LOCK = 4;
        public static final int NFC = 2;
        public static final int NFC_DISABLED = 3;
        public static final int NONE = 1;
        public static final int UNKNOWN_ICON = 0;
    }

    /* synthetic */ CardIconMessage(byte[] bArr) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage)) {
            return false;
        }
        com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage cardIconMessage = (com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage) obj;
        return java.util.Arrays.equals(this.zza, cardIconMessage.zza) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(cardIconMessage.zzb)) && com.google.android.gms.common.internal.Objects.equal(this.zzc, cardIconMessage.zzc);
    }

    public final int hashCode() {
        int hashCode = java.util.Arrays.hashCode(this.zza);
        int i = this.zzb;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(i), this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(parcel, 1, getConditions(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getIcon());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getMessage(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    CardIconMessage(int[] iArr, int i, java.lang.String str) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = str;
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

    final /* synthetic */ void zzb(int[] iArr) {
        this.zza = iArr;
    }

    final /* synthetic */ int[] zza() {
        return this.zza;
    }

    public final java.lang.String getMessage() {
        return this.zzc;
    }

    public final int getIcon() {
        return this.zzb;
    }

    public final int[] getConditions() {
        return this.zza;
    }

    private CardIconMessage() {
        throw null;
    }
}
