package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzau extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzau> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzav();
    final java.lang.String zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final java.lang.String zzd;
    final java.lang.String zze;
    final java.lang.String zzf;
    final java.lang.String zzg;
    final java.lang.String zzh;
    final java.lang.String zzi;
    final java.lang.String zzj;
    final java.lang.String zzk;
    final java.lang.String zzl;
    final java.lang.String zzm;
    final long zzn;
    final java.lang.String zzo;
    final java.lang.String zzp;
    final java.lang.String zzq;
    final java.lang.String zzr;
    final java.lang.String zzs;
    final java.lang.String zzt;
    final java.lang.String zzu;
    final int zzv;

    zzau(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, long j, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = j;
        this.zzo = str14;
        this.zzp = str15;
        this.zzq = str16;
        this.zzr = str17;
        this.zzs = str18;
        this.zzt = str19;
        this.zzu = str20;
        this.zzv = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzau)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzau zzauVar = (com.google.android.gms.tapandpay.firstparty.zzau) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzauVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzauVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzauVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzauVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzauVar.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzauVar.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, zzauVar.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, zzauVar.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, zzauVar.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, zzauVar.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzk, zzauVar.zzk) && com.google.android.gms.common.internal.Objects.equal(this.zzl, zzauVar.zzl) && com.google.android.gms.common.internal.Objects.equal(this.zzm, zzauVar.zzm) && this.zzn == zzauVar.zzn && com.google.android.gms.common.internal.Objects.equal(this.zzo, zzauVar.zzo) && com.google.android.gms.common.internal.Objects.equal(this.zzp, zzauVar.zzp) && com.google.android.gms.common.internal.Objects.equal(this.zzq, zzauVar.zzq) && com.google.android.gms.common.internal.Objects.equal(this.zzr, zzauVar.zzr) && com.google.android.gms.common.internal.Objects.equal(this.zzs, zzauVar.zzs) && com.google.android.gms.common.internal.Objects.equal(this.zzt, zzauVar.zzt) && com.google.android.gms.common.internal.Objects.equal(this.zzu, zzauVar.zzu) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzv), java.lang.Integer.valueOf(zzauVar.zzv));
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        java.lang.String str3 = this.zzc;
        java.lang.String str4 = this.zzd;
        java.lang.String str5 = this.zze;
        java.lang.String str6 = this.zzf;
        java.lang.String str7 = this.zzg;
        java.lang.String str8 = this.zzh;
        java.lang.String str9 = this.zzi;
        java.lang.String str10 = this.zzj;
        java.lang.String str11 = this.zzk;
        java.lang.String str12 = this.zzl;
        java.lang.String str13 = this.zzm;
        long j = this.zzn;
        return com.google.android.gms.common.internal.Objects.hashCode(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, java.lang.Long.valueOf(j), this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, java.lang.Integer.valueOf(this.zzv));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("issuerName", this.zza).add("issuerPhoneNumber", this.zzb).add("appLogoUrl", this.zzc).add("appName", this.zzd).add("appDeveloperName", this.zze).add("appPackageName", this.zzf).add("privacyNoticeUrl", this.zzg).add("termsAndConditionsUrl", this.zzh).add("productShortName", this.zzi).add("appAction", this.zzj).add("appIntentExtraMessage", this.zzk).add("issuerMessageHeadline", this.zzl).add("issuerMessageBody", this.zzm).add("issuerMessageExpiryTimestampMillis", java.lang.Long.valueOf(this.zzn)).add("issuerMessageLinkPackageName", this.zzo).add("issuerMessageLinkAction", this.zzp).add("issuerMessageLinkExtraText", this.zzq).add("issuerMessageLinkUrl", this.zzr).add("issuerMessageLinkText", this.zzs).add("issuerWebLinkUrl", this.zzt).add("issuerWebLinkText", this.zzu).add("issuerMessageType", java.lang.Integer.valueOf(this.zzv)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 15, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 17, this.zzp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 18, this.zzq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 21, this.zzs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 22, this.zzt, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 23, this.zzu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 24, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
