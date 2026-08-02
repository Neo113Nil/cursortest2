package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
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
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzi(int i7, String str) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zza.writeString(str);
        zzda(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzj(int i7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzeVar);
        zzda(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzl(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(21, zza);
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
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzda(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzr(zzbgd zzbgdVar, String str) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbgdVar);
        zza.writeString(str);
        zzda(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzs(zzbvm zzbvmVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbou
    public final void zzt(zzbvq zzbvqVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbvqVar);
        zzda(16, zza);
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
