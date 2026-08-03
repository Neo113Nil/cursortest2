package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzah extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzah> CREATOR = new com.google.android.gms.measurement.internal.zzai();
    public java.lang.String zza;
    public java.lang.String zzb;
    public com.google.android.gms.measurement.internal.zzpk zzc;
    public long zzd;
    public boolean zze;
    public java.lang.String zzf;
    public final com.google.android.gms.measurement.internal.zzbg zzg;
    public long zzh;
    public com.google.android.gms.measurement.internal.zzbg zzi;
    public final long zzj;
    public final com.google.android.gms.measurement.internal.zzbg zzk;

    zzah(com.google.android.gms.measurement.internal.zzah zzahVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzahVar);
        this.zza = zzahVar.zza;
        this.zzb = zzahVar.zzb;
        this.zzc = zzahVar.zzc;
        this.zzd = zzahVar.zzd;
        this.zze = zzahVar.zze;
        this.zzf = zzahVar.zzf;
        this.zzg = zzahVar.zzg;
        this.zzh = zzahVar.zzh;
        this.zzi = zzahVar.zzi;
        this.zzj = zzahVar.zzj;
        this.zzk = zzahVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzah(java.lang.String str, java.lang.String str2, com.google.android.gms.measurement.internal.zzpk zzpkVar, long j, boolean z, java.lang.String str3, com.google.android.gms.measurement.internal.zzbg zzbgVar, long j2, com.google.android.gms.measurement.internal.zzbg zzbgVar2, long j3, com.google.android.gms.measurement.internal.zzbg zzbgVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpkVar;
        this.zzd = j;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbgVar;
        this.zzh = j2;
        this.zzi = zzbgVar2;
        this.zzj = j3;
        this.zzk = zzbgVar3;
    }
}
