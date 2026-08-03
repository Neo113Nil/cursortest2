package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zze extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zze> CREATOR = new com.google.android.gms.ads.internal.client.zzf();
    public final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public com.google.android.gms.ads.internal.client.zze zzd;
    public android.os.IBinder zze;

    public zze(int i, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zze zzeVar, android.os.IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.ads.AdError zza() {
        com.google.android.gms.ads.AdError adError;
        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzd;
        if (zzeVar == null) {
            adError = null;
        } else {
            java.lang.String str = zzeVar.zzc;
            adError = new com.google.android.gms.ads.AdError(zzeVar.zza, zzeVar.zzb, str);
        }
        return new com.google.android.gms.ads.AdError(this.zza, this.zzb, this.zzc, adError);
    }

    public final com.google.android.gms.ads.LoadAdError zzb() {
        com.google.android.gms.ads.AdError adError;
        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzd;
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new com.google.android.gms.ads.AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i = this.zza;
        java.lang.String str = this.zzb;
        java.lang.String str2 = this.zzc;
        android.os.IBinder iBinder = this.zze;
        if (iBinder != null) {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdxVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdx ? (com.google.android.gms.ads.internal.client.zzdx) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzdv(iBinder);
        }
        return new com.google.android.gms.ads.LoadAdError(i, str, str2, adError, com.google.android.gms.ads.ResponseInfo.zzb(zzdxVar));
    }
}
