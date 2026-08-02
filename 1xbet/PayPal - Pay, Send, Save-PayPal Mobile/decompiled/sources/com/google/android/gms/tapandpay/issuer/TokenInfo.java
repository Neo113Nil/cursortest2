package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class TokenInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.TokenInfo> CREATOR = new com.google.android.gms.tapandpay.issuer.zzw();
    final java.lang.String zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final java.lang.String zzd;
    final int zze;
    final int zzf;
    final int zzg;
    final boolean zzh;
    final java.lang.String zzi;
    final java.lang.String zzj;
    final java.lang.Integer zzk;
    final java.lang.Integer zzl;

    TokenInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, int i3, boolean z, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.Integer num2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = z;
        this.zzi = str5;
        this.zzj = str6;
        this.zzk = num;
        this.zzl = num2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 11, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(parcel, 12, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int getTokenState() {
        return this.zzg;
    }

    public final int getTokenServiceProvider() {
        return this.zze;
    }

    public final java.lang.String getPortfolioName() {
        return this.zzi;
    }

    public final int getNetwork() {
        return this.zzf;
    }

    public final java.lang.String getIssuerTokenId() {
        return this.zza;
    }

    public final java.lang.String getIssuerName() {
        return this.zzb;
    }

    public final boolean getIsDefaultToken() {
        return this.zzh;
    }

    public final java.lang.String getFpanLastFour() {
        return this.zzc;
    }

    public final java.lang.String getDpanLastFour() {
        return this.zzd;
    }
}
