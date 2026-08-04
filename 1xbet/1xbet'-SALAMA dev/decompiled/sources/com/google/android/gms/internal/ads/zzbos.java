package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbos extends zzaxn implements zzbou {
    public zzbos(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzg(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzeVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzi(int i7, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        parcelZza.writeString(str);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzj(int i7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzeVar);
        zzda(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzl(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzm() {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzn() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzo() {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzp() {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzq(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzr(zzbgd zzbgdVar, String str) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbgdVar);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzs(zzbvm zzbvmVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzt(zzbvq zzbvqVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbvqVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzu() {
        zzda(25, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzv() {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzw() {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzx() {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzy() {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzz() {
        zzda(13, zza());
    }
}
