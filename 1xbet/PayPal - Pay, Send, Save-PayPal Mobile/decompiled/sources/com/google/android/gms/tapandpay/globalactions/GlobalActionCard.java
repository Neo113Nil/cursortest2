package com.google.android.gms.tapandpay.globalactions;

/* loaded from: classes8.dex */
public final class GlobalActionCard extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.globalactions.GlobalActionCard> CREATOR = new com.google.android.gms.tapandpay.globalactions.zzc();
    private int zza;
    private java.lang.String zzb;
    private android.graphics.Bitmap zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private android.graphics.Bitmap zzg;
    private android.app.PendingIntent zzh;

    public static final class Builder {
        private final com.google.android.gms.tapandpay.globalactions.GlobalActionCard zza;

        public Builder() {
            this.zza = new com.google.android.gms.tapandpay.globalactions.GlobalActionCard(null);
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard.Builder setCardId(java.lang.String str) {
            this.zza.zzd(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard.Builder setCardImage(android.graphics.Bitmap bitmap) {
            this.zza.zzf(bitmap);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard.Builder setCardType(int i) {
            this.zza.zzb(i);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard.Builder setContentDescription(java.lang.String str) {
            this.zza.zzh(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard.Builder setDeviceLockedMessageText(java.lang.String str) {
            this.zza.zzl(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard.Builder setMessageIcon(android.graphics.Bitmap bitmap) {
            this.zza.zzn(bitmap);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard.Builder setMessageText(java.lang.String str) {
            this.zza.zzj(str);
            return this;
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard.Builder setPendingIntent(android.app.PendingIntent pendingIntent) {
            this.zza.zzp(pendingIntent);
            return this;
        }

        public Builder(com.google.android.gms.tapandpay.globalactions.GlobalActionCard globalActionCard) {
            com.google.android.gms.tapandpay.globalactions.GlobalActionCard globalActionCard2 = new com.google.android.gms.tapandpay.globalactions.GlobalActionCard(null);
            this.zza = globalActionCard2;
            globalActionCard2.zzb(globalActionCard.zza());
            globalActionCard2.zzd(globalActionCard.zzc());
            globalActionCard2.zzf(globalActionCard.zze());
            globalActionCard2.zzh(globalActionCard.zzg());
            globalActionCard2.zzj(globalActionCard.zzi());
            globalActionCard2.zzl(globalActionCard.zzk());
            globalActionCard2.zzn(globalActionCard.zzm());
            globalActionCard2.zzp(globalActionCard.zzo());
        }

        public final com.google.android.gms.tapandpay.globalactions.GlobalActionCard build() {
            return this.zza;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CardType {
        public static final int CAR_KEY = 8;
        public static final int CTA = 3;
        public static final int GLOBAL_ACTIONS_DISMISSED = 4;
        public static final int PASS = 1;
        public static final int PAYMENT = 2;
        public static final int STUDENT_ID = 6;
        public static final int TILE = 9;
        public static final int TRANSIT = 7;
        public static final int UNKNOWN = 0;
        public static final int VALUABLE = 5;
    }

    GlobalActionCard(int i, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.graphics.Bitmap bitmap2, android.app.PendingIntent pendingIntent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = bitmap;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = bitmap2;
        this.zzh = pendingIntent;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.globalactions.GlobalActionCard)) {
            return false;
        }
        com.google.android.gms.tapandpay.globalactions.GlobalActionCard globalActionCard = (com.google.android.gms.tapandpay.globalactions.GlobalActionCard) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(globalActionCard.zza)) && com.google.android.gms.common.internal.Objects.equal(this.zzb, globalActionCard.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, globalActionCard.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, globalActionCard.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, globalActionCard.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, globalActionCard.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, globalActionCard.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, globalActionCard.zzh);
    }

    public final int hashCode() {
        int i = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getCardType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getCardId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getCardImage(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getContentDescription(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getMessageText(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getMessageIcon(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, getPendingIntent(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getDeviceLockedMessageText(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ GlobalActionCard(byte[] bArr) {
    }

    final /* synthetic */ void zzp(android.app.PendingIntent pendingIntent) {
        this.zzh = pendingIntent;
    }

    final /* synthetic */ android.app.PendingIntent zzo() {
        return this.zzh;
    }

    final /* synthetic */ void zzn(android.graphics.Bitmap bitmap) {
        this.zzg = bitmap;
    }

    final /* synthetic */ android.graphics.Bitmap zzm() {
        return this.zzg;
    }

    final /* synthetic */ void zzl(java.lang.String str) {
        this.zzf = str;
    }

    final /* synthetic */ java.lang.String zzk() {
        return this.zzf;
    }

    final /* synthetic */ void zzj(java.lang.String str) {
        this.zze = str;
    }

    final /* synthetic */ java.lang.String zzi() {
        return this.zze;
    }

    final /* synthetic */ void zzh(java.lang.String str) {
        this.zzd = str;
    }

    final /* synthetic */ java.lang.String zzg() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(android.graphics.Bitmap bitmap) {
        this.zzc = bitmap;
    }

    final /* synthetic */ android.graphics.Bitmap zze() {
        return this.zzc;
    }

    final /* synthetic */ void zzd(java.lang.String str) {
        this.zzb = str;
    }

    final /* synthetic */ java.lang.String zzc() {
        return this.zzb;
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ int zza() {
        return this.zza;
    }

    public final android.app.PendingIntent getPendingIntent() {
        return this.zzh;
    }

    public final java.lang.String getMessageText() {
        return this.zze;
    }

    public final android.graphics.Bitmap getMessageIcon() {
        return this.zzg;
    }

    public final java.lang.String getDeviceLockedMessageText() {
        return this.zzf;
    }

    public final java.lang.String getContentDescription() {
        return this.zzd;
    }

    public final int getCardType() {
        return this.zza;
    }

    public final android.graphics.Bitmap getCardImage() {
        return this.zzc;
    }

    public final java.lang.String getCardId() {
        return this.zzb;
    }

    private GlobalActionCard() {
        throw null;
    }
}
