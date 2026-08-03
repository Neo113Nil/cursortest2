package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzr> CREATOR = new com.google.android.gms.measurement.internal.zzs();
    public final long zzA;
    public final java.lang.String zzB;
    public final java.lang.String zzC;
    public final long zzD;
    public final int zzE;
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final long zze;
    public final long zzf;
    public final java.lang.String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final java.lang.String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final java.lang.Boolean zzp;
    public final long zzq;
    public final java.util.List zzr;
    public final java.lang.String zzs;
    public final java.lang.String zzt;
    public final java.lang.String zzu;
    public final boolean zzv;
    public final long zzw;
    public final int zzx;
    public final java.lang.String zzy;
    public final int zzz;

    zzr(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, long j2, long j3, java.lang.String str5, boolean z, boolean z2, java.lang.String str6, long j4, int i, boolean z3, boolean z4, java.lang.Boolean bool, long j5, java.util.List list, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z5, long j6, int i2, java.lang.String str10, int i3, long j7, java.lang.String str11, java.lang.String str12, long j8, int i4) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = true == android.text.TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 15, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 16, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 22, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 23, this.zzr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 26, this.zzt, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 27, this.zzu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 28, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 29, this.zzw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 30, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 31, this.zzy, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 32, this.zzz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 34, this.zzA);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 35, this.zzB, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 36, this.zzC, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 37, this.zzD);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 38, this.zzE);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzr(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, java.lang.String str5, boolean z, boolean z2, long j3, java.lang.String str6, long j4, int i, boolean z3, boolean z4, java.lang.Boolean bool, long j5, java.util.List list, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z5, long j6, int i2, java.lang.String str10, int i3, long j7, java.lang.String str11, java.lang.String str12, long j8, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j5;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j6;
        this.zzx = i2;
        this.zzy = str10;
        this.zzz = i3;
        this.zzA = j7;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j8;
        this.zzE = i4;
    }
}
